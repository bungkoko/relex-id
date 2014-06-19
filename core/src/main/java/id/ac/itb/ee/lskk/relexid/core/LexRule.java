/**
 */
package id.ac.itb.ee.lskk.relexid.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lex Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.LexRule#getPatterns <em>Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getLexRule()
 * @model
 * @generated
 */
public interface LexRule extends ReplacementContainer {
	/**
	 * Returns the value of the '<em><b>Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link id.ac.itb.ee.lskk.relexid.core.LexElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Patterns to match.
	 * Each pattern is usually separated by whitespace, but sometimes it's not necessary to distinguish, for example, in "I love you." there is no separator between "you" and ".".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patterns</em>' containment reference list.
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getLexRule_Patterns()
	 * @model containment="true"
	 * @generated
	 */
	EList<LexElement> getPatterns();

} // LexRule
