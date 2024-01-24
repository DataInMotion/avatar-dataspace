/*
 */
package com.himsa.measurement.real.ear;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Ear Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.real.ear.RealEarDataType#getTargets <em>Targets</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.RealEarDataType#getRealEarUnaidedResponse <em>Real Ear Unaided Response</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.RealEarDataType#getRealEarOccludedResponse <em>Real Ear Occluded Response</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.RealEarDataType#getRealEarInsertionResponse <em>Real Ear Insertion Response</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.RealEarDataType#getRealEarAidedResponse <em>Real Ear Aided Response</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.RealEarDataType#getInputOutputMeasurement <em>Input Output Measurement</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.RealEarDataType#getTotalHarmonicDistortionMeasurement <em>Total Harmonic Distortion Measurement</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.RealEarDataType#getOcclusionMeasurement <em>Occlusion Measurement</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.RealEarDataType#getRealEarCoupler <em>Real Ear Coupler</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.real.ear.EarPackage#getRealEarDataType()
 * @model extendedMetaData="name='RealEarData_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RealEarDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Targets</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.measurement.real.ear.FullTargetCurve}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## targets ##
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Targets</em>' containment reference list.
	 * @see com.himsa.measurement.real.ear.EarPackage#getRealEarDataType_Targets()
	 * @model containment="true" upper="3"
	 *        extendedMetaData="kind='element' name='Targets' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FullTargetCurve> getTargets();

	/**
	 * Returns the value of the '<em><b>Real Ear Unaided Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Real Ear Unaided Response is the Sound Pressure Level, as a function of frequency, at a specified point in the unoccluded ear canal for a specified sound field. This can be expressed in SPL or as gain in decibels relative to the stimulus level. 
	 * 
	 * ##rEUR##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Real Ear Unaided Response</em>' containment reference.
	 * @see #setRealEarUnaidedResponse(FrequencyMeasurement)
	 * @see com.himsa.measurement.real.ear.EarPackage#getRealEarDataType_RealEarUnaidedResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RealEarUnaidedResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	FrequencyMeasurement getRealEarUnaidedResponse();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.real.ear.RealEarDataType#getRealEarUnaidedResponse <em>Real Ear Unaided Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real Ear Unaided Response</em>' containment reference.
	 * @see #getRealEarUnaidedResponse()
	 * @generated
	 */
	void setRealEarUnaidedResponse(FrequencyMeasurement value);

	/**
	 * Returns the value of the '<em><b>Real Ear Occluded Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Real Ear Occluded Response is the Sound Pressure Level, as a function of Frequency, at a specified point in the ear canal for a specified sound field, with the hearing aid in place and turned off. This can be expressed either in SPL or as gain in decibels relative to the stimulus level. 
	 * 
	 * ##rEOR##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Real Ear Occluded Response</em>' containment reference.
	 * @see #setRealEarOccludedResponse(FrequencyMeasurement)
	 * @see com.himsa.measurement.real.ear.EarPackage#getRealEarDataType_RealEarOccludedResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RealEarOccludedResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	FrequencyMeasurement getRealEarOccludedResponse();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.real.ear.RealEarDataType#getRealEarOccludedResponse <em>Real Ear Occluded Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real Ear Occluded Response</em>' containment reference.
	 * @see #getRealEarOccludedResponse()
	 * @generated
	 */
	void setRealEarOccludedResponse(FrequencyMeasurement value);

	/**
	 * Returns the value of the '<em><b>Real Ear Insertion Response</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.measurement.real.ear.FrequencyMeasurement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Real Ear Insertion Response is the mathematical difference between the REUR (Unaided Response) and the REAR (Aided Response): REIR = REAR - REUR. Ref. [Mueller]. The formula applies for measurement = meas_InsertGain_C (Insertion Response: REIR compensated for REUR )
	 * The REIR curve may be used as both compensated and uncompensated (for REUR) identified by the value of the RHMeasCond component measurement. The REIR curve may also be used as a gain curve by setting the input part to zero and storing the gain in the output part. If uncompensated, REIR becomes equal to REAR.
	 * 
	 * ##rEIR##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Real Ear Insertion Response</em>' containment reference list.
	 * @see com.himsa.measurement.real.ear.EarPackage#getRealEarDataType_RealEarInsertionResponse()
	 * @model containment="true" upper="5"
	 *        extendedMetaData="kind='element' name='RealEarInsertionResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FrequencyMeasurement> getRealEarInsertionResponse();

	/**
	 * Returns the value of the '<em><b>Real Ear Aided Response</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.measurement.real.ear.FrequencyMeasurement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Real Ear Aided Response (REAR) is the Sound Pressure Level, as a function of frequency, at a specified measurement point in the ear canal for a specified sound field with the hearing aid in place and turned on. This can be expressed either in SPL or as gain in decibels relative to the stimulus level. 
	 * 
	 * If the Input element is populated with -32767 this means that the test is to be considered MPO
	 * 
	 * ##rEAR##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Real Ear Aided Response</em>' containment reference list.
	 * @see com.himsa.measurement.real.ear.EarPackage#getRealEarDataType_RealEarAidedResponse()
	 * @model containment="true" upper="5"
	 *        extendedMetaData="kind='element' name='RealEarAidedResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FrequencyMeasurement> getRealEarAidedResponse();

	/**
	 * Returns the value of the '<em><b>Input Output Measurement</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.measurement.real.ear.InputOutputMeasurement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Input / Output Measurement
	 * 
	 * ##iOMeas##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Output Measurement</em>' containment reference list.
	 * @see com.himsa.measurement.real.ear.EarPackage#getRealEarDataType_InputOutputMeasurement()
	 * @model containment="true" upper="5"
	 *        extendedMetaData="kind='element' name='InputOutputMeasurement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InputOutputMeasurement> getInputOutputMeasurement();

	/**
	 * Returns the value of the '<em><b>Total Harmonic Distortion Measurement</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.measurement.real.ear.HarmonicDistortionMeasurementCurve}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Harmonic Distortion form the hearing instrument.
	 * 
	 * ##hrmDistortion##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Harmonic Distortion Measurement</em>' containment reference list.
	 * @see com.himsa.measurement.real.ear.EarPackage#getRealEarDataType_TotalHarmonicDistortionMeasurement()
	 * @model containment="true" upper="3"
	 *        extendedMetaData="kind='element' name='TotalHarmonicDistortionMeasurement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HarmonicDistortionMeasurementCurve> getTotalHarmonicDistortionMeasurement();

	/**
	 * Returns the value of the '<em><b>Occlusion Measurement</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.measurement.real.ear.OcclusionEffects}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A measurement of occulusion effects, the effect of closing one or two ear canals caused by hearing instruments, headphones, earmolds, etc.
	 * 
	 * ##occlusion##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occlusion Measurement</em>' containment reference list.
	 * @see com.himsa.measurement.real.ear.EarPackage#getRealEarDataType_OcclusionMeasurement()
	 * @model containment="true" upper="3"
	 *        extendedMetaData="kind='element' name='OcclusionMeasurement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OcclusionEffects> getOcclusionMeasurement();

	/**
	 * Returns the value of the '<em><b>Real Ear Coupler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Real Ear to Coupler Difference measurement.
	 * 
	 * Real Ear to Coupler gain.
	 * 
	 * ##reCoupler##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Real Ear Coupler</em>' containment reference.
	 * @see #setRealEarCoupler(RealEarCouplerDifference)
	 * @see com.himsa.measurement.real.ear.EarPackage#getRealEarDataType_RealEarCoupler()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RealEarCoupler' namespace='##targetNamespace'"
	 * @generated
	 */
	RealEarCouplerDifference getRealEarCoupler();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.real.ear.RealEarDataType#getRealEarCoupler <em>Real Ear Coupler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real Ear Coupler</em>' containment reference.
	 * @see #getRealEarCoupler()
	 * @generated
	 */
	void setRealEarCoupler(RealEarCouplerDifference value);

} // RealEarDataType
