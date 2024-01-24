/*
 */
package test;

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
 *   <li>{@link test.HarmonicDistortionMeasurementCurve#getMeasurementConditions <em>Measurement Conditions</em>}</li>
 *   <li>{@link test.HarmonicDistortionMeasurementCurve#getPoint <em>Point</em>}</li>
 * </ul>
 *
 * @see test.TestPackage#getHarmonicDistortionMeasurementCurve()
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
	 * HIT Measurement Conditions.
	 * 
	 * ## TRHMeasCond ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measurement Conditions</em>' containment reference.
	 * @see #setMeasurementConditions(MeasurementConditions)
	 * @see test.TestPackage#getHarmonicDistortionMeasurementCurve_MeasurementConditions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MeasurementConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasurementConditions getMeasurementConditions();

	/**
	 * Sets the value of the '{@link test.HarmonicDistortionMeasurementCurve#getMeasurementConditions <em>Measurement Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Conditions</em>' containment reference.
	 * @see #getMeasurementConditions()
	 * @generated
	 */
	void setMeasurementConditions(MeasurementConditions value);

	/**
	 * Returns the value of the '<em><b>Point</b></em>' containment reference list.
	 * The list contents are of type {@link test.HarmonicDistortionPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Curve of Intermodulation or Harmonic
	 * Distortion curve points: 
	 * 
	 * ##distCrv##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point</em>' containment reference list.
	 * @see test.TestPackage#getHarmonicDistortionMeasurementCurve_Point()
	 * @model containment="true" required="true" upper="161"
	 *        extendedMetaData="kind='element' name='Point' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HarmonicDistortionPoint> getPoint();

} // HarmonicDistortionMeasurementCurve
