/*
 */
package audiogram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Speech Threshold Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * This enumerated type is used for speech testing to determine if the test used is of type SAT, SDT or SRT. Speech is used as the stimulus in these tests.
 * 
 * +SRT - Speech recognition threshold test / The level at which 50% correct score is obtained when patients are asked to repeat a spondaic word list.  - Spondaic words are 2 syllable words with equal stress on each syllable.( e.g. Birthday)
 * 
 * +SDT - Speech Detection threshold test / A single word is presented repeatedly and the intensity is increased in 5dB steps and decreased in 10dB steps (like pure tone audiometry) until the point where the patient indicates they can detect, but not repeat the speech heard. Threshold (again like pure tone audiometry) is taken as the level where the patient responds 2 out of 3 or 2 out of 4 times.
 * 
 * +SAT Speech Awareness Threshold Test / Same Description as of SDT
 * 
 * ## TSpeechThresholdType ##
 * <!-- end-model-doc -->
 * @see audiogram.AudiogramPackage#getSpeechThresholdType()
 * @model extendedMetaData="name='SpeechThreshold_Type'"
 * @generated
 */
@ProviderType
public enum SpeechThresholdType implements Enumerator {
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
	 * The '<em><b>Not Used</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_USED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_USED(1, "NotUsed", "NotUsed"),

	/**
	 * The '<em><b>SRT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SRT_VALUE
	 * @generated
	 * @ordered
	 */
	SRT(2, "SRT", "SRT"),

	/**
	 * The '<em><b>SDT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SDT_VALUE
	 * @generated
	 * @ordered
	 */
	SDT(3, "SDT", "SDT"),

	/**
	 * The '<em><b>SAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAT_VALUE
	 * @generated
	 * @ordered
	 */
	SAT(4, "SAT", "SAT"),

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
	 * The '<em><b>Not Used</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_USED
	 * @model name="NotUsed"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_USED_VALUE = 1;

	/**
	 * The '<em><b>SRT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SRT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SRT_VALUE = 2;

	/**
	 * The '<em><b>SDT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SDT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SDT_VALUE = 3;

	/**
	 * The '<em><b>SAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAT_VALUE = 4;

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
	 * An array of all the '<em><b>Speech Threshold Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SpeechThresholdType[] VALUES_ARRAY =
		new SpeechThresholdType[] {
			UNKNOWN,
			NOT_USED,
			SRT,
			SDT,
			SAT,
			USER1,
			USER2,
			USER3,
		};

	/**
	 * A public read-only list of all the '<em><b>Speech Threshold Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SpeechThresholdType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Speech Threshold Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpeechThresholdType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpeechThresholdType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Speech Threshold Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpeechThresholdType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpeechThresholdType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Speech Threshold Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpeechThresholdType get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case NOT_USED_VALUE: return NOT_USED;
			case SRT_VALUE: return SRT;
			case SDT_VALUE: return SDT;
			case SAT_VALUE: return SAT;
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
	private SpeechThresholdType(int value, String name, String literal) {
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
	
} //SpeechThresholdType
