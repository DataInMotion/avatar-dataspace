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
 * A representation of the literals of the enumeration '<em><b>Coupler Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The device in which the probe microphone is placed; In other words; this is
 * where the output is read.
 * 
 * ##TCouplerType##
 * 
 * ++ Please note that FreibKK was changed to FreiburgerConicalCoupler  
 * 
 * AND
 * 
 * FreibKKK to FreiburgerConicalChildrenCoupler ++
 * <!-- end-model-doc -->
 * @see test.TestPackage#getCouplerType()
 * @model extendedMetaData="name='CouplerType'"
 * @generated
 */
@ProviderType
public enum CouplerType implements Enumerator {
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
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(1, "None", "None"),

	/**
	 * The '<em><b>Real Ear</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAL_EAR_VALUE
	 * @generated
	 * @ordered
	 */
	REAL_EAR(2, "RealEar", "RealEar"),

	/**
	 * The '<em><b>Coupler711</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUPLER711_VALUE
	 * @generated
	 * @ordered
	 */
	COUPLER711(3, "Coupler711", "Coupler711"),

	/**
	 * The '<em><b>Coupler2cc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUPLER2CC_VALUE
	 * @generated
	 * @ordered
	 */
	COUPLER2CC(4, "Coupler2cc", "Coupler2cc"),

	/**
	 * The '<em><b>Freiburger Conical Coupler</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREIBURGER_CONICAL_COUPLER_VALUE
	 * @generated
	 * @ordered
	 */
	FREIBURGER_CONICAL_COUPLER(5, "FreiburgerConicalCoupler", "FreiburgerConicalCoupler"),

	/**
	 * The '<em><b>Freiburger Conical Children Coupler</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREIBURGER_CONICAL_CHILDREN_COUPLER_VALUE
	 * @generated
	 * @ordered
	 */
	FREIBURGER_CONICAL_CHILDREN_COUPLER(6, "FreiburgerConicalChildrenCoupler", "FreiburgerConicalChildrenCoupler"),

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
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 1;

	/**
	 * The '<em><b>Real Ear</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAL_EAR
	 * @model name="RealEar"
	 * @generated
	 * @ordered
	 */
	public static final int REAL_EAR_VALUE = 2;

	/**
	 * The '<em><b>Coupler711</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUPLER711
	 * @model name="Coupler711"
	 * @generated
	 * @ordered
	 */
	public static final int COUPLER711_VALUE = 3;

	/**
	 * The '<em><b>Coupler2cc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUPLER2CC
	 * @model name="Coupler2cc"
	 * @generated
	 * @ordered
	 */
	public static final int COUPLER2CC_VALUE = 4;

	/**
	 * The '<em><b>Freiburger Conical Coupler</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREIBURGER_CONICAL_COUPLER
	 * @model name="FreiburgerConicalCoupler"
	 * @generated
	 * @ordered
	 */
	public static final int FREIBURGER_CONICAL_COUPLER_VALUE = 5;

	/**
	 * The '<em><b>Freiburger Conical Children Coupler</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREIBURGER_CONICAL_CHILDREN_COUPLER
	 * @model name="FreiburgerConicalChildrenCoupler"
	 * @generated
	 * @ordered
	 */
	public static final int FREIBURGER_CONICAL_CHILDREN_COUPLER_VALUE = 6;

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
	 * An array of all the '<em><b>Coupler Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CouplerType[] VALUES_ARRAY =
		new CouplerType[] {
			UNDEFINED,
			NONE,
			REAL_EAR,
			COUPLER711,
			COUPLER2CC,
			FREIBURGER_CONICAL_COUPLER,
			FREIBURGER_CONICAL_CHILDREN_COUPLER,
			USER1,
			USER2,
			USER3,
		};

	/**
	 * A public read-only list of all the '<em><b>Coupler Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CouplerType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Coupler Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CouplerType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CouplerType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Coupler Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CouplerType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CouplerType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Coupler Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CouplerType get(int value) {
		switch (value) {
			case UNDEFINED_VALUE: return UNDEFINED;
			case NONE_VALUE: return NONE;
			case REAL_EAR_VALUE: return REAL_EAR;
			case COUPLER711_VALUE: return COUPLER711;
			case COUPLER2CC_VALUE: return COUPLER2CC;
			case FREIBURGER_CONICAL_COUPLER_VALUE: return FREIBURGER_CONICAL_COUPLER;
			case FREIBURGER_CONICAL_CHILDREN_COUPLER_VALUE: return FREIBURGER_CONICAL_CHILDREN_COUPLER;
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
	private CouplerType(int value, String name, String literal) {
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
	
} //CouplerType
