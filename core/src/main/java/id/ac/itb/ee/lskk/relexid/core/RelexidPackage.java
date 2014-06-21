/**
 */
package id.ac.itb.ee.lskk.relexid.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidFactory
 * @model kind="package"
 * @generated
 */
public interface RelexidPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://relexid/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "relexid";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RelexidPackage eINSTANCE = id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl.init();

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.PartContainer <em>Part Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.PartContainer
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getPartContainer()
	 * @generated
	 */
	int PART_CONTAINER = 23;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_CONTAINER__PARTS = 0;

	/**
	 * The number of structural features of the '<em>Part Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Part Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.SentenceImpl <em>Sentence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.SentenceImpl
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getSentence()
	 * @generated
	 */
	int SENTENCE = 0;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__PARTS = PART_CONTAINER__PARTS;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__LITERAL = PART_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__RELATIONS = PART_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sentence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE_FEATURE_COUNT = PART_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE___GENERATE__LOCALE_MAP = PART_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sentence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE_OPERATION_COUNT = PART_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.PartOfSpeech <em>Part Of Speech</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.PartOfSpeech
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getPartOfSpeech()
	 * @generated
	 */
	int PART_OF_SPEECH = 1;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OF_SPEECH__LITERAL = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OF_SPEECH__RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Word</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OF_SPEECH__WORD = 2;

	/**
	 * The number of structural features of the '<em>Part Of Speech</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OF_SPEECH_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OF_SPEECH___GENERATE__LOCALE_MAP_TRANSLATOR = 0;

	/**
	 * The number of operations of the '<em>Part Of Speech</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OF_SPEECH_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.NounPartImpl <em>Noun Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.NounPartImpl
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getNounPart()
	 * @generated
	 */
	int NOUN_PART = 2;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN_PART__LITERAL = PART_OF_SPEECH__LITERAL;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN_PART__RESOURCE = PART_OF_SPEECH__RESOURCE;

	/**
	 * The feature id for the '<em><b>Word</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN_PART__WORD = PART_OF_SPEECH__WORD;

	/**
	 * The number of structural features of the '<em>Noun Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN_PART_FEATURE_COUNT = PART_OF_SPEECH_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN_PART___GENERATE__LOCALE_MAP_TRANSLATOR = PART_OF_SPEECH___GENERATE__LOCALE_MAP_TRANSLATOR;

	/**
	 * The number of operations of the '<em>Noun Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN_PART_OPERATION_COUNT = PART_OF_SPEECH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.PronounPartImpl <em>Pronoun Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.PronounPartImpl
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getPronounPart()
	 * @generated
	 */
	int PRONOUN_PART = 3;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRONOUN_PART__LITERAL = PART_OF_SPEECH__LITERAL;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRONOUN_PART__RESOURCE = PART_OF_SPEECH__RESOURCE;

	/**
	 * The feature id for the '<em><b>Word</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRONOUN_PART__WORD = PART_OF_SPEECH__WORD;

	/**
	 * The feature id for the '<em><b>Questioning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRONOUN_PART__QUESTIONING = PART_OF_SPEECH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRONOUN_PART__PERSON = PART_OF_SPEECH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRONOUN_PART__NUMBER = PART_OF_SPEECH_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRONOUN_PART__CASE = PART_OF_SPEECH_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Pronoun Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRONOUN_PART_FEATURE_COUNT = PART_OF_SPEECH_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRONOUN_PART___GENERATE__LOCALE_MAP_TRANSLATOR = PART_OF_SPEECH___GENERATE__LOCALE_MAP_TRANSLATOR;

	/**
	 * The number of operations of the '<em>Pronoun Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRONOUN_PART_OPERATION_COUNT = PART_OF_SPEECH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.VerbPartImpl <em>Verb Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.VerbPartImpl
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getVerbPart()
	 * @generated
	 */
	int VERB_PART = 4;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB_PART__LITERAL = PART_OF_SPEECH__LITERAL;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB_PART__RESOURCE = PART_OF_SPEECH__RESOURCE;

	/**
	 * The feature id for the '<em><b>Word</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB_PART__WORD = PART_OF_SPEECH__WORD;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB_PART__PARTS = PART_OF_SPEECH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Verb Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB_PART_FEATURE_COUNT = PART_OF_SPEECH_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB_PART___GENERATE__LOCALE_MAP_TRANSLATOR = PART_OF_SPEECH___GENERATE__LOCALE_MAP_TRANSLATOR;

	/**
	 * The number of operations of the '<em>Verb Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB_PART_OPERATION_COUNT = PART_OF_SPEECH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.ReplacementContainer <em>Replacement Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.ReplacementContainer
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getReplacementContainer()
	 * @generated
	 */
	int REPLACEMENT_CONTAINER = 29;

	/**
	 * The feature id for the '<em><b>Replacements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACEMENT_CONTAINER__REPLACEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Replacement Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACEMENT_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Replacement Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACEMENT_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.LexRuleImpl <em>Lex Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.LexRuleImpl
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getLexRule()
	 * @generated
	 */
	int LEX_RULE = 5;

	/**
	 * The feature id for the '<em><b>Replacements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEX_RULE__REPLACEMENTS = REPLACEMENT_CONTAINER__REPLACEMENTS;

	/**
	 * The feature id for the '<em><b>Matchers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEX_RULE__MATCHERS = REPLACEMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lex Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEX_RULE_FEATURE_COUNT = REPLACEMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Lex Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEX_RULE_OPERATION_COUNT = REPLACEMENT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.PrepositionPartImpl <em>Preposition Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.PrepositionPartImpl
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getPrepositionPart()
	 * @generated
	 */
	int PREPOSITION_PART = 6;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPOSITION_PART__LITERAL = PART_OF_SPEECH__LITERAL;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPOSITION_PART__RESOURCE = PART_OF_SPEECH__RESOURCE;

	/**
	 * The feature id for the '<em><b>Word</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPOSITION_PART__WORD = PART_OF_SPEECH__WORD;

	/**
	 * The number of structural features of the '<em>Preposition Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPOSITION_PART_FEATURE_COUNT = PART_OF_SPEECH_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPOSITION_PART___GENERATE__LOCALE_MAP_TRANSLATOR = PART_OF_SPEECH___GENERATE__LOCALE_MAP_TRANSLATOR;

	/**
	 * The number of operations of the '<em>Preposition Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPOSITION_PART_OPERATION_COUNT = PART_OF_SPEECH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.ConjunctionPartImpl <em>Conjunction Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.ConjunctionPartImpl
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getConjunctionPart()
	 * @generated
	 */
	int CONJUNCTION_PART = 7;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_PART__LITERAL = PART_OF_SPEECH__LITERAL;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_PART__RESOURCE = PART_OF_SPEECH__RESOURCE;

	/**
	 * The feature id for the '<em><b>Word</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_PART__WORD = PART_OF_SPEECH__WORD;

	/**
	 * The number of structural features of the '<em>Conjunction Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_PART_FEATURE_COUNT = PART_OF_SPEECH_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_PART___GENERATE__LOCALE_MAP_TRANSLATOR = PART_OF_SPEECH___GENERATE__LOCALE_MAP_TRANSLATOR;

	/**
	 * The number of operations of the '<em>Conjunction Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_PART_OPERATION_COUNT = PART_OF_SPEECH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.InterjectionPartImpl <em>Interjection Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.InterjectionPartImpl
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getInterjectionPart()
	 * @generated
	 */
	int INTERJECTION_PART = 8;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERJECTION_PART__LITERAL = PART_OF_SPEECH__LITERAL;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERJECTION_PART__RESOURCE = PART_OF_SPEECH__RESOURCE;

	/**
	 * The feature id for the '<em><b>Word</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERJECTION_PART__WORD = PART_OF_SPEECH__WORD;

	/**
	 * The number of structural features of the '<em>Interjection Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERJECTION_PART_FEATURE_COUNT = PART_OF_SPEECH_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERJECTION_PART___GENERATE__LOCALE_MAP_TRANSLATOR = PART_OF_SPEECH___GENERATE__LOCALE_MAP_TRANSLATOR;

	/**
	 * The number of operations of the '<em>Interjection Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERJECTION_PART_OPERATION_COUNT = PART_OF_SPEECH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.LexMatcher <em>Lex Matcher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.LexMatcher
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getLexMatcher()
	 * @generated
	 */
	int LEX_MATCHER = 9;

	/**
	 * The number of structural features of the '<em>Lex Matcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEX_MATCHER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Lex Matcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEX_MATCHER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.PartOfSpeechMatcherImpl <em>Part Of Speech Matcher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.PartOfSpeechMatcherImpl
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getPartOfSpeechMatcher()
	 * @generated
	 */
	int PART_OF_SPEECH_MATCHER = 10;

	/**
	 * The feature id for the '<em><b>Part Of Speech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OF_SPEECH_MATCHER__PART_OF_SPEECH = LEX_MATCHER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Part Of Speech Matcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OF_SPEECH_MATCHER_FEATURE_COUNT = LEX_MATCHER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Part Of Speech Matcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OF_SPEECH_MATCHER_OPERATION_COUNT = LEX_MATCHER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.TypedResourceMatcherImpl <em>Typed Resource Matcher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.TypedResourceMatcherImpl
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getTypedResourceMatcher()
	 * @generated
	 */
	int TYPED_RESOURCE_MATCHER = 11;

	/**
	 * The feature id for the '<em><b>Semantic Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_RESOURCE_MATCHER__SEMANTIC_CLASS = LEX_MATCHER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Resource Matcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_RESOURCE_MATCHER_FEATURE_COUNT = LEX_MATCHER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Typed Resource Matcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_RESOURCE_MATCHER_OPERATION_COUNT = LEX_MATCHER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.LiteralMatcherImpl <em>Literal Matcher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.LiteralMatcherImpl
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getLiteralMatcher()
	 * @generated
	 */
	int LITERAL_MATCHER = 12;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_MATCHER__LITERALS = LEX_MATCHER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Case Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_MATCHER__CASE_SENSITIVE = LEX_MATCHER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Literal Matcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_MATCHER_FEATURE_COUNT = LEX_MATCHER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Literal Matcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_MATCHER_OPERATION_COUNT = LEX_MATCHER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.ClassMatcherImpl <em>Class Matcher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.ClassMatcherImpl
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getClassMatcher()
	 * @generated
	 */
	int CLASS_MATCHER = 13;

	/**
	 * The feature id for the '<em><b>Semantic Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MATCHER__SEMANTIC_CLASS = LEX_MATCHER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Matcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MATCHER_FEATURE_COUNT = LEX_MATCHER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Class Matcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MATCHER_OPERATION_COUNT = LEX_MATCHER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.Questionable <em>Questionable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.Questionable
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getQuestionable()
	 * @generated
	 */
	int QUESTIONABLE = 14;

	/**
	 * The feature id for the '<em><b>Questioning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONABLE__QUESTIONING = 0;

	/**
	 * The number of structural features of the '<em>Questionable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Questionable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.LexReplacement <em>Lex Replacement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.LexReplacement
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getLexReplacement()
	 * @generated
	 */
	int LEX_REPLACEMENT = 15;

	/**
	 * The feature id for the '<em><b>Part Of Speech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEX_REPLACEMENT__PART_OF_SPEECH = 0;

	/**
	 * The number of structural features of the '<em>Lex Replacement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEX_REPLACEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Lex Replacement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEX_REPLACEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.LiteralReplacementImpl <em>Literal Replacement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.LiteralReplacementImpl
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getLiteralReplacement()
	 * @generated
	 */
	int LITERAL_REPLACEMENT = 16;

	/**
	 * The feature id for the '<em><b>Part Of Speech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REPLACEMENT__PART_OF_SPEECH = LEX_REPLACEMENT__PART_OF_SPEECH;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REPLACEMENT__LITERAL = LEX_REPLACEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Replacement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REPLACEMENT_FEATURE_COUNT = LEX_REPLACEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal Replacement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REPLACEMENT_OPERATION_COUNT = LEX_REPLACEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.PunctuationPartImpl <em>Punctuation Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.PunctuationPartImpl
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getPunctuationPart()
	 * @generated
	 */
	int PUNCTUATION_PART = 17;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNCTUATION_PART__LITERAL = PART_OF_SPEECH__LITERAL;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNCTUATION_PART__RESOURCE = PART_OF_SPEECH__RESOURCE;

	/**
	 * The feature id for the '<em><b>Word</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNCTUATION_PART__WORD = PART_OF_SPEECH__WORD;

	/**
	 * The feature id for the '<em><b>Punctuation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNCTUATION_PART__PUNCTUATION = PART_OF_SPEECH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Punctuation Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNCTUATION_PART_FEATURE_COUNT = PART_OF_SPEECH_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNCTUATION_PART___GENERATE__LOCALE_MAP_TRANSLATOR = PART_OF_SPEECH___GENERATE__LOCALE_MAP_TRANSLATOR;

	/**
	 * The number of operations of the '<em>Punctuation Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNCTUATION_PART_OPERATION_COUNT = PART_OF_SPEECH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.PunctuationReplacementImpl <em>Punctuation Replacement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.PunctuationReplacementImpl
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getPunctuationReplacement()
	 * @generated
	 */
	int PUNCTUATION_REPLACEMENT = 18;

	/**
	 * The feature id for the '<em><b>Part Of Speech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNCTUATION_REPLACEMENT__PART_OF_SPEECH = LEX_REPLACEMENT__PART_OF_SPEECH;

	/**
	 * The feature id for the '<em><b>Punctuation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNCTUATION_REPLACEMENT__PUNCTUATION = LEX_REPLACEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Punctuation Replacement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNCTUATION_REPLACEMENT_FEATURE_COUNT = LEX_REPLACEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Punctuation Replacement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNCTUATION_REPLACEMENT_OPERATION_COUNT = LEX_REPLACEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.ResourceReplacementImpl <em>Resource Replacement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.ResourceReplacementImpl
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getResourceReplacement()
	 * @generated
	 */
	int RESOURCE_REPLACEMENT = 19;

	/**
	 * The feature id for the '<em><b>Part Of Speech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REPLACEMENT__PART_OF_SPEECH = LEX_REPLACEMENT__PART_OF_SPEECH;

	/**
	 * The feature id for the '<em><b>Replacements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REPLACEMENT__REPLACEMENTS = LEX_REPLACEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REPLACEMENT__RESOURCE = LEX_REPLACEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capture Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REPLACEMENT__CAPTURE_GROUP = LEX_REPLACEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource Replacement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REPLACEMENT_FEATURE_COUNT = LEX_REPLACEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Resource Replacement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REPLACEMENT_OPERATION_COUNT = LEX_REPLACEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.QuestionReplacementImpl <em>Question Replacement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.QuestionReplacementImpl
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getQuestionReplacement()
	 * @generated
	 */
	int QUESTION_REPLACEMENT = 20;

	/**
	 * The feature id for the '<em><b>Part Of Speech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_REPLACEMENT__PART_OF_SPEECH = LEX_REPLACEMENT__PART_OF_SPEECH;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_REPLACEMENT__QUESTION = LEX_REPLACEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Question Replacement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_REPLACEMENT_FEATURE_COUNT = LEX_REPLACEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Question Replacement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_REPLACEMENT_OPERATION_COUNT = LEX_REPLACEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.AdverbPartImpl <em>Adverb Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.AdverbPartImpl
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getAdverbPart()
	 * @generated
	 */
	int ADVERB_PART = 21;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERB_PART__LITERAL = PART_OF_SPEECH__LITERAL;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERB_PART__RESOURCE = PART_OF_SPEECH__RESOURCE;

	/**
	 * The feature id for the '<em><b>Word</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERB_PART__WORD = PART_OF_SPEECH__WORD;

	/**
	 * The feature id for the '<em><b>Questioning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERB_PART__QUESTIONING = PART_OF_SPEECH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adverb Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERB_PART_FEATURE_COUNT = PART_OF_SPEECH_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERB_PART___GENERATE__LOCALE_MAP_TRANSLATOR = PART_OF_SPEECH___GENERATE__LOCALE_MAP_TRANSLATOR;

	/**
	 * The number of operations of the '<em>Adverb Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERB_PART_OPERATION_COUNT = PART_OF_SPEECH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.AdjectivePartImpl <em>Adjective Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.AdjectivePartImpl
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getAdjectivePart()
	 * @generated
	 */
	int ADJECTIVE_PART = 22;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJECTIVE_PART__LITERAL = PART_OF_SPEECH__LITERAL;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJECTIVE_PART__RESOURCE = PART_OF_SPEECH__RESOURCE;

	/**
	 * The feature id for the '<em><b>Word</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJECTIVE_PART__WORD = PART_OF_SPEECH__WORD;

	/**
	 * The feature id for the '<em><b>Questioning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJECTIVE_PART__QUESTIONING = PART_OF_SPEECH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adjective Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJECTIVE_PART_FEATURE_COUNT = PART_OF_SPEECH_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJECTIVE_PART___GENERATE__LOCALE_MAP_TRANSLATOR = PART_OF_SPEECH___GENERATE__LOCALE_MAP_TRANSLATOR;

	/**
	 * The number of operations of the '<em>Adjective Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJECTIVE_PART_OPERATION_COUNT = PART_OF_SPEECH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.GeneratedLiteralImpl <em>Generated Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.GeneratedLiteralImpl
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getGeneratedLiteral()
	 * @generated
	 */
	int GENERATED_LITERAL = 24;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_LITERAL__LITERAL = 0;

	/**
	 * The feature id for the '<em><b>Pre Separated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_LITERAL__PRE_SEPARATED = 1;

	/**
	 * The number of structural features of the '<em>Generated Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_LITERAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Generated Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_LITERAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.LexRulesImpl <em>Lex Rules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.LexRulesImpl
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getLexRules()
	 * @generated
	 */
	int LEX_RULES = 25;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEX_RULES__RULES = 0;

	/**
	 * The number of structural features of the '<em>Lex Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEX_RULES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Lex Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEX_RULES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.ResourceMatcherImpl <em>Resource Matcher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.ResourceMatcherImpl
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getResourceMatcher()
	 * @generated
	 */
	int RESOURCE_MATCHER = 26;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MATCHER__RESOURCE = LEX_MATCHER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Matcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MATCHER_FEATURE_COUNT = LEX_MATCHER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resource Matcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MATCHER_OPERATION_COUNT = LEX_MATCHER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.PronounReplacementImpl <em>Pronoun Replacement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.PronounReplacementImpl
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getPronounReplacement()
	 * @generated
	 */
	int PRONOUN_REPLACEMENT = 27;

	/**
	 * The feature id for the '<em><b>Part Of Speech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRONOUN_REPLACEMENT__PART_OF_SPEECH = LEX_REPLACEMENT__PART_OF_SPEECH;

	/**
	 * The feature id for the '<em><b>Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRONOUN_REPLACEMENT__PERSON = LEX_REPLACEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRONOUN_REPLACEMENT__NUMBER = LEX_REPLACEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRONOUN_REPLACEMENT__CASE = LEX_REPLACEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pronoun Replacement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRONOUN_REPLACEMENT_FEATURE_COUNT = LEX_REPLACEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pronoun Replacement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRONOUN_REPLACEMENT_OPERATION_COUNT = LEX_REPLACEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.UnrecognizedPartImpl <em>Unrecognized Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.UnrecognizedPartImpl
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getUnrecognizedPart()
	 * @generated
	 */
	int UNRECOGNIZED_PART = 28;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRECOGNIZED_PART__LITERAL = PART_OF_SPEECH__LITERAL;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRECOGNIZED_PART__RESOURCE = PART_OF_SPEECH__RESOURCE;

	/**
	 * The feature id for the '<em><b>Word</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRECOGNIZED_PART__WORD = PART_OF_SPEECH__WORD;

	/**
	 * The number of structural features of the '<em>Unrecognized Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRECOGNIZED_PART_FEATURE_COUNT = PART_OF_SPEECH_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRECOGNIZED_PART___GENERATE__LOCALE_MAP_TRANSLATOR = PART_OF_SPEECH___GENERATE__LOCALE_MAP_TRANSLATOR;

	/**
	 * The number of operations of the '<em>Unrecognized Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRECOGNIZED_PART_OPERATION_COUNT = PART_OF_SPEECH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.Relation <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.Relation
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 32;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.SubjectRelationImpl <em>Subject Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.SubjectRelationImpl
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getSubjectRelation()
	 * @generated
	 */
	int SUBJECT_RELATION = 30;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_RELATION__SUBJECT = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Verb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_RELATION__VERB = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Subject Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_RELATION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Subject Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_RELATION_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.ObjectRelationImpl <em>Object Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.ObjectRelationImpl
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getObjectRelation()
	 * @generated
	 */
	int OBJECT_RELATION = 31;

	/**
	 * The feature id for the '<em><b>Verb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_RELATION__VERB = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_RELATION__OBJECT = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_RELATION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Object Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_RELATION_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.RelationRuleImpl <em>Relation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelationRuleImpl
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getRelationRule()
	 * @generated
	 */
	int RELATION_RULE = 33;

	/**
	 * The feature id for the '<em><b>Matchers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_RULE__MATCHERS = 0;

	/**
	 * The feature id for the '<em><b>Relation Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_RULE__RELATION_DEFS = 1;

	/**
	 * The number of structural features of the '<em>Relation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Relation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.RelationRulesImpl <em>Relation Rules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelationRulesImpl
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getRelationRules()
	 * @generated
	 */
	int RELATION_RULES = 34;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_RULES__RULES = 0;

	/**
	 * The number of structural features of the '<em>Relation Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_RULES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Relation Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_RULES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.PartMatcher <em>Part Matcher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.PartMatcher
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getPartMatcher()
	 * @generated
	 */
	int PART_MATCHER = 36;

	/**
	 * The feature id for the '<em><b>Matchers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_MATCHER__MATCHERS = 0;

	/**
	 * The number of structural features of the '<em>Part Matcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_MATCHER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Part Matcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_MATCHER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.TypedPartMatcherImpl <em>Typed Part Matcher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.TypedPartMatcherImpl
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getTypedPartMatcher()
	 * @generated
	 */
	int TYPED_PART_MATCHER = 35;

	/**
	 * The feature id for the '<em><b>Matchers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PART_MATCHER__MATCHERS = PART_MATCHER__MATCHERS;

	/**
	 * The feature id for the '<em><b>Part Of Speech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PART_MATCHER__PART_OF_SPEECH = PART_MATCHER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Part Matcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PART_MATCHER_FEATURE_COUNT = PART_MATCHER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Typed Part Matcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PART_MATCHER_OPERATION_COUNT = PART_MATCHER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.RelationDef <em>Relation Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.RelationDef
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getRelationDef()
	 * @generated
	 */
	int RELATION_DEF = 38;

	/**
	 * The number of structural features of the '<em>Relation Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DEF_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Relation Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DEF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.SubjectRelationDefImpl <em>Subject Relation Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.SubjectRelationDefImpl
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getSubjectRelationDef()
	 * @generated
	 */
	int SUBJECT_RELATION_DEF = 37;

	/**
	 * The feature id for the '<em><b>Verb</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_RELATION_DEF__VERB = RELATION_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_RELATION_DEF__SUBJECT = RELATION_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Subject Relation Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_RELATION_DEF_FEATURE_COUNT = RELATION_DEF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Subject Relation Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_RELATION_DEF_OPERATION_COUNT = RELATION_DEF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.ObjectRelationDefImpl <em>Object Relation Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.ObjectRelationDefImpl
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getObjectRelationDef()
	 * @generated
	 */
	int OBJECT_RELATION_DEF = 39;

	/**
	 * The feature id for the '<em><b>Verb</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_RELATION_DEF__VERB = RELATION_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_RELATION_DEF__OBJECT = RELATION_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Relation Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_RELATION_DEF_FEATURE_COUNT = RELATION_DEF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Object Relation Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_RELATION_DEF_OPERATION_COUNT = RELATION_DEF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.PartOfSpeechType <em>Part Of Speech Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.PartOfSpeechType
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getPartOfSpeechType()
	 * @generated
	 */
	int PART_OF_SPEECH_TYPE = 40;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.Punctuation <em>Punctuation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.Punctuation
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getPunctuation()
	 * @generated
	 */
	int PUNCTUATION = 41;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.Question <em>Question</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.Question
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 42;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.PronounPerson <em>Pronoun Person</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.PronounPerson
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getPronounPerson()
	 * @generated
	 */
	int PRONOUN_PERSON = 43;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.PronounNumber <em>Pronoun Number</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.PronounNumber
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getPronounNumber()
	 * @generated
	 */
	int PRONOUN_NUMBER = 44;

	/**
	 * The meta object id for the '{@link id.ac.itb.ee.lskk.relexid.core.PronounCase <em>Pronoun Case</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.PronounCase
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getPronounCase()
	 * @generated
	 */
	int PRONOUN_CASE = 45;

	/**
	 * The meta object id for the '<em>QName</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.namespace.QName
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getQName()
	 * @generated
	 */
	int QNAME = 46;


	/**
	 * The meta object id for the '<em>Locale</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Locale
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getLocale()
	 * @generated
	 */
	int LOCALE = 47;


	/**
	 * The meta object id for the '<em>Translator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see id.ac.itb.ee.lskk.relexid.core.Translator
	 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getTranslator()
	 * @generated
	 */
	int TRANSLATOR = 48;


	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.Sentence <em>Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sentence</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.Sentence
	 * @generated
	 */
	EClass getSentence();

	/**
	 * Returns the meta object for the attribute '{@link id.ac.itb.ee.lskk.relexid.core.Sentence#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.Sentence#getLiteral()
	 * @see #getSentence()
	 * @generated
	 */
	EAttribute getSentence_Literal();

	/**
	 * Returns the meta object for the containment reference list '{@link id.ac.itb.ee.lskk.relexid.core.Sentence#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.Sentence#getRelations()
	 * @see #getSentence()
	 * @generated
	 */
	EReference getSentence_Relations();

	/**
	 * Returns the meta object for the '{@link id.ac.itb.ee.lskk.relexid.core.Sentence#generate(java.util.Locale, java.util.Map, id.ac.itb.ee.lskk.relexid.core.Translator) <em>Generate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate</em>' operation.
	 * @see id.ac.itb.ee.lskk.relexid.core.Sentence#generate(java.util.Locale, java.util.Map, id.ac.itb.ee.lskk.relexid.core.Translator)
	 * @generated
	 */
	EOperation getSentence__Generate__Locale_Map();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.PartOfSpeech <em>Part Of Speech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Of Speech</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.PartOfSpeech
	 * @generated
	 */
	EClass getPartOfSpeech();

	/**
	 * Returns the meta object for the attribute '{@link id.ac.itb.ee.lskk.relexid.core.PartOfSpeech#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.PartOfSpeech#getLiteral()
	 * @see #getPartOfSpeech()
	 * @generated
	 */
	EAttribute getPartOfSpeech_Literal();

	/**
	 * Returns the meta object for the attribute '{@link id.ac.itb.ee.lskk.relexid.core.PartOfSpeech#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.PartOfSpeech#getResource()
	 * @see #getPartOfSpeech()
	 * @generated
	 */
	EAttribute getPartOfSpeech_Resource();

	/**
	 * Returns the meta object for the attribute '{@link id.ac.itb.ee.lskk.relexid.core.PartOfSpeech#getWord <em>Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Word</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.PartOfSpeech#getWord()
	 * @see #getPartOfSpeech()
	 * @generated
	 */
	EAttribute getPartOfSpeech_Word();

	/**
	 * Returns the meta object for the '{@link id.ac.itb.ee.lskk.relexid.core.PartOfSpeech#generate(java.util.Locale, java.util.Map, id.ac.itb.ee.lskk.relexid.core.Translator) <em>Generate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate</em>' operation.
	 * @see id.ac.itb.ee.lskk.relexid.core.PartOfSpeech#generate(java.util.Locale, java.util.Map, id.ac.itb.ee.lskk.relexid.core.Translator)
	 * @generated
	 */
	EOperation getPartOfSpeech__Generate__Locale_Map_Translator();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.NounPart <em>Noun Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Noun Part</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.NounPart
	 * @generated
	 */
	EClass getNounPart();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.PronounPart <em>Pronoun Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pronoun Part</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.PronounPart
	 * @generated
	 */
	EClass getPronounPart();

	/**
	 * Returns the meta object for the attribute '{@link id.ac.itb.ee.lskk.relexid.core.PronounPart#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.PronounPart#getPerson()
	 * @see #getPronounPart()
	 * @generated
	 */
	EAttribute getPronounPart_Person();

	/**
	 * Returns the meta object for the attribute '{@link id.ac.itb.ee.lskk.relexid.core.PronounPart#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.PronounPart#getNumber()
	 * @see #getPronounPart()
	 * @generated
	 */
	EAttribute getPronounPart_Number();

	/**
	 * Returns the meta object for the attribute '{@link id.ac.itb.ee.lskk.relexid.core.PronounPart#getCase <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.PronounPart#getCase()
	 * @see #getPronounPart()
	 * @generated
	 */
	EAttribute getPronounPart_Case();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.VerbPart <em>Verb Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verb Part</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.VerbPart
	 * @generated
	 */
	EClass getVerbPart();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.LexRule <em>Lex Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lex Rule</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.LexRule
	 * @generated
	 */
	EClass getLexRule();

	/**
	 * Returns the meta object for the containment reference list '{@link id.ac.itb.ee.lskk.relexid.core.LexRule#getMatchers <em>Matchers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matchers</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.LexRule#getMatchers()
	 * @see #getLexRule()
	 * @generated
	 */
	EReference getLexRule_Matchers();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.PrepositionPart <em>Preposition Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preposition Part</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.PrepositionPart
	 * @generated
	 */
	EClass getPrepositionPart();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.ConjunctionPart <em>Conjunction Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conjunction Part</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.ConjunctionPart
	 * @generated
	 */
	EClass getConjunctionPart();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.InterjectionPart <em>Interjection Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interjection Part</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.InterjectionPart
	 * @generated
	 */
	EClass getInterjectionPart();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.LexMatcher <em>Lex Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lex Matcher</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.LexMatcher
	 * @generated
	 */
	EClass getLexMatcher();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.PartOfSpeechMatcher <em>Part Of Speech Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Of Speech Matcher</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.PartOfSpeechMatcher
	 * @generated
	 */
	EClass getPartOfSpeechMatcher();

	/**
	 * Returns the meta object for the attribute '{@link id.ac.itb.ee.lskk.relexid.core.PartOfSpeechMatcher#getPartOfSpeech <em>Part Of Speech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part Of Speech</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.PartOfSpeechMatcher#getPartOfSpeech()
	 * @see #getPartOfSpeechMatcher()
	 * @generated
	 */
	EAttribute getPartOfSpeechMatcher_PartOfSpeech();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.TypedResourceMatcher <em>Typed Resource Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Resource Matcher</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.TypedResourceMatcher
	 * @generated
	 */
	EClass getTypedResourceMatcher();

	/**
	 * Returns the meta object for the attribute '{@link id.ac.itb.ee.lskk.relexid.core.TypedResourceMatcher#getSemanticClass <em>Semantic Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantic Class</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.TypedResourceMatcher#getSemanticClass()
	 * @see #getTypedResourceMatcher()
	 * @generated
	 */
	EAttribute getTypedResourceMatcher_SemanticClass();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.LiteralMatcher <em>Literal Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Matcher</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.LiteralMatcher
	 * @generated
	 */
	EClass getLiteralMatcher();

	/**
	 * Returns the meta object for the attribute list '{@link id.ac.itb.ee.lskk.relexid.core.LiteralMatcher#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Literals</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.LiteralMatcher#getLiterals()
	 * @see #getLiteralMatcher()
	 * @generated
	 */
	EAttribute getLiteralMatcher_Literals();

	/**
	 * Returns the meta object for the attribute '{@link id.ac.itb.ee.lskk.relexid.core.LiteralMatcher#isCaseSensitive <em>Case Sensitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case Sensitive</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.LiteralMatcher#isCaseSensitive()
	 * @see #getLiteralMatcher()
	 * @generated
	 */
	EAttribute getLiteralMatcher_CaseSensitive();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.ClassMatcher <em>Class Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Matcher</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.ClassMatcher
	 * @generated
	 */
	EClass getClassMatcher();

	/**
	 * Returns the meta object for the attribute '{@link id.ac.itb.ee.lskk.relexid.core.ClassMatcher#getSemanticClass <em>Semantic Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantic Class</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.ClassMatcher#getSemanticClass()
	 * @see #getClassMatcher()
	 * @generated
	 */
	EAttribute getClassMatcher_SemanticClass();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.PronounReplacement <em>Pronoun Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pronoun Replacement</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.PronounReplacement
	 * @generated
	 */
	EClass getPronounReplacement();

	/**
	 * Returns the meta object for the attribute '{@link id.ac.itb.ee.lskk.relexid.core.PronounReplacement#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.PronounReplacement#getPerson()
	 * @see #getPronounReplacement()
	 * @generated
	 */
	EAttribute getPronounReplacement_Person();

	/**
	 * Returns the meta object for the attribute '{@link id.ac.itb.ee.lskk.relexid.core.PronounReplacement#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.PronounReplacement#getNumber()
	 * @see #getPronounReplacement()
	 * @generated
	 */
	EAttribute getPronounReplacement_Number();

	/**
	 * Returns the meta object for the attribute '{@link id.ac.itb.ee.lskk.relexid.core.PronounReplacement#getCase <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.PronounReplacement#getCase()
	 * @see #getPronounReplacement()
	 * @generated
	 */
	EAttribute getPronounReplacement_Case();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.UnrecognizedPart <em>Unrecognized Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unrecognized Part</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.UnrecognizedPart
	 * @generated
	 */
	EClass getUnrecognizedPart();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.ReplacementContainer <em>Replacement Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replacement Container</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.ReplacementContainer
	 * @generated
	 */
	EClass getReplacementContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link id.ac.itb.ee.lskk.relexid.core.ReplacementContainer#getReplacements <em>Replacements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Replacements</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.ReplacementContainer#getReplacements()
	 * @see #getReplacementContainer()
	 * @generated
	 */
	EReference getReplacementContainer_Replacements();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.SubjectRelation <em>Subject Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject Relation</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.SubjectRelation
	 * @generated
	 */
	EClass getSubjectRelation();

	/**
	 * Returns the meta object for the reference '{@link id.ac.itb.ee.lskk.relexid.core.SubjectRelation#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.SubjectRelation#getSubject()
	 * @see #getSubjectRelation()
	 * @generated
	 */
	EReference getSubjectRelation_Subject();

	/**
	 * Returns the meta object for the reference '{@link id.ac.itb.ee.lskk.relexid.core.SubjectRelation#getVerb <em>Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Verb</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.SubjectRelation#getVerb()
	 * @see #getSubjectRelation()
	 * @generated
	 */
	EReference getSubjectRelation_Verb();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.ObjectRelation <em>Object Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Relation</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.ObjectRelation
	 * @generated
	 */
	EClass getObjectRelation();

	/**
	 * Returns the meta object for the reference '{@link id.ac.itb.ee.lskk.relexid.core.ObjectRelation#getVerb <em>Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Verb</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.ObjectRelation#getVerb()
	 * @see #getObjectRelation()
	 * @generated
	 */
	EReference getObjectRelation_Verb();

	/**
	 * Returns the meta object for the reference '{@link id.ac.itb.ee.lskk.relexid.core.ObjectRelation#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.ObjectRelation#getObject()
	 * @see #getObjectRelation()
	 * @generated
	 */
	EReference getObjectRelation_Object();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.RelationRule <em>Relation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Rule</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.RelationRule
	 * @generated
	 */
	EClass getRelationRule();

	/**
	 * Returns the meta object for the containment reference list '{@link id.ac.itb.ee.lskk.relexid.core.RelationRule#getMatchers <em>Matchers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matchers</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.RelationRule#getMatchers()
	 * @see #getRelationRule()
	 * @generated
	 */
	EReference getRelationRule_Matchers();

	/**
	 * Returns the meta object for the containment reference list '{@link id.ac.itb.ee.lskk.relexid.core.RelationRule#getRelationDefs <em>Relation Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation Defs</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.RelationRule#getRelationDefs()
	 * @see #getRelationRule()
	 * @generated
	 */
	EReference getRelationRule_RelationDefs();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.RelationRules <em>Relation Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Rules</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.RelationRules
	 * @generated
	 */
	EClass getRelationRules();

	/**
	 * Returns the meta object for the containment reference list '{@link id.ac.itb.ee.lskk.relexid.core.RelationRules#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.RelationRules#getRules()
	 * @see #getRelationRules()
	 * @generated
	 */
	EReference getRelationRules_Rules();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.TypedPartMatcher <em>Typed Part Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Part Matcher</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.TypedPartMatcher
	 * @generated
	 */
	EClass getTypedPartMatcher();

	/**
	 * Returns the meta object for the attribute '{@link id.ac.itb.ee.lskk.relexid.core.TypedPartMatcher#getPartOfSpeech <em>Part Of Speech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part Of Speech</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.TypedPartMatcher#getPartOfSpeech()
	 * @see #getTypedPartMatcher()
	 * @generated
	 */
	EAttribute getTypedPartMatcher_PartOfSpeech();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.PartMatcher <em>Part Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Matcher</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.PartMatcher
	 * @generated
	 */
	EClass getPartMatcher();

	/**
	 * Returns the meta object for the containment reference list '{@link id.ac.itb.ee.lskk.relexid.core.PartMatcher#getMatchers <em>Matchers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matchers</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.PartMatcher#getMatchers()
	 * @see #getPartMatcher()
	 * @generated
	 */
	EReference getPartMatcher_Matchers();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.SubjectRelationDef <em>Subject Relation Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject Relation Def</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.SubjectRelationDef
	 * @generated
	 */
	EClass getSubjectRelationDef();

	/**
	 * Returns the meta object for the attribute list '{@link id.ac.itb.ee.lskk.relexid.core.SubjectRelationDef#getVerb <em>Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Verb</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.SubjectRelationDef#getVerb()
	 * @see #getSubjectRelationDef()
	 * @generated
	 */
	EAttribute getSubjectRelationDef_Verb();

	/**
	 * Returns the meta object for the attribute list '{@link id.ac.itb.ee.lskk.relexid.core.SubjectRelationDef#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Subject</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.SubjectRelationDef#getSubject()
	 * @see #getSubjectRelationDef()
	 * @generated
	 */
	EAttribute getSubjectRelationDef_Subject();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.RelationDef <em>Relation Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Def</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.RelationDef
	 * @generated
	 */
	EClass getRelationDef();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.ObjectRelationDef <em>Object Relation Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Relation Def</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.ObjectRelationDef
	 * @generated
	 */
	EClass getObjectRelationDef();

	/**
	 * Returns the meta object for the attribute list '{@link id.ac.itb.ee.lskk.relexid.core.ObjectRelationDef#getVerb <em>Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Verb</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.ObjectRelationDef#getVerb()
	 * @see #getObjectRelationDef()
	 * @generated
	 */
	EAttribute getObjectRelationDef_Verb();

	/**
	 * Returns the meta object for the attribute list '{@link id.ac.itb.ee.lskk.relexid.core.ObjectRelationDef#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Object</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.ObjectRelationDef#getObject()
	 * @see #getObjectRelationDef()
	 * @generated
	 */
	EAttribute getObjectRelationDef_Object();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.Questionable <em>Questionable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questionable</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.Questionable
	 * @generated
	 */
	EClass getQuestionable();

	/**
	 * Returns the meta object for the attribute '{@link id.ac.itb.ee.lskk.relexid.core.Questionable#isQuestioning <em>Questioning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Questioning</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.Questionable#isQuestioning()
	 * @see #getQuestionable()
	 * @generated
	 */
	EAttribute getQuestionable_Questioning();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.LexReplacement <em>Lex Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lex Replacement</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.LexReplacement
	 * @generated
	 */
	EClass getLexReplacement();

	/**
	 * Returns the meta object for the attribute '{@link id.ac.itb.ee.lskk.relexid.core.LexReplacement#getPartOfSpeech <em>Part Of Speech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part Of Speech</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.LexReplacement#getPartOfSpeech()
	 * @see #getLexReplacement()
	 * @generated
	 */
	EAttribute getLexReplacement_PartOfSpeech();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.LiteralReplacement <em>Literal Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Replacement</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.LiteralReplacement
	 * @generated
	 */
	EClass getLiteralReplacement();

	/**
	 * Returns the meta object for the attribute '{@link id.ac.itb.ee.lskk.relexid.core.LiteralReplacement#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.LiteralReplacement#getLiteral()
	 * @see #getLiteralReplacement()
	 * @generated
	 */
	EAttribute getLiteralReplacement_Literal();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.PunctuationPart <em>Punctuation Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Punctuation Part</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.PunctuationPart
	 * @generated
	 */
	EClass getPunctuationPart();

	/**
	 * Returns the meta object for the attribute '{@link id.ac.itb.ee.lskk.relexid.core.PunctuationPart#getPunctuation <em>Punctuation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Punctuation</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.PunctuationPart#getPunctuation()
	 * @see #getPunctuationPart()
	 * @generated
	 */
	EAttribute getPunctuationPart_Punctuation();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.PunctuationReplacement <em>Punctuation Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Punctuation Replacement</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.PunctuationReplacement
	 * @generated
	 */
	EClass getPunctuationReplacement();

	/**
	 * Returns the meta object for the attribute '{@link id.ac.itb.ee.lskk.relexid.core.PunctuationReplacement#getPunctuation <em>Punctuation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Punctuation</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.PunctuationReplacement#getPunctuation()
	 * @see #getPunctuationReplacement()
	 * @generated
	 */
	EAttribute getPunctuationReplacement_Punctuation();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.ResourceReplacement <em>Resource Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Replacement</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.ResourceReplacement
	 * @generated
	 */
	EClass getResourceReplacement();

	/**
	 * Returns the meta object for the attribute '{@link id.ac.itb.ee.lskk.relexid.core.ResourceReplacement#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.ResourceReplacement#getResource()
	 * @see #getResourceReplacement()
	 * @generated
	 */
	EAttribute getResourceReplacement_Resource();

	/**
	 * Returns the meta object for the attribute '{@link id.ac.itb.ee.lskk.relexid.core.ResourceReplacement#getCaptureGroup <em>Capture Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capture Group</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.ResourceReplacement#getCaptureGroup()
	 * @see #getResourceReplacement()
	 * @generated
	 */
	EAttribute getResourceReplacement_CaptureGroup();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.QuestionReplacement <em>Question Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Replacement</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.QuestionReplacement
	 * @generated
	 */
	EClass getQuestionReplacement();

	/**
	 * Returns the meta object for the attribute '{@link id.ac.itb.ee.lskk.relexid.core.QuestionReplacement#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.QuestionReplacement#getQuestion()
	 * @see #getQuestionReplacement()
	 * @generated
	 */
	EAttribute getQuestionReplacement_Question();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.AdverbPart <em>Adverb Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adverb Part</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.AdverbPart
	 * @generated
	 */
	EClass getAdverbPart();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.AdjectivePart <em>Adjective Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adjective Part</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.AdjectivePart
	 * @generated
	 */
	EClass getAdjectivePart();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.PartContainer <em>Part Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Container</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.PartContainer
	 * @generated
	 */
	EClass getPartContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link id.ac.itb.ee.lskk.relexid.core.PartContainer#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.PartContainer#getParts()
	 * @see #getPartContainer()
	 * @generated
	 */
	EReference getPartContainer_Parts();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.GeneratedLiteral <em>Generated Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generated Literal</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.GeneratedLiteral
	 * @generated
	 */
	EClass getGeneratedLiteral();

	/**
	 * Returns the meta object for the attribute '{@link id.ac.itb.ee.lskk.relexid.core.GeneratedLiteral#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.GeneratedLiteral#getLiteral()
	 * @see #getGeneratedLiteral()
	 * @generated
	 */
	EAttribute getGeneratedLiteral_Literal();

	/**
	 * Returns the meta object for the attribute '{@link id.ac.itb.ee.lskk.relexid.core.GeneratedLiteral#isPreSeparated <em>Pre Separated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pre Separated</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.GeneratedLiteral#isPreSeparated()
	 * @see #getGeneratedLiteral()
	 * @generated
	 */
	EAttribute getGeneratedLiteral_PreSeparated();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.LexRules <em>Lex Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lex Rules</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.LexRules
	 * @generated
	 */
	EClass getLexRules();

	/**
	 * Returns the meta object for the containment reference list '{@link id.ac.itb.ee.lskk.relexid.core.LexRules#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.LexRules#getRules()
	 * @see #getLexRules()
	 * @generated
	 */
	EReference getLexRules_Rules();

	/**
	 * Returns the meta object for class '{@link id.ac.itb.ee.lskk.relexid.core.ResourceMatcher <em>Resource Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Matcher</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.ResourceMatcher
	 * @generated
	 */
	EClass getResourceMatcher();

	/**
	 * Returns the meta object for the attribute '{@link id.ac.itb.ee.lskk.relexid.core.ResourceMatcher#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.ResourceMatcher#getResource()
	 * @see #getResourceMatcher()
	 * @generated
	 */
	EAttribute getResourceMatcher_Resource();

	/**
	 * Returns the meta object for enum '{@link id.ac.itb.ee.lskk.relexid.core.PartOfSpeechType <em>Part Of Speech Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Part Of Speech Type</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.PartOfSpeechType
	 * @generated
	 */
	EEnum getPartOfSpeechType();

	/**
	 * Returns the meta object for enum '{@link id.ac.itb.ee.lskk.relexid.core.Punctuation <em>Punctuation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Punctuation</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.Punctuation
	 * @generated
	 */
	EEnum getPunctuation();

	/**
	 * Returns the meta object for enum '{@link id.ac.itb.ee.lskk.relexid.core.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Question</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.Question
	 * @generated
	 */
	EEnum getQuestion();

	/**
	 * Returns the meta object for enum '{@link id.ac.itb.ee.lskk.relexid.core.PronounPerson <em>Pronoun Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pronoun Person</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.PronounPerson
	 * @generated
	 */
	EEnum getPronounPerson();

	/**
	 * Returns the meta object for enum '{@link id.ac.itb.ee.lskk.relexid.core.PronounNumber <em>Pronoun Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pronoun Number</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.PronounNumber
	 * @generated
	 */
	EEnum getPronounNumber();

	/**
	 * Returns the meta object for enum '{@link id.ac.itb.ee.lskk.relexid.core.PronounCase <em>Pronoun Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pronoun Case</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.PronounCase
	 * @generated
	 */
	EEnum getPronounCase();

	/**
	 * Returns the meta object for data type '{@link javax.xml.namespace.QName <em>QName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>QName</em>'.
	 * @see javax.xml.namespace.QName
	 * @model instanceClass="javax.xml.namespace.QName"
	 * @generated
	 */
	EDataType getQName();

	/**
	 * Returns the meta object for data type '{@link java.util.Locale <em>Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Locale</em>'.
	 * @see java.util.Locale
	 * @model instanceClass="java.util.Locale"
	 * @generated
	 */
	EDataType getLocale();

	/**
	 * Returns the meta object for data type '{@link id.ac.itb.ee.lskk.relexid.core.Translator <em>Translator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Translator</em>'.
	 * @see id.ac.itb.ee.lskk.relexid.core.Translator
	 * @model instanceClass="id.ac.itb.ee.lskk.relexid.core.Translator" serializeable="false"
	 * @generated
	 */
	EDataType getTranslator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RelexidFactory getRelexidFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.SentenceImpl <em>Sentence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.SentenceImpl
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getSentence()
		 * @generated
		 */
		EClass SENTENCE = eINSTANCE.getSentence();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENTENCE__LITERAL = eINSTANCE.getSentence_Literal();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENTENCE__RELATIONS = eINSTANCE.getSentence_Relations();

		/**
		 * The meta object literal for the '<em><b>Generate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENTENCE___GENERATE__LOCALE_MAP = eINSTANCE.getSentence__Generate__Locale_Map();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.PartOfSpeech <em>Part Of Speech</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.PartOfSpeech
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getPartOfSpeech()
		 * @generated
		 */
		EClass PART_OF_SPEECH = eINSTANCE.getPartOfSpeech();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_OF_SPEECH__LITERAL = eINSTANCE.getPartOfSpeech_Literal();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_OF_SPEECH__RESOURCE = eINSTANCE.getPartOfSpeech_Resource();

		/**
		 * The meta object literal for the '<em><b>Word</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_OF_SPEECH__WORD = eINSTANCE.getPartOfSpeech_Word();

		/**
		 * The meta object literal for the '<em><b>Generate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PART_OF_SPEECH___GENERATE__LOCALE_MAP_TRANSLATOR = eINSTANCE.getPartOfSpeech__Generate__Locale_Map_Translator();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.NounPartImpl <em>Noun Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.NounPartImpl
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getNounPart()
		 * @generated
		 */
		EClass NOUN_PART = eINSTANCE.getNounPart();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.PronounPartImpl <em>Pronoun Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.PronounPartImpl
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getPronounPart()
		 * @generated
		 */
		EClass PRONOUN_PART = eINSTANCE.getPronounPart();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRONOUN_PART__PERSON = eINSTANCE.getPronounPart_Person();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRONOUN_PART__NUMBER = eINSTANCE.getPronounPart_Number();

		/**
		 * The meta object literal for the '<em><b>Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRONOUN_PART__CASE = eINSTANCE.getPronounPart_Case();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.VerbPartImpl <em>Verb Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.VerbPartImpl
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getVerbPart()
		 * @generated
		 */
		EClass VERB_PART = eINSTANCE.getVerbPart();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.LexRuleImpl <em>Lex Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.LexRuleImpl
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getLexRule()
		 * @generated
		 */
		EClass LEX_RULE = eINSTANCE.getLexRule();

		/**
		 * The meta object literal for the '<em><b>Matchers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEX_RULE__MATCHERS = eINSTANCE.getLexRule_Matchers();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.PrepositionPartImpl <em>Preposition Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.PrepositionPartImpl
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getPrepositionPart()
		 * @generated
		 */
		EClass PREPOSITION_PART = eINSTANCE.getPrepositionPart();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.ConjunctionPartImpl <em>Conjunction Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.ConjunctionPartImpl
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getConjunctionPart()
		 * @generated
		 */
		EClass CONJUNCTION_PART = eINSTANCE.getConjunctionPart();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.InterjectionPartImpl <em>Interjection Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.InterjectionPartImpl
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getInterjectionPart()
		 * @generated
		 */
		EClass INTERJECTION_PART = eINSTANCE.getInterjectionPart();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.LexMatcher <em>Lex Matcher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.LexMatcher
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getLexMatcher()
		 * @generated
		 */
		EClass LEX_MATCHER = eINSTANCE.getLexMatcher();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.PartOfSpeechMatcherImpl <em>Part Of Speech Matcher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.PartOfSpeechMatcherImpl
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getPartOfSpeechMatcher()
		 * @generated
		 */
		EClass PART_OF_SPEECH_MATCHER = eINSTANCE.getPartOfSpeechMatcher();

		/**
		 * The meta object literal for the '<em><b>Part Of Speech</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_OF_SPEECH_MATCHER__PART_OF_SPEECH = eINSTANCE.getPartOfSpeechMatcher_PartOfSpeech();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.TypedResourceMatcherImpl <em>Typed Resource Matcher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.TypedResourceMatcherImpl
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getTypedResourceMatcher()
		 * @generated
		 */
		EClass TYPED_RESOURCE_MATCHER = eINSTANCE.getTypedResourceMatcher();

		/**
		 * The meta object literal for the '<em><b>Semantic Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_RESOURCE_MATCHER__SEMANTIC_CLASS = eINSTANCE.getTypedResourceMatcher_SemanticClass();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.LiteralMatcherImpl <em>Literal Matcher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.LiteralMatcherImpl
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getLiteralMatcher()
		 * @generated
		 */
		EClass LITERAL_MATCHER = eINSTANCE.getLiteralMatcher();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_MATCHER__LITERALS = eINSTANCE.getLiteralMatcher_Literals();

		/**
		 * The meta object literal for the '<em><b>Case Sensitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_MATCHER__CASE_SENSITIVE = eINSTANCE.getLiteralMatcher_CaseSensitive();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.ClassMatcherImpl <em>Class Matcher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.ClassMatcherImpl
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getClassMatcher()
		 * @generated
		 */
		EClass CLASS_MATCHER = eINSTANCE.getClassMatcher();

		/**
		 * The meta object literal for the '<em><b>Semantic Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_MATCHER__SEMANTIC_CLASS = eINSTANCE.getClassMatcher_SemanticClass();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.PronounReplacementImpl <em>Pronoun Replacement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.PronounReplacementImpl
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getPronounReplacement()
		 * @generated
		 */
		EClass PRONOUN_REPLACEMENT = eINSTANCE.getPronounReplacement();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRONOUN_REPLACEMENT__PERSON = eINSTANCE.getPronounReplacement_Person();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRONOUN_REPLACEMENT__NUMBER = eINSTANCE.getPronounReplacement_Number();

		/**
		 * The meta object literal for the '<em><b>Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRONOUN_REPLACEMENT__CASE = eINSTANCE.getPronounReplacement_Case();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.UnrecognizedPartImpl <em>Unrecognized Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.UnrecognizedPartImpl
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getUnrecognizedPart()
		 * @generated
		 */
		EClass UNRECOGNIZED_PART = eINSTANCE.getUnrecognizedPart();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.ReplacementContainer <em>Replacement Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.ReplacementContainer
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getReplacementContainer()
		 * @generated
		 */
		EClass REPLACEMENT_CONTAINER = eINSTANCE.getReplacementContainer();

		/**
		 * The meta object literal for the '<em><b>Replacements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLACEMENT_CONTAINER__REPLACEMENTS = eINSTANCE.getReplacementContainer_Replacements();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.SubjectRelationImpl <em>Subject Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.SubjectRelationImpl
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getSubjectRelation()
		 * @generated
		 */
		EClass SUBJECT_RELATION = eINSTANCE.getSubjectRelation();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBJECT_RELATION__SUBJECT = eINSTANCE.getSubjectRelation_Subject();

		/**
		 * The meta object literal for the '<em><b>Verb</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBJECT_RELATION__VERB = eINSTANCE.getSubjectRelation_Verb();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.ObjectRelationImpl <em>Object Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.ObjectRelationImpl
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getObjectRelation()
		 * @generated
		 */
		EClass OBJECT_RELATION = eINSTANCE.getObjectRelation();

		/**
		 * The meta object literal for the '<em><b>Verb</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_RELATION__VERB = eINSTANCE.getObjectRelation_Verb();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_RELATION__OBJECT = eINSTANCE.getObjectRelation_Object();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.Relation <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.Relation
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.RelationRuleImpl <em>Relation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelationRuleImpl
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getRelationRule()
		 * @generated
		 */
		EClass RELATION_RULE = eINSTANCE.getRelationRule();

		/**
		 * The meta object literal for the '<em><b>Matchers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_RULE__MATCHERS = eINSTANCE.getRelationRule_Matchers();

		/**
		 * The meta object literal for the '<em><b>Relation Defs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_RULE__RELATION_DEFS = eINSTANCE.getRelationRule_RelationDefs();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.RelationRulesImpl <em>Relation Rules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelationRulesImpl
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getRelationRules()
		 * @generated
		 */
		EClass RELATION_RULES = eINSTANCE.getRelationRules();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_RULES__RULES = eINSTANCE.getRelationRules_Rules();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.TypedPartMatcherImpl <em>Typed Part Matcher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.TypedPartMatcherImpl
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getTypedPartMatcher()
		 * @generated
		 */
		EClass TYPED_PART_MATCHER = eINSTANCE.getTypedPartMatcher();

		/**
		 * The meta object literal for the '<em><b>Part Of Speech</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_PART_MATCHER__PART_OF_SPEECH = eINSTANCE.getTypedPartMatcher_PartOfSpeech();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.PartMatcher <em>Part Matcher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.PartMatcher
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getPartMatcher()
		 * @generated
		 */
		EClass PART_MATCHER = eINSTANCE.getPartMatcher();

		/**
		 * The meta object literal for the '<em><b>Matchers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART_MATCHER__MATCHERS = eINSTANCE.getPartMatcher_Matchers();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.SubjectRelationDefImpl <em>Subject Relation Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.SubjectRelationDefImpl
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getSubjectRelationDef()
		 * @generated
		 */
		EClass SUBJECT_RELATION_DEF = eINSTANCE.getSubjectRelationDef();

		/**
		 * The meta object literal for the '<em><b>Verb</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBJECT_RELATION_DEF__VERB = eINSTANCE.getSubjectRelationDef_Verb();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBJECT_RELATION_DEF__SUBJECT = eINSTANCE.getSubjectRelationDef_Subject();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.RelationDef <em>Relation Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.RelationDef
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getRelationDef()
		 * @generated
		 */
		EClass RELATION_DEF = eINSTANCE.getRelationDef();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.ObjectRelationDefImpl <em>Object Relation Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.ObjectRelationDefImpl
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getObjectRelationDef()
		 * @generated
		 */
		EClass OBJECT_RELATION_DEF = eINSTANCE.getObjectRelationDef();

		/**
		 * The meta object literal for the '<em><b>Verb</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_RELATION_DEF__VERB = eINSTANCE.getObjectRelationDef_Verb();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_RELATION_DEF__OBJECT = eINSTANCE.getObjectRelationDef_Object();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.Questionable <em>Questionable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.Questionable
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getQuestionable()
		 * @generated
		 */
		EClass QUESTIONABLE = eINSTANCE.getQuestionable();

		/**
		 * The meta object literal for the '<em><b>Questioning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONABLE__QUESTIONING = eINSTANCE.getQuestionable_Questioning();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.LexReplacement <em>Lex Replacement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.LexReplacement
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getLexReplacement()
		 * @generated
		 */
		EClass LEX_REPLACEMENT = eINSTANCE.getLexReplacement();

		/**
		 * The meta object literal for the '<em><b>Part Of Speech</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEX_REPLACEMENT__PART_OF_SPEECH = eINSTANCE.getLexReplacement_PartOfSpeech();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.LiteralReplacementImpl <em>Literal Replacement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.LiteralReplacementImpl
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getLiteralReplacement()
		 * @generated
		 */
		EClass LITERAL_REPLACEMENT = eINSTANCE.getLiteralReplacement();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_REPLACEMENT__LITERAL = eINSTANCE.getLiteralReplacement_Literal();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.PunctuationPartImpl <em>Punctuation Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.PunctuationPartImpl
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getPunctuationPart()
		 * @generated
		 */
		EClass PUNCTUATION_PART = eINSTANCE.getPunctuationPart();

		/**
		 * The meta object literal for the '<em><b>Punctuation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUNCTUATION_PART__PUNCTUATION = eINSTANCE.getPunctuationPart_Punctuation();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.PunctuationReplacementImpl <em>Punctuation Replacement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.PunctuationReplacementImpl
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getPunctuationReplacement()
		 * @generated
		 */
		EClass PUNCTUATION_REPLACEMENT = eINSTANCE.getPunctuationReplacement();

		/**
		 * The meta object literal for the '<em><b>Punctuation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUNCTUATION_REPLACEMENT__PUNCTUATION = eINSTANCE.getPunctuationReplacement_Punctuation();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.ResourceReplacementImpl <em>Resource Replacement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.ResourceReplacementImpl
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getResourceReplacement()
		 * @generated
		 */
		EClass RESOURCE_REPLACEMENT = eINSTANCE.getResourceReplacement();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_REPLACEMENT__RESOURCE = eINSTANCE.getResourceReplacement_Resource();

		/**
		 * The meta object literal for the '<em><b>Capture Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_REPLACEMENT__CAPTURE_GROUP = eINSTANCE.getResourceReplacement_CaptureGroup();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.QuestionReplacementImpl <em>Question Replacement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.QuestionReplacementImpl
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getQuestionReplacement()
		 * @generated
		 */
		EClass QUESTION_REPLACEMENT = eINSTANCE.getQuestionReplacement();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION_REPLACEMENT__QUESTION = eINSTANCE.getQuestionReplacement_Question();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.AdverbPartImpl <em>Adverb Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.AdverbPartImpl
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getAdverbPart()
		 * @generated
		 */
		EClass ADVERB_PART = eINSTANCE.getAdverbPart();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.AdjectivePartImpl <em>Adjective Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.AdjectivePartImpl
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getAdjectivePart()
		 * @generated
		 */
		EClass ADJECTIVE_PART = eINSTANCE.getAdjectivePart();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.PartContainer <em>Part Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.PartContainer
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getPartContainer()
		 * @generated
		 */
		EClass PART_CONTAINER = eINSTANCE.getPartContainer();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART_CONTAINER__PARTS = eINSTANCE.getPartContainer_Parts();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.GeneratedLiteralImpl <em>Generated Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.GeneratedLiteralImpl
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getGeneratedLiteral()
		 * @generated
		 */
		EClass GENERATED_LITERAL = eINSTANCE.getGeneratedLiteral();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATED_LITERAL__LITERAL = eINSTANCE.getGeneratedLiteral_Literal();

		/**
		 * The meta object literal for the '<em><b>Pre Separated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATED_LITERAL__PRE_SEPARATED = eINSTANCE.getGeneratedLiteral_PreSeparated();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.LexRulesImpl <em>Lex Rules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.LexRulesImpl
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getLexRules()
		 * @generated
		 */
		EClass LEX_RULES = eINSTANCE.getLexRules();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEX_RULES__RULES = eINSTANCE.getLexRules_Rules();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.impl.ResourceMatcherImpl <em>Resource Matcher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.ResourceMatcherImpl
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getResourceMatcher()
		 * @generated
		 */
		EClass RESOURCE_MATCHER = eINSTANCE.getResourceMatcher();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_MATCHER__RESOURCE = eINSTANCE.getResourceMatcher_Resource();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.PartOfSpeechType <em>Part Of Speech Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.PartOfSpeechType
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getPartOfSpeechType()
		 * @generated
		 */
		EEnum PART_OF_SPEECH_TYPE = eINSTANCE.getPartOfSpeechType();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.Punctuation <em>Punctuation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.Punctuation
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getPunctuation()
		 * @generated
		 */
		EEnum PUNCTUATION = eINSTANCE.getPunctuation();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.Question <em>Question</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.Question
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getQuestion()
		 * @generated
		 */
		EEnum QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.PronounPerson <em>Pronoun Person</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.PronounPerson
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getPronounPerson()
		 * @generated
		 */
		EEnum PRONOUN_PERSON = eINSTANCE.getPronounPerson();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.PronounNumber <em>Pronoun Number</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.PronounNumber
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getPronounNumber()
		 * @generated
		 */
		EEnum PRONOUN_NUMBER = eINSTANCE.getPronounNumber();

		/**
		 * The meta object literal for the '{@link id.ac.itb.ee.lskk.relexid.core.PronounCase <em>Pronoun Case</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.PronounCase
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getPronounCase()
		 * @generated
		 */
		EEnum PRONOUN_CASE = eINSTANCE.getPronounCase();

		/**
		 * The meta object literal for the '<em>QName</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.namespace.QName
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getQName()
		 * @generated
		 */
		EDataType QNAME = eINSTANCE.getQName();

		/**
		 * The meta object literal for the '<em>Locale</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Locale
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getLocale()
		 * @generated
		 */
		EDataType LOCALE = eINSTANCE.getLocale();

		/**
		 * The meta object literal for the '<em>Translator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see id.ac.itb.ee.lskk.relexid.core.Translator
		 * @see id.ac.itb.ee.lskk.relexid.core.impl.RelexidPackageImpl#getTranslator()
		 * @generated
		 */
		EDataType TRANSLATOR = eINSTANCE.getTranslator();

	}

} //RelexidPackage
