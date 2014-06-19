/**
 */
package id.ac.itb.ee.lskk.relexid.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pronoun Case</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getPronounCase()
 * @model
 * @generated
 */
public enum PronounCase implements Enumerator {
	/**
	 * The '<em><b>Subject</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	SUBJECT(0, "subject", "subject"),

	/**
	 * The '<em><b>Object</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	OBJECT(1, "object", "object");

	/**
	 * The '<em><b>Subject</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Subject</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBJECT
	 * @model name="subject"
	 * @generated
	 * @ordered
	 */
	public static final int SUBJECT_VALUE = 0;

	/**
	 * The '<em><b>Object</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Object</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBJECT
	 * @model name="object"
	 * @generated
	 * @ordered
	 */
	public static final int OBJECT_VALUE = 1;

	/**
	 * An array of all the '<em><b>Pronoun Case</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PronounCase[] VALUES_ARRAY =
		new PronounCase[] {
			SUBJECT,
			OBJECT,
		};

	/**
	 * A public read-only list of all the '<em><b>Pronoun Case</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PronounCase> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pronoun Case</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PronounCase get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PronounCase result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pronoun Case</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PronounCase getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PronounCase result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pronoun Case</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PronounCase get(int value) {
		switch (value) {
			case SUBJECT_VALUE: return SUBJECT;
			case OBJECT_VALUE: return OBJECT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PronounCase(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PronounCase
