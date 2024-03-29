/*
 */
package tinnitus;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Residual Inhibition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Tinnitus loudness suppression after exposure to a stimulus
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tinnitus.ResidualInhibitionType#getMeasurementConditions <em>Measurement Conditions</em>}</li>
 *   <li>{@link tinnitus.ResidualInhibitionType#getSignalIntensity <em>Signal Intensity</em>}</li>
 *   <li>{@link tinnitus.ResidualInhibitionType#getStimulusExposureTime <em>Stimulus Exposure Time</em>}</li>
 *   <li>{@link tinnitus.ResidualInhibitionType#getInhibitionTime <em>Inhibition Time</em>}</li>
 *   <li>{@link tinnitus.ResidualInhibitionType#getPulseDuration <em>Pulse Duration</em>}</li>
 *   <li>{@link tinnitus.ResidualInhibitionType#getGapDuration <em>Gap Duration</em>}</li>
 *   <li>{@link tinnitus.ResidualInhibitionType#getNumberOfCycles <em>Number Of Cycles</em>}</li>
 *   <li>{@link tinnitus.ResidualInhibitionType#getInhibitionSuccess <em>Inhibition Success</em>}</li>
 *   <li>{@link tinnitus.ResidualInhibitionType#getPerceptionLocation <em>Perception Location</em>}</li>
 * </ul>
 *
 * @see tinnitus.TinnitusPackage#getResidualInhibitionType()
 * @model extendedMetaData="name='ResidualInhibition_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ResidualInhibitionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measurement Conditions for the Residual Inhibition measurement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measurement Conditions</em>' containment reference.
	 * @see #setMeasurementConditions(MeasurementConditionsType)
	 * @see tinnitus.TinnitusPackage#getResidualInhibitionType_MeasurementConditions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MeasurementConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasurementConditionsType getMeasurementConditions();

	/**
	 * Sets the value of the '{@link tinnitus.ResidualInhibitionType#getMeasurementConditions <em>Measurement Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Conditions</em>' containment reference.
	 * @see #getMeasurementConditions()
	 * @generated
	 */
	void setMeasurementConditions(MeasurementConditionsType value);

	/**
	 * Returns the value of the '<em><b>Signal Intensity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Stimulus Signal Level and frequescy used for Residual Inhibition measurements. Here the Signal is used to mask the tinnitus. Optional masking can be applied to the other ear.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Intensity</em>' containment reference.
	 * @see #setSignalIntensity(MeasurementIntensityPointType)
	 * @see tinnitus.TinnitusPackage#getResidualInhibitionType_SignalIntensity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SignalIntensity' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasurementIntensityPointType getSignalIntensity();

	/**
	 * Sets the value of the '{@link tinnitus.ResidualInhibitionType#getSignalIntensity <em>Signal Intensity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Intensity</em>' containment reference.
	 * @see #getSignalIntensity()
	 * @generated
	 */
	void setSignalIntensity(MeasurementIntensityPointType value);

	/**
	 * Returns the value of the '<em><b>Stimulus Exposure Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time, in seconds, the patient is exposed to the stimulus signal
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Exposure Time</em>' attribute.
	 * @see #setStimulusExposureTime(BigDecimal)
	 * @see tinnitus.TinnitusPackage#getResidualInhibitionType_StimulusExposureTime()
	 * @model dataType="tinnitus.StimulusExposureTimeType"
	 *        extendedMetaData="kind='element' name='StimulusExposureTime' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getStimulusExposureTime();

	/**
	 * Sets the value of the '{@link tinnitus.ResidualInhibitionType#getStimulusExposureTime <em>Stimulus Exposure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Exposure Time</em>' attribute.
	 * @see #getStimulusExposureTime()
	 * @generated
	 */
	void setStimulusExposureTime(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Inhibition Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time, in seconds, the masking is effective after it has been turned off
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inhibition Time</em>' attribute.
	 * @see #setInhibitionTime(BigDecimal)
	 * @see tinnitus.TinnitusPackage#getResidualInhibitionType_InhibitionTime()
	 * @model dataType="tinnitus.InhibitionTimeType"
	 *        extendedMetaData="kind='element' name='InhibitionTime' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getInhibitionTime();

	/**
	 * Sets the value of the '{@link tinnitus.ResidualInhibitionType#getInhibitionTime <em>Inhibition Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inhibition Time</em>' attribute.
	 * @see #getInhibitionTime()
	 * @generated
	 */
	void setInhibitionTime(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Pulse Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Duration of acoustic signal when using pulsed stimuli in seconds. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pulse Duration</em>' attribute.
	 * @see #setPulseDuration(BigDecimal)
	 * @see tinnitus.TinnitusPackage#getResidualInhibitionType_PulseDuration()
	 * @model dataType="tinnitus.PulseDurationType"
	 *        extendedMetaData="kind='element' name='PulseDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getPulseDuration();

	/**
	 * Sets the value of the '{@link tinnitus.ResidualInhibitionType#getPulseDuration <em>Pulse Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pulse Duration</em>' attribute.
	 * @see #getPulseDuration()
	 * @generated
	 */
	void setPulseDuration(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Gap Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the silence interval between the acoustic pulses in seconds
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gap Duration</em>' attribute.
	 * @see #setGapDuration(BigDecimal)
	 * @see tinnitus.TinnitusPackage#getResidualInhibitionType_GapDuration()
	 * @model dataType="tinnitus.GapDurationType"
	 *        extendedMetaData="kind='element' name='GapDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getGapDuration();

	/**
	 * Sets the value of the '{@link tinnitus.ResidualInhibitionType#getGapDuration <em>Gap Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gap Duration</em>' attribute.
	 * @see #getGapDuration()
	 * @generated
	 */
	void setGapDuration(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Number Of Cycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time, in seconds, the masking is effective after it has been turned off
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Cycles</em>' attribute.
	 * @see #setNumberOfCycles(BigInteger)
	 * @see tinnitus.TinnitusPackage#getResidualInhibitionType_NumberOfCycles()
	 * @model dataType="tinnitus.NumberOfCyclesType"
	 *        extendedMetaData="kind='element' name='NumberOfCycles' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumberOfCycles();

	/**
	 * Sets the value of the '{@link tinnitus.ResidualInhibitionType#getNumberOfCycles <em>Number Of Cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Cycles</em>' attribute.
	 * @see #getNumberOfCycles()
	 * @generated
	 */
	void setNumberOfCycles(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Inhibition Success</b></em>' attribute.
	 * The literals are from the enumeration {@link tinnitus.TinnitusInhibitionSucessType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sucess of Inhibition when applying masking
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inhibition Success</em>' attribute.
	 * @see tinnitus.TinnitusInhibitionSucessType
	 * @see #isSetInhibitionSuccess()
	 * @see #unsetInhibitionSuccess()
	 * @see #setInhibitionSuccess(TinnitusInhibitionSucessType)
	 * @see tinnitus.TinnitusPackage#getResidualInhibitionType_InhibitionSuccess()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='InhibitionSuccess' namespace='##targetNamespace'"
	 * @generated
	 */
	TinnitusInhibitionSucessType getInhibitionSuccess();

	/**
	 * Sets the value of the '{@link tinnitus.ResidualInhibitionType#getInhibitionSuccess <em>Inhibition Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inhibition Success</em>' attribute.
	 * @see tinnitus.TinnitusInhibitionSucessType
	 * @see #isSetInhibitionSuccess()
	 * @see #unsetInhibitionSuccess()
	 * @see #getInhibitionSuccess()
	 * @generated
	 */
	void setInhibitionSuccess(TinnitusInhibitionSucessType value);

	/**
	 * Unsets the value of the '{@link tinnitus.ResidualInhibitionType#getInhibitionSuccess <em>Inhibition Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInhibitionSuccess()
	 * @see #getInhibitionSuccess()
	 * @see #setInhibitionSuccess(TinnitusInhibitionSucessType)
	 * @generated
	 */
	void unsetInhibitionSuccess();

	/**
	 * Returns whether the value of the '{@link tinnitus.ResidualInhibitionType#getInhibitionSuccess <em>Inhibition Success</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inhibition Success</em>' attribute is set.
	 * @see #unsetInhibitionSuccess()
	 * @see #getInhibitionSuccess()
	 * @see #setInhibitionSuccess(TinnitusInhibitionSucessType)
	 * @generated
	 */
	boolean isSetInhibitionSuccess();

	/**
	 * Returns the value of the '<em><b>Perception Location</b></em>' attribute.
	 * The literals are from the enumeration {@link tinnitus.TinnitusPerceptionLocationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The percieved location of tinnitus
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Perception Location</em>' attribute.
	 * @see tinnitus.TinnitusPerceptionLocationType
	 * @see #isSetPerceptionLocation()
	 * @see #unsetPerceptionLocation()
	 * @see #setPerceptionLocation(TinnitusPerceptionLocationType)
	 * @see tinnitus.TinnitusPackage#getResidualInhibitionType_PerceptionLocation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='PerceptionLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	TinnitusPerceptionLocationType getPerceptionLocation();

	/**
	 * Sets the value of the '{@link tinnitus.ResidualInhibitionType#getPerceptionLocation <em>Perception Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perception Location</em>' attribute.
	 * @see tinnitus.TinnitusPerceptionLocationType
	 * @see #isSetPerceptionLocation()
	 * @see #unsetPerceptionLocation()
	 * @see #getPerceptionLocation()
	 * @generated
	 */
	void setPerceptionLocation(TinnitusPerceptionLocationType value);

	/**
	 * Unsets the value of the '{@link tinnitus.ResidualInhibitionType#getPerceptionLocation <em>Perception Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPerceptionLocation()
	 * @see #getPerceptionLocation()
	 * @see #setPerceptionLocation(TinnitusPerceptionLocationType)
	 * @generated
	 */
	void unsetPerceptionLocation();

	/**
	 * Returns whether the value of the '{@link tinnitus.ResidualInhibitionType#getPerceptionLocation <em>Perception Location</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Perception Location</em>' attribute is set.
	 * @see #unsetPerceptionLocation()
	 * @see #getPerceptionLocation()
	 * @see #setPerceptionLocation(TinnitusPerceptionLocationType)
	 * @generated
	 */
	boolean isSetPerceptionLocation();

} // ResidualInhibitionType
