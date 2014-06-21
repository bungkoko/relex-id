/**
 */
package id.ac.itb.ee.lskk.relexid.core.impl;

import id.ac.itb.ee.lskk.relexid.core.AdjectivePart;
import id.ac.itb.ee.lskk.relexid.core.AdjectiveSatellitePart;
import id.ac.itb.ee.lskk.relexid.core.AdverbPart;
import id.ac.itb.ee.lskk.relexid.core.ClassMatcher;
import id.ac.itb.ee.lskk.relexid.core.ConjunctionPart;
import id.ac.itb.ee.lskk.relexid.core.GeneratedLiteral;
import id.ac.itb.ee.lskk.relexid.core.InterjectionPart;
import id.ac.itb.ee.lskk.relexid.core.LabelProvider;
import id.ac.itb.ee.lskk.relexid.core.LexMatcher;
import id.ac.itb.ee.lskk.relexid.core.LexReplacement;
import id.ac.itb.ee.lskk.relexid.core.LexRule;
import id.ac.itb.ee.lskk.relexid.core.LexRules;
import id.ac.itb.ee.lskk.relexid.core.LiteralMatcher;
import id.ac.itb.ee.lskk.relexid.core.LiteralReplacement;
import id.ac.itb.ee.lskk.relexid.core.NounPart;
import id.ac.itb.ee.lskk.relexid.core.ObjectRelation;
import id.ac.itb.ee.lskk.relexid.core.ObjectRelationDef;
import id.ac.itb.ee.lskk.relexid.core.PartContainer;
import id.ac.itb.ee.lskk.relexid.core.PartMatcher;
import id.ac.itb.ee.lskk.relexid.core.PartOfSpeech;
import id.ac.itb.ee.lskk.relexid.core.PartOfSpeechMatcher;
import id.ac.itb.ee.lskk.relexid.core.PartOfSpeechType;
import id.ac.itb.ee.lskk.relexid.core.PrepositionPart;
import id.ac.itb.ee.lskk.relexid.core.PronounCase;
import id.ac.itb.ee.lskk.relexid.core.PronounNumber;
import id.ac.itb.ee.lskk.relexid.core.PronounPart;
import id.ac.itb.ee.lskk.relexid.core.PronounPerson;
import id.ac.itb.ee.lskk.relexid.core.PronounReplacement;
import id.ac.itb.ee.lskk.relexid.core.Punctuation;
import id.ac.itb.ee.lskk.relexid.core.PunctuationPart;
import id.ac.itb.ee.lskk.relexid.core.PunctuationReplacement;
import id.ac.itb.ee.lskk.relexid.core.Question;
import id.ac.itb.ee.lskk.relexid.core.QuestionReplacement;
import id.ac.itb.ee.lskk.relexid.core.Questionable;
import id.ac.itb.ee.lskk.relexid.core.Relation;
import id.ac.itb.ee.lskk.relexid.core.RelationDef;
import id.ac.itb.ee.lskk.relexid.core.RelationRule;
import id.ac.itb.ee.lskk.relexid.core.RelationRules;
import id.ac.itb.ee.lskk.relexid.core.RelexidFactory;
import id.ac.itb.ee.lskk.relexid.core.RelexidPackage;
import id.ac.itb.ee.lskk.relexid.core.ReplacementContainer;
import id.ac.itb.ee.lskk.relexid.core.ResourceMatcher;
import id.ac.itb.ee.lskk.relexid.core.ResourceReplacement;
import id.ac.itb.ee.lskk.relexid.core.Sentence;
import id.ac.itb.ee.lskk.relexid.core.SubjectRelation;
import id.ac.itb.ee.lskk.relexid.core.SubjectRelationDef;
import id.ac.itb.ee.lskk.relexid.core.Translator;
import id.ac.itb.ee.lskk.relexid.core.TypedPartMatcher;
import id.ac.itb.ee.lskk.relexid.core.TypedResourceMatcher;
import id.ac.itb.ee.lskk.relexid.core.UnrecognizedPart;
import id.ac.itb.ee.lskk.relexid.core.VerbPart;

import java.util.Locale;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
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
	private EClass lexMatcherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partOfSpeechMatcherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedResourceMatcherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalMatcherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classMatcherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pronounReplacementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unrecognizedPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replacementContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationRulesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedPartMatcherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partMatcherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectRelationDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectRelationDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adjectiveSatellitePartEClass = null;

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
	private EClass generatedLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lexRulesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceMatcherEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType localeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType translatorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType labelProviderEDataType = null;

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
	@Override
	public EClass getSentence() {
		return sentenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSentence_Literal() {
		return (EAttribute)sentenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSentence_Relations() {
		return (EReference)sentenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSentence__Generate__Locale_Map_Translator() {
		return sentenceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartOfSpeech() {
		return partOfSpeechEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartOfSpeech_Literal() {
		return (EAttribute)partOfSpeechEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartOfSpeech_Resource() {
		return (EAttribute)partOfSpeechEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartOfSpeech_Word() {
		return (EAttribute)partOfSpeechEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartOfSpeech_Name() {
		return (EAttribute)partOfSpeechEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPartOfSpeech__Generate__Locale_Map_Translator() {
		return partOfSpeechEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNounPart() {
		return nounPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPronounPart() {
		return pronounPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPronounPart_Person() {
		return (EAttribute)pronounPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPronounPart_Number() {
		return (EAttribute)pronounPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPronounPart_Case() {
		return (EAttribute)pronounPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerbPart() {
		return verbPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLexRule() {
		return lexRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLexRule_Matchers() {
		return (EReference)lexRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrepositionPart() {
		return prepositionPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConjunctionPart() {
		return conjunctionPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterjectionPart() {
		return interjectionPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLexMatcher() {
		return lexMatcherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartOfSpeechMatcher() {
		return partOfSpeechMatcherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartOfSpeechMatcher_PartOfSpeech() {
		return (EAttribute)partOfSpeechMatcherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypedResourceMatcher() {
		return typedResourceMatcherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypedResourceMatcher_SemanticClass() {
		return (EAttribute)typedResourceMatcherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteralMatcher() {
		return literalMatcherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteralMatcher_Literals() {
		return (EAttribute)literalMatcherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteralMatcher_CaseSensitive() {
		return (EAttribute)literalMatcherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassMatcher() {
		return classMatcherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClassMatcher_SemanticClass() {
		return (EAttribute)classMatcherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPronounReplacement() {
		return pronounReplacementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPronounReplacement_Person() {
		return (EAttribute)pronounReplacementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPronounReplacement_Number() {
		return (EAttribute)pronounReplacementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPronounReplacement_Case() {
		return (EAttribute)pronounReplacementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnrecognizedPart() {
		return unrecognizedPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReplacementContainer() {
		return replacementContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReplacementContainer_Replacements() {
		return (EReference)replacementContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubjectRelation() {
		return subjectRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubjectRelation_Subject() {
		return (EReference)subjectRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubjectRelation_Verb() {
		return (EReference)subjectRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectRelation() {
		return objectRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjectRelation_Verb() {
		return (EReference)objectRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjectRelation_Object() {
		return (EReference)objectRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationRule() {
		return relationRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationRule_Matchers() {
		return (EReference)relationRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationRule_RelationDefs() {
		return (EReference)relationRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationRules() {
		return relationRulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationRules_Rules() {
		return (EReference)relationRulesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypedPartMatcher() {
		return typedPartMatcherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypedPartMatcher_PartOfSpeech() {
		return (EAttribute)typedPartMatcherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartMatcher() {
		return partMatcherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartMatcher_Matchers() {
		return (EReference)partMatcherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubjectRelationDef() {
		return subjectRelationDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubjectRelationDef_Verb() {
		return (EAttribute)subjectRelationDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubjectRelationDef_Subject() {
		return (EAttribute)subjectRelationDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationDef() {
		return relationDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectRelationDef() {
		return objectRelationDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectRelationDef_Verb() {
		return (EAttribute)objectRelationDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectRelationDef_Object() {
		return (EAttribute)objectRelationDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdjectiveSatellitePart() {
		return adjectiveSatellitePartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuestionable() {
		return questionableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestionable_Questioning() {
		return (EAttribute)questionableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLexReplacement() {
		return lexReplacementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLexReplacement_PartOfSpeech() {
		return (EAttribute)lexReplacementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteralReplacement() {
		return literalReplacementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteralReplacement_Literal() {
		return (EAttribute)literalReplacementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPunctuationPart() {
		return punctuationPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPunctuationPart_Punctuation() {
		return (EAttribute)punctuationPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPunctuationReplacement() {
		return punctuationReplacementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPunctuationReplacement_Punctuation() {
		return (EAttribute)punctuationReplacementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceReplacement() {
		return resourceReplacementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceReplacement_Resource() {
		return (EAttribute)resourceReplacementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceReplacement_CaptureGroup() {
		return (EAttribute)resourceReplacementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuestionReplacement() {
		return questionReplacementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestionReplacement_Question() {
		return (EAttribute)questionReplacementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdverbPart() {
		return adverbPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdjectivePart() {
		return adjectivePartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartContainer() {
		return partContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartContainer_Parts() {
		return (EReference)partContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeneratedLiteral() {
		return generatedLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeneratedLiteral_Literal() {
		return (EAttribute)generatedLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeneratedLiteral_PreSeparated() {
		return (EAttribute)generatedLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLexRules() {
		return lexRulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLexRules_Rules() {
		return (EReference)lexRulesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceMatcher() {
		return resourceMatcherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceMatcher_Resource() {
		return (EAttribute)resourceMatcherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPartOfSpeechType() {
		return partOfSpeechTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPunctuation() {
		return punctuationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getQuestion() {
		return questionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPronounPerson() {
		return pronounPersonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPronounNumber() {
		return pronounNumberEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPronounCase() {
		return pronounCaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getQName() {
		return qNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLocale() {
		return localeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTranslator() {
		return translatorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLabelProvider() {
		return labelProviderEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
		createEReference(sentenceEClass, SENTENCE__RELATIONS);
		createEOperation(sentenceEClass, SENTENCE___GENERATE__LOCALE_MAP_TRANSLATOR);

		partOfSpeechEClass = createEClass(PART_OF_SPEECH);
		createEAttribute(partOfSpeechEClass, PART_OF_SPEECH__LITERAL);
		createEAttribute(partOfSpeechEClass, PART_OF_SPEECH__RESOURCE);
		createEAttribute(partOfSpeechEClass, PART_OF_SPEECH__WORD);
		createEAttribute(partOfSpeechEClass, PART_OF_SPEECH__NAME);
		createEOperation(partOfSpeechEClass, PART_OF_SPEECH___GENERATE__LOCALE_MAP_TRANSLATOR);

		nounPartEClass = createEClass(NOUN_PART);

		pronounPartEClass = createEClass(PRONOUN_PART);
		createEAttribute(pronounPartEClass, PRONOUN_PART__PERSON);
		createEAttribute(pronounPartEClass, PRONOUN_PART__NUMBER);
		createEAttribute(pronounPartEClass, PRONOUN_PART__CASE);

		verbPartEClass = createEClass(VERB_PART);

		lexRuleEClass = createEClass(LEX_RULE);
		createEReference(lexRuleEClass, LEX_RULE__MATCHERS);

		prepositionPartEClass = createEClass(PREPOSITION_PART);

		conjunctionPartEClass = createEClass(CONJUNCTION_PART);

		interjectionPartEClass = createEClass(INTERJECTION_PART);

		lexMatcherEClass = createEClass(LEX_MATCHER);

		partOfSpeechMatcherEClass = createEClass(PART_OF_SPEECH_MATCHER);
		createEAttribute(partOfSpeechMatcherEClass, PART_OF_SPEECH_MATCHER__PART_OF_SPEECH);

		typedResourceMatcherEClass = createEClass(TYPED_RESOURCE_MATCHER);
		createEAttribute(typedResourceMatcherEClass, TYPED_RESOURCE_MATCHER__SEMANTIC_CLASS);

		literalMatcherEClass = createEClass(LITERAL_MATCHER);
		createEAttribute(literalMatcherEClass, LITERAL_MATCHER__LITERALS);
		createEAttribute(literalMatcherEClass, LITERAL_MATCHER__CASE_SENSITIVE);

		classMatcherEClass = createEClass(CLASS_MATCHER);
		createEAttribute(classMatcherEClass, CLASS_MATCHER__SEMANTIC_CLASS);

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
		createEAttribute(resourceReplacementEClass, RESOURCE_REPLACEMENT__CAPTURE_GROUP);

		questionReplacementEClass = createEClass(QUESTION_REPLACEMENT);
		createEAttribute(questionReplacementEClass, QUESTION_REPLACEMENT__QUESTION);

		adverbPartEClass = createEClass(ADVERB_PART);

		adjectivePartEClass = createEClass(ADJECTIVE_PART);

		partContainerEClass = createEClass(PART_CONTAINER);
		createEReference(partContainerEClass, PART_CONTAINER__PARTS);

		generatedLiteralEClass = createEClass(GENERATED_LITERAL);
		createEAttribute(generatedLiteralEClass, GENERATED_LITERAL__LITERAL);
		createEAttribute(generatedLiteralEClass, GENERATED_LITERAL__PRE_SEPARATED);

		lexRulesEClass = createEClass(LEX_RULES);
		createEReference(lexRulesEClass, LEX_RULES__RULES);

		resourceMatcherEClass = createEClass(RESOURCE_MATCHER);
		createEAttribute(resourceMatcherEClass, RESOURCE_MATCHER__RESOURCE);

		pronounReplacementEClass = createEClass(PRONOUN_REPLACEMENT);
		createEAttribute(pronounReplacementEClass, PRONOUN_REPLACEMENT__PERSON);
		createEAttribute(pronounReplacementEClass, PRONOUN_REPLACEMENT__NUMBER);
		createEAttribute(pronounReplacementEClass, PRONOUN_REPLACEMENT__CASE);

		unrecognizedPartEClass = createEClass(UNRECOGNIZED_PART);

		replacementContainerEClass = createEClass(REPLACEMENT_CONTAINER);
		createEReference(replacementContainerEClass, REPLACEMENT_CONTAINER__REPLACEMENTS);

		subjectRelationEClass = createEClass(SUBJECT_RELATION);
		createEReference(subjectRelationEClass, SUBJECT_RELATION__SUBJECT);
		createEReference(subjectRelationEClass, SUBJECT_RELATION__VERB);

		objectRelationEClass = createEClass(OBJECT_RELATION);
		createEReference(objectRelationEClass, OBJECT_RELATION__VERB);
		createEReference(objectRelationEClass, OBJECT_RELATION__OBJECT);

		relationEClass = createEClass(RELATION);

		relationRuleEClass = createEClass(RELATION_RULE);
		createEReference(relationRuleEClass, RELATION_RULE__MATCHERS);
		createEReference(relationRuleEClass, RELATION_RULE__RELATION_DEFS);

		relationRulesEClass = createEClass(RELATION_RULES);
		createEReference(relationRulesEClass, RELATION_RULES__RULES);

		typedPartMatcherEClass = createEClass(TYPED_PART_MATCHER);
		createEAttribute(typedPartMatcherEClass, TYPED_PART_MATCHER__PART_OF_SPEECH);

		partMatcherEClass = createEClass(PART_MATCHER);
		createEReference(partMatcherEClass, PART_MATCHER__MATCHERS);

		subjectRelationDefEClass = createEClass(SUBJECT_RELATION_DEF);
		createEAttribute(subjectRelationDefEClass, SUBJECT_RELATION_DEF__VERB);
		createEAttribute(subjectRelationDefEClass, SUBJECT_RELATION_DEF__SUBJECT);

		relationDefEClass = createEClass(RELATION_DEF);

		objectRelationDefEClass = createEClass(OBJECT_RELATION_DEF);
		createEAttribute(objectRelationDefEClass, OBJECT_RELATION_DEF__VERB);
		createEAttribute(objectRelationDefEClass, OBJECT_RELATION_DEF__OBJECT);

		adjectiveSatellitePartEClass = createEClass(ADJECTIVE_SATELLITE_PART);

		// Create enums
		partOfSpeechTypeEEnum = createEEnum(PART_OF_SPEECH_TYPE);
		punctuationEEnum = createEEnum(PUNCTUATION);
		questionEEnum = createEEnum(QUESTION);
		pronounPersonEEnum = createEEnum(PRONOUN_PERSON);
		pronounNumberEEnum = createEEnum(PRONOUN_NUMBER);
		pronounCaseEEnum = createEEnum(PRONOUN_CASE);

		// Create data types
		qNameEDataType = createEDataType(QNAME);
		localeEDataType = createEDataType(LOCALE);
		translatorEDataType = createEDataType(TRANSLATOR);
		labelProviderEDataType = createEDataType(LABEL_PROVIDER);
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
		nounPartEClass.getESuperTypes().add(this.getPartContainer());
		pronounPartEClass.getESuperTypes().add(this.getPartOfSpeech());
		pronounPartEClass.getESuperTypes().add(this.getQuestionable());
		verbPartEClass.getESuperTypes().add(this.getPartOfSpeech());
		verbPartEClass.getESuperTypes().add(this.getPartContainer());
		lexRuleEClass.getESuperTypes().add(this.getReplacementContainer());
		prepositionPartEClass.getESuperTypes().add(this.getPartOfSpeech());
		conjunctionPartEClass.getESuperTypes().add(this.getPartOfSpeech());
		interjectionPartEClass.getESuperTypes().add(this.getPartOfSpeech());
		partOfSpeechMatcherEClass.getESuperTypes().add(this.getLexMatcher());
		typedResourceMatcherEClass.getESuperTypes().add(this.getLexMatcher());
		literalMatcherEClass.getESuperTypes().add(this.getLexMatcher());
		classMatcherEClass.getESuperTypes().add(this.getLexMatcher());
		literalReplacementEClass.getESuperTypes().add(this.getLexReplacement());
		punctuationPartEClass.getESuperTypes().add(this.getPartOfSpeech());
		punctuationReplacementEClass.getESuperTypes().add(this.getLexReplacement());
		resourceReplacementEClass.getESuperTypes().add(this.getLexReplacement());
		resourceReplacementEClass.getESuperTypes().add(this.getReplacementContainer());
		questionReplacementEClass.getESuperTypes().add(this.getLexReplacement());
		adverbPartEClass.getESuperTypes().add(this.getPartOfSpeech());
		adverbPartEClass.getESuperTypes().add(this.getQuestionable());
		adjectivePartEClass.getESuperTypes().add(this.getPartOfSpeech());
		adjectivePartEClass.getESuperTypes().add(this.getQuestionable());
		resourceMatcherEClass.getESuperTypes().add(this.getLexMatcher());
		pronounReplacementEClass.getESuperTypes().add(this.getLexReplacement());
		unrecognizedPartEClass.getESuperTypes().add(this.getPartOfSpeech());
		subjectRelationEClass.getESuperTypes().add(this.getRelation());
		objectRelationEClass.getESuperTypes().add(this.getRelation());
		typedPartMatcherEClass.getESuperTypes().add(this.getPartMatcher());
		subjectRelationDefEClass.getESuperTypes().add(this.getRelationDef());
		objectRelationDefEClass.getESuperTypes().add(this.getRelationDef());
		adjectiveSatellitePartEClass.getESuperTypes().add(this.getPartOfSpeech());

		// Initialize classes, features, and operations; add parameters
		initEClass(sentenceEClass, Sentence.class, "Sentence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSentence_Literal(), ecorePackage.getEString(), "literal", null, 1, 1, Sentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSentence_Relations(), this.getRelation(), null, "relations", null, 1, -1, Sentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getSentence__Generate__Locale_Map_Translator(), ecorePackage.getEString(), "generate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLocale(), "locale", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "dict", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTranslator(), "translator", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(partOfSpeechEClass, PartOfSpeech.class, "PartOfSpeech", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartOfSpeech_Literal(), ecorePackage.getEString(), "literal", null, 1, 1, PartOfSpeech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartOfSpeech_Resource(), this.getQName(), "resource", null, 0, 1, PartOfSpeech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartOfSpeech_Word(), this.getQName(), "word", null, 0, 1, PartOfSpeech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartOfSpeech_Name(), ecorePackage.getEString(), "name", null, 1, 1, PartOfSpeech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPartOfSpeech__Generate__Locale_Map_Translator(), this.getGeneratedLiteral(), "generate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLocale(), "locale", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "dict", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTranslator(), "translator", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(nounPartEClass, NounPart.class, "NounPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pronounPartEClass, PronounPart.class, "PronounPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPronounPart_Person(), this.getPronounPerson(), "person", null, 0, 1, PronounPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPronounPart_Number(), this.getPronounNumber(), "number", null, 0, 1, PronounPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPronounPart_Case(), this.getPronounCase(), "case", null, 0, 1, PronounPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verbPartEClass, VerbPart.class, "VerbPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lexRuleEClass, LexRule.class, "LexRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLexRule_Matchers(), this.getLexMatcher(), null, "matchers", null, 0, -1, LexRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prepositionPartEClass, PrepositionPart.class, "PrepositionPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conjunctionPartEClass, ConjunctionPart.class, "ConjunctionPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interjectionPartEClass, InterjectionPart.class, "InterjectionPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lexMatcherEClass, LexMatcher.class, "LexMatcher", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partOfSpeechMatcherEClass, PartOfSpeechMatcher.class, "PartOfSpeechMatcher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartOfSpeechMatcher_PartOfSpeech(), this.getPartOfSpeechType(), "partOfSpeech", null, 1, 1, PartOfSpeechMatcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedResourceMatcherEClass, TypedResourceMatcher.class, "TypedResourceMatcher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypedResourceMatcher_SemanticClass(), this.getQName(), "semanticClass", null, 0, 1, TypedResourceMatcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalMatcherEClass, LiteralMatcher.class, "LiteralMatcher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralMatcher_Literals(), ecorePackage.getEString(), "literals", null, 1, -1, LiteralMatcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiteralMatcher_CaseSensitive(), ecorePackage.getEBoolean(), "caseSensitive", "false", 0, 1, LiteralMatcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classMatcherEClass, ClassMatcher.class, "ClassMatcher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassMatcher_SemanticClass(), this.getQName(), "semanticClass", null, 0, 1, ClassMatcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEAttribute(getResourceReplacement_CaptureGroup(), ecorePackage.getEIntegerObject(), "captureGroup", null, 0, 1, ResourceReplacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionReplacementEClass, QuestionReplacement.class, "QuestionReplacement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestionReplacement_Question(), this.getQuestion(), "question", null, 1, 1, QuestionReplacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adverbPartEClass, AdverbPart.class, "AdverbPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adjectivePartEClass, AdjectivePart.class, "AdjectivePart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partContainerEClass, PartContainer.class, "PartContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartContainer_Parts(), this.getPartOfSpeech(), null, "parts", null, 0, -1, PartContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generatedLiteralEClass, GeneratedLiteral.class, "GeneratedLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneratedLiteral_Literal(), ecorePackage.getEString(), "literal", null, 1, 1, GeneratedLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratedLiteral_PreSeparated(), ecorePackage.getEBoolean(), "preSeparated", "true", 1, 1, GeneratedLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lexRulesEClass, LexRules.class, "LexRules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLexRules_Rules(), this.getLexRule(), null, "rules", null, 0, -1, LexRules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceMatcherEClass, ResourceMatcher.class, "ResourceMatcher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceMatcher_Resource(), this.getQName(), "resource", null, 1, 1, ResourceMatcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pronounReplacementEClass, PronounReplacement.class, "PronounReplacement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPronounReplacement_Person(), this.getPronounPerson(), "person", null, 1, 1, PronounReplacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPronounReplacement_Number(), this.getPronounNumber(), "number", null, 1, 1, PronounReplacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPronounReplacement_Case(), this.getPronounCase(), "case", null, 1, 1, PronounReplacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unrecognizedPartEClass, UnrecognizedPart.class, "UnrecognizedPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(replacementContainerEClass, ReplacementContainer.class, "ReplacementContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReplacementContainer_Replacements(), this.getLexReplacement(), null, "replacements", null, 0, -1, ReplacementContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subjectRelationEClass, SubjectRelation.class, "SubjectRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubjectRelation_Subject(), this.getPartOfSpeech(), null, "subject", null, 1, 1, SubjectRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubjectRelation_Verb(), this.getVerbPart(), null, "verb", null, 1, 1, SubjectRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectRelationEClass, ObjectRelation.class, "ObjectRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectRelation_Verb(), this.getVerbPart(), null, "verb", null, 1, 1, ObjectRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectRelation_Object(), this.getPartOfSpeech(), null, "object", null, 1, 1, ObjectRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationEClass, Relation.class, "Relation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationRuleEClass, RelationRule.class, "RelationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationRule_Matchers(), this.getPartMatcher(), null, "matchers", null, 0, -1, RelationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationRule_RelationDefs(), this.getRelationDef(), null, "relationDefs", null, 0, -1, RelationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationRulesEClass, RelationRules.class, "RelationRules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationRules_Rules(), this.getRelationRule(), null, "rules", null, 0, -1, RelationRules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedPartMatcherEClass, TypedPartMatcher.class, "TypedPartMatcher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypedPartMatcher_PartOfSpeech(), this.getPartOfSpeechType(), "partOfSpeech", null, 0, 1, TypedPartMatcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partMatcherEClass, PartMatcher.class, "PartMatcher", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartMatcher_Matchers(), this.getPartMatcher(), null, "matchers", null, 0, -1, PartMatcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subjectRelationDefEClass, SubjectRelationDef.class, "SubjectRelationDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubjectRelationDef_Verb(), ecorePackage.getEInt(), "verb", null, 1, -1, SubjectRelationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubjectRelationDef_Subject(), ecorePackage.getEInt(), "subject", null, 1, -1, SubjectRelationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationDefEClass, RelationDef.class, "RelationDef", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectRelationDefEClass, ObjectRelationDef.class, "ObjectRelationDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectRelationDef_Verb(), ecorePackage.getEInt(), "verb", null, 1, -1, ObjectRelationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectRelationDef_Object(), ecorePackage.getEInt(), "object", null, 1, -1, ObjectRelationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adjectiveSatellitePartEClass, AdjectiveSatellitePart.class, "AdjectiveSatellitePart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		addEEnumLiteral(partOfSpeechTypeEEnum, PartOfSpeechType.ADJECTIVE);
		addEEnumLiteral(partOfSpeechTypeEEnum, PartOfSpeechType.ADJECTIVE_SATELLITE);
		addEEnumLiteral(partOfSpeechTypeEEnum, PartOfSpeechType.ADVERB);

		initEEnum(punctuationEEnum, Punctuation.class, "Punctuation");
		addEEnumLiteral(punctuationEEnum, Punctuation.FULL_STOP);
		addEEnumLiteral(punctuationEEnum, Punctuation.EXCLAMATION);
		addEEnumLiteral(punctuationEEnum, Punctuation.QUESTION);
		addEEnumLiteral(punctuationEEnum, Punctuation.COMMA);

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
		initEDataType(localeEDataType, Locale.class, "Locale", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(translatorEDataType, Translator.class, "Translator", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(labelProviderEDataType, LabelProvider.class, "LabelProvider", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (getSentence__Generate__Locale_Map_Translator(), 
		   source, 
		   new String[] {
			 "documentation", "Generate a readable sentence in the specified locale.\n\n@param The translations of resources in this locale\'s language/variant. Note that informal dictionaries (i.e. bahasa gaul/alay) is a valid use case. Key is resource URI and value is literal."
		   });		
		addAnnotation
		  (getSentence_Literal(), 
		   source, 
		   new String[] {
			 "documentation", "Raw literal sentence without preprocessing."
		   });		
		addAnnotation
		  (getPartOfSpeech__Generate__Locale_Map_Translator(), 
		   source, 
		   new String[] {
			 "documentation", "Generate a readable {@link GeneratedLiteral} in the specified locale.\n\n@param The translations of resources in this locale\'s language. Note that informal dictionaries (i.e. bahasa gaul/alay) is a valid use case. Key is resource URI and value is literal."
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
		  (getPartOfSpeech_Word(), 
		   source, 
		   new String[] {
			 "documentation", "Exact word resource (if known). Available word namespaces are:\n\n<ul>\n<li>wn30: http://purl.org/vocabularies/princeton/wn30/</li>\n<li>wn30-msa: http://wn-msa.sourceforge.net/wn30-msa/ from <a href=\"http://wn-msa.sourceforge.net/\">WordNet Bahasa</a></li>\n</ul>"
		   });		
		addAnnotation
		  (getPartOfSpeech_Name(), 
		   source, 
		   new String[] {
			 "documentation", "{@code rdfs:label} for the {@link #resource}. Usually retrieved from a {@link LabelProvider}."
		   });		
		addAnnotation
		  (getLexRule_Matchers(), 
		   source, 
		   new String[] {
			 "documentation", "Patterns to match.\nEach pattern is usually separated by whitespace, but sometimes it\'s not necessary to distinguish, for example, in \"I love you.\" there is no separator between \"you\" and \".\"."
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
		  (partOfSpeechMatcherEClass, 
		   source, 
		   new String[] {
			 "documentation", "Matches WordNet senses based on {@code wordnet-ontology:part_of_speech}, the only supported\n{@link PartOfSpeechType}s are NOUN, VERB, ADJECTIVE, ADVERB, adjective satellite and phrase.\nTo get literal representation it will use {@code wordnet-ontology:translation} using alpha-3 ISO language tag."
		   });		
		addAnnotation
		  (typedResourceMatcherEClass, 
		   source, 
		   new String[] {
			 "documentation", "Refers to an RDF resource (e.g. {@code dbpedia:Elephant}) of a specific class (e.g. {@code dbpedia-owl:Animal})."
		   });		
		addAnnotation
		  (getLiteralMatcher_Literals(), 
		   source, 
		   new String[] {
			 "documentation", "Any of the literals will match this element."
		   });		
		addAnnotation
		  (classMatcherEClass, 
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
			 "documentation", "Semantic resource, which is optional only if the pattern is from {@link ResourceElement} or {@link TypedResourceElement} and {@link #captureGroup} is set, otherwise required."
		   });		
		addAnnotation
		  (getResourceReplacement_CaptureGroup(), 
		   source, 
		   new String[] {
			 "documentation", "To get the resource {@link QName} from {@link ResourceElement}, put the pattern capture group number here (note: like regex, first group is 1) and leave {@link #resource} attribute null."
		   });		
		addAnnotation
		  (getGeneratedLiteral_PreSeparated(), 
		   source, 
		   new String[] {
			 "documentation", "Whether it needs to be separated from the previous literal by whitespace. All part of speeches require this, except {@link PunctuationPart}."
		   });		
		addAnnotation
		  (getResourceMatcher_Resource(), 
		   source, 
		   new String[] {
			 "documentation", "QName or URI of the resource to match."
		   });		
		addAnnotation
		  (unrecognizedPartEClass, 
		   source, 
		   new String[] {
			 "documentation", "A part that\'s yet to be recognized. At the start of the parsing, all tokens first become UnrecognizedPart."
		   });		
		addAnnotation
		  (getReplacementContainer_Replacements(), 
		   source, 
		   new String[] {
			 "documentation", "Replacements to be made when the patterns match.\nNote that LexRules can be repeated for multiple iterations."
		   });		
		addAnnotation
		  (getSubjectRelation_Subject(), 
		   source, 
		   new String[] {
			 "documentation", "Can be either {@link NounPart} or {@link PronounPart}."
		   });		
		addAnnotation
		  (getObjectRelation_Object(), 
		   source, 
		   new String[] {
			 "documentation", "Can be either {@link NounPart} or {@link PronounPart}."
		   });		
		addAnnotation
		  (relationEClass, 
		   source, 
		   new String[] {
			 "documentation", "Provides relationship information between part of speeches."
		   });		
		addAnnotation
		  (typedPartMatcherEClass, 
		   source, 
		   new String[] {
			 "documentation", "Matches a particular subclass of {@link PartOfSpeech}."
		   });		
		addAnnotation
		  (getPartMatcher_Matchers(), 
		   source, 
		   new String[] {
			 "documentation", "Child matchers of this {@link PartMatcher}. Note that a parent PartMatcher may only match if all its children have matched."
		   });		
		addAnnotation
		  (subjectRelationDefEClass, 
		   source, 
		   new String[] {
			 "documentation", "Defines a {@link SubjectRelation}."
		   });		
		addAnnotation
		  (relationDefEClass, 
		   source, 
		   new String[] {
			 "documentation", "Defines a {@link Relation}.\n\n<p>Since {@link PartMatcher} is hierarchical, binding paths are hierarchical also with format: \"{parent}/{child}/{grandchild}...\"\n(in XMI it\'s {@code int array}).\nNote that as in regex, binding numbers are 1-based.\ne.g. \"3/1\" refer to: first children of third root matcher."
		   });		
		addAnnotation
		  (objectRelationDefEClass, 
		   source, 
		   new String[] {
			 "documentation", "Defines an {@link ObjectRelation}."
		   });
	}

} //RelexidPackageImpl
