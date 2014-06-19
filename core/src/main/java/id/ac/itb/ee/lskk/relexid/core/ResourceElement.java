/**
 */
package id.ac.itb.ee.lskk.relexid.core;

import javax.xml.namespace.QName;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.ResourceElement#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getResourceElement()
 * @model
 * @generated
 */
public interface ResourceElement extends LexElement {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * QName or URI of the resource to match.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' attribute.
	 * @see #setResource(QName)
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getResourceElement_Resource()
	 * @model dataType="id.ac.itb.ee.lskk.relexid.core.QName" required="true"
	 * @generated
	 */
	QName getResource();

	/**
	 * Sets the value of the '{@link id.ac.itb.ee.lskk.relexid.core.ResourceElement#getResource <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' attribute.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(QName value);

} // ResourceElement
