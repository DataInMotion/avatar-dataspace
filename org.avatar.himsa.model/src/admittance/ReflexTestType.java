/*
 */
package admittance;

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
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link admittance.ReflexTestType#getReflexCurve <em>Reflex Curve</em>}</li>
 *   <li>{@link admittance.ReflexTestType#getResultOfReflexTest <em>Result Of Reflex Test</em>}</li>
 *   <li>{@link admittance.ReflexTestType#getAdmittanceMeasurementCondition <em>Admittance Measurement Condition</em>}</li>
 * </ul>
 *
 * @see admittance.AdmittancePackage#getReflexTestType()
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
	 * Graphic representation of the admittance change caused by acoustic reflex
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reflex Curve</em>' containment reference.
	 * @see #setReflexCurve(ReflexCurveType)
	 * @see admittance.AdmittancePackage#getReflexTestType_ReflexCurve()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReflexCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	ReflexCurveType getReflexCurve();

	/**
	 * Sets the value of the '{@link admittance.ReflexTestType#getReflexCurve <em>Reflex Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reflex Curve</em>' containment reference.
	 * @see #getReflexCurve()
	 * @generated
	 */
	void setReflexCurve(ReflexCurveType value);

	/**
	 * Returns the value of the '<em><b>Result Of Reflex Test</b></em>' containment reference.
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
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result Of Reflex Test</em>' containment reference.
	 * @see #setResultOfReflexTest(ResultOfReflexTestType)
	 * @see admittance.AdmittancePackage#getReflexTestType_ResultOfReflexTest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ResultOfReflexTest' namespace='##targetNamespace'"
	 * @generated
	 */
	ResultOfReflexTestType getResultOfReflexTest();

	/**
	 * Sets the value of the '{@link admittance.ReflexTestType#getResultOfReflexTest <em>Result Of Reflex Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Of Reflex Test</em>' containment reference.
	 * @see #getResultOfReflexTest()
	 * @generated
	 */
	void setResultOfReflexTest(ResultOfReflexTestType value);

	/**
	 * Returns the value of the '<em><b>Admittance Measurement Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measure conditions for reflex recording
	 * 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Admittance Measurement Condition</em>' containment reference.
	 * @see #setAdmittanceMeasurementCondition(AdmittanceMeasurementConditionType)
	 * @see admittance.AdmittancePackage#getReflexTestType_AdmittanceMeasurementCondition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AdmittanceMeasurementCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	AdmittanceMeasurementConditionType getAdmittanceMeasurementCondition();

	/**
	 * Sets the value of the '{@link admittance.ReflexTestType#getAdmittanceMeasurementCondition <em>Admittance Measurement Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admittance Measurement Condition</em>' containment reference.
	 * @see #getAdmittanceMeasurementCondition()
	 * @generated
	 */
	void setAdmittanceMeasurementCondition(AdmittanceMeasurementConditionType value);

} // ReflexTestType
