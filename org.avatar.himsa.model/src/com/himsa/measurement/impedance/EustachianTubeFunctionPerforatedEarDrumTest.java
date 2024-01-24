/*
 */
package com.himsa.measurement.impedance;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eustachian Tube Function Perforated Ear Drum Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Eustachian Tube Function for Perforated ear drum
 * 
 * ## TEtfPerfTest ##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.impedance.EustachianTubeFunctionPerforatedEarDrumTest#getPressurePoint <em>Pressure Point</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.EustachianTubeFunctionPerforatedEarDrumTest#getOpenPoint <em>Open Point</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.EustachianTubeFunctionPerforatedEarDrumTest#getClosePoint <em>Close Point</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.EustachianTubeFunctionPerforatedEarDrumTest#getTimeBase <em>Time Base</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.impedance.ImpedancePackage#getEustachianTubeFunctionPerforatedEarDrumTest()
 * @model extendedMetaData="name='EustachianTubeFunctionPerforatedEarDrumTest' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EustachianTubeFunctionPerforatedEarDrumTest extends EObject {
	/**
	 * Returns the value of the '<em><b>Pressure Point</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.measurement.impedance.PressurePointType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measurement points
	 * 
	 * ## pressurePoint ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pressure Point</em>' containment reference list.
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getEustachianTubeFunctionPerforatedEarDrumTest_PressurePoint()
	 * @model containment="true" required="true" upper="200"
	 *        extendedMetaData="kind='element' name='PressurePoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PressurePointType> getPressurePoint();

	/**
	 * Returns the value of the '<em><b>Open Point</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eustachian Tube Open Pressure Point deka Pascal
	 * 
	 * ## openPoint ##
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Open Point</em>' attribute list.
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getEustachianTubeFunctionPerforatedEarDrumTest_OpenPoint()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Integer" upper="3"
	 *        extendedMetaData="kind='element' name='OpenPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BigInteger> getOpenPoint();

	/**
	 * Returns the value of the '<em><b>Close Point</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eustachian Tube Close Pressure Point deka Pascal
	 * 
	 * ## closePoint ##
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Close Point</em>' attribute list.
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getEustachianTubeFunctionPerforatedEarDrumTest_ClosePoint()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Integer" upper="3"
	 *        extendedMetaData="kind='element' name='ClosePoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BigInteger> getClosePoint();

	/**
	 * Returns the value of the '<em><b>Time Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time that it took the test
	 * 
	 * Please note that this element will not be converted down to format 100 if requested by another Noah compatible software program.  This is due to the fact that two different versions of format 100 Impedance exist and the safest action is to not pass this element back to a module wishing to read in format 100.  Additionally, another software program reading this test should not find this data missing as critical.
	 * 
	 * ## timeBase ##
	 * 
	 * @@ When converting from format 500 down to format 100 do not include this element if present @@
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Base</em>' attribute.
	 * @see #setTimeBase(BigDecimal)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getEustachianTubeFunctionPerforatedEarDrumTest_TimeBase()
	 * @model dataType="com.himsa.measurement.impedance.TimeBaseType"
	 *        extendedMetaData="kind='element' name='TimeBase' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTimeBase();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.EustachianTubeFunctionPerforatedEarDrumTest#getTimeBase <em>Time Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Base</em>' attribute.
	 * @see #getTimeBase()
	 * @generated
	 */
	void setTimeBase(BigDecimal value);

} // EustachianTubeFunctionPerforatedEarDrumTest
