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
 * A representation of the literals of the enumeration '<em><b>Symmetry Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see audiogrammetadata.AudiogrammetadataPackage#getSymmetryType()
 * @model extendedMetaData="name='Symmetry_._type'"
 * @generated
 */
@ProviderType
public enum SymmetryType implements Enumerator {
	/**
	 * The '<em><b>Symmetrical Hearing Loss</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYMMETRICAL_HEARING_LOSS_VALUE
	 * @generated
	 * @ordered
	 */
	SYMMETRICAL_HEARING_LOSS(0, "SymmetricalHearingLoss", "SymmetricalHearingLoss"),

	/**
	 * The '<em><b>ASymmetrical Hearing Loss</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASYMMETRICAL_HEARING_LOSS_VALUE
	 * @generated
	 * @ordered
	 */
	ASYMMETRICAL_HEARING_LOSS(1, "ASymmetricalHearingLoss", "ASymmetricalHearingLoss");

	/**
	 * The '<em><b>Symmetrical Hearing Loss</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYMMETRICAL_HEARING_LOSS
	 * @model name="SymmetricalHearingLoss"
	 * @generated
	 * @ordered
	 */
	public static final int SYMMETRICAL_HEARING_LOSS_VALUE = 0;

	/**
	 * The '<em><b>ASymmetrical Hearing Loss</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASYMMETRICAL_HEARING_LOSS
	 * @model name="ASymmetricalHearingLoss"
	 * @generated
	 * @ordered
	 */
	public static final int ASYMMETRICAL_HEARING_LOSS_VALUE = 1;

	/**
	 * An array of all the '<em><b>Symmetry Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SymmetryType[] VALUES_ARRAY =
		new SymmetryType[] {
			SYMMETRICAL_HEARING_LOSS,
			ASYMMETRICAL_HEARING_LOSS,
		};

	/**
	 * A public read-only list of all the '<em><b>Symmetry Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SymmetryType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Symmetry Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SymmetryType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SymmetryType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Symmetry Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SymmetryType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SymmetryType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Symmetry Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SymmetryType get(int value) {
		switch (value) {
			case SYMMETRICAL_HEARING_LOSS_VALUE: return SYMMETRICAL_HEARING_LOSS;
			case ASYMMETRICAL_HEARING_LOSS_VALUE: return ASYMMETRICAL_HEARING_LOSS;
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
	private SymmetryType(int value, String name, String literal) {
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
	
} //SymmetryType
