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
 * A representation of the literals of the enumeration '<em><b>Battery Pill Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The type of battery pill.
 * 
 * ##TBattPill##
 * 
 * 
 * <!-- end-model-doc -->
 * @see com.himsa.measurement.real.ear.EarPackage#getBatteryPillType()
 * @model extendedMetaData="name='BatteryPillType'"
 * @generated
 */
@ProviderType
public enum BatteryPillType implements Enumerator {
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
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(1, "None", "None"),

	/**
	 * The '<em><b>Battery312</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BATTERY312_VALUE
	 * @generated
	 * @ordered
	 */
	BATTERY312(2, "Battery312", "Battery312"),

	/**
	 * The '<em><b>Battery13</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BATTERY13_VALUE
	 * @generated
	 * @ordered
	 */
	BATTERY13(3, "Battery13", "Battery13"),

	/**
	 * The '<em><b>Battery230</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BATTERY230_VALUE
	 * @generated
	 * @ordered
	 */
	BATTERY230(4, "Battery230", "Battery230"),

	/**
	 * The '<em><b>Battery675</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BATTERY675_VALUE
	 * @generated
	 * @ordered
	 */
	BATTERY675(5, "Battery675", "Battery675"),

	/**
	 * The '<em><b>User1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER1_VALUE
	 * @generated
	 * @ordered
	 */
	USER1(6, "User1", "User1"),

	/**
	 * The '<em><b>User2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER2_VALUE
	 * @generated
	 * @ordered
	 */
	USER2(7, "User2", "User2"),

	/**
	 * The '<em><b>User3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER3_VALUE
	 * @generated
	 * @ordered
	 */
	USER3(8, "User3", "User3");

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
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 1;

	/**
	 * The '<em><b>Battery312</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BATTERY312
	 * @model name="Battery312"
	 * @generated
	 * @ordered
	 */
	public static final int BATTERY312_VALUE = 2;

	/**
	 * The '<em><b>Battery13</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BATTERY13
	 * @model name="Battery13"
	 * @generated
	 * @ordered
	 */
	public static final int BATTERY13_VALUE = 3;

	/**
	 * The '<em><b>Battery230</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BATTERY230
	 * @model name="Battery230"
	 * @generated
	 * @ordered
	 */
	public static final int BATTERY230_VALUE = 4;

	/**
	 * The '<em><b>Battery675</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BATTERY675
	 * @model name="Battery675"
	 * @generated
	 * @ordered
	 */
	public static final int BATTERY675_VALUE = 5;

	/**
	 * The '<em><b>User1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER1
	 * @model name="User1"
	 * @generated
	 * @ordered
	 */
	public static final int USER1_VALUE = 6;

	/**
	 * The '<em><b>User2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER2
	 * @model name="User2"
	 * @generated
	 * @ordered
	 */
	public static final int USER2_VALUE = 7;

	/**
	 * The '<em><b>User3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER3
	 * @model name="User3"
	 * @generated
	 * @ordered
	 */
	public static final int USER3_VALUE = 8;

	/**
	 * An array of all the '<em><b>Battery Pill Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BatteryPillType[] VALUES_ARRAY =
		new BatteryPillType[] {
			UNDEFINED,
			NONE,
			BATTERY312,
			BATTERY13,
			BATTERY230,
			BATTERY675,
			USER1,
			USER2,
			USER3,
		};

	/**
	 * A public read-only list of all the '<em><b>Battery Pill Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BatteryPillType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Battery Pill Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BatteryPillType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BatteryPillType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Battery Pill Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BatteryPillType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BatteryPillType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Battery Pill Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BatteryPillType get(int value) {
		switch (value) {
			case UNDEFINED_VALUE: return UNDEFINED;
			case NONE_VALUE: return NONE;
			case BATTERY312_VALUE: return BATTERY312;
			case BATTERY13_VALUE: return BATTERY13;
			case BATTERY230_VALUE: return BATTERY230;
			case BATTERY675_VALUE: return BATTERY675;
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
	private BatteryPillType(int value, String name, String literal) {
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
	
} //BatteryPillType
