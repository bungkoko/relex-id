/**
 */
package id.ac.itb.ee.lskk.relexid.core.impl;

import id.ac.itb.ee.lskk.relexid.core.LiteralReplacement;
import id.ac.itb.ee.lskk.relexid.core.PartOfSpeechType;
import id.ac.itb.ee.lskk.relexid.core.RelexidPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal Replacement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.LiteralReplacementImpl#getPartOfSpeech <em>Part Of Speech</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.LiteralReplacementImpl#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiteralReplacementImpl extends MinimalEObjectImpl.Container implements LiteralReplacement {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralReplacementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelexidPackage.Literals.LITERAL_REPLACEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.LITERAL_REPLACEMENT__PART_OF_SPEECH, oldPartOfSpeech, partOfSpeech));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiteral(String newLiteral) {
		String oldLiteral = literal;
		literal = newLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.LITERAL_REPLACEMENT__LITERAL, oldLiteral, literal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelexidPackage.LITERAL_REPLACEMENT__PART_OF_SPEECH:
				return getPartOfSpeech();
			case RelexidPackage.LITERAL_REPLACEMENT__LITERAL:
				return getLiteral();
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
			case RelexidPackage.LITERAL_REPLACEMENT__PART_OF_SPEECH:
				setPartOfSpeech((PartOfSpeechType)newValue);
				return;
			case RelexidPackage.LITERAL_REPLACEMENT__LITERAL:
				setLiteral((String)newValue);
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
			case RelexidPackage.LITERAL_REPLACEMENT__PART_OF_SPEECH:
				setPartOfSpeech(PART_OF_SPEECH_EDEFAULT);
				return;
			case RelexidPackage.LITERAL_REPLACEMENT__LITERAL:
				setLiteral(LITERAL_EDEFAULT);
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
			case RelexidPackage.LITERAL_REPLACEMENT__PART_OF_SPEECH:
				return partOfSpeech != PART_OF_SPEECH_EDEFAULT;
			case RelexidPackage.LITERAL_REPLACEMENT__LITERAL:
				return LITERAL_EDEFAULT == null ? literal != null : !LITERAL_EDEFAULT.equals(literal);
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
		result.append(", literal: ");
		result.append(literal);
		result.append(')');
		return result.toString();
	}

} //LiteralReplacementImpl
