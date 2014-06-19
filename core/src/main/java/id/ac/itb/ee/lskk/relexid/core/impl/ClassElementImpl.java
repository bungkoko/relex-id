/**
 */
package id.ac.itb.ee.lskk.relexid.core.impl;

import id.ac.itb.ee.lskk.relexid.core.ClassElement;
import id.ac.itb.ee.lskk.relexid.core.RelexidPackage;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.ClassElementImpl#getSemanticClass <em>Semantic Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassElementImpl extends MinimalEObjectImpl.Container implements ClassElement {
	/**
	 * The default value of the '{@link #getSemanticClass() <em>Semantic Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticClass()
	 * @generated
	 * @ordered
	 */
	protected static final QName SEMANTIC_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemanticClass() <em>Semantic Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticClass()
	 * @generated
	 * @ordered
	 */
	protected QName semanticClass = SEMANTIC_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelexidPackage.Literals.CLASS_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getSemanticClass() {
		return semanticClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemanticClass(QName newSemanticClass) {
		QName oldSemanticClass = semanticClass;
		semanticClass = newSemanticClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.CLASS_ELEMENT__SEMANTIC_CLASS, oldSemanticClass, semanticClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelexidPackage.CLASS_ELEMENT__SEMANTIC_CLASS:
				return getSemanticClass();
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
			case RelexidPackage.CLASS_ELEMENT__SEMANTIC_CLASS:
				setSemanticClass((QName)newValue);
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
			case RelexidPackage.CLASS_ELEMENT__SEMANTIC_CLASS:
				setSemanticClass(SEMANTIC_CLASS_EDEFAULT);
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
			case RelexidPackage.CLASS_ELEMENT__SEMANTIC_CLASS:
				return SEMANTIC_CLASS_EDEFAULT == null ? semanticClass != null : !SEMANTIC_CLASS_EDEFAULT.equals(semanticClass);
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
		result.append(" (semanticClass: ");
		result.append(semanticClass);
		result.append(')');
		return result.toString();
	}

} //ClassElementImpl
