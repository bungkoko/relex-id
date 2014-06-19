package id.ac.itb.ee.lskk.relexid.core;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;
import javax.xml.namespace.QName;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.commons.OnDemandXmiLoader;

import com.google.common.base.Predicate;
import com.google.common.base.Strings;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableMap;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

public class RelEx {
	
	private static final Logger log = LoggerFactory.getLogger(RelEx.class);
	
	private LexRules rules;
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

	public void loadRules(Class<?> clazz, String resourcePath) {
		log.debug("Loading rules from {} > {}", clazz, resourcePath);
		rules = new OnDemandXmiLoader<LexRules>(RelexidPackage.eINSTANCE, clazz, resourcePath).get();
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

	public Sentence parse(String originalLiteral) {
//		StrTokenizer tokenizer = new StrTokenizer(originalLiteral);
		List<String> tokens = tokenizer.tokenize(originalLiteral);
		log.debug("Tokens: {}", tokens);
		
		@Nullable
		Sentence sentence = null;
		@Nullable
		LexRule matchedRule = null;
		
		for (LexRule rule : rules.getRules()) {
			boolean ruleMatches = true;
			int tokenIdx = 0;
			for (LexElement el : rule.getPatterns()) {
				
				// next valid token, please
				while (tokenIdx < tokens.size() && tokens.get(tokenIdx).trim().isEmpty()) {
					tokenIdx++;
				}
				if (tokenIdx >= tokens.size()) {
					ruleMatches = false;
					break;
				}
				
				final String curFirstToken = tokens.get(tokenIdx);
				final boolean matches;
				if (el instanceof LiteralElement) {
					LiteralElement literalEl = (LiteralElement) el;
					if (literalEl.isCaseSensitive()) {
						matches = FluentIterable.from(literalEl.getLiterals()).anyMatch(new Predicate<String>() {
							@Override
							public boolean apply(String input) {
								return curFirstToken.equals(input);
							}
						});
					} else {
						matches = FluentIterable.from(literalEl.getLiterals()).anyMatch(new Predicate<String>() {
							@Override
							public boolean apply(String input) {
								return curFirstToken.equalsIgnoreCase(input);
							}
						});
					}
					if (matches) {
						tokenIdx++;
					}
				} else if (el instanceof ResourceElement) {
					ResourceElement resEl = (ResourceElement) el;
					String resourceUri = asRef(expandRef(resEl.getResource()));
					@Nullable
					String word = dictionary.get(resourceUri);
					if (word != null) {
						matches = word.equalsIgnoreCase(curFirstToken);
						if (matches) {
							tokenIdx++;
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
					log.debug("Element {} match for '{}'", el, curFirstToken);
				} else {
					log.debug("Element {} not match for '{}'", el, curFirstToken);
					ruleMatches = false;
					break;
				}
			}
			
			if (ruleMatches) {
				log.info("Rule {} match for {}", rule, tokens);
				sentence = RelexidFactory.eINSTANCE.createSentence();
				for (int replacementIdx = 0; replacementIdx < rule.getReplacements().size(); replacementIdx++) {
					final LexReplacement replacement = rule.getReplacements().get(replacementIdx);
					final LexElement el = rule.getPatterns().get(replacementIdx);
					if (replacement instanceof PronounReplacement) {
						PronounPart pronoun = RelexidFactory.eINSTANCE.createPronounPart();
						final PronounReplacement pronounRepl = (PronounReplacement) replacement;
						pronoun.setPerson(pronounRepl.getPerson());
						pronoun.setNumber(pronounRepl.getNumber());
						pronoun.setCase(pronounRepl.getCase());
						sentence.getParts().add(pronoun);
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
							final ResourceElement resEl = (ResourceElement) el;
							log.debug("Resource el.resource = {}", resEl.getResource());
							part.setResource(expandRef(resEl.getResource()));
						}
						part.setLiteral(part.getResource().toString());
						sentence.getParts().add(part);
					} else {
						throw new UnsupportedOperationException("Unknown replacement: " + replacement);
					}
				}
				break;
			} else {
				log.debug("Rule {} not match for {}", rule, tokens);
			}
		}
		
		if (sentence == null) {
			throw new IllegalArgumentException("Cannot understand: " + originalLiteral);
		}
		
		return sentence;
	}

	public void setDictionary(ImmutableMap<String, String> dict) {
		this.dictionary = dict;
	}

}
