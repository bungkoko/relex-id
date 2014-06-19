/**
 */
package id.ac.itb.ee.lskk.relexid.core.util;

import id.ac.itb.ee.lskk.relexid.core.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage
 * @generated
 */
public class RelexidSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RelexidPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelexidSwitch() {
		if (modelPackage == null) {
			modelPackage = RelexidPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RelexidPackage.SENTENCE: {
				Sentence sentence = (Sentence)theEObject;
				T result = caseSentence(sentence);
				if (result == null) result = casePartContainer(sentence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelexidPackage.PART_OF_SPEECH: {
				PartOfSpeech partOfSpeech = (PartOfSpeech)theEObject;
				T result = casePartOfSpeech(partOfSpeech);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelexidPackage.NOUN_PART: {
				NounPart nounPart = (NounPart)theEObject;
				T result = caseNounPart(nounPart);
				if (result == null) result = casePartOfSpeech(nounPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelexidPackage.PRONOUN_PART: {
				PronounPart pronounPart = (PronounPart)theEObject;
				T result = casePronounPart(pronounPart);
				if (result == null) result = casePartOfSpeech(pronounPart);
				if (result == null) result = caseQuestionable(pronounPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelexidPackage.VERB_PART: {
				VerbPart verbPart = (VerbPart)theEObject;
				T result = caseVerbPart(verbPart);
				if (result == null) result = casePartOfSpeech(verbPart);
				if (result == null) result = casePartContainer(verbPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelexidPackage.LEX_RULE: {
				LexRule lexRule = (LexRule)theEObject;
				T result = caseLexRule(lexRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelexidPackage.PREPOSITION_PART: {
				PrepositionPart prepositionPart = (PrepositionPart)theEObject;
				T result = casePrepositionPart(prepositionPart);
				if (result == null) result = casePartOfSpeech(prepositionPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelexidPackage.CONJUNCTION_PART: {
				ConjunctionPart conjunctionPart = (ConjunctionPart)theEObject;
				T result = caseConjunctionPart(conjunctionPart);
				if (result == null) result = casePartOfSpeech(conjunctionPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelexidPackage.INTERJECTION_PART: {
				InterjectionPart interjectionPart = (InterjectionPart)theEObject;
				T result = caseInterjectionPart(interjectionPart);
				if (result == null) result = casePartOfSpeech(interjectionPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelexidPackage.LEX_ELEMENT: {
				LexElement lexElement = (LexElement)theEObject;
				T result = caseLexElement(lexElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelexidPackage.PART_OF_SPEECH_ELEMENT: {
				PartOfSpeechElement partOfSpeechElement = (PartOfSpeechElement)theEObject;
				T result = casePartOfSpeechElement(partOfSpeechElement);
				if (result == null) result = caseLexElement(partOfSpeechElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelexidPackage.RESOURCE_ELEMENT: {
				ResourceElement resourceElement = (ResourceElement)theEObject;
				T result = caseResourceElement(resourceElement);
				if (result == null) result = caseLexElement(resourceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelexidPackage.LITERAL_ELEMENT: {
				LiteralElement literalElement = (LiteralElement)theEObject;
				T result = caseLiteralElement(literalElement);
				if (result == null) result = caseLexElement(literalElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelexidPackage.CLASS_ELEMENT: {
				ClassElement classElement = (ClassElement)theEObject;
				T result = caseClassElement(classElement);
				if (result == null) result = caseLexElement(classElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelexidPackage.QUESTIONABLE: {
				Questionable questionable = (Questionable)theEObject;
				T result = caseQuestionable(questionable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelexidPackage.LEX_REPLACEMENT: {
				LexReplacement lexReplacement = (LexReplacement)theEObject;
				T result = caseLexReplacement(lexReplacement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelexidPackage.LITERAL_REPLACEMENT: {
				LiteralReplacement literalReplacement = (LiteralReplacement)theEObject;
				T result = caseLiteralReplacement(literalReplacement);
				if (result == null) result = caseLexReplacement(literalReplacement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelexidPackage.PUNCTUATION_PART: {
				PunctuationPart punctuationPart = (PunctuationPart)theEObject;
				T result = casePunctuationPart(punctuationPart);
				if (result == null) result = casePartOfSpeech(punctuationPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelexidPackage.PUNCTUATION_REPLACEMENT: {
				PunctuationReplacement punctuationReplacement = (PunctuationReplacement)theEObject;
				T result = casePunctuationReplacement(punctuationReplacement);
				if (result == null) result = caseLexReplacement(punctuationReplacement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelexidPackage.RESOURCE_REPLACEMENT: {
				ResourceReplacement resourceReplacement = (ResourceReplacement)theEObject;
				T result = caseResourceReplacement(resourceReplacement);
				if (result == null) result = caseLexReplacement(resourceReplacement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelexidPackage.QUESTION_REPLACEMENT: {
				QuestionReplacement questionReplacement = (QuestionReplacement)theEObject;
				T result = caseQuestionReplacement(questionReplacement);
				if (result == null) result = caseLexReplacement(questionReplacement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelexidPackage.ADVERB_PART: {
				AdverbPart adverbPart = (AdverbPart)theEObject;
				T result = caseAdverbPart(adverbPart);
				if (result == null) result = casePartOfSpeech(adverbPart);
				if (result == null) result = caseQuestionable(adverbPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelexidPackage.ADJECTIVE_PART: {
				AdjectivePart adjectivePart = (AdjectivePart)theEObject;
				T result = caseAdjectivePart(adjectivePart);
				if (result == null) result = casePartOfSpeech(adjectivePart);
				if (result == null) result = caseQuestionable(adjectivePart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelexidPackage.PART_CONTAINER: {
				PartContainer partContainer = (PartContainer)theEObject;
				T result = casePartContainer(partContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelexidPackage.GENERATED_LITERAL: {
				GeneratedLiteral generatedLiteral = (GeneratedLiteral)theEObject;
				T result = caseGeneratedLiteral(generatedLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sentence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSentence(Sentence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Of Speech</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Of Speech</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartOfSpeech(PartOfSpeech object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Noun Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Noun Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNounPart(NounPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pronoun Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pronoun Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePronounPart(PronounPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verb Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verb Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerbPart(VerbPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lex Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lex Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLexRule(LexRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preposition Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preposition Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrepositionPart(PrepositionPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conjunction Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conjunction Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConjunctionPart(ConjunctionPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interjection Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interjection Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterjectionPart(InterjectionPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lex Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lex Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLexElement(LexElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Of Speech Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Of Speech Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartOfSpeechElement(PartOfSpeechElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceElement(ResourceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralElement(LiteralElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassElement(ClassElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionable(Questionable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lex Replacement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lex Replacement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLexReplacement(LexReplacement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Replacement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Replacement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralReplacement(LiteralReplacement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Punctuation Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Punctuation Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePunctuationPart(PunctuationPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Punctuation Replacement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Punctuation Replacement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePunctuationReplacement(PunctuationReplacement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Replacement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Replacement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceReplacement(ResourceReplacement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question Replacement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question Replacement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionReplacement(QuestionReplacement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adverb Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adverb Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdverbPart(AdverbPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adjective Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adjective Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdjectivePart(AdjectivePart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartContainer(PartContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generated Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generated Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratedLiteral(GeneratedLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RelexidSwitch
