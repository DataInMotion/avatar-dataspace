/*
 */
package com.himsa.measurement.admittance._501;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Signal Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * + pureTone / Sinus tone stimulus.
 * + multiTone  / Two sine waves simultaneously.
 * + narrowBandNoise / Band filtered noise, e.g. 1/3 or 1/1 octave band noise.
 * broadBandNoise This Signal Type is White Noise, i.e. noise with equal energy content for equal absolute bandwidths in Hz. An averaged FFT-analysis of white noise shows a flat spectrum.
 * + lowPassNoise / A noise signal produced by low pass filtering a BroadBandNoise.
 * + highPassNoise / A noise signal produced by high pass filtering a broadBandNoise.
 * 
 * 
 * <!-- end-model-doc -->
 * @see com.himsa.measurement.admittance._501._501Package#getSignalTypeType()
 * @model extendedMetaData="name='SignalType_Type'"
 * @generated
 */
@ProviderType
public enum SignalTypeType implements Enumerator {
	/**
	 * The '<em><b>Pure Tone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PURE_TONE_VALUE
	 * @generated
	 * @ordered
	 */
	PURE_TONE(0, "PureTone", "PureTone"),

	/**
	 * The '<em><b>Multi Tone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_TONE_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI_TONE(1, "MultiTone", "MultiTone"),

	/**
	 * The '<em><b>Narrow Band Noise</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NARROW_BAND_NOISE_VALUE
	 * @generated
	 * @ordered
	 */
	NARROW_BAND_NOISE(2, "NarrowBandNoise", "NarrowBandNoise"),

	/**
	 * The '<em><b>Broad Band Noise</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BROAD_BAND_NOISE_VALUE
	 * @generated
	 * @ordered
	 */
	BROAD_BAND_NOISE(3, "BroadBandNoise", "BroadBandNoise"),

	/**
	 * The '<em><b>Low Pass Noise</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOW_PASS_NOISE_VALUE
	 * @generated
	 * @ordered
	 */
	LOW_PASS_NOISE(4, "LowPassNoise", "LowPassNoise"),

	/**
	 * The '<em><b>High Pass Noise</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_PASS_NOISE_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH_PASS_NOISE(5, "HighPassNoise", "HighPassNoise");

	/**
	 * The '<em><b>Pure Tone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PURE_TONE
	 * @model name="PureTone"
	 * @generated
	 * @ordered
	 */
	public static final int PURE_TONE_VALUE = 0;

	/**
	 * The '<em><b>Multi Tone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_TONE
	 * @model name="MultiTone"
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_TONE_VALUE = 1;

	/**
	 * The '<em><b>Narrow Band Noise</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NARROW_BAND_NOISE
	 * @model name="NarrowBandNoise"
	 * @generated
	 * @ordered
	 */
	public static final int NARROW_BAND_NOISE_VALUE = 2;

	/**
	 * The '<em><b>Broad Band Noise</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BROAD_BAND_NOISE
	 * @model name="BroadBandNoise"
	 * @generated
	 * @ordered
	 */
	public static final int BROAD_BAND_NOISE_VALUE = 3;

	/**
	 * The '<em><b>Low Pass Noise</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOW_PASS_NOISE
	 * @model name="LowPassNoise"
	 * @generated
	 * @ordered
	 */
	public static final int LOW_PASS_NOISE_VALUE = 4;

	/**
	 * The '<em><b>High Pass Noise</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_PASS_NOISE
	 * @model name="HighPassNoise"
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_PASS_NOISE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Signal Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SignalTypeType[] VALUES_ARRAY =
		new SignalTypeType[] {
			PURE_TONE,
			MULTI_TONE,
			NARROW_BAND_NOISE,
			BROAD_BAND_NOISE,
			LOW_PASS_NOISE,
			HIGH_PASS_NOISE,
		};

	/**
	 * A public read-only list of all the '<em><b>Signal Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SignalTypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Signal Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SignalTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SignalTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Signal Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SignalTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SignalTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Signal Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SignalTypeType get(int value) {
		switch (value) {
			case PURE_TONE_VALUE: return PURE_TONE;
			case MULTI_TONE_VALUE: return MULTI_TONE;
			case NARROW_BAND_NOISE_VALUE: return NARROW_BAND_NOISE;
			case BROAD_BAND_NOISE_VALUE: return BROAD_BAND_NOISE;
			case LOW_PASS_NOISE_VALUE: return LOW_PASS_NOISE;
			case HIGH_PASS_NOISE_VALUE: return HIGH_PASS_NOISE;
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
	private SignalTypeType(int value, String name, String literal) {
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
	
} //SignalTypeType
