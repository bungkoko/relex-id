/**
 */
package id.ac.itb.ee.lskk.relexid.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Punctuation Replacement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.PunctuationReplacement#getPunctuation <em>Punctuation</em>}</li>
 * </ul>
 * </p>
 *
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getPunctuationReplacement()
 * @model
 * @generated
 */
public interface PunctuationReplacement extends LexReplacement {
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
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getPunctuationReplacement_Punctuation()
	 * @model
	 * @generated
	 */
	Punctuation getPunctuation();

	/**
	 * Sets the value of the '{@link id.ac.itb.ee.lskk.relexid.core.PunctuationReplacement#getPunctuation <em>Punctuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Punctuation</em>' attribute.
	 * @see id.ac.itb.ee.lskk.relexid.core.Punctuation
	 * @see #getPunctuation()
	 * @generated
	 */
	void setPunctuation(Punctuation value);

} // PunctuationReplacement
