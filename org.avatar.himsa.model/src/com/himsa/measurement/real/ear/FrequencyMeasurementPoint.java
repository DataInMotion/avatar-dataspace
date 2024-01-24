/*
 */
package com.himsa.measurement.real.ear;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frequency Measurement Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ## TFreqMeasPoint ##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.real.ear.FrequencyMeasurementPoint#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.FrequencyMeasurementPoint#getInput <em>Input</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.FrequencyMeasurementPoint#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.real.ear.EarPackage#getFrequencyMeasurementPoint()
 * @model extendedMetaData="name='FrequencyMeasurementPoint' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FrequencyMeasurementPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The frequency at which the measurement
	 * was done.
	 * 
	 * ##freq##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(BigInteger)
	 * @see com.himsa.measurement.real.ear.EarPackage#getFrequencyMeasurementPoint_Frequency()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='Frequency' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getFrequency();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.real.ear.FrequencyMeasurementPoint#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Signal Input Level. 
	 * 
	 * ##input##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see #setInput(BigDecimal)
	 * @see com.himsa.measurement.real.ear.EarPackage#getFrequencyMeasurementPoint_Input()
	 * @model dataType="com.himsa.measurement.real.ear.InputType2" required="true"
	 *        extendedMetaData="kind='element' name='Input' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getInput();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.real.ear.FrequencyMeasurementPoint#getInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Signal Output Level
	 * 
	 * ##output##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output</em>' attribute.
	 * @see #setOutput(BigDecimal)
	 * @see com.himsa.measurement.real.ear.EarPackage#getFrequencyMeasurementPoint_Output()
	 * @model dataType="com.himsa.measurement.real.ear.OutputType3" required="true"
	 *        extendedMetaData="kind='element' name='Output' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getOutput();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.real.ear.FrequencyMeasurementPoint#getOutput <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' attribute.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(BigDecimal value);

} // FrequencyMeasurementPoint
