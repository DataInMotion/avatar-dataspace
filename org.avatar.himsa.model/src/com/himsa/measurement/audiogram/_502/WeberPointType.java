/*
 */
package com.himsa.measurement.audiogram._502;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weber Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram._502.WeberPointType#getStimulusFrequency <em>Stimulus Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.WeberPointType#getStimulusLevel <em>Stimulus Level</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.WeberPointType#getPointStatus <em>Point Status</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.audiogram._502._502Package#getWeberPointType()
 * @model extendedMetaData="name='WeberPoint_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface WeberPointType extends EObject {
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
	 * @see com.himsa.measurement.audiogram._502._502Package#getWeberPointType_StimulusFrequency()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='StimulusFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStimulusFrequency();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.WeberPointType#getStimulusFrequency <em>Stimulus Frequency</em>}' attribute.
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
	 * Important Note: There was a misunderstanding during the creation phase of the Weber Element that was not caught later on.  The StimulusLevel Element should not have not been implemented.  As it makes no sense to have it HIMSA will plan to remove this element in the next format release.  
	 * 
	 * It would not be our normal procedure to remove an element but in this case it seems safe to do so in this case.
	 * 
	 * As the element is further marked as mandatory a module saving the data would be required to save a value.  HIMSA will suggest to save the value of zero.  Readers of data can of course just ignore the value.
	 * 
	 * In the next format version HIMSA will also take the necessary steps in the conversion Dll’s to handle this situation.
	 * 
	 * Stimulus Level of the stimulus channel in dB
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Level</em>' attribute.
	 * @see #setStimulusLevel(BigDecimal)
	 * @see com.himsa.measurement.audiogram._502._502Package#getWeberPointType_StimulusLevel()
	 * @model dataType="com.himsa.measurement.audiogram._502.StimulusLevelType2" required="true"
	 *        extendedMetaData="kind='element' name='StimulusLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getStimulusLevel();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.WeberPointType#getStimulusLevel <em>Stimulus Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Level</em>' attribute.
	 * @see #getStimulusLevel()
	 * @generated
	 */
	void setStimulusLevel(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Point Status</b></em>' attribute.
	 * The literals are from the enumeration {@link com.himsa.measurement.audiogram._502.WeberPointStatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Right / The patient heard better on the right ear.
	 * Left / The patient heard better on the left ear.
	 * Center / The patient heard equally well in both ears
	 * NoResponse / The patient did not respond
	 * NotAudible / Not audible to the patient
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Status</em>' attribute.
	 * @see com.himsa.measurement.audiogram._502.WeberPointStatusType
	 * @see #isSetPointStatus()
	 * @see #unsetPointStatus()
	 * @see #setPointStatus(WeberPointStatusType)
	 * @see com.himsa.measurement.audiogram._502._502Package#getWeberPointType_PointStatus()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='PointStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	WeberPointStatusType getPointStatus();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.WeberPointType#getPointStatus <em>Point Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Status</em>' attribute.
	 * @see com.himsa.measurement.audiogram._502.WeberPointStatusType
	 * @see #isSetPointStatus()
	 * @see #unsetPointStatus()
	 * @see #getPointStatus()
	 * @generated
	 */
	void setPointStatus(WeberPointStatusType value);

	/**
	 * Unsets the value of the '{@link com.himsa.measurement.audiogram._502.WeberPointType#getPointStatus <em>Point Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPointStatus()
	 * @see #getPointStatus()
	 * @see #setPointStatus(WeberPointStatusType)
	 * @generated
	 */
	void unsetPointStatus();

	/**
	 * Returns whether the value of the '{@link com.himsa.measurement.audiogram._502.WeberPointType#getPointStatus <em>Point Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Point Status</em>' attribute is set.
	 * @see #unsetPointStatus()
	 * @see #getPointStatus()
	 * @see #setPointStatus(WeberPointStatusType)
	 * @generated
	 */
	boolean isSetPointStatus();

} // WeberPointType
