/**
 */
package id.ac.itb.ee.lskk.relexid.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.SubjectRelation#getSubject <em>Subject</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.SubjectRelation#getVerb <em>Verb</em>}</li>
 * </ul>
 * </p>
 *
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getSubjectRelation()
 * @model
 * @generated
 */
public interface SubjectRelation extends Relation {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Can be either {@link NounPart} or {@link PronounPart}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' reference.
	 * @see #setSubject(PartOfSpeech)
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getSubjectRelation_Subject()
	 * @model required="true"
	 * @generated
	 */
	PartOfSpeech getSubject();

	/**
	 * Sets the value of the '{@link id.ac.itb.ee.lskk.relexid.core.SubjectRelation#getSubject <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(PartOfSpeech value);

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
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getSubjectRelation_Verb()
	 * @model required="true"
	 * @generated
	 */
	VerbPart getVerb();

	/**
	 * Sets the value of the '{@link id.ac.itb.ee.lskk.relexid.core.SubjectRelation#getVerb <em>Verb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verb</em>' reference.
	 * @see #getVerb()
	 * @generated
	 */
	void setVerb(VerbPart value);

} // SubjectRelation
