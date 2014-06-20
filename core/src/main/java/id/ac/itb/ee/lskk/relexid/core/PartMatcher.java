/**
 */
package id.ac.itb.ee.lskk.relexid.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part Matcher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.PartMatcher#getMatchers <em>Matchers</em>}</li>
 * </ul>
 * </p>
 *
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getPartMatcher()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface PartMatcher extends EObject {
	/**
	 * Returns the value of the '<em><b>Matchers</b></em>' containment reference list.
	 * The list contents are of type {@link id.ac.itb.ee.lskk.relexid.core.PartMatcher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Child matchers of this {@link PartMatcher}. Note that a parent PartMatcher may only match if all its children have matched.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Matchers</em>' containment reference list.
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getPartMatcher_Matchers()
	 * @model containment="true"
	 * @generated
	 */
	EList<PartMatcher> getMatchers();

} // PartMatcher
