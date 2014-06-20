/**
 */
package id.ac.itb.ee.lskk.relexid.core.impl;

import id.ac.itb.ee.lskk.relexid.core.ObjectRelationDef;
import id.ac.itb.ee.lskk.relexid.core.RelexidPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import com.google.common.base.Joiner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Relation Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.ObjectRelationDefImpl#getVerb <em>Verb</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.ObjectRelationDefImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectRelationDefImpl extends MinimalEObjectImpl.Container implements ObjectRelationDef {
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
	 * The cached value of the '{@link #getObject() <em>Object</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> object;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectRelationDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelexidPackage.Literals.OBJECT_RELATION_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getVerb() {
		if (verb == null) {
			verb = new EDataTypeUniqueEList<Integer>(Integer.class, this, RelexidPackage.OBJECT_RELATION_DEF__VERB);
		}
		return verb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getObject() {
		if (object == null) {
			object = new EDataTypeUniqueEList<Integer>(Integer.class, this, RelexidPackage.OBJECT_RELATION_DEF__OBJECT);
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelexidPackage.OBJECT_RELATION_DEF__VERB:
				return getVerb();
			case RelexidPackage.OBJECT_RELATION_DEF__OBJECT:
				return getObject();
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
			case RelexidPackage.OBJECT_RELATION_DEF__VERB:
				getVerb().clear();
				getVerb().addAll((Collection<? extends Integer>)newValue);
				return;
			case RelexidPackage.OBJECT_RELATION_DEF__OBJECT:
				getObject().clear();
				getObject().addAll((Collection<? extends Integer>)newValue);
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
			case RelexidPackage.OBJECT_RELATION_DEF__VERB:
				getVerb().clear();
				return;
			case RelexidPackage.OBJECT_RELATION_DEF__OBJECT:
				getObject().clear();
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
			case RelexidPackage.OBJECT_RELATION_DEF__VERB:
				return verb != null && !verb.isEmpty();
			case RelexidPackage.OBJECT_RELATION_DEF__OBJECT:
				return object != null && !object.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String toString() {
		return "_obj(" + Joiner.on('/').join(getVerb()) + ", " + Joiner.on('/').join(getObject()) + ")";
	}

} //ObjectRelationDefImpl
