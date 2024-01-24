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
 * A representation of the literals of the enumeration '<em><b>Tinnitus Match Sucess Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * How is the tinnitus matching working
 * 
 * <!-- end-model-doc -->
 * @see com.himsa.measurement.tinnitus._500._500Package#getTinnitusMatchSucessType()
 * @model extendedMetaData="name='TinnitusMatchSucess_Type'"
 * @generated
 */
@ProviderType
public enum TinnitusMatchSucessType implements Enumerator {
	/**
	 * The '<em><b>Partial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTIAL_VALUE
	 * @generated
	 * @ordered
	 */
	PARTIAL(0, "Partial", "Partial"),

	/**
	 * The '<em><b>Complete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETE(1, "Complete", "Complete"),

	/**
	 * The '<em><b>No Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reached the limits of equipment
	 * <!-- end-model-doc -->
	 * @see #NO_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	NO_RESPONSE(2, "NoResponse", "NoResponse"),

	/**
	 * The '<em><b>Could Not Test</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COULD_NOT_TEST_VALUE
	 * @generated
	 * @ordered
	 */
	COULD_NOT_TEST(3, "CouldNotTest", "CouldNotTest");

	/**
	 * The '<em><b>Partial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTIAL
	 * @model name="Partial"
	 * @generated
	 * @ordered
	 */
	public static final int PARTIAL_VALUE = 0;

	/**
	 * The '<em><b>Complete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETE
	 * @model name="Complete"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETE_VALUE = 1;

	/**
	 * The '<em><b>No Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reached the limits of equipment
	 * <!-- end-model-doc -->
	 * @see #NO_RESPONSE
	 * @model name="NoResponse"
	 * @generated
	 * @ordered
	 */
	public static final int NO_RESPONSE_VALUE = 2;

	/**
	 * The '<em><b>Could Not Test</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COULD_NOT_TEST
	 * @model name="CouldNotTest"
	 * @generated
	 * @ordered
	 */
	public static final int COULD_NOT_TEST_VALUE = 3;

	/**
	 * An array of all the '<em><b>Tinnitus Match Sucess Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TinnitusMatchSucessType[] VALUES_ARRAY =
		new TinnitusMatchSucessType[] {
			PARTIAL,
			COMPLETE,
			NO_RESPONSE,
			COULD_NOT_TEST,
		};

	/**
	 * A public read-only list of all the '<em><b>Tinnitus Match Sucess Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TinnitusMatchSucessType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tinnitus Match Sucess Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TinnitusMatchSucessType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TinnitusMatchSucessType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tinnitus Match Sucess Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TinnitusMatchSucessType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TinnitusMatchSucessType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tinnitus Match Sucess Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TinnitusMatchSucessType get(int value) {
		switch (value) {
			case PARTIAL_VALUE: return PARTIAL;
			case COMPLETE_VALUE: return COMPLETE;
			case NO_RESPONSE_VALUE: return NO_RESPONSE;
			case COULD_NOT_TEST_VALUE: return COULD_NOT_TEST;
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
	private TinnitusMatchSucessType(int value, String name, String literal) {
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
	
} //TinnitusMatchSucessType
