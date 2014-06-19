/**
 */
package id.ac.itb.ee.lskk.relexid.core.impl;

import id.ac.itb.ee.lskk.relexid.core.PartOfSpeechType;
import id.ac.itb.ee.lskk.relexid.core.PronounCase;
import id.ac.itb.ee.lskk.relexid.core.PronounNumber;
import id.ac.itb.ee.lskk.relexid.core.PronounPerson;
import id.ac.itb.ee.lskk.relexid.core.PronounReplacement;
import id.ac.itb.ee.lskk.relexid.core.RelexidPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pronoun Replacement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.PronounReplacementImpl#getPartOfSpeech <em>Part Of Speech</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.PronounReplacementImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.PronounReplacementImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.PronounReplacementImpl#getCase <em>Case</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PronounReplacementImpl extends MinimalEObjectImpl.Container implements PronounReplacement {
	/**
	 * The default value of the '{@link #getPartOfSpeech() <em>Part Of Speech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOfSpeech()
	 * @generated
	 * @ordered
	 */
	protected static final PartOfSpeechType PART_OF_SPEECH_EDEFAULT = PartOfSpeechType.UNKNOWN;

	/**
	 * The cached value of the '{@link #getPartOfSpeech() <em>Part Of Speech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOfSpeech()
	 * @generated
	 * @ordered
	 */
	protected PartOfSpeechType partOfSpeech = PART_OF_SPEECH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerson() <em>Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected static final PronounPerson PERSON_EDEFAULT = PronounPerson.FIRST;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected PronounPerson person = PERSON_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final PronounNumber NUMBER_EDEFAULT = PronounNumber.SINGULAR;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected PronounNumber number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCase() <em>Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCase()
	 * @generated
	 * @ordered
	 */
	protected static final PronounCase CASE_EDEFAULT = PronounCase.SUBJECT;

	/**
	 * The cached value of the '{@link #getCase() <em>Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCase()
	 * @generated
	 * @ordered
	 */
	protected PronounCase case_ = CASE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PronounReplacementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelexidPackage.Literals.PRONOUN_REPLACEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartOfSpeechType getPartOfSpeech() {
		return partOfSpeech;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartOfSpeech(PartOfSpeechType newPartOfSpeech) {
		PartOfSpeechType oldPartOfSpeech = partOfSpeech;
		partOfSpeech = newPartOfSpeech == null ? PART_OF_SPEECH_EDEFAULT : newPartOfSpeech;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.PRONOUN_REPLACEMENT__PART_OF_SPEECH, oldPartOfSpeech, partOfSpeech));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PronounPerson getPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerson(PronounPerson newPerson) {
		PronounPerson oldPerson = person;
		person = newPerson == null ? PERSON_EDEFAULT : newPerson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.PRONOUN_REPLACEMENT__PERSON, oldPerson, person));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PronounNumber getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(PronounNumber newNumber) {
		PronounNumber oldNumber = number;
		number = newNumber == null ? NUMBER_EDEFAULT : newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.PRONOUN_REPLACEMENT__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PronounCase getCase() {
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCase(PronounCase newCase) {
		PronounCase oldCase = case_;
		case_ = newCase == null ? CASE_EDEFAULT : newCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.PRONOUN_REPLACEMENT__CASE, oldCase, case_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelexidPackage.PRONOUN_REPLACEMENT__PART_OF_SPEECH:
				return getPartOfSpeech();
			case RelexidPackage.PRONOUN_REPLACEMENT__PERSON:
				return getPerson();
			case RelexidPackage.PRONOUN_REPLACEMENT__NUMBER:
				return getNumber();
			case RelexidPackage.PRONOUN_REPLACEMENT__CASE:
				return getCase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RelexidPackage.PRONOUN_REPLACEMENT__PART_OF_SPEECH:
				setPartOfSpeech((PartOfSpeechType)newValue);
				return;
			case RelexidPackage.PRONOUN_REPLACEMENT__PERSON:
				setPerson((PronounPerson)newValue);
				return;
			case RelexidPackage.PRONOUN_REPLACEMENT__NUMBER:
				setNumber((PronounNumber)newValue);
				return;
			case RelexidPackage.PRONOUN_REPLACEMENT__CASE:
				setCase((PronounCase)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RelexidPackage.PRONOUN_REPLACEMENT__PART_OF_SPEECH:
				setPartOfSpeech(PART_OF_SPEECH_EDEFAULT);
				return;
			case RelexidPackage.PRONOUN_REPLACEMENT__PERSON:
				setPerson(PERSON_EDEFAULT);
				return;
			case RelexidPackage.PRONOUN_REPLACEMENT__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case RelexidPackage.PRONOUN_REPLACEMENT__CASE:
				setCase(CASE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RelexidPackage.PRONOUN_REPLACEMENT__PART_OF_SPEECH:
				return partOfSpeech != PART_OF_SPEECH_EDEFAULT;
			case RelexidPackage.PRONOUN_REPLACEMENT__PERSON:
				return person != PERSON_EDEFAULT;
			case RelexidPackage.PRONOUN_REPLACEMENT__NUMBER:
				return number != NUMBER_EDEFAULT;
			case RelexidPackage.PRONOUN_REPLACEMENT__CASE:
				return case_ != CASE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (partOfSpeech: ");
		result.append(partOfSpeech);
		result.append(", person: ");
		result.append(person);
		result.append(", number: ");
		result.append(number);
		result.append(", case: ");
		result.append(case_);
		result.append(')');
		return result.toString();
	}

} //PronounReplacementImpl
