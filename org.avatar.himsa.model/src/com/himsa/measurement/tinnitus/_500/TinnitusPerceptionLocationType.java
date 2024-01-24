/*
 */
package com.himsa.measurement.tinnitus._500;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tinnitus Perception Location Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The perception of the location of Tinnitus
 * <!-- end-model-doc -->
 * @see com.himsa.measurement.tinnitus._500._500Package#getTinnitusPerceptionLocationType()
 * @model extendedMetaData="name='TinnitusPerceptionLocation_Type'"
 * @generated
 */
@ProviderType
public enum TinnitusPerceptionLocationType implements Enumerator {
	/**
	 * The '<em><b>Central</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Central / Tinnitus is percived centrally in the head.      
	 * <!-- end-model-doc -->
	 * @see #CENTRAL_VALUE
	 * @generated
	 * @ordered
	 */
	CENTRAL(0, "Central", "Central"),

	/**
	 * The '<em><b>Binaural</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Binaural / Tinnitus is percived in both ears not central.
	 * <!-- end-model-doc -->
	 * @see #BINAURAL_VALUE
	 * @generated
	 * @ordered
	 */
	BINAURAL(1, "Binaural", "Binaural"),

	/**
	 * The '<em><b>Monaural Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MonArualRight / Tinnitus is percived in the right side of the head.      
	 * <!-- end-model-doc -->
	 * @see #MONAURAL_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	MONAURAL_RIGHT(2, "MonauralRight", "MonauralRight"),

	/**
	 * The '<em><b>Monaural Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MonarualLeft / Tinnitus is percived in the right side of the head.
	 * <!-- end-model-doc -->
	 * @see #MONAURAL_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	MONAURAL_LEFT(3, "MonauralLeft", "MonauralLeft"),

	/**
	 * The '<em><b>Variable Location</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tinnitus is percived in variable location
	 * <!-- end-model-doc -->
	 * @see #VARIABLE_LOCATION_VALUE
	 * @generated
	 * @ordered
	 */
	VARIABLE_LOCATION(4, "VariableLocation", "VariableLocation"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tinnitus perception location cannot be decided
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(5, "Unknown", "Unknown");

	/**
	 * The '<em><b>Central</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Central / Tinnitus is percived centrally in the head.      
	 * <!-- end-model-doc -->
	 * @see #CENTRAL
	 * @model name="Central"
	 * @generated
	 * @ordered
	 */
	public static final int CENTRAL_VALUE = 0;

	/**
	 * The '<em><b>Binaural</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Binaural / Tinnitus is percived in both ears not central.
	 * <!-- end-model-doc -->
	 * @see #BINAURAL
	 * @model name="Binaural"
	 * @generated
	 * @ordered
	 */
	public static final int BINAURAL_VALUE = 1;

	/**
	 * The '<em><b>Monaural Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MonArualRight / Tinnitus is percived in the right side of the head.      
	 * <!-- end-model-doc -->
	 * @see #MONAURAL_RIGHT
	 * @model name="MonauralRight"
	 * @generated
	 * @ordered
	 */
	public static final int MONAURAL_RIGHT_VALUE = 2;

	/**
	 * The '<em><b>Monaural Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MonarualLeft / Tinnitus is percived in the right side of the head.
	 * <!-- end-model-doc -->
	 * @see #MONAURAL_LEFT
	 * @model name="MonauralLeft"
	 * @generated
	 * @ordered
	 */
	public static final int MONAURAL_LEFT_VALUE = 3;

	/**
	 * The '<em><b>Variable Location</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tinnitus is percived in variable location
	 * <!-- end-model-doc -->
	 * @see #VARIABLE_LOCATION
	 * @model name="VariableLocation"
	 * @generated
	 * @ordered
	 */
	public static final int VARIABLE_LOCATION_VALUE = 4;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tinnitus perception location cannot be decided
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN
	 * @model name="Unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 5;

	/**
	 * An array of all the '<em><b>Tinnitus Perception Location Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TinnitusPerceptionLocationType[] VALUES_ARRAY =
		new TinnitusPerceptionLocationType[] {
			CENTRAL,
			BINAURAL,
			MONAURAL_RIGHT,
			MONAURAL_LEFT,
			VARIABLE_LOCATION,
			UNKNOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Tinnitus Perception Location Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TinnitusPerceptionLocationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tinnitus Perception Location Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TinnitusPerceptionLocationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TinnitusPerceptionLocationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tinnitus Perception Location Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TinnitusPerceptionLocationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TinnitusPerceptionLocationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tinnitus Perception Location Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TinnitusPerceptionLocationType get(int value) {
		switch (value) {
			case CENTRAL_VALUE: return CENTRAL;
			case BINAURAL_VALUE: return BINAURAL;
			case MONAURAL_RIGHT_VALUE: return MONAURAL_RIGHT;
			case MONAURAL_LEFT_VALUE: return MONAURAL_LEFT;
			case VARIABLE_LOCATION_VALUE: return VARIABLE_LOCATION;
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
	private TinnitusPerceptionLocationType(int value, String name, String literal) {
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
	
} //TinnitusPerceptionLocationType
