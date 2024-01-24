/*
 */
package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Fitting Rule</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The fitting rule used for calculation of a target curve
 * 
 * ##TFittingRule##
 * 
 * <!-- end-model-doc -->
 * @see test.TestPackage#getFittingRule()
 * @model extendedMetaData="name='FittingRule'"
 * @generated
 */
@ProviderType
public enum FittingRule implements Enumerator {
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
	 * The '<em><b>POGO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POGO_VALUE
	 * @generated
	 * @ordered
	 */
	POGO(1, "POGO", "POGO"),

	/**
	 * The '<em><b>POGOII</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POGOII_VALUE
	 * @generated
	 * @ordered
	 */
	POGOII(2, "POGOII", "POGOII"),

	/**
	 * The '<em><b>NAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAL_VALUE
	 * @generated
	 * @ordered
	 */
	NAL(3, "NAL", "NAL"),

	/**
	 * The '<em><b>NAL Prof</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAL_PROF_VALUE
	 * @generated
	 * @ordered
	 */
	NAL_PROF(4, "NALProf", "NALProf"),

	/**
	 * The '<em><b>Berger</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BERGER_VALUE
	 * @generated
	 * @ordered
	 */
	BERGER(5, "Berger", "Berger"),

	/**
	 * The '<em><b>Half Gain</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALF_GAIN_VALUE
	 * @generated
	 * @ordered
	 */
	HALF_GAIN(6, "HalfGain", "HalfGain"),

	/**
	 * The '<em><b>Third Gain</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRD_GAIN_VALUE
	 * @generated
	 * @ordered
	 */
	THIRD_GAIN(7, "ThirdGain", "ThirdGain"),

	/**
	 * The '<em><b>DSL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DSL_VALUE
	 * @generated
	 * @ordered
	 */
	DSL(8, "DSL", "DSL"),

	/**
	 * The '<em><b>LIBBY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIBBY_VALUE
	 * @generated
	 * @ordered
	 */
	LIBBY(9, "LIBBY", "LIBBY"),

	/**
	 * The '<em><b>Byrne</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYRNE_VALUE
	 * @generated
	 * @ordered
	 */
	BYRNE(10, "Byrne", "Byrne"),

	/**
	 * The '<em><b>Cox MSU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COX_MSU_VALUE
	 * @generated
	 * @ordered
	 */
	COX_MSU(11, "CoxMSU", "CoxMSU"),

	/**
	 * The '<em><b>User1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER1_VALUE
	 * @generated
	 * @ordered
	 */
	USER1(12, "User1", "User1"),

	/**
	 * The '<em><b>User2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER2_VALUE
	 * @generated
	 * @ordered
	 */
	USER2(13, "User2", "User2"),

	/**
	 * The '<em><b>User3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER3_VALUE
	 * @generated
	 * @ordered
	 */
	USER3(14, "User3", "User3"),

	/**
	 * The '<em><b>User4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER4_VALUE
	 * @generated
	 * @ordered
	 */
	USER4(15, "User4", "User4"),

	/**
	 * The '<em><b>User5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER5_VALUE
	 * @generated
	 * @ordered
	 */
	USER5(16, "User5", "User5"),

	/**
	 * The '<em><b>User6</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER6_VALUE
	 * @generated
	 * @ordered
	 */
	USER6(17, "User6", "User6"),

	/**
	 * The '<em><b>User7</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER7_VALUE
	 * @generated
	 * @ordered
	 */
	USER7(18, "User7", "User7"),

	/**
	 * The '<em><b>User8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER8_VALUE
	 * @generated
	 * @ordered
	 */
	USER8(19, "User8", "User8"),

	/**
	 * The '<em><b>User9</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER9_VALUE
	 * @generated
	 * @ordered
	 */
	USER9(20, "User9", "User9"),

	/**
	 * The '<em><b>User10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER10_VALUE
	 * @generated
	 * @ordered
	 */
	USER10(21, "User10", "User10");

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
	 * The '<em><b>POGO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POGO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POGO_VALUE = 1;

	/**
	 * The '<em><b>POGOII</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POGOII
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POGOII_VALUE = 2;

	/**
	 * The '<em><b>NAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NAL_VALUE = 3;

	/**
	 * The '<em><b>NAL Prof</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAL_PROF
	 * @model name="NALProf"
	 * @generated
	 * @ordered
	 */
	public static final int NAL_PROF_VALUE = 4;

	/**
	 * The '<em><b>Berger</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BERGER
	 * @model name="Berger"
	 * @generated
	 * @ordered
	 */
	public static final int BERGER_VALUE = 5;

	/**
	 * The '<em><b>Half Gain</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALF_GAIN
	 * @model name="HalfGain"
	 * @generated
	 * @ordered
	 */
	public static final int HALF_GAIN_VALUE = 6;

	/**
	 * The '<em><b>Third Gain</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRD_GAIN
	 * @model name="ThirdGain"
	 * @generated
	 * @ordered
	 */
	public static final int THIRD_GAIN_VALUE = 7;

	/**
	 * The '<em><b>DSL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DSL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DSL_VALUE = 8;

	/**
	 * The '<em><b>LIBBY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIBBY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIBBY_VALUE = 9;

	/**
	 * The '<em><b>Byrne</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYRNE
	 * @model name="Byrne"
	 * @generated
	 * @ordered
	 */
	public static final int BYRNE_VALUE = 10;

	/**
	 * The '<em><b>Cox MSU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COX_MSU
	 * @model name="CoxMSU"
	 * @generated
	 * @ordered
	 */
	public static final int COX_MSU_VALUE = 11;

	/**
	 * The '<em><b>User1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER1
	 * @model name="User1"
	 * @generated
	 * @ordered
	 */
	public static final int USER1_VALUE = 12;

	/**
	 * The '<em><b>User2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER2
	 * @model name="User2"
	 * @generated
	 * @ordered
	 */
	public static final int USER2_VALUE = 13;

	/**
	 * The '<em><b>User3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER3
	 * @model name="User3"
	 * @generated
	 * @ordered
	 */
	public static final int USER3_VALUE = 14;

	/**
	 * The '<em><b>User4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER4
	 * @model name="User4"
	 * @generated
	 * @ordered
	 */
	public static final int USER4_VALUE = 15;

	/**
	 * The '<em><b>User5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER5
	 * @model name="User5"
	 * @generated
	 * @ordered
	 */
	public static final int USER5_VALUE = 16;

	/**
	 * The '<em><b>User6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER6
	 * @model name="User6"
	 * @generated
	 * @ordered
	 */
	public static final int USER6_VALUE = 17;

	/**
	 * The '<em><b>User7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER7
	 * @model name="User7"
	 * @generated
	 * @ordered
	 */
	public static final int USER7_VALUE = 18;

	/**
	 * The '<em><b>User8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER8
	 * @model name="User8"
	 * @generated
	 * @ordered
	 */
	public static final int USER8_VALUE = 19;

	/**
	 * The '<em><b>User9</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER9
	 * @model name="User9"
	 * @generated
	 * @ordered
	 */
	public static final int USER9_VALUE = 20;

	/**
	 * The '<em><b>User10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER10
	 * @model name="User10"
	 * @generated
	 * @ordered
	 */
	public static final int USER10_VALUE = 21;

	/**
	 * An array of all the '<em><b>Fitting Rule</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FittingRule[] VALUES_ARRAY =
		new FittingRule[] {
			UNDEFINED,
			POGO,
			POGOII,
			NAL,
			NAL_PROF,
			BERGER,
			HALF_GAIN,
			THIRD_GAIN,
			DSL,
			LIBBY,
			BYRNE,
			COX_MSU,
			USER1,
			USER2,
			USER3,
			USER4,
			USER5,
			USER6,
			USER7,
			USER8,
			USER9,
			USER10,
		};

	/**
	 * A public read-only list of all the '<em><b>Fitting Rule</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FittingRule> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Fitting Rule</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FittingRule get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FittingRule result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fitting Rule</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FittingRule getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FittingRule result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fitting Rule</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FittingRule get(int value) {
		switch (value) {
			case UNDEFINED_VALUE: return UNDEFINED;
			case POGO_VALUE: return POGO;
			case POGOII_VALUE: return POGOII;
			case NAL_VALUE: return NAL;
			case NAL_PROF_VALUE: return NAL_PROF;
			case BERGER_VALUE: return BERGER;
			case HALF_GAIN_VALUE: return HALF_GAIN;
			case THIRD_GAIN_VALUE: return THIRD_GAIN;
			case DSL_VALUE: return DSL;
			case LIBBY_VALUE: return LIBBY;
			case BYRNE_VALUE: return BYRNE;
			case COX_MSU_VALUE: return COX_MSU;
			case USER1_VALUE: return USER1;
			case USER2_VALUE: return USER2;
			case USER3_VALUE: return USER3;
			case USER4_VALUE: return USER4;
			case USER5_VALUE: return USER5;
			case USER6_VALUE: return USER6;
			case USER7_VALUE: return USER7;
			case USER8_VALUE: return USER8;
			case USER9_VALUE: return USER9;
			case USER10_VALUE: return USER10;
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
	private FittingRule(int value, String name, String literal) {
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
	
} //FittingRule
