/**
 */
package id.ac.itb.ee.lskk.relexid.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recognized Replacement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * "Replaces" with already recognized Part. Basically it's a way to specify noop.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link id.ac.itb.ee.lskk.relexid.core.RecognizedReplacement#getCapturingGroup <em>Capturing Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getRecognizedReplacement()
 * @model
 * @generated
 */
public interface RecognizedReplacement extends LexReplacement {
	/**
	 * Returns the value of the '<em><b>Capturing Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capturing Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capturing Group</em>' attribute.
	 * @see #setCapturingGroup(int)
	 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getRecognizedReplacement_CapturingGroup()
	 * @model required="true"
	 * @generated
	 */
	int getCapturingGroup();

	/**
	 * Sets the value of the '{@link id.ac.itb.ee.lskk.relexid.core.RecognizedReplacement#getCapturingGroup <em>Capturing Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capturing Group</em>' attribute.
	 * @see #getCapturingGroup()
	 * @generated
	 */
	void setCapturingGroup(int value);

} // RecognizedReplacement
