/*
 */
package com.himsa.measurement.hearing.instrument.test;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Harmonic Distortion Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * a single measurement point for Harmonic Distortion Measurements.
 * 
 * ## TTHDDistMeasPoint ##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.HarmonicDistortionPoint#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.HarmonicDistortionPoint#getInput <em>Input</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.HarmonicDistortionPoint#getFx1 <em>Fx1</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.HarmonicDistortionPoint#getFx2 <em>Fx2</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.HarmonicDistortionPoint#getFx3 <em>Fx3</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.HarmonicDistortionPoint#getThirdHD <em>Third HD</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getHarmonicDistortionPoint()
 * @model extendedMetaData="name='HarmonicDistortionPoint' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface HarmonicDistortionPoint extends EObject {
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
	 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getHarmonicDistortionPoint_Frequency()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='Frequency' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getFrequency();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.hearing.instrument.test.HarmonicDistortionPoint#getFrequency <em>Frequency</em>}' attribute.
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
	 * Signal Input Level
	 * 
	 * ##input##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see #setInput(BigDecimal)
	 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getHarmonicDistortionPoint_Input()
	 * @model dataType="com.himsa.measurement.hearing.instrument.test.InputType1" required="true"
	 *        extendedMetaData="kind='element' name='Input' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getInput();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.hearing.instrument.test.HarmonicDistortionPoint#getInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Fx1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Output level at base frequency. 
	 * 
	 * ##output1Harm##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fx1</em>' attribute.
	 * @see #setFx1(BigDecimal)
	 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getHarmonicDistortionPoint_Fx1()
	 * @model dataType="com.himsa.measurement.hearing.instrument.test.Fx1Type" required="true"
	 *        extendedMetaData="kind='element' name='Fx1' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getFx1();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.hearing.instrument.test.HarmonicDistortionPoint#getFx1 <em>Fx1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fx1</em>' attribute.
	 * @see #getFx1()
	 * @generated
	 */
	void setFx1(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Fx2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Output level at 2 * base frequency. 
	 * 
	 * ##output2Harm##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fx2</em>' attribute.
	 * @see #setFx2(BigDecimal)
	 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getHarmonicDistortionPoint_Fx2()
	 * @model dataType="com.himsa.measurement.hearing.instrument.test.Fx2Type" required="true"
	 *        extendedMetaData="kind='element' name='Fx2' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getFx2();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.hearing.instrument.test.HarmonicDistortionPoint#getFx2 <em>Fx2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fx2</em>' attribute.
	 * @see #getFx2()
	 * @generated
	 */
	void setFx2(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Fx3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Output level at 3* base frequency.
	 * 
	 * ##ouput3Harm##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fx3</em>' attribute.
	 * @see #setFx3(BigDecimal)
	 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getHarmonicDistortionPoint_Fx3()
	 * @model dataType="com.himsa.measurement.hearing.instrument.test.Fx3Type" required="true"
	 *        extendedMetaData="kind='element' name='Fx3' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getFx3();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.hearing.instrument.test.HarmonicDistortionPoint#getFx3 <em>Fx3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fx3</em>' attribute.
	 * @see #getFx3()
	 * @generated
	 */
	void setFx3(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Third HD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The calculated Third Harmonic Distortion based on the Output
	 * 1 and 3 levels.
	 * 
	 * ##thdPct##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Third HD</em>' attribute.
	 * @see #setThirdHD(BigDecimal)
	 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getHarmonicDistortionPoint_ThirdHD()
	 * @model dataType="com.himsa.measurement.hearing.instrument.test.ThirdHDType" required="true"
	 *        extendedMetaData="kind='element' name='ThirdHD' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getThirdHD();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.hearing.instrument.test.HarmonicDistortionPoint#getThirdHD <em>Third HD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Third HD</em>' attribute.
	 * @see #getThirdHD()
	 * @generated
	 */
	void setThirdHD(BigDecimal value);

} // HarmonicDistortionPoint
