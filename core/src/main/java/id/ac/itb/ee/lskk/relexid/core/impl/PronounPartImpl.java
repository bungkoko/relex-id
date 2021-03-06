/**
 */
package id.ac.itb.ee.lskk.relexid.core.impl;

import id.ac.itb.ee.lskk.relexid.core.GeneratedLiteral;
import id.ac.itb.ee.lskk.relexid.core.PronounCase;
import id.ac.itb.ee.lskk.relexid.core.PronounNumber;
import id.ac.itb.ee.lskk.relexid.core.PronounPart;
import id.ac.itb.ee.lskk.relexid.core.PronounPerson;
import id.ac.itb.ee.lskk.relexid.core.Questionable;
import id.ac.itb.ee.lskk.relexid.core.RelexidFactory;
import id.ac.itb.ee.lskk.relexid.core.RelexidPackage;
import id.ac.itb.ee.lskk.relexid.core.Translator;

import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import java.util.Map;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import com.google.common.collect.ImmutableSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pronoun Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.PronounPartImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.PronounPartImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.PronounPartImpl#getWord <em>Word</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.PronounPartImpl#getName <em>Name</em>}</li>
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
	
	/**
	 * Singular I as {@link PronounCase#SUBJECT}.
	 */
	public static final PronounPart I;
	/**
	 * Singular I as {@link PronounCase#OBJECT}.
	 */
	public static final PronounPart ME;
	/**
	 * Singular you as {@link PronounCase#SUBJECT}.
	 */
	public static final PronounPart YOU_S;
	/**
	 * Singular you as {@link PronounCase#OBJECT}.
	 */
	public static final PronounPart YOU_O;
	/**
	 * Singular he/she/it as {@link PronounCase#SUBJECT}.
	 */
	public static final PronounPart IT_S;
	/**
	 * Singular he/she/it as {@link PronounCase#OBJECT}.
	 */
	public static final PronounPart IT_O;
	/**
	 * Plural we as {@link PronounCase#SUBJECT}.
	 */
	public static final PronounPart WE;
	/**
	 * Plural us as {@link PronounCase#OBJECT}.
	 */
	public static final PronounPart US;
	/**
	 * Plural you as {@link PronounCase#SUBJECT}.
	 */
	public static final PronounPart YOUS_S;
	/**
	 * Plural you as {@link PronounCase#OBJECT}.
	 */
	public static final PronounPart YOUS_O;
	/**
	 * Plural they as {@link PronounCase#SUBJECT}.
	 */
	public static final PronounPart THEY;
	/**
	 * Plural them as {@link PronounCase#OBJECT}.
	 */
	public static final PronounPart THEM;
	
	/**
	 * All known {@link PronounPart}s.
	 */
	public static ImmutableSet<PronounPart> ALL;
	
	static {
		I = new PronounPartImpl();
		I.setName("i");
		I.setPerson(PronounPerson.FIRST);
		I.setNumber(PronounNumber.SINGULAR);
		I.setCase(PronounCase.SUBJECT);
		I.setLiteral("I");
		ME = new PronounPartImpl();
		ME.setName("me");
		ME.setPerson(PronounPerson.FIRST);
		ME.setNumber(PronounNumber.SINGULAR);
		ME.setCase(PronounCase.OBJECT);
		ME.setLiteral("me");
		YOU_S = new PronounPartImpl();
		YOU_S.setName("you");
		YOU_S.setPerson(PronounPerson.SECOND);
		YOU_S.setNumber(PronounNumber.SINGULAR);
		YOU_S.setCase(PronounCase.SUBJECT);
		YOU_S.setLiteral("you");
		YOU_O = new PronounPartImpl();
		YOU_O.setName("you_o");
		YOU_O.setPerson(PronounPerson.SECOND);
		YOU_O.setNumber(PronounNumber.SINGULAR);
		YOU_O.setCase(PronounCase.OBJECT);
		YOU_O.setLiteral("you");
		IT_S = new PronounPartImpl();
		IT_S.setName("it_s");
		IT_S.setPerson(PronounPerson.THIRD);
		IT_S.setNumber(PronounNumber.SINGULAR);
		IT_S.setCase(PronounCase.SUBJECT);
		IT_S.setLiteral("it_s");
		IT_O = new PronounPartImpl();
		IT_O.setName("it_o");
		IT_O.setPerson(PronounPerson.THIRD);
		IT_O.setNumber(PronounNumber.SINGULAR);
		IT_O.setCase(PronounCase.OBJECT);
		IT_O.setLiteral("it_o");
		
		WE = new PronounPartImpl();
		WE.setName("we");
		WE.setPerson(PronounPerson.FIRST);
		WE.setNumber(PronounNumber.PLURAL);
		WE.setCase(PronounCase.SUBJECT);
		WE.setLiteral("WE");
		US = new PronounPartImpl();
		US.setName("us");
		US.setPerson(PronounPerson.FIRST);
		US.setNumber(PronounNumber.PLURAL);
		US.setCase(PronounCase.OBJECT);
		US.setLiteral("me");
		YOUS_S = new PronounPartImpl();
		YOUS_S.setName("yous_s");
		YOUS_S.setPerson(PronounPerson.SECOND);
		YOUS_S.setNumber(PronounNumber.PLURAL);
		YOUS_S.setCase(PronounCase.SUBJECT);
		YOUS_S.setLiteral("you");
		YOUS_O = new PronounPartImpl();
		YOUS_O.setName("yous_o");
		YOUS_O.setPerson(PronounPerson.SECOND);
		YOUS_O.setNumber(PronounNumber.PLURAL);
		YOUS_O.setCase(PronounCase.OBJECT);
		YOUS_O.setLiteral("you");
		THEY = new PronounPartImpl();
		THEY.setName("they");
		THEY.setPerson(PronounPerson.THIRD);
		THEY.setNumber(PronounNumber.PLURAL);
		THEY.setCase(PronounCase.SUBJECT);
		THEY.setLiteral("it_s");
		THEM = new PronounPartImpl();
		THEM.setName("them");
		THEM.setPerson(PronounPerson.THIRD);
		THEM.setNumber(PronounNumber.PLURAL);
		THEM.setCase(PronounCase.OBJECT);
		THEM.setLiteral("it_o");
		
		ALL = ImmutableSet.of(I, ME, YOU_S, YOU_O, IT_S, IT_O,
				WE, US, YOU_S, YOUS_O, THEY, THEM);
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
	 * The default value of the '{@link #getWord() <em>Word</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWord()
	 * @generated
	 * @ordered
	 */
	protected static final QName WORD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getWord() <em>Word</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWord()
	 * @generated
	 * @ordered
	 */
	protected QName word = WORD_EDEFAULT;
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
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
	public QName getWord() {
		return word;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWord(QName newWord) {
		QName oldWord = word;
		word = newWord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.PRONOUN_PART__WORD, oldWord, word));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.PRONOUN_PART__NAME, oldName, name));
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
	 */
	@Override
	public GeneratedLiteral generate(Locale locale, Map<String, String> dict, Translator translator) {
		GeneratedLiteral genLiteral = RelexidFactory.eINSTANCE.createGeneratedLiteral();
		switch (locale.getLanguage()) {
		case "en":
			switch (getPerson()) {
			case FIRST:
				switch (getNumber()) {
				case SINGULAR:
					switch (getCase()) {
					case SUBJECT:
						genLiteral.setLiteral("I");
						break;
					case OBJECT:
						genLiteral.setLiteral("me");
						break;
					}
					break;
				case PLURAL:
					switch (getCase()) {
					case SUBJECT:
						genLiteral.setLiteral("we");
						break;
					case OBJECT:
						genLiteral.setLiteral("us");
						break;
					}
					break;
				}
				break;
			case SECOND:
				switch (getNumber()) {
				case SINGULAR:
					switch (getCase()) {
					case SUBJECT:
						genLiteral.setLiteral("you");
						break;
					case OBJECT:
						genLiteral.setLiteral("you");
						break;
					}
					break;
				case PLURAL:
					switch (getCase()) {
					case SUBJECT:
						genLiteral.setLiteral("you");
						break;
					case OBJECT:
						genLiteral.setLiteral("you");
						break;
					}
					break;
				}
				break;
			case THIRD:
				switch (getNumber()) {
				case SINGULAR:
					switch (getCase()) {
					case SUBJECT:
						genLiteral.setLiteral("he");
						break;
					case OBJECT:
						genLiteral.setLiteral("him");
						break;
					}
					break;
				case PLURAL:
					switch (getCase()) {
					case SUBJECT:
						genLiteral.setLiteral("they");
						break;
					case OBJECT:
						genLiteral.setLiteral("them");
						break;
					}
					break;
				}
				break;
			}
			break;
		case "in":
			switch (getPerson()) {
			case FIRST:
				switch (getNumber()) {
				case SINGULAR:
					switch (getCase()) {
					case SUBJECT:
						genLiteral.setLiteral("aku");
						break;
					case OBJECT:
						genLiteral.setLiteral("aku");
						break;
					}
					break;
				case PLURAL:
					switch (getCase()) {
					case SUBJECT:
						genLiteral.setLiteral("kami");
						break;
					case OBJECT:
						genLiteral.setLiteral("kami");
						break;
					}
					break;
				}
				break;
			case SECOND:
				switch (getNumber()) {
				case SINGULAR:
					switch (getCase()) {
					case SUBJECT:
						genLiteral.setLiteral("kamu");
						break;
					case OBJECT:
						genLiteral.setLiteral("kamu");
						break;
					}
					break;
				case PLURAL:
					switch (getCase()) {
					case SUBJECT:
						genLiteral.setLiteral("kalian");
						break;
					case OBJECT:
						genLiteral.setLiteral("kalian");
						break;
					}
					break;
				}
				break;
			case THIRD:
				switch (getNumber()) {
				case SINGULAR:
					switch (getCase()) {
					case SUBJECT:
						genLiteral.setLiteral("dia");
						break;
					case OBJECT:
						genLiteral.setLiteral("dia");
						break;
					}
					break;
				case PLURAL:
					switch (getCase()) {
					case SUBJECT:
						genLiteral.setLiteral("mereka");
						break;
					case OBJECT:
						genLiteral.setLiteral("mereka");
						break;
					}
					break;
				}
				break;
			}
			break;
		default:
			throw new IllegalArgumentException("Unsupported locale: " + locale);
		}
		if (genLiteral.getLiteral() == null) {
			throw new IllegalStateException("Invalid pronoun: " + getPerson() + ", " + getNumber() + ", " + getCase());
		}
		return genLiteral;
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
			case RelexidPackage.PRONOUN_PART__WORD:
				return getWord();
			case RelexidPackage.PRONOUN_PART__NAME:
				return getName();
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
			case RelexidPackage.PRONOUN_PART__WORD:
				setWord((QName)newValue);
				return;
			case RelexidPackage.PRONOUN_PART__NAME:
				setName((String)newValue);
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
			case RelexidPackage.PRONOUN_PART__WORD:
				setWord(WORD_EDEFAULT);
				return;
			case RelexidPackage.PRONOUN_PART__NAME:
				setName(NAME_EDEFAULT);
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
			case RelexidPackage.PRONOUN_PART__WORD:
				return WORD_EDEFAULT == null ? word != null : !WORD_EDEFAULT.equals(word);
			case RelexidPackage.PRONOUN_PART__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RelexidPackage.PRONOUN_PART___GENERATE__LOCALE_MAP_TRANSLATOR:
				return generate((Locale)arguments.get(0), (Map<String, String>)arguments.get(1), (Translator)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
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
			break;
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
			break;
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
			break;
		}
		throw new IllegalStateException("Invalid pronoun: " + getPerson() + ", " + getNumber() + ", " + getCase());
	}
	
} //PronounPartImpl
