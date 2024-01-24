/*
 */
package impedance;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Recording Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A Measuring condition of the compliance measurement.
 * 
 * + compensated / The admittance equivalent to the Ear canal volume is conventionally subtracted from measures of total aural admittance to yield an estimate of the middle ear admittance. This is referred to as compensated admittance.
 * 
 * Ear canal volumes are in the range of [0.30 .. 1.00] ccm in children and
 * [0.65 .. 1.75] ccm in adults. Katz pg 180. The volume is given by the formula
 * 
 * 
 * ##TRecordModee ##
 * <!-- end-model-doc -->
 * @see impedance.ImpedancePackage#getRecordingModeType()
 * @model extendedMetaData="name='RecordingMode_Type'"
 * @generated
 */
@ProviderType
public enum RecordingModeType implements Enumerator {
	/**
	 * The '<em><b>Compensated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPENSATED_VALUE
	 * @generated
	 * @ordered
	 */
	COMPENSATED(0, "Compensated", "Compensated"),

	/**
	 * The '<em><b>Non Compensated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_COMPENSATED_VALUE
	 * @generated
	 * @ordered
	 */
	NON_COMPENSATED(1, "NonCompensated", "NonCompensated");

	/**
	 * The '<em><b>Compensated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPENSATED
	 * @model name="Compensated"
	 * @generated
	 * @ordered
	 */
	public static final int COMPENSATED_VALUE = 0;

	/**
	 * The '<em><b>Non Compensated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_COMPENSATED
	 * @model name="NonCompensated"
	 * @generated
	 * @ordered
	 */
	public static final int NON_COMPENSATED_VALUE = 1;

	/**
	 * An array of all the '<em><b>Recording Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RecordingModeType[] VALUES_ARRAY =
		new RecordingModeType[] {
			COMPENSATED,
			NON_COMPENSATED,
		};

	/**
	 * A public read-only list of all the '<em><b>Recording Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RecordingModeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Recording Mode Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RecordingModeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RecordingModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Recording Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RecordingModeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RecordingModeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Recording Mode Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RecordingModeType get(int value) {
		switch (value) {
			case COMPENSATED_VALUE: return COMPENSATED;
			case NON_COMPENSATED_VALUE: return NON_COMPENSATED;
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
	private RecordingModeType(int value, String name, String literal) {
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
	
} //RecordingModeType
