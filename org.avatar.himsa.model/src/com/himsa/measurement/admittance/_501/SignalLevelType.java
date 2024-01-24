/*
 */
package com.himsa.measurement.admittance._501;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Level Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.admittance._501.SignalLevelType#getStimulusLevel <em>Stimulus Level</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.SignalLevelType#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.admittance._501._501Package#getSignalLevelType()
 * @model extendedMetaData="name='SignalLevel_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SignalLevelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Stimulus Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Level of the stimulus tone in dB HL. The ipsilateral stimulus tone is added via
	 * the probe, the contralateral stimulus tone is added through a headphone, often a
	 * TDH39 that can easily be calibrated in dB HL (Hearing Level).
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Level</em>' attribute.
	 * @see #setStimulusLevel(BigDecimal)
	 * @see com.himsa.measurement.admittance._501._501Package#getSignalLevelType_StimulusLevel()
	 * @model dataType="com.himsa.measurement.admittance._501.StimulusLevelType"
	 *        extendedMetaData="kind='element' name='StimulusLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getStimulusLevel();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.SignalLevelType#getStimulusLevel <em>Stimulus Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Level</em>' attribute.
	 * @see #getStimulusLevel()
	 * @generated
	 */
	void setStimulusLevel(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' attribute.
	 * The literals are from the enumeration {@link com.himsa.measurement.admittance._501.ReflexTestResponseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See annotations for ReflexTestResponse_Type for a complete list of valid choices
	 * 
	 * @@ 501 --> 500 This is a new element added to format 501
	 * 
	 * If this element has been used it cannot be converted down as would be expected.  However, The SignalLevel element in 500 is mandatory.  If this choice has been made this it will be necessary to create a SignalLevel elment and set the value to zero.
	 * 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response</em>' attribute.
	 * @see com.himsa.measurement.admittance._501.ReflexTestResponseType
	 * @see #isSetResponse()
	 * @see #unsetResponse()
	 * @see #setResponse(ReflexTestResponseType)
	 * @see com.himsa.measurement.admittance._501._501Package#getSignalLevelType_Response()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Response' namespace='##targetNamespace'"
	 * @generated
	 */
	ReflexTestResponseType getResponse();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.SignalLevelType#getResponse <em>Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' attribute.
	 * @see com.himsa.measurement.admittance._501.ReflexTestResponseType
	 * @see #isSetResponse()
	 * @see #unsetResponse()
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(ReflexTestResponseType value);

	/**
	 * Unsets the value of the '{@link com.himsa.measurement.admittance._501.SignalLevelType#getResponse <em>Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResponse()
	 * @see #getResponse()
	 * @see #setResponse(ReflexTestResponseType)
	 * @generated
	 */
	void unsetResponse();

	/**
	 * Returns whether the value of the '{@link com.himsa.measurement.admittance._501.SignalLevelType#getResponse <em>Response</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Response</em>' attribute is set.
	 * @see #unsetResponse()
	 * @see #getResponse()
	 * @see #setResponse(ReflexTestResponseType)
	 * @generated
	 */
	boolean isSetResponse();

} // SignalLevelType
