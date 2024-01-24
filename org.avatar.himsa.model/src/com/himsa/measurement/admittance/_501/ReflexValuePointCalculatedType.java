/*
 */
package com.himsa.measurement.admittance._501;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reflex Value Point Calculated Type</b></em>'.
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
 *   <li>{@link com.himsa.measurement.admittance._501.ReflexValuePointCalculatedType#getTime <em>Time</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.ReflexValuePointCalculatedType#getNumericDeltaY <em>Numeric Delta Y</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.admittance._501._501Package#getReflexValuePointCalculatedType()
 * @model extendedMetaData="name='ReflexValuePointCalculated_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ReflexValuePointCalculatedType extends EObject {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time in seconds  X-Values of the point
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(BigDecimal)
	 * @see com.himsa.measurement.admittance._501._501Package#getReflexValuePointCalculatedType_Time()
	 * @model dataType="com.himsa.measurement.admittance._501.TimeType2" required="true"
	 *        extendedMetaData="kind='element' name='Time' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTime();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.ReflexValuePointCalculatedType#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Numeric Delta Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Delta Y' 
	 * 
	 * 
	 * 
	 * @@ Convert DOWN Rules 501 to 500
	 * 
	 * Format 500 restricted the number of points to be 128.  When converting down to format 500 the converter will simply take the first up to 128 points, the rest of the points will be dropped.
	 * 
	 * This element is first introduced in format 501 so when converting down this value will need to be transfer to admittanceValue_Type > Argument1.  
	 * 
	 * Argument2 will be zero
	 * 
	 * In format 500 this value is formatted depending on the unit_type.  Format 500 defined this element as an integer with a multiplier (a carryover from the C header format 100).  Format 501 defines this field as a decimal value so the converter will follow the below formula when the runtime converter is called.
	 * + If CubicCentimeter is the unit then round up the value so that it has 2 decimal values, multiply by 100
	 * + If MilliLiter is the unit then round up the value so that it has 2 decimal values, multiply by 100
	 * + If MilliMho is the unit then round up the value so that it has 2 decimal values, multiply by 100
	 * + If Degree is the unit then round up the value so that it has 1 decimal value, multiply by 10
	 * + If DekaPascal then nothing needs to be done
	 * Example, if the unit is CubicCentimeter and the value is .895 the converted results will be 90 (.895 rounds up to .90 X 100 = 90)
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Numeric Delta Y</em>' attribute.
	 * @see #setNumericDeltaY(BigDecimal)
	 * @see com.himsa.measurement.admittance._501._501Package#getReflexValuePointCalculatedType_NumericDeltaY()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='NumericDeltaY' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getNumericDeltaY();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.ReflexValuePointCalculatedType#getNumericDeltaY <em>Numeric Delta Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numeric Delta Y</em>' attribute.
	 * @see #getNumericDeltaY()
	 * @generated
	 */
	void setNumericDeltaY(BigDecimal value);

} // ReflexValuePointCalculatedType
