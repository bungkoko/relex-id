/**
 */
package id.ac.itb.ee.lskk.relexid.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pronoun Number</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getPronounNumber()
 * @model
 * @generated
 */
public enum PronounNumber implements Enumerator {
	/**
	 * The '<em><b>Singular</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGULAR_VALUE
	 * @generated
	 * @ordered
	 */
	SINGULAR(0, "singular", "singular"),

	/**
	 * The '<em><b>Plural</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLURAL_VALUE
	 * @generated
	 * @ordered
	 */
	PLURAL(1, "plural", "plural");

	/**
	 * The '<em><b>Singular</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Singular</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SINGULAR
	 * @model name="singular"
	 * @generated
	 * @ordered
	 */
	public static final int SINGULAR_VALUE = 0;

	/**
	 * The '<em><b>Plural</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Plural</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLURAL
	 * @model name="plural"
	 * @generated
	 * @ordered
	 */
	public static final int PLURAL_VALUE = 1;

	/**
	 * An array of all the '<em><b>Pronoun Number</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PronounNumber[] VALUES_ARRAY =
		new PronounNumber[] {
			SINGULAR,
			PLURAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Pronoun Number</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PronounNumber> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pronoun Number</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PronounNumber get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PronounNumber result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pronoun Number</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PronounNumber getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PronounNumber result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pronoun Number</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PronounNumber get(int value) {
		switch (value) {
			case SINGULAR_VALUE: return SINGULAR;
			case PLURAL_VALUE: return PLURAL;
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
	private PronounNumber(int value, String name, String literal) {
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
	
} //PronounNumber
