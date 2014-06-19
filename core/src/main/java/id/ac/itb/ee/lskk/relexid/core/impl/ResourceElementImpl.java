/**
 */
package id.ac.itb.ee.lskk.relexid.core.impl;

import id.ac.itb.ee.lskk.relexid.core.RelexidPackage;
import id.ac.itb.ee.lskk.relexid.core.ResourceElement;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.ResourceElementImpl#getSemanticClass <em>Semantic Class</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.ResourceElementImpl#getSemanticClassRef <em>Semantic Class Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceElementImpl extends MinimalEObjectImpl.Container implements ResourceElement {
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
	 * The default value of the '{@link #getSemanticClassRef() <em>Semantic Class Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticClassRef()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMANTIC_CLASS_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemanticClassRef() <em>Semantic Class Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticClassRef()
	 * @generated
	 * @ordered
	 */
	protected String semanticClassRef = SEMANTIC_CLASS_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelexidPackage.Literals.RESOURCE_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.RESOURCE_ELEMENT__SEMANTIC_CLASS, oldSemanticClass, semanticClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSemanticClassRef() {
		return semanticClassRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemanticClassRef(String newSemanticClassRef) {
		String oldSemanticClassRef = semanticClassRef;
		semanticClassRef = newSemanticClassRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.RESOURCE_ELEMENT__SEMANTIC_CLASS_REF, oldSemanticClassRef, semanticClassRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelexidPackage.RESOURCE_ELEMENT__SEMANTIC_CLASS:
				return getSemanticClass();
			case RelexidPackage.RESOURCE_ELEMENT__SEMANTIC_CLASS_REF:
				return getSemanticClassRef();
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
			case RelexidPackage.RESOURCE_ELEMENT__SEMANTIC_CLASS:
				setSemanticClass((QName)newValue);
				return;
			case RelexidPackage.RESOURCE_ELEMENT__SEMANTIC_CLASS_REF:
				setSemanticClassRef((String)newValue);
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
			case RelexidPackage.RESOURCE_ELEMENT__SEMANTIC_CLASS:
				setSemanticClass(SEMANTIC_CLASS_EDEFAULT);
				return;
			case RelexidPackage.RESOURCE_ELEMENT__SEMANTIC_CLASS_REF:
				setSemanticClassRef(SEMANTIC_CLASS_REF_EDEFAULT);
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
			case RelexidPackage.RESOURCE_ELEMENT__SEMANTIC_CLASS:
				return SEMANTIC_CLASS_EDEFAULT == null ? semanticClass != null : !SEMANTIC_CLASS_EDEFAULT.equals(semanticClass);
			case RelexidPackage.RESOURCE_ELEMENT__SEMANTIC_CLASS_REF:
				return SEMANTIC_CLASS_REF_EDEFAULT == null ? semanticClassRef != null : !SEMANTIC_CLASS_REF_EDEFAULT.equals(semanticClassRef);
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
		result.append(", semanticClassRef: ");
		result.append(semanticClassRef);
		result.append(')');
		return result.toString();
	}

} //ResourceElementImpl
