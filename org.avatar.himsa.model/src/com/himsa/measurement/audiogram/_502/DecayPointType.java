/*
 */
package com.himsa.measurement.audiogram._502;

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
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram._502.DecayPointType#getStimulusFrequency <em>Stimulus Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.DecayPointType#getStimulusLevel <em>Stimulus Level</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.DecayPointType#getMaskingFrequency <em>Masking Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.DecayPointType#getMaskingLevel <em>Masking Level</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.DecayPointType#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.DecayPointType#getEndTime <em>End Time</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.DecayPointType#getAdditionalMaskingPoint <em>Additional Masking Point</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.audiogram._502._502Package#getDecayPointType()
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
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Frequency</em>' attribute.
	 * @see #setStimulusFrequency(BigInteger)
	 * @see com.himsa.measurement.audiogram._502._502Package#getDecayPointType_StimulusFrequency()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='StimulusFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStimulusFrequency();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.DecayPointType#getStimulusFrequency <em>Stimulus Frequency</em>}' attribute.
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
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Level</em>' attribute.
	 * @see #setStimulusLevel(BigDecimal)
	 * @see com.himsa.measurement.audiogram._502._502Package#getDecayPointType_StimulusLevel()
	 * @model dataType="com.himsa.measurement.audiogram._502.StimulusLevelType3" required="true"
	 *        extendedMetaData="kind='element' name='StimulusLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getStimulusLevel();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.DecayPointType#getStimulusLevel <em>Stimulus Level</em>}' attribute.
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
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Frequency</em>' attribute.
	 * @see #setMaskingFrequency(BigInteger)
	 * @see com.himsa.measurement.audiogram._502._502Package#getDecayPointType_MaskingFrequency()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='MaskingFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMaskingFrequency();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.DecayPointType#getMaskingFrequency <em>Masking Frequency</em>}' attribute.
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
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Level</em>' attribute.
	 * @see #setMaskingLevel(BigDecimal)
	 * @see com.himsa.measurement.audiogram._502._502Package#getDecayPointType_MaskingLevel()
	 * @model dataType="com.himsa.measurement.audiogram._502.MaskingLevelType1"
	 *        extendedMetaData="kind='element' name='MaskingLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getMaskingLevel();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.DecayPointType#getMaskingLevel <em>Masking Level</em>}' attribute.
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
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(BigDecimal)
	 * @see com.himsa.measurement.audiogram._502._502Package#getDecayPointType_StartTime()
	 * @model dataType="com.himsa.measurement.audiogram._502.StartTimeType" required="true"
	 *        extendedMetaData="kind='element' name='StartTime' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getStartTime();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.DecayPointType#getStartTime <em>Start Time</em>}' attribute.
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
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(BigDecimal)
	 * @see com.himsa.measurement.audiogram._502._502Package#getDecayPointType_EndTime()
	 * @model dataType="com.himsa.measurement.audiogram._502.EndTimeType" required="true"
	 *        extendedMetaData="kind='element' name='EndTime' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getEndTime();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.DecayPointType#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Additional Masking Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a new element added in version 502.  Previously it was not possible/realistic to save 2 points, one being masked and the other unmasked.  When recording a pure tone audiogram, the classic (manual) method of recording allows not masked and masked values for the same measurement to be recorded. For example, if a large asymmetry, re-test the poorer ear with masking, end up with a set of not masked and a set of masked results for the same ear. From a hearing aid fitting perspective all that is needed is the “true” thresholds but clinically having sight of the two sets of values is significant.
	 * 
	 * Moving forward it is now possible to store both a masked and unmasked point.  If the software storing the audiogram wishes to support this use case then it must use this element to define the masked point.
	 * 
	 * @@ 502 to 500 down convert rules: If masking data is present in this structure then copy the entire child structure up one level.  This means that the masking data will overwrite the related elements.  This is preferred as the masked data is considered better data for other programs such as fitting modules to use.
	 * AdditionalStimulusLevel –> enter the StimulusFrequency value
	 * AdditionalMaskingLevel -> MaskingLevel
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Masking Point</em>' containment reference.
	 * @see #setAdditionalMaskingPoint(AdditionalMasking2Type)
	 * @see com.himsa.measurement.audiogram._502._502Package#getDecayPointType_AdditionalMaskingPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdditionalMaskingPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	AdditionalMasking2Type getAdditionalMaskingPoint();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.DecayPointType#getAdditionalMaskingPoint <em>Additional Masking Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Masking Point</em>' containment reference.
	 * @see #getAdditionalMaskingPoint()
	 * @generated
	 */
	void setAdditionalMaskingPoint(AdditionalMasking2Type value);

} // DecayPointType
