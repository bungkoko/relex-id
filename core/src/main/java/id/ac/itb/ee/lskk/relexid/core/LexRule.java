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
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.LexRule#getMatchers <em>Matchers</em>}</li>
 * </ul>
 * </p>
 *
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getLexRule()
 * @model
 * @generated
 */
public interface LexRule extends ReplacementContainer {
	/**
	 * Returns the value of the '<em><b>Matchers</b></em>' containment reference list.
	 * The list contents are of type {@link id.ac.itb.ee.lskk.relexid.core.LexMatcher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Patterns to match.
	 * Each pattern is usually separated by whitespace, but sometimes it's not necessary to distinguish, for example, in "I love you." there is no separator between "you" and ".".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Matchers</em>' containment reference list.
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getLexRule_Matchers()
	 * @model containment="true"
	 * @generated
	 */
	EList<LexMatcher> getMatchers();

} // LexRule
