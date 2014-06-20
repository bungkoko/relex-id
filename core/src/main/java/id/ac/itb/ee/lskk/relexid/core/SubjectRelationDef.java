/**
 */
package id.ac.itb.ee.lskk.relexid.core;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject Relation Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a {@link SubjectRelation}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.SubjectRelationDef#getVerb <em>Verb</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.SubjectRelationDef#getSubject <em>Subject</em>}</li>
 * </ul>
 * </p>
 *
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getSubjectRelationDef()
 * @model
 * @generated
 */
public interface SubjectRelationDef extends RelationDef {
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
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getSubjectRelationDef_Verb()
	 * @model required="true"
	 * @generated
	 */
	EList<Integer> getVerb();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' attribute list.
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getSubjectRelationDef_Subject()
	 * @model required="true"
	 * @generated
	 */
	EList<Integer> getSubject();

} // SubjectRelationDef
