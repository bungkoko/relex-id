package id.ac.itb.ee.lskk.relexid.core;

import id.ac.itb.ee.lskk.relexid.core.impl.PronounPartImpl;
import id.ac.itb.ee.lskk.relexid.core.impl.PunctuationPartImpl;

import java.util.ArrayList;
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

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Strings;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Range;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

public class RelEx {
	
	private static final Logger log = LoggerFactory.getLogger(RelEx.class);
	public static final Locale INDONESIAN = Locale.forLanguageTag("id-ID");
	
	private LexRules lexRules;
	private RelationRules relationRules;
	private ImmutableMap<String, String> dictionary;

	private final Tokenizer tokenizer;

	private final Model model;
	
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
		model.setNsPrefix("dbpedia", "http://dbpedia.org/resource/");
		model.setNsPrefix("dbpedia-owl", "http://dbpedia.org/ontology/");
		model.setNsPrefix("schema", "http://schema.org/");
	}

	public void loadLexRules(Class<?> clazz, String resourcePath) {
		log.debug("Loading LexRules from {} > {}", clazz, resourcePath);
		lexRules = new OnDemandXmiLoader<LexRules>(RelexidPackage.eINSTANCE, clazz, resourcePath).get();
	}
	
	public void loadRelationRules(Class<?> clazz, String resourcePath) {
		log.debug("Loading RelationRules from {} > {}", clazz, resourcePath);
		relationRules = new OnDemandXmiLoader<RelationRules>(RelexidPackage.eINSTANCE, clazz, resourcePath).get();
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
			List<LexMatcher> matchers) {
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
				default:
					throw new UnsupportedOperationException("Unhandled part of speech: " +replacement.getPartOfSpeech());
				}
				final ResourceReplacement resourceRepl = (ResourceReplacement) replacement;
				if (resourceRepl.getResource() != null) {
					part.setResource(expandRef(resourceRepl.getResource()));
				} else {
					final ResourceMatcher resMatcher = (ResourceMatcher) matchers.get(resourceRepl.getCaptureGroup() - 1);
					log.trace("resourceMatcher.resource = {}", resMatcher.getResource());
					part.setResource(expandRef(resMatcher.getResource()));
				}
				part.setLiteral(part.getResource().toString());
				
				// sub-replacements
				if (!resourceRepl.getReplacements().isEmpty()) {
					Preconditions.checkArgument(part instanceof PartContainer,
							"Cannot create sub-replacements because {} is not a PartContainer", part);
					List<PartOfSpeech> subParts = createReplacementParts(resourceRepl.getReplacements(), matchers);
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

	public Sentence parse(String originalLiteral) {
//		StrTokenizer tokenizer = new StrTokenizer(originalLiteral);
		List<String> tokens = tokenizer.tokenize(originalLiteral);
		log.debug("Tokens: {}", tokens);
		
		Sentence sentence = RelexidFactory.eINSTANCE.createSentence();
		for (String token : tokens) {
			UnrecognizedPart part = RelexidFactory.eINSTANCE.createUnrecognizedPart();
			part.setLiteral(token);
			sentence.getParts().add(part);
		}
		
		@Nullable
		LexRule matchedRule = null;
		
		for (LexRule rule : lexRules.getRules()) {
			boolean ruleMatches = true;
			int unrecognizedPartIdx = 0;
			@Nullable
			Integer startMatchIdx = null;
			@Nullable
			Integer endMatchIdx = null;
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
					ruleMatches = false;
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
						nextPartIdx = unrecognizedPartIdx + 1;
					}
				} else if (matcher instanceof ResourceMatcher) {
					ResourceMatcher resEl = (ResourceMatcher) matcher;
					String resourceUri = asRef(expandRef(resEl.getResource()));
					@Nullable
					String word = dictionary.get(resourceUri);
					if (word != null) {
						matches = word.equalsIgnoreCase(unrecognizedPart.getLiteral());
						if (matches) {
							nextPartIdx = unrecognizedPartIdx + 1;
						}
					} else {
						log.warn("No word for {} in dictionary with {} entries", resourceUri, dictionary.size());
						matches = false;
					}
				} else {
					matches = false;
				}
				
				// match?
				if (matches) {
					log.debug("Element {} match for #{}: {}", matcher, unrecognizedPartIdx, unrecognizedPart);
					endMatchIdx = unrecognizedPartIdx;
					unrecognizedPartIdx = nextPartIdx;
				} else {
					log.debug("Element {} not match for #{}: {}", matcher, unrecognizedPartIdx, unrecognizedPart);
					ruleMatches = false;
					break;
				}
			}
			
			if (ruleMatches) {
				Range<Integer> matchRange = Range.closed(startMatchIdx, endMatchIdx);
				List<PartOfSpeech> replacedParts = ImmutableList.copyOf(
						sentence.getParts().subList(matchRange.lowerEndpoint(), matchRange.upperEndpoint() + 1));
				log.info("Rule {} match for {}: {}", rule, matchRange, replacedParts);
				for (int i = matchRange.upperEndpoint(); i >= matchRange.lowerEndpoint(); i--) {
					sentence.getParts().remove(i);
				}
				
				List<PartOfSpeech> replacementParts = createReplacementParts(rule.getReplacements(), rule.getMatchers());

				log.debug("Replacing with {} parts at index #{}: {}",
						replacementParts.size(), startMatchIdx, replacementParts);
				sentence.getParts().addAll(startMatchIdx, replacementParts);
			} else {
				log.debug("Rule {} not match for {}", rule, tokens);
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
		}
		
		List<Relation> relations = findRelations(sentence.getParts());
		log.debug("Deduced {} relations for sentence '{}': {}", relations.size(), sentence.getLiteral(), relations);
		sentence.getRelations().addAll(relations);
		
		return sentence;
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
