/**
 */
package id.ac.itb.ee.lskk.relexid.core.impl;

import id.ac.itb.ee.lskk.relexid.core.LexElement;
import id.ac.itb.ee.lskk.relexid.core.LexReplacement;
import id.ac.itb.ee.lskk.relexid.core.LexRule;
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
 * An implementation of the model object '<em><b>Lex Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.LexRuleImpl#getReplacements <em>Replacements</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.LexRuleImpl#getPatterns <em>Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LexRuleImpl extends MinimalEObjectImpl.Container implements LexRule {
	/**
	 * The cached value of the '{@link #getReplacements() <em>Replacements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacements()
	 * @generated
	 * @ordered
	 */
	protected EList<LexReplacement> replacements;

	/**
	 * The cached value of the '{@link #getPatterns() <em>Patterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<LexElement> patterns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LexRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelexidPackage.Literals.LEX_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LexElement> getPatterns() {
		if (patterns == null) {
			patterns = new EObjectContainmentEList<LexElement>(LexElement.class, this, RelexidPackage.LEX_RULE__PATTERNS);
		}
		return patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LexReplacement> getReplacements() {
		if (replacements == null) {
			replacements = new EObjectContainmentEList<LexReplacement>(LexReplacement.class, this, RelexidPackage.LEX_RULE__REPLACEMENTS);
		}
		return replacements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RelexidPackage.LEX_RULE__REPLACEMENTS:
				return ((InternalEList<?>)getReplacements()).basicRemove(otherEnd, msgs);
			case RelexidPackage.LEX_RULE__PATTERNS:
				return ((InternalEList<?>)getPatterns()).basicRemove(otherEnd, msgs);
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
			case RelexidPackage.LEX_RULE__REPLACEMENTS:
				return getReplacements();
			case RelexidPackage.LEX_RULE__PATTERNS:
				return getPatterns();
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
			case RelexidPackage.LEX_RULE__REPLACEMENTS:
				getReplacements().clear();
				getReplacements().addAll((Collection<? extends LexReplacement>)newValue);
				return;
			case RelexidPackage.LEX_RULE__PATTERNS:
				getPatterns().clear();
				getPatterns().addAll((Collection<? extends LexElement>)newValue);
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
			case RelexidPackage.LEX_RULE__REPLACEMENTS:
				getReplacements().clear();
				return;
			case RelexidPackage.LEX_RULE__PATTERNS:
				getPatterns().clear();
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
			case RelexidPackage.LEX_RULE__REPLACEMENTS:
				return replacements != null && !replacements.isEmpty();
			case RelexidPackage.LEX_RULE__PATTERNS:
				return patterns != null && !patterns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LexRuleImpl
