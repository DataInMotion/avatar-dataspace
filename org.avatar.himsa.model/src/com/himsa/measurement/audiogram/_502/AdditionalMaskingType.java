/*
 */
package com.himsa.measurement.audiogram._502;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additional Masking Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram._502.AdditionalMaskingType#getAdditionalStimulusLevel <em>Additional Stimulus Level</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.AdditionalMaskingType#getAdditionalMaskingLevel <em>Additional Masking Level</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.AdditionalMaskingType#getAdditionalMaskingPointStatus <em>Additional Masking Point Status</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.audiogram._502._502Package#getAdditionalMaskingType()
 * @model extendedMetaData="name='AdditionalMasking_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AdditionalMaskingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Additional Stimulus Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stimulus Level of the stimulus channel in dB
	 * 
	 * An additional frequency is not defined as it must be the same as StimulusFrequency
	 * 
	 * @@ 
	 * AdditionalStimulusLevel -> StimulusLevel
	 * @@
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Stimulus Level</em>' attribute.
	 * @see #setAdditionalStimulusLevel(BigDecimal)
	 * @see com.himsa.measurement.audiogram._502._502Package#getAdditionalMaskingType_AdditionalStimulusLevel()
	 * @model dataType="com.himsa.measurement.audiogram._502.AdditionalStimulusLevelType1" required="true"
	 *        extendedMetaData="kind='element' name='AdditionalStimulusLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getAdditionalStimulusLevel();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.AdditionalMaskingType#getAdditionalStimulusLevel <em>Additional Stimulus Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Stimulus Level</em>' attribute.
	 * @see #getAdditionalStimulusLevel()
	 * @generated
	 */
	void setAdditionalStimulusLevel(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Additional Masking Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Masking Level of the masking channel in dB.
	 * 
	 * An additional frequency is not defined as it must be the same as StimulusFrequency
	 * 
	 * @@ 
	 * AdditionalMaskingLevel -> MaskingLevel
	 * @@
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Masking Level</em>' attribute.
	 * @see #setAdditionalMaskingLevel(BigDecimal)
	 * @see com.himsa.measurement.audiogram._502._502Package#getAdditionalMaskingType_AdditionalMaskingLevel()
	 * @model dataType="com.himsa.measurement.audiogram._502.AdditionalMaskingLevelType1" required="true"
	 *        extendedMetaData="kind='element' name='AdditionalMaskingLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getAdditionalMaskingLevel();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.AdditionalMaskingType#getAdditionalMaskingLevel <em>Additional Masking Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Masking Level</em>' attribute.
	 * @see #getAdditionalMaskingLevel()
	 * @generated
	 */
	void setAdditionalMaskingLevel(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Additional Masking Point Status</b></em>' attribute.
	 * The literals are from the enumeration {@link com.himsa.measurement.audiogram._502.PointStatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status of the point
	 * 
	 * See PointStatus_Type annotation notes for more information
	 * 
	 * @@ 
	 * AdditionalMaskingPointStatus -> SpeechPointStatus or TonePointStatus
	 * 
	 * @@
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Masking Point Status</em>' attribute.
	 * @see com.himsa.measurement.audiogram._502.PointStatusType
	 * @see #isSetAdditionalMaskingPointStatus()
	 * @see #unsetAdditionalMaskingPointStatus()
	 * @see #setAdditionalMaskingPointStatus(PointStatusType)
	 * @see com.himsa.measurement.audiogram._502._502Package#getAdditionalMaskingType_AdditionalMaskingPointStatus()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='AdditionalMaskingPointStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	PointStatusType getAdditionalMaskingPointStatus();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.AdditionalMaskingType#getAdditionalMaskingPointStatus <em>Additional Masking Point Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Masking Point Status</em>' attribute.
	 * @see com.himsa.measurement.audiogram._502.PointStatusType
	 * @see #isSetAdditionalMaskingPointStatus()
	 * @see #unsetAdditionalMaskingPointStatus()
	 * @see #getAdditionalMaskingPointStatus()
	 * @generated
	 */
	void setAdditionalMaskingPointStatus(PointStatusType value);

	/**
	 * Unsets the value of the '{@link com.himsa.measurement.audiogram._502.AdditionalMaskingType#getAdditionalMaskingPointStatus <em>Additional Masking Point Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAdditionalMaskingPointStatus()
	 * @see #getAdditionalMaskingPointStatus()
	 * @see #setAdditionalMaskingPointStatus(PointStatusType)
	 * @generated
	 */
	void unsetAdditionalMaskingPointStatus();

	/**
	 * Returns whether the value of the '{@link com.himsa.measurement.audiogram._502.AdditionalMaskingType#getAdditionalMaskingPointStatus <em>Additional Masking Point Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Additional Masking Point Status</em>' attribute is set.
	 * @see #unsetAdditionalMaskingPointStatus()
	 * @see #getAdditionalMaskingPointStatus()
	 * @see #setAdditionalMaskingPointStatus(PointStatusType)
	 * @generated
	 */
	boolean isSetAdditionalMaskingPointStatus();

} // AdditionalMaskingType
