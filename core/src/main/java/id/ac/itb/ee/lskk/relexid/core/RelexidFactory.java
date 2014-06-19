/**
 */
package id.ac.itb.ee.lskk.relexid.core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage
 * @generated
 */
public interface RelexidFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RelexidFactory eINSTANCE = id.ac.itb.ee.lskk.relexid.core.impl.RelexidFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sentence</em>'.
	 * @generated
	 */
	Sentence createSentence();

	/**
	 * Returns a new object of class '<em>Noun Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Noun Part</em>'.
	 * @generated
	 */
	NounPart createNounPart();

	/**
	 * Returns a new object of class '<em>Pronoun Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pronoun Part</em>'.
	 * @generated
	 */
	PronounPart createPronounPart();

	/**
	 * Returns a new object of class '<em>Verb Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Verb Part</em>'.
	 * @generated
	 */
	VerbPart createVerbPart();

	/**
	 * Returns a new object of class '<em>Lex Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lex Rule</em>'.
	 * @generated
	 */
	LexRule createLexRule();

	/**
	 * Returns a new object of class '<em>Preposition Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Preposition Part</em>'.
	 * @generated
	 */
	PrepositionPart createPrepositionPart();

	/**
	 * Returns a new object of class '<em>Conjunction Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conjunction Part</em>'.
	 * @generated
	 */
	ConjunctionPart createConjunctionPart();

	/**
	 * Returns a new object of class '<em>Interjection Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interjection Part</em>'.
	 * @generated
	 */
	InterjectionPart createInterjectionPart();

	/**
	 * Returns a new object of class '<em>Part Of Speech Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part Of Speech Element</em>'.
	 * @generated
	 */
	PartOfSpeechElement createPartOfSpeechElement();

	/**
	 * Returns a new object of class '<em>Resource Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Element</em>'.
	 * @generated
	 */
	ResourceElement createResourceElement();

	/**
	 * Returns a new object of class '<em>Literal Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Element</em>'.
	 * @generated
	 */
	LiteralElement createLiteralElement();

	/**
	 * Returns a new object of class '<em>Class Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Element</em>'.
	 * @generated
	 */
	ClassElement createClassElement();

	/**
	 * Returns a new object of class '<em>Literal Replacement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Replacement</em>'.
	 * @generated
	 */
	LiteralReplacement createLiteralReplacement();

	/**
	 * Returns a new object of class '<em>Punctuation Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Punctuation Part</em>'.
	 * @generated
	 */
	PunctuationPart createPunctuationPart();

	/**
	 * Returns a new object of class '<em>Punctuation Replacement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Punctuation Replacement</em>'.
	 * @generated
	 */
	PunctuationReplacement createPunctuationReplacement();

	/**
	 * Returns a new object of class '<em>Resource Replacement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Replacement</em>'.
	 * @generated
	 */
	ResourceReplacement createResourceReplacement();

	/**
	 * Returns a new object of class '<em>Question Replacement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Replacement</em>'.
	 * @generated
	 */
	QuestionReplacement createQuestionReplacement();

	/**
	 * Returns a new object of class '<em>Adverb Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adverb Part</em>'.
	 * @generated
	 */
	AdverbPart createAdverbPart();

	/**
	 * Returns a new object of class '<em>Adjective Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adjective Part</em>'.
	 * @generated
	 */
	AdjectivePart createAdjectivePart();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RelexidPackage getRelexidPackage();

} //RelexidFactory
