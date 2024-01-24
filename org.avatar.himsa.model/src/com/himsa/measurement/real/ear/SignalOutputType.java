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
 * A representation of the literals of the enumeration '<em><b>Signal Output Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The channel/media used to present the signal/stimulus.
 * 
 * ##TSignalOutput##
 * <!-- end-model-doc -->
 * @see com.himsa.measurement.real.ear.EarPackage#getSignalOutputType()
 * @model extendedMetaData="name='SignalOutputType'"
 * @generated
 */
@ProviderType
public enum SignalOutputType implements Enumerator {
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
	 * The '<em><b>Internal Box</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNAL_BOX_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNAL_BOX(1, "InternalBox", "InternalBox"),

	/**
	 * The '<em><b>External Box</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL_BOX_VALUE
	 * @generated
	 * @ordered
	 */
	EXTERNAL_BOX(2, "ExternalBox", "ExternalBox"),

	/**
	 * The '<em><b>Free Field</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREE_FIELD_VALUE
	 * @generated
	 * @ordered
	 */
	FREE_FIELD(3, "FreeField", "FreeField"),

	/**
	 * The '<em><b>Internal Box Coil</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNAL_BOX_COIL_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNAL_BOX_COIL(4, "InternalBoxCoil", "InternalBoxCoil"),

	/**
	 * The '<em><b>External Box Coil</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL_BOX_COIL_VALUE
	 * @generated
	 * @ordered
	 */
	EXTERNAL_BOX_COIL(5, "ExternalBoxCoil", "ExternalBoxCoil"),

	/**
	 * The '<em><b>Free Field Induction Coil</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREE_FIELD_INDUCTION_COIL_VALUE
	 * @generated
	 * @ordered
	 */
	FREE_FIELD_INDUCTION_COIL(6, "FreeFieldInductionCoil", "FreeFieldInductionCoil"),

	/**
	 * The '<em><b>Air Conduction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIR_CONDUCTION_VALUE
	 * @generated
	 * @ordered
	 */
	AIR_CONDUCTION(7, "AirConduction", "AirConduction"),

	/**
	 * The '<em><b>User1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER1_VALUE
	 * @generated
	 * @ordered
	 */
	USER1(8, "User1", "User1"),

	/**
	 * The '<em><b>User2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER2_VALUE
	 * @generated
	 * @ordered
	 */
	USER2(9, "User2", "User2"),

	/**
	 * The '<em><b>User3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER3_VALUE
	 * @generated
	 * @ordered
	 */
	USER3(10, "User3", "User3");

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
	 * The '<em><b>Internal Box</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNAL_BOX
	 * @model name="InternalBox"
	 * @generated
	 * @ordered
	 */
	public static final int INTERNAL_BOX_VALUE = 1;

	/**
	 * The '<em><b>External Box</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL_BOX
	 * @model name="ExternalBox"
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_BOX_VALUE = 2;

	/**
	 * The '<em><b>Free Field</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREE_FIELD
	 * @model name="FreeField"
	 * @generated
	 * @ordered
	 */
	public static final int FREE_FIELD_VALUE = 3;

	/**
	 * The '<em><b>Internal Box Coil</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNAL_BOX_COIL
	 * @model name="InternalBoxCoil"
	 * @generated
	 * @ordered
	 */
	public static final int INTERNAL_BOX_COIL_VALUE = 4;

	/**
	 * The '<em><b>External Box Coil</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL_BOX_COIL
	 * @model name="ExternalBoxCoil"
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_BOX_COIL_VALUE = 5;

	/**
	 * The '<em><b>Free Field Induction Coil</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREE_FIELD_INDUCTION_COIL
	 * @model name="FreeFieldInductionCoil"
	 * @generated
	 * @ordered
	 */
	public static final int FREE_FIELD_INDUCTION_COIL_VALUE = 6;

	/**
	 * The '<em><b>Air Conduction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIR_CONDUCTION
	 * @model name="AirConduction"
	 * @generated
	 * @ordered
	 */
	public static final int AIR_CONDUCTION_VALUE = 7;

	/**
	 * The '<em><b>User1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER1
	 * @model name="User1"
	 * @generated
	 * @ordered
	 */
	public static final int USER1_VALUE = 8;

	/**
	 * The '<em><b>User2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER2
	 * @model name="User2"
	 * @generated
	 * @ordered
	 */
	public static final int USER2_VALUE = 9;

	/**
	 * The '<em><b>User3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER3
	 * @model name="User3"
	 * @generated
	 * @ordered
	 */
	public static final int USER3_VALUE = 10;

	/**
	 * An array of all the '<em><b>Signal Output Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SignalOutputType[] VALUES_ARRAY =
		new SignalOutputType[] {
			UNDEFINED,
			INTERNAL_BOX,
			EXTERNAL_BOX,
			FREE_FIELD,
			INTERNAL_BOX_COIL,
			EXTERNAL_BOX_COIL,
			FREE_FIELD_INDUCTION_COIL,
			AIR_CONDUCTION,
			USER1,
			USER2,
			USER3,
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
			case UNDEFINED_VALUE: return UNDEFINED;
			case INTERNAL_BOX_VALUE: return INTERNAL_BOX;
			case EXTERNAL_BOX_VALUE: return EXTERNAL_BOX;
			case FREE_FIELD_VALUE: return FREE_FIELD;
			case INTERNAL_BOX_COIL_VALUE: return INTERNAL_BOX_COIL;
			case EXTERNAL_BOX_COIL_VALUE: return EXTERNAL_BOX_COIL;
			case FREE_FIELD_INDUCTION_COIL_VALUE: return FREE_FIELD_INDUCTION_COIL;
			case AIR_CONDUCTION_VALUE: return AIR_CONDUCTION;
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
