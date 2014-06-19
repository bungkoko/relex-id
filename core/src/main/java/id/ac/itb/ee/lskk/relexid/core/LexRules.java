/**
 */
package id.ac.itb.ee.lskk.relexid.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lex Rules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.LexRules#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getLexRules()
 * @model
 * @generated
 */
public interface LexRules extends EObject {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link id.ac.itb.ee.lskk.relexid.core.LexRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getLexRules_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<LexRule> getRules();

} // LexRules
