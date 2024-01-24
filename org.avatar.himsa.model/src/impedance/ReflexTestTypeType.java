/*
 */
package impedance;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Reflex Test Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Different acoustic reflex measurements
 * 
 * + fixedLevel / Used at screening tests at e.g. 90 dB HL. The probe freq (226Hz) is always
 * kept at 85 dB SPL. The stimulus tone is measured in HL at e.g. 3 different
 * frequencies: Contralateral [500 .. 8 kHz] Ipsilateral [500 .. 4 kHz]. For
 * contralateral stimulus is frequently used a TDH39 headphone calibrated in
 * HL. The 8 kHz freq can often not be produced by the probe system.
 * 
 * + AutoThreshold Search / Sweep from e.g. 80 to 110 dB HL stimulus tone. Continuous increase in
 * intensity over [2..5] seconds, the stapedius reflex is monitored continuously.
 * A trained person must then decide from the band of curves when the reflex is
 * present. The probe frequency (226 Hz) is always kept at 85 dB SPL.
 * 
 * + sequence / A pre-programmed sequence of acoustic reflex tests. The probe freq (226
 * Hz) is always kept at 85 dB SPL, the stimulus tone intensity is varied in steps.
 * 
 * + multiplexed / Some methods prescribe that the probe tone and the stimulus tone is "multiplexed" - i.e. interchanged. The 226 Hz probe tone is used to find the max. compliance point, and then the stimulus tone is applied instead.
 * 
 * + reflex / A manually performed reflex test. All parameters are saved in the Measurement Conditions. The result is noted as TRUE or FALSE.
 * 
 * + decay / The decay percentage is measured after 10 seconds. See measurement details at explanation for TReflexTest
 * 
 * + latency / The latency in time before a 10 pct value of the acoustic reflex is obtained is measured and saved. See measurement details at explanation for TReflexTest.
 * 
 * ## TRflxTestType ##
 * <!-- end-model-doc -->
 * @see impedance.ImpedancePackage#getReflexTestTypeType()
 * @model extendedMetaData="name='ReflexTestType_Type'"
 * @generated
 */
@ProviderType
public enum ReflexTestTypeType implements Enumerator {
	/**
	 * The '<em><b>Fixed Level</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIXED_LEVEL_VALUE
	 * @generated
	 * @ordered
	 */
	FIXED_LEVEL(0, "FixedLevel", "FixedLevel"),

	/**
	 * The '<em><b>Auto Threshold Search</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_THRESHOLD_SEARCH_VALUE
	 * @generated
	 * @ordered
	 */
	AUTO_THRESHOLD_SEARCH(1, "AutoThresholdSearch", "AutoThresholdSearch"),

	/**
	 * The '<em><b>Sequence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQUENCE_VALUE
	 * @generated
	 * @ordered
	 */
	SEQUENCE(2, "Sequence", "Sequence"),

	/**
	 * The '<em><b>Multiplexed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLEXED_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLEXED(3, "Multiplexed", "Multiplexed"),

	/**
	 * The '<em><b>Reflex</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFLEX_VALUE
	 * @generated
	 * @ordered
	 */
	REFLEX(4, "Reflex", "Reflex"),

	/**
	 * The '<em><b>Decay</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECAY_VALUE
	 * @generated
	 * @ordered
	 */
	DECAY(5, "Decay", "Decay"),

	/**
	 * The '<em><b>Latency</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATENCY_VALUE
	 * @generated
	 * @ordered
	 */
	LATENCY(6, "Latency", "Latency");

	/**
	 * The '<em><b>Fixed Level</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIXED_LEVEL
	 * @model name="FixedLevel"
	 * @generated
	 * @ordered
	 */
	public static final int FIXED_LEVEL_VALUE = 0;

	/**
	 * The '<em><b>Auto Threshold Search</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_THRESHOLD_SEARCH
	 * @model name="AutoThresholdSearch"
	 * @generated
	 * @ordered
	 */
	public static final int AUTO_THRESHOLD_SEARCH_VALUE = 1;

	/**
	 * The '<em><b>Sequence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQUENCE
	 * @model name="Sequence"
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENCE_VALUE = 2;

	/**
	 * The '<em><b>Multiplexed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLEXED
	 * @model name="Multiplexed"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLEXED_VALUE = 3;

	/**
	 * The '<em><b>Reflex</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFLEX
	 * @model name="Reflex"
	 * @generated
	 * @ordered
	 */
	public static final int REFLEX_VALUE = 4;

	/**
	 * The '<em><b>Decay</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECAY
	 * @model name="Decay"
	 * @generated
	 * @ordered
	 */
	public static final int DECAY_VALUE = 5;

	/**
	 * The '<em><b>Latency</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATENCY
	 * @model name="Latency"
	 * @generated
	 * @ordered
	 */
	public static final int LATENCY_VALUE = 6;

	/**
	 * An array of all the '<em><b>Reflex Test Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReflexTestTypeType[] VALUES_ARRAY =
		new ReflexTestTypeType[] {
			FIXED_LEVEL,
			AUTO_THRESHOLD_SEARCH,
			SEQUENCE,
			MULTIPLEXED,
			REFLEX,
			DECAY,
			LATENCY,
		};

	/**
	 * A public read-only list of all the '<em><b>Reflex Test Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReflexTestTypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reflex Test Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReflexTestTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReflexTestTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reflex Test Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReflexTestTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReflexTestTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reflex Test Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReflexTestTypeType get(int value) {
		switch (value) {
			case FIXED_LEVEL_VALUE: return FIXED_LEVEL;
			case AUTO_THRESHOLD_SEARCH_VALUE: return AUTO_THRESHOLD_SEARCH;
			case SEQUENCE_VALUE: return SEQUENCE;
			case MULTIPLEXED_VALUE: return MULTIPLEXED;
			case REFLEX_VALUE: return REFLEX;
			case DECAY_VALUE: return DECAY;
			case LATENCY_VALUE: return LATENCY;
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
	private ReflexTestTypeType(int value, String name, String literal) {
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
	
} //ReflexTestTypeType
