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
 * A representation of the literals of the enumeration '<em><b>Sloping Hearing Loss Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see audiogrammetadata.AudiogrammetadataPackage#getSlopingHearingLossType()
 * @model extendedMetaData="name='SlopingHearingLoss_._type'"
 * @generated
 */
@ProviderType
public enum SlopingHearingLossType implements Enumerator {
	/**
	 * The '<em><b>Normal Mild</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL_MILD_VALUE
	 * @generated
	 * @ordered
	 */
	NORMAL_MILD(0, "NormalMild", "NormalMild"),

	/**
	 * The '<em><b>Normal Moderate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL_MODERATE_VALUE
	 * @generated
	 * @ordered
	 */
	NORMAL_MODERATE(1, "NormalModerate", "NormalModerate"),

	/**
	 * The '<em><b>Normal Severe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL_SEVERE_VALUE
	 * @generated
	 * @ordered
	 */
	NORMAL_SEVERE(2, "NormalSevere", "NormalSevere"),

	/**
	 * The '<em><b>Mild Moderate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILD_MODERATE_VALUE
	 * @generated
	 * @ordered
	 */
	MILD_MODERATE(3, "MildModerate", "MildModerate"),

	/**
	 * The '<em><b>Mild Severe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILD_SEVERE_VALUE
	 * @generated
	 * @ordered
	 */
	MILD_SEVERE(4, "MildSevere", "MildSevere"),

	/**
	 * The '<em><b>Moderate Severe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODERATE_SEVERE_VALUE
	 * @generated
	 * @ordered
	 */
	MODERATE_SEVERE(5, "ModerateSevere", "ModerateSevere"),

	/**
	 * The '<em><b>Profound</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROFOUND_VALUE
	 * @generated
	 * @ordered
	 */
	PROFOUND(6, "Profound", "Profound");

	/**
	 * The '<em><b>Normal Mild</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL_MILD
	 * @model name="NormalMild"
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_MILD_VALUE = 0;

	/**
	 * The '<em><b>Normal Moderate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL_MODERATE
	 * @model name="NormalModerate"
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_MODERATE_VALUE = 1;

	/**
	 * The '<em><b>Normal Severe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL_SEVERE
	 * @model name="NormalSevere"
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_SEVERE_VALUE = 2;

	/**
	 * The '<em><b>Mild Moderate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILD_MODERATE
	 * @model name="MildModerate"
	 * @generated
	 * @ordered
	 */
	public static final int MILD_MODERATE_VALUE = 3;

	/**
	 * The '<em><b>Mild Severe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILD_SEVERE
	 * @model name="MildSevere"
	 * @generated
	 * @ordered
	 */
	public static final int MILD_SEVERE_VALUE = 4;

	/**
	 * The '<em><b>Moderate Severe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODERATE_SEVERE
	 * @model name="ModerateSevere"
	 * @generated
	 * @ordered
	 */
	public static final int MODERATE_SEVERE_VALUE = 5;

	/**
	 * The '<em><b>Profound</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROFOUND
	 * @model name="Profound"
	 * @generated
	 * @ordered
	 */
	public static final int PROFOUND_VALUE = 6;

	/**
	 * An array of all the '<em><b>Sloping Hearing Loss Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SlopingHearingLossType[] VALUES_ARRAY =
		new SlopingHearingLossType[] {
			NORMAL_MILD,
			NORMAL_MODERATE,
			NORMAL_SEVERE,
			MILD_MODERATE,
			MILD_SEVERE,
			MODERATE_SEVERE,
			PROFOUND,
		};

	/**
	 * A public read-only list of all the '<em><b>Sloping Hearing Loss Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SlopingHearingLossType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sloping Hearing Loss Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SlopingHearingLossType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SlopingHearingLossType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sloping Hearing Loss Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SlopingHearingLossType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SlopingHearingLossType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sloping Hearing Loss Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SlopingHearingLossType get(int value) {
		switch (value) {
			case NORMAL_MILD_VALUE: return NORMAL_MILD;
			case NORMAL_MODERATE_VALUE: return NORMAL_MODERATE;
			case NORMAL_SEVERE_VALUE: return NORMAL_SEVERE;
			case MILD_MODERATE_VALUE: return MILD_MODERATE;
			case MILD_SEVERE_VALUE: return MILD_SEVERE;
			case MODERATE_SEVERE_VALUE: return MODERATE_SEVERE;
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
	private SlopingHearingLossType(int value, String name, String literal) {
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
	
} //SlopingHearingLossType
