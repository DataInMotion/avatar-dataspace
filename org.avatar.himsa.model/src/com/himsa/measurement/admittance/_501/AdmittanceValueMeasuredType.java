/*
 */
package com.himsa.measurement.admittance._501;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admittance Value Measured Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The admittance Curve depicts the modulus recording of the admittance, i.e. the length of a complex value, calculated by using Pythagoras´ sentence. In this
 * structure, both the real and the imaginary part of the value or the value is saved, but for practical purposes, the admittance can be considered 90 degrees out of
 * phase (real part approximately zero) at the Max. admittance point. This rule applies only for probe frequencies near 220 Hz e.g. 226 Hz.
 * 
 * The application saving the data which comes from an automated solution (gathering all data from the device) is assumed to save data via the Measured choice and provide the G and B values.  Y can later be caluculated by any applicaiton reading the data.
 * 
 * OR
 * 
 * If the applicaiton (e.g. HIMSA's Audiogram module) provides a simple/manual method to record results it is assumed to use the Calculated choice
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.admittance._501.AdmittanceValueMeasuredType#getG <em>G</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.AdmittanceValueMeasuredType#getB <em>B</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.admittance._501._501Package#getAdmittanceValueMeasuredType()
 * @model extendedMetaData="name='AdmittanceValueMeasured_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AdmittanceValueMeasuredType extends EObject {
	/**
	 * Returns the value of the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Real part of the admittance value
	 * 
	 * Acoustic admittance requires two numbers to specify its location in the complex plane, and is a vector which rotates in a circular manner tied to the probe frequency. In order to place the admittance values accurately a complex number is recorded which has a real and an imaginary element.
	 * 
	 * @@ Convert DOWN Rules 501 to 500
	 * 
	 * This element was renamed to "G" from "Argumentadmittance1" 
	 * 
	 * In format 500 this value is formatted depending on the unit_type.  Format 500 defined this element as an integer with a multiplier (a carryover from the C header format 100).  Format 501 defines this field as a decimal value so the converter will follow the below formula when the runtime converter is called.
	 * + If CubicCentimeter is the unit then round up the value so that it has 2 decimal values, multiply by 100
	 * + If MilliLiter is the unit then round up the value so that it has 2 decimal values, multiply by 100
	 * + If MilliMho is the unit then round up the value so that it has 2 decimal values, multiply by 100
	 * + If Degree is the unit then round up the value so that it has 1 decimal value, multiply by 10
	 * + If DekaPascal then nothing needs to be done
	 * Example, if the unit is CubicCentimeter and the value is .895 the converted results will be 90 (.895 rounds up to .90 X 100 = 90)
	 * @@
	 * 
	 * @@ Convert UP Rules 500 to 501
	 * + If CubicCentimeter is the unit then divide the integer by 100
	 * + If MilliLiter is the unit then divide the integer by 100
	 * + If MilliMho is the unit then divide the integer by 100
	 * + If Degree is the unit then divide the integer by 10
	 * + If DekaPascal then nothing needs to be done
	 * Example, if the unit is CubicCentimeter and the value is 90 the converted result will be .90 (90/100)
	 * @@
	 * 
	 * 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>G</em>' attribute.
	 * @see #setG(BigDecimal)
	 * @see com.himsa.measurement.admittance._501._501Package#getAdmittanceValueMeasuredType_G()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal" required="true"
	 *        extendedMetaData="kind='element' name='G' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getG();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.AdmittanceValueMeasuredType#getG <em>G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G</em>' attribute.
	 * @see #getG()
	 * @generated
	 */
	void setG(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Imaginary part of the admittance value
	 * 
	 * As the ear drum moves in and out from its resting state whilst responding to forces applied by the air pump during the admittance measurement it has in phase and out of phase motions. To accurately locate these movements on a admittance curve we are required to employ complex mathematical formula that include the imaginary number elements.
	 * 
	 * @@ Convert DOWN Rules 501 to 500
	 * 
	 * This element was renamed to "B" from "Argumentadmittance2" 
	 * 
	 * In format 500 this value is formatted depending on the unit_type.  Format 500 defined this element as an integer with a multiplier (a carryover from the C header format 100).  Format 501 defines this field as a decimal value so the converter will follow the below formula when the runtime converter is called.
	 * + If CubicCentimeter is the unit then round up the value so that it has 2 decimal values, multiply by 100
	 * + If MilliLiter is the unit then round up the value so that it has 2 decimal values, multiply by 100
	 * + If MilliMho is the unit then round up the value so that it has 2 decimal values, multiply by 100
	 * + If Degree is the unit then round up the value so that it has 1 decimal value, multiply by 10
	 * + If DekaPascal then nothing needs to be done
	 * Example, if the unit is CubicCentimeter and the value is .895 the converted results will be 90 (.895 rounds up to .90 X 100 = 90)
	 * @@
	 * 
	 * @@ Convert UP Rules 500 to 501
	 * + If CubicCentimeter is the unit then divide the integer by 100
	 * + If MilliLiter is the unit then divide the integer by 100
	 * + If MilliMho is the unit then divide the integer by 100
	 * + If Degree is the unit then divide the integer by 10
	 * + If DekaPascal then nothing needs to be done
	 * Example, if the unit is CubicCentimeter and the value is 90 the converted result will be .90 (90/100)
	 * @@
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>B</em>' attribute.
	 * @see #setB(BigDecimal)
	 * @see com.himsa.measurement.admittance._501._501Package#getAdmittanceValueMeasuredType_B()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal" required="true"
	 *        extendedMetaData="kind='element' name='B' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getB();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.AdmittanceValueMeasuredType#getB <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' attribute.
	 * @see #getB()
	 * @generated
	 */
	void setB(BigDecimal value);

} // AdmittanceValueMeasuredType
