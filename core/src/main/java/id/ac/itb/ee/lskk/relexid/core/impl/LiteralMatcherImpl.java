/**
 */
package id.ac.itb.ee.lskk.relexid.core.impl;

import id.ac.itb.ee.lskk.relexid.core.CapturingGroup;
import id.ac.itb.ee.lskk.relexid.core.LexMatchResult;
import id.ac.itb.ee.lskk.relexid.core.LiteralMatcher;
import id.ac.itb.ee.lskk.relexid.core.PartOfSpeech;
import id.ac.itb.ee.lskk.relexid.core.RelEx;
import id.ac.itb.ee.lskk.relexid.core.RelexidPackage;
import id.ac.itb.ee.lskk.relexid.core.UnrecognizedPart;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import com.google.common.base.Joiner;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.LiteralMatcherImpl#getLiterals <em>Literals</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.LiteralMatcherImpl#isCaseSensitive <em>Case Sensitive</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiteralMatcherImpl extends MinimalEObjectImpl.Container implements LiteralMatcher {
	/**
	 * The cached value of the '{@link #getLiterals() <em>Literals</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiterals()
	 * @generated
	 * @ordered
	 */
	protected EList<String> literals;

	/**
	 * The default value of the '{@link #isCaseSensitive() <em>Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCaseSensitive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CASE_SENSITIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCaseSensitive() <em>Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCaseSensitive()
	 * @generated
	 * @ordered
	 */
	protected boolean caseSensitive = CASE_SENSITIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralMatcherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelexidPackage.Literals.LITERAL_MATCHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCaseSensitive() {
		return caseSensitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaseSensitive(boolean newCaseSensitive) {
		boolean oldCaseSensitive = caseSensitive;
		caseSensitive = newCaseSensitive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.LITERAL_MATCHER__CASE_SENSITIVE, oldCaseSensitive, caseSensitive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public LexMatchResult match(RelEx relex, final PartOfSpeech part) {
		if (!(part instanceof UnrecognizedPart)) {
			return LexMatchResult.MISMATCH;
		}
		
		final boolean matches;
		if (isCaseSensitive()) {
			matches = FluentIterable.from(getLiterals()).anyMatch(new Predicate<String>() {
				@Override
				public boolean apply(String input) {
					return part.getLiteral().equals(input);
				}
			});
		} else {
			matches = FluentIterable.from(getLiterals()).anyMatch(new Predicate<String>() {
				@Override
				public boolean apply(String input) {
					return part.getLiteral().equalsIgnoreCase(input);
				}
			});
		}
		if (matches) {
			return new LexMatchResult(1, new CapturingGroup());
		} else {
			return LexMatchResult.MISMATCH;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getLiterals() {
		if (literals == null) {
			literals = new EDataTypeUniqueEList<String>(String.class, this, RelexidPackage.LITERAL_MATCHER__LITERALS);
		}
		return literals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelexidPackage.LITERAL_MATCHER__LITERALS:
				return getLiterals();
			case RelexidPackage.LITERAL_MATCHER__CASE_SENSITIVE:
				return isCaseSensitive();
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
			case RelexidPackage.LITERAL_MATCHER__LITERALS:
				getLiterals().clear();
				getLiterals().addAll((Collection<? extends String>)newValue);
				return;
			case RelexidPackage.LITERAL_MATCHER__CASE_SENSITIVE:
				setCaseSensitive((Boolean)newValue);
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
			case RelexidPackage.LITERAL_MATCHER__LITERALS:
				getLiterals().clear();
				return;
			case RelexidPackage.LITERAL_MATCHER__CASE_SENSITIVE:
				setCaseSensitive(CASE_SENSITIVE_EDEFAULT);
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
			case RelexidPackage.LITERAL_MATCHER__LITERALS:
				return literals != null && !literals.isEmpty();
			case RelexidPackage.LITERAL_MATCHER__CASE_SENSITIVE:
				return caseSensitive != CASE_SENSITIVE_EDEFAULT;
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
			case RelexidPackage.LITERAL_MATCHER___MATCH__PARTOFSPEECH:
				return match((RelEx)arguments.get(0), (PartOfSpeech)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String toString() {
		return "'" + Joiner.on('|').join(literals) + "'";
	}

} //LiteralElementImpl
