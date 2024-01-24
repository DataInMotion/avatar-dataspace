/*
 */
package com.himsa.measurement.hearing.instrument.test;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Battery Current Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A complete curve containing a Battery Current measurement.
 * 
 * ##TBatMeas##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.BatteryCurrentMeasurement#getBatteryConditions <em>Battery Conditions</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.BatteryCurrentMeasurement#getBatteryCurve <em>Battery Curve</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getBatteryCurrentMeasurement()
 * @model extendedMetaData="name='BatteryCurrentMeasurement' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BatteryCurrentMeasurement extends EObject {
	/**
	 * Returns the value of the '<em><b>Battery Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measuring Conditions.
	 * 
	 * ##measCond##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Battery Conditions</em>' containment reference.
	 * @see #setBatteryConditions(BatteryMeasurementConditions)
	 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getBatteryCurrentMeasurement_BatteryConditions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BatteryConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	BatteryMeasurementConditions getBatteryConditions();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.hearing.instrument.test.BatteryCurrentMeasurement#getBatteryConditions <em>Battery Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery Conditions</em>' containment reference.
	 * @see #getBatteryConditions()
	 * @generated
	 */
	void setBatteryConditions(BatteryMeasurementConditions value);

	/**
	 * Returns the value of the '<em><b>Battery Curve</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.measurement.hearing.instrument.test.BatteryMeasurementPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * ##batCrv##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Battery Curve</em>' containment reference list.
	 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getBatteryCurrentMeasurement_BatteryCurve()
	 * @model containment="true" required="true" upper="169"
	 *        extendedMetaData="kind='element' name='BatteryCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BatteryMeasurementPoint> getBatteryCurve();

} // BatteryCurrentMeasurement
