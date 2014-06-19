/**
 */
package id.ac.itb.ee.lskk.relexid.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Question</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getQuestion()
 * @model
 * @generated
 */
public enum Question implements Enumerator {
	/**
	 * The '<em><b>What</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHAT_VALUE
	 * @generated
	 * @ordered
	 */
	WHAT(0, "what", "what"),

	/**
	 * The '<em><b>Who</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHO_VALUE
	 * @generated
	 * @ordered
	 */
	WHO(1, "who", "who"),

	/**
	 * The '<em><b>When</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHEN_VALUE
	 * @generated
	 * @ordered
	 */
	WHEN(2, "when", "when"),

	/**
	 * The '<em><b>Where</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHERE_VALUE
	 * @generated
	 * @ordered
	 */
	WHERE(3, "where", "where"),

	/**
	 * The '<em><b>How</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOW_VALUE
	 * @generated
	 * @ordered
	 */
	HOW(4, "how", "how");

	/**
	 * The '<em><b>What</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>What</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHAT
	 * @model name="what"
	 * @generated
	 * @ordered
	 */
	public static final int WHAT_VALUE = 0;

	/**
	 * The '<em><b>Who</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Who</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHO
	 * @model name="who"
	 * @generated
	 * @ordered
	 */
	public static final int WHO_VALUE = 1;

	/**
	 * The '<em><b>When</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>When</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHEN
	 * @model name="when"
	 * @generated
	 * @ordered
	 */
	public static final int WHEN_VALUE = 2;

	/**
	 * The '<em><b>Where</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Where</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHERE
	 * @model name="where"
	 * @generated
	 * @ordered
	 */
	public static final int WHERE_VALUE = 3;

	/**
	 * The '<em><b>How</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>How</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOW
	 * @model name="how"
	 * @generated
	 * @ordered
	 */
	public static final int HOW_VALUE = 4;

	/**
	 * An array of all the '<em><b>Question</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Question[] VALUES_ARRAY =
		new Question[] {
			WHAT,
			WHO,
			WHEN,
			WHERE,
			HOW,
		};

	/**
	 * A public read-only list of all the '<em><b>Question</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Question> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Question</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Question get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Question result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Question</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Question getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Question result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Question</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Question get(int value) {
		switch (value) {
			case WHAT_VALUE: return WHAT;
			case WHO_VALUE: return WHO;
			case WHEN_VALUE: return WHEN;
			case WHERE_VALUE: return WHERE;
			case HOW_VALUE: return HOW;
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
	private Question(int value, String name, String literal) {
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
	
} //Question
