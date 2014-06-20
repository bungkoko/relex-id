/**
 */
package id.ac.itb.ee.lskk.relexid.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.ObjectRelation#getVerb <em>Verb</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.ObjectRelation#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getObjectRelation()
 * @model
 * @generated
 */
public interface ObjectRelation extends Relation {
	/**
	 * Returns the value of the '<em><b>Verb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verb</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verb</em>' reference.
	 * @see #setVerb(VerbPart)
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getObjectRelation_Verb()
	 * @model required="true"
	 * @generated
	 */
	VerbPart getVerb();

	/**
	 * Sets the value of the '{@link id.ac.itb.ee.lskk.relexid.core.ObjectRelation#getVerb <em>Verb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verb</em>' reference.
	 * @see #getVerb()
	 * @generated
	 */
	void setVerb(VerbPart value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Can be either {@link NounPart} or {@link PronounPart}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(PartOfSpeech)
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getObjectRelation_Object()
	 * @model required="true"
	 * @generated
	 */
	PartOfSpeech getObject();

	/**
	 * Sets the value of the '{@link id.ac.itb.ee.lskk.relexid.core.ObjectRelation#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(PartOfSpeech value);

} // ObjectRelation
