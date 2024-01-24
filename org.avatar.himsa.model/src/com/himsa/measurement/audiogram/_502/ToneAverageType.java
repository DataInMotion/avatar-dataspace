/*
 */
package com.himsa.measurement.audiogram._502;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tone Average Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 *  Frequency Values used to calculate the average
 * 
 * In the event that a XML file is saved into NOAH (e.g. a new NOAH module is saving in version 500) it is technically possible for a frequency to be listed more than once as this would validate fine.  In the event that a program is reading the data then the additional entry will effectively need to be ignored
 * 
 * <!-- end-model-doc -->
 * @see com.himsa.measurement.audiogram._502._502Package#getToneAverageType()
 * @model extendedMetaData="name='ToneAverage_Type'"
 * @generated
 */
@ProviderType
public enum ToneAverageType implements Enumerator {
	/**
	 * The '<em><b>125</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_125_VALUE
	 * @generated
	 * @ordered
	 */
	_125(0, "_125", "125"),

	/**
	 * The '<em><b>250</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_250_VALUE
	 * @generated
	 * @ordered
	 */
	_250(1, "_250", "250"),

	/**
	 * The '<em><b>500</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_500_VALUE
	 * @generated
	 * @ordered
	 */
	_500(2, "_500", "500"),

	/**
	 * The '<em><b>750</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_750_VALUE
	 * @generated
	 * @ordered
	 */
	_750(3, "_750", "750"),

	/**
	 * The '<em><b>1000</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1000_VALUE
	 * @generated
	 * @ordered
	 */
	_1000(4, "_1000", "1000"),

	/**
	 * The '<em><b>1500</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1500_VALUE
	 * @generated
	 * @ordered
	 */
	_1500(5, "_1500", "1500"),

	/**
	 * The '<em><b>2000</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_2000_VALUE
	 * @generated
	 * @ordered
	 */
	_2000(6, "_2000", "2000"),

	/**
	 * The '<em><b>3000</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_3000_VALUE
	 * @generated
	 * @ordered
	 */
	_3000(7, "_3000", "3000"),

	/**
	 * The '<em><b>4000</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_4000_VALUE
	 * @generated
	 * @ordered
	 */
	_4000(8, "_4000", "4000"),

	/**
	 * The '<em><b>6000</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_6000_VALUE
	 * @generated
	 * @ordered
	 */
	_6000(9, "_6000", "6000"),

	/**
	 * The '<em><b>8000</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_8000_VALUE
	 * @generated
	 * @ordered
	 */
	_8000(10, "_8000", "8000"),

	/**
	 * The '<em><b>12000</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_12000_VALUE
	 * @generated
	 * @ordered
	 */
	_12000(11, "_12000", "12000"),

	/**
	 * The '<em><b>16000</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_16000_VALUE
	 * @generated
	 * @ordered
	 */
	_16000(12, "_16000", "16000"),

	/**
	 * The '<em><b>User1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER1_VALUE
	 * @generated
	 * @ordered
	 */
	USER1(13, "User1", "User1"),

	/**
	 * The '<em><b>User2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER2_VALUE
	 * @generated
	 * @ordered
	 */
	USER2(14, "User2", "User2"),

	/**
	 * The '<em><b>User3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER3_VALUE
	 * @generated
	 * @ordered
	 */
	USER3(15, "User3", "User3");

	/**
	 * The '<em><b>125</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_125
	 * @model literal="125"
	 * @generated
	 * @ordered
	 */
	public static final int _125_VALUE = 0;

	/**
	 * The '<em><b>250</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_250
	 * @model literal="250"
	 * @generated
	 * @ordered
	 */
	public static final int _250_VALUE = 1;

	/**
	 * The '<em><b>500</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_500
	 * @model literal="500"
	 * @generated
	 * @ordered
	 */
	public static final int _500_VALUE = 2;

	/**
	 * The '<em><b>750</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_750
	 * @model literal="750"
	 * @generated
	 * @ordered
	 */
	public static final int _750_VALUE = 3;

	/**
	 * The '<em><b>1000</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1000
	 * @model literal="1000"
	 * @generated
	 * @ordered
	 */
	public static final int _1000_VALUE = 4;

	/**
	 * The '<em><b>1500</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1500
	 * @model literal="1500"
	 * @generated
	 * @ordered
	 */
	public static final int _1500_VALUE = 5;

	/**
	 * The '<em><b>2000</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_2000
	 * @model literal="2000"
	 * @generated
	 * @ordered
	 */
	public static final int _2000_VALUE = 6;

	/**
	 * The '<em><b>3000</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_3000
	 * @model literal="3000"
	 * @generated
	 * @ordered
	 */
	public static final int _3000_VALUE = 7;

	/**
	 * The '<em><b>4000</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_4000
	 * @model literal="4000"
	 * @generated
	 * @ordered
	 */
	public static final int _4000_VALUE = 8;

	/**
	 * The '<em><b>6000</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_6000
	 * @model literal="6000"
	 * @generated
	 * @ordered
	 */
	public static final int _6000_VALUE = 9;

	/**
	 * The '<em><b>8000</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_8000
	 * @model literal="8000"
	 * @generated
	 * @ordered
	 */
	public static final int _8000_VALUE = 10;

	/**
	 * The '<em><b>12000</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_12000
	 * @model literal="12000"
	 * @generated
	 * @ordered
	 */
	public static final int _12000_VALUE = 11;

	/**
	 * The '<em><b>16000</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_16000
	 * @model literal="16000"
	 * @generated
	 * @ordered
	 */
	public static final int _16000_VALUE = 12;

	/**
	 * The '<em><b>User1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER1
	 * @model name="User1"
	 * @generated
	 * @ordered
	 */
	public static final int USER1_VALUE = 13;

	/**
	 * The '<em><b>User2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER2
	 * @model name="User2"
	 * @generated
	 * @ordered
	 */
	public static final int USER2_VALUE = 14;

	/**
	 * The '<em><b>User3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER3
	 * @model name="User3"
	 * @generated
	 * @ordered
	 */
	public static final int USER3_VALUE = 15;

	/**
	 * An array of all the '<em><b>Tone Average Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ToneAverageType[] VALUES_ARRAY =
		new ToneAverageType[] {
			_125,
			_250,
			_500,
			_750,
			_1000,
			_1500,
			_2000,
			_3000,
			_4000,
			_6000,
			_8000,
			_12000,
			_16000,
			USER1,
			USER2,
			USER3,
		};

	/**
	 * A public read-only list of all the '<em><b>Tone Average Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ToneAverageType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tone Average Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ToneAverageType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ToneAverageType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tone Average Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ToneAverageType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ToneAverageType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tone Average Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ToneAverageType get(int value) {
		switch (value) {
			case _125_VALUE: return _125;
			case _250_VALUE: return _250;
			case _500_VALUE: return _500;
			case _750_VALUE: return _750;
			case _1000_VALUE: return _1000;
			case _1500_VALUE: return _1500;
			case _2000_VALUE: return _2000;
			case _3000_VALUE: return _3000;
			case _4000_VALUE: return _4000;
			case _6000_VALUE: return _6000;
			case _8000_VALUE: return _8000;
			case _12000_VALUE: return _12000;
			case _16000_VALUE: return _16000;
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
	private ToneAverageType(int value, String name, String literal) {
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
	
} //ToneAverageType
