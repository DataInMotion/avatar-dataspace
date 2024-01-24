/*
 */
package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Signal Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The signal type used during the measurement.
 * 
 * ##TSignalType##
 * <!-- end-model-doc -->
 * @see test.TestPackage#getSignalType()
 * @model extendedMetaData="name='SignalType'"
 * @generated
 */
@ProviderType
public enum SignalType implements Enumerator {
	/**
	 * The '<em><b>Undefined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEFINED(0, "Undefined", "Undefined"),

	/**
	 * The '<em><b>Tone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TONE_VALUE
	 * @generated
	 * @ordered
	 */
	TONE(1, "Tone", "Tone"),

	/**
	 * The '<em><b>Warble</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARBLE_VALUE
	 * @generated
	 * @ordered
	 */
	WARBLE(2, "Warble", "Warble"),

	/**
	 * The '<em><b>Narr Noise</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NARR_NOISE_VALUE
	 * @generated
	 * @ordered
	 */
	NARR_NOISE(3, "NarrNoise", "NarrNoise"),

	/**
	 * The '<em><b>Two Tone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_TONE_VALUE
	 * @generated
	 * @ordered
	 */
	TWO_TONE(4, "TwoTone", "TwoTone"),

	/**
	 * The '<em><b>White Noise</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHITE_NOISE_VALUE
	 * @generated
	 * @ordered
	 */
	WHITE_NOISE(5, "WhiteNoise", "WhiteNoise"),

	/**
	 * The '<em><b>Pink Noise</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PINK_NOISE_VALUE
	 * @generated
	 * @ordered
	 */
	PINK_NOISE(6, "PinkNoise", "PinkNoise"),

	/**
	 * The '<em><b>Speech Noise</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPEECH_NOISE_VALUE
	 * @generated
	 * @ordered
	 */
	SPEECH_NOISE(7, "SpeechNoise", "SpeechNoise"),

	/**
	 * The '<em><b>Patient</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATIENT_VALUE
	 * @generated
	 * @ordered
	 */
	PATIENT(8, "Patient", "Patient"),

	/**
	 * The '<em><b>User1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER1_VALUE
	 * @generated
	 * @ordered
	 */
	USER1(9, "User1", "User1"),

	/**
	 * The '<em><b>User2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER2_VALUE
	 * @generated
	 * @ordered
	 */
	USER2(10, "User2", "User2"),

	/**
	 * The '<em><b>User3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER3_VALUE
	 * @generated
	 * @ordered
	 */
	USER3(11, "User3", "User3");

	/**
	 * The '<em><b>Undefined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED
	 * @model name="Undefined"
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED_VALUE = 0;

	/**
	 * The '<em><b>Tone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TONE
	 * @model name="Tone"
	 * @generated
	 * @ordered
	 */
	public static final int TONE_VALUE = 1;

	/**
	 * The '<em><b>Warble</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARBLE
	 * @model name="Warble"
	 * @generated
	 * @ordered
	 */
	public static final int WARBLE_VALUE = 2;

	/**
	 * The '<em><b>Narr Noise</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NARR_NOISE
	 * @model name="NarrNoise"
	 * @generated
	 * @ordered
	 */
	public static final int NARR_NOISE_VALUE = 3;

	/**
	 * The '<em><b>Two Tone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_TONE
	 * @model name="TwoTone"
	 * @generated
	 * @ordered
	 */
	public static final int TWO_TONE_VALUE = 4;

	/**
	 * The '<em><b>White Noise</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHITE_NOISE
	 * @model name="WhiteNoise"
	 * @generated
	 * @ordered
	 */
	public static final int WHITE_NOISE_VALUE = 5;

	/**
	 * The '<em><b>Pink Noise</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PINK_NOISE
	 * @model name="PinkNoise"
	 * @generated
	 * @ordered
	 */
	public static final int PINK_NOISE_VALUE = 6;

	/**
	 * The '<em><b>Speech Noise</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPEECH_NOISE
	 * @model name="SpeechNoise"
	 * @generated
	 * @ordered
	 */
	public static final int SPEECH_NOISE_VALUE = 7;

	/**
	 * The '<em><b>Patient</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATIENT
	 * @model name="Patient"
	 * @generated
	 * @ordered
	 */
	public static final int PATIENT_VALUE = 8;

	/**
	 * The '<em><b>User1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER1
	 * @model name="User1"
	 * @generated
	 * @ordered
	 */
	public static final int USER1_VALUE = 9;

	/**
	 * The '<em><b>User2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER2
	 * @model name="User2"
	 * @generated
	 * @ordered
	 */
	public static final int USER2_VALUE = 10;

	/**
	 * The '<em><b>User3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER3
	 * @model name="User3"
	 * @generated
	 * @ordered
	 */
	public static final int USER3_VALUE = 11;

	/**
	 * An array of all the '<em><b>Signal Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SignalType[] VALUES_ARRAY =
		new SignalType[] {
			UNDEFINED,
			TONE,
			WARBLE,
			NARR_NOISE,
			TWO_TONE,
			WHITE_NOISE,
			PINK_NOISE,
			SPEECH_NOISE,
			PATIENT,
			USER1,
			USER2,
			USER3,
		};

	/**
	 * A public read-only list of all the '<em><b>Signal Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SignalType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Signal Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SignalType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SignalType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Signal Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SignalType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SignalType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Signal Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SignalType get(int value) {
		switch (value) {
			case UNDEFINED_VALUE: return UNDEFINED;
			case TONE_VALUE: return TONE;
			case WARBLE_VALUE: return WARBLE;
			case NARR_NOISE_VALUE: return NARR_NOISE;
			case TWO_TONE_VALUE: return TWO_TONE;
			case WHITE_NOISE_VALUE: return WHITE_NOISE;
			case PINK_NOISE_VALUE: return PINK_NOISE;
			case SPEECH_NOISE_VALUE: return SPEECH_NOISE;
			case PATIENT_VALUE: return PATIENT;
			case USER1_VALUE: return USER1;
			case USER2_VALUE: return USER2;
			case USER3_VALUE: return USER3;
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
	private SignalType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //SignalType
