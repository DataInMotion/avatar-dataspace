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
 * A representation of the literals of the enumeration '<em><b>Flat Hearing Loss Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see audiogrammetadata.AudiogrammetadataPackage#getFlatHearingLossType()
 * @model extendedMetaData="name='FlatHearingLoss_._type'"
 * @generated
 */
@ProviderType
public enum FlatHearingLossType implements Enumerator {
	/**
	 * The '<em><b>Mild</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILD_VALUE
	 * @generated
	 * @ordered
	 */
	MILD(0, "Mild", "Mild"),

	/**
	 * The '<em><b>Moderate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODERATE_VALUE
	 * @generated
	 * @ordered
	 */
	MODERATE(1, "Moderate", "Moderate"),

	/**
	 * The '<em><b>Severe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEVERE_VALUE
	 * @generated
	 * @ordered
	 */
	SEVERE(2, "Severe", "Severe"),

	/**
	 * The '<em><b>Profound</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROFOUND_VALUE
	 * @generated
	 * @ordered
	 */
	PROFOUND(3, "Profound", "Profound");

	/**
	 * The '<em><b>Mild</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILD
	 * @model name="Mild"
	 * @generated
	 * @ordered
	 */
	public static final int MILD_VALUE = 0;

	/**
	 * The '<em><b>Moderate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODERATE
	 * @model name="Moderate"
	 * @generated
	 * @ordered
	 */
	public static final int MODERATE_VALUE = 1;

	/**
	 * The '<em><b>Severe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEVERE
	 * @model name="Severe"
	 * @generated
	 * @ordered
	 */
	public static final int SEVERE_VALUE = 2;

	/**
	 * The '<em><b>Profound</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROFOUND
	 * @model name="Profound"
	 * @generated
	 * @ordered
	 */
	public static final int PROFOUND_VALUE = 3;

	/**
	 * An array of all the '<em><b>Flat Hearing Loss Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FlatHearingLossType[] VALUES_ARRAY =
		new FlatHearingLossType[] {
			MILD,
			MODERATE,
			SEVERE,
			PROFOUND,
		};

	/**
	 * A public read-only list of all the '<em><b>Flat Hearing Loss Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FlatHearingLossType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Flat Hearing Loss Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FlatHearingLossType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FlatHearingLossType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Flat Hearing Loss Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FlatHearingLossType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FlatHearingLossType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Flat Hearing Loss Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FlatHearingLossType get(int value) {
		switch (value) {
			case MILD_VALUE: return MILD;
			case MODERATE_VALUE: return MODERATE;
			case SEVERE_VALUE: return SEVERE;
			case PROFOUND_VALUE: return PROFOUND;
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
	private FlatHearingLossType(int value, String name, String literal) {
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
	
} //FlatHearingLossType
