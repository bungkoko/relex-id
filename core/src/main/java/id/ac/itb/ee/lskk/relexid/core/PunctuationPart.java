/**
 */
package id.ac.itb.ee.lskk.relexid.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Punctuation Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.PunctuationPart#getPunctuation <em>Punctuation</em>}</li>
 * </ul>
 * </p>
 *
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getPunctuationPart()
 * @model
 * @generated
 */
public interface PunctuationPart extends PartOfSpeech {
	/**
	 * Returns the value of the '<em><b>Punctuation</b></em>' attribute.
	 * The literals are from the enumeration {@link id.ac.itb.ee.lskk.relexid.core.Punctuation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Punctuation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Punctuation</em>' attribute.
	 * @see id.ac.itb.ee.lskk.relexid.core.Punctuation
	 * @see #setPunctuation(Punctuation)
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getPunctuationPart_Punctuation()
	 * @model required="true"
	 * @generated
	 */
	Punctuation getPunctuation();

	/**
	 * Sets the value of the '{@link id.ac.itb.ee.lskk.relexid.core.PunctuationPart#getPunctuation <em>Punctuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Punctuation</em>' attribute.
	 * @see id.ac.itb.ee.lskk.relexid.core.Punctuation
	 * @see #getPunctuation()
	 * @generated
	 */
	void setPunctuation(Punctuation value);

} // PunctuationPart
