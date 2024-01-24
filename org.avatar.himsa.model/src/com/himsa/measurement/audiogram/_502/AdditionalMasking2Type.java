/*
 */
package com.himsa.measurement.audiogram._502;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additional Masking2 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Additonal Masking 2 Type is used for tests such as Decay testing where a Point Status is not included
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram._502.AdditionalMasking2Type#getAdditionalStimulusLevel <em>Additional Stimulus Level</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.AdditionalMasking2Type#getAdditionalMaskingLevel <em>Additional Masking Level</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.audiogram._502._502Package#getAdditionalMasking2Type()
 * @model extendedMetaData="name='AdditionalMasking2_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AdditionalMasking2Type extends EObject {
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
	 * @see com.himsa.measurement.audiogram._502._502Package#getAdditionalMasking2Type_AdditionalStimulusLevel()
	 * @model dataType="com.himsa.measurement.audiogram._502.AdditionalStimulusLevelType" required="true"
	 *        extendedMetaData="kind='element' name='AdditionalStimulusLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getAdditionalStimulusLevel();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.AdditionalMasking2Type#getAdditionalStimulusLevel <em>Additional Stimulus Level</em>}' attribute.
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
	 * @see com.himsa.measurement.audiogram._502._502Package#getAdditionalMasking2Type_AdditionalMaskingLevel()
	 * @model dataType="com.himsa.measurement.audiogram._502.AdditionalMaskingLevelType" required="true"
	 *        extendedMetaData="kind='element' name='AdditionalMaskingLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getAdditionalMaskingLevel();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.AdditionalMasking2Type#getAdditionalMaskingLevel <em>Additional Masking Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Masking Level</em>' attribute.
	 * @see #getAdditionalMaskingLevel()
	 * @generated
	 */
	void setAdditionalMaskingLevel(BigDecimal value);

} // AdditionalMasking2Type
