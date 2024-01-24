/*
 */
package com.himsa.measurement.audiogram;

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
 * ## TTonePoint ##
 * 
 * 
 * @@ HIMSA has noticed that some modules saving in format 100 or 200 have setup many AudMeasurementConditions for curve but then never entered any actual points.  If the TonePoints collection is empty then the curve must not be converted to XML, doing so allows for a much smaller XML file @@
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram.TonePointsType#getStimulusFrequency <em>Stimulus Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.TonePointsType#getStimulusLevel <em>Stimulus Level</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.TonePointsType#getMaskingFrequency <em>Masking Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.TonePointsType#getMaskingLevel <em>Masking Level</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.TonePointsType#getTonePointStatus <em>Tone Point Status</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.audiogram.AudiogramPackage#getTonePointsType()
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
	 * ## freq1 ##
	 * 
	 * @@ HIMSA has found that some modules saving in format 100 or 200 have improperly used the value of 0 (zero) to denote an empty value.  This use causes a very inefficient creation of XML files.  
	 * If all the StimulusFrequency elements contain the value of 0 for a given curve then do not convert the StimulusFrequency and corresponding StimulusLevel elements as they do not represent useful data.
	 * The same rule applies to MaskingFrequency and MaskingLevel @@
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Frequency</em>' attribute.
	 * @see #setStimulusFrequency(BigInteger)
	 * @see com.himsa.measurement.audiogram.AudiogramPackage#getTonePointsType_StimulusFrequency()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='StimulusFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStimulusFrequency();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram.TonePointsType#getStimulusFrequency <em>Stimulus Frequency</em>}' attribute.
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
	 * @see com.himsa.measurement.audiogram.AudiogramPackage#getTonePointsType_StimulusLevel()
	 * @model dataType="com.himsa.measurement.audiogram.StimulusLevelType5" required="true"
	 *        extendedMetaData="kind='element' name='StimulusLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getStimulusLevel();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram.TonePointsType#getStimulusLevel <em>Stimulus Level</em>}' attribute.
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
	 * Frequency for masking channel
	 * 
	 * If masking is to be recorded it is then necessary to save values for both MaskingFrequency and MaskingLevel.  The XSD was not able to be setup to enforce this rule due to legacy (format 200) design.
	 * 
	 * ## freq2 ##
	 * 
	 * @@ HIMSA has found that some modules saving in format 100 or 200 have improperly used the value of 0 (zero) to denote an empty value.  This use causes a very inefficient creation of XML files.  
	 * If all the StimulusFrequency elements contain the value of 0 for a given curve then do not convert the StimulusFrequency and corresponding StimulusLevel elements as they do not represent useful data.
	 * The same rule applies to MaskingFrequency and MaskingLevel @@
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Frequency</em>' attribute.
	 * @see #setMaskingFrequency(BigInteger)
	 * @see com.himsa.measurement.audiogram.AudiogramPackage#getTonePointsType_MaskingFrequency()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='MaskingFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMaskingFrequency();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram.TonePointsType#getMaskingFrequency <em>Masking Frequency</em>}' attribute.
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
	 * If masking is to be recorded it is then necessary to save values for both MaskingFrequency and MaskingLevel.  The XSD was not able to be setup to enforce this rule due to legacy (format 200) design.
	 * 
	 * ## intensity2 ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Level</em>' attribute.
	 * @see #setMaskingLevel(BigDecimal)
	 * @see com.himsa.measurement.audiogram.AudiogramPackage#getTonePointsType_MaskingLevel()
	 * @model dataType="com.himsa.measurement.audiogram.MaskingLevelType5"
	 *        extendedMetaData="kind='element' name='MaskingLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getMaskingLevel();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram.TonePointsType#getMaskingLevel <em>Masking Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking Level</em>' attribute.
	 * @see #getMaskingLevel()
	 * @generated
	 */
	void setMaskingLevel(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Tone Point Status</b></em>' attribute.
	 * The literals are from the enumeration {@link com.himsa.measurement.audiogram.PointStatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status of the point
	 * 
	 * See PointStatus_Type annotation notes for more information
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tone Point Status</em>' attribute.
	 * @see com.himsa.measurement.audiogram.PointStatusType
	 * @see #isSetTonePointStatus()
	 * @see #unsetTonePointStatus()
	 * @see #setTonePointStatus(PointStatusType)
	 * @see com.himsa.measurement.audiogram.AudiogramPackage#getTonePointsType_TonePointStatus()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TonePointStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	PointStatusType getTonePointStatus();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram.TonePointsType#getTonePointStatus <em>Tone Point Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tone Point Status</em>' attribute.
	 * @see com.himsa.measurement.audiogram.PointStatusType
	 * @see #isSetTonePointStatus()
	 * @see #unsetTonePointStatus()
	 * @see #getTonePointStatus()
	 * @generated
	 */
	void setTonePointStatus(PointStatusType value);

	/**
	 * Unsets the value of the '{@link com.himsa.measurement.audiogram.TonePointsType#getTonePointStatus <em>Tone Point Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTonePointStatus()
	 * @see #getTonePointStatus()
	 * @see #setTonePointStatus(PointStatusType)
	 * @generated
	 */
	void unsetTonePointStatus();

	/**
	 * Returns whether the value of the '{@link com.himsa.measurement.audiogram.TonePointsType#getTonePointStatus <em>Tone Point Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tone Point Status</em>' attribute is set.
	 * @see #unsetTonePointStatus()
	 * @see #getTonePointStatus()
	 * @see #setTonePointStatus(PointStatusType)
	 * @generated
	 */
	boolean isSetTonePointStatus();

} // TonePointsType
