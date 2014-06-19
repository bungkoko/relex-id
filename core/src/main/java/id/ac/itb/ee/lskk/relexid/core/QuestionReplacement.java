/**
 */
package id.ac.itb.ee.lskk.relexid.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question Replacement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.QuestionReplacement#getQuestion <em>Question</em>}</li>
 * </ul>
 * </p>
 *
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getQuestionReplacement()
 * @model
 * @generated
 */
public interface QuestionReplacement extends LexReplacement {
	/**
	 * Returns the value of the '<em><b>Question</b></em>' attribute.
	 * The literals are from the enumeration {@link id.ac.itb.ee.lskk.relexid.core.Question}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' attribute.
	 * @see id.ac.itb.ee.lskk.relexid.core.Question
	 * @see #setQuestion(Question)
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getQuestionReplacement_Question()
	 * @model required="true"
	 * @generated
	 */
	Question getQuestion();

	/**
	 * Sets the value of the '{@link id.ac.itb.ee.lskk.relexid.core.QuestionReplacement#getQuestion <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' attribute.
	 * @see id.ac.itb.ee.lskk.relexid.core.Question
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(Question value);

} // QuestionReplacement
