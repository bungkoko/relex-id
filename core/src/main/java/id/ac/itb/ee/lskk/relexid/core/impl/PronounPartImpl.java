/**
 */
package id.ac.itb.ee.lskk.relexid.core.impl;

import id.ac.itb.ee.lskk.relexid.core.PronounCase;
import id.ac.itb.ee.lskk.relexid.core.PronounNumber;
import id.ac.itb.ee.lskk.relexid.core.PronounPart;
import id.ac.itb.ee.lskk.relexid.core.PronounPerson;
import id.ac.itb.ee.lskk.relexid.core.Questionable;
import id.ac.itb.ee.lskk.relexid.core.RelexidPackage;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pronoun Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.PronounPartImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.PronounPartImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.PronounPartImpl#isQuestioning <em>Questioning</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.PronounPartImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.PronounPartImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.PronounPartImpl#getCase <em>Case</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PronounPartImpl extends MinimalEObjectImpl.Container implements PronounPart {
	
	public static final PronounPart I;
	/**
	 * Singular you as {@link PronounCase#SUBJECT}.
	 */
	public static final PronounPart YOU_S;
	/**
	 * Singular you as {@link PronounCase#OBJECT}.
	 */
	public static final PronounPart YOU_O;
	
	static {
		I = new PronounPartImpl();
		I.setPerson(PronounPerson.FIRST);
		I.setNumber(PronounNumber.SINGULAR);
		I.setCase(PronounCase.SUBJECT);
		I.setLiteral("I");
		YOU_S = new PronounPartImpl();
		YOU_S.setPerson(PronounPerson.SECOND);
		YOU_S.setNumber(PronounNumber.SINGULAR);
		YOU_S.setCase(PronounCase.SUBJECT);
		YOU_S.setLiteral("you");
		YOU_O = new PronounPartImpl();
		YOU_O.setPerson(PronounPerson.SECOND);
		YOU_O.setNumber(PronounNumber.SINGULAR);
		YOU_O.setCase(PronounCase.OBJECT);
		YOU_O.setLiteral("you");
	}
	
	/**
	 * The default value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final String LITERAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteral()
	 * @generated
	 * @ordered
	 */
	protected String literal = LITERAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected static final QName RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected QName resource = RESOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isQuestioning() <em>Questioning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isQuestioning()
	 * @generated
	 * @ordered
	 */
	protected static final boolean QUESTIONING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isQuestioning() <em>Questioning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isQuestioning()
	 * @generated
	 * @ordered
	 */
	protected boolean questioning = QUESTIONING_EDEFAULT;

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
	protected PronounPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelexidPackage.Literals.PRONOUN_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLiteral(String newLiteral) {
		String oldLiteral = literal;
		literal = newLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.PRONOUN_PART__LITERAL, oldLiteral, literal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResource(QName newResource) {
		QName oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.PRONOUN_PART__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isQuestioning() {
		return questioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuestioning(boolean newQuestioning) {
		boolean oldQuestioning = questioning;
		questioning = newQuestioning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.PRONOUN_PART__QUESTIONING, oldQuestioning, questioning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PronounPerson getPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerson(PronounPerson newPerson) {
		PronounPerson oldPerson = person;
		person = newPerson == null ? PERSON_EDEFAULT : newPerson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.PRONOUN_PART__PERSON, oldPerson, person));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PronounNumber getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumber(PronounNumber newNumber) {
		PronounNumber oldNumber = number;
		number = newNumber == null ? NUMBER_EDEFAULT : newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.PRONOUN_PART__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PronounCase getCase() {
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCase(PronounCase newCase) {
		PronounCase oldCase = case_;
		case_ = newCase == null ? CASE_EDEFAULT : newCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.PRONOUN_PART__CASE, oldCase, case_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelexidPackage.PRONOUN_PART__LITERAL:
				return getLiteral();
			case RelexidPackage.PRONOUN_PART__RESOURCE:
				return getResource();
			case RelexidPackage.PRONOUN_PART__QUESTIONING:
				return isQuestioning();
			case RelexidPackage.PRONOUN_PART__PERSON:
				return getPerson();
			case RelexidPackage.PRONOUN_PART__NUMBER:
				return getNumber();
			case RelexidPackage.PRONOUN_PART__CASE:
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
			case RelexidPackage.PRONOUN_PART__LITERAL:
				setLiteral((String)newValue);
				return;
			case RelexidPackage.PRONOUN_PART__RESOURCE:
				setResource((QName)newValue);
				return;
			case RelexidPackage.PRONOUN_PART__QUESTIONING:
				setQuestioning((Boolean)newValue);
				return;
			case RelexidPackage.PRONOUN_PART__PERSON:
				setPerson((PronounPerson)newValue);
				return;
			case RelexidPackage.PRONOUN_PART__NUMBER:
				setNumber((PronounNumber)newValue);
				return;
			case RelexidPackage.PRONOUN_PART__CASE:
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
			case RelexidPackage.PRONOUN_PART__LITERAL:
				setLiteral(LITERAL_EDEFAULT);
				return;
			case RelexidPackage.PRONOUN_PART__RESOURCE:
				setResource(RESOURCE_EDEFAULT);
				return;
			case RelexidPackage.PRONOUN_PART__QUESTIONING:
				setQuestioning(QUESTIONING_EDEFAULT);
				return;
			case RelexidPackage.PRONOUN_PART__PERSON:
				setPerson(PERSON_EDEFAULT);
				return;
			case RelexidPackage.PRONOUN_PART__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case RelexidPackage.PRONOUN_PART__CASE:
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
			case RelexidPackage.PRONOUN_PART__LITERAL:
				return LITERAL_EDEFAULT == null ? literal != null : !LITERAL_EDEFAULT.equals(literal);
			case RelexidPackage.PRONOUN_PART__RESOURCE:
				return RESOURCE_EDEFAULT == null ? resource != null : !RESOURCE_EDEFAULT.equals(resource);
			case RelexidPackage.PRONOUN_PART__QUESTIONING:
				return questioning != QUESTIONING_EDEFAULT;
			case RelexidPackage.PRONOUN_PART__PERSON:
				return person != PERSON_EDEFAULT;
			case RelexidPackage.PRONOUN_PART__NUMBER:
				return number != NUMBER_EDEFAULT;
			case RelexidPackage.PRONOUN_PART__CASE:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Questionable.class) {
			switch (derivedFeatureID) {
				case RelexidPackage.PRONOUN_PART__QUESTIONING: return RelexidPackage.QUESTIONABLE__QUESTIONING;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Questionable.class) {
			switch (baseFeatureID) {
				case RelexidPackage.QUESTIONABLE__QUESTIONING: return RelexidPackage.PRONOUN_PART__QUESTIONING;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String toString() {
		switch (getPerson()) {
		case FIRST:
			switch (getNumber()) {
			case SINGULAR:
				switch (getCase()) {
				case SUBJECT:
					return "(PP i)";
				case OBJECT:
					return "(PP me)";
				}
				break;
			case PLURAL:
				switch (getCase()) {
				case SUBJECT:
					return "(PP we)";
				case OBJECT:
					return "(PP us)";
				}
				break;
			}
		case SECOND:
			switch (getNumber()) {
			case SINGULAR:
				switch (getCase()) {
				case SUBJECT:
					return "(PP you_s)";
				case OBJECT:
					return "(PP you_o)";
				}
				break;
			case PLURAL:
				switch (getCase()) {
				case SUBJECT:
					return "(PP yous_s)";
				case OBJECT:
					return "(PP yous_o)";
				}
				break;
			}
		case THIRD:
			switch (getNumber()) {
			case SINGULAR:
				switch (getCase()) {
				case SUBJECT:
					return "(PP he)";
				case OBJECT:
					return "(PP him)";
				}
				break;
			case PLURAL:
				switch (getCase()) {
				case SUBJECT:
					return "(PP they)";
				case OBJECT:
					return "(PP them)";
				}
				break;
			}
		}
		throw new IllegalStateException("Invalid pronoun: " + getPerson() + ", " + getNumber() + ", " + getCase());
	}
	
} //PronounPartImpl
