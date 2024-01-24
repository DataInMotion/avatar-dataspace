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
 * A representation of the literals of the enumeration '<em><b>Signal Output Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The Signal Output Type is of extra importance. It defines the means of presenting sound to the patient:
 * + Air Conductor / headphones
 * + Bone conductor / vibrator placed on the mastoid (HOCA-5 page 10)
 * + Free Field / Loudspeakers in a special test room
 * + Insert Phone / small foam tips used to deliver air conduction test
 * 
 * It also defines which side (i.e. the persons left or right ear) is stimulated.
 * 
 * <!-- end-model-doc -->
 * @see com.himsa.measurement.audiogram._502._502Package#getSignalOutputType()
 * @model extendedMetaData="name='SignalOutput_Type'"
 * @generated
 */
@ProviderType
public enum SignalOutputType implements Enumerator {
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
	 * The '<em><b>No Signal Output</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_SIGNAL_OUTPUT_VALUE
	 * @generated
	 * @ordered
	 */
	NO_SIGNAL_OUTPUT(1, "NoSignalOutput", "NoSignalOutput"),

	/**
	 * The '<em><b>Air Conductor Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIR_CONDUCTOR_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	AIR_CONDUCTOR_LEFT(2, "AirConductorLeft", "AirConductorLeft"),

	/**
	 * The '<em><b>Air Conductor Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIR_CONDUCTOR_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	AIR_CONDUCTOR_RIGHT(3, "AirConductorRight", "AirConductorRight"),

	/**
	 * The '<em><b>Air Conductor Binaural</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIR_CONDUCTOR_BINAURAL_VALUE
	 * @generated
	 * @ordered
	 */
	AIR_CONDUCTOR_BINAURAL(4, "AirConductorBinaural", "AirConductorBinaural"),

	/**
	 * The '<em><b>Bone Conductor Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BONE_CONDUCTOR_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	BONE_CONDUCTOR_LEFT(5, "BoneConductorLeft", "BoneConductorLeft"),

	/**
	 * The '<em><b>Bone Conductor Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BONE_CONDUCTOR_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	BONE_CONDUCTOR_RIGHT(6, "BoneConductorRight", "BoneConductorRight"),

	/**
	 * The '<em><b>Bone Conductor Binaural</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BONE_CONDUCTOR_BINAURAL_VALUE
	 * @generated
	 * @ordered
	 */
	BONE_CONDUCTOR_BINAURAL(7, "BoneConductorBinaural", "BoneConductorBinaural"),

	/**
	 * The '<em><b>Free Field Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREE_FIELD_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	FREE_FIELD_LEFT(8, "FreeFieldLeft", "FreeFieldLeft"),

	/**
	 * The '<em><b>Free Field Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREE_FIELD_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	FREE_FIELD_RIGHT(9, "FreeFieldRight", "FreeFieldRight"),

	/**
	 * The '<em><b>Free Field Binaural</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREE_FIELD_BINAURAL_VALUE
	 * @generated
	 * @ordered
	 */
	FREE_FIELD_BINAURAL(10, "FreeFieldBinaural", "FreeFieldBinaural"),

	/**
	 * The '<em><b>Insert Phone Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSERT_PHONE_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	INSERT_PHONE_LEFT(11, "InsertPhoneLeft", "InsertPhoneLeft"),

	/**
	 * The '<em><b>Insert Phone Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSERT_PHONE_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	INSERT_PHONE_RIGHT(12, "InsertPhoneRight", "InsertPhoneRight"),

	/**
	 * The '<em><b>Insert Phone Binaural</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSERT_PHONE_BINAURAL_VALUE
	 * @generated
	 * @ordered
	 */
	INSERT_PHONE_BINAURAL(13, "InsertPhoneBinaural", "InsertPhoneBinaural"),

	/**
	 * The '<em><b>User1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER1_VALUE
	 * @generated
	 * @ordered
	 */
	USER1(14, "User1", "User1"),

	/**
	 * The '<em><b>User2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER2_VALUE
	 * @generated
	 * @ordered
	 */
	USER2(15, "User2", "User2"),

	/**
	 * The '<em><b>User3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER3_VALUE
	 * @generated
	 * @ordered
	 */
	USER3(16, "User3", "User3");

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
	 * The '<em><b>No Signal Output</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_SIGNAL_OUTPUT
	 * @model name="NoSignalOutput"
	 * @generated
	 * @ordered
	 */
	public static final int NO_SIGNAL_OUTPUT_VALUE = 1;

	/**
	 * The '<em><b>Air Conductor Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIR_CONDUCTOR_LEFT
	 * @model name="AirConductorLeft"
	 * @generated
	 * @ordered
	 */
	public static final int AIR_CONDUCTOR_LEFT_VALUE = 2;

	/**
	 * The '<em><b>Air Conductor Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIR_CONDUCTOR_RIGHT
	 * @model name="AirConductorRight"
	 * @generated
	 * @ordered
	 */
	public static final int AIR_CONDUCTOR_RIGHT_VALUE = 3;

	/**
	 * The '<em><b>Air Conductor Binaural</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIR_CONDUCTOR_BINAURAL
	 * @model name="AirConductorBinaural"
	 * @generated
	 * @ordered
	 */
	public static final int AIR_CONDUCTOR_BINAURAL_VALUE = 4;

	/**
	 * The '<em><b>Bone Conductor Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BONE_CONDUCTOR_LEFT
	 * @model name="BoneConductorLeft"
	 * @generated
	 * @ordered
	 */
	public static final int BONE_CONDUCTOR_LEFT_VALUE = 5;

	/**
	 * The '<em><b>Bone Conductor Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BONE_CONDUCTOR_RIGHT
	 * @model name="BoneConductorRight"
	 * @generated
	 * @ordered
	 */
	public static final int BONE_CONDUCTOR_RIGHT_VALUE = 6;

	/**
	 * The '<em><b>Bone Conductor Binaural</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BONE_CONDUCTOR_BINAURAL
	 * @model name="BoneConductorBinaural"
	 * @generated
	 * @ordered
	 */
	public static final int BONE_CONDUCTOR_BINAURAL_VALUE = 7;

	/**
	 * The '<em><b>Free Field Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREE_FIELD_LEFT
	 * @model name="FreeFieldLeft"
	 * @generated
	 * @ordered
	 */
	public static final int FREE_FIELD_LEFT_VALUE = 8;

	/**
	 * The '<em><b>Free Field Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREE_FIELD_RIGHT
	 * @model name="FreeFieldRight"
	 * @generated
	 * @ordered
	 */
	public static final int FREE_FIELD_RIGHT_VALUE = 9;

	/**
	 * The '<em><b>Free Field Binaural</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREE_FIELD_BINAURAL
	 * @model name="FreeFieldBinaural"
	 * @generated
	 * @ordered
	 */
	public static final int FREE_FIELD_BINAURAL_VALUE = 10;

	/**
	 * The '<em><b>Insert Phone Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSERT_PHONE_LEFT
	 * @model name="InsertPhoneLeft"
	 * @generated
	 * @ordered
	 */
	public static final int INSERT_PHONE_LEFT_VALUE = 11;

	/**
	 * The '<em><b>Insert Phone Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSERT_PHONE_RIGHT
	 * @model name="InsertPhoneRight"
	 * @generated
	 * @ordered
	 */
	public static final int INSERT_PHONE_RIGHT_VALUE = 12;

	/**
	 * The '<em><b>Insert Phone Binaural</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSERT_PHONE_BINAURAL
	 * @model name="InsertPhoneBinaural"
	 * @generated
	 * @ordered
	 */
	public static final int INSERT_PHONE_BINAURAL_VALUE = 13;

	/**
	 * The '<em><b>User1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER1
	 * @model name="User1"
	 * @generated
	 * @ordered
	 */
	public static final int USER1_VALUE = 14;

	/**
	 * The '<em><b>User2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER2
	 * @model name="User2"
	 * @generated
	 * @ordered
	 */
	public static final int USER2_VALUE = 15;

	/**
	 * The '<em><b>User3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER3
	 * @model name="User3"
	 * @generated
	 * @ordered
	 */
	public static final int USER3_VALUE = 16;

	/**
	 * An array of all the '<em><b>Signal Output Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SignalOutputType[] VALUES_ARRAY =
		new SignalOutputType[] {
			UNKNOWN,
			NO_SIGNAL_OUTPUT,
			AIR_CONDUCTOR_LEFT,
			AIR_CONDUCTOR_RIGHT,
			AIR_CONDUCTOR_BINAURAL,
			BONE_CONDUCTOR_LEFT,
			BONE_CONDUCTOR_RIGHT,
			BONE_CONDUCTOR_BINAURAL,
			FREE_FIELD_LEFT,
			FREE_FIELD_RIGHT,
			FREE_FIELD_BINAURAL,
			INSERT_PHONE_LEFT,
			INSERT_PHONE_RIGHT,
			INSERT_PHONE_BINAURAL,
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
			case UNKNOWN_VALUE: return UNKNOWN;
			case NO_SIGNAL_OUTPUT_VALUE: return NO_SIGNAL_OUTPUT;
			case AIR_CONDUCTOR_LEFT_VALUE: return AIR_CONDUCTOR_LEFT;
			case AIR_CONDUCTOR_RIGHT_VALUE: return AIR_CONDUCTOR_RIGHT;
			case AIR_CONDUCTOR_BINAURAL_VALUE: return AIR_CONDUCTOR_BINAURAL;
			case BONE_CONDUCTOR_LEFT_VALUE: return BONE_CONDUCTOR_LEFT;
			case BONE_CONDUCTOR_RIGHT_VALUE: return BONE_CONDUCTOR_RIGHT;
			case BONE_CONDUCTOR_BINAURAL_VALUE: return BONE_CONDUCTOR_BINAURAL;
			case FREE_FIELD_LEFT_VALUE: return FREE_FIELD_LEFT;
			case FREE_FIELD_RIGHT_VALUE: return FREE_FIELD_RIGHT;
			case FREE_FIELD_BINAURAL_VALUE: return FREE_FIELD_BINAURAL;
			case INSERT_PHONE_LEFT_VALUE: return INSERT_PHONE_LEFT;
			case INSERT_PHONE_RIGHT_VALUE: return INSERT_PHONE_RIGHT;
			case INSERT_PHONE_BINAURAL_VALUE: return INSERT_PHONE_BINAURAL;
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
