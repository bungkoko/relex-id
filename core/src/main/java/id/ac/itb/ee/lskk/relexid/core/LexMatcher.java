/**
 */
package id.ac.itb.ee.lskk.relexid.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lex Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getLexMatcher()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface LexMatcher extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether the given {@code part} (which is usually {@link UnrecognizedPath}, but not always in case of {@link RecognizedMatcher}) matches
	 * 
	 * @todo For now it has {@code relex} parameter for convenience, but later it should be replaced with a clean {@code context} interface.
	 * <!-- end-model-doc -->
	 * @model dataType="id.ac.itb.ee.lskk.relexid.core.LexMatchResult" required="true" relexDataType="id.ac.itb.ee.lskk.relexid.core.RelEx"
	 * @generated
	 */
	LexMatchResult match(RelEx relex, PartOfSpeech part);
} // LexElement
