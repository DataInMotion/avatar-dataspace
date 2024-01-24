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
 * A representation of the literals of the enumeration '<em><b>Weber Point Status Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Point status choices specific for a weber test
 * +Right / The patient heard better on the right ear.
 * +Left / The patient heard better on the left ear.
 * +Center / The patient heard equally well in both ears
 * +NoResponse / The patient did not respond
 * +NotAudible / Not audible to the patient
 * +AudibleButCantTellWhichSide / audible but the patient is unable to determine what side they can hear the sound
 * <!-- end-model-doc -->
 * @see audiogram502.Audiogram502Package#getWeberPointStatusType()
 * @model extendedMetaData="name='WeberPointStatus_Type'"
 * @generated
 */
@ProviderType
public enum WeberPointStatusType implements Enumerator {
	/**
	 * The '<em><b>Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	RIGHT(0, "Right", "Right"),

	/**
	 * The '<em><b>Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	LEFT(1, "Left", "Left"),

	/**
	 * The '<em><b>Center</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTER_VALUE
	 * @generated
	 * @ordered
	 */
	CENTER(2, "Center", "Center"),

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
	 * The '<em><b>Not Audible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_AUDIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_AUDIBLE(4, "NotAudible", "NotAudible"),

	/**
	 * The '<em><b>Audible But Cant Tell Which Side</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIBLE_BUT_CANT_TELL_WHICH_SIDE_VALUE
	 * @generated
	 * @ordered
	 */
	AUDIBLE_BUT_CANT_TELL_WHICH_SIDE(5, "AudibleButCantTellWhichSide", "AudibleButCantTellWhichSide");

	/**
	 * The '<em><b>Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT
	 * @model name="Right"
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT_VALUE = 0;

	/**
	 * The '<em><b>Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT
	 * @model name="Left"
	 * @generated
	 * @ordered
	 */
	public static final int LEFT_VALUE = 1;

	/**
	 * The '<em><b>Center</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTER
	 * @model name="Center"
	 * @generated
	 * @ordered
	 */
	public static final int CENTER_VALUE = 2;

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
	 * The '<em><b>Not Audible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_AUDIBLE
	 * @model name="NotAudible"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_AUDIBLE_VALUE = 4;

	/**
	 * The '<em><b>Audible But Cant Tell Which Side</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIBLE_BUT_CANT_TELL_WHICH_SIDE
	 * @model name="AudibleButCantTellWhichSide"
	 * @generated
	 * @ordered
	 */
	public static final int AUDIBLE_BUT_CANT_TELL_WHICH_SIDE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Weber Point Status Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WeberPointStatusType[] VALUES_ARRAY =
		new WeberPointStatusType[] {
			RIGHT,
			LEFT,
			CENTER,
			NO_RESPONSE,
			NOT_AUDIBLE,
			AUDIBLE_BUT_CANT_TELL_WHICH_SIDE,
		};

	/**
	 * A public read-only list of all the '<em><b>Weber Point Status Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WeberPointStatusType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Weber Point Status Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WeberPointStatusType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WeberPointStatusType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Weber Point Status Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WeberPointStatusType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WeberPointStatusType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Weber Point Status Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WeberPointStatusType get(int value) {
		switch (value) {
			case RIGHT_VALUE: return RIGHT;
			case LEFT_VALUE: return LEFT;
			case CENTER_VALUE: return CENTER;
			case NO_RESPONSE_VALUE: return NO_RESPONSE;
			case NOT_AUDIBLE_VALUE: return NOT_AUDIBLE;
			case AUDIBLE_BUT_CANT_TELL_WHICH_SIDE_VALUE: return AUDIBLE_BUT_CANT_TELL_WHICH_SIDE;
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
	private WeberPointStatusType(int value, String name, String literal) {
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
	
} //WeberPointStatusType
