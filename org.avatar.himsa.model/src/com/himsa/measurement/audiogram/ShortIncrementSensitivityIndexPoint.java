/*
 */
package com.himsa.measurement.audiogram;

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
 * ## TSiSiPoint ##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexPoint#getStimulusFrequency <em>Stimulus Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexPoint#getStimulusLevel <em>Stimulus Level</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexPoint#getMaskingFrequency <em>Masking Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexPoint#getMaskingLevel <em>Masking Level</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexPoint#getModulationSize <em>Modulation Size</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexPoint#getNumberOfAnswers <em>Number Of Answers</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexPoint#getNumberOfIncrements <em>Number Of Increments</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.audiogram.AudiogramPackage#getShortIncrementSensitivityIndexPoint()
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
	 * 
	 * ## freq1 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Frequency</em>' attribute.
	 * @see #setStimulusFrequency(BigInteger)
	 * @see com.himsa.measurement.audiogram.AudiogramPackage#getShortIncrementSensitivityIndexPoint_StimulusFrequency()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='StimulusFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStimulusFrequency();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexPoint#getStimulusFrequency <em>Stimulus Frequency</em>}' attribute.
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
	 * @see com.himsa.measurement.audiogram.AudiogramPackage#getShortIncrementSensitivityIndexPoint_StimulusLevel()
	 * @model dataType="com.himsa.measurement.audiogram.StimulusLevelType3" required="true"
	 *        extendedMetaData="kind='element' name='StimulusLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getStimulusLevel();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexPoint#getStimulusLevel <em>Stimulus Level</em>}' attribute.
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
	 * @see com.himsa.measurement.audiogram.AudiogramPackage#getShortIncrementSensitivityIndexPoint_MaskingFrequency()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='MaskingFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMaskingFrequency();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexPoint#getMaskingFrequency <em>Masking Frequency</em>}' attribute.
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
	 * 
	 * ## intensity2 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Level</em>' attribute.
	 * @see #setMaskingLevel(BigDecimal)
	 * @see com.himsa.measurement.audiogram.AudiogramPackage#getShortIncrementSensitivityIndexPoint_MaskingLevel()
	 * @model dataType="com.himsa.measurement.audiogram.MaskingLevelType1"
	 *        extendedMetaData="kind='element' name='MaskingLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getMaskingLevel();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexPoint#getMaskingLevel <em>Masking Level</em>}' attribute.
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
	 * 
	 * ## ModSize ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modulation Size</em>' attribute.
	 * @see #setModulationSize(BigDecimal)
	 * @see com.himsa.measurement.audiogram.AudiogramPackage#getShortIncrementSensitivityIndexPoint_ModulationSize()
	 * @model dataType="com.himsa.measurement.audiogram.ModulationSizeType" required="true"
	 *        extendedMetaData="kind='element' name='ModulationSize' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getModulationSize();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexPoint#getModulationSize <em>Modulation Size</em>}' attribute.
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
	 * 
	 * ## TSiSiIncrements ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Answers</em>' attribute.
	 * @see #setNumberOfAnswers(BigInteger)
	 * @see com.himsa.measurement.audiogram.AudiogramPackage#getShortIncrementSensitivityIndexPoint_NumberOfAnswers()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='NumberOfAnswers' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumberOfAnswers();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexPoint#getNumberOfAnswers <em>Number Of Answers</em>}' attribute.
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
	 * 
	 * ## TSiSiIncrements ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Increments</em>' attribute.
	 * @see #setNumberOfIncrements(BigInteger)
	 * @see com.himsa.measurement.audiogram.AudiogramPackage#getShortIncrementSensitivityIndexPoint_NumberOfIncrements()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='NumberOfIncrements' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumberOfIncrements();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram.ShortIncrementSensitivityIndexPoint#getNumberOfIncrements <em>Number Of Increments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Increments</em>' attribute.
	 * @see #getNumberOfIncrements()
	 * @generated
	 */
	void setNumberOfIncrements(BigInteger value);

} // ShortIncrementSensitivityIndexPoint
