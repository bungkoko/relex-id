/**
 */
package id.ac.itb.ee.lskk.relexid.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.LiteralElement#isCaseSensitive <em>Case Sensitive</em>}</li>
 * </ul>
 * </p>
 *
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getLiteralElement()
 * @model
 * @generated
 */
public interface LiteralElement extends LexElement {
	/**
	 * Returns the value of the '<em><b>Case Sensitive</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Sensitive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Sensitive</em>' attribute.
	 * @see #setCaseSensitive(boolean)
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getLiteralElement_CaseSensitive()
	 * @model default="false"
	 * @generated
	 */
	boolean isCaseSensitive();

	/**
	 * Sets the value of the '{@link id.ac.itb.ee.lskk.relexid.core.LiteralElement#isCaseSensitive <em>Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Sensitive</em>' attribute.
	 * @see #isCaseSensitive()
	 * @generated
	 */
	void setCaseSensitive(boolean value);

} // LiteralElement
