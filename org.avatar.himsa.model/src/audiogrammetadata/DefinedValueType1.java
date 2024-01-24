/*
 */
package audiogrammetadata;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Defined Value Type1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see audiogrammetadata.AudiogrammetadataPackage#getDefinedValueType1()
 * @model extendedMetaData="name='DefinedValue_._1_._type'"
 * @generated
 */
@ProviderType
public enum DefinedValueType1 implements Enumerator {
	/**
	 * The '<em><b>Good</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOOD_VALUE
	 * @generated
	 * @ordered
	 */
	GOOD(0, "Good", "Good"),

	/**
	 * The '<em><b>Fair</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAIR_VALUE
	 * @generated
	 * @ordered
	 */
	FAIR(1, "Fair", "Fair"),

	/**
	 * The '<em><b>Poor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POOR_VALUE
	 * @generated
	 * @ordered
	 */
	POOR(2, "Poor", "Poor");

	/**
	 * The '<em><b>Good</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOOD
	 * @model name="Good"
	 * @generated
	 * @ordered
	 */
	public static final int GOOD_VALUE = 0;

	/**
	 * The '<em><b>Fair</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAIR
	 * @model name="Fair"
	 * @generated
	 * @ordered
	 */
	public static final int FAIR_VALUE = 1;

	/**
	 * The '<em><b>Poor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POOR
	 * @model name="Poor"
	 * @generated
	 * @ordered
	 */
	public static final int POOR_VALUE = 2;

	/**
	 * An array of all the '<em><b>Defined Value Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DefinedValueType1[] VALUES_ARRAY =
		new DefinedValueType1[] {
			GOOD,
			FAIR,
			POOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Defined Value Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DefinedValueType1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Defined Value Type1</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DefinedValueType1 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DefinedValueType1 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Defined Value Type1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DefinedValueType1 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DefinedValueType1 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Defined Value Type1</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DefinedValueType1 get(int value) {
		switch (value) {
			case GOOD_VALUE: return GOOD;
			case FAIR_VALUE: return FAIR;
			case POOR_VALUE: return POOR;
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
	private DefinedValueType1(int value, String name, String literal) {
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
	
} //DefinedValueType1
