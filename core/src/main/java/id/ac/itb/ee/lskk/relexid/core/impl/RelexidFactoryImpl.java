/**
 */
package id.ac.itb.ee.lskk.relexid.core.impl;

import id.ac.itb.ee.lskk.relexid.core.*;

import java.util.Locale;
import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelexidFactoryImpl extends EFactoryImpl implements RelexidFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelexidFactory init() {
		try {
			RelexidFactory theRelexidFactory = (RelexidFactory)EPackage.Registry.INSTANCE.getEFactory(RelexidPackage.eNS_URI);
			if (theRelexidFactory != null) {
				return theRelexidFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelexidFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelexidFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RelexidPackage.SENTENCE: return createSentence();
			case RelexidPackage.NOUN_PART: return createNounPart();
			case RelexidPackage.PRONOUN_PART: return createPronounPart();
			case RelexidPackage.VERB_PART: return createVerbPart();
			case RelexidPackage.LEX_RULE: return createLexRule();
			case RelexidPackage.PREPOSITION_PART: return createPrepositionPart();
			case RelexidPackage.CONJUNCTION_PART: return createConjunctionPart();
			case RelexidPackage.INTERJECTION_PART: return createInterjectionPart();
			case RelexidPackage.PART_OF_SPEECH_MATCHER: return createPartOfSpeechMatcher();
			case RelexidPackage.TYPED_RESOURCE_MATCHER: return createTypedResourceMatcher();
			case RelexidPackage.LITERAL_MATCHER: return createLiteralMatcher();
			case RelexidPackage.CLASS_MATCHER: return createClassMatcher();
			case RelexidPackage.LITERAL_REPLACEMENT: return createLiteralReplacement();
			case RelexidPackage.PUNCTUATION_PART: return createPunctuationPart();
			case RelexidPackage.PUNCTUATION_REPLACEMENT: return createPunctuationReplacement();
			case RelexidPackage.RESOURCE_REPLACEMENT: return createResourceReplacement();
			case RelexidPackage.QUESTION_REPLACEMENT: return createQuestionReplacement();
			case RelexidPackage.ADVERB_PART: return createAdverbPart();
			case RelexidPackage.ADJECTIVE_PART: return createAdjectivePart();
			case RelexidPackage.GENERATED_LITERAL: return createGeneratedLiteral();
			case RelexidPackage.LEX_RULES: return createLexRules();
			case RelexidPackage.RESOURCE_MATCHER: return createResourceMatcher();
			case RelexidPackage.PRONOUN_REPLACEMENT: return createPronounReplacement();
			case RelexidPackage.UNRECOGNIZED_PART: return createUnrecognizedPart();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RelexidPackage.PART_OF_SPEECH_TYPE:
				return createPartOfSpeechTypeFromString(eDataType, initialValue);
			case RelexidPackage.PUNCTUATION:
				return createPunctuationFromString(eDataType, initialValue);
			case RelexidPackage.QUESTION:
				return createQuestionFromString(eDataType, initialValue);
			case RelexidPackage.PRONOUN_PERSON:
				return createPronounPersonFromString(eDataType, initialValue);
			case RelexidPackage.PRONOUN_NUMBER:
				return createPronounNumberFromString(eDataType, initialValue);
			case RelexidPackage.PRONOUN_CASE:
				return createPronounCaseFromString(eDataType, initialValue);
			case RelexidPackage.QNAME:
				return createQNameFromString(eDataType, initialValue);
			case RelexidPackage.LOCALE:
				return createLocaleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RelexidPackage.PART_OF_SPEECH_TYPE:
				return convertPartOfSpeechTypeToString(eDataType, instanceValue);
			case RelexidPackage.PUNCTUATION:
				return convertPunctuationToString(eDataType, instanceValue);
			case RelexidPackage.QUESTION:
				return convertQuestionToString(eDataType, instanceValue);
			case RelexidPackage.PRONOUN_PERSON:
				return convertPronounPersonToString(eDataType, instanceValue);
			case RelexidPackage.PRONOUN_NUMBER:
				return convertPronounNumberToString(eDataType, instanceValue);
			case RelexidPackage.PRONOUN_CASE:
				return convertPronounCaseToString(eDataType, instanceValue);
			case RelexidPackage.QNAME:
				return convertQNameToString(eDataType, instanceValue);
			case RelexidPackage.LOCALE:
				return convertLocaleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sentence createSentence() {
		SentenceImpl sentence = new SentenceImpl();
		return sentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NounPart createNounPart() {
		NounPartImpl nounPart = new NounPartImpl();
		return nounPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PronounPart createPronounPart() {
		PronounPartImpl pronounPart = new PronounPartImpl();
		return pronounPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerbPart createVerbPart() {
		VerbPartImpl verbPart = new VerbPartImpl();
		return verbPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LexRule createLexRule() {
		LexRuleImpl lexRule = new LexRuleImpl();
		return lexRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrepositionPart createPrepositionPart() {
		PrepositionPartImpl prepositionPart = new PrepositionPartImpl();
		return prepositionPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConjunctionPart createConjunctionPart() {
		ConjunctionPartImpl conjunctionPart = new ConjunctionPartImpl();
		return conjunctionPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterjectionPart createInterjectionPart() {
		InterjectionPartImpl interjectionPart = new InterjectionPartImpl();
		return interjectionPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartOfSpeechMatcher createPartOfSpeechMatcher() {
		PartOfSpeechMatcherImpl partOfSpeechMatcher = new PartOfSpeechMatcherImpl();
		return partOfSpeechMatcher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedResourceMatcher createTypedResourceMatcher() {
		TypedResourceMatcherImpl typedResourceMatcher = new TypedResourceMatcherImpl();
		return typedResourceMatcher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralMatcher createLiteralMatcher() {
		LiteralMatcherImpl literalMatcher = new LiteralMatcherImpl();
		return literalMatcher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassMatcher createClassMatcher() {
		ClassMatcherImpl classMatcher = new ClassMatcherImpl();
		return classMatcher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PronounReplacement createPronounReplacement() {
		PronounReplacementImpl pronounReplacement = new PronounReplacementImpl();
		return pronounReplacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnrecognizedPart createUnrecognizedPart() {
		UnrecognizedPartImpl unrecognizedPart = new UnrecognizedPartImpl();
		return unrecognizedPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralReplacement createLiteralReplacement() {
		LiteralReplacementImpl literalReplacement = new LiteralReplacementImpl();
		return literalReplacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PunctuationPart createPunctuationPart() {
		PunctuationPartImpl punctuationPart = new PunctuationPartImpl();
		return punctuationPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PunctuationReplacement createPunctuationReplacement() {
		PunctuationReplacementImpl punctuationReplacement = new PunctuationReplacementImpl();
		return punctuationReplacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceReplacement createResourceReplacement() {
		ResourceReplacementImpl resourceReplacement = new ResourceReplacementImpl();
		return resourceReplacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionReplacement createQuestionReplacement() {
		QuestionReplacementImpl questionReplacement = new QuestionReplacementImpl();
		return questionReplacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverbPart createAdverbPart() {
		AdverbPartImpl adverbPart = new AdverbPartImpl();
		return adverbPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjectivePart createAdjectivePart() {
		AdjectivePartImpl adjectivePart = new AdjectivePartImpl();
		return adjectivePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedLiteral createGeneratedLiteral() {
		GeneratedLiteralImpl generatedLiteral = new GeneratedLiteralImpl();
		return generatedLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LexRules createLexRules() {
		LexRulesImpl lexRules = new LexRulesImpl();
		return lexRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceMatcher createResourceMatcher() {
		ResourceMatcherImpl resourceMatcher = new ResourceMatcherImpl();
		return resourceMatcher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartOfSpeechType createPartOfSpeechTypeFromString(EDataType eDataType, String initialValue) {
		PartOfSpeechType result = PartOfSpeechType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPartOfSpeechTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Punctuation createPunctuationFromString(EDataType eDataType, String initialValue) {
		Punctuation result = Punctuation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPunctuationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question createQuestionFromString(EDataType eDataType, String initialValue) {
		Question result = Question.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PronounPerson createPronounPersonFromString(EDataType eDataType, String initialValue) {
		PronounPerson result = PronounPerson.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPronounPersonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PronounNumber createPronounNumberFromString(EDataType eDataType, String initialValue) {
		PronounNumber result = PronounNumber.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPronounNumberToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PronounCase createPronounCaseFromString(EDataType eDataType, String initialValue) {
		PronounCase result = PronounCase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPronounCaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName createQNameFromString(EDataType eDataType, String initialValue) {
		return (QName)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQNameToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Locale createLocaleFromString(EDataType eDataType, String initialValue) {
		return (Locale)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocaleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelexidPackage getRelexidPackage() {
		return (RelexidPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelexidPackage getPackage() {
		return RelexidPackage.eINSTANCE;
	}

} //RelexidFactoryImpl
