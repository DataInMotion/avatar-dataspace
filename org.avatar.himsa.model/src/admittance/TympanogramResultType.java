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
 * A representation of the literals of the enumeration '<em><b>Tympanogram Result Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Reference pg 177 Katz
 * 
 * Jerger 1970 classified the shapes of tympanograms and this system is still commonly used today and is applicable only to a 226Hz probe test.
 * 
 * (A) tympanograms have peaks near atmospheric pressure
 * (AD) tympanograms have a high peak near atmospheric pressure
 * (As) tympanograms have a shallow peak near atmospheric pressure
 * (B) tympanograms are flat
 * (C) tympanograms have negative pressure peaks
 * (D) and (E) tympanograms have a notched peak and are more common with higher probe frequencies.
 * CouldNotSeal (CNS) / Could not seal, therefore no results obtained
 * DidNotTest (DNT) /The stimulus was not presented to subject. Reasons: Per instruction by physician or because the test was judged to be unnecessary. No point was plotted.
 * CouldNotTest (CNT)  / Unable to present stimulus. Reasons: Subject's physical or behavioral limitations, inability to obtain a seal. No point was plotted
 * Other - Something other than listed above
 * 
 * @@ 501 - 500 down conversion
 * 
 * if CNS, DNT, or CNT or Other are used then it will not be possible to convert the complete tympogram test (TympanogramTest Element).  These choice represent that there was no test obtained, they provide more information why it was not obtained
 * 
 * @@
 * 
 * 
 * <!-- end-model-doc -->
 * @see admittance.AdmittancePackage#getTympanogramResultType()
 * @model extendedMetaData="name='TympanogramResult_Type'"
 * @generated
 */
@ProviderType
public enum TympanogramResultType implements Enumerator {
	/**
	 * The '<em><b>A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #A_VALUE
	 * @generated
	 * @ordered
	 */
	A(0, "A", "A"),

	/**
	 * The '<em><b>AD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AD_VALUE
	 * @generated
	 * @ordered
	 */
	AD(1, "AD", "AD"),

	/**
	 * The '<em><b>AS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AS_VALUE
	 * @generated
	 * @ordered
	 */
	AS(2, "AS", "AS"),

	/**
	 * The '<em><b>B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B_VALUE
	 * @generated
	 * @ordered
	 */
	B(3, "B", "B"),

	/**
	 * The '<em><b>C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C_VALUE
	 * @generated
	 * @ordered
	 */
	C(4, "C", "C"),

	/**
	 * The '<em><b>D</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D_VALUE
	 * @generated
	 * @ordered
	 */
	D(5, "D", "D"),

	/**
	 * The '<em><b>E</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E_VALUE
	 * @generated
	 * @ordered
	 */
	E(6, "E", "E"),

	/**
	 * The '<em><b>Could Not Seal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COULD_NOT_SEAL_VALUE
	 * @generated
	 * @ordered
	 */
	COULD_NOT_SEAL(7, "CouldNotSeal", "CouldNotSeal"),

	/**
	 * The '<em><b>Did Not Test</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DID_NOT_TEST_VALUE
	 * @generated
	 * @ordered
	 */
	DID_NOT_TEST(8, "DidNotTest", "DidNotTest"),

	/**
	 * The '<em><b>Could Not Test</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COULD_NOT_TEST_VALUE
	 * @generated
	 * @ordered
	 */
	COULD_NOT_TEST(9, "CouldNotTest", "CouldNotTest"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(10, "Other", "Other");

	/**
	 * The '<em><b>A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #A
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int A_VALUE = 0;

	/**
	 * The '<em><b>AD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AD_VALUE = 1;

	/**
	 * The '<em><b>AS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AS_VALUE = 2;

	/**
	 * The '<em><b>B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int B_VALUE = 3;

	/**
	 * The '<em><b>C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int C_VALUE = 4;

	/**
	 * The '<em><b>D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int D_VALUE = 5;

	/**
	 * The '<em><b>E</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int E_VALUE = 6;

	/**
	 * The '<em><b>Could Not Seal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COULD_NOT_SEAL
	 * @model name="CouldNotSeal"
	 * @generated
	 * @ordered
	 */
	public static final int COULD_NOT_SEAL_VALUE = 7;

	/**
	 * The '<em><b>Did Not Test</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DID_NOT_TEST
	 * @model name="DidNotTest"
	 * @generated
	 * @ordered
	 */
	public static final int DID_NOT_TEST_VALUE = 8;

	/**
	 * The '<em><b>Could Not Test</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COULD_NOT_TEST
	 * @model name="CouldNotTest"
	 * @generated
	 * @ordered
	 */
	public static final int COULD_NOT_TEST_VALUE = 9;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 10;

	/**
	 * An array of all the '<em><b>Tympanogram Result Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TympanogramResultType[] VALUES_ARRAY =
		new TympanogramResultType[] {
			A,
			AD,
			AS,
			B,
			C,
			D,
			E,
			COULD_NOT_SEAL,
			DID_NOT_TEST,
			COULD_NOT_TEST,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Tympanogram Result Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TympanogramResultType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tympanogram Result Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TympanogramResultType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TympanogramResultType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tympanogram Result Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TympanogramResultType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TympanogramResultType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tympanogram Result Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TympanogramResultType get(int value) {
		switch (value) {
			case A_VALUE: return A;
			case AD_VALUE: return AD;
			case AS_VALUE: return AS;
			case B_VALUE: return B;
			case C_VALUE: return C;
			case D_VALUE: return D;
			case E_VALUE: return E;
			case COULD_NOT_SEAL_VALUE: return COULD_NOT_SEAL;
			case DID_NOT_TEST_VALUE: return DID_NOT_TEST;
			case COULD_NOT_TEST_VALUE: return COULD_NOT_TEST;
			case OTHER_VALUE: return OTHER;
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
	private TympanogramResultType(int value, String name, String literal) {
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
	
} //TympanogramResultType
