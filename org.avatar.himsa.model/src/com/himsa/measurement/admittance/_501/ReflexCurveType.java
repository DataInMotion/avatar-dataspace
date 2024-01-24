/*
 */
package com.himsa.measurement.admittance._501;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reflex Curve Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Acoustic Reflex (stapedius reflex) measurement. The reflexPoints saves
 * [time, admittance] values, and the admittance unit saves the unit of the data. 
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.admittance._501.ReflexCurveType#getNumericDelta <em>Numeric Delta</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.ReflexCurveType#getDeltaY <em>Delta Y</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.admittance._501._501Package#getReflexCurveType()
 * @model extendedMetaData="name='ReflexCurve_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ReflexCurveType extends EObject {
	/**
	 * Returns the value of the '<em><b>Numeric Delta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Y'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Numeric Delta</em>' containment reference.
	 * @see #setNumericDelta(NumericDeltaType)
	 * @see com.himsa.measurement.admittance._501._501Package#getReflexCurveType_NumericDelta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NumericDelta' namespace='##targetNamespace'"
	 * @generated
	 */
	NumericDeltaType getNumericDelta();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.ReflexCurveType#getNumericDelta <em>Numeric Delta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numeric Delta</em>' containment reference.
	 * @see #getNumericDelta()
	 * @generated
	 */
	void setNumericDelta(NumericDeltaType value);

	/**
	 * Returns the value of the '<em><b>Delta Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * @@ Format 501 to 500
	 * 
	 * If an application (including the 501100 runtime converter)  wishes to make use of DeltaY it must then be converted  to NumericDelta following the below formula.
	 * 
	 * NumericDeltaY = NumericY - NumericY0
	 * 
	 * Using the supplied DeltaG and DeltaB values the following variables will be used.
	 * 
	 * B = DeltaB + B0
	 * G = DeltaG + G0
	 * NumericY = SQRT(B * B + G * G)
	 * NumericY0 = SQRT(B0 * B0 + G0 * G0)
	 * 
	 * Then convert NumericDeltaY as documented to format 500
	 * 
	 * 
	 * @@
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Y</em>' containment reference.
	 * @see #setDeltaY(DeltaYType)
	 * @see com.himsa.measurement.admittance._501._501Package#getReflexCurveType_DeltaY()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeltaY' namespace='##targetNamespace'"
	 * @generated
	 */
	DeltaYType getDeltaY();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.ReflexCurveType#getDeltaY <em>Delta Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Y</em>' containment reference.
	 * @see #getDeltaY()
	 * @generated
	 */
	void setDeltaY(DeltaYType value);

} // ReflexCurveType
