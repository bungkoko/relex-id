/**
 */
package id.ac.itb.ee.lskk.relexid.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Part Of Speech Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see id.ac.itb.ee.lskk.relexid.core.RelexidPackage#getPartOfSpeechType()
 * @model
 * @generated
 */
public enum PartOfSpeechType implements Enumerator {
	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "unknown", "unknown"),

	/**
	 * The '<em><b>Noun</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOUN_VALUE
	 * @generated
	 * @ordered
	 */
	NOUN(7, "noun", "noun"),

	/**
	 * The '<em><b>Verb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERB_VALUE
	 * @generated
	 * @ordered
	 */
	VERB(1, "verb", "verb"),

	/**
	 * The '<em><b>Pronoun</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRONOUN_VALUE
	 * @generated
	 * @ordered
	 */
	PRONOUN(2, "pronoun", "pronoun"),

	/**
	 * The '<em><b>Preposition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREPOSITION_VALUE
	 * @generated
	 * @ordered
	 */
	PREPOSITION(3, "preposition", "preposition"),

	/**
	 * The '<em><b>Conjunction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONJUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	CONJUNCTION(4, "conjunction", "conjunction"),

	/**
	 * The '<em><b>Interjection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERJECTION_VALUE
	 * @generated
	 * @ordered
	 */
	INTERJECTION(5, "interjection", "interjection"),

	/**
	 * The '<em><b>Question</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUESTION_VALUE
	 * @generated
	 * @ordered
	 */
	QUESTION(6, "question", "question"), /**
	 * The '<em><b>Adjective</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADJECTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ADJECTIVE(8, "adjective", "adjective"), /**
	 * The '<em><b>Adjective satellite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADJECTIVE_SATELLITE_VALUE
	 * @generated
	 * @ordered
	 */
	ADJECTIVE_SATELLITE(9, "adjective_satellite", "adjective_satellite"), /**
	 * The '<em><b>Adverb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADVERB_VALUE
	 * @generated
	 * @ordered
	 */
	ADVERB(10, "adverb", "adverb");

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unknown</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

	/**
	 * The '<em><b>Noun</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Noun</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOUN
	 * @model name="noun"
	 * @generated
	 * @ordered
	 */
	public static final int NOUN_VALUE = 7;

	/**
	 * The '<em><b>Verb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Verb</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERB
	 * @model name="verb"
	 * @generated
	 * @ordered
	 */
	public static final int VERB_VALUE = 1;

	/**
	 * The '<em><b>Pronoun</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pronoun</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRONOUN
	 * @model name="pronoun"
	 * @generated
	 * @ordered
	 */
	public static final int PRONOUN_VALUE = 2;

	/**
	 * The '<em><b>Preposition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Preposition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREPOSITION
	 * @model name="preposition"
	 * @generated
	 * @ordered
	 */
	public static final int PREPOSITION_VALUE = 3;

	/**
	 * The '<em><b>Conjunction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Conjunction</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONJUNCTION
	 * @model name="conjunction"
	 * @generated
	 * @ordered
	 */
	public static final int CONJUNCTION_VALUE = 4;

	/**
	 * The '<em><b>Interjection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Interjection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERJECTION
	 * @model name="interjection"
	 * @generated
	 * @ordered
	 */
	public static final int INTERJECTION_VALUE = 5;

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
	public static final int QUESTION_VALUE = 6;

	/**
	 * The '<em><b>Adjective</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Adjective</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADJECTIVE
	 * @model name="adjective"
	 * @generated
	 * @ordered
	 */
	public static final int ADJECTIVE_VALUE = 8;

	/**
	 * The '<em><b>Adjective satellite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Adjective satellite</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADJECTIVE_SATELLITE
	 * @model name="adjective_satellite"
	 * @generated
	 * @ordered
	 */
	public static final int ADJECTIVE_SATELLITE_VALUE = 9;

	/**
	 * The '<em><b>Adverb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Adverb</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADVERB
	 * @model name="adverb"
	 * @generated
	 * @ordered
	 */
	public static final int ADVERB_VALUE = 10;

	/**
	 * An array of all the '<em><b>Part Of Speech Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PartOfSpeechType[] VALUES_ARRAY =
		new PartOfSpeechType[] {
			UNKNOWN,
			NOUN,
			VERB,
			PRONOUN,
			PREPOSITION,
			CONJUNCTION,
			INTERJECTION,
			QUESTION,
			ADJECTIVE,
			ADJECTIVE_SATELLITE,
			ADVERB,
		};

	/**
	 * A public read-only list of all the '<em><b>Part Of Speech Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PartOfSpeechType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Part Of Speech Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PartOfSpeechType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PartOfSpeechType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Part Of Speech Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PartOfSpeechType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PartOfSpeechType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Part Of Speech Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PartOfSpeechType get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case NOUN_VALUE: return NOUN;
			case VERB_VALUE: return VERB;
			case PRONOUN_VALUE: return PRONOUN;
			case PREPOSITION_VALUE: return PREPOSITION;
			case CONJUNCTION_VALUE: return CONJUNCTION;
			case INTERJECTION_VALUE: return INTERJECTION;
			case QUESTION_VALUE: return QUESTION;
			case ADJECTIVE_VALUE: return ADJECTIVE;
			case ADJECTIVE_SATELLITE_VALUE: return ADJECTIVE_SATELLITE;
			case ADVERB_VALUE: return ADVERB;
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
	private PartOfSpeechType(int value, String name, String literal) {
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
	
} //PartOfSpeechType
