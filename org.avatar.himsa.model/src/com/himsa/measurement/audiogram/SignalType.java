/*
 */
package com.himsa.measurement.audiogram;

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
 * AuxiliarySignal / Stimulus from Compact Disc or Audio Tape
 * Microphone / Live voice from microphone
 * 
 * ## TSignalType ##
 * ##NoSignal now  is NoSignalApplied ##
 * <!-- end-model-doc -->
 * @see com.himsa.measurement.audiogram.AudiogramPackage#getSignalType()
 * @model extendedMetaData="name='Signal_Type'"
 * @generated
 */
@ProviderType
public enum SignalType implements Enumerator {
	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "Unknown", "Unknown"),

	/**
	 * The '<em><b>No Signal Applied</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_SIGNAL_APPLIED_VALUE
	 * @generated
	 * @ordered
	 */
	NO_SIGNAL_APPLIED(1, "NoSignalApplied", "NoSignalApplied"),

	/**
	 * The '<em><b>Pure Tone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PURE_TONE_VALUE
	 * @generated
	 * @ordered
	 */
	PURE_TONE(2, "PureTone", "PureTone"),

	/**
	 * The '<em><b>Warble</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARBLE_VALUE
	 * @generated
	 * @ordered
	 */
	WARBLE(3, "Warble", "Warble"),

	/**
	 * The '<em><b>Narrow Band Noise</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NARROW_BAND_NOISE_VALUE
	 * @generated
	 * @ordered
	 */
	NARROW_BAND_NOISE(4, "NarrowBandNoise", "NarrowBandNoise"),

	/**
	 * The '<em><b>Speech Noise</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPEECH_NOISE_VALUE
	 * @generated
	 * @ordered
	 */
	SPEECH_NOISE(5, "SpeechNoise", "SpeechNoise"),

	/**
	 * The '<em><b>White Noise</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHITE_NOISE_VALUE
	 * @generated
	 * @ordered
	 */
	WHITE_NOISE(6, "WhiteNoise", "WhiteNoise"),

	/**
	 * The '<em><b>Pink Noise</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PINK_NOISE_VALUE
	 * @generated
	 * @ordered
	 */
	PINK_NOISE(7, "PinkNoise", "PinkNoise"),

	/**
	 * The '<em><b>Auxiliary Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUXILIARY_SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	AUXILIARY_SIGNAL(8, "AuxiliarySignal", "AuxiliarySignal"),

	/**
	 * The '<em><b>Microphone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICROPHONE_VALUE
	 * @generated
	 * @ordered
	 */
	MICROPHONE(9, "Microphone", "Microphone"),

	/**
	 * The '<em><b>User1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER1_VALUE
	 * @generated
	 * @ordered
	 */
	USER1(10, "User1", "User1"),

	/**
	 * The '<em><b>User2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER2_VALUE
	 * @generated
	 * @ordered
	 */
	USER2(11, "User2", "User2"),

	/**
	 * The '<em><b>User3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER3_VALUE
	 * @generated
	 * @ordered
	 */
	USER3(12, "User3", "User3");

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="Unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

	/**
	 * The '<em><b>No Signal Applied</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_SIGNAL_APPLIED
	 * @model name="NoSignalApplied"
	 * @generated
	 * @ordered
	 */
	public static final int NO_SIGNAL_APPLIED_VALUE = 1;

	/**
	 * The '<em><b>Pure Tone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PURE_TONE
	 * @model name="PureTone"
	 * @generated
	 * @ordered
	 */
	public static final int PURE_TONE_VALUE = 2;

	/**
	 * The '<em><b>Warble</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARBLE
	 * @model name="Warble"
	 * @generated
	 * @ordered
	 */
	public static final int WARBLE_VALUE = 3;

	/**
	 * The '<em><b>Narrow Band Noise</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NARROW_BAND_NOISE
	 * @model name="NarrowBandNoise"
	 * @generated
	 * @ordered
	 */
	public static final int NARROW_BAND_NOISE_VALUE = 4;

	/**
	 * The '<em><b>Speech Noise</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPEECH_NOISE
	 * @model name="SpeechNoise"
	 * @generated
	 * @ordered
	 */
	public static final int SPEECH_NOISE_VALUE = 5;

	/**
	 * The '<em><b>White Noise</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHITE_NOISE
	 * @model name="WhiteNoise"
	 * @generated
	 * @ordered
	 */
	public static final int WHITE_NOISE_VALUE = 6;

	/**
	 * The '<em><b>Pink Noise</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PINK_NOISE
	 * @model name="PinkNoise"
	 * @generated
	 * @ordered
	 */
	public static final int PINK_NOISE_VALUE = 7;

	/**
	 * The '<em><b>Auxiliary Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUXILIARY_SIGNAL
	 * @model name="AuxiliarySignal"
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_SIGNAL_VALUE = 8;

	/**
	 * The '<em><b>Microphone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICROPHONE
	 * @model name="Microphone"
	 * @generated
	 * @ordered
	 */
	public static final int MICROPHONE_VALUE = 9;

	/**
	 * The '<em><b>User1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER1
	 * @model name="User1"
	 * @generated
	 * @ordered
	 */
	public static final int USER1_VALUE = 10;

	/**
	 * The '<em><b>User2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER2
	 * @model name="User2"
	 * @generated
	 * @ordered
	 */
	public static final int USER2_VALUE = 11;

	/**
	 * The '<em><b>User3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER3
	 * @model name="User3"
	 * @generated
	 * @ordered
	 */
	public static final int USER3_VALUE = 12;

	/**
	 * An array of all the '<em><b>Signal Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SignalType[] VALUES_ARRAY =
		new SignalType[] {
			UNKNOWN,
			NO_SIGNAL_APPLIED,
			PURE_TONE,
			WARBLE,
			NARROW_BAND_NOISE,
			SPEECH_NOISE,
			WHITE_NOISE,
			PINK_NOISE,
			AUXILIARY_SIGNAL,
			MICROPHONE,
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
			case UNKNOWN_VALUE: return UNKNOWN;
			case NO_SIGNAL_APPLIED_VALUE: return NO_SIGNAL_APPLIED;
			case PURE_TONE_VALUE: return PURE_TONE;
			case WARBLE_VALUE: return WARBLE;
			case NARROW_BAND_NOISE_VALUE: return NARROW_BAND_NOISE;
			case SPEECH_NOISE_VALUE: return SPEECH_NOISE;
			case WHITE_NOISE_VALUE: return WHITE_NOISE;
			case PINK_NOISE_VALUE: return PINK_NOISE;
			case AUXILIARY_SIGNAL_VALUE: return AUXILIARY_SIGNAL;
			case MICROPHONE_VALUE: return MICROPHONE;
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
