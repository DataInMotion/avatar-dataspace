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
 * A representation of the literals of the enumeration '<em><b>Signal Output Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * TSignalOutput Reflex Stimulus Signal Output. The stimulus tone is measured in HL at (e.g. 3 different frequencies:
 * 	Ipsilateral [500 .. 4 kHz]
 * 	Contralateral [500 .. 8 kHz]
 * 
 * + ipsilateral / Stimulus tone provided through the probe tip at "ipsi" - the same side as the 226 Hz tone.
 * 
 * + contralateral / For the Contralateral stimulus (opposite side of the probe) is frequently used a TDH39 headphone calibrated in HL. The 8 kHz freq thus obtainable can often not be produced by the probe system.
 * 
 * 
 * <!-- end-model-doc -->
 * @see com.himsa.measurement.admittance._501._501Package#getSignalOutputType()
 * @model extendedMetaData="name='SignalOutput_Type'"
 * @generated
 */
@ProviderType
public enum SignalOutputType implements Enumerator {
	/**
	 * The '<em><b>Ipsilateral</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPSILATERAL_VALUE
	 * @generated
	 * @ordered
	 */
	IPSILATERAL(0, "Ipsilateral", "Ipsilateral"),

	/**
	 * The '<em><b>Contralateral</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRALATERAL_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRALATERAL(1, "Contralateral", "Contralateral");

	/**
	 * The '<em><b>Ipsilateral</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPSILATERAL
	 * @model name="Ipsilateral"
	 * @generated
	 * @ordered
	 */
	public static final int IPSILATERAL_VALUE = 0;

	/**
	 * The '<em><b>Contralateral</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRALATERAL
	 * @model name="Contralateral"
	 * @generated
	 * @ordered
	 */
	public static final int CONTRALATERAL_VALUE = 1;

	/**
	 * An array of all the '<em><b>Signal Output Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SignalOutputType[] VALUES_ARRAY =
		new SignalOutputType[] {
			IPSILATERAL,
			CONTRALATERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Signal Output Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SignalOutputType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Signal Output Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SignalOutputType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SignalOutputType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Signal Output Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SignalOutputType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SignalOutputType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Signal Output Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SignalOutputType get(int value) {
		switch (value) {
			case IPSILATERAL_VALUE: return IPSILATERAL;
			case CONTRALATERAL_VALUE: return CONTRALATERAL;
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
	private SignalOutputType(int value, String name, String literal) {
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
	
} //SignalOutputType
