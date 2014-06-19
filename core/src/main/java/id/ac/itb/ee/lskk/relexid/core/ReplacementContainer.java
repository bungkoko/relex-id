/**
 */
package id.ac.itb.ee.lskk.relexid.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Replacement Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.ReplacementContainer#getReplacements <em>Replacements</em>}</li>
 * </ul>
 * </p>
 *
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getReplacementContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ReplacementContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Replacements</b></em>' containment reference list.
	 * The list contents are of type {@link id.ac.itb.ee.lskk.relexid.core.LexReplacement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Replacements to be made when the patterns match.
	 * Note that LexRules can be repeated for multiple iterations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replacements</em>' containment reference list.
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getReplacementContainer_Replacements()
	 * @model containment="true"
	 * @generated
	 */
	EList<LexReplacement> getReplacements();

} // ReplacementContainer
