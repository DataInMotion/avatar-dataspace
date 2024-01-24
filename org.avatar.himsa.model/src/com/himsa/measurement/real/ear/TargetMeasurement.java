/*
 */
package com.himsa.measurement.real.ear;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Attack / Recovery Measurement. A complete curve set containing a full
 * Attack/Release test.
 * 
 * ## TARMeas ##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.real.ear.TargetMeasurement#getMeasurementConditions <em>Measurement Conditions</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.TargetMeasurement#getLevelStep <em>Level Step</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.TargetMeasurement#getAttackCurve <em>Attack Curve</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.TargetMeasurement#getReleaseCurve <em>Release Curve</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.real.ear.EarPackage#getTargetMeasurement()
 * @model extendedMetaData="name='TargetMeasurement' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TargetMeasurement extends EObject {
	/**
	 * Returns the value of the '<em><b>Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * REM Measurement Conditions.
	 * 
	 * ## TRHMeasCond ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measurement Conditions</em>' containment reference.
	 * @see #setMeasurementConditions(MeasurementConditions)
	 * @see com.himsa.measurement.real.ear.EarPackage#getTargetMeasurement_MeasurementConditions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MeasurementConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasurementConditions getMeasurementConditions();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.real.ear.TargetMeasurement#getMeasurementConditions <em>Measurement Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Conditions</em>' containment reference.
	 * @see #getMeasurementConditions()
	 * @generated
	 */
	void setMeasurementConditions(MeasurementConditions value);

	/**
	 * Returns the value of the '<em><b>Level Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Input Level step size from the start level defined in Measurement Conditions.
	 * The input used is a sine wave. At Attack is used Level Increase,
	 * at Release is used Level Decrease. The Level Step has to be
	 * performed at a zero crossing.
	 * 
	 * 
	 * ##levelStep##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Level Step</em>' attribute.
	 * @see #setLevelStep(BigDecimal)
	 * @see com.himsa.measurement.real.ear.EarPackage#getTargetMeasurement_LevelStep()
	 * @model dataType="com.himsa.measurement.real.ear.LevelStepType" required="true"
	 *        extendedMetaData="kind='element' name='LevelStep' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getLevelStep();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.real.ear.TargetMeasurement#getLevelStep <em>Level Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level Step</em>' attribute.
	 * @see #getLevelStep()
	 * @generated
	 */
	void setLevelStep(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Attack Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The result of an Attack Measurement.
	 * 
	 * ##attackCrv##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attack Curve</em>' containment reference.
	 * @see #setAttackCurve(TargetCurve)
	 * @see com.himsa.measurement.real.ear.EarPackage#getTargetMeasurement_AttackCurve()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AttackCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetCurve getAttackCurve();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.real.ear.TargetMeasurement#getAttackCurve <em>Attack Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attack Curve</em>' containment reference.
	 * @see #getAttackCurve()
	 * @generated
	 */
	void setAttackCurve(TargetCurve value);

	/**
	 * Returns the value of the '<em><b>Release Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The curve where the stimulus level decreases.
	 * 
	 * 
	 * ##releaseCrv##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Release Curve</em>' containment reference.
	 * @see #setReleaseCurve(TargetCurve)
	 * @see com.himsa.measurement.real.ear.EarPackage#getTargetMeasurement_ReleaseCurve()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ReleaseCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetCurve getReleaseCurve();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.real.ear.TargetMeasurement#getReleaseCurve <em>Release Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Curve</em>' containment reference.
	 * @see #getReleaseCurve()
	 * @generated
	 */
	void setReleaseCurve(TargetCurve value);

} // TargetMeasurement
