/*
 */
package impedance;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compliance Unit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Y-values of the Compliance Curve can have different units (cc, ml, mmho..
 * etc), which depends of the instrument type.
 * 
 *  ## TComplUnit ##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link impedance.ComplianceUnitType#getArgumentUnit1 <em>Argument Unit1</em>}</li>
 *   <li>{@link impedance.ComplianceUnitType#getArgumentUnit2 <em>Argument Unit2</em>}</li>
 * </ul>
 *
 * @see impedance.ImpedancePackage#getComplianceUnitType()
 * @model extendedMetaData="name='ComplianceUnit_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ComplianceUnitType extends EObject {
	/**
	 * Returns the value of the '<em><b>Argument Unit1</b></em>' attribute.
	 * The literals are from the enumeration {@link impedance.UnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unit of the real part
	 * 
	 * ## ArgUnit1 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Argument Unit1</em>' attribute.
	 * @see impedance.UnitType
	 * @see #isSetArgumentUnit1()
	 * @see #unsetArgumentUnit1()
	 * @see #setArgumentUnit1(UnitType)
	 * @see impedance.ImpedancePackage#getComplianceUnitType_ArgumentUnit1()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ArgumentUnit1' namespace='##targetNamespace'"
	 * @generated
	 */
	UnitType getArgumentUnit1();

	/**
	 * Sets the value of the '{@link impedance.ComplianceUnitType#getArgumentUnit1 <em>Argument Unit1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument Unit1</em>' attribute.
	 * @see impedance.UnitType
	 * @see #isSetArgumentUnit1()
	 * @see #unsetArgumentUnit1()
	 * @see #getArgumentUnit1()
	 * @generated
	 */
	void setArgumentUnit1(UnitType value);

	/**
	 * Unsets the value of the '{@link impedance.ComplianceUnitType#getArgumentUnit1 <em>Argument Unit1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArgumentUnit1()
	 * @see #getArgumentUnit1()
	 * @see #setArgumentUnit1(UnitType)
	 * @generated
	 */
	void unsetArgumentUnit1();

	/**
	 * Returns whether the value of the '{@link impedance.ComplianceUnitType#getArgumentUnit1 <em>Argument Unit1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Argument Unit1</em>' attribute is set.
	 * @see #unsetArgumentUnit1()
	 * @see #getArgumentUnit1()
	 * @see #setArgumentUnit1(UnitType)
	 * @generated
	 */
	boolean isSetArgumentUnit1();

	/**
	 * Returns the value of the '<em><b>Argument Unit2</b></em>' attribute.
	 * The literals are from the enumeration {@link impedance.UnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unit of the Imaginary part
	 * 
	 * ## ArgUnit2 ##
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Argument Unit2</em>' attribute.
	 * @see impedance.UnitType
	 * @see #isSetArgumentUnit2()
	 * @see #unsetArgumentUnit2()
	 * @see #setArgumentUnit2(UnitType)
	 * @see impedance.ImpedancePackage#getComplianceUnitType_ArgumentUnit2()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ArgumentUnit2' namespace='##targetNamespace'"
	 * @generated
	 */
	UnitType getArgumentUnit2();

	/**
	 * Sets the value of the '{@link impedance.ComplianceUnitType#getArgumentUnit2 <em>Argument Unit2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument Unit2</em>' attribute.
	 * @see impedance.UnitType
	 * @see #isSetArgumentUnit2()
	 * @see #unsetArgumentUnit2()
	 * @see #getArgumentUnit2()
	 * @generated
	 */
	void setArgumentUnit2(UnitType value);

	/**
	 * Unsets the value of the '{@link impedance.ComplianceUnitType#getArgumentUnit2 <em>Argument Unit2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArgumentUnit2()
	 * @see #getArgumentUnit2()
	 * @see #setArgumentUnit2(UnitType)
	 * @generated
	 */
	void unsetArgumentUnit2();

	/**
	 * Returns whether the value of the '{@link impedance.ComplianceUnitType#getArgumentUnit2 <em>Argument Unit2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Argument Unit2</em>' attribute is set.
	 * @see #unsetArgumentUnit2()
	 * @see #getArgumentUnit2()
	 * @see #setArgumentUnit2(UnitType)
	 * @generated
	 */
	boolean isSetArgumentUnit2();

} // ComplianceUnitType
