/*
 */
package com.himsa.measurement.impedance;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reflex Test Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Reflex Test
 * 
 * ## TReflexTest ## 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.impedance.ReflexTestType#getReflexCurve <em>Reflex Curve</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.ReflexTestType#getResultOfReflexTest <em>Result Of Reflex Test</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.ReflexTestType#getImpedanceMeasurementCondition <em>Impedance Measurement Condition</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.impedance.ImpedancePackage#getReflexTestType()
 * @model extendedMetaData="name='ReflexTest_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ReflexTestType extends EObject {
	/**
	 * Returns the value of the '<em><b>Reflex Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Graphic representation of the compliance change caused by acoustic reflex
	 * 
	 * ## reflexCrv ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reflex Curve</em>' containment reference.
	 * @see #setReflexCurve(ReflexCurveType)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getReflexTestType_ReflexCurve()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ReflexCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	ReflexCurveType getReflexCurve();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.ReflexTestType#getReflexCurve <em>Reflex Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reflex Curve</em>' containment reference.
	 * @see #getReflexCurve()
	 * @generated
	 */
	void setReflexCurve(ReflexCurveType value);

	/**
	 * Returns the value of the '<em><b>Result Of Reflex Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of this element can expressed in different ways depending on the enumerated value set in ImpedanceMeasurementConditions TestType:
	 * 
	 * REFLEX
	 * +Reflex detected = FALSE (value = 0)
	 * +Reflex detected = TRUE (Value = 1)
	 * 
	 * DECAY
	 * + The value represents a percentage
	 * 
	 * LATENCY
	 * + time in milliseconds
	 * 
	 * ## result ## 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result Of Reflex Test</em>' attribute.
	 * @see #setResultOfReflexTest(BigInteger)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getReflexTestType_ResultOfReflexTest()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='ResultOfReflexTest' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getResultOfReflexTest();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.ReflexTestType#getResultOfReflexTest <em>Result Of Reflex Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Of Reflex Test</em>' attribute.
	 * @see #getResultOfReflexTest()
	 * @generated
	 */
	void setResultOfReflexTest(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Impedance Measurement Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measure conditions for reflex recording
	 * 
	 * ## impMeasCond ##
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Impedance Measurement Condition</em>' containment reference.
	 * @see #setImpedanceMeasurementCondition(ImpedanceMeasurementConditionType)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getReflexTestType_ImpedanceMeasurementCondition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ImpedanceMeasurementCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	ImpedanceMeasurementConditionType getImpedanceMeasurementCondition();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.ReflexTestType#getImpedanceMeasurementCondition <em>Impedance Measurement Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impedance Measurement Condition</em>' containment reference.
	 * @see #getImpedanceMeasurementCondition()
	 * @generated
	 */
	void setImpedanceMeasurementCondition(ImpedanceMeasurementConditionType value);

} // ReflexTestType
