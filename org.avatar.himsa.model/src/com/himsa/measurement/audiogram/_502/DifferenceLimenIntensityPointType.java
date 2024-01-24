/*
 */
package com.himsa.measurement.audiogram._502;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Difference Limen Intensity Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Data point for Difference Limen Intensity (DLI) thresholds
 * 
 * The difference limen (DL) will be saved for the frequency in question in the variable
 * modSize.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram._502.DifferenceLimenIntensityPointType#getStimulusFrequency <em>Stimulus Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.DifferenceLimenIntensityPointType#getStimulusLevel <em>Stimulus Level</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.DifferenceLimenIntensityPointType#getMaskingFrequency <em>Masking Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.DifferenceLimenIntensityPointType#getMaskingLevel <em>Masking Level</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.DifferenceLimenIntensityPointType#getModulationSize <em>Modulation Size</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.DifferenceLimenIntensityPointType#getDifferenceLimenIntensityPointStatus <em>Difference Limen Intensity Point Status</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.DifferenceLimenIntensityPointType#getAdditionalMaskingPoint <em>Additional Masking Point</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.audiogram._502._502Package#getDifferenceLimenIntensityPointType()
 * @model extendedMetaData="name='DifferenceLimenIntensityPoint_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DifferenceLimenIntensityPointType extends EObject {
	/**
	 * Returns the value of the '<em><b>Stimulus Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Frequency of the stimulus channel in Hz.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Frequency</em>' attribute.
	 * @see #setStimulusFrequency(BigInteger)
	 * @see com.himsa.measurement.audiogram._502._502Package#getDifferenceLimenIntensityPointType_StimulusFrequency()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='StimulusFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStimulusFrequency();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.DifferenceLimenIntensityPointType#getStimulusFrequency <em>Stimulus Frequency</em>}' attribute.
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
	 * @see com.himsa.measurement.audiogram._502._502Package#getDifferenceLimenIntensityPointType_StimulusLevel()
	 * @model dataType="com.himsa.measurement.audiogram._502.StimulusLevelType4" required="true"
	 *        extendedMetaData="kind='element' name='StimulusLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getStimulusLevel();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.DifferenceLimenIntensityPointType#getStimulusLevel <em>Stimulus Level</em>}' attribute.
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
	 * Frequency of the masking channel in Hz
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Frequency</em>' attribute.
	 * @see #setMaskingFrequency(BigInteger)
	 * @see com.himsa.measurement.audiogram._502._502Package#getDifferenceLimenIntensityPointType_MaskingFrequency()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='MaskingFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMaskingFrequency();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.DifferenceLimenIntensityPointType#getMaskingFrequency <em>Masking Frequency</em>}' attribute.
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
	 * Masking Level of the masking channel in dB
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Level</em>' attribute.
	 * @see #setMaskingLevel(BigDecimal)
	 * @see com.himsa.measurement.audiogram._502._502Package#getDifferenceLimenIntensityPointType_MaskingLevel()
	 * @model dataType="com.himsa.measurement.audiogram._502.MaskingLevelType"
	 *        extendedMetaData="kind='element' name='MaskingLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getMaskingLevel();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.DifferenceLimenIntensityPointType#getMaskingLevel <em>Masking Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking Level</em>' attribute.
	 * @see #getMaskingLevel()
	 * @generated
	 */
	void setMaskingLevel(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Modulation Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Modulation Size. The observed Difference Limen Threshold measured in dB.  This value represents the lowest detectable difference in Sound Pressure Level.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modulation Size</em>' attribute.
	 * @see #setModulationSize(BigDecimal)
	 * @see com.himsa.measurement.audiogram._502._502Package#getDifferenceLimenIntensityPointType_ModulationSize()
	 * @model dataType="com.himsa.measurement.audiogram._502.ModulationSizeType2" required="true"
	 *        extendedMetaData="kind='element' name='ModulationSize' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getModulationSize();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.DifferenceLimenIntensityPointType#getModulationSize <em>Modulation Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modulation Size</em>' attribute.
	 * @see #getModulationSize()
	 * @generated
	 */
	void setModulationSize(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Difference Limen Intensity Point Status</b></em>' attribute.
	 * The literals are from the enumeration {@link com.himsa.measurement.audiogram._502.PointStatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status of the point
	 * 
	 * See PointStatus_Type annotations for more details
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Difference Limen Intensity Point Status</em>' attribute.
	 * @see com.himsa.measurement.audiogram._502.PointStatusType
	 * @see #isSetDifferenceLimenIntensityPointStatus()
	 * @see #unsetDifferenceLimenIntensityPointStatus()
	 * @see #setDifferenceLimenIntensityPointStatus(PointStatusType)
	 * @see com.himsa.measurement.audiogram._502._502Package#getDifferenceLimenIntensityPointType_DifferenceLimenIntensityPointStatus()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='DifferenceLimenIntensityPointStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	PointStatusType getDifferenceLimenIntensityPointStatus();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.DifferenceLimenIntensityPointType#getDifferenceLimenIntensityPointStatus <em>Difference Limen Intensity Point Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Difference Limen Intensity Point Status</em>' attribute.
	 * @see com.himsa.measurement.audiogram._502.PointStatusType
	 * @see #isSetDifferenceLimenIntensityPointStatus()
	 * @see #unsetDifferenceLimenIntensityPointStatus()
	 * @see #getDifferenceLimenIntensityPointStatus()
	 * @generated
	 */
	void setDifferenceLimenIntensityPointStatus(PointStatusType value);

	/**
	 * Unsets the value of the '{@link com.himsa.measurement.audiogram._502.DifferenceLimenIntensityPointType#getDifferenceLimenIntensityPointStatus <em>Difference Limen Intensity Point Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDifferenceLimenIntensityPointStatus()
	 * @see #getDifferenceLimenIntensityPointStatus()
	 * @see #setDifferenceLimenIntensityPointStatus(PointStatusType)
	 * @generated
	 */
	void unsetDifferenceLimenIntensityPointStatus();

	/**
	 * Returns whether the value of the '{@link com.himsa.measurement.audiogram._502.DifferenceLimenIntensityPointType#getDifferenceLimenIntensityPointStatus <em>Difference Limen Intensity Point Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Difference Limen Intensity Point Status</em>' attribute is set.
	 * @see #unsetDifferenceLimenIntensityPointStatus()
	 * @see #getDifferenceLimenIntensityPointStatus()
	 * @see #setDifferenceLimenIntensityPointStatus(PointStatusType)
	 * @generated
	 */
	boolean isSetDifferenceLimenIntensityPointStatus();

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
	 * AdditionalMaskingPointStatus -> DifferenceLimenIntensityPointStatus
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Masking Point</em>' containment reference.
	 * @see #setAdditionalMaskingPoint(AdditionalMaskingType)
	 * @see com.himsa.measurement.audiogram._502._502Package#getDifferenceLimenIntensityPointType_AdditionalMaskingPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdditionalMaskingPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	AdditionalMaskingType getAdditionalMaskingPoint();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.DifferenceLimenIntensityPointType#getAdditionalMaskingPoint <em>Additional Masking Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Masking Point</em>' containment reference.
	 * @see #getAdditionalMaskingPoint()
	 * @generated
	 */
	void setAdditionalMaskingPoint(AdditionalMaskingType value);

} // DifferenceLimenIntensityPointType
