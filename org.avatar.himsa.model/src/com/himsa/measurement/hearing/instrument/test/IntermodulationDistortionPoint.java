/*
 */
package com.himsa.measurement.hearing.instrument.test;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intermodulation Distortion Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A single measurement point for Intermodulation  Distortion Measurements
 * 
 * ## TTIMDistMeasPoint; ##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.IntermodulationDistortionPoint#getFreq1 <em>Freq1</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.IntermodulationDistortionPoint#getFreq2 <em>Freq2</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.IntermodulationDistortionPoint#getInput1 <em>Input1</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.IntermodulationDistortionPoint#getInput2 <em>Input2</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.IntermodulationDistortionPoint#getOutput1 <em>Output1</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.IntermodulationDistortionPoint#getOutput2 <em>Output2</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.IntermodulationDistortionPoint#getOutputDiff1 <em>Output Diff1</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.IntermodulationDistortionPoint#getOutputDiff2 <em>Output Diff2</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.IntermodulationDistortionPoint#getTIDistortion <em>TI Distortion</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getIntermodulationDistortionPoint()
 * @model extendedMetaData="name='IntermodulationDistortionPoint' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface IntermodulationDistortionPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Freq1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * First stimulation frequency.
	 * 
	 * ##freq1##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Freq1</em>' attribute.
	 * @see #setFreq1(BigInteger)
	 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getIntermodulationDistortionPoint_Freq1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='Freq1' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getFreq1();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.hearing.instrument.test.IntermodulationDistortionPoint#getFreq1 <em>Freq1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freq1</em>' attribute.
	 * @see #getFreq1()
	 * @generated
	 */
	void setFreq1(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Freq2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Second stimulation frequency. 
	 * 
	 * ##freq2##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Freq2</em>' attribute.
	 * @see #setFreq2(BigInteger)
	 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getIntermodulationDistortionPoint_Freq2()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='Freq2' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getFreq2();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.hearing.instrument.test.IntermodulationDistortionPoint#getFreq2 <em>Freq2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freq2</em>' attribute.
	 * @see #getFreq2()
	 * @generated
	 */
	void setFreq2(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Input1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Signal No. 1 Input Level. 
	 * 
	 * ##input1##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input1</em>' attribute.
	 * @see #setInput1(BigDecimal)
	 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getIntermodulationDistortionPoint_Input1()
	 * @model dataType="com.himsa.measurement.hearing.instrument.test.Input1Type" required="true"
	 *        extendedMetaData="kind='element' name='Input1' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getInput1();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.hearing.instrument.test.IntermodulationDistortionPoint#getInput1 <em>Input1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input1</em>' attribute.
	 * @see #getInput1()
	 * @generated
	 */
	void setInput1(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Input2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Signal No. 2 Input Level. 
	 * 
	 * ##input2##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input2</em>' attribute.
	 * @see #setInput2(BigDecimal)
	 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getIntermodulationDistortionPoint_Input2()
	 * @model dataType="com.himsa.measurement.hearing.instrument.test.Input2Type" required="true"
	 *        extendedMetaData="kind='element' name='Input2' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getInput2();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.hearing.instrument.test.IntermodulationDistortionPoint#getInput2 <em>Input2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input2</em>' attribute.
	 * @see #getInput2()
	 * @generated
	 */
	void setInput2(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Output1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Output Level at Freq1. 
	 * 
	 * ##output1##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output1</em>' attribute.
	 * @see #setOutput1(BigDecimal)
	 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getIntermodulationDistortionPoint_Output1()
	 * @model dataType="com.himsa.measurement.hearing.instrument.test.Output1Type" required="true"
	 *        extendedMetaData="kind='element' name='Output1' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getOutput1();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.hearing.instrument.test.IntermodulationDistortionPoint#getOutput1 <em>Output1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output1</em>' attribute.
	 * @see #getOutput1()
	 * @generated
	 */
	void setOutput1(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Output2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Output Level at Freq2. 
	 * 
	 * ##output2##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output2</em>' attribute.
	 * @see #setOutput2(BigDecimal)
	 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getIntermodulationDistortionPoint_Output2()
	 * @model dataType="com.himsa.measurement.hearing.instrument.test.Output2Type" required="true"
	 *        extendedMetaData="kind='element' name='Output2' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getOutput2();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.hearing.instrument.test.IntermodulationDistortionPoint#getOutput2 <em>Output2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output2</em>' attribute.
	 * @see #getOutput2()
	 * @generated
	 */
	void setOutput2(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Output Diff1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Output Level SecondStimulationFrequency - FirstStimulationFrequency
	 * 
	 * ##outputDif1##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Diff1</em>' attribute.
	 * @see #setOutputDiff1(BigDecimal)
	 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getIntermodulationDistortionPoint_OutputDiff1()
	 * @model dataType="com.himsa.measurement.hearing.instrument.test.OutputDiff1Type" required="true"
	 *        extendedMetaData="kind='element' name='OutputDiff1' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getOutputDiff1();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.hearing.instrument.test.IntermodulationDistortionPoint#getOutputDiff1 <em>Output Diff1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Diff1</em>' attribute.
	 * @see #getOutputDiff1()
	 * @generated
	 */
	void setOutputDiff1(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Output Diff2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Output Level 2X FirstStimulationFrequency - SecondStimulationFrequency
	 * 
	 * ##outputDif2##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Diff2</em>' attribute.
	 * @see #setOutputDiff2(BigDecimal)
	 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getIntermodulationDistortionPoint_OutputDiff2()
	 * @model dataType="com.himsa.measurement.hearing.instrument.test.OutputDiff2Type" required="true"
	 *        extendedMetaData="kind='element' name='OutputDiff2' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getOutputDiff2();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.hearing.instrument.test.IntermodulationDistortionPoint#getOutputDiff2 <em>Output Diff2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Diff2</em>' attribute.
	 * @see #getOutputDiff2()
	 * @generated
	 */
	void setOutputDiff2(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>TI Distortion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total Intermodulation Distortion expressed as a  percentage 
	 * 
	 * ## TIMPct ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TI Distortion</em>' attribute.
	 * @see #setTIDistortion(BigDecimal)
	 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getIntermodulationDistortionPoint_TIDistortion()
	 * @model dataType="com.himsa.measurement.hearing.instrument.test.TIDistortionType" required="true"
	 *        extendedMetaData="kind='element' name='TIDistortion' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTIDistortion();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.hearing.instrument.test.IntermodulationDistortionPoint#getTIDistortion <em>TI Distortion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TI Distortion</em>' attribute.
	 * @see #getTIDistortion()
	 * @generated
	 */
	void setTIDistortion(BigDecimal value);

} // IntermodulationDistortionPoint
