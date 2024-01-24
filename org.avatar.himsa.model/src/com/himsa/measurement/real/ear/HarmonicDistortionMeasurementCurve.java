/*
 */
package com.himsa.measurement.real.ear;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Harmonic Distortion Measurement Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A complete curve containing a Harmonic Distortion measurement.
 * The harmonic distortion is saved in this structure based on measurements of
 * the distortion level at 2 * base frequency and 3* base frequency. It is
 * calculated as the ratio of the total value of the harmonics and the base
 * frequency. Ref. [HOCA].
 * Harmonic Distortion measured in a 2CC coupler has long been an element
 * of ANSI standards of hearing aid performance. When measured in a Real
 * Ear the distortion level rises considerably, although it is not fully
 * understood why.
 * Ref. [Mueller].
 * 
 * ##TTHDDistMeas##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.real.ear.HarmonicDistortionMeasurementCurve#getMeasurementConditions <em>Measurement Conditions</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.HarmonicDistortionMeasurementCurve#getPoint <em>Point</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.real.ear.EarPackage#getHarmonicDistortionMeasurementCurve()
 * @model extendedMetaData="name='HarmonicDistortionMeasurementCurve' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface HarmonicDistortionMeasurementCurve extends EObject {
	/**
	 * Returns the value of the '<em><b>Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * REM Measurement Conditions.
	 * 
	 * ## TRHMeasCond ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measurement Conditions</em>' containment reference.
	 * @see #setMeasurementConditions(MeasurementConditions)
	 * @see com.himsa.measurement.real.ear.EarPackage#getHarmonicDistortionMeasurementCurve_MeasurementConditions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MeasurementConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasurementConditions getMeasurementConditions();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.real.ear.HarmonicDistortionMeasurementCurve#getMeasurementConditions <em>Measurement Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Conditions</em>' containment reference.
	 * @see #getMeasurementConditions()
	 * @generated
	 */
	void setMeasurementConditions(MeasurementConditions value);

	/**
	 * Returns the value of the '<em><b>Point</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.measurement.real.ear.HarmonicDistortionPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Curve of Intermodulation or Harmonic
	 * Distortion curve points: 
	 * 
	 * ##distCrv##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point</em>' containment reference list.
	 * @see com.himsa.measurement.real.ear.EarPackage#getHarmonicDistortionMeasurementCurve_Point()
	 * @model containment="true" required="true" upper="161"
	 *        extendedMetaData="kind='element' name='Point' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HarmonicDistortionPoint> getPoint();

} // HarmonicDistortionMeasurementCurve
