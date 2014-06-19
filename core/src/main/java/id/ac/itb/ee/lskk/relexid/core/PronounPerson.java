/**
 */
package id.ac.itb.ee.lskk.relexid.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pronoun Person</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getPronounPerson()
 * @model
 * @generated
 */
public enum PronounPerson implements Enumerator {
	/**
	 * The '<em><b>First</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_VALUE
	 * @generated
	 * @ordered
	 */
	FIRST(0, "first", "first"),

	/**
	 * The '<em><b>Second</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECOND_VALUE
	 * @generated
	 * @ordered
	 */
	SECOND(1, "second", "second"),

	/**
	 * The '<em><b>Third</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRD_VALUE
	 * @generated
	 * @ordered
	 */
	THIRD(2, "third", "third");

	/**
	 * The '<em><b>First</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>First</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIRST
	 * @model name="first"
	 * @generated
	 * @ordered
	 */
	public static final int FIRST_VALUE = 0;

	/**
	 * The '<em><b>Second</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Second</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECOND
	 * @model name="second"
	 * @generated
	 * @ordered
	 */
	public static final int SECOND_VALUE = 1;

	/**
	 * The '<em><b>Third</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Third</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THIRD
	 * @model name="third"
	 * @generated
	 * @ordered
	 */
	public static final int THIRD_VALUE = 2;

	/**
	 * An array of all the '<em><b>Pronoun Person</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PronounPerson[] VALUES_ARRAY =
		new PronounPerson[] {
			FIRST,
			SECOND,
			THIRD,
		};

	/**
	 * A public read-only list of all the '<em><b>Pronoun Person</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PronounPerson> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pronoun Person</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PronounPerson get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PronounPerson result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pronoun Person</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PronounPerson getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PronounPerson result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pronoun Person</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PronounPerson get(int value) {
		switch (value) {
			case FIRST_VALUE: return FIRST;
			case SECOND_VALUE: return SECOND;
			case THIRD_VALUE: return THIRD;
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
	private PronounPerson(int value, String name, String literal) {
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
	
} //PronounPerson
