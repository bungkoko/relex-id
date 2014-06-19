/**
 */
package id.ac.itb.ee.lskk.relexid.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.PartContainer#getParts <em>Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getPartContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface PartContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link id.ac.itb.ee.lskk.relexid.core.PartOfSpeech}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getPartContainer_Parts()
	 * @model containment="true"
	 * @generated
	 */
	EList<PartOfSpeech> getParts();

} // PartContainer
