/**
 */
package id.ac.itb.ee.lskk.relexid.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Punctuation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getPunctuation()
 * @model
 * @generated
 */
public enum Punctuation implements Enumerator {
	/**
	 * The '<em><b>Full stop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_STOP_VALUE
	 * @generated
	 * @ordered
	 */
	FULL_STOP(0, "full_stop", "full_stop"), /**
	 * The '<em><b>Exclamation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCLAMATION_VALUE
	 * @generated
	 * @ordered
	 */
	EXCLAMATION(2, "exclamation", "exclamation"),

	/**
	 * The '<em><b>Question</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUESTION_VALUE
	 * @generated
	 * @ordered
	 */
	QUESTION(1, "question", "question"), /**
	 * The '<em><b>Comma</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMA_VALUE
	 * @generated
	 * @ordered
	 */
	COMMA(3, "comma", "comma");

	/**
	 * The '<em><b>Full stop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Full stop</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FULL_STOP
	 * @model name="full_stop"
	 * @generated
	 * @ordered
	 */
	public static final int FULL_STOP_VALUE = 0;

	/**
	 * The '<em><b>Exclamation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Exclamation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXCLAMATION
	 * @model name="exclamation"
	 * @generated
	 * @ordered
	 */
	public static final int EXCLAMATION_VALUE = 2;

	/**
	 * The '<em><b>Question</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Question</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUESTION
	 * @model name="question"
	 * @generated
	 * @ordered
	 */
	public static final int QUESTION_VALUE = 1;

	/**
	 * The '<em><b>Comma</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Comma</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMMA
	 * @model name="comma"
	 * @generated
	 * @ordered
	 */
	public static final int COMMA_VALUE = 3;

	/**
	 * An array of all the '<em><b>Punctuation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Punctuation[] VALUES_ARRAY =
		new Punctuation[] {
			FULL_STOP,
			EXCLAMATION,
			QUESTION,
			COMMA,
		};

	/**
	 * A public read-only list of all the '<em><b>Punctuation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Punctuation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Punctuation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Punctuation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Punctuation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Punctuation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Punctuation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Punctuation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Punctuation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Punctuation get(int value) {
		switch (value) {
			case FULL_STOP_VALUE: return FULL_STOP;
			case EXCLAMATION_VALUE: return EXCLAMATION;
			case QUESTION_VALUE: return QUESTION;
			case COMMA_VALUE: return COMMA;
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
	private Punctuation(int value, String name, String literal) {
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
	
} //Punctuation
