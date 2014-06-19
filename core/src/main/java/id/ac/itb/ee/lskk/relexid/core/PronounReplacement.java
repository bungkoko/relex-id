/**
 */
package id.ac.itb.ee.lskk.relexid.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pronoun Replacement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.PronounReplacement#getPerson <em>Person</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.PronounReplacement#getNumber <em>Number</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.PronounReplacement#getCase <em>Case</em>}</li>
 * </ul>
 * </p>
 *
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getPronounReplacement()
 * @model
 * @generated
 */
public interface PronounReplacement extends LexReplacement {
	/**
	 * Returns the value of the '<em><b>Person</b></em>' attribute.
	 * The literals are from the enumeration {@link id.ac.itb.ee.lskk.relexid.core.PronounPerson}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' attribute.
	 * @see id.ac.itb.ee.lskk.relexid.core.PronounPerson
	 * @see #setPerson(PronounPerson)
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getPronounReplacement_Person()
	 * @model required="true"
	 * @generated
	 */
	PronounPerson getPerson();

	/**
	 * Sets the value of the '{@link id.ac.itb.ee.lskk.relexid.core.PronounReplacement#getPerson <em>Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' attribute.
	 * @see id.ac.itb.ee.lskk.relexid.core.PronounPerson
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(PronounPerson value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * The literals are from the enumeration {@link id.ac.itb.ee.lskk.relexid.core.PronounNumber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see id.ac.itb.ee.lskk.relexid.core.PronounNumber
	 * @see #setNumber(PronounNumber)
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getPronounReplacement_Number()
	 * @model required="true"
	 * @generated
	 */
	PronounNumber getNumber();

	/**
	 * Sets the value of the '{@link id.ac.itb.ee.lskk.relexid.core.PronounReplacement#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see id.ac.itb.ee.lskk.relexid.core.PronounNumber
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(PronounNumber value);

	/**
	 * Returns the value of the '<em><b>Case</b></em>' attribute.
	 * The literals are from the enumeration {@link id.ac.itb.ee.lskk.relexid.core.PronounCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case</em>' attribute.
	 * @see id.ac.itb.ee.lskk.relexid.core.PronounCase
	 * @see #setCase(PronounCase)
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getPronounReplacement_Case()
	 * @model required="true"
	 * @generated
	 */
	PronounCase getCase();

	/**
	 * Sets the value of the '{@link id.ac.itb.ee.lskk.relexid.core.PronounReplacement#getCase <em>Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case</em>' attribute.
	 * @see id.ac.itb.ee.lskk.relexid.core.PronounCase
	 * @see #getCase()
	 * @generated
	 */
	void setCase(PronounCase value);

} // PronounReplacement
