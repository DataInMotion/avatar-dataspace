/*
 */
package audiogram502;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Short Increment Sensitivity Index Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Data point for Short Increment Sensitivity Index (SISI) Audiogram
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link audiogram502.ShortIncrementSensitivityIndexPoint#getStimulusFrequency <em>Stimulus Frequency</em>}</li>
 *   <li>{@link audiogram502.ShortIncrementSensitivityIndexPoint#getStimulusLevel <em>Stimulus Level</em>}</li>
 *   <li>{@link audiogram502.ShortIncrementSensitivityIndexPoint#getMaskingFrequency <em>Masking Frequency</em>}</li>
 *   <li>{@link audiogram502.ShortIncrementSensitivityIndexPoint#getMaskingLevel <em>Masking Level</em>}</li>
 *   <li>{@link audiogram502.ShortIncrementSensitivityIndexPoint#getModulationSize <em>Modulation Size</em>}</li>
 *   <li>{@link audiogram502.ShortIncrementSensitivityIndexPoint#getNumberOfAnswers <em>Number Of Answers</em>}</li>
 *   <li>{@link audiogram502.ShortIncrementSensitivityIndexPoint#getNumberOfIncrements <em>Number Of Increments</em>}</li>
 *   <li>{@link audiogram502.ShortIncrementSensitivityIndexPoint#getAdditionalMaskingPoint <em>Additional Masking Point</em>}</li>
 * </ul>
 *
 * @see audiogram502.Audiogram502Package#getShortIncrementSensitivityIndexPoint()
 * @model extendedMetaData="name='ShortIncrementSensitivityIndexPoint' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ShortIncrementSensitivityIndexPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Stimulus Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Frequency of the stimulus channel in Hz.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Frequency</em>' attribute.
	 * @see #setStimulusFrequency(BigInteger)
	 * @see audiogram502.Audiogram502Package#getShortIncrementSensitivityIndexPoint_StimulusFrequency()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='StimulusFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStimulusFrequency();

	/**
	 * Sets the value of the '{@link audiogram502.ShortIncrementSensitivityIndexPoint#getStimulusFrequency <em>Stimulus Frequency</em>}' attribute.
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
	 * @see audiogram502.Audiogram502Package#getShortIncrementSensitivityIndexPoint_StimulusLevel()
	 * @model dataType="audiogram502.StimulusLevelType" required="true"
	 *        extendedMetaData="kind='element' name='StimulusLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getStimulusLevel();

	/**
	 * Sets the value of the '{@link audiogram502.ShortIncrementSensitivityIndexPoint#getStimulusLevel <em>Stimulus Level</em>}' attribute.
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
	 * @see audiogram502.Audiogram502Package#getShortIncrementSensitivityIndexPoint_MaskingFrequency()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='MaskingFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMaskingFrequency();

	/**
	 * Sets the value of the '{@link audiogram502.ShortIncrementSensitivityIndexPoint#getMaskingFrequency <em>Masking Frequency</em>}' attribute.
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
	 * @see audiogram502.Audiogram502Package#getShortIncrementSensitivityIndexPoint_MaskingLevel()
	 * @model dataType="audiogram502.MaskingLevelType2"
	 *        extendedMetaData="kind='element' name='MaskingLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getMaskingLevel();

	/**
	 * Sets the value of the '{@link audiogram502.ShortIncrementSensitivityIndexPoint#getMaskingLevel <em>Masking Level</em>}' attribute.
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
	 * The observed SiSi Increment size measured in dB.  This value represents the lowest detectable difference in Sound Pressure Level
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modulation Size</em>' attribute.
	 * @see #setModulationSize(BigDecimal)
	 * @see audiogram502.Audiogram502Package#getShortIncrementSensitivityIndexPoint_ModulationSize()
	 * @model dataType="audiogram502.ModulationSizeType" required="true"
	 *        extendedMetaData="kind='element' name='ModulationSize' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getModulationSize();

	/**
	 * Sets the value of the '{@link audiogram502.ShortIncrementSensitivityIndexPoint#getModulationSize <em>Modulation Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modulation Size</em>' attribute.
	 * @see #getModulationSize()
	 * @generated
	 */
	void setModulationSize(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Number Of Answers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of positive responses given by the patient corresponding to the saved increment
	 * size.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Answers</em>' attribute.
	 * @see #setNumberOfAnswers(BigInteger)
	 * @see audiogram502.Audiogram502Package#getShortIncrementSensitivityIndexPoint_NumberOfAnswers()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='NumberOfAnswers' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumberOfAnswers();

	/**
	 * Sets the value of the '{@link audiogram502.ShortIncrementSensitivityIndexPoint#getNumberOfAnswers <em>Number Of Answers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Answers</em>' attribute.
	 * @see #getNumberOfAnswers()
	 * @generated
	 */
	void setNumberOfAnswers(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Number Of Increments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of presentations given with the corresponding increment size
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Increments</em>' attribute.
	 * @see #setNumberOfIncrements(BigInteger)
	 * @see audiogram502.Audiogram502Package#getShortIncrementSensitivityIndexPoint_NumberOfIncrements()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='NumberOfIncrements' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumberOfIncrements();

	/**
	 * Sets the value of the '{@link audiogram502.ShortIncrementSensitivityIndexPoint#getNumberOfIncrements <em>Number Of Increments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Increments</em>' attribute.
	 * @see #getNumberOfIncrements()
	 * @generated
	 */
	void setNumberOfIncrements(BigInteger value);

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
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Masking Point</em>' containment reference.
	 * @see #setAdditionalMaskingPoint(AdditionalMasking2Type)
	 * @see audiogram502.Audiogram502Package#getShortIncrementSensitivityIndexPoint_AdditionalMaskingPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdditionalMaskingPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	AdditionalMasking2Type getAdditionalMaskingPoint();

	/**
	 * Sets the value of the '{@link audiogram502.ShortIncrementSensitivityIndexPoint#getAdditionalMaskingPoint <em>Additional Masking Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Masking Point</em>' containment reference.
	 * @see #getAdditionalMaskingPoint()
	 * @generated
	 */
	void setAdditionalMaskingPoint(AdditionalMasking2Type value);

} // ShortIncrementSensitivityIndexPoint
