/*
 */
package com.himsa.measurement.audiogram;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decay Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Data point for Decay sections
 * 
 * ## TDecayPoint ##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram.DecayPointType#getStimulusFrequency <em>Stimulus Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.DecayPointType#getStimulusLevel <em>Stimulus Level</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.DecayPointType#getMaskingFrequency <em>Masking Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.DecayPointType#getMaskingLevel <em>Masking Level</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.DecayPointType#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.DecayPointType#getEndTime <em>End Time</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.audiogram.AudiogramPackage#getDecayPointType()
 * @model extendedMetaData="name='DecayPoint_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DecayPointType extends EObject {
	/**
	 * Returns the value of the '<em><b>Stimulus Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Frequency of the stimulus channel in Hz.
	 * 
	 * ## freq1 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Frequency</em>' attribute.
	 * @see #setStimulusFrequency(BigInteger)
	 * @see com.himsa.measurement.audiogram.AudiogramPackage#getDecayPointType_StimulusFrequency()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='StimulusFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStimulusFrequency();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram.DecayPointType#getStimulusFrequency <em>Stimulus Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Frequency</em>' attribute.
	 * @see #getStimulusFrequency()
	 * @generated
	 */
	void setStimulusFrequency(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Stimulus Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stimulus Level of the stimulus channel in dB
	 * 
	 * ## intensity1 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Level</em>' attribute.
	 * @see #setStimulusLevel(BigDecimal)
	 * @see com.himsa.measurement.audiogram.AudiogramPackage#getDecayPointType_StimulusLevel()
	 * @model dataType="com.himsa.measurement.audiogram.StimulusLevelType" required="true"
	 *        extendedMetaData="kind='element' name='StimulusLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getStimulusLevel();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram.DecayPointType#getStimulusLevel <em>Stimulus Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Level</em>' attribute.
	 * @see #getStimulusLevel()
	 * @generated
	 */
	void setStimulusLevel(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Masking Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Frequency of the masking channel in Hz.
	 * 
	 * ## freq2##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Frequency</em>' attribute.
	 * @see #setMaskingFrequency(BigInteger)
	 * @see com.himsa.measurement.audiogram.AudiogramPackage#getDecayPointType_MaskingFrequency()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='MaskingFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMaskingFrequency();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram.DecayPointType#getMaskingFrequency <em>Masking Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking Frequency</em>' attribute.
	 * @see #getMaskingFrequency()
	 * @generated
	 */
	void setMaskingFrequency(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Masking Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Intensity Level of the masking channel in dB
	 * 
	 * ## intensity2 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Level</em>' attribute.
	 * @see #setMaskingLevel(BigDecimal)
	 * @see com.himsa.measurement.audiogram.AudiogramPackage#getDecayPointType_MaskingLevel()
	 * @model dataType="com.himsa.measurement.audiogram.MaskingLevelType2"
	 *        extendedMetaData="kind='element' name='MaskingLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getMaskingLevel();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram.DecayPointType#getMaskingLevel <em>Masking Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking Level</em>' attribute.
	 * @see #getMaskingLevel()
	 * @generated
	 */
	void setMaskingLevel(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start time for a Decay presentation
	 * 
	 * ## startTimeSec ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(BigDecimal)
	 * @see com.himsa.measurement.audiogram.AudiogramPackage#getDecayPointType_StartTime()
	 * @model dataType="com.himsa.measurement.audiogram.StartTimeType" required="true"
	 *        extendedMetaData="kind='element' name='StartTime' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getStartTime();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram.DecayPointType#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start and End time for a Decay presentation
	 * 
	 * ## endTimeSec ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(BigDecimal)
	 * @see com.himsa.measurement.audiogram.AudiogramPackage#getDecayPointType_EndTime()
	 * @model dataType="com.himsa.measurement.audiogram.EndTimeType" required="true"
	 *        extendedMetaData="kind='element' name='EndTime' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getEndTime();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram.DecayPointType#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(BigDecimal value);

} // DecayPointType
