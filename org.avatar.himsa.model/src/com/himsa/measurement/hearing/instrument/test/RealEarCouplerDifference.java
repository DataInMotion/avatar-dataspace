/*
 */
package com.himsa.measurement.hearing.instrument.test;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Ear Coupler Difference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Real Ear to Coupler Difference measurement yields the
 * gain (output minus input), where the result gives the difference
 * between a measurement in a coupler and a measurement in the
 * Client's ear. As both parts of this measurement are performed
 * with the same measurement conditions, the curve can be used in
 * a manner with the input part holding the coupler SPL output
 * curve, and the output part holding the Real ear SPL output
 * curve. This will yield the correct gain value.
 * 
 * ##TRECMeas##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.RealEarCouplerDifference#getMeasurementConditions <em>Measurement Conditions</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.RealEarCouplerDifference#getRECD <em>RECD</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getRealEarCouplerDifference()
 * @model extendedMetaData="name='RealEarCouplerDifference' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RealEarCouplerDifference extends EObject {
	/**
	 * Returns the value of the '<em><b>Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HIT Measurement Conditions.
	 * 
	 * ##TRHMeasCond
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measurement Conditions</em>' containment reference.
	 * @see #setMeasurementConditions(MeasurementConditions)
	 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getRealEarCouplerDifference_MeasurementConditions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MeasurementConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasurementConditions getMeasurementConditions();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.hearing.instrument.test.RealEarCouplerDifference#getMeasurementConditions <em>Measurement Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Conditions</em>' containment reference.
	 * @see #getMeasurementConditions()
	 * @generated
	 */
	void setMeasurementConditions(MeasurementConditions value);

	/**
	 * Returns the value of the '<em><b>RECD</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.measurement.hearing.instrument.test.FrequencyMeasurementPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Real Ear to Coupler Difference measurement 
	 * 
	 * As input and output are performed with the same measurement conditions, the curve can be used in a manner where the input element is holding the coupler SPL output curve, and the output element is holding the Real Ear SPL output curve. This will yield the correct gain value, where the result gives the difference between a measurement in a coupler and a measurement in the Patient’s ear.
	 * 
	 * This curve is to be read as gain (output - input).
	 * 
	 * 
	 * ##RECDCrv##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RECD</em>' containment reference list.
	 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getRealEarCouplerDifference_RECD()
	 * @model containment="true" required="true" upper="169"
	 *        extendedMetaData="kind='element' name='RECD' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FrequencyMeasurementPoint> getRECD();

} // RealEarCouplerDifference
