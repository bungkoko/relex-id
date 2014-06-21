/**
 */
package id.ac.itb.ee.lskk.relexid.core.impl;

import id.ac.itb.ee.lskk.relexid.core.AdjectivePart;
import id.ac.itb.ee.lskk.relexid.core.AdjectiveSatellitePart;
import id.ac.itb.ee.lskk.relexid.core.AdverbPart;
import id.ac.itb.ee.lskk.relexid.core.CapturingGroup;
import id.ac.itb.ee.lskk.relexid.core.ConjunctionPart;
import id.ac.itb.ee.lskk.relexid.core.InterjectionPart;
import id.ac.itb.ee.lskk.relexid.core.LexMatchResult;
import id.ac.itb.ee.lskk.relexid.core.NounPart;
import id.ac.itb.ee.lskk.relexid.core.PartOfSpeech;
import id.ac.itb.ee.lskk.relexid.core.PartOfSpeechType;
import id.ac.itb.ee.lskk.relexid.core.PrepositionPart;
import id.ac.itb.ee.lskk.relexid.core.PronounPart;
import id.ac.itb.ee.lskk.relexid.core.RecognizedMatcher;
import id.ac.itb.ee.lskk.relexid.core.RelEx;
import id.ac.itb.ee.lskk.relexid.core.RelexidPackage;
import id.ac.itb.ee.lskk.relexid.core.VerbPart;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recognized Matcher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.RecognizedMatcherImpl#getPartOfSpeech <em>Part Of Speech</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecognizedMatcherImpl extends MinimalEObjectImpl.Container implements RecognizedMatcher {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecognizedMatcherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelexidPackage.Literals.RECOGNIZED_MATCHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartOfSpeechType getPartOfSpeech() {
		return partOfSpeech;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartOfSpeech(PartOfSpeechType newPartOfSpeech) {
		PartOfSpeechType oldPartOfSpeech = partOfSpeech;
		partOfSpeech = newPartOfSpeech == null ? PART_OF_SPEECH_EDEFAULT : newPartOfSpeech;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.RECOGNIZED_MATCHER__PART_OF_SPEECH, oldPartOfSpeech, partOfSpeech));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public LexMatchResult match(RelEx relex, PartOfSpeech part) {
		switch (getPartOfSpeech()) {
		case NOUN:
			return part instanceof NounPart ? new LexMatchResult(1, new CapturingGroup(part)) : LexMatchResult.MISMATCH;
		case VERB:
			return part instanceof VerbPart ? new LexMatchResult(1, new CapturingGroup(part)) : LexMatchResult.MISMATCH;
		case ADJECTIVE:
			return part instanceof AdjectivePart ? new LexMatchResult(1, new CapturingGroup(part)) : LexMatchResult.MISMATCH;
		case ADJECTIVE_SATELLITE:
			return part instanceof AdjectiveSatellitePart ? new LexMatchResult(1, new CapturingGroup(part)) : LexMatchResult.MISMATCH;
		case ADVERB:
			return part instanceof AdverbPart ? new LexMatchResult(1, new CapturingGroup(part)) : LexMatchResult.MISMATCH;
		case PRONOUN:
			return part instanceof PronounPart ? new LexMatchResult(1, new CapturingGroup(part)) : LexMatchResult.MISMATCH;
		case PREPOSITION:
			return part instanceof PrepositionPart ? new LexMatchResult(1, new CapturingGroup(part)) : LexMatchResult.MISMATCH;
		case CONJUNCTION:
			return part instanceof ConjunctionPart ? new LexMatchResult(1, new CapturingGroup(part)) : LexMatchResult.MISMATCH;
		case INTERJECTION:
			return part instanceof InterjectionPart ? new LexMatchResult(1, new CapturingGroup(part)) : LexMatchResult.MISMATCH;
		default:
			throw new IllegalArgumentException("Unhandled part of speech: " + getPartOfSpeech());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelexidPackage.RECOGNIZED_MATCHER__PART_OF_SPEECH:
				return getPartOfSpeech();
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
			case RelexidPackage.RECOGNIZED_MATCHER__PART_OF_SPEECH:
				setPartOfSpeech((PartOfSpeechType)newValue);
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
			case RelexidPackage.RECOGNIZED_MATCHER__PART_OF_SPEECH:
				setPartOfSpeech(PART_OF_SPEECH_EDEFAULT);
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
			case RelexidPackage.RECOGNIZED_MATCHER__PART_OF_SPEECH:
				return partOfSpeech != PART_OF_SPEECH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RelexidPackage.RECOGNIZED_MATCHER___MATCH__PARTOFSPEECH:
				return match((RelEx)arguments.get(0), (PartOfSpeech)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String toString() {
		return "+" + getPartOfSpeech();
	}

} //RecognizedMatcherImpl
