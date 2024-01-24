/*
 */
package com.himsa.measurement.audiogram._502;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tone Points Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Data point used to store curve points of tone audiograms
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram._502.TonePointsType#getStimulusFrequency <em>Stimulus Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.TonePointsType#getStimulusLevel <em>Stimulus Level</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.TonePointsType#getMaskingFrequency <em>Masking Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.TonePointsType#getMaskingLevel <em>Masking Level</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.TonePointsType#getTonePointStatus <em>Tone Point Status</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.TonePointsType#getAdditionalMaskingPoint <em>Additional Masking Point</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.audiogram._502._502Package#getTonePointsType()
 * @model extendedMetaData="name='TonePoints_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TonePointsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Stimulus Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Frequency of the stimulus channel in Hz
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Frequency</em>' attribute.
	 * @see #setStimulusFrequency(BigInteger)
	 * @see com.himsa.measurement.audiogram._502._502Package#getTonePointsType_StimulusFrequency()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='StimulusFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStimulusFrequency();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.TonePointsType#getStimulusFrequency <em>Stimulus Frequency</em>}' attribute.
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
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Level</em>' attribute.
	 * @see #setStimulusLevel(BigDecimal)
	 * @see com.himsa.measurement.audiogram._502._502Package#getTonePointsType_StimulusLevel()
	 * @model dataType="com.himsa.measurement.audiogram._502.StimulusLevelType6" required="true"
	 *        extendedMetaData="kind='element' name='StimulusLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getStimulusLevel();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.TonePointsType#getStimulusLevel <em>Stimulus Level</em>}' attribute.
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
	 * Frequency for masking channe in Hz. 
	 * 
	 * If masking has been used then it is assumed that this frequency is the same as the StimulusFrequency. However, If masking is to be recorded it is then necessary to save values for both MaskingFrequency and MaskingLevel.  The XSD was not able to be setup to enforce this rule due to legacy (format 200) design.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Frequency</em>' attribute.
	 * @see #setMaskingFrequency(BigInteger)
	 * @see com.himsa.measurement.audiogram._502._502Package#getTonePointsType_MaskingFrequency()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='MaskingFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMaskingFrequency();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.TonePointsType#getMaskingFrequency <em>Masking Frequency</em>}' attribute.
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
	 * Masking Level of the masking channel in dB.
	 * 
	 * If the MaskingLevel has been populated with data this means that the point as defined by the StimulusFrequency and StimulusLevel is masked.
	 * 
	 * If masking is to be recorded it is then necessary to save values for both MaskingFrequency and MaskingLevel.  The XSD was not able to be setup to enforce this rule due to legacy (format 200) design.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Level</em>' attribute.
	 * @see #setMaskingLevel(BigDecimal)
	 * @see com.himsa.measurement.audiogram._502._502Package#getTonePointsType_MaskingLevel()
	 * @model dataType="com.himsa.measurement.audiogram._502.MaskingLevelType5"
	 *        extendedMetaData="kind='element' name='MaskingLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getMaskingLevel();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.TonePointsType#getMaskingLevel <em>Masking Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking Level</em>' attribute.
	 * @see #getMaskingLevel()
	 * @generated
	 */
	void setMaskingLevel(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Tone Point Status</b></em>' attribute.
	 * The literals are from the enumeration {@link com.himsa.measurement.audiogram._502.PointStatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status of the point
	 * 
	 * See PointStatus_Type annotation notes for more information
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tone Point Status</em>' attribute.
	 * @see com.himsa.measurement.audiogram._502.PointStatusType
	 * @see #isSetTonePointStatus()
	 * @see #unsetTonePointStatus()
	 * @see #setTonePointStatus(PointStatusType)
	 * @see com.himsa.measurement.audiogram._502._502Package#getTonePointsType_TonePointStatus()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TonePointStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	PointStatusType getTonePointStatus();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.TonePointsType#getTonePointStatus <em>Tone Point Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tone Point Status</em>' attribute.
	 * @see com.himsa.measurement.audiogram._502.PointStatusType
	 * @see #isSetTonePointStatus()
	 * @see #unsetTonePointStatus()
	 * @see #getTonePointStatus()
	 * @generated
	 */
	void setTonePointStatus(PointStatusType value);

	/**
	 * Unsets the value of the '{@link com.himsa.measurement.audiogram._502.TonePointsType#getTonePointStatus <em>Tone Point Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTonePointStatus()
	 * @see #getTonePointStatus()
	 * @see #setTonePointStatus(PointStatusType)
	 * @generated
	 */
	void unsetTonePointStatus();

	/**
	 * Returns whether the value of the '{@link com.himsa.measurement.audiogram._502.TonePointsType#getTonePointStatus <em>Tone Point Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tone Point Status</em>' attribute is set.
	 * @see #unsetTonePointStatus()
	 * @see #getTonePointStatus()
	 * @see #setTonePointStatus(PointStatusType)
	 * @generated
	 */
	boolean isSetTonePointStatus();

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
	 * 
	 * +AdditionalStimulusLevel -> StimulusLevel
	 * +AdditionalMaskingLevel -> MaskingLevel
	 * +AdditionalMaskingPointStatus -> TonePointStatus
	 * 
	 * 
	 * Also noted - The new AdditionalStimulusLevel is added compared to 502.  It is added as the first element, normally a new element was be added as the last.  In this case it makes more sense to add it first and OK to do in the case that AdditionalMaskingPoint was in error for version 502. @@
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Masking Point</em>' containment reference.
	 * @see #setAdditionalMaskingPoint(AdditionalMaskingType)
	 * @see com.himsa.measurement.audiogram._502._502Package#getTonePointsType_AdditionalMaskingPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdditionalMaskingPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	AdditionalMaskingType getAdditionalMaskingPoint();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.TonePointsType#getAdditionalMaskingPoint <em>Additional Masking Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Masking Point</em>' containment reference.
	 * @see #getAdditionalMaskingPoint()
	 * @generated
	 */
	void setAdditionalMaskingPoint(AdditionalMaskingType value);

} // TonePointsType
