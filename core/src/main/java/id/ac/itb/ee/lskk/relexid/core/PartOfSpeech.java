/**
 */
package id.ac.itb.ee.lskk.relexid.core;

import java.util.Locale;
import java.util.Map;
import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part Of Speech</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.PartOfSpeech#getLiteral <em>Literal</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.PartOfSpeech#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getPartOfSpeech()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface PartOfSpeech extends EObject {
	/**
	 * Returns the value of the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Literal part text without preprocessing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Literal</em>' attribute.
	 * @see #setLiteral(String)
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getPartOfSpeech_Literal()
	 * @model required="true"
	 * @generated
	 */
	String getLiteral();

	/**
	 * Sets the value of the '{@link id.ac.itb.ee.lskk.relexid.core.PartOfSpeech#getLiteral <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' attribute.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(String value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Semantic resource (if known).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' attribute.
	 * @see #setResource(QName)
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getPartOfSpeech_Resource()
	 * @model dataType="id.ac.itb.ee.lskk.relexid.core.QName"
	 * @generated
	 */
	QName getResource();

	/**
	 * Sets the value of the '{@link id.ac.itb.ee.lskk.relexid.core.PartOfSpeech#getResource <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' attribute.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(QName value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generate a readable {@link GeneratedLiteral} in the specified locale.
	 * 
	 * @param The translations of resources in this locale's language. Key is resource URI and value is literal.
	 * <!-- end-model-doc -->
	 * @model required="true" localeDataType="id.ac.itb.ee.lskk.relexid.core.Locale"
	 * @generated
	 */
	GeneratedLiteral generate(Locale locale, Map<String, String> dict);

} // PartOfSpeech
