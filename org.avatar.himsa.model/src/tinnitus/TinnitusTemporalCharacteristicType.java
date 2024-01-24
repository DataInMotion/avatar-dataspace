/*
 */
package tinnitus;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Temporal Characteristic Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Record temporal characteristics of Tinnitus
 * <!-- end-model-doc -->
 * @see tinnitus.TinnitusPackage#getTinnitusTemporalCharacteristicType()
 * @model extendedMetaData="name='TinnitusTemporalCharacteristic_Type'"
 * @generated
 */
@ProviderType
public enum TinnitusTemporalCharacteristicType implements Enumerator {
	/**
	 * The '<em><b>Steady</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tinnitus is characterized as Steady sound      
	 * <!-- end-model-doc -->
	 * @see #STEADY_VALUE
	 * @generated
	 * @ordered
	 */
	STEADY(0, "Steady", "Steady"),

	/**
	 * The '<em><b>Pulsatile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tinnitus is characterized as Pulsating 
	 * <!-- end-model-doc -->
	 * @see #PULSATILE_VALUE
	 * @generated
	 * @ordered
	 */
	PULSATILE(1, "Pulsatile", "Pulsatile"),

	/**
	 * The '<em><b>Fluctuating</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tinnitus is characterized as Fluctuating but not pulsatile
	 * <!-- end-model-doc -->
	 * @see #FLUCTUATING_VALUE
	 * @generated
	 * @ordered
	 */
	FLUCTUATING(2, "Fluctuating", "Fluctuating"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tinnitus characteristic cannot be decided
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(3, "Unknown", "Unknown");

	/**
	 * The '<em><b>Steady</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tinnitus is characterized as Steady sound      
	 * <!-- end-model-doc -->
	 * @see #STEADY
	 * @model name="Steady"
	 * @generated
	 * @ordered
	 */
	public static final int STEADY_VALUE = 0;

	/**
	 * The '<em><b>Pulsatile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tinnitus is characterized as Pulsating 
	 * <!-- end-model-doc -->
	 * @see #PULSATILE
	 * @model name="Pulsatile"
	 * @generated
	 * @ordered
	 */
	public static final int PULSATILE_VALUE = 1;

	/**
	 * The '<em><b>Fluctuating</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tinnitus is characterized as Fluctuating but not pulsatile
	 * <!-- end-model-doc -->
	 * @see #FLUCTUATING
	 * @model name="Fluctuating"
	 * @generated
	 * @ordered
	 */
	public static final int FLUCTUATING_VALUE = 2;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tinnitus characteristic cannot be decided
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN
	 * @model name="Unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 3;

	/**
	 * An array of all the '<em><b>Temporal Characteristic Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TinnitusTemporalCharacteristicType[] VALUES_ARRAY =
		new TinnitusTemporalCharacteristicType[] {
			STEADY,
			PULSATILE,
			FLUCTUATING,
			UNKNOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Temporal Characteristic Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TinnitusTemporalCharacteristicType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Temporal Characteristic Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TinnitusTemporalCharacteristicType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TinnitusTemporalCharacteristicType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Temporal Characteristic Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TinnitusTemporalCharacteristicType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TinnitusTemporalCharacteristicType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Temporal Characteristic Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TinnitusTemporalCharacteristicType get(int value) {
		switch (value) {
			case STEADY_VALUE: return STEADY;
			case PULSATILE_VALUE: return PULSATILE;
			case FLUCTUATING_VALUE: return FLUCTUATING;
			case UNKNOWN_VALUE: return UNKNOWN;
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
	private TinnitusTemporalCharacteristicType(int value, String name, String literal) {
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
	
} //TinnitusTemporalCharacteristicType
