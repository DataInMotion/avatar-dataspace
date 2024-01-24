/*
 */
package com.himsa.measurement.real.ear;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Measurement Identification</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * InsertGain_U=50?
 * 
 * Identification of the measurement; mainly for use with data export and
 * storage of not yet publicly defined measurements at the end of the public
 * buffer.
 * 
 * ##TMeasurement##
 * <!-- end-model-doc -->
 * @see com.himsa.measurement.real.ear.EarPackage#getMeasurementIdentification()
 * @model extendedMetaData="name='MeasurementIdentification'"
 * @generated
 */
@ProviderType
public enum MeasurementIdentification implements Enumerator {
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
	 * The '<em><b>Audiometry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIOMETRY_VALUE
	 * @generated
	 * @ordered
	 */
	AUDIOMETRY(1, "Audiometry", "Audiometry"),

	/**
	 * The '<em><b>Target Curve</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TARGET_CURVE_VALUE
	 * @generated
	 * @ordered
	 */
	TARGET_CURVE(2, "TargetCurve", "TargetCurve"),

	/**
	 * The '<em><b>Unaided Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNAIDED_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	UNAIDED_RESPONSE(3, "UnaidedResponse", "UnaidedResponse"),

	/**
	 * The '<em><b>Occluded Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCCLUDED_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	OCCLUDED_RESPONSE(4, "OccludedResponse", "OccludedResponse"),

	/**
	 * The '<em><b>Insertion Response Compensated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSERTION_RESPONSE_COMPENSATED_VALUE
	 * @generated
	 * @ordered
	 */
	INSERTION_RESPONSE_COMPENSATED(5, "InsertionResponseCompensated", "InsertionResponseCompensated"),

	/**
	 * The '<em><b>Aided Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIDED_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	AIDED_RESPONSE(6, "AidedResponse", "AidedResponse"),

	/**
	 * The '<em><b>Input Output</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUT_OUTPUT_VALUE
	 * @generated
	 * @ordered
	 */
	INPUT_OUTPUT(7, "InputOutput", "InputOutput"),

	/**
	 * The '<em><b>Harmonic Distortion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARMONIC_DISTORTION_VALUE
	 * @generated
	 * @ordered
	 */
	HARMONIC_DISTORTION(8, "HarmonicDistortion", "HarmonicDistortion"),

	/**
	 * The '<em><b>Occlusion Effect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCCLUSION_EFFECT_VALUE
	 * @generated
	 * @ordered
	 */
	OCCLUSION_EFFECT(9, "OcclusionEffect", "OcclusionEffect"),

	/**
	 * The '<em><b>Real Ear To Coupler Difference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAL_EAR_TO_COUPLER_DIFFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	REAL_EAR_TO_COUPLER_DIFFERENCE(10, "RealEarToCouplerDifference", "RealEarToCouplerDifference"),

	/**
	 * The '<em><b>XSPL90</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XSPL90_VALUE
	 * @generated
	 * @ordered
	 */
	XSPL90(11, "XSPL90", "XSPL90"),

	/**
	 * The '<em><b>Full On Gain</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_ON_GAIN_VALUE
	 * @generated
	 * @ordered
	 */
	FULL_ON_GAIN(12, "FullOnGain", "FullOnGain"),

	/**
	 * The '<em><b>Frequency Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREQUENCY_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	FREQUENCY_RESPONSE(13, "FrequencyResponse", "FrequencyResponse"),

	/**
	 * The '<em><b>Battery Current</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BATTERY_CURRENT_VALUE
	 * @generated
	 * @ordered
	 */
	BATTERY_CURRENT(14, "BatteryCurrent", "BatteryCurrent"),

	/**
	 * The '<em><b>Intermodulation Distortion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERMODULATION_DISTORTION_VALUE
	 * @generated
	 * @ordered
	 */
	INTERMODULATION_DISTORTION(15, "IntermodulationDistortion", "IntermodulationDistortion"),

	/**
	 * The '<em><b>Equivalent Input Noise</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUIVALENT_INPUT_NOISE_VALUE
	 * @generated
	 * @ordered
	 */
	EQUIVALENT_INPUT_NOISE(16, "EquivalentInputNoise", "EquivalentInputNoise"),

	/**
	 * The '<em><b>Attack Recovery</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTACK_RECOVERY_VALUE
	 * @generated
	 * @ordered
	 */
	ATTACK_RECOVERY(17, "AttackRecovery", "AttackRecovery"),

	/**
	 * The '<em><b>Induction Coil</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDUCTION_COIL_VALUE
	 * @generated
	 * @ordered
	 */
	INDUCTION_COIL(18, "InductionCoil", "InductionCoil"),

	/**
	 * The '<em><b>User1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER1_VALUE
	 * @generated
	 * @ordered
	 */
	USER1(19, "User1", "User1"),

	/**
	 * The '<em><b>User2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER2_VALUE
	 * @generated
	 * @ordered
	 */
	USER2(20, "User2", "User2"),

	/**
	 * The '<em><b>User3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER3_VALUE
	 * @generated
	 * @ordered
	 */
	USER3(21, "User3", "User3"),

	/**
	 * The '<em><b>Insertion Response Uncompensated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSERTION_RESPONSE_UNCOMPENSATED_VALUE
	 * @generated
	 * @ordered
	 */
	INSERTION_RESPONSE_UNCOMPENSATED(22, "InsertionResponseUncompensated", "InsertionResponseUncompensated");

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
	 * The '<em><b>Audiometry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIOMETRY
	 * @model name="Audiometry"
	 * @generated
	 * @ordered
	 */
	public static final int AUDIOMETRY_VALUE = 1;

	/**
	 * The '<em><b>Target Curve</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TARGET_CURVE
	 * @model name="TargetCurve"
	 * @generated
	 * @ordered
	 */
	public static final int TARGET_CURVE_VALUE = 2;

	/**
	 * The '<em><b>Unaided Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNAIDED_RESPONSE
	 * @model name="UnaidedResponse"
	 * @generated
	 * @ordered
	 */
	public static final int UNAIDED_RESPONSE_VALUE = 3;

	/**
	 * The '<em><b>Occluded Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCCLUDED_RESPONSE
	 * @model name="OccludedResponse"
	 * @generated
	 * @ordered
	 */
	public static final int OCCLUDED_RESPONSE_VALUE = 4;

	/**
	 * The '<em><b>Insertion Response Compensated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSERTION_RESPONSE_COMPENSATED
	 * @model name="InsertionResponseCompensated"
	 * @generated
	 * @ordered
	 */
	public static final int INSERTION_RESPONSE_COMPENSATED_VALUE = 5;

	/**
	 * The '<em><b>Aided Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIDED_RESPONSE
	 * @model name="AidedResponse"
	 * @generated
	 * @ordered
	 */
	public static final int AIDED_RESPONSE_VALUE = 6;

	/**
	 * The '<em><b>Input Output</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUT_OUTPUT
	 * @model name="InputOutput"
	 * @generated
	 * @ordered
	 */
	public static final int INPUT_OUTPUT_VALUE = 7;

	/**
	 * The '<em><b>Harmonic Distortion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARMONIC_DISTORTION
	 * @model name="HarmonicDistortion"
	 * @generated
	 * @ordered
	 */
	public static final int HARMONIC_DISTORTION_VALUE = 8;

	/**
	 * The '<em><b>Occlusion Effect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCCLUSION_EFFECT
	 * @model name="OcclusionEffect"
	 * @generated
	 * @ordered
	 */
	public static final int OCCLUSION_EFFECT_VALUE = 9;

	/**
	 * The '<em><b>Real Ear To Coupler Difference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAL_EAR_TO_COUPLER_DIFFERENCE
	 * @model name="RealEarToCouplerDifference"
	 * @generated
	 * @ordered
	 */
	public static final int REAL_EAR_TO_COUPLER_DIFFERENCE_VALUE = 10;

	/**
	 * The '<em><b>XSPL90</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XSPL90
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XSPL90_VALUE = 11;

	/**
	 * The '<em><b>Full On Gain</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_ON_GAIN
	 * @model name="FullOnGain"
	 * @generated
	 * @ordered
	 */
	public static final int FULL_ON_GAIN_VALUE = 12;

	/**
	 * The '<em><b>Frequency Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREQUENCY_RESPONSE
	 * @model name="FrequencyResponse"
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_RESPONSE_VALUE = 13;

	/**
	 * The '<em><b>Battery Current</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BATTERY_CURRENT
	 * @model name="BatteryCurrent"
	 * @generated
	 * @ordered
	 */
	public static final int BATTERY_CURRENT_VALUE = 14;

	/**
	 * The '<em><b>Intermodulation Distortion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERMODULATION_DISTORTION
	 * @model name="IntermodulationDistortion"
	 * @generated
	 * @ordered
	 */
	public static final int INTERMODULATION_DISTORTION_VALUE = 15;

	/**
	 * The '<em><b>Equivalent Input Noise</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUIVALENT_INPUT_NOISE
	 * @model name="EquivalentInputNoise"
	 * @generated
	 * @ordered
	 */
	public static final int EQUIVALENT_INPUT_NOISE_VALUE = 16;

	/**
	 * The '<em><b>Attack Recovery</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTACK_RECOVERY
	 * @model name="AttackRecovery"
	 * @generated
	 * @ordered
	 */
	public static final int ATTACK_RECOVERY_VALUE = 17;

	/**
	 * The '<em><b>Induction Coil</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDUCTION_COIL
	 * @model name="InductionCoil"
	 * @generated
	 * @ordered
	 */
	public static final int INDUCTION_COIL_VALUE = 18;

	/**
	 * The '<em><b>User1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER1
	 * @model name="User1"
	 * @generated
	 * @ordered
	 */
	public static final int USER1_VALUE = 19;

	/**
	 * The '<em><b>User2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER2
	 * @model name="User2"
	 * @generated
	 * @ordered
	 */
	public static final int USER2_VALUE = 20;

	/**
	 * The '<em><b>User3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER3
	 * @model name="User3"
	 * @generated
	 * @ordered
	 */
	public static final int USER3_VALUE = 21;

	/**
	 * The '<em><b>Insertion Response Uncompensated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSERTION_RESPONSE_UNCOMPENSATED
	 * @model name="InsertionResponseUncompensated"
	 * @generated
	 * @ordered
	 */
	public static final int INSERTION_RESPONSE_UNCOMPENSATED_VALUE = 22;

	/**
	 * An array of all the '<em><b>Measurement Identification</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MeasurementIdentification[] VALUES_ARRAY =
		new MeasurementIdentification[] {
			UNDEFINED,
			AUDIOMETRY,
			TARGET_CURVE,
			UNAIDED_RESPONSE,
			OCCLUDED_RESPONSE,
			INSERTION_RESPONSE_COMPENSATED,
			AIDED_RESPONSE,
			INPUT_OUTPUT,
			HARMONIC_DISTORTION,
			OCCLUSION_EFFECT,
			REAL_EAR_TO_COUPLER_DIFFERENCE,
			XSPL90,
			FULL_ON_GAIN,
			FREQUENCY_RESPONSE,
			BATTERY_CURRENT,
			INTERMODULATION_DISTORTION,
			EQUIVALENT_INPUT_NOISE,
			ATTACK_RECOVERY,
			INDUCTION_COIL,
			USER1,
			USER2,
			USER3,
			INSERTION_RESPONSE_UNCOMPENSATED,
		};

	/**
	 * A public read-only list of all the '<em><b>Measurement Identification</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MeasurementIdentification> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Measurement Identification</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MeasurementIdentification get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MeasurementIdentification result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Measurement Identification</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MeasurementIdentification getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MeasurementIdentification result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Measurement Identification</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MeasurementIdentification get(int value) {
		switch (value) {
			case UNDEFINED_VALUE: return UNDEFINED;
			case AUDIOMETRY_VALUE: return AUDIOMETRY;
			case TARGET_CURVE_VALUE: return TARGET_CURVE;
			case UNAIDED_RESPONSE_VALUE: return UNAIDED_RESPONSE;
			case OCCLUDED_RESPONSE_VALUE: return OCCLUDED_RESPONSE;
			case INSERTION_RESPONSE_COMPENSATED_VALUE: return INSERTION_RESPONSE_COMPENSATED;
			case AIDED_RESPONSE_VALUE: return AIDED_RESPONSE;
			case INPUT_OUTPUT_VALUE: return INPUT_OUTPUT;
			case HARMONIC_DISTORTION_VALUE: return HARMONIC_DISTORTION;
			case OCCLUSION_EFFECT_VALUE: return OCCLUSION_EFFECT;
			case REAL_EAR_TO_COUPLER_DIFFERENCE_VALUE: return REAL_EAR_TO_COUPLER_DIFFERENCE;
			case XSPL90_VALUE: return XSPL90;
			case FULL_ON_GAIN_VALUE: return FULL_ON_GAIN;
			case FREQUENCY_RESPONSE_VALUE: return FREQUENCY_RESPONSE;
			case BATTERY_CURRENT_VALUE: return BATTERY_CURRENT;
			case INTERMODULATION_DISTORTION_VALUE: return INTERMODULATION_DISTORTION;
			case EQUIVALENT_INPUT_NOISE_VALUE: return EQUIVALENT_INPUT_NOISE;
			case ATTACK_RECOVERY_VALUE: return ATTACK_RECOVERY;
			case INDUCTION_COIL_VALUE: return INDUCTION_COIL;
			case USER1_VALUE: return USER1;
			case USER2_VALUE: return USER2;
			case USER3_VALUE: return USER3;
			case INSERTION_RESPONSE_UNCOMPENSATED_VALUE: return INSERTION_RESPONSE_UNCOMPENSATED;
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
	private MeasurementIdentification(int value, String name, String literal) {
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
	
} //MeasurementIdentification
