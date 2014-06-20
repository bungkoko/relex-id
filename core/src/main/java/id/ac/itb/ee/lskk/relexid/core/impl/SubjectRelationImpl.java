/**
 */
package id.ac.itb.ee.lskk.relexid.core.impl;

import id.ac.itb.ee.lskk.relexid.core.PartOfSpeech;
import id.ac.itb.ee.lskk.relexid.core.RelEx;
import id.ac.itb.ee.lskk.relexid.core.RelexidPackage;
import id.ac.itb.ee.lskk.relexid.core.SubjectRelation;
import id.ac.itb.ee.lskk.relexid.core.VerbPart;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subject Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.SubjectRelationImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.SubjectRelationImpl#getVerb <em>Verb</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubjectRelationImpl extends MinimalEObjectImpl.Container implements SubjectRelation {
	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected PartOfSpeech subject;

	/**
	 * The cached value of the '{@link #getVerb() <em>Verb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerb()
	 * @generated
	 * @ordered
	 */
	protected VerbPart verb;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubjectRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelexidPackage.Literals.SUBJECT_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartOfSpeech getSubject() {
		if (subject != null && subject.eIsProxy()) {
			InternalEObject oldSubject = (InternalEObject)subject;
			subject = (PartOfSpeech)eResolveProxy(oldSubject);
			if (subject != oldSubject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelexidPackage.SUBJECT_RELATION__SUBJECT, oldSubject, subject));
			}
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartOfSpeech basicGetSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubject(PartOfSpeech newSubject) {
		PartOfSpeech oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.SUBJECT_RELATION__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerbPart getVerb() {
		if (verb != null && verb.eIsProxy()) {
			InternalEObject oldVerb = (InternalEObject)verb;
			verb = (VerbPart)eResolveProxy(oldVerb);
			if (verb != oldVerb) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelexidPackage.SUBJECT_RELATION__VERB, oldVerb, verb));
			}
		}
		return verb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerbPart basicGetVerb() {
		return verb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerb(VerbPart newVerb) {
		VerbPart oldVerb = verb;
		verb = newVerb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.SUBJECT_RELATION__VERB, oldVerb, verb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelexidPackage.SUBJECT_RELATION__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case RelexidPackage.SUBJECT_RELATION__VERB:
				if (resolve) return getVerb();
				return basicGetVerb();
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
			case RelexidPackage.SUBJECT_RELATION__SUBJECT:
				setSubject((PartOfSpeech)newValue);
				return;
			case RelexidPackage.SUBJECT_RELATION__VERB:
				setVerb((VerbPart)newValue);
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
			case RelexidPackage.SUBJECT_RELATION__SUBJECT:
				setSubject((PartOfSpeech)null);
				return;
			case RelexidPackage.SUBJECT_RELATION__VERB:
				setVerb((VerbPart)null);
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
			case RelexidPackage.SUBJECT_RELATION__SUBJECT:
				return subject != null;
			case RelexidPackage.SUBJECT_RELATION__VERB:
				return verb != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public String toString() {
		return "_subj(" + RelEx.shortQName(getVerb()) + ", " + RelEx.shortQName(getSubject()) + ")";		
	}

} //SubjectRelationImpl
