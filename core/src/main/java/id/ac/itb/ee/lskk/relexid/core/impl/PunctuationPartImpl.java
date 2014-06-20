/**
 */
package id.ac.itb.ee.lskk.relexid.core.impl;

import id.ac.itb.ee.lskk.relexid.core.GeneratedLiteral;
import id.ac.itb.ee.lskk.relexid.core.Punctuation;
import id.ac.itb.ee.lskk.relexid.core.PunctuationPart;
import id.ac.itb.ee.lskk.relexid.core.RelexidFactory;
import id.ac.itb.ee.lskk.relexid.core.RelexidPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import java.util.Map;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Punctuation Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.PunctuationPartImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.PunctuationPartImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.PunctuationPartImpl#getWord <em>Word</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.impl.PunctuationPartImpl#getPunctuation <em>Punctuation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PunctuationPartImpl extends MinimalEObjectImpl.Container implements PunctuationPart {
	
	public static final PunctuationPart FULL_STOP;
	public static final PunctuationPart COMMA;
	public static final PunctuationPart QUESTION;
	public static final PunctuationPart EXCLAMATION;
	
	static {
		FULL_STOP = RelexidFactory.eINSTANCE.createPunctuationPart();
		FULL_STOP.setPunctuation(Punctuation.FULL_STOP);
		FULL_STOP.setLiteral(".");
		FULL_STOP.setResource(new QName("http://dbpedia.org/resource/", "Full_stop", "dbpedia"));
		COMMA = RelexidFactory.eINSTANCE.createPunctuationPart();
		COMMA.setPunctuation(Punctuation.COMMA);
		COMMA.setLiteral(".");
		COMMA.setResource(new QName("http://dbpedia.org/resource/", "Comma", "dbpedia"));
		QUESTION = RelexidFactory.eINSTANCE.createPunctuationPart();
		QUESTION.setPunctuation(Punctuation.QUESTION);
		QUESTION.setLiteral(".");
		QUESTION.setResource(new QName("http://dbpedia.org/resource/", "Question_mark", "dbpedia"));
		EXCLAMATION = RelexidFactory.eINSTANCE.createPunctuationPart();
		EXCLAMATION.setPunctuation(Punctuation.EXCLAMATION);
		EXCLAMATION.setLiteral(".");
		EXCLAMATION.setResource(new QName("http://dbpedia.org/resource/", "Exclamation_mark", "dbpedia"));
	}
	
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
	 * The default value of the '{@link #getWord() <em>Word</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWord()
	 * @generated
	 * @ordered
	 */
	protected static final QName WORD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getWord() <em>Word</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWord()
	 * @generated
	 * @ordered
	 */
	protected QName word = WORD_EDEFAULT;
	/**
	 * The default value of the '{@link #getPunctuation() <em>Punctuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPunctuation()
	 * @generated
	 * @ordered
	 */
	protected static final Punctuation PUNCTUATION_EDEFAULT = Punctuation.FULL_STOP;

	/**
	 * The cached value of the '{@link #getPunctuation() <em>Punctuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPunctuation()
	 * @generated
	 * @ordered
	 */
	protected Punctuation punctuation = PUNCTUATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PunctuationPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelexidPackage.Literals.PUNCTUATION_PART;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.PUNCTUATION_PART__LITERAL, oldLiteral, literal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.PUNCTUATION_PART__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getWord() {
		return word;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWord(QName newWord) {
		QName oldWord = word;
		word = newWord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.PUNCTUATION_PART__WORD, oldWord, word));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Punctuation getPunctuation() {
		return punctuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPunctuation(Punctuation newPunctuation) {
		Punctuation oldPunctuation = punctuation;
		punctuation = newPunctuation == null ? PUNCTUATION_EDEFAULT : newPunctuation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelexidPackage.PUNCTUATION_PART__PUNCTUATION, oldPunctuation, punctuation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public GeneratedLiteral generate(Locale locale, Map<String, String> dict) {
		GeneratedLiteral genLiteral = RelexidFactory.eINSTANCE.createGeneratedLiteral();
		genLiteral.setLiteral(getLiteral());
		genLiteral.setPreSeparated(false);
		return genLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelexidPackage.PUNCTUATION_PART__LITERAL:
				return getLiteral();
			case RelexidPackage.PUNCTUATION_PART__RESOURCE:
				return getResource();
			case RelexidPackage.PUNCTUATION_PART__WORD:
				return getWord();
			case RelexidPackage.PUNCTUATION_PART__PUNCTUATION:
				return getPunctuation();
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
			case RelexidPackage.PUNCTUATION_PART__LITERAL:
				setLiteral((String)newValue);
				return;
			case RelexidPackage.PUNCTUATION_PART__RESOURCE:
				setResource((QName)newValue);
				return;
			case RelexidPackage.PUNCTUATION_PART__WORD:
				setWord((QName)newValue);
				return;
			case RelexidPackage.PUNCTUATION_PART__PUNCTUATION:
				setPunctuation((Punctuation)newValue);
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
			case RelexidPackage.PUNCTUATION_PART__LITERAL:
				setLiteral(LITERAL_EDEFAULT);
				return;
			case RelexidPackage.PUNCTUATION_PART__RESOURCE:
				setResource(RESOURCE_EDEFAULT);
				return;
			case RelexidPackage.PUNCTUATION_PART__WORD:
				setWord(WORD_EDEFAULT);
				return;
			case RelexidPackage.PUNCTUATION_PART__PUNCTUATION:
				setPunctuation(PUNCTUATION_EDEFAULT);
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
			case RelexidPackage.PUNCTUATION_PART__LITERAL:
				return LITERAL_EDEFAULT == null ? literal != null : !LITERAL_EDEFAULT.equals(literal);
			case RelexidPackage.PUNCTUATION_PART__RESOURCE:
				return RESOURCE_EDEFAULT == null ? resource != null : !RESOURCE_EDEFAULT.equals(resource);
			case RelexidPackage.PUNCTUATION_PART__WORD:
				return WORD_EDEFAULT == null ? word != null : !WORD_EDEFAULT.equals(word);
			case RelexidPackage.PUNCTUATION_PART__PUNCTUATION:
				return punctuation != PUNCTUATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
			case RelexidPackage.PUNCTUATION_PART___GENERATE__LOCALE_MAP:
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
		return getLiteral();
	}

} //PunctuationPartImpl
