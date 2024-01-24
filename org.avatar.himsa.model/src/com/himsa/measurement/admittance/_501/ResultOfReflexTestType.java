/*
 */
package com.himsa.measurement.admittance._501;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Of Reflex Test Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.admittance._501.ResultOfReflexTestType#isReflexDetected <em>Reflex Detected</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.ResultOfReflexTestType#getDecayBasicResult <em>Decay Basic Result</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.ResultOfReflexTestType#getDecayPercent <em>Decay Percent</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.ResultOfReflexTestType#getLatencyTime <em>Latency Time</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.admittance._501._501Package#getResultOfReflexTestType()
 * @model extendedMetaData="name='ResultOfReflexTest_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ResultOfReflexTestType extends EObject {
	/**
	 * Returns the value of the '<em><b>Reflex Detected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if the reflex was detected
	 * 
	 * @@ 501 to 500 conversion
	 * 
	 * IF TestType measurement condition IS NOT Decay or Latency then: 
	 * 
	 * Map True to 1 for ResultOfReflexTest
	 * Map False to 0 for ResultOfReflexTest
	 * 
	 * @@
	 * 
	 * @@ 500 to 501
	 * 
	 * IF TestType measurement condition IS NOT Decay or Latency AND ResultOfReflex is 1 or 0 then:
	 * Map ResultOfReflex value of 1 to True
	 * Map ResultOfReflex value of 0 to False
	 * @@
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reflex Detected</em>' attribute.
	 * @see #isSetReflexDetected()
	 * @see #unsetReflexDetected()
	 * @see #setReflexDetected(boolean)
	 * @see com.himsa.measurement.admittance._501._501Package#getResultOfReflexTestType_ReflexDetected()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='ReflexDetected' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isReflexDetected();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.ResultOfReflexTestType#isReflexDetected <em>Reflex Detected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reflex Detected</em>' attribute.
	 * @see #isSetReflexDetected()
	 * @see #unsetReflexDetected()
	 * @see #isReflexDetected()
	 * @generated
	 */
	void setReflexDetected(boolean value);

	/**
	 * Unsets the value of the '{@link com.himsa.measurement.admittance._501.ResultOfReflexTestType#isReflexDetected <em>Reflex Detected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReflexDetected()
	 * @see #isReflexDetected()
	 * @see #setReflexDetected(boolean)
	 * @generated
	 */
	void unsetReflexDetected();

	/**
	 * Returns whether the value of the '{@link com.himsa.measurement.admittance._501.ResultOfReflexTestType#isReflexDetected <em>Reflex Detected</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reflex Detected</em>' attribute is set.
	 * @see #unsetReflexDetected()
	 * @see #isReflexDetected()
	 * @see #setReflexDetected(boolean)
	 * @generated
	 */
	boolean isSetReflexDetected();

	/**
	 * Returns the value of the '<em><b>Decay Basic Result</b></em>' attribute.
	 * The literals are from the enumeration {@link com.himsa.measurement.admittance._501.DecayBasicResultType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Positive if the results was positive for Decay
	 * Negative if the result was negative for Decay
	 * 
	 * Use the element "DecayPercent" if a percent val;ue is to be stored.
	 * 
	 * @@ 501 to 500 conversion
	 * This is a new element but can be convereted down to 500
	 * 
	 * If value is Positive then map 1 to ResultOfReflexTest
	 * If value is Negative then map 0 to ResultOfReflexTest
	 * 
	 * @@
	 * 
	 * @@ 500 to 501
	 * 
	 * If the TestType measurement condition = Decay AND the ResultOfReflex = 1 OR zero then 
	 * 
	 * If ResultOfReflex = 1 then this element will be Positive
	 * If ResultOfReflex = 0 then this element will be Negative
	 * 
	 * If the TestType measurement condition = Decay AND the ResultOfReflex IS NOT 1 OR zero then map the value to DecayPercent (see below)
	 * 
	 * @@
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decay Basic Result</em>' attribute.
	 * @see com.himsa.measurement.admittance._501.DecayBasicResultType
	 * @see #isSetDecayBasicResult()
	 * @see #unsetDecayBasicResult()
	 * @see #setDecayBasicResult(DecayBasicResultType)
	 * @see com.himsa.measurement.admittance._501._501Package#getResultOfReflexTestType_DecayBasicResult()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DecayBasicResult' namespace='##targetNamespace'"
	 * @generated
	 */
	DecayBasicResultType getDecayBasicResult();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.ResultOfReflexTestType#getDecayBasicResult <em>Decay Basic Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decay Basic Result</em>' attribute.
	 * @see com.himsa.measurement.admittance._501.DecayBasicResultType
	 * @see #isSetDecayBasicResult()
	 * @see #unsetDecayBasicResult()
	 * @see #getDecayBasicResult()
	 * @generated
	 */
	void setDecayBasicResult(DecayBasicResultType value);

	/**
	 * Unsets the value of the '{@link com.himsa.measurement.admittance._501.ResultOfReflexTestType#getDecayBasicResult <em>Decay Basic Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDecayBasicResult()
	 * @see #getDecayBasicResult()
	 * @see #setDecayBasicResult(DecayBasicResultType)
	 * @generated
	 */
	void unsetDecayBasicResult();

	/**
	 * Returns whether the value of the '{@link com.himsa.measurement.admittance._501.ResultOfReflexTestType#getDecayBasicResult <em>Decay Basic Result</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Decay Basic Result</em>' attribute is set.
	 * @see #unsetDecayBasicResult()
	 * @see #getDecayBasicResult()
	 * @see #setDecayBasicResult(DecayBasicResultType)
	 * @generated
	 */
	boolean isSetDecayBasicResult();

	/**
	 * Returns the value of the '<em><b>Decay Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Decay value represented as percent
	 * 
	 * @@ Format 501 to 500
	 * If the TestType measurement condition = Decay then
	 * Map this element ResultOfReflex element
	 * @@
	 * 
	 * @@ Format 500 to 501
	 * If the TestType measurement condition = Decay AND the ResultOfReflex IS NOT 1 OR zero then map the ResultOfReflex value to this element
	 * @@ 
	 * 
	 *  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decay Percent</em>' attribute.
	 * @see #setDecayPercent(BigInteger)
	 * @see com.himsa.measurement.admittance._501._501Package#getResultOfReflexTestType_DecayPercent()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='DecayPercent' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getDecayPercent();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.ResultOfReflexTestType#getDecayPercent <em>Decay Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decay Percent</em>' attribute.
	 * @see #getDecayPercent()
	 * @generated
	 */
	void setDecayPercent(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Latency Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * time in milliseconds
	 * 
	 * @@ Format 501 to Format 500
	 * If the TestType measurement condition = Latency then
	 * Map this element ResultOfReflex element
	 * 
	 * @@
	 * 
	 * @@ Format 500 to 501
	 * If the TestType measurement condition = Latency then map the ResultOfReflex value to this element
	 * @@ 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latency Time</em>' attribute.
	 * @see #setLatencyTime(BigInteger)
	 * @see com.himsa.measurement.admittance._501._501Package#getResultOfReflexTestType_LatencyTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='LatencyTime' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getLatencyTime();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.ResultOfReflexTestType#getLatencyTime <em>Latency Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency Time</em>' attribute.
	 * @see #getLatencyTime()
	 * @generated
	 */
	void setLatencyTime(BigInteger value);

} // ResultOfReflexTestType
