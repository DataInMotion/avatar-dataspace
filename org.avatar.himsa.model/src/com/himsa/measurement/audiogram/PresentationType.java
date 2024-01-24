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
 * A representation of the literals of the enumeration '<em><b>Presentation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Presentation is done in a number of different ways. In some tests the stimulus is always on (i.e. using the continuous presentation type)- (e.g. Tone Decay presents a continuous pure tone signal.)
 * 
 * Some of the stimulus types in this section are specific to diagnostic tests such as:
 * + SISI ./ Short Increment Sensitivity Index 
 * + Alternating / usually used with ABLB testing (Alternate Binaural Loudness balance)
 * + Amplitude Modulated / used in Bekesey Audiometry (automatic)
 * + StepWiseFrequencyModulated / often called ‘warble tones’ can be used in free field testing 
 * + Impulse / Random pulses
 * + Pulsed Presentation / Used in Bekesey Audiometry (automatic) and can be used as part of pure tone audiometry to make it easier for patients to distinguish stimulus sound
 * 
 * ## TPresentType ##
 * <!-- end-model-doc -->
 * @see com.himsa.measurement.audiogram.AudiogramPackage#getPresentationType()
 * @model extendedMetaData="name='Presentation_Type'"
 * @generated
 */
@ProviderType
public enum PresentationType implements Enumerator {
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
	 * The '<em><b>No Presentation Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_PRESENTATION_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	NO_PRESENTATION_TYPE(1, "NoPresentationType", "NoPresentationType"),

	/**
	 * The '<em><b>Continuous</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTINUOUS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTINUOUS(2, "Continuous", "Continuous"),

	/**
	 * The '<em><b>Pulsed Presentation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PULSED_PRESENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	PULSED_PRESENTATION(3, "PulsedPresentation", "PulsedPresentation"),

	/**
	 * The '<em><b>Alternating</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALTERNATING_VALUE
	 * @generated
	 * @ordered
	 */
	ALTERNATING(4, "Alternating", "Alternating"),

	/**
	 * The '<em><b>Amplitude Modulated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMPLITUDE_MODULATED_VALUE
	 * @generated
	 * @ordered
	 */
	AMPLITUDE_MODULATED(5, "AmplitudeModulated", "AmplitudeModulated"),

	/**
	 * The '<em><b>Stepwise Frequency Modulated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEPWISE_FREQUENCY_MODULATED_VALUE
	 * @generated
	 * @ordered
	 */
	STEPWISE_FREQUENCY_MODULATED(6, "StepwiseFrequencyModulated", "StepwiseFrequencyModulated"),

	/**
	 * The '<em><b>Impulse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPULSE_VALUE
	 * @generated
	 * @ordered
	 */
	IMPULSE(7, "Impulse", "Impulse"),

	/**
	 * The '<em><b>Si Si Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SI_SI_SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	SI_SI_SIGNAL(8, "SiSiSignal", "SiSiSignal"),

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
	 * The '<em><b>No Presentation Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_PRESENTATION_TYPE
	 * @model name="NoPresentationType"
	 * @generated
	 * @ordered
	 */
	public static final int NO_PRESENTATION_TYPE_VALUE = 1;

	/**
	 * The '<em><b>Continuous</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTINUOUS
	 * @model name="Continuous"
	 * @generated
	 * @ordered
	 */
	public static final int CONTINUOUS_VALUE = 2;

	/**
	 * The '<em><b>Pulsed Presentation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PULSED_PRESENTATION
	 * @model name="PulsedPresentation"
	 * @generated
	 * @ordered
	 */
	public static final int PULSED_PRESENTATION_VALUE = 3;

	/**
	 * The '<em><b>Alternating</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALTERNATING
	 * @model name="Alternating"
	 * @generated
	 * @ordered
	 */
	public static final int ALTERNATING_VALUE = 4;

	/**
	 * The '<em><b>Amplitude Modulated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMPLITUDE_MODULATED
	 * @model name="AmplitudeModulated"
	 * @generated
	 * @ordered
	 */
	public static final int AMPLITUDE_MODULATED_VALUE = 5;

	/**
	 * The '<em><b>Stepwise Frequency Modulated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEPWISE_FREQUENCY_MODULATED
	 * @model name="StepwiseFrequencyModulated"
	 * @generated
	 * @ordered
	 */
	public static final int STEPWISE_FREQUENCY_MODULATED_VALUE = 6;

	/**
	 * The '<em><b>Impulse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPULSE
	 * @model name="Impulse"
	 * @generated
	 * @ordered
	 */
	public static final int IMPULSE_VALUE = 7;

	/**
	 * The '<em><b>Si Si Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SI_SI_SIGNAL
	 * @model name="SiSiSignal"
	 * @generated
	 * @ordered
	 */
	public static final int SI_SI_SIGNAL_VALUE = 8;

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
	 * An array of all the '<em><b>Presentation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PresentationType[] VALUES_ARRAY =
		new PresentationType[] {
			UNKNOWN,
			NO_PRESENTATION_TYPE,
			CONTINUOUS,
			PULSED_PRESENTATION,
			ALTERNATING,
			AMPLITUDE_MODULATED,
			STEPWISE_FREQUENCY_MODULATED,
			IMPULSE,
			SI_SI_SIGNAL,
			USER1,
			USER2,
			USER3,
		};

	/**
	 * A public read-only list of all the '<em><b>Presentation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PresentationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Presentation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PresentationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PresentationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Presentation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PresentationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PresentationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Presentation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PresentationType get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case NO_PRESENTATION_TYPE_VALUE: return NO_PRESENTATION_TYPE;
			case CONTINUOUS_VALUE: return CONTINUOUS;
			case PULSED_PRESENTATION_VALUE: return PULSED_PRESENTATION;
			case ALTERNATING_VALUE: return ALTERNATING;
			case AMPLITUDE_MODULATED_VALUE: return AMPLITUDE_MODULATED;
			case STEPWISE_FREQUENCY_MODULATED_VALUE: return STEPWISE_FREQUENCY_MODULATED;
			case IMPULSE_VALUE: return IMPULSE;
			case SI_SI_SIGNAL_VALUE: return SI_SI_SIGNAL;
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
	private PresentationType(int value, String name, String literal) {
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
	
} //PresentationType
