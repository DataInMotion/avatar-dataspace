/*
 */
package audiogram502;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DBweighting Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The decibel scale is used to measure the level of sound presented to the ears relative to a reference point. The decibel scales express a ratio between two numbers these are converted to a logarithmic scale. As this is a ratio we must have a reference level - you cannot say the sound is 10 times bigger if you do not state what it is bigger than. This reference point varies between different dB scales. 
 * 
 * For example dBSPL uses audiometric zero as it's reference point which is measured in Pascals and is the minimum pressure required to cause the sensation of hearing in the mid frequency region, (0,0002Pa). There are a number of different scales to use when measuring hearing thresholds on all of which use decibels with different reference points. 
 * 
 * The stimulus dB weighting is used to determine how much correction is required so that the audiometer dials read accurately for the chosen measurement scale. This will vary between tests e.g. dBSPL and dBHL measurements will have different dB weightings.
 * 
 * ABS / Absolute Value of a measurement without any corrections
 * CSL / Comfortable Speech Level.  According to ISO standard.
 * 
 * 
 * 
 * 
 * <!-- end-model-doc -->
 * @see audiogram502.Audiogram502Package#getDBweightingType()
 * @model extendedMetaData="name='dBweighting_Type'"
 * @generated
 */
@ProviderType
public enum DBweightingType implements Enumerator {
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
	 * The '<em><b>Nod BWeighting</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOD_BWEIGHTING_VALUE
	 * @generated
	 * @ordered
	 */
	NOD_BWEIGHTING(1, "NodBWeighting", "NodBWeighting"),

	/**
	 * The '<em><b>HL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HL_VALUE
	 * @generated
	 * @ordered
	 */
	HL(2, "HL", "HL"),

	/**
	 * The '<em><b>SPL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPL_VALUE
	 * @generated
	 * @ordered
	 */
	SPL(3, "SPL", "SPL"),

	/**
	 * The '<em><b>ABS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABS_VALUE
	 * @generated
	 * @ordered
	 */
	ABS(4, "ABS", "ABS"),

	/**
	 * The '<em><b>CSL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSL_VALUE
	 * @generated
	 * @ordered
	 */
	CSL(5, "CSL", "CSL"),

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
	 * The '<em><b>Nod BWeighting</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOD_BWEIGHTING
	 * @model name="NodBWeighting"
	 * @generated
	 * @ordered
	 */
	public static final int NOD_BWEIGHTING_VALUE = 1;

	/**
	 * The '<em><b>HL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HL_VALUE = 2;

	/**
	 * The '<em><b>SPL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPL_VALUE = 3;

	/**
	 * The '<em><b>ABS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ABS_VALUE = 4;

	/**
	 * The '<em><b>CSL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CSL_VALUE = 5;

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
	 * An array of all the '<em><b>DBweighting Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DBweightingType[] VALUES_ARRAY =
		new DBweightingType[] {
			UNKNOWN,
			NOD_BWEIGHTING,
			HL,
			SPL,
			ABS,
			CSL,
			USER1,
			USER2,
			USER3,
		};

	/**
	 * A public read-only list of all the '<em><b>DBweighting Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DBweightingType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>DBweighting Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DBweightingType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DBweightingType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DBweighting Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DBweightingType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DBweightingType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DBweighting Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DBweightingType get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case NOD_BWEIGHTING_VALUE: return NOD_BWEIGHTING;
			case HL_VALUE: return HL;
			case SPL_VALUE: return SPL;
			case ABS_VALUE: return ABS;
			case CSL_VALUE: return CSL;
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
	private DBweightingType(int value, String name, String literal) {
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
	
} //DBweightingType
