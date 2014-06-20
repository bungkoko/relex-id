/**
 */
package id.ac.itb.ee.lskk.relexid.core.impl;

import id.ac.itb.ee.lskk.relexid.core.RelexidPackage;
import id.ac.itb.ee.lskk.relexid.core.SubjectRelationDef;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import com.google.common.base.Joiner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subject Relation Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.SubjectRelationDefImpl#getVerb <em>Verb</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.SubjectRelationDefImpl#getSubject <em>Subject</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubjectRelationDefImpl extends MinimalEObjectImpl.Container implements SubjectRelationDef {
	/**
	 * The cached value of the '{@link #getVerb() <em>Verb</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerb()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> verb;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> subject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubjectRelationDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelexidPackage.Literals.SUBJECT_RELATION_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getVerb() {
		if (verb == null) {
			verb = new EDataTypeUniqueEList<Integer>(Integer.class, this, RelexidPackage.SUBJECT_RELATION_DEF__VERB);
		}
		return verb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSubject() {
		if (subject == null) {
			subject = new EDataTypeUniqueEList<Integer>(Integer.class, this, RelexidPackage.SUBJECT_RELATION_DEF__SUBJECT);
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelexidPackage.SUBJECT_RELATION_DEF__VERB:
				return getVerb();
			case RelexidPackage.SUBJECT_RELATION_DEF__SUBJECT:
				return getSubject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RelexidPackage.SUBJECT_RELATION_DEF__VERB:
				getVerb().clear();
				getVerb().addAll((Collection<? extends Integer>)newValue);
				return;
			case RelexidPackage.SUBJECT_RELATION_DEF__SUBJECT:
				getSubject().clear();
				getSubject().addAll((Collection<? extends Integer>)newValue);
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
			case RelexidPackage.SUBJECT_RELATION_DEF__VERB:
				getVerb().clear();
				return;
			case RelexidPackage.SUBJECT_RELATION_DEF__SUBJECT:
				getSubject().clear();
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
			case RelexidPackage.SUBJECT_RELATION_DEF__VERB:
				return verb != null && !verb.isEmpty();
			case RelexidPackage.SUBJECT_RELATION_DEF__SUBJECT:
				return subject != null && !subject.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String toString() {
		return "_subj(" + Joiner.on('/').join(getVerb()) + ", " + Joiner.on('/').join(getSubject()) + ")";
	}

} //SubjectRelationDefImpl
