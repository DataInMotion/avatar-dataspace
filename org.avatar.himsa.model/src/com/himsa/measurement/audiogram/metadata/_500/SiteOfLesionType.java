/*
 */
package com.himsa.measurement.audiogram.metadata._500;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Site Of Lesion Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.himsa.measurement.audiogram.metadata._500._500Package#getSiteOfLesionType()
 * @model extendedMetaData="name='SiteOfLesion_._type'"
 * @generated
 */
@ProviderType
public enum SiteOfLesionType implements Enumerator {
	/**
	 * The '<em><b>Conductive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONDUCTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	CONDUCTIVE(0, "Conductive", "Conductive"),

	/**
	 * The '<em><b>Sensorineural</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENSORINEURAL_VALUE
	 * @generated
	 * @ordered
	 */
	SENSORINEURAL(1, "Sensorineural", "Sensorineural"),

	/**
	 * The '<em><b>Mixed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIXED_VALUE
	 * @generated
	 * @ordered
	 */
	MIXED(2, "Mixed", "Mixed"),

	/**
	 * The '<em><b>Sensorineural Or Mixed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENSORINEURAL_OR_MIXED_VALUE
	 * @generated
	 * @ordered
	 */
	SENSORINEURAL_OR_MIXED(3, "SensorineuralOrMixed", "SensorineuralOrMixed");

	/**
	 * The '<em><b>Conductive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONDUCTIVE
	 * @model name="Conductive"
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTIVE_VALUE = 0;

	/**
	 * The '<em><b>Sensorineural</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENSORINEURAL
	 * @model name="Sensorineural"
	 * @generated
	 * @ordered
	 */
	public static final int SENSORINEURAL_VALUE = 1;

	/**
	 * The '<em><b>Mixed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIXED
	 * @model name="Mixed"
	 * @generated
	 * @ordered
	 */
	public static final int MIXED_VALUE = 2;

	/**
	 * The '<em><b>Sensorineural Or Mixed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENSORINEURAL_OR_MIXED
	 * @model name="SensorineuralOrMixed"
	 * @generated
	 * @ordered
	 */
	public static final int SENSORINEURAL_OR_MIXED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Site Of Lesion Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SiteOfLesionType[] VALUES_ARRAY =
		new SiteOfLesionType[] {
			CONDUCTIVE,
			SENSORINEURAL,
			MIXED,
			SENSORINEURAL_OR_MIXED,
		};

	/**
	 * A public read-only list of all the '<em><b>Site Of Lesion Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SiteOfLesionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Site Of Lesion Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SiteOfLesionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SiteOfLesionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Site Of Lesion Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SiteOfLesionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SiteOfLesionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Site Of Lesion Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SiteOfLesionType get(int value) {
		switch (value) {
			case CONDUCTIVE_VALUE: return CONDUCTIVE;
			case SENSORINEURAL_VALUE: return SENSORINEURAL;
			case MIXED_VALUE: return MIXED;
			case SENSORINEURAL_OR_MIXED_VALUE: return SENSORINEURAL_OR_MIXED;
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
	private SiteOfLesionType(int value, String name, String literal) {
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
	
} //SiteOfLesionType
