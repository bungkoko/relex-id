/**
 */
package id.ac.itb.ee.lskk.relexid.core;

import java.util.Locale;
import java.util.Map;
import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sentence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.Sentence#getLiteral <em>Literal</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.Sentence#getRelations <em>Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getSentence()
 * @model
 * @generated
 */
public interface Sentence extends PartContainer {
	/**
	 * Returns the value of the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Raw literal sentence without preprocessing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Literal</em>' attribute.
	 * @see #setLiteral(String)
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getSentence_Literal()
	 * @model required="true"
	 * @generated
	 */
	String getLiteral();

	/**
	 * Sets the value of the '{@link id.ac.itb.ee.lskk.relexid.core.Sentence#getLiteral <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' attribute.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(String value);

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link id.ac.itb.ee.lskk.relexid.core.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getSentence_Relations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Relation> getRelations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generate a readable sentence in the specified locale.
	 * 
	 * @param The translations of resources in this locale's language/variant. Note that informal dictionaries (i.e. bahasa gaul/alay) is a valid use case. Key is resource URI and value is literal.
	 * <!-- end-model-doc -->
	 * @model required="true" localeDataType="id.ac.itb.ee.lskk.relexid.core.Locale" translatorDataType="id.ac.itb.ee.lskk.relexid.core.Translator"
	 * @generated
	 */
	String generate(Locale locale, Map<String, String> dict, Translator translator);

} // Sentence
