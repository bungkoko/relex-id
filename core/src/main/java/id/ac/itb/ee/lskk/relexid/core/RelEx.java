package id.ac.itb.ee.lskk.relexid.core;

import id.ac.itb.ee.lskk.relexid.core.impl.PronounPartImpl;
import id.ac.itb.ee.lskk.relexid.core.impl.PunctuationPartImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import javax.annotation.Nullable;
import javax.xml.namespace.QName;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.commons.OnDemandXmiLoader;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Strings;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterators;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Range;
import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.query.ParameterizedSparqlString;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.tdb.TDBFactory;

public class RelEx implements Translator, LabelProvider {
	
	private static final Logger log = LoggerFactory.getLogger(RelEx.class);
	@Deprecated
	private static final String SPARQL_PREFIXES =
					"PREFIX rdf:					<http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"
					+ "PREFIX rdfs:				<http://www.w3.org/2000/01/rdf-schema#>\n"
					+ "PREFIX owl:					<http://www.w3.org/2002/07/owl#>\n"
					+ "PREFIX lemon:				<http://lemon-model.net/lemon#>\n"
					+ "PREFIX wn31:				<http://wordnet-rdf.princeton.edu/wn31/>\n"
					+ "PREFIX wordnet-ontology:	<http://wordnet-rdf.princeton.edu/ontology#>\n"
					+ "PREFIX wn20:				<http://www.w3.org/2006/03/wn/wn20/instances/>\n"
					+ "PREFIX uby:					<http://lemon-model.net/lexica/uby/wn/>\n";
	public static final Locale INDONESIAN = Locale.forLanguageTag("id-ID");
	public static final String DBPEDIA_NS = "http://dbpedia.org/resource/";
	public static final String RDF_NS = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
	public static final String RDFS_NS = "http://www.w3.org/2000/01/rdf-schema#";
	public static final String OWL_NS = "http://www.w3.org/2002/07/owl#";
	public static final String LEMON_NS = "http://lemon-model.net/lemon#";
	public static final String DBPEDIA_OWL_NS = "http://dbpedia.org/ontology/";
	public static final String SCHEMA_NS = "http://schema.org";
	public static final String WORDNET_ONTOLOGY_NS = "http://wordnet-rdf.princeton.edu/ontology#";
	public static final String WN20_NS = "http://www.w3.org/2006/03/wn/wn20/instances/";
	public static final String WN31_NS = "http://wordnet-rdf.princeton.edu/wn31/";
	public static final String UBY_NS = "http://lemon-model.net/lexica/uby/wn/";
	
	private LexRules lexRules;
	private RelationRules relationRules;
	private ImmutableMap<String, String> dictionary;

	private final Tokenizer tokenizer;

	private final Model model;
	/**
	 * Mapping from {@code ind} translations to WordNet senses for verb part-of-speech.
	 * The value is String to save memory, it is short QName, where nsPrefix needs
	 * to be explictly supported, e.g. {@code wn31} for nvarps.
	 * @todo These aren't sorted/prioritized in any way.
	 */
	private ListMultimap<String, String> verbSenses;
	/**
	 * Mapping from {@code ind} translations to WordNet senses for noun part-of-speech.
	 * The value is String to save memory, it is short QName, where nsPrefix needs
	 * to be explictly supported, e.g. {@code wn31} for nvarps.
	 * @todo These aren't sorted/prioritized in any way.
	 */
	private ListMultimap<String, String> nounSenses;
	private final Dataset wn31tdb;
	
	public static class Tokenizer {
		enum CharType {
			NONE,
			WORD,
			WHITESPACE,
			PUNCTUATION_FULL_STOP,
			PUNCTUATION_COMMA,
			PUNCTUATION_QUESTION,
			PUNCTUATION_EXCLAMATION
		};
		
		public List<String> tokenize(String input) {
			final ArrayList<String> tokens = new ArrayList<>();
			String cur = "";
			CharType curType = CharType.NONE;
			for (int i = 0; i < input.length(); i++) {
				char ch = input.charAt(i);
				final CharType nextType;
				if (ch == ' ') {
					nextType = CharType.WHITESPACE;
				} else if (ch == '.') {
					nextType = CharType.PUNCTUATION_FULL_STOP;
				} else if (ch == ',') {
					nextType = CharType.PUNCTUATION_COMMA;
				} else if (ch == '?') {
					nextType = CharType.PUNCTUATION_QUESTION;
				} else if (ch == '!') {
					nextType = CharType.PUNCTUATION_EXCLAMATION;
				} else {
					nextType = CharType.WORD;
				}
				// same or next?
				if (nextType == curType) {
					cur += ch;
				} else {
					if (!cur.isEmpty()) {
						tokens.add(cur);
					}
					cur = Character.toString(ch);
					curType = nextType;
				}
			}
			// same or next?
			if (!cur.isEmpty()) {
				tokens.add(cur);
			}
			return tokens;
		}
	}
	
	public RelEx() {
		tokenizer = new Tokenizer();
		model = ModelFactory.createDefaultModel();
		model.setNsPrefix("rdfs", RDFS_NS);
		model.setNsPrefix("rdf", RDF_NS);
		model.setNsPrefix("owl", OWL_NS);
		model.setNsPrefix("dbpedia", DBPEDIA_NS);
		model.setNsPrefix("dbpedia-owl", DBPEDIA_OWL_NS);
		model.setNsPrefix("schema", SCHEMA_NS);
		model.setNsPrefix("wordnet-ontology", WORDNET_ONTOLOGY_NS);
		model.setNsPrefix("wn31", WN31_NS);
		
		final String wn31loc = System.getProperty("user.home") + "/wn31_tdb";
		log.info("Initializing WordNet 3.1 TDB database at {}", wn31loc);
		wn31tdb = TDBFactory.createDataset(wn31loc);
	}

	public void loadLexRules(Class<?> clazz, String resourcePath) {
		log.debug("Loading LexRules from {} > {}", clazz, resourcePath);
		lexRules = new OnDemandXmiLoader<LexRules>(RelexidPackage.eINSTANCE, clazz, resourcePath).get();
	}
	
	public void loadRelationRules(Class<?> clazz, String resourcePath) {
		log.debug("Loading RelationRules from {} > {}", clazz, resourcePath);
		relationRules = new OnDemandXmiLoader<RelationRules>(RelexidPackage.eINSTANCE, clazz, resourcePath).get();
	}
	
	@Override
	public String getTranslation(Locale locale, QName ref) {
		String lang = locale.getISO3Language();
		ParameterizedSparqlString stmt;
		if (Locale.ENGLISH.getLanguage().equals(locale.getLanguage())) {
			stmt = new ParameterizedSparqlString("SELECT ?translation WHERE {\n"
					+ "?sense rdfs:label ?translation\n"
					+ "}", model);
		} else {
			stmt = new ParameterizedSparqlString("SELECT ?translation WHERE {\n" +
					"?sense wordnet-ontology:translation ?translation\n" +
					"FILTER ( lang(?translation) = ?lang )\n"
					+ "}", model);
			stmt.setLiteral("lang", lang);
		}
		stmt.setIri("sense", this.asRef(ref));
		final String sparql = stmt.toString();
		log.debug("getTranslation {} {} SPARQL: {}", locale, ref, sparql);
		Query verbTxQuery = QueryFactory.create(sparql);
		QueryExecution qexec = QueryExecutionFactory.create(verbTxQuery, wn31tdb);
		try {
			ResultSet rs = qexec.execSelect();
			for (; rs.hasNext(); ) {
				QuerySolution soln = rs.next();
				String translation = soln.get("translation").asLiteral().getString();
				return translation;
			}
			throw new IllegalArgumentException("Cannot find " + lang + " translation for sense " + ref);
		} finally {
			qexec.close();
		}
	}
	
	/* (non-Javadoc)
	 * @see id.ac.itb.ee.lskk.relexid.core.Labeler#getSenseLabel(javax.xml.namespace.QName)
	 */
	@Override
	public String getSenseLabel(QName ref) {
		ParameterizedSparqlString stmt = new ParameterizedSparqlString(
				"SELECT ?word WHERE {\n"
				+ "?sense wordnet-ontology:synset_member ?word\n"
				+ "}", model);
		stmt.setIri("sense", this.asRef(ref));
		final String sparql = stmt.toString();
		log.trace("getSenseLabel SPARQL: {}", sparql);
		Query verbTxQuery = QueryFactory.create(sparql);
		QueryExecution qexec = QueryExecutionFactory.create(verbTxQuery, wn31tdb);
		try {
			ResultSet rs = qexec.execSelect();
			for (; rs.hasNext(); ) {
				QuerySolution soln = rs.next();
				String wordLocalName = soln.get("word").asResource().getLocalName();
				return wordLocalName;
			}
			log.warn("No wordnet-ontology:synset_member for sense " + ref);
			return shortQName(ref);
		} finally {
			qexec.close();
		}
	}
	
	public String getSenseRdfsLabel(QName ref) {
		ParameterizedSparqlString stmt = new ParameterizedSparqlString(
				"SELECT ?label WHERE {\n"
				+ "?sense rdfs:label ?label\n"
				+ "}", model);
		stmt.setIri("sense", this.asRef(ref));
		final String sparql = stmt.toString();
		log.trace("getSenseLabel SPARQL: {}", sparql);
		Query verbTxQuery = QueryFactory.create(sparql);
		QueryExecution qexec = QueryExecutionFactory.create(verbTxQuery, wn31tdb);
		try {
			ResultSet rs = qexec.execSelect();
			for (; rs.hasNext(); ) {
				QuerySolution soln = rs.next();
				String translation = soln.get("label").asLiteral().getString();
				return translation;
			}
			log.warn("No rdfs:label for sense " + ref);
			return shortQName(ref);
		} finally {
			qexec.close();
		}
	}

	/**
	 * @deprecated We should not do this on every load, but we should put this
	 * 	into a precomputable (but live updateable) index. Probably in CouchDB
	 * 	or any <a href="https://jira.mongodb.org/browse/SERVER-153">function-based index</a> support (PostgreSQL has it, but it's not scalable).
	 */
	@Deprecated
	public void loadTranslations() {
		verbSenses = ArrayListMultimap.create();
		log.info("Loading verb translations...");
		final String sparql = SPARQL_PREFIXES
				+ "SELECT ?translation ?sense\n"
				+ "WHERE {\n"
				+ "	?sense wordnet-ontology:translation ?t ;"
				+ "		wordnet-ontology:part_of_speech wordnet-ontology:verb\n"
				+ "	BIND( lcase(?t) AS ?translation )\n"
				+ "	FILTER ( lang(?translation) = 'ind' )\n"
				+ "} LIMIT 50000";
		log.debug("loadTranslations SPARQL: {}", sparql);
		Query verbTxQuery = QueryFactory.create(sparql);
		QueryExecution qexec = QueryExecutionFactory.create(verbTxQuery, wn31tdb);
		try {
			ResultSet rs = qexec.execSelect();
			for (; rs.hasNext(); ) {
				QuerySolution soln = rs.next();
				String translation = soln.get("translation").asLiteral().getString();
				Resource senseRes = soln.get("sense").asResource();
				String senseShort = model.shortForm(senseRes.getURI());
				verbSenses.put(translation, senseShort);
			}
		} finally {
			qexec.close();
		}
		log.info("Loaded {} verb translations", verbSenses.size());
	}
	
	public QName expandRef(String ref) {
		String expanded = model.expandPrefix(ref);
		if (expanded.equals(ref)) {
			return new QName(ref);
		} else {
			String nsPrefix = StringUtils.substringBefore(ref, ":");
			String localPart = StringUtils.substringAfter(ref, ":");
			String nsUri = model.getNsPrefixURI(nsPrefix);
			return new QName(nsUri, localPart, nsPrefix);
		}
	}

	/**
	 * Enhance a QName with namespace URI, namespace prefix, and localPart if possible.
	 * @param ref
	 * @return
	 */
	public QName expandRef(QName ref) {
		if (!Strings.isNullOrEmpty(ref.getNamespaceURI())) {
			return ref;
		} else {
			return expandRef(ref.toString());
		}
	}
	
	/**
	 * Canonicalize a Jena {@link Resource} into a {@link QName} with prefix, nsURI, and localPart.
	 * @param res
	 * @return
	 */
	public QName toQName(Resource res) {
		final String resUri = res.getURI();
		String shortForm = model.shortForm(resUri);
		if (shortForm.equals(resUri)) {
			return new QName(resUri);
		} else {
			String nsPrefix = StringUtils.substringBefore(shortForm, ":");
			String localPart = StringUtils.substringAfter(shortForm, ":");
			String nsUri = model.getNsPrefixURI(nsPrefix);
			return new QName(nsUri, localPart, nsPrefix); 
		}
	}
	
	/**
	 * Return the QName as full URI if possible, otherwise prefixed (if exists), otherwise just local part.
	 * @param ref
	 * @return
	 */
	public static String asRef(QName ref) {
		if (!Strings.isNullOrEmpty(ref.getNamespaceURI())) {
			return ref.getNamespaceURI() + ref.getLocalPart();
		} else if (!Strings.isNullOrEmpty(ref.getPrefix())) {
			return ref.getPrefix() + ref.getLocalPart();
		} else {
			return ref.getLocalPart();
		}
	}
	
	/**
	 * Return the QName as prefixed QName if possible, otherwise full URI (with {delimiter}), otherwise just local part.
	 * @param ref
	 * @return
	 */
	public static String shortQName(QName ref) {
		if (!Strings.isNullOrEmpty(ref.getPrefix()) && !Strings.isNullOrEmpty(ref.getLocalPart())) {
			return ref.getPrefix() + ":" + ref.getLocalPart();
		} else {
			return ref.toString();
		}
	}
	
	/**
	 * Return short QName of {@link PartOfSpeech#getResource()} if possible,
	 * otherwise {@link PartOfSpeech#getLiteral()}.
	 * @param ref
	 * @return
	 */
	public static String shortQName(PartOfSpeech part) {
		if (part.getResource() != null) {
			return shortQName(part.getResource());
		} else {
			return part.getLiteral();
		}
	}
	
	protected List<PartOfSpeech> createReplacementParts(EList<LexReplacement> replacements,
			List<LexMatcher> matchers, List<CapturingGroup> capturingGroups) {
		List<PartOfSpeech> replacementParts = new ArrayList<>();
		for (int replacementIdx = 0; replacementIdx < replacements.size(); replacementIdx++) {
			final LexReplacement replacement = replacements.get(replacementIdx);
			if (replacement instanceof PronounReplacement) {
				final PronounReplacement pronounRepl = (PronounReplacement) replacement;
				@Nullable
				PronounPart found = null;
				for (PronounPart pronoun : PronounPartImpl.ALL) {
					if (pronoun.getPerson() == pronounRepl.getPerson() &&
							pronoun.getNumber() == pronounRepl.getNumber() &&
							pronoun.getCase() == pronounRepl.getCase()) {
						found = EcoreUtil.copy(pronoun);
						break;
					}
				}
				Preconditions.checkArgument(found != null,
						"Cannot find pronoun matching %s", pronounRepl);
				replacementParts.add(found);
			} else if (replacement instanceof ResourceReplacement) {
				final PartOfSpeech part;
				switch (replacement.getPartOfSpeech()) {
				case NOUN:
					part = RelexidFactory.eINSTANCE.createNounPart();
					break;
				case VERB:
					part = RelexidFactory.eINSTANCE.createVerbPart();
					break;
				case ADJECTIVE:
					part = RelexidFactory.eINSTANCE.createAdjectivePart();
					break;
				case ADJECTIVE_SATELLITE:
					part = RelexidFactory.eINSTANCE.createAdjectiveSatellitePart();
					break;
				default:
					throw new UnsupportedOperationException("Unhandled part of speech: " +replacement.getPartOfSpeech());
				}
				final ResourceReplacement resourceRepl = (ResourceReplacement) replacement;
				if (resourceRepl.getResource() != null) {
					part.setResource(expandRef(resourceRepl.getResource()));
				} else {
					final CapturingGroup capturingGroup = capturingGroups.get( resourceRepl.getCaptureGroup() - 1 );
					log.trace("capturingGroup[{}] = {}", resourceRepl.getCaptureGroup(), capturingGroup);
					Preconditions.checkState(capturingGroup.getResource() != null, 
							"Capture group for %s must have resource", resourceRepl );
					part.setResource(capturingGroup.getResource());
				}
				part.setName(getSenseLabel(part.getResource()));
				part.setLiteral(part.getResource().toString());
				
				// sub-replacements
				if (!resourceRepl.getReplacements().isEmpty()) {
					Preconditions.checkArgument(part instanceof PartContainer,
							"Cannot create sub-replacements because %s is not a PartContainer", part);
					List<PartOfSpeech> subParts = createReplacementParts(resourceRepl.getReplacements(), matchers, capturingGroups);
					((PartContainer) part).getParts().addAll(subParts);
				}
				
				replacementParts.add(part);
			} else if (replacement instanceof PunctuationReplacement) {
				switch (((PunctuationReplacement) replacement).getPunctuation()) {
					case FULL_STOP:
						replacementParts.add(EcoreUtil.copy(PunctuationPartImpl.FULL_STOP));
						break;
					case COMMA:
						replacementParts.add(EcoreUtil.copy(PunctuationPartImpl.COMMA));
						break;
					case QUESTION:
						replacementParts.add(EcoreUtil.copy(PunctuationPartImpl.QUESTION));
						break;
					case EXCLAMATION:
						replacementParts.add(EcoreUtil.copy(PunctuationPartImpl.EXCLAMATION));
						break;
				}
			} else {
				throw new UnsupportedOperationException("Unknown replacement: " + replacement);
			}
		}
		return replacementParts;
	}
	
	/**
	 * Find indexes of start of words, in order to support partial sentence matching
	 * @param parts
	 * @return
	 */
	protected List<Integer> findWalls(List<PartOfSpeech> parts) {
		List<Integer> walls = new ArrayList<>();
		for (int i = 0; i < parts.size(); i++) {
			final PartOfSpeech part = parts.get(i);
			if (part instanceof UnrecognizedPart && !part.getLiteral().trim().isEmpty()) {
				walls.add(i);
			}
		}
		return walls;
	}

	public Sentence parse(String originalLiteral) {
//		StrTokenizer tokenizer = new StrTokenizer(originalLiteral);
		List<String> tokens = tokenizer.tokenize(originalLiteral);
		log.debug("Tokens: {}", tokens);
		
		
		Sentence sentence = RelexidFactory.eINSTANCE.createSentence();
		for (int i = 0; i < tokens.size(); i++) {
			UnrecognizedPart part = RelexidFactory.eINSTANCE.createUnrecognizedPart();
			part.setLiteral(tokens.get(i));
			sentence.getParts().add(part);
		}
		List<Integer> walls = findWalls(sentence.getParts()); // initial walls
		
		@Nullable
		LexRule matchedRule = null;
		
		Iterator<LexRule> ruleIter = lexRules.getRules().iterator();
		while (ruleIter.hasNext()) {
			LexRule rule = ruleIter.next();
			boolean resetRuleIter = false;
			
			Iterator<Integer> wallIter = walls.iterator();
			while (wallIter.hasNext()) {
				int wall = wallIter.next();
				
				boolean wallMatches = true;
				int unrecognizedPartIdx = wall;
				@Nullable
				Integer startMatchIdx = null;
				@Nullable
				Integer endMatchIdx = null;
				
				List<CapturingGroup> capturingGroups = new ArrayList<>();
				
				for (LexMatcher matcher : rule.getMatchers()) {
					
					// next valid unrecognized token, please
					while (unrecognizedPartIdx < sentence.getParts().size()) {
						PartOfSpeech part = sentence.getParts().get(unrecognizedPartIdx);
						if (!(part instanceof UnrecognizedPart)) {
							unrecognizedPartIdx++;
						} else if (part.getLiteral().trim().isEmpty()) {
							unrecognizedPartIdx++;
						} else {
							// stop right there, we need to process this unrecognized part
							break;
						}
					}
					if (unrecognizedPartIdx >= sentence.getParts().size()) {
						// EOL!
						wallMatches = false;
						break;
					}
					if (startMatchIdx == null) {
						startMatchIdx = unrecognizedPartIdx;
					}
					
					final UnrecognizedPart unrecognizedPart = (UnrecognizedPart) sentence.getParts().get(unrecognizedPartIdx);
					@Nullable
					Integer nextPartIdx = null;
					final boolean matches;
					if (matcher instanceof LiteralMatcher) {
						LiteralMatcher literalEl = (LiteralMatcher) matcher;
						if (literalEl.isCaseSensitive()) {
							matches = FluentIterable.from(literalEl.getLiterals()).anyMatch(new Predicate<String>() {
								@Override
								public boolean apply(String input) {
									return unrecognizedPart.getLiteral().equals(input);
								}
							});
						} else {
							matches = FluentIterable.from(literalEl.getLiterals()).anyMatch(new Predicate<String>() {
								@Override
								public boolean apply(String input) {
									return unrecognizedPart.getLiteral().equalsIgnoreCase(input);
								}
							});
						}
						if (matches) {
							capturingGroups.add(new CapturingGroup(null));
							nextPartIdx = unrecognizedPartIdx + 1;
						}
					} else if (matcher instanceof ResourceMatcher) {
						ResourceMatcher resEl = (ResourceMatcher) matcher;
						final QName enhancedRes = expandRef(resEl.getResource());
						String resourceUri = asRef(enhancedRes);
						@Nullable
						String word = dictionary.get(resourceUri);
						if (word != null) {
							matches = word.equalsIgnoreCase(unrecognizedPart.getLiteral());
							if (matches) {
								capturingGroups.add(new CapturingGroup(enhancedRes));
								nextPartIdx = unrecognizedPartIdx + 1;
							}
						} else {
							log.warn("No word for {} in dictionary with {} entries", resourceUri, dictionary.size());
							matches = false;
						}
					} else if (matcher instanceof PartOfSpeechMatcher) {
						PartOfSpeechMatcher posMatcher = (PartOfSpeechMatcher) matcher;
						PartOfSpeechType pos = posMatcher.getPartOfSpeech();
						final List<QName> senses;
						switch (pos) {
						case VERB:
							senses = getVerbSenses(unrecognizedPart.getLiteral());
							break;
						case NOUN:
							senses = getNounSenses(unrecognizedPart.getLiteral());
							break;
						case ADJECTIVE:
							senses = getAdjectiveSenses(unrecognizedPart.getLiteral());
							break;
						case ADJECTIVE_SATELLITE:
							senses = getAdjectiveSatelliteSenses(unrecognizedPart.getLiteral());
							break;
						default:
							throw new IllegalArgumentException("Lex matcher PartOfSpeech does not support " + pos);
						}
						if (!senses.isEmpty()) {
							matches = true;
							QName sense = senses.get(0);
							capturingGroups.add(new CapturingGroup(sense));
							nextPartIdx = unrecognizedPartIdx + 1;
							if (senses.size() > 1) {
								log.warn("PartOfSpeech matcher for {} '{}' chose the first sense {} but matched {} senses: {}",
										pos, unrecognizedPart.getLiteral(), shortQName(sense), senses.size(), 
										FluentIterable.from(senses).transform(new Function<QName, String>() {
											@Override
											public String apply(QName input) {
												return shortQName(input);
											}
										}) );
							}
						} else {
							matches = false;
						}
					} else {
						matches = false;
					}
					
					// match?
					if (matches) {
						log.debug("  Lex «{}» match for #{}: {}", matcher, unrecognizedPartIdx, unrecognizedPart);
						endMatchIdx = unrecognizedPartIdx;
						unrecognizedPartIdx = nextPartIdx;
					} else {
						log.debug("  Lex «{}» not match for #{}: {}", matcher, unrecognizedPartIdx, unrecognizedPart);
						wallMatches = false;
						break;
					}
				}
				
				if (wallMatches) {
					Range<Integer> matchRange = Range.closed(startMatchIdx, endMatchIdx);
					List<PartOfSpeech> replacedParts = ImmutableList.copyOf(
							sentence.getParts().subList(matchRange.lowerEndpoint(), matchRange.upperEndpoint() + 1));
					log.info("Rule {} match for {}: {}", rule, matchRange, replacedParts);
					for (int i = matchRange.upperEndpoint(); i >= matchRange.lowerEndpoint(); i--) {
						sentence.getParts().remove(i);
					}
					
					List<PartOfSpeech> replacementParts = createReplacementParts(
							rule.getReplacements(), rule.getMatchers(), capturingGroups);

					log.debug("Replacing with {} parts at index #{}: {}",
							replacementParts.size(), startMatchIdx, replacementParts);
					sentence.getParts().addAll(startMatchIdx, replacementParts);
					
					// regenerate walls, reset ruleIter and wallIter
					walls = findWalls(sentence.getParts());
					wallIter = Iterators.emptyIterator();
					resetRuleIter = true;
					break;
				} else {
					log.debug("Rule «{}» not match for any sublist of {}", rule, tokens);
				}
				
			}
			
			// stop if we already recognized everything (ignoring whitespace)
			boolean allRecognized = true;
			for (PartOfSpeech part : sentence.getParts()) {
				if (part instanceof UnrecognizedPart && !part.getLiteral().trim().isEmpty()) {
					allRecognized = false;
					break;
				}
			}
			if (allRecognized) {
				// remove whitespace
				for (int i = sentence.getParts().size() - 1; i >= 0; i--) {
					if (sentence.getParts().get(i) instanceof UnrecognizedPart && sentence.getParts().get(i).getLiteral().trim().isEmpty()) {
						sentence.getParts().remove(i);
					}
				}
				// finish parsing
				break;
			}
			
			if (resetRuleIter) {
				ruleIter = lexRules.getRules().iterator();
			}
		}
		
		List<Relation> relations = findRelations(sentence.getParts());
		log.debug("Deduced {} relations for sentence '{}': {}", relations.size(), sentence.getLiteral(), relations);
		sentence.getRelations().addAll(relations);
		
		return sentence;
	}

	/**
	 * Mapping from {@code ind} translations to WordNet senses for verb part-of-speech.
	 * The value is String to save memory, it is short QName, where nsPrefix needs
	 * to be explictly supported, e.g. {@code wn31} for nvarps.
	 * 
	 * @param verbLiteral Verb literal, please preserve capitalization because case-normalization will be performed here.
	 * @return
	 * @todo These aren't sorted/prioritized in any way.
	 * @todo Need Cached by EHCache or something (never expire but with invalidation), or function-based index.
	 */
	protected List<QName> getVerbSenses(final String verbLiteral) {
		List<QName> senses = new ArrayList<>();
		ParameterizedSparqlString sparql = new ParameterizedSparqlString(
				"SELECT ?sense\n"
				+ "WHERE {\n"
				+ "	?sense wordnet-ontology:translation ?verbLiteral ;"
				+ "		wordnet-ontology:part_of_speech wordnet-ontology:verb\n"
				+ "} LIMIT 100", model);
		sparql.setLiteral("verbLiteral", verbLiteral.toLowerCase(), "ind");
		log.trace("getVerbSenses '{}' SPARQL: {}", verbLiteral, sparql);
		Query verbTxQuery = QueryFactory.create(sparql.toString());
		QueryExecution qexec = QueryExecutionFactory.create(verbTxQuery, wn31tdb);
		try {
			ResultSet rs = qexec.execSelect();
			for (; rs.hasNext(); ) {
				QuerySolution soln = rs.next();
				QName senseRes = toQName(soln.get("sense").asResource());
				senses.add(senseRes);
			}
		} finally {
			qexec.close();
		}
		return senses;
		
//		return FluentIterable.from( verbSenses.get(verbLiteral.toLowerCase()) )
//				.transform(new Function<String, QName>() {
//					@Override
//					public QName apply(String input) {
//						return RelEx.this.expandRef(input);
//					}
//				}).toList();
	}
	
	/**
	 * Mapping from {@code ind} translations to WordNet senses for noun part-of-speech.
	 * The value is String to save memory, it is short QName, where nsPrefix needs
	 * to be explictly supported, e.g. {@code wn31} for nvarps.
	 * 
	 * @param nounLiteral Verb literal, please preserve capitalization because case-normalization will be performed here.
	 * @return
	 * @todo These aren't sorted/prioritized in any way.
	 * @todo Need Cached by EHCache or something (never expire but with invalidation), or function-based index.
	 */
	protected List<QName> getNounSenses(final String nounLiteral) {
		List<QName> senses = new ArrayList<>();
		ParameterizedSparqlString sparql = new ParameterizedSparqlString(
				"SELECT ?sense\n"
				+ "WHERE {\n"
				+ "	?sense wordnet-ontology:translation ?nounLiteral ;"
				+ "		wordnet-ontology:part_of_speech wordnet-ontology:noun\n"
				+ "} LIMIT 100", model);
		sparql.setLiteral("nounLiteral", nounLiteral.toLowerCase(), "ind");
		log.trace("getNounSenses '{}' SPARQL: {}", nounLiteral, sparql);
		Query verbTxQuery = QueryFactory.create(sparql.toString());
		QueryExecution qexec = QueryExecutionFactory.create(verbTxQuery, wn31tdb);
		try {
			ResultSet rs = qexec.execSelect();
			for (; rs.hasNext(); ) {
				QuerySolution soln = rs.next();
				QName senseRes = toQName(soln.get("sense").asResource());
				senses.add(senseRes);
			}
		} finally {
			qexec.close();
		}
		return senses;
	}
	
	/**
	 * Mapping from {@code ind} translations to WordNet senses for adjective part-of-speech.
	 * The value is String to save memory, it is short QName, where nsPrefix needs
	 * to be explictly supported, e.g. {@code wn31} for nvarps.
	 * 
	 * @param adjectiveLiteral Verb literal, please preserve capitalization because case-normalization will be performed here.
	 * @return
	 * @todo These aren't sorted/prioritized in any way.
	 * @todo Need Cached by EHCache or something (never expire but with invalidation), or function-based index.
	 */
	protected List<QName> getAdjectiveSenses(final String adjectiveLiteral) {
		List<QName> senses = new ArrayList<>();
		ParameterizedSparqlString sparql = new ParameterizedSparqlString(
				"SELECT ?sense\n"
				+ "WHERE {\n"
				+ "	?sense wordnet-ontology:translation ?adjectiveLiteral ;"
				+ "		wordnet-ontology:part_of_speech wordnet-ontology:adjective\n"
				+ "} LIMIT 100", model);
		sparql.setLiteral("adjectiveLiteral", adjectiveLiteral.toLowerCase(), "ind");
		log.trace("getAdjectiveSenses '{}' SPARQL: {}", adjectiveLiteral, sparql);
		Query verbTxQuery = QueryFactory.create(sparql.toString());
		QueryExecution qexec = QueryExecutionFactory.create(verbTxQuery, wn31tdb);
		try {
			ResultSet rs = qexec.execSelect();
			for (; rs.hasNext(); ) {
				QuerySolution soln = rs.next();
				QName senseRes = toQName(soln.get("sense").asResource());
				senses.add(senseRes);
			}
		} finally {
			qexec.close();
		}
		return senses;
	}
	
	/**
	 * Mapping from {@code ind} translations to WordNet senses for {@link PartOfSpeechType#ADJECTIVE_SATELLITE} part-of-speech.
	 * The value is String to save memory, it is short QName, where nsPrefix needs
	 * to be explictly supported, e.g. {@code wn31} for nvarps.
	 * 
	 * @param adjectiveSatelliteLiteral Verb literal, please preserve capitalization because case-normalization will be performed here.
	 * @return
	 * @todo These aren't sorted/prioritized in any way.
	 * @todo Need Cached by EHCache or something (never expire but with invalidation), or function-based index.
	 */
	protected List<QName> getAdjectiveSatelliteSenses(final String adjectiveSatelliteLiteral) {
		List<QName> senses = new ArrayList<>();
		ParameterizedSparqlString sparql = new ParameterizedSparqlString(
				"SELECT ?sense\n"
				+ "WHERE {\n"
				+ "	?sense wordnet-ontology:translation ?adjectiveSatelliteLiteral ;"
				+ "		wordnet-ontology:part_of_speech wordnet-ontology:adjective_satellite\n"
				+ "} LIMIT 100", model);
		sparql.setLiteral("adjectiveSatelliteLiteral", adjectiveSatelliteLiteral.toLowerCase(), "ind");
		log.trace("getAdjectiveSatelliteSenses '{}' SPARQL: {}", adjectiveSatelliteLiteral, sparql);
		Query verbTxQuery = QueryFactory.create(sparql.toString());
		QueryExecution qexec = QueryExecutionFactory.create(verbTxQuery, wn31tdb);
		try {
			ResultSet rs = qexec.execSelect();
			for (; rs.hasNext(); ) {
				QuerySolution soln = rs.next();
				QName senseRes = toQName(soln.get("sense").asResource());
				senses.add(senseRes);
			}
		} finally {
			qexec.close();
		}
		return senses;
	}
	
	/**
	 * Determines if {@code parts} exactly matches {@code matchers}, including sub-parts and sub-matchers.
	 * Note that (currently) parts.size() must be == matchers.size(), otherwise it'll immediately return false.
	 * 
	 * @todo Advanced/wildcard {@link PartMatcher}s may have cardinality other than 1, so the parts.size == matchers.size assumption
	 * 		won't be always true.
	 * @param parts
	 * @param matchers
	 * @return
	 */
	protected boolean partsMatch(List<PartOfSpeech> parts, List<PartMatcher> matchers) {
		if (parts.size() != matchers.size()) {
			return false;
		}
		List<PartMatcher> matcheds = new ArrayList<PartMatcher>();
		for (int partIdx = 0; partIdx < parts.size(); partIdx++) {
			PartOfSpeech part = parts.get(partIdx);
			PartMatcher matcher = matchers.get(partIdx);
			final boolean matcherMatches;
			if (matcher instanceof TypedPartMatcher) {
				final boolean parentMatches; 
				switch (((TypedPartMatcher) matcher).getPartOfSpeech()) {
				case NOUN:
					parentMatches = part instanceof NounPart;
					break;
				case CONJUNCTION:
					parentMatches = part instanceof ConjunctionPart;
					break;
				case INTERJECTION:
					parentMatches = part instanceof InterjectionPart;
					break;
				case PREPOSITION:
					parentMatches = part instanceof PrepositionPart;
					break;
				case PRONOUN:
					parentMatches = part instanceof PronounPart;
					break;
				case VERB:
					parentMatches = part instanceof VerbPart;
					break;
				default:
					throw new IllegalArgumentException("Unhandled PartOfSpeech type: " + matcher);
				}
				
				if (parentMatches) {
					final boolean childrenMatches;
					if (!matcher.getMatchers().isEmpty()) {
						if (part instanceof PartContainer) {
							childrenMatches = partsMatch(((PartContainer) part).getParts(), matcher.getMatchers());
						} else {
							childrenMatches = false;
						}
					} else {
						childrenMatches = true;
					}
					log.trace("Matcher {} for {}: parent.matched?{} children.matched?{}",
							matcher, part, parentMatches, childrenMatches);
					matcherMatches = childrenMatches;
				} else {
					log.trace("Matcher {} for {}: parent.matched?{}",
							matcher, part, parentMatches);
					matcherMatches = false;
				}
				
			} else {
				throw new IllegalArgumentException("Unhandled PartMatcher: " + matcher);
			}
			
			if (matcherMatches) {
				log.debug("Matcher {} matches {}", matcher, part);
				matcheds.add(matcher);
			} else {
				log.trace("Matcher {} not matches {}", matcher, part);
				break;
			}
		}
		
		log.debug("Matcheds {} for matchers {} against {}", matcheds.size(), matchers, parts);
		return matcheds.equals(matchers);
	}
	
	/**
	 * Get {@link PartOfSpeech} node from a tree. Path indexes are 1-based.
	 * @param partTree
	 * @param path
	 * @return
	 */
	protected <T extends PartOfSpeech> T getPartOfSpeechNode(List<PartOfSpeech> partTree, List<Integer> path) {
		int first = path.get(0);
		PartOfSpeech myPart = partTree.get(first - 1);
		List<Integer> rest = path.subList(1, path.size());
		if (!rest.isEmpty()) {
			Preconditions.checkArgument(myPart instanceof PartContainer,
					"Unreachable path '%s' because not PartContainer for %s", path, myPart);
			return getPartOfSpeechNode(((PartContainer) myPart).getParts(), rest); 
		} else {
			return (T) myPart;
		}
	}
	
	/**
	 * @param sentenceParts The {@link PartMatcher}s will be invoked against all possible sublists of these.
	 * 		For sentence "I love you", it will be matched 6 times, for "I", "I love", "I love you", "love", "love you", and "you".
	 * @return
	 */
	public List<Relation> findRelations(List<PartOfSpeech> sentenceParts) {
		ArrayList<Relation> relations = new ArrayList<>();
		for (RelationRule rule : relationRules.getRules()) {
			
			// create sublists of parts
			for (int startPartIdx = 0; startPartIdx < sentenceParts.size(); startPartIdx++) {
				for (int endPartIdx = startPartIdx; endPartIdx < sentenceParts.size(); endPartIdx++) {
					List<PartOfSpeech> subParts = sentenceParts.subList(startPartIdx, endPartIdx + 1);
					if (partsMatch(subParts, rule.getMatchers())) {
						log.debug("Relation rule {} matches {}..{} {}", rule, startPartIdx, endPartIdx, subParts);
						for (RelationDef rd : rule.getRelationDefs()) {
							if (rd instanceof SubjectRelationDef) {
								SubjectRelation rel = RelexidFactory.eINSTANCE.createSubjectRelation();
								rel.setVerb( this.<VerbPart>getPartOfSpeechNode(subParts, ((SubjectRelationDef) rd).getVerb()) );
								rel.setSubject( getPartOfSpeechNode(subParts, ((SubjectRelationDef) rd).getSubject()) );
								relations.add(rel);
							} else if (rd instanceof ObjectRelationDef) {
								ObjectRelation rel = RelexidFactory.eINSTANCE.createObjectRelation();
								rel.setVerb( this.<VerbPart>getPartOfSpeechNode(subParts, ((ObjectRelationDef) rd).getVerb()) );
								rel.setObject( getPartOfSpeechNode(subParts, ((ObjectRelationDef) rd).getObject()) );
								relations.add(rel);
							} else {
								throw new IllegalArgumentException("Unhandled RelationDef: " + rd);
							}
						}
					} else {
						log.trace("Relation rule {} not matches {}..{} {}", rule, startPartIdx, endPartIdx, subParts);
					}
				}
				
			}
			
		}
		
		log.debug("Deduced {} relations from {} parts {} >> {}",
				relations.size(), sentenceParts.size(), sentenceParts, relations);
	
		return relations;
	}
	
	public void setDictionary(ImmutableMap<String, String> dict) {
		this.dictionary = dict;
	}

}
