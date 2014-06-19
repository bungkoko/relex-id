/**
 */
package id.ac.itb.ee.lskk.relexid.core.impl;

import id.ac.itb.ee.lskk.relexid.core.PartOfSpeechType;
import id.ac.itb.ee.lskk.relexid.core.Question;
import id.ac.itb.ee.lskk.relexid.core.QuestionReplacement;
import id.ac.itb.ee.lskk.relexid.core.RelexidPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question Replacement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.QuestionReplacementImpl#getPartOfSpeech <em>Part Of Speech</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.QuestionReplacementImpl#getQuestion <em>Question</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionReplacementImpl extends MinimalEObjectImpl.Container implements QuestionReplacement {
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
	 * The default value of the '{@link #getQuestion() <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected static final Question QUESTION_EDEFAULT = Question.WHAT;

	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected Question question = QUESTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionReplacementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelexidPackage.Literals.QUESTION_REPLACEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.QUESTION_REPLACEMENT__PART_OF_SPEECH, oldPartOfSpeech, partOfSpeech));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question getQuestion() {
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestion(Question newQuestion) {
		Question oldQuestion = question;
		question = newQuestion == null ? QUESTION_EDEFAULT : newQuestion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.QUESTION_REPLACEMENT__QUESTION, oldQuestion, question));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelexidPackage.QUESTION_REPLACEMENT__PART_OF_SPEECH:
				return getPartOfSpeech();
			case RelexidPackage.QUESTION_REPLACEMENT__QUESTION:
				return getQuestion();
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
			case RelexidPackage.QUESTION_REPLACEMENT__PART_OF_SPEECH:
				setPartOfSpeech((PartOfSpeechType)newValue);
				return;
			case RelexidPackage.QUESTION_REPLACEMENT__QUESTION:
				setQuestion((Question)newValue);
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
			case RelexidPackage.QUESTION_REPLACEMENT__PART_OF_SPEECH:
				setPartOfSpeech(PART_OF_SPEECH_EDEFAULT);
				return;
			case RelexidPackage.QUESTION_REPLACEMENT__QUESTION:
				setQuestion(QUESTION_EDEFAULT);
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
			case RelexidPackage.QUESTION_REPLACEMENT__PART_OF_SPEECH:
				return partOfSpeech != PART_OF_SPEECH_EDEFAULT;
			case RelexidPackage.QUESTION_REPLACEMENT__QUESTION:
				return question != QUESTION_EDEFAULT;
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
		result.append(", question: ");
		result.append(question);
		result.append(')');
		return result.toString();
	}

} //QuestionReplacementImpl
