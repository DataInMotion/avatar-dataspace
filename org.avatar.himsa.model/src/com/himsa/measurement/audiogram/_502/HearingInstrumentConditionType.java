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
 * A representation of the literals of the enumeration '<em><b>Hearing Instrument Condition Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The Hearing Instrument Condition Type indicates whether the patient wore a Hearing Instrument during the measurement. The NOAH 3.0 Audiogram Module specification allows a user to specify both an Aided1 and an Aided2 condition to differentiate between tests with two different types of Hearing Instruments. This scenario may mean that the user enters data in an Aided2 field without corresponding information on the Aided1 test condition. 
 * 
 * + Unknown / The aided condition is unknown
 * + No Condition / The aided condition is unavailable
 * + Unaided / There is no hearing instrument or related device being worn by the patient
 * + Aided1 / Hearing instrument 1
 * + Aided 2 /  Hearing instrument 2
 * 
 * 
 * <!-- end-model-doc -->
 * @see com.himsa.measurement.audiogram._502._502Package#getHearingInstrumentConditionType()
 * @model extendedMetaData="name='HearingInstrumentCondition_Type'"
 * @generated
 */
@ProviderType
public enum HearingInstrumentConditionType implements Enumerator {
	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "Unknown", "Unknown"),

	/**
	 * The '<em><b>No Condition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_CONDITION_VALUE
	 * @generated
	 * @ordered
	 */
	NO_CONDITION(1, "NoCondition", "NoCondition"),

	/**
	 * The '<em><b>Un Aided</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UN_AIDED_VALUE
	 * @generated
	 * @ordered
	 */
	UN_AIDED(2, "UnAided", "UnAided"),

	/**
	 * The '<em><b>Aided1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIDED1_VALUE
	 * @generated
	 * @ordered
	 */
	AIDED1(3, "Aided1", "Aided1"),

	/**
	 * The '<em><b>Aided2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIDED2_VALUE
	 * @generated
	 * @ordered
	 */
	AIDED2(4, "Aided2", "Aided2"),

	/**
	 * The '<em><b>User1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER1_VALUE
	 * @generated
	 * @ordered
	 */
	USER1(5, "User1", "User1"),

	/**
	 * The '<em><b>User2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER2_VALUE
	 * @generated
	 * @ordered
	 */
	USER2(6, "User2", "User2"),

	/**
	 * The '<em><b>User3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER3_VALUE
	 * @generated
	 * @ordered
	 */
	USER3(7, "User3", "User3");

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="Unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

	/**
	 * The '<em><b>No Condition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_CONDITION
	 * @model name="NoCondition"
	 * @generated
	 * @ordered
	 */
	public static final int NO_CONDITION_VALUE = 1;

	/**
	 * The '<em><b>Un Aided</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UN_AIDED
	 * @model name="UnAided"
	 * @generated
	 * @ordered
	 */
	public static final int UN_AIDED_VALUE = 2;

	/**
	 * The '<em><b>Aided1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIDED1
	 * @model name="Aided1"
	 * @generated
	 * @ordered
	 */
	public static final int AIDED1_VALUE = 3;

	/**
	 * The '<em><b>Aided2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIDED2
	 * @model name="Aided2"
	 * @generated
	 * @ordered
	 */
	public static final int AIDED2_VALUE = 4;

	/**
	 * The '<em><b>User1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER1
	 * @model name="User1"
	 * @generated
	 * @ordered
	 */
	public static final int USER1_VALUE = 5;

	/**
	 * The '<em><b>User2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER2
	 * @model name="User2"
	 * @generated
	 * @ordered
	 */
	public static final int USER2_VALUE = 6;

	/**
	 * The '<em><b>User3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER3
	 * @model name="User3"
	 * @generated
	 * @ordered
	 */
	public static final int USER3_VALUE = 7;

	/**
	 * An array of all the '<em><b>Hearing Instrument Condition Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HearingInstrumentConditionType[] VALUES_ARRAY =
		new HearingInstrumentConditionType[] {
			UNKNOWN,
			NO_CONDITION,
			UN_AIDED,
			AIDED1,
			AIDED2,
			USER1,
			USER2,
			USER3,
		};

	/**
	 * A public read-only list of all the '<em><b>Hearing Instrument Condition Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HearingInstrumentConditionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Hearing Instrument Condition Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HearingInstrumentConditionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HearingInstrumentConditionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hearing Instrument Condition Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HearingInstrumentConditionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HearingInstrumentConditionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hearing Instrument Condition Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HearingInstrumentConditionType get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case NO_CONDITION_VALUE: return NO_CONDITION;
			case UN_AIDED_VALUE: return UN_AIDED;
			case AIDED1_VALUE: return AIDED1;
			case AIDED2_VALUE: return AIDED2;
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
	private HearingInstrumentConditionType(int value, String name, String literal) {
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
	
} //HearingInstrumentConditionType
