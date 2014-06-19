/**
 */
package id.ac.itb.ee.lskk.relexid.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generated Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.GeneratedLiteral#getLiteral <em>Literal</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.GeneratedLiteral#isPreSeparated <em>Pre Separated</em>}</li>
 * </ul>
 * </p>
 *
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getGeneratedLiteral()
 * @model
 * @generated
 */
public interface GeneratedLiteral extends EObject {
	/**
	 * Returns the value of the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' attribute.
	 * @see #setLiteral(String)
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getGeneratedLiteral_Literal()
	 * @model required="true"
	 * @generated
	 */
	String getLiteral();

	/**
	 * Sets the value of the '{@link id.ac.itb.ee.lskk.relexid.core.GeneratedLiteral#getLiteral <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' attribute.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(String value);

	/**
	 * Returns the value of the '<em><b>Pre Separated</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether it needs to be separated from the previous literal by whitespace. All part of speeches require this, except {@link PunctuationPart}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Separated</em>' attribute.
	 * @see #setPreSeparated(boolean)
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getGeneratedLiteral_PreSeparated()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isPreSeparated();

	/**
	 * Sets the value of the '{@link id.ac.itb.ee.lskk.relexid.core.GeneratedLiteral#isPreSeparated <em>Pre Separated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Separated</em>' attribute.
	 * @see #isPreSeparated()
	 * @generated
	 */
	void setPreSeparated(boolean value);

} // GeneratedLiteral
