/**
 */
package id.ac.itb.ee.lskk.relexid.core.impl;

import id.ac.itb.ee.lskk.relexid.core.PartOfSpeechType;
import id.ac.itb.ee.lskk.relexid.core.Punctuation;
import id.ac.itb.ee.lskk.relexid.core.PunctuationReplacement;
import id.ac.itb.ee.lskk.relexid.core.RelexidPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Punctuation Replacement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.PunctuationReplacementImpl#getPartOfSpeech <em>Part Of Speech</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.PunctuationReplacementImpl#getPunctuation <em>Punctuation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PunctuationReplacementImpl extends MinimalEObjectImpl.Container implements PunctuationReplacement {
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
	 * The default value of the '{@link #getPunctuation() <em>Punctuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPunctuation()
	 * @generated
	 * @ordered
	 */
	protected static final Punctuation PUNCTUATION_EDEFAULT = Punctuation.PERIOD;

	/**
	 * The cached value of the '{@link #getPunctuation() <em>Punctuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPunctuation()
	 * @generated
	 * @ordered
	 */
	protected Punctuation punctuation = PUNCTUATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PunctuationReplacementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelexidPackage.Literals.PUNCTUATION_REPLACEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.PUNCTUATION_REPLACEMENT__PART_OF_SPEECH, oldPartOfSpeech, partOfSpeech));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Punctuation getPunctuation() {
		return punctuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPunctuation(Punctuation newPunctuation) {
		Punctuation oldPunctuation = punctuation;
		punctuation = newPunctuation == null ? PUNCTUATION_EDEFAULT : newPunctuation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.PUNCTUATION_REPLACEMENT__PUNCTUATION, oldPunctuation, punctuation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelexidPackage.PUNCTUATION_REPLACEMENT__PART_OF_SPEECH:
				return getPartOfSpeech();
			case RelexidPackage.PUNCTUATION_REPLACEMENT__PUNCTUATION:
				return getPunctuation();
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
			case RelexidPackage.PUNCTUATION_REPLACEMENT__PART_OF_SPEECH:
				setPartOfSpeech((PartOfSpeechType)newValue);
				return;
			case RelexidPackage.PUNCTUATION_REPLACEMENT__PUNCTUATION:
				setPunctuation((Punctuation)newValue);
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
			case RelexidPackage.PUNCTUATION_REPLACEMENT__PART_OF_SPEECH:
				setPartOfSpeech(PART_OF_SPEECH_EDEFAULT);
				return;
			case RelexidPackage.PUNCTUATION_REPLACEMENT__PUNCTUATION:
				setPunctuation(PUNCTUATION_EDEFAULT);
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
			case RelexidPackage.PUNCTUATION_REPLACEMENT__PART_OF_SPEECH:
				return partOfSpeech != PART_OF_SPEECH_EDEFAULT;
			case RelexidPackage.PUNCTUATION_REPLACEMENT__PUNCTUATION:
				return punctuation != PUNCTUATION_EDEFAULT;
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
		result.append(", punctuation: ");
		result.append(punctuation);
		result.append(')');
		return result.toString();
	}

} //PunctuationReplacementImpl
