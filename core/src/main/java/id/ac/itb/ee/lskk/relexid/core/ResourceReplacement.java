/**
 */
package id.ac.itb.ee.lskk.relexid.core;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Replacement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Replaces with a semantic resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.ResourceReplacement#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getResourceReplacement()
 * @model
 * @generated
 */
public interface ResourceReplacement extends LexReplacement {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Semantic resource, which is optional only if the pattern is from {@link ResourceElement} or {@link TypedResourceElement}, otherwise required.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' attribute.
	 * @see #setResource(QName)
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getResourceReplacement_Resource()
	 * @model dataType="id.ac.itb.ee.lskk.relexid.core.QName"
	 * @generated
	 */
	QName getResource();

	/**
	 * Sets the value of the '{@link id.ac.itb.ee.lskk.relexid.core.ResourceReplacement#getResource <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' attribute.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(QName value);

} // ResourceReplacement
