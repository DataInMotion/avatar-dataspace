/*
 */
package com.himsa.measurement.impedance;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compliance Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Compliance Curve depicts the modulus of the compliance, i.e. the length of a complex value, calculated by using Pythagoras´ sentence. In this
 * structure, both the real and the imaginary part of the value is saved, but for practical purposes, the Compliance can be considered 90 degrees out of
 * phase (real part approximately zero) at the Max. Compliance point. This rule applies only for probe frequencies near 220 Hz e.g. 226 Hz.
 * 
 * 
 * ## TComplVal ##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.impedance.ComplianceValueType#getArgumentCompliance1 <em>Argument Compliance1</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.ComplianceValueType#getArgumentCompliance2 <em>Argument Compliance2</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.impedance.ImpedancePackage#getComplianceValueType()
 * @model extendedMetaData="name='ComplianceValue_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ComplianceValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Argument Compliance1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Real part of the compliance value
	 * 
	 * Acoustic admittance requires two numbers to specify its location in the complex plane, and is a vector which rotates in a circular manner tied to the probe frequency. In order to place the compliance values accurately a complex number is recorded which has a real and an imaginary element.
	 * 
	 * 6/25 note - See the important annotation listed under Unit_Type
	 * 
	 * ## argCompl1 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Argument Compliance1</em>' attribute.
	 * @see #setArgumentCompliance1(BigInteger)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getComplianceValueType_ArgumentCompliance1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='ArgumentCompliance1' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getArgumentCompliance1();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.ComplianceValueType#getArgumentCompliance1 <em>Argument Compliance1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument Compliance1</em>' attribute.
	 * @see #getArgumentCompliance1()
	 * @generated
	 */
	void setArgumentCompliance1(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Argument Compliance2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Imaginary part of the compliance value
	 * 
	 * As the ear drum moves in and out from its resting state whilst responding to forces applied by the air pump during the compliance measurement it has in phase and out of phase motions. To accurately locate these movements on a compliance curve we are required to employ complex mathematical formula that include the imaginary number elements.
	 * 
	 * 6/25 note - See the important annotation listed under Unit_Type
	 * 
	 * This element was not defined as mandatory in format 100.  If the data is converted from format 100 and the value is empty then the HIMSA conversion DLL will insert a value of 0 (zero)
	 * 
	 * ## argCompl2 ##
	 * 
	 * @@ If reading format 100 and the field is empty then populate this element with the value of 0 (zero) @@
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Argument Compliance2</em>' attribute.
	 * @see #setArgumentCompliance2(BigInteger)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getComplianceValueType_ArgumentCompliance2()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='ArgumentCompliance2' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getArgumentCompliance2();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.ComplianceValueType#getArgumentCompliance2 <em>Argument Compliance2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument Compliance2</em>' attribute.
	 * @see #getArgumentCompliance2()
	 * @generated
	 */
	void setArgumentCompliance2(BigInteger value);

} // ComplianceValueType
