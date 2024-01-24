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
 * A representation of the literals of the enumeration '<em><b>Point Status Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Notes for Enumerated Values:
 * 
 * + Unknown / The parameter is defined, but to the value Unknown
 * 
 * + Normal / Valid threshold point.  Used for valid curve points at the threshold: For this threshold point,  the patient could hear and respond to the presented stimulus 50 pct. of the time. (from the definition of a threshold).
 * 
 * + AlwaysResponse / Patient might hear better than this.  Used for valid curve points probably above the threshold:, The patient could hear and respond to the presented stimulus all of the time.
 * 
 * + NoResponse / Patient did not respond.  The stimulus was at the highest output level of the measurement device, but the patient did not respond. In pure tone graph, a point is
 * plotted at the dB level corresponding to the highest output level of the measuring device.
 * 
 * + NotMeasurable / Presented stimulus to patient but without a result. It was not possible to measure threshold consistently or reliably.  A point is plotted at the dB level that best represents the 
 * 
 * <!-- end-model-doc -->
 * @see com.himsa.measurement.audiogram._502._502Package#getPointStatusType()
 * @model extendedMetaData="name='PointStatus_Type'"
 * @generated
 */
@ProviderType
public enum PointStatusType implements Enumerator {
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
	 * The '<em><b>Normal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	NORMAL(1, "Normal", "Normal"),

	/**
	 * The '<em><b>Always Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALWAYS_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	ALWAYS_RESPONSE(2, "AlwaysResponse", "AlwaysResponse"),

	/**
	 * The '<em><b>No Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	NO_RESPONSE(3, "NoResponse", "NoResponse"),

	/**
	 * The '<em><b>Not Measurable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_MEASURABLE_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_MEASURABLE(4, "NotMeasurable", "NotMeasurable"),

	/**
	 * The '<em><b>Did Not Test</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DID_NOT_TEST_VALUE
	 * @generated
	 * @ordered
	 */
	DID_NOT_TEST(5, "DidNotTest", "DidNotTest"),

	/**
	 * The '<em><b>Could Not Test</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COULD_NOT_TEST_VALUE
	 * @generated
	 * @ordered
	 */
	COULD_NOT_TEST(6, "CouldNotTest", "CouldNotTest"),

	/**
	 * The '<em><b>User1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER1_VALUE
	 * @generated
	 * @ordered
	 */
	USER1(7, "User1", "User1"),

	/**
	 * The '<em><b>User2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER2_VALUE
	 * @generated
	 * @ordered
	 */
	USER2(8, "User2", "User2"),

	/**
	 * The '<em><b>User3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER3_VALUE
	 * @generated
	 * @ordered
	 */
	USER3(9, "User3", "User3");

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
	 * The '<em><b>Normal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL
	 * @model name="Normal"
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_VALUE = 1;

	/**
	 * The '<em><b>Always Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALWAYS_RESPONSE
	 * @model name="AlwaysResponse"
	 * @generated
	 * @ordered
	 */
	public static final int ALWAYS_RESPONSE_VALUE = 2;

	/**
	 * The '<em><b>No Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_RESPONSE
	 * @model name="NoResponse"
	 * @generated
	 * @ordered
	 */
	public static final int NO_RESPONSE_VALUE = 3;

	/**
	 * The '<em><b>Not Measurable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_MEASURABLE
	 * @model name="NotMeasurable"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_MEASURABLE_VALUE = 4;

	/**
	 * The '<em><b>Did Not Test</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DID_NOT_TEST
	 * @model name="DidNotTest"
	 * @generated
	 * @ordered
	 */
	public static final int DID_NOT_TEST_VALUE = 5;

	/**
	 * The '<em><b>Could Not Test</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COULD_NOT_TEST
	 * @model name="CouldNotTest"
	 * @generated
	 * @ordered
	 */
	public static final int COULD_NOT_TEST_VALUE = 6;

	/**
	 * The '<em><b>User1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER1
	 * @model name="User1"
	 * @generated
	 * @ordered
	 */
	public static final int USER1_VALUE = 7;

	/**
	 * The '<em><b>User2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER2
	 * @model name="User2"
	 * @generated
	 * @ordered
	 */
	public static final int USER2_VALUE = 8;

	/**
	 * The '<em><b>User3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER3
	 * @model name="User3"
	 * @generated
	 * @ordered
	 */
	public static final int USER3_VALUE = 9;

	/**
	 * An array of all the '<em><b>Point Status Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PointStatusType[] VALUES_ARRAY =
		new PointStatusType[] {
			UNKNOWN,
			NORMAL,
			ALWAYS_RESPONSE,
			NO_RESPONSE,
			NOT_MEASURABLE,
			DID_NOT_TEST,
			COULD_NOT_TEST,
			USER1,
			USER2,
			USER3,
		};

	/**
	 * A public read-only list of all the '<em><b>Point Status Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PointStatusType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Point Status Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PointStatusType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PointStatusType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Point Status Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PointStatusType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PointStatusType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Point Status Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PointStatusType get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case NORMAL_VALUE: return NORMAL;
			case ALWAYS_RESPONSE_VALUE: return ALWAYS_RESPONSE;
			case NO_RESPONSE_VALUE: return NO_RESPONSE;
			case NOT_MEASURABLE_VALUE: return NOT_MEASURABLE;
			case DID_NOT_TEST_VALUE: return DID_NOT_TEST;
			case COULD_NOT_TEST_VALUE: return COULD_NOT_TEST;
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
	private PointStatusType(int value, String name, String literal) {
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
	
} //PointStatusType
