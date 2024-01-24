/*
 */
package admittance;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Reflex Test Response Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Choices that can be recorded when a result is not obtained
 * 
 * •	Normal / Valid threshold point. Used for valid points at the threshold: For this threshold point, the tester or equipment detects a present reflex. 
 * •	NoResponse (NR)  / Reflex not detected.  The stimulus was at the highest output level of the measurement device or at the highest intensity level allowed by clinical protocol, but no reflex was detected
 * •	CouldNotSeal (CNS) / Could not seal, therefore no results obtained
 * •	DidNotTest (DNT) /The stimulus was not presented to subject. Reasons: Per instruction by physician or because the test was judged to be unnecessary. No point was plotted.
 * •	CouldNotTest (CNT)  / Unable to present stimulus. Reasons: Subject's physical or behavioral limitations, inability to obtain a seal. No point was plotted.
 * 
 * No Response Safety (NR@): The professional stopped for safety reasons.  This is used to show that testing could have continued but was stopped.  NR@100, NR@105, NR@110, NR@115, NR@120
 * 
 * 
 * <!-- end-model-doc -->
 * @see admittance.AdmittancePackage#getReflexTestResponseType()
 * @model extendedMetaData="name='ReflexTestResponse_Type'"
 * @generated
 */
@ProviderType
public enum ReflexTestResponseType implements Enumerator {
	/**
	 * The '<em><b>Normal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	NORMAL(0, "Normal", "Normal"),

	/**
	 * The '<em><b>No Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	NO_RESPONSE(1, "NoResponse", "NoResponse"),

	/**
	 * The '<em><b>Could Not Seal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COULD_NOT_SEAL_VALUE
	 * @generated
	 * @ordered
	 */
	COULD_NOT_SEAL(2, "CouldNotSeal", "CouldNotSeal"),

	/**
	 * The '<em><b>Did Not Test</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DID_NOT_TEST_VALUE
	 * @generated
	 * @ordered
	 */
	DID_NOT_TEST(3, "DidNotTest", "DidNotTest"),

	/**
	 * The '<em><b>Could Not Test</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COULD_NOT_TEST_VALUE
	 * @generated
	 * @ordered
	 */
	COULD_NOT_TEST(4, "CouldNotTest", "CouldNotTest"),

	/**
	 * The '<em><b>NR At100</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NR_AT100_VALUE
	 * @generated
	 * @ordered
	 */
	NR_AT100(5, "NRAt100", "NR_at100"),

	/**
	 * The '<em><b>NR At105</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NR_AT105_VALUE
	 * @generated
	 * @ordered
	 */
	NR_AT105(6, "NRAt105", "NR_at105"),

	/**
	 * The '<em><b>NR At110</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NR_AT110_VALUE
	 * @generated
	 * @ordered
	 */
	NR_AT110(7, "NRAt110", "NR_at110"),

	/**
	 * The '<em><b>NR At115</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NR_AT115_VALUE
	 * @generated
	 * @ordered
	 */
	NR_AT115(8, "NRAt115", "NR_at115"),

	/**
	 * The '<em><b>NR At120</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NR_AT120_VALUE
	 * @generated
	 * @ordered
	 */
	NR_AT120(9, "NRAt120", "NR_at120");

	/**
	 * The '<em><b>Normal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL
	 * @model name="Normal"
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_VALUE = 0;

	/**
	 * The '<em><b>No Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_RESPONSE
	 * @model name="NoResponse"
	 * @generated
	 * @ordered
	 */
	public static final int NO_RESPONSE_VALUE = 1;

	/**
	 * The '<em><b>Could Not Seal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COULD_NOT_SEAL
	 * @model name="CouldNotSeal"
	 * @generated
	 * @ordered
	 */
	public static final int COULD_NOT_SEAL_VALUE = 2;

	/**
	 * The '<em><b>Did Not Test</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DID_NOT_TEST
	 * @model name="DidNotTest"
	 * @generated
	 * @ordered
	 */
	public static final int DID_NOT_TEST_VALUE = 3;

	/**
	 * The '<em><b>Could Not Test</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COULD_NOT_TEST
	 * @model name="CouldNotTest"
	 * @generated
	 * @ordered
	 */
	public static final int COULD_NOT_TEST_VALUE = 4;

	/**
	 * The '<em><b>NR At100</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NR_AT100
	 * @model name="NRAt100" literal="NR_at100"
	 * @generated
	 * @ordered
	 */
	public static final int NR_AT100_VALUE = 5;

	/**
	 * The '<em><b>NR At105</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NR_AT105
	 * @model name="NRAt105" literal="NR_at105"
	 * @generated
	 * @ordered
	 */
	public static final int NR_AT105_VALUE = 6;

	/**
	 * The '<em><b>NR At110</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NR_AT110
	 * @model name="NRAt110" literal="NR_at110"
	 * @generated
	 * @ordered
	 */
	public static final int NR_AT110_VALUE = 7;

	/**
	 * The '<em><b>NR At115</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NR_AT115
	 * @model name="NRAt115" literal="NR_at115"
	 * @generated
	 * @ordered
	 */
	public static final int NR_AT115_VALUE = 8;

	/**
	 * The '<em><b>NR At120</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NR_AT120
	 * @model name="NRAt120" literal="NR_at120"
	 * @generated
	 * @ordered
	 */
	public static final int NR_AT120_VALUE = 9;

	/**
	 * An array of all the '<em><b>Reflex Test Response Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReflexTestResponseType[] VALUES_ARRAY =
		new ReflexTestResponseType[] {
			NORMAL,
			NO_RESPONSE,
			COULD_NOT_SEAL,
			DID_NOT_TEST,
			COULD_NOT_TEST,
			NR_AT100,
			NR_AT105,
			NR_AT110,
			NR_AT115,
			NR_AT120,
		};

	/**
	 * A public read-only list of all the '<em><b>Reflex Test Response Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReflexTestResponseType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reflex Test Response Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReflexTestResponseType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReflexTestResponseType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reflex Test Response Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReflexTestResponseType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReflexTestResponseType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reflex Test Response Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReflexTestResponseType get(int value) {
		switch (value) {
			case NORMAL_VALUE: return NORMAL;
			case NO_RESPONSE_VALUE: return NO_RESPONSE;
			case COULD_NOT_SEAL_VALUE: return COULD_NOT_SEAL;
			case DID_NOT_TEST_VALUE: return DID_NOT_TEST;
			case COULD_NOT_TEST_VALUE: return COULD_NOT_TEST;
			case NR_AT100_VALUE: return NR_AT100;
			case NR_AT105_VALUE: return NR_AT105;
			case NR_AT110_VALUE: return NR_AT110;
			case NR_AT115_VALUE: return NR_AT115;
			case NR_AT120_VALUE: return NR_AT120;
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
	private ReflexTestResponseType(int value, String name, String literal) {
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
	
} //ReflexTestResponseType
