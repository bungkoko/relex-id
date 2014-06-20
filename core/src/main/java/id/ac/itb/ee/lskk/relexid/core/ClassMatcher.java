/**
 */
package id.ac.itb.ee.lskk.relexid.core;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Refers to an RDF class itself (e.g. {@code dbpedia-owl:Animal}).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.ClassMatcher#getSemanticClass <em>Semantic Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getClassMatcher()
 * @model
 * @generated
 */
public interface ClassMatcher extends LexMatcher {
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
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getClassMatcher_SemanticClass()
	 * @model dataType="id.ac.itb.ee.lskk.relexid.core.QName"
	 * @generated
	 */
	QName getSemanticClass();

	/**
	 * Sets the value of the '{@link id.ac.itb.ee.lskk.relexid.core.ClassMatcher#getSemanticClass <em>Semantic Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Class</em>' attribute.
	 * @see #getSemanticClass()
	 * @generated
	 */
	void setSemanticClass(QName value);

} // ClassElement
