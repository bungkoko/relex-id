/**
 */
package id.ac.itb.ee.lskk.relexid.core.util;

import id.ac.itb.ee.lskk.relexid.core.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage
 * @generated
 */
public class RelexidAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RelexidPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelexidAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RelexidPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelexidSwitch<Adapter> modelSwitch =
		new RelexidSwitch<Adapter>() {
			@Override
			public Adapter caseSentence(Sentence object) {
				return createSentenceAdapter();
			}
			@Override
			public Adapter casePartOfSpeech(PartOfSpeech object) {
				return createPartOfSpeechAdapter();
			}
			@Override
			public Adapter caseNounPart(NounPart object) {
				return createNounPartAdapter();
			}
			@Override
			public Adapter casePronounPart(PronounPart object) {
				return createPronounPartAdapter();
			}
			@Override
			public Adapter caseVerbPart(VerbPart object) {
				return createVerbPartAdapter();
			}
			@Override
			public Adapter caseLexRule(LexRule object) {
				return createLexRuleAdapter();
			}
			@Override
			public Adapter casePrepositionPart(PrepositionPart object) {
				return createPrepositionPartAdapter();
			}
			@Override
			public Adapter caseConjunctionPart(ConjunctionPart object) {
				return createConjunctionPartAdapter();
			}
			@Override
			public Adapter caseInterjectionPart(InterjectionPart object) {
				return createInterjectionPartAdapter();
			}
			@Override
			public Adapter caseLexMatcher(LexMatcher object) {
				return createLexMatcherAdapter();
			}
			@Override
			public Adapter casePartOfSpeechMatcher(PartOfSpeechMatcher object) {
				return createPartOfSpeechMatcherAdapter();
			}
			@Override
			public Adapter caseTypedResourceMatcher(TypedResourceMatcher object) {
				return createTypedResourceMatcherAdapter();
			}
			@Override
			public Adapter caseLiteralMatcher(LiteralMatcher object) {
				return createLiteralMatcherAdapter();
			}
			@Override
			public Adapter caseClassMatcher(ClassMatcher object) {
				return createClassMatcherAdapter();
			}
			@Override
			public Adapter caseQuestionable(Questionable object) {
				return createQuestionableAdapter();
			}
			@Override
			public Adapter caseLexReplacement(LexReplacement object) {
				return createLexReplacementAdapter();
			}
			@Override
			public Adapter caseLiteralReplacement(LiteralReplacement object) {
				return createLiteralReplacementAdapter();
			}
			@Override
			public Adapter casePunctuationPart(PunctuationPart object) {
				return createPunctuationPartAdapter();
			}
			@Override
			public Adapter casePunctuationReplacement(PunctuationReplacement object) {
				return createPunctuationReplacementAdapter();
			}
			@Override
			public Adapter caseResourceReplacement(ResourceReplacement object) {
				return createResourceReplacementAdapter();
			}
			@Override
			public Adapter caseQuestionReplacement(QuestionReplacement object) {
				return createQuestionReplacementAdapter();
			}
			@Override
			public Adapter caseAdverbPart(AdverbPart object) {
				return createAdverbPartAdapter();
			}
			@Override
			public Adapter caseAdjectivePart(AdjectivePart object) {
				return createAdjectivePartAdapter();
			}
			@Override
			public Adapter casePartContainer(PartContainer object) {
				return createPartContainerAdapter();
			}
			@Override
			public Adapter caseGeneratedLiteral(GeneratedLiteral object) {
				return createGeneratedLiteralAdapter();
			}
			@Override
			public Adapter caseLexRules(LexRules object) {
				return createLexRulesAdapter();
			}
			@Override
			public Adapter caseResourceMatcher(ResourceMatcher object) {
				return createResourceMatcherAdapter();
			}
			@Override
			public Adapter casePronounReplacement(PronounReplacement object) {
				return createPronounReplacementAdapter();
			}
			@Override
			public Adapter caseUnrecognizedPart(UnrecognizedPart object) {
				return createUnrecognizedPartAdapter();
			}
			@Override
			public Adapter caseReplacementContainer(ReplacementContainer object) {
				return createReplacementContainerAdapter();
			}
			@Override
			public Adapter caseSubjectRelation(SubjectRelation object) {
				return createSubjectRelationAdapter();
			}
			@Override
			public Adapter caseObjectRelation(ObjectRelation object) {
				return createObjectRelationAdapter();
			}
			@Override
			public Adapter caseRelation(Relation object) {
				return createRelationAdapter();
			}
			@Override
			public Adapter caseRelationRule(RelationRule object) {
				return createRelationRuleAdapter();
			}
			@Override
			public Adapter caseRelationRules(RelationRules object) {
				return createRelationRulesAdapter();
			}
			@Override
			public Adapter caseTypedPartMatcher(TypedPartMatcher object) {
				return createTypedPartMatcherAdapter();
			}
			@Override
			public Adapter casePartMatcher(PartMatcher object) {
				return createPartMatcherAdapter();
			}
			@Override
			public Adapter caseSubjectRelationDef(SubjectRelationDef object) {
				return createSubjectRelationDefAdapter();
			}
			@Override
			public Adapter caseRelationDef(RelationDef object) {
				return createRelationDefAdapter();
			}
			@Override
			public Adapter caseObjectRelationDef(ObjectRelationDef object) {
				return createObjectRelationDefAdapter();
			}
			@Override
			public Adapter caseAdjectiveSatellitePart(AdjectiveSatellitePart object) {
				return createAdjectiveSatellitePartAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.Sentence <em>Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.Sentence
	 * @generated
	 */
	public Adapter createSentenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.PartOfSpeech <em>Part Of Speech</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.PartOfSpeech
	 * @generated
	 */
	public Adapter createPartOfSpeechAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.NounPart <em>Noun Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.NounPart
	 * @generated
	 */
	public Adapter createNounPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.PronounPart <em>Pronoun Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.PronounPart
	 * @generated
	 */
	public Adapter createPronounPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.VerbPart <em>Verb Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.VerbPart
	 * @generated
	 */
	public Adapter createVerbPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.LexRule <em>Lex Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.LexRule
	 * @generated
	 */
	public Adapter createLexRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.PrepositionPart <em>Preposition Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.PrepositionPart
	 * @generated
	 */
	public Adapter createPrepositionPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.ConjunctionPart <em>Conjunction Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.ConjunctionPart
	 * @generated
	 */
	public Adapter createConjunctionPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.InterjectionPart <em>Interjection Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.InterjectionPart
	 * @generated
	 */
	public Adapter createInterjectionPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.LexMatcher <em>Lex Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.LexMatcher
	 * @generated
	 */
	public Adapter createLexMatcherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.PartOfSpeechMatcher <em>Part Of Speech Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.PartOfSpeechMatcher
	 * @generated
	 */
	public Adapter createPartOfSpeechMatcherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.TypedResourceMatcher <em>Typed Resource Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.TypedResourceMatcher
	 * @generated
	 */
	public Adapter createTypedResourceMatcherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.LiteralMatcher <em>Literal Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.LiteralMatcher
	 * @generated
	 */
	public Adapter createLiteralMatcherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.ClassMatcher <em>Class Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.ClassMatcher
	 * @generated
	 */
	public Adapter createClassMatcherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.PronounReplacement <em>Pronoun Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.PronounReplacement
	 * @generated
	 */
	public Adapter createPronounReplacementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.UnrecognizedPart <em>Unrecognized Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.UnrecognizedPart
	 * @generated
	 */
	public Adapter createUnrecognizedPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.ReplacementContainer <em>Replacement Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.ReplacementContainer
	 * @generated
	 */
	public Adapter createReplacementContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.SubjectRelation <em>Subject Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.SubjectRelation
	 * @generated
	 */
	public Adapter createSubjectRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.ObjectRelation <em>Object Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.ObjectRelation
	 * @generated
	 */
	public Adapter createObjectRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.RelationRule <em>Relation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.RelationRule
	 * @generated
	 */
	public Adapter createRelationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.RelationRules <em>Relation Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.RelationRules
	 * @generated
	 */
	public Adapter createRelationRulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.TypedPartMatcher <em>Typed Part Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.TypedPartMatcher
	 * @generated
	 */
	public Adapter createTypedPartMatcherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.PartMatcher <em>Part Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.PartMatcher
	 * @generated
	 */
	public Adapter createPartMatcherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.SubjectRelationDef <em>Subject Relation Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.SubjectRelationDef
	 * @generated
	 */
	public Adapter createSubjectRelationDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.RelationDef <em>Relation Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.RelationDef
	 * @generated
	 */
	public Adapter createRelationDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.ObjectRelationDef <em>Object Relation Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.ObjectRelationDef
	 * @generated
	 */
	public Adapter createObjectRelationDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.AdjectiveSatellitePart <em>Adjective Satellite Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.AdjectiveSatellitePart
	 * @generated
	 */
	public Adapter createAdjectiveSatellitePartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.Questionable <em>Questionable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.Questionable
	 * @generated
	 */
	public Adapter createQuestionableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.LexReplacement <em>Lex Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.LexReplacement
	 * @generated
	 */
	public Adapter createLexReplacementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.LiteralReplacement <em>Literal Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.LiteralReplacement
	 * @generated
	 */
	public Adapter createLiteralReplacementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.PunctuationPart <em>Punctuation Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.PunctuationPart
	 * @generated
	 */
	public Adapter createPunctuationPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.PunctuationReplacement <em>Punctuation Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.PunctuationReplacement
	 * @generated
	 */
	public Adapter createPunctuationReplacementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.ResourceReplacement <em>Resource Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.ResourceReplacement
	 * @generated
	 */
	public Adapter createResourceReplacementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.QuestionReplacement <em>Question Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.QuestionReplacement
	 * @generated
	 */
	public Adapter createQuestionReplacementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.AdverbPart <em>Adverb Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.AdverbPart
	 * @generated
	 */
	public Adapter createAdverbPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.AdjectivePart <em>Adjective Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.AdjectivePart
	 * @generated
	 */
	public Adapter createAdjectivePartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.PartContainer <em>Part Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.PartContainer
	 * @generated
	 */
	public Adapter createPartContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.GeneratedLiteral <em>Generated Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.GeneratedLiteral
	 * @generated
	 */
	public Adapter createGeneratedLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.LexRules <em>Lex Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.LexRules
	 * @generated
	 */
	public Adapter createLexRulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link id.ac.itb.ee.lskk.relexid.core.ResourceMatcher <em>Resource Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see id.ac.itb.ee.lskk.relexid.core.ResourceMatcher
	 * @generated
	 */
	public Adapter createResourceMatcherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RelexidAdapterFactory
