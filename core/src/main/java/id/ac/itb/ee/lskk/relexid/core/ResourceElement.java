/**
 */
package id.ac.itb.ee.lskk.relexid.core;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Refers to an RDF resource (e.g. {@code dbpedia:Elephant}) of a specific class (e.g. {@code dbpedia-owl:Animal}).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.ResourceElement#getSemanticClass <em>Semantic Class</em>}</li>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.ResourceElement#getSemanticClassRef <em>Semantic Class Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getResourceElement()
 * @model
 * @generated
 */
public interface ResourceElement extends LexElement {
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
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getResourceElement_SemanticClass()
	 * @model dataType="id.ac.itb.ee.lskk.relexid.core.QName"
	 * @generated
	 */
	QName getSemanticClass();

	/**
	 * Sets the value of the '{@link id.ac.itb.ee.lskk.relexid.core.ResourceElement#getSemanticClass <em>Semantic Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Class</em>' attribute.
	 * @see #getSemanticClass()
	 * @generated
	 */
	void setSemanticClass(QName value);

	/**
	 * Returns the value of the '<em><b>Semantic Class Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Since semanticClass is hard to ser/deser as XMI, this is a convenience attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Semantic Class Ref</em>' attribute.
	 * @see #setSemanticClassRef(String)
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getResourceElement_SemanticClassRef()
	 * @model
	 * @generated
	 */
	String getSemanticClassRef();

	/**
	 * Sets the value of the '{@link id.ac.itb.ee.lskk.relexid.core.ResourceElement#getSemanticClassRef <em>Semantic Class Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Class Ref</em>' attribute.
	 * @see #getSemanticClassRef()
	 * @generated
	 */
	void setSemanticClassRef(String value);

} // ResourceElement
