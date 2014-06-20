/**
 */
package id.ac.itb.ee.lskk.relexid.core.impl;

import id.ac.itb.ee.lskk.relexid.core.PartMatcher;
import id.ac.itb.ee.lskk.relexid.core.RelationDef;
import id.ac.itb.ee.lskk.relexid.core.RelationRule;
import id.ac.itb.ee.lskk.relexid.core.RelexidPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.RelationRuleImpl#getMatchers <em>Matchers</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.RelationRuleImpl#getRelationDefs <em>Relation Defs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationRuleImpl extends MinimalEObjectImpl.Container implements RelationRule {
	/**
	 * The cached value of the '{@link #getMatchers() <em>Matchers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchers()
	 * @generated
	 * @ordered
	 */
	protected EList<PartMatcher> matchers;

	/**
	 * The cached value of the '{@link #getRelationDefs() <em>Relation Defs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationDefs()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationDef> relationDefs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelexidPackage.Literals.RELATION_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartMatcher> getMatchers() {
		if (matchers == null) {
			matchers = new EObjectContainmentEList<PartMatcher>(PartMatcher.class, this, RelexidPackage.RELATION_RULE__MATCHERS);
		}
		return matchers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationDef> getRelationDefs() {
		if (relationDefs == null) {
			relationDefs = new EObjectContainmentEList<RelationDef>(RelationDef.class, this, RelexidPackage.RELATION_RULE__RELATION_DEFS);
		}
		return relationDefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RelexidPackage.RELATION_RULE__MATCHERS:
				return ((InternalEList<?>)getMatchers()).basicRemove(otherEnd, msgs);
			case RelexidPackage.RELATION_RULE__RELATION_DEFS:
				return ((InternalEList<?>)getRelationDefs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelexidPackage.RELATION_RULE__MATCHERS:
				return getMatchers();
			case RelexidPackage.RELATION_RULE__RELATION_DEFS:
				return getRelationDefs();
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
			case RelexidPackage.RELATION_RULE__MATCHERS:
				getMatchers().clear();
				getMatchers().addAll((Collection<? extends PartMatcher>)newValue);
				return;
			case RelexidPackage.RELATION_RULE__RELATION_DEFS:
				getRelationDefs().clear();
				getRelationDefs().addAll((Collection<? extends RelationDef>)newValue);
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
			case RelexidPackage.RELATION_RULE__MATCHERS:
				getMatchers().clear();
				return;
			case RelexidPackage.RELATION_RULE__RELATION_DEFS:
				getRelationDefs().clear();
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
			case RelexidPackage.RELATION_RULE__MATCHERS:
				return matchers != null && !matchers.isEmpty();
			case RelexidPackage.RELATION_RULE__RELATION_DEFS:
				return relationDefs != null && !relationDefs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RelationRuleImpl
