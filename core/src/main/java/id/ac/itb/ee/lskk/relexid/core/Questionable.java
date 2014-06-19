/**
 */
package id.ac.itb.ee.lskk.relexid.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Pronoun, adverb, or adjective, depending on how it is used. 
 * 
 * "What is that?" -- pronoun 
 * "What does it matter?" -- adverb 
 * "What book did you read?" -- adjective
 * 
 * Source:
 * http://www.merriam-webster.com/dictionary/what
 * 
 * https://answers.yahoo.com/question/index?qid=20090106144231AApUFKo
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.Questionable#isQuestioning <em>Questioning</em>}</li>
 * </ul>
 * </p>
 *
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getQuestionable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Questionable extends EObject {
	/**
	 * Returns the value of the '<em><b>Questioning</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pronoun, adverb, or adjective, depending on how it is used. 
	 * 
	 * "What is that?" -- pronoun 
	 * "What does it matter?" -- adverb 
	 * "What book did you read?" -- adjective
	 * 
	 * Source:
	 * http://www.merriam-webster.com/dictionary/what
	 * 
	 * https://answers.yahoo.com/question/index?qid=20090106144231AApUFKo
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Questioning</em>' attribute.
	 * @see #setQuestioning(boolean)
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getQuestionable_Questioning()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isQuestioning();

	/**
	 * Sets the value of the '{@link id.ac.itb.ee.lskk.relexid.core.Questionable#isQuestioning <em>Questioning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Questioning</em>' attribute.
	 * @see #isQuestioning()
	 * @generated
	 */
	void setQuestioning(boolean value);

} // Questionable
