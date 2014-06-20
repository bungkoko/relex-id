/**
 */
package id.ac.itb.ee.lskk.relexid.core;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Relation Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines an {@link ObjectRelation}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.ObjectRelationDef#getVerb <em>Verb</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.ObjectRelationDef#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getObjectRelationDef()
 * @model
 * @generated
 */
public interface ObjectRelationDef extends RelationDef {
	/**
	 * Returns the value of the '<em><b>Verb</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verb</em>' attribute list.
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getObjectRelationDef_Verb()
	 * @model required="true"
	 * @generated
	 */
	EList<Integer> getVerb();

	/**
	 * Returns the value of the '<em><b>Object</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' attribute list.
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getObjectRelationDef_Object()
	 * @model required="true"
	 * @generated
	 */
	EList<Integer> getObject();

} // ObjectRelationDef
