/*
 */
package impedance;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compliance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Compliance value is saved with a reference to the definition of a
 * complex value and a reference to the definition of the unit for the value.
 * 
 * ## TCompliance ##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link impedance.ComplianceType#getComplianceValue <em>Compliance Value</em>}</li>
 *   <li>{@link impedance.ComplianceType#getComplianceUnit <em>Compliance Unit</em>}</li>
 * </ul>
 *
 * @see impedance.ImpedancePackage#getComplianceType()
 * @model extendedMetaData="name='Compliance_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ComplianceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Compliance Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Compliance value
	 * 
	 * 6/25/2012 Annotation
	 * Note: If a Maximum Compliance is stored it should have compliance value.  This element was accidentally not defined as mandatory.  This error was discovered after the release of format 500.  HIMSA will not change the value to mandatory for fear of causing a problem for any module that has written code against the schema file
	 * 
	 * ## complVal 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compliance Value</em>' containment reference.
	 * @see #setComplianceValue(ComplianceValueType)
	 * @see impedance.ImpedancePackage#getComplianceType_ComplianceValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ComplianceValue' namespace='##targetNamespace'"
	 * @generated
	 */
	ComplianceValueType getComplianceValue();

	/**
	 * Sets the value of the '{@link impedance.ComplianceType#getComplianceValue <em>Compliance Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compliance Value</em>' containment reference.
	 * @see #getComplianceValue()
	 * @generated
	 */
	void setComplianceValue(ComplianceValueType value);

	/**
	 * Returns the value of the '<em><b>Compliance Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unit of the Compliance Value
	 * 
	 * ## complUnit ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compliance Unit</em>' containment reference.
	 * @see #setComplianceUnit(ComplianceUnitType)
	 * @see impedance.ImpedancePackage#getComplianceType_ComplianceUnit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ComplianceUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	ComplianceUnitType getComplianceUnit();

	/**
	 * Sets the value of the '{@link impedance.ComplianceType#getComplianceUnit <em>Compliance Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compliance Unit</em>' containment reference.
	 * @see #getComplianceUnit()
	 * @generated
	 */
	void setComplianceUnit(ComplianceUnitType value);

} // ComplianceType
