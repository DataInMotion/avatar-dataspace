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
 * A representation of the literals of the enumeration '<em><b>Rising Hearing Loss Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see audiogrammetadata.AudiogrammetadataPackage#getRisingHearingLossType()
 * @model extendedMetaData="name='RisingHearingLoss_._type'"
 * @generated
 */
@ProviderType
public enum RisingHearingLossType implements Enumerator {
	/**
	 * The '<em><b>Mild Normal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILD_NORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	MILD_NORMAL(0, "MildNormal", "MildNormal"),

	/**
	 * The '<em><b>Moderate Normal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODERATE_NORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	MODERATE_NORMAL(1, "ModerateNormal", "ModerateNormal"),

	/**
	 * The '<em><b>Moderate Mild</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODERATE_MILD_VALUE
	 * @generated
	 * @ordered
	 */
	MODERATE_MILD(2, "ModerateMild", "ModerateMild"),

	/**
	 * The '<em><b>Severe Normal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEVERE_NORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	SEVERE_NORMAL(3, "SevereNormal", "SevereNormal"),

	/**
	 * The '<em><b>Severe Mild</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEVERE_MILD_VALUE
	 * @generated
	 * @ordered
	 */
	SEVERE_MILD(4, "SevereMild", "SevereMild"),

	/**
	 * The '<em><b>Severe Moderate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEVERE_MODERATE_VALUE
	 * @generated
	 * @ordered
	 */
	SEVERE_MODERATE(5, "SevereModerate", "SevereModerate"),

	/**
	 * The '<em><b>Profound Severe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROFOUND_SEVERE_VALUE
	 * @generated
	 * @ordered
	 */
	PROFOUND_SEVERE(6, "ProfoundSevere", "ProfoundSevere"),

	/**
	 * The '<em><b>Profound</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROFOUND_VALUE
	 * @generated
	 * @ordered
	 */
	PROFOUND(7, "Profound", "Profound");

	/**
	 * The '<em><b>Mild Normal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILD_NORMAL
	 * @model name="MildNormal"
	 * @generated
	 * @ordered
	 */
	public static final int MILD_NORMAL_VALUE = 0;

	/**
	 * The '<em><b>Moderate Normal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODERATE_NORMAL
	 * @model name="ModerateNormal"
	 * @generated
	 * @ordered
	 */
	public static final int MODERATE_NORMAL_VALUE = 1;

	/**
	 * The '<em><b>Moderate Mild</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODERATE_MILD
	 * @model name="ModerateMild"
	 * @generated
	 * @ordered
	 */
	public static final int MODERATE_MILD_VALUE = 2;

	/**
	 * The '<em><b>Severe Normal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEVERE_NORMAL
	 * @model name="SevereNormal"
	 * @generated
	 * @ordered
	 */
	public static final int SEVERE_NORMAL_VALUE = 3;

	/**
	 * The '<em><b>Severe Mild</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEVERE_MILD
	 * @model name="SevereMild"
	 * @generated
	 * @ordered
	 */
	public static final int SEVERE_MILD_VALUE = 4;

	/**
	 * The '<em><b>Severe Moderate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEVERE_MODERATE
	 * @model name="SevereModerate"
	 * @generated
	 * @ordered
	 */
	public static final int SEVERE_MODERATE_VALUE = 5;

	/**
	 * The '<em><b>Profound Severe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROFOUND_SEVERE
	 * @model name="ProfoundSevere"
	 * @generated
	 * @ordered
	 */
	public static final int PROFOUND_SEVERE_VALUE = 6;

	/**
	 * The '<em><b>Profound</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROFOUND
	 * @model name="Profound"
	 * @generated
	 * @ordered
	 */
	public static final int PROFOUND_VALUE = 7;

	/**
	 * An array of all the '<em><b>Rising Hearing Loss Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RisingHearingLossType[] VALUES_ARRAY =
		new RisingHearingLossType[] {
			MILD_NORMAL,
			MODERATE_NORMAL,
			MODERATE_MILD,
			SEVERE_NORMAL,
			SEVERE_MILD,
			SEVERE_MODERATE,
			PROFOUND_SEVERE,
			PROFOUND,
		};

	/**
	 * A public read-only list of all the '<em><b>Rising Hearing Loss Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RisingHearingLossType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Rising Hearing Loss Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RisingHearingLossType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RisingHearingLossType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rising Hearing Loss Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RisingHearingLossType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RisingHearingLossType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rising Hearing Loss Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RisingHearingLossType get(int value) {
		switch (value) {
			case MILD_NORMAL_VALUE: return MILD_NORMAL;
			case MODERATE_NORMAL_VALUE: return MODERATE_NORMAL;
			case MODERATE_MILD_VALUE: return MODERATE_MILD;
			case SEVERE_NORMAL_VALUE: return SEVERE_NORMAL;
			case SEVERE_MILD_VALUE: return SEVERE_MILD;
			case SEVERE_MODERATE_VALUE: return SEVERE_MODERATE;
			case PROFOUND_SEVERE_VALUE: return PROFOUND_SEVERE;
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
	private RisingHearingLossType(int value, String name, String literal) {
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
	
} //RisingHearingLossType
