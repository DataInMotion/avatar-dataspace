/*
 */
package com.himsa.measurement.hearing.instrument.test;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Occlusion Effects</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Occlusion Effects, comparison between the response of the unoccluded
 * ear with the response of the occluded ear.
 * 
 * ##TOcclMeas##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.OcclusionEffects#getMeasurementConditions <em>Measurement Conditions</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.OcclusionEffects#getREUR <em>REUR</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.OcclusionEffects#getREOR <em>REOR</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getOcclusionEffects()
 * @model extendedMetaData="name='OcclusionEffects' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface OcclusionEffects extends EObject {
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
	 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getOcclusionEffects_MeasurementConditions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MeasurementConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasurementConditions getMeasurementConditions();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.hearing.instrument.test.OcclusionEffects#getMeasurementConditions <em>Measurement Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Conditions</em>' containment reference.
	 * @see #getMeasurementConditions()
	 * @generated
	 */
	void setMeasurementConditions(MeasurementConditions value);

	/**
	 * Returns the value of the '<em><b>REUR</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.measurement.hearing.instrument.test.FrequencyMeasurementPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The response of the unoccluded ear, no compensation in input or output.
	 * 
	 * ##OpenEarCrv##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>REUR</em>' containment reference list.
	 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getOcclusionEffects_REUR()
	 * @model containment="true" required="true" upper="169"
	 *        extendedMetaData="kind='element' name='REUR' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FrequencyMeasurementPoint> getREUR();

	/**
	 * Returns the value of the '<em><b>REOR</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.measurement.hearing.instrument.test.FrequencyMeasurementPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The response of the occluded ear, no compensation in input or output.
	 * 
	 * ##OccEarCrv##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>REOR</em>' containment reference list.
	 * @see com.himsa.measurement.hearing.instrument.test.TestPackage#getOcclusionEffects_REOR()
	 * @model containment="true" required="true" upper="169"
	 *        extendedMetaData="kind='element' name='REOR' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FrequencyMeasurementPoint> getREOR();

} // OcclusionEffects
