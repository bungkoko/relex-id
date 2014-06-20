/**
 */
package id.ac.itb.ee.lskk.relexid.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.RelationRule#getMatchers <em>Matchers</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.RelationRule#getRelationDefs <em>Relation Defs</em>}</li>
 * </ul>
 * </p>
 *
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getRelationRule()
 * @model
 * @generated
 */
public interface RelationRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Matchers</b></em>' containment reference list.
	 * The list contents are of type {@link id.ac.itb.ee.lskk.relexid.core.PartMatcher}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matchers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matchers</em>' containment reference list.
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getRelationRule_Matchers()
	 * @model containment="true"
	 * @generated
	 */
	EList<PartMatcher> getMatchers();

	/**
	 * Returns the value of the '<em><b>Relation Defs</b></em>' containment reference list.
	 * The list contents are of type {@link id.ac.itb.ee.lskk.relexid.core.RelationDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Defs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Defs</em>' containment reference list.
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getRelationRule_RelationDefs()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationDef> getRelationDefs();

} // RelationRule
