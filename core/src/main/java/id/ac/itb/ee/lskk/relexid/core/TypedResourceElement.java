/**
 */
package id.ac.itb.ee.lskk.relexid.core;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Resource Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Refers to an RDF resource (e.g. {@code dbpedia:Elephant}) of a specific class (e.g. {@code dbpedia-owl:Animal}).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.TypedResourceElement#getSemanticClass <em>Semantic Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getTypedResourceElement()
 * @model
 * @generated
 */
public interface TypedResourceElement extends LexElement {
	/**
	 * Returns the value of the '<em><b>Semantic Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantic Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Class</em>' attribute.
	 * @see #setSemanticClass(QName)
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getTypedResourceElement_SemanticClass()
	 * @model dataType="id.ac.itb.ee.lskk.relexid.core.QName"
	 * @generated
	 */
	QName getSemanticClass();

	/**
	 * Sets the value of the '{@link id.ac.itb.ee.lskk.relexid.core.TypedResourceElement#getSemanticClass <em>Semantic Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Class</em>' attribute.
	 * @see #getSemanticClass()
	 * @generated
	 */
	void setSemanticClass(QName value);

} // TypedResourceElement
