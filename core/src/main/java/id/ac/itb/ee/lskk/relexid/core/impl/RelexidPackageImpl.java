/**
 */
package id.ac.itb.ee.lskk.relexid.core.impl;

import id.ac.itb.ee.lskk.relexid.core.AdjectivePart;
import id.ac.itb.ee.lskk.relexid.core.AdverbPart;
import id.ac.itb.ee.lskk.relexid.core.ClassElement;
import id.ac.itb.ee.lskk.relexid.core.ConjunctionPart;
import id.ac.itb.ee.lskk.relexid.core.InterjectionPart;
import id.ac.itb.ee.lskk.relexid.core.LexElement;
import id.ac.itb.ee.lskk.relexid.core.LexReplacement;
import id.ac.itb.ee.lskk.relexid.core.LexRule;
import id.ac.itb.ee.lskk.relexid.core.LiteralElement;
import id.ac.itb.ee.lskk.relexid.core.LiteralReplacement;
import id.ac.itb.ee.lskk.relexid.core.NounPart;
import id.ac.itb.ee.lskk.relexid.core.PartContainer;
import id.ac.itb.ee.lskk.relexid.core.PartOfSpeech;
import id.ac.itb.ee.lskk.relexid.core.PartOfSpeechElement;
import id.ac.itb.ee.lskk.relexid.core.PartOfSpeechType;
import id.ac.itb.ee.lskk.relexid.core.PrepositionPart;
import id.ac.itb.ee.lskk.relexid.core.PronounCase;
import id.ac.itb.ee.lskk.relexid.core.PronounNumber;
import id.ac.itb.ee.lskk.relexid.core.PronounPart;
import id.ac.itb.ee.lskk.relexid.core.PronounPerson;
import id.ac.itb.ee.lskk.relexid.core.Punctuation;
import id.ac.itb.ee.lskk.relexid.core.PunctuationPart;
import id.ac.itb.ee.lskk.relexid.core.PunctuationReplacement;
import id.ac.itb.ee.lskk.relexid.core.Question;
import id.ac.itb.ee.lskk.relexid.core.QuestionReplacement;
import id.ac.itb.ee.lskk.relexid.core.Questionable;
import id.ac.itb.ee.lskk.relexid.core.RelexidFactory;
import id.ac.itb.ee.lskk.relexid.core.RelexidPackage;
import id.ac.itb.ee.lskk.relexid.core.ResourceElement;
import id.ac.itb.ee.lskk.relexid.core.ResourceReplacement;
import id.ac.itb.ee.lskk.relexid.core.Sentence;
import id.ac.itb.ee.lskk.relexid.core.VerbPart;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelexidPackageImpl extends EPackageImpl implements RelexidPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sentenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partOfSpeechEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nounPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pronounPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verbPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lexRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prepositionPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conjunctionPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interjectionPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lexElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partOfSpeechElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lexReplacementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalReplacementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass punctuationPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass punctuationReplacementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceReplacementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionReplacementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adverbPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adjectivePartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum partOfSpeechTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum punctuationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum questionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pronounPersonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pronounNumberEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pronounCaseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType qNameEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelexidPackageImpl() {
		super(eNS_URI, RelexidFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RelexidPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelexidPackage init() {
		if (isInited) return (RelexidPackage)EPackage.Registry.INSTANCE.getEPackage(RelexidPackage.eNS_URI);

		// Obtain or create and register package
		RelexidPackageImpl theRelexidPackage = (RelexidPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RelexidPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RelexidPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRelexidPackage.createPackageContents();

		// Initialize created meta-data
		theRelexidPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelexidPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelexidPackage.eNS_URI, theRelexidPackage);
		return theRelexidPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSentence() {
		return sentenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSentence_Literal() {
		return (EAttribute)sentenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartOfSpeech() {
		return partOfSpeechEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartOfSpeech_Literal() {
		return (EAttribute)partOfSpeechEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartOfSpeech_Resource() {
		return (EAttribute)partOfSpeechEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNounPart() {
		return nounPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPronounPart() {
		return pronounPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPronounPart_Person() {
		return (EAttribute)pronounPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPronounPart_Number() {
		return (EAttribute)pronounPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPronounPart_Case() {
		return (EAttribute)pronounPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerbPart() {
		return verbPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLexRule() {
		return lexRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLexRule_Patterns() {
		return (EReference)lexRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLexRule_Replacements() {
		return (EReference)lexRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrepositionPart() {
		return prepositionPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConjunctionPart() {
		return conjunctionPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterjectionPart() {
		return interjectionPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLexElement() {
		return lexElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartOfSpeechElement() {
		return partOfSpeechElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartOfSpeechElement_PartOfSpeech() {
		return (EAttribute)partOfSpeechElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceElement() {
		return resourceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceElement_SemanticClass() {
		return (EAttribute)resourceElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceElement_SemanticClassRef() {
		return (EAttribute)resourceElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralElement() {
		return literalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralElement_CaseSensitive() {
		return (EAttribute)literalElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassElement() {
		return classElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassElement_SemanticClass() {
		return (EAttribute)classElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionable() {
		return questionableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestionable_Questioning() {
		return (EAttribute)questionableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLexReplacement() {
		return lexReplacementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLexReplacement_PartOfSpeech() {
		return (EAttribute)lexReplacementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralReplacement() {
		return literalReplacementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralReplacement_Literal() {
		return (EAttribute)literalReplacementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPunctuationPart() {
		return punctuationPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPunctuationPart_Punctuation() {
		return (EAttribute)punctuationPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPunctuationReplacement() {
		return punctuationReplacementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPunctuationReplacement_Punctuation() {
		return (EAttribute)punctuationReplacementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceReplacement() {
		return resourceReplacementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceReplacement_Resource() {
		return (EAttribute)resourceReplacementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionReplacement() {
		return questionReplacementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestionReplacement_Question() {
		return (EAttribute)questionReplacementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdverbPart() {
		return adverbPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdjectivePart() {
		return adjectivePartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartContainer() {
		return partContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartContainer_Parts() {
		return (EReference)partContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPartOfSpeechType() {
		return partOfSpeechTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPunctuation() {
		return punctuationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuestion() {
		return questionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPronounPerson() {
		return pronounPersonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPronounNumber() {
		return pronounNumberEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPronounCase() {
		return pronounCaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getQName() {
		return qNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelexidFactory getRelexidFactory() {
		return (RelexidFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		sentenceEClass = createEClass(SENTENCE);
		createEAttribute(sentenceEClass, SENTENCE__LITERAL);

		partOfSpeechEClass = createEClass(PART_OF_SPEECH);
		createEAttribute(partOfSpeechEClass, PART_OF_SPEECH__LITERAL);
		createEAttribute(partOfSpeechEClass, PART_OF_SPEECH__RESOURCE);

		nounPartEClass = createEClass(NOUN_PART);

		pronounPartEClass = createEClass(PRONOUN_PART);
		createEAttribute(pronounPartEClass, PRONOUN_PART__PERSON);
		createEAttribute(pronounPartEClass, PRONOUN_PART__NUMBER);
		createEAttribute(pronounPartEClass, PRONOUN_PART__CASE);

		verbPartEClass = createEClass(VERB_PART);

		lexRuleEClass = createEClass(LEX_RULE);
		createEReference(lexRuleEClass, LEX_RULE__PATTERNS);
		createEReference(lexRuleEClass, LEX_RULE__REPLACEMENTS);

		prepositionPartEClass = createEClass(PREPOSITION_PART);

		conjunctionPartEClass = createEClass(CONJUNCTION_PART);

		interjectionPartEClass = createEClass(INTERJECTION_PART);

		lexElementEClass = createEClass(LEX_ELEMENT);

		partOfSpeechElementEClass = createEClass(PART_OF_SPEECH_ELEMENT);
		createEAttribute(partOfSpeechElementEClass, PART_OF_SPEECH_ELEMENT__PART_OF_SPEECH);

		resourceElementEClass = createEClass(RESOURCE_ELEMENT);
		createEAttribute(resourceElementEClass, RESOURCE_ELEMENT__SEMANTIC_CLASS);
		createEAttribute(resourceElementEClass, RESOURCE_ELEMENT__SEMANTIC_CLASS_REF);

		literalElementEClass = createEClass(LITERAL_ELEMENT);
		createEAttribute(literalElementEClass, LITERAL_ELEMENT__CASE_SENSITIVE);

		classElementEClass = createEClass(CLASS_ELEMENT);
		createEAttribute(classElementEClass, CLASS_ELEMENT__SEMANTIC_CLASS);

		questionableEClass = createEClass(QUESTIONABLE);
		createEAttribute(questionableEClass, QUESTIONABLE__QUESTIONING);

		lexReplacementEClass = createEClass(LEX_REPLACEMENT);
		createEAttribute(lexReplacementEClass, LEX_REPLACEMENT__PART_OF_SPEECH);

		literalReplacementEClass = createEClass(LITERAL_REPLACEMENT);
		createEAttribute(literalReplacementEClass, LITERAL_REPLACEMENT__LITERAL);

		punctuationPartEClass = createEClass(PUNCTUATION_PART);
		createEAttribute(punctuationPartEClass, PUNCTUATION_PART__PUNCTUATION);

		punctuationReplacementEClass = createEClass(PUNCTUATION_REPLACEMENT);
		createEAttribute(punctuationReplacementEClass, PUNCTUATION_REPLACEMENT__PUNCTUATION);

		resourceReplacementEClass = createEClass(RESOURCE_REPLACEMENT);
		createEAttribute(resourceReplacementEClass, RESOURCE_REPLACEMENT__RESOURCE);

		questionReplacementEClass = createEClass(QUESTION_REPLACEMENT);
		createEAttribute(questionReplacementEClass, QUESTION_REPLACEMENT__QUESTION);

		adverbPartEClass = createEClass(ADVERB_PART);

		adjectivePartEClass = createEClass(ADJECTIVE_PART);

		partContainerEClass = createEClass(PART_CONTAINER);
		createEReference(partContainerEClass, PART_CONTAINER__PARTS);

		// Create enums
		partOfSpeechTypeEEnum = createEEnum(PART_OF_SPEECH_TYPE);
		punctuationEEnum = createEEnum(PUNCTUATION);
		questionEEnum = createEEnum(QUESTION);
		pronounPersonEEnum = createEEnum(PRONOUN_PERSON);
		pronounNumberEEnum = createEEnum(PRONOUN_NUMBER);
		pronounCaseEEnum = createEEnum(PRONOUN_CASE);

		// Create data types
		qNameEDataType = createEDataType(QNAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sentenceEClass.getESuperTypes().add(this.getPartContainer());
		nounPartEClass.getESuperTypes().add(this.getPartOfSpeech());
		pronounPartEClass.getESuperTypes().add(this.getPartOfSpeech());
		pronounPartEClass.getESuperTypes().add(this.getQuestionable());
		verbPartEClass.getESuperTypes().add(this.getPartOfSpeech());
		verbPartEClass.getESuperTypes().add(this.getPartContainer());
		prepositionPartEClass.getESuperTypes().add(this.getPartOfSpeech());
		conjunctionPartEClass.getESuperTypes().add(this.getPartOfSpeech());
		interjectionPartEClass.getESuperTypes().add(this.getPartOfSpeech());
		partOfSpeechElementEClass.getESuperTypes().add(this.getLexElement());
		resourceElementEClass.getESuperTypes().add(this.getLexElement());
		literalElementEClass.getESuperTypes().add(this.getLexElement());
		classElementEClass.getESuperTypes().add(this.getLexElement());
		literalReplacementEClass.getESuperTypes().add(this.getLexReplacement());
		punctuationPartEClass.getESuperTypes().add(this.getPartOfSpeech());
		punctuationReplacementEClass.getESuperTypes().add(this.getLexReplacement());
		resourceReplacementEClass.getESuperTypes().add(this.getLexReplacement());
		questionReplacementEClass.getESuperTypes().add(this.getLexReplacement());
		adverbPartEClass.getESuperTypes().add(this.getPartOfSpeech());
		adverbPartEClass.getESuperTypes().add(this.getQuestionable());
		adjectivePartEClass.getESuperTypes().add(this.getPartOfSpeech());
		adjectivePartEClass.getESuperTypes().add(this.getQuestionable());

		// Initialize classes, features, and operations; add parameters
		initEClass(sentenceEClass, Sentence.class, "Sentence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSentence_Literal(), ecorePackage.getEString(), "literal", null, 1, 1, Sentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partOfSpeechEClass, PartOfSpeech.class, "PartOfSpeech", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartOfSpeech_Literal(), ecorePackage.getEString(), "literal", null, 1, 1, PartOfSpeech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartOfSpeech_Resource(), this.getQName(), "resource", null, 0, 1, PartOfSpeech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nounPartEClass, NounPart.class, "NounPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pronounPartEClass, PronounPart.class, "PronounPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPronounPart_Person(), this.getPronounPerson(), "person", null, 0, 1, PronounPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPronounPart_Number(), this.getPronounNumber(), "number", null, 0, 1, PronounPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPronounPart_Case(), this.getPronounCase(), "case", null, 0, 1, PronounPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verbPartEClass, VerbPart.class, "VerbPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lexRuleEClass, LexRule.class, "LexRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLexRule_Patterns(), this.getLexElement(), null, "patterns", null, 0, -1, LexRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLexRule_Replacements(), this.getLexReplacement(), null, "replacements", null, 0, -1, LexRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prepositionPartEClass, PrepositionPart.class, "PrepositionPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conjunctionPartEClass, ConjunctionPart.class, "ConjunctionPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interjectionPartEClass, InterjectionPart.class, "InterjectionPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lexElementEClass, LexElement.class, "LexElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partOfSpeechElementEClass, PartOfSpeechElement.class, "PartOfSpeechElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartOfSpeechElement_PartOfSpeech(), this.getPartOfSpeechType(), "partOfSpeech", null, 1, 1, PartOfSpeechElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceElementEClass, ResourceElement.class, "ResourceElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceElement_SemanticClass(), this.getQName(), "semanticClass", null, 0, 1, ResourceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceElement_SemanticClassRef(), ecorePackage.getEString(), "semanticClassRef", null, 0, 1, ResourceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalElementEClass, LiteralElement.class, "LiteralElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralElement_CaseSensitive(), ecorePackage.getEBoolean(), "caseSensitive", "false", 0, 1, LiteralElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classElementEClass, ClassElement.class, "ClassElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassElement_SemanticClass(), this.getQName(), "semanticClass", null, 0, 1, ClassElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionableEClass, Questionable.class, "Questionable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestionable_Questioning(), ecorePackage.getEBoolean(), "questioning", "false", 1, 1, Questionable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lexReplacementEClass, LexReplacement.class, "LexReplacement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLexReplacement_PartOfSpeech(), this.getPartOfSpeechType(), "partOfSpeech", null, 0, 1, LexReplacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalReplacementEClass, LiteralReplacement.class, "LiteralReplacement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralReplacement_Literal(), ecorePackage.getEString(), "literal", null, 0, 1, LiteralReplacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(punctuationPartEClass, PunctuationPart.class, "PunctuationPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPunctuationPart_Punctuation(), this.getPunctuation(), "punctuation", null, 1, 1, PunctuationPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(punctuationReplacementEClass, PunctuationReplacement.class, "PunctuationReplacement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPunctuationReplacement_Punctuation(), this.getPunctuation(), "punctuation", null, 0, 1, PunctuationReplacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceReplacementEClass, ResourceReplacement.class, "ResourceReplacement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceReplacement_Resource(), this.getQName(), "resource", null, 0, 1, ResourceReplacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionReplacementEClass, QuestionReplacement.class, "QuestionReplacement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestionReplacement_Question(), this.getQuestion(), "question", null, 1, 1, QuestionReplacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adverbPartEClass, AdverbPart.class, "AdverbPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adjectivePartEClass, AdjectivePart.class, "AdjectivePart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partContainerEClass, PartContainer.class, "PartContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartContainer_Parts(), this.getPartOfSpeech(), null, "parts", null, 0, -1, PartContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(partOfSpeechTypeEEnum, PartOfSpeechType.class, "PartOfSpeechType");
		addEEnumLiteral(partOfSpeechTypeEEnum, PartOfSpeechType.UNKNOWN);
		addEEnumLiteral(partOfSpeechTypeEEnum, PartOfSpeechType.NOUN);
		addEEnumLiteral(partOfSpeechTypeEEnum, PartOfSpeechType.VERB);
		addEEnumLiteral(partOfSpeechTypeEEnum, PartOfSpeechType.PRONOUN);
		addEEnumLiteral(partOfSpeechTypeEEnum, PartOfSpeechType.PREPOSITION);
		addEEnumLiteral(partOfSpeechTypeEEnum, PartOfSpeechType.CONJUNCTION);
		addEEnumLiteral(partOfSpeechTypeEEnum, PartOfSpeechType.INTERJECTION);
		addEEnumLiteral(partOfSpeechTypeEEnum, PartOfSpeechType.QUESTION);

		initEEnum(punctuationEEnum, Punctuation.class, "Punctuation");
		addEEnumLiteral(punctuationEEnum, Punctuation.PERIOD);
		addEEnumLiteral(punctuationEEnum, Punctuation.EXCLAMATION);
		addEEnumLiteral(punctuationEEnum, Punctuation.QUESTION);

		initEEnum(questionEEnum, Question.class, "Question");
		addEEnumLiteral(questionEEnum, Question.WHAT);
		addEEnumLiteral(questionEEnum, Question.WHO);
		addEEnumLiteral(questionEEnum, Question.WHEN);
		addEEnumLiteral(questionEEnum, Question.WHERE);
		addEEnumLiteral(questionEEnum, Question.HOW);

		initEEnum(pronounPersonEEnum, PronounPerson.class, "PronounPerson");
		addEEnumLiteral(pronounPersonEEnum, PronounPerson.FIRST);
		addEEnumLiteral(pronounPersonEEnum, PronounPerson.SECOND);
		addEEnumLiteral(pronounPersonEEnum, PronounPerson.THIRD);

		initEEnum(pronounNumberEEnum, PronounNumber.class, "PronounNumber");
		addEEnumLiteral(pronounNumberEEnum, PronounNumber.SINGULAR);
		addEEnumLiteral(pronounNumberEEnum, PronounNumber.PLURAL);

		initEEnum(pronounCaseEEnum, PronounCase.class, "PronounCase");
		addEEnumLiteral(pronounCaseEEnum, PronounCase.SUBJECT);
		addEEnumLiteral(pronounCaseEEnum, PronounCase.OBJECT);

		// Initialize data types
		initEDataType(qNameEDataType, QName.class, "QName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";		
		addAnnotation
		  (getSentence_Literal(), 
		   source, 
		   new String[] {
			 "documentation", "Raw literal sentence without preprocessing."
		   });		
		addAnnotation
		  (getPartOfSpeech_Literal(), 
		   source, 
		   new String[] {
			 "documentation", "Literal part text without preprocessing."
		   });		
		addAnnotation
		  (getPartOfSpeech_Resource(), 
		   source, 
		   new String[] {
			 "documentation", "Semantic resource (if known)."
		   });		
		addAnnotation
		  (getLexRule_Patterns(), 
		   source, 
		   new String[] {
			 "documentation", "Patterns to match.\nEach pattern is usually separated by whitespace, but sometimes it\'s not necessary to distinguish, for example, in \"I love you.\" there is no separator between \"you\" and \".\"."
		   });		
		addAnnotation
		  (getLexRule_Replacements(), 
		   source, 
		   new String[] {
			 "documentation", "Replacements to be made when the patterns match.\nNote that LexRules can be repeated for multiple iterations."
		   });		
		addAnnotation
		  (conjunctionPartEClass, 
		   source, 
		   new String[] {
			 "documentation", "any syntactic connector (and)"
		   });		
		addAnnotation
		  (interjectionPartEClass, 
		   source, 
		   new String[] {
			 "documentation", "any emotional greeting (or \"exclamation\") (ow)"
		   });		
		addAnnotation
		  (resourceElementEClass, 
		   source, 
		   new String[] {
			 "documentation", "Refers to an RDF resource (e.g. {@code dbpedia:Elephant}) of a specific class (e.g. {@code dbpedia-owl:Animal})."
		   });		
		addAnnotation
		  (getResourceElement_SemanticClassRef(), 
		   source, 
		   new String[] {
			 "documentation", "Since semanticClass is hard to ser/deser as XMI, this is a convenience attribute."
		   });		
		addAnnotation
		  (classElementEClass, 
		   source, 
		   new String[] {
			 "documentation", "Refers to an RDF class itself (e.g. {@code dbpedia-owl:Animal})."
		   });		
		addAnnotation
		  (questionableEClass, 
		   source, 
		   new String[] {
			 "documentation", "Pronoun, adverb, or adjective, depending on how it is used. \n\n\"What is that?\" -- pronoun \n\"What does it matter?\" -- adverb \n\"What book did you read?\" -- adjective\n\nSource:\nhttp://www.merriam-webster.com/dictionary/what\n\nhttps://answers.yahoo.com/question/index?qid=20090106144231AApUFKo"
		   });		
		addAnnotation
		  (getQuestionable_Questioning(), 
		   source, 
		   new String[] {
			 "documentation", "Pronoun, adverb, or adjective, depending on how it is used. \n\n\"What is that?\" -- pronoun \n\"What does it matter?\" -- adverb \n\"What book did you read?\" -- adjective\n\nSource:\nhttp://www.merriam-webster.com/dictionary/what\n\nhttps://answers.yahoo.com/question/index?qid=20090106144231AApUFKo"
		   });		
		addAnnotation
		  (resourceReplacementEClass, 
		   source, 
		   new String[] {
			 "documentation", "Replaces with a semantic resource."
		   });		
		addAnnotation
		  (getResourceReplacement_Resource(), 
		   source, 
		   new String[] {
			 "documentation", "Semantic resource."
		   });
	}

} //RelexidPackageImpl
