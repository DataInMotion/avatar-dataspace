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
 * A representation of the literals of the enumeration '<em><b>Transducer Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The device used to deliver sound (e.g. type of headphone TDH39)
 * A simple explanation for each type of device is provided below:
 * + TDH39 / Supra aural headphones for air conduction tests
 * + HDA200 / Supra aural headphones often used for extended high frequency air conduction testing
 * + EarTone 3A / Insert earphones 
 * + DT48 / Supra aural headphones for air conduction tests	
 * + TDH49 /  Supra aural headphones for air conduction tests
 * + B71 / Bone Conductor
 * + B72 / Bone conductor
 * + Beoton / specific set of headphones used with Beoton audiometers only 
 * + Holmberg / Supra aural headphones for air conduction tests usually used in noisier environments
 * 
 * ## TTransType ##
 * <!-- end-model-doc -->
 * @see audiogram.AudiogramPackage#getTransducerType()
 * @model extendedMetaData="name='Transducer_Type'"
 * @generated
 */
@ProviderType
public enum TransducerType implements Enumerator {
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
	 * The '<em><b>No Transducer Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_TRANSDUCER_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	NO_TRANSDUCER_TYPE(1, "NoTransducerType", "NoTransducerType"),

	/**
	 * The '<em><b>TDH39</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TDH39_VALUE
	 * @generated
	 * @ordered
	 */
	TDH39(2, "TDH39", "TDH39"),

	/**
	 * The '<em><b>HDA200</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HDA200_VALUE
	 * @generated
	 * @ordered
	 */
	HDA200(3, "HDA200", "HDA200"),

	/**
	 * The '<em><b>EARTONE3A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EARTONE3A_VALUE
	 * @generated
	 * @ordered
	 */
	EARTONE3A(4, "EARTONE3A", "EARTONE3A"),

	/**
	 * The '<em><b>DT48</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DT48_VALUE
	 * @generated
	 * @ordered
	 */
	DT48(5, "DT48", "DT48"),

	/**
	 * The '<em><b>TDH49</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TDH49_VALUE
	 * @generated
	 * @ordered
	 */
	TDH49(6, "TDH49", "TDH49"),

	/**
	 * The '<em><b>B71</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B71_VALUE
	 * @generated
	 * @ordered
	 */
	B71(7, "B71", "B71"),

	/**
	 * The '<em><b>B72</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B72_VALUE
	 * @generated
	 * @ordered
	 */
	B72(8, "B72", "B72"),

	/**
	 * The '<em><b>Beoton</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEOTON_VALUE
	 * @generated
	 * @ordered
	 */
	BEOTON(9, "Beoton", "Beoton"),

	/**
	 * The '<em><b>Holmberg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOLMBERG_VALUE
	 * @generated
	 * @ordered
	 */
	HOLMBERG(10, "Holmberg", "Holmberg"),

	/**
	 * The '<em><b>User1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER1_VALUE
	 * @generated
	 * @ordered
	 */
	USER1(11, "User1", "User1"),

	/**
	 * The '<em><b>User2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER2_VALUE
	 * @generated
	 * @ordered
	 */
	USER2(12, "User2", "User2"),

	/**
	 * The '<em><b>User3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER3_VALUE
	 * @generated
	 * @ordered
	 */
	USER3(13, "User3", "User3");

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
	 * The '<em><b>No Transducer Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_TRANSDUCER_TYPE
	 * @model name="NoTransducerType"
	 * @generated
	 * @ordered
	 */
	public static final int NO_TRANSDUCER_TYPE_VALUE = 1;

	/**
	 * The '<em><b>TDH39</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TDH39
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TDH39_VALUE = 2;

	/**
	 * The '<em><b>HDA200</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HDA200
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HDA200_VALUE = 3;

	/**
	 * The '<em><b>EARTONE3A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EARTONE3A
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EARTONE3A_VALUE = 4;

	/**
	 * The '<em><b>DT48</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DT48
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DT48_VALUE = 5;

	/**
	 * The '<em><b>TDH49</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TDH49
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TDH49_VALUE = 6;

	/**
	 * The '<em><b>B71</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B71
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int B71_VALUE = 7;

	/**
	 * The '<em><b>B72</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B72
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int B72_VALUE = 8;

	/**
	 * The '<em><b>Beoton</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEOTON
	 * @model name="Beoton"
	 * @generated
	 * @ordered
	 */
	public static final int BEOTON_VALUE = 9;

	/**
	 * The '<em><b>Holmberg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOLMBERG
	 * @model name="Holmberg"
	 * @generated
	 * @ordered
	 */
	public static final int HOLMBERG_VALUE = 10;

	/**
	 * The '<em><b>User1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER1
	 * @model name="User1"
	 * @generated
	 * @ordered
	 */
	public static final int USER1_VALUE = 11;

	/**
	 * The '<em><b>User2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER2
	 * @model name="User2"
	 * @generated
	 * @ordered
	 */
	public static final int USER2_VALUE = 12;

	/**
	 * The '<em><b>User3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER3
	 * @model name="User3"
	 * @generated
	 * @ordered
	 */
	public static final int USER3_VALUE = 13;

	/**
	 * An array of all the '<em><b>Transducer Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TransducerType[] VALUES_ARRAY =
		new TransducerType[] {
			UNKNOWN,
			NO_TRANSDUCER_TYPE,
			TDH39,
			HDA200,
			EARTONE3A,
			DT48,
			TDH49,
			B71,
			B72,
			BEOTON,
			HOLMBERG,
			USER1,
			USER2,
			USER3,
		};

	/**
	 * A public read-only list of all the '<em><b>Transducer Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TransducerType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transducer Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransducerType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransducerType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transducer Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransducerType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransducerType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transducer Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransducerType get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case NO_TRANSDUCER_TYPE_VALUE: return NO_TRANSDUCER_TYPE;
			case TDH39_VALUE: return TDH39;
			case HDA200_VALUE: return HDA200;
			case EARTONE3A_VALUE: return EARTONE3A;
			case DT48_VALUE: return DT48;
			case TDH49_VALUE: return TDH49;
			case B71_VALUE: return B71;
			case B72_VALUE: return B72;
			case BEOTON_VALUE: return BEOTON;
			case HOLMBERG_VALUE: return HOLMBERG;
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
	private TransducerType(int value, String name, String literal) {
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
	
} //TransducerType
