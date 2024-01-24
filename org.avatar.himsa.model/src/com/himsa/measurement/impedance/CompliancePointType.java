/*
 */
package com.himsa.measurement.impedance;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compliance Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * With a probe that acts as sealing, the pressure before the tympanic
 * membrane can be varied by attaching a pump with a tube. While varying
 * the pressure, the compliance of the middle ear expressed as the acoustic
 * admittance is measured, and later saved in a Compliance Pressure point.
 * 
 *  ## TComplPoint ##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.impedance.CompliancePointType#getPressure <em>Pressure</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.CompliancePointType#getCompliance <em>Compliance</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.impedance.ImpedancePackage#getCompliancePointType()
 * @model extendedMetaData="name='CompliancePoint_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CompliancePointType extends EObject {
	/**
	 * Returns the value of the '<em><b>Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The applied pressure of the stimulus (x-axis on the compliance graph)
	 * 
	 * ## pressure ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pressure</em>' attribute.
	 * @see #setPressure(BigInteger)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getCompliancePointType_Pressure()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='Pressure' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPressure();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.CompliancePointType#getPressure <em>Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure</em>' attribute.
	 * @see #getPressure()
	 * @generated
	 */
	void setPressure(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Compliance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The compliance of the system at a known pressure, (y-axis on the compliance graph).
	 * 
	 * ## compliance ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compliance</em>' containment reference.
	 * @see #setCompliance(ComplianceValueType)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getCompliancePointType_Compliance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Compliance' namespace='##targetNamespace'"
	 * @generated
	 */
	ComplianceValueType getCompliance();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.CompliancePointType#getCompliance <em>Compliance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compliance</em>' containment reference.
	 * @see #getCompliance()
	 * @generated
	 */
	void setCompliance(ComplianceValueType value);

} // CompliancePointType
