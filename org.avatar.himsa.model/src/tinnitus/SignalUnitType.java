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
 * A representation of the literals of the enumeration '<em><b>Signal Unit Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The decibel scale is used to measure the level of sound presented to the ears relative to a reference point. 
 * HL - Hearing Level dB HL refers to the hearing ability of a person. Normal hearing is defined as 0 dB HL. 
 * SL - Sensation level
 * SPL - Sound Pressure Level. dB SPL is the measured pressure relative to 20 micropascals.
 * ABS / Absolute Value of a measurement without any corrections
 * <!-- end-model-doc -->
 * @see tinnitus.TinnitusPackage#getSignalUnitType()
 * @model extendedMetaData="name='SignalUnit_Type'"
 * @generated
 */
@ProviderType
public enum SignalUnitType implements Enumerator {
	/**
	 * The '<em><b>HL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HL_VALUE
	 * @generated
	 * @ordered
	 */
	HL(0, "HL", "HL"),

	/**
	 * The '<em><b>SL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SL_VALUE
	 * @generated
	 * @ordered
	 */
	SL(1, "SL", "SL"),

	/**
	 * The '<em><b>SPL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPL_VALUE
	 * @generated
	 * @ordered
	 */
	SPL(2, "SPL", "SPL"),

	/**
	 * The '<em><b>ABS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABS_VALUE
	 * @generated
	 * @ordered
	 */
	ABS(3, "ABS", "ABS");

	/**
	 * The '<em><b>HL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HL_VALUE = 0;

	/**
	 * The '<em><b>SL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SL_VALUE = 1;

	/**
	 * The '<em><b>SPL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPL_VALUE = 2;

	/**
	 * The '<em><b>ABS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ABS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Signal Unit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SignalUnitType[] VALUES_ARRAY =
		new SignalUnitType[] {
			HL,
			SL,
			SPL,
			ABS,
		};

	/**
	 * A public read-only list of all the '<em><b>Signal Unit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SignalUnitType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Signal Unit Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SignalUnitType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SignalUnitType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Signal Unit Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SignalUnitType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SignalUnitType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Signal Unit Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SignalUnitType get(int value) {
		switch (value) {
			case HL_VALUE: return HL;
			case SL_VALUE: return SL;
			case SPL_VALUE: return SPL;
			case ABS_VALUE: return ABS;
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
	private SignalUnitType(int value, String name, String literal) {
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
	
} //SignalUnitType
