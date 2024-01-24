/*
 */
package com.himsa.measurement.audiogram._502;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Speech Score Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Data point for Speech Scores, used by all speech audiograms
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram._502.SpeechScorePointType#getStimulusLevel <em>Stimulus Level</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.SpeechScorePointType#getMaskingLevel <em>Masking Level</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.SpeechScorePointType#getScorePercent <em>Score Percent</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.SpeechScorePointType#getNumberOfWords <em>Number Of Words</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.SpeechScorePointType#getSpeechPointStatus <em>Speech Point Status</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.SpeechScorePointType#getAdditionalMaskingPoint <em>Additional Masking Point</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.audiogram._502._502Package#getSpeechScorePointType()
 * @model extendedMetaData="name='SpeechScorePoint_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SpeechScorePointType extends EObject {
	/**
	 * Returns the value of the '<em><b>Stimulus Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stimulus Level of the stimulus channel in dB
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Level</em>' attribute.
	 * @see #setStimulusLevel(BigDecimal)
	 * @see com.himsa.measurement.audiogram._502._502Package#getSpeechScorePointType_StimulusLevel()
	 * @model dataType="com.himsa.measurement.audiogram._502.StimulusLevelType5" required="true"
	 *        extendedMetaData="kind='element' name='StimulusLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getStimulusLevel();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.SpeechScorePointType#getStimulusLevel <em>Stimulus Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Level</em>' attribute.
	 * @see #getStimulusLevel()
	 * @generated
	 */
	void setStimulusLevel(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Masking Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Masking Level of the masking channel in dB
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Level</em>' attribute.
	 * @see #setMaskingLevel(BigDecimal)
	 * @see com.himsa.measurement.audiogram._502._502Package#getSpeechScorePointType_MaskingLevel()
	 * @model dataType="com.himsa.measurement.audiogram._502.MaskingLevelType3"
	 *        extendedMetaData="kind='element' name='MaskingLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getMaskingLevel();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.SpeechScorePointType#getMaskingLevel <em>Masking Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking Level</em>' attribute.
	 * @see #getMaskingLevel()
	 * @generated
	 */
	void setMaskingLevel(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Score Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of correct repeated phonemes (words, syllables…) in percent
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Score Percent</em>' attribute.
	 * @see #setScorePercent(BigDecimal)
	 * @see com.himsa.measurement.audiogram._502._502Package#getSpeechScorePointType_ScorePercent()
	 * @model dataType="com.himsa.measurement.audiogram._502.ScorePercentType" required="true"
	 *        extendedMetaData="kind='element' name='ScorePercent' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getScorePercent();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.SpeechScorePointType#getScorePercent <em>Score Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score Percent</em>' attribute.
	 * @see #getScorePercent()
	 * @generated
	 */
	void setScorePercent(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Number Of Words</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of correctly repeated phonemes (words, syllables…) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Words</em>' attribute.
	 * @see #setNumberOfWords(BigInteger)
	 * @see com.himsa.measurement.audiogram._502._502Package#getSpeechScorePointType_NumberOfWords()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='NumberOfWords' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumberOfWords();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.SpeechScorePointType#getNumberOfWords <em>Number Of Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Words</em>' attribute.
	 * @see #getNumberOfWords()
	 * @generated
	 */
	void setNumberOfWords(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Speech Point Status</b></em>' attribute.
	 * The literals are from the enumeration {@link com.himsa.measurement.audiogram._502.PointStatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status of the Point
	 * 
	 * @@ Convert Down Rule: Converting from 502->500. This element is not in format 500.  You will need to remove it when converting to format 500. @@
	 * 
	 * ++Convert Up Rule: 
	 * Converting from 500->502.
	 * This is a manditory element in format 502.  Use the value Unknown when converting up.++
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speech Point Status</em>' attribute.
	 * @see com.himsa.measurement.audiogram._502.PointStatusType
	 * @see #isSetSpeechPointStatus()
	 * @see #unsetSpeechPointStatus()
	 * @see #setSpeechPointStatus(PointStatusType)
	 * @see com.himsa.measurement.audiogram._502._502Package#getSpeechScorePointType_SpeechPointStatus()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='SpeechPointStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	PointStatusType getSpeechPointStatus();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.SpeechScorePointType#getSpeechPointStatus <em>Speech Point Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speech Point Status</em>' attribute.
	 * @see com.himsa.measurement.audiogram._502.PointStatusType
	 * @see #isSetSpeechPointStatus()
	 * @see #unsetSpeechPointStatus()
	 * @see #getSpeechPointStatus()
	 * @generated
	 */
	void setSpeechPointStatus(PointStatusType value);

	/**
	 * Unsets the value of the '{@link com.himsa.measurement.audiogram._502.SpeechScorePointType#getSpeechPointStatus <em>Speech Point Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpeechPointStatus()
	 * @see #getSpeechPointStatus()
	 * @see #setSpeechPointStatus(PointStatusType)
	 * @generated
	 */
	void unsetSpeechPointStatus();

	/**
	 * Returns whether the value of the '{@link com.himsa.measurement.audiogram._502.SpeechScorePointType#getSpeechPointStatus <em>Speech Point Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Speech Point Status</em>' attribute is set.
	 * @see #unsetSpeechPointStatus()
	 * @see #getSpeechPointStatus()
	 * @see #setSpeechPointStatus(PointStatusType)
	 * @generated
	 */
	boolean isSetSpeechPointStatus();

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
	 * AdditionalStimulusLevel -> StimulusLevel
	 * AdditionalMaskingLevel -> MaskingLevel
	 * AdditionalMaskingPointStatus -> SpeechPointStatus
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Masking Point</em>' containment reference.
	 * @see #setAdditionalMaskingPoint(AdditionalMaskingType)
	 * @see com.himsa.measurement.audiogram._502._502Package#getSpeechScorePointType_AdditionalMaskingPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdditionalMaskingPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	AdditionalMaskingType getAdditionalMaskingPoint();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.SpeechScorePointType#getAdditionalMaskingPoint <em>Additional Masking Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Masking Point</em>' containment reference.
	 * @see #getAdditionalMaskingPoint()
	 * @generated
	 */
	void setAdditionalMaskingPoint(AdditionalMaskingType value);

} // SpeechScorePointType
