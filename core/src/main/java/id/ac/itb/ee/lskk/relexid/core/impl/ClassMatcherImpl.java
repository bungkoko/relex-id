/**
 */
package id.ac.itb.ee.lskk.relexid.core.impl;

import id.ac.itb.ee.lskk.relexid.core.ClassMatcher;
import id.ac.itb.ee.lskk.relexid.core.LexMatchResult;
import id.ac.itb.ee.lskk.relexid.core.PartOfSpeech;
import id.ac.itb.ee.lskk.relexid.core.RelEx;
import id.ac.itb.ee.lskk.relexid.core.RelexidPackage;

import java.lang.reflect.InvocationTargetException;
import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.ClassMatcherImpl#getSemanticClass <em>Semantic Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassMatcherImpl extends MinimalEObjectImpl.Container implements ClassMatcher {
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
	protected ClassMatcherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelexidPackage.Literals.CLASS_MATCHER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.CLASS_MATCHER__SEMANTIC_CLASS, oldSemanticClass, semanticClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LexMatchResult match(RelEx relex, PartOfSpeech part) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelexidPackage.CLASS_MATCHER__SEMANTIC_CLASS:
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
			case RelexidPackage.CLASS_MATCHER__SEMANTIC_CLASS:
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
			case RelexidPackage.CLASS_MATCHER__SEMANTIC_CLASS:
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
			case RelexidPackage.CLASS_MATCHER__SEMANTIC_CLASS:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RelexidPackage.CLASS_MATCHER___MATCH__PARTOFSPEECH:
				return match((RelEx)arguments.get(0), (PartOfSpeech)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
