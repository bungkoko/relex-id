/**
 */
package id.ac.itb.ee.lskk.relexid.core.impl;

import id.ac.itb.ee.lskk.relexid.core.GeneratedLiteral;
import id.ac.itb.ee.lskk.relexid.core.PartContainer;
import id.ac.itb.ee.lskk.relexid.core.PartOfSpeech;
import id.ac.itb.ee.lskk.relexid.core.RelexidFactory;
import id.ac.itb.ee.lskk.relexid.core.RelexidPackage;
import id.ac.itb.ee.lskk.relexid.core.VerbPart;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.commons.ToStringFunction;

import com.google.common.base.Joiner;
import com.google.common.collect.FluentIterable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verb Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.VerbPartImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.VerbPartImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.VerbPartImpl#getParts <em>Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VerbPartImpl extends MinimalEObjectImpl.Container implements VerbPart {
	
	private static final Logger log = LoggerFactory
			.getLogger(VerbPartImpl.class);
	
	/**
	 * The default value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final String LITERAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteral()
	 * @generated
	 * @ordered
	 */
	protected String literal = LITERAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected static final QName RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected QName resource = RESOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParts() <em>Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected EList<PartOfSpeech> parts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerbPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelexidPackage.Literals.VERB_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLiteral(String newLiteral) {
		String oldLiteral = literal;
		literal = newLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.VERB_PART__LITERAL, oldLiteral, literal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResource(QName newResource) {
		QName oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.VERB_PART__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PartOfSpeech> getParts() {
		if (parts == null) {
			parts = new EObjectContainmentEList<PartOfSpeech>(PartOfSpeech.class, this, RelexidPackage.VERB_PART__PARTS);
		}
		return parts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public GeneratedLiteral generate(Locale locale, Map<String, String> dict) {
		String result = "";
		final String resourceUri = getResource().getNamespaceURI() + getResource().getLocalPart();
		if (dict.containsKey(resourceUri)) {
			result += dict.get(resourceUri);
		} else {
			result += getResource().toString();
			log.warn("Resource {} not in dictionary for {} with {} entries",
					getResource(), locale, dict.size());
		}
		for (PartOfSpeech part : getParts()) {
			final GeneratedLiteral literal = part.generate(locale, dict);
			if (literal.isPreSeparated() && !result.isEmpty()) {
				result += " ";
			}
			result += literal.getLiteral();
		}
		GeneratedLiteral generatedLiteral = RelexidFactory.eINSTANCE.createGeneratedLiteral();
		generatedLiteral.setLiteral(result);
		return generatedLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RelexidPackage.VERB_PART__PARTS:
				return ((InternalEList<?>)getParts()).basicRemove(otherEnd, msgs);
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
			case RelexidPackage.VERB_PART__LITERAL:
				return getLiteral();
			case RelexidPackage.VERB_PART__RESOURCE:
				return getResource();
			case RelexidPackage.VERB_PART__PARTS:
				return getParts();
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
			case RelexidPackage.VERB_PART__LITERAL:
				setLiteral((String)newValue);
				return;
			case RelexidPackage.VERB_PART__RESOURCE:
				setResource((QName)newValue);
				return;
			case RelexidPackage.VERB_PART__PARTS:
				getParts().clear();
				getParts().addAll((Collection<? extends PartOfSpeech>)newValue);
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
			case RelexidPackage.VERB_PART__LITERAL:
				setLiteral(LITERAL_EDEFAULT);
				return;
			case RelexidPackage.VERB_PART__RESOURCE:
				setResource(RESOURCE_EDEFAULT);
				return;
			case RelexidPackage.VERB_PART__PARTS:
				getParts().clear();
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
			case RelexidPackage.VERB_PART__LITERAL:
				return LITERAL_EDEFAULT == null ? literal != null : !LITERAL_EDEFAULT.equals(literal);
			case RelexidPackage.VERB_PART__RESOURCE:
				return RESOURCE_EDEFAULT == null ? resource != null : !RESOURCE_EDEFAULT.equals(resource);
			case RelexidPackage.VERB_PART__PARTS:
				return parts != null && !parts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == PartContainer.class) {
			switch (derivedFeatureID) {
				case RelexidPackage.VERB_PART__PARTS: return RelexidPackage.PART_CONTAINER__PARTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == PartContainer.class) {
			switch (baseFeatureID) {
				case RelexidPackage.PART_CONTAINER__PARTS: return RelexidPackage.VERB_PART__PARTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RelexidPackage.VERB_PART___GENERATE__LOCALE_MAP:
				return generate((Locale)arguments.get(0), (Map<String, String>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String toString() {
		return "(VP " + getResource().getPrefix() + ":" + getResource().getLocalPart() + " " +
				Joiner.on(' ').join(FluentIterable.from(getParts()).transform(new ToStringFunction<>())) + ")";
	}

} //VerbPartImpl
