/*
 */
package com.himsa.scan.scan.meta.data;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Scan Format Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.himsa.scan.scan.meta.data.DataPackage#getScanFormatType()
 * @model extendedMetaData="name='ScanFormat_._type'"
 * @generated
 */
@ProviderType
public enum ScanFormatType implements Enumerator {
	/**
	 * The '<em><b>HPS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPS_VALUE
	 * @generated
	 * @ordered
	 */
	HPS(0, "HPS", "HPS"),

	/**
	 * The '<em><b>STL Binary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STL_BINARY_VALUE
	 * @generated
	 * @ordered
	 */
	STL_BINARY(1, "STLBinary", "STL Binary"),

	/**
	 * The '<em><b>ASC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASC_VALUE
	 * @generated
	 * @ordered
	 */
	ASC(2, "ASC", "ASC");

	/**
	 * The '<em><b>HPS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HPS_VALUE = 0;

	/**
	 * The '<em><b>STL Binary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STL_BINARY
	 * @model name="STLBinary" literal="STL Binary"
	 * @generated
	 * @ordered
	 */
	public static final int STL_BINARY_VALUE = 1;

	/**
	 * The '<em><b>ASC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASC_VALUE = 2;

	/**
	 * An array of all the '<em><b>Scan Format Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ScanFormatType[] VALUES_ARRAY =
		new ScanFormatType[] {
			HPS,
			STL_BINARY,
			ASC,
		};

	/**
	 * A public read-only list of all the '<em><b>Scan Format Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ScanFormatType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Scan Format Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScanFormatType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScanFormatType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scan Format Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScanFormatType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScanFormatType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scan Format Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScanFormatType get(int value) {
		switch (value) {
			case HPS_VALUE: return HPS;
			case STL_BINARY_VALUE: return STL_BINARY;
			case ASC_VALUE: return ASC;
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
	private ScanFormatType(int value, String name, String literal) {
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
	
} //ScanFormatType
