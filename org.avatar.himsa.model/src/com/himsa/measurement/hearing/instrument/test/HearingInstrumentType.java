/*
 */
package com.himsa.measurement.hearing.instrument.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Hearing Instrument Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The type of hearing instrument being tested.
 * 
 * ##THIType##
 * <!-- end-model-doc -->
 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getHearingInstrumentType()
 * @model extendedMetaData="name='HearingInstrumentType'"
 * @generated
 */
@ProviderType
public enum HearingInstrumentType implements Enumerator {
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
	 * The '<em><b>ITE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITE_VALUE
	 * @generated
	 * @ordered
	 */
	ITE(1, "ITE", "ITE"),

	/**
	 * The '<em><b>BTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BTE_VALUE
	 * @generated
	 * @ordered
	 */
	BTE(2, "BTE", "BTE"),

	/**
	 * The '<em><b>ITC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITC_VALUE
	 * @generated
	 * @ordered
	 */
	ITC(3, "ITC", "ITC"),

	/**
	 * The '<em><b>MITC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MITC_VALUE
	 * @generated
	 * @ordered
	 */
	MITC(4, "MITC", "MITC"),

	/**
	 * The '<em><b>Body</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BODY_VALUE
	 * @generated
	 * @ordered
	 */
	BODY(5, "Body", "Body"),

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
	USER3(8, "User3", "User3"),

	/**
	 * The '<em><b>User4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER4_VALUE
	 * @generated
	 * @ordered
	 */
	USER4(9, "User4", "User4"),

	/**
	 * The '<em><b>User5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER5_VALUE
	 * @generated
	 * @ordered
	 */
	USER5(10, "User5", "User5");

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
	 * The '<em><b>ITE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ITE_VALUE = 1;

	/**
	 * The '<em><b>BTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BTE_VALUE = 2;

	/**
	 * The '<em><b>ITC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ITC_VALUE = 3;

	/**
	 * The '<em><b>MITC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MITC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MITC_VALUE = 4;

	/**
	 * The '<em><b>Body</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BODY
	 * @model name="Body"
	 * @generated
	 * @ordered
	 */
	public static final int BODY_VALUE = 5;

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
	 * The '<em><b>User4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER4
	 * @model name="User4"
	 * @generated
	 * @ordered
	 */
	public static final int USER4_VALUE = 9;

	/**
	 * The '<em><b>User5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER5
	 * @model name="User5"
	 * @generated
	 * @ordered
	 */
	public static final int USER5_VALUE = 10;

	/**
	 * An array of all the '<em><b>Hearing Instrument Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HearingInstrumentType[] VALUES_ARRAY =
		new HearingInstrumentType[] {
			UNDEFINED,
			ITE,
			BTE,
			ITC,
			MITC,
			BODY,
			USER1,
			USER2,
			USER3,
			USER4,
			USER5,
		};

	/**
	 * A public read-only list of all the '<em><b>Hearing Instrument Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HearingInstrumentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Hearing Instrument Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HearingInstrumentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HearingInstrumentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hearing Instrument Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HearingInstrumentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HearingInstrumentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hearing Instrument Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HearingInstrumentType get(int value) {
		switch (value) {
			case UNDEFINED_VALUE: return UNDEFINED;
			case ITE_VALUE: return ITE;
			case BTE_VALUE: return BTE;
			case ITC_VALUE: return ITC;
			case MITC_VALUE: return MITC;
			case BODY_VALUE: return BODY;
			case USER1_VALUE: return USER1;
			case USER2_VALUE: return USER2;
			case USER3_VALUE: return USER3;
			case USER4_VALUE: return USER4;
			case USER5_VALUE: return USER5;
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
	private HearingInstrumentType(int value, String name, String literal) {
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
	
} //HearingInstrumentType
