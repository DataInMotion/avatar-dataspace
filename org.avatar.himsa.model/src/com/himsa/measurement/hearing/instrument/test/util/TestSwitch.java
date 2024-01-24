/**
 */
package com.himsa.measurement.hearing.instrument.test.util;

import com.himsa.measurement.hearing.instrument.test.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.himsa.measurement.hearing.instrument.test.TestPackage
 * @generated
 */
public class TestSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TestPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestSwitch() {
		if (modelPackage == null) {
			modelPackage = TestPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TestPackage.ATTACK_RELEASE_MEASUREMENT_POINT: {
				AttackReleaseMeasurementPoint attackReleaseMeasurementPoint = (AttackReleaseMeasurementPoint)theEObject;
				T result = caseAttackReleaseMeasurementPoint(attackReleaseMeasurementPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.BATTERY_CURRENT_MEASUREMENT: {
				BatteryCurrentMeasurement batteryCurrentMeasurement = (BatteryCurrentMeasurement)theEObject;
				T result = caseBatteryCurrentMeasurement(batteryCurrentMeasurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.BATTERY_MEASUREMENT_CONDITIONS: {
				BatteryMeasurementConditions batteryMeasurementConditions = (BatteryMeasurementConditions)theEObject;
				T result = caseBatteryMeasurementConditions(batteryMeasurementConditions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.BATTERY_MEASUREMENT_POINT: {
				BatteryMeasurementPoint batteryMeasurementPoint = (BatteryMeasurementPoint)theEObject;
				T result = caseBatteryMeasurementPoint(batteryMeasurementPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.EQUIVALENT_INPUT_NOISE: {
				EquivalentInputNoise equivalentInputNoise = (EquivalentInputNoise)theEObject;
				T result = caseEquivalentInputNoise(equivalentInputNoise);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.FREQUENCY_MEASUREMENT: {
				FrequencyMeasurement frequencyMeasurement = (FrequencyMeasurement)theEObject;
				T result = caseFrequencyMeasurement(frequencyMeasurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.FREQUENCY_MEASUREMENT_POINT: {
				FrequencyMeasurementPoint frequencyMeasurementPoint = (FrequencyMeasurementPoint)theEObject;
				T result = caseFrequencyMeasurementPoint(frequencyMeasurementPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.FULL_TARGET_CURVE: {
				FullTargetCurve fullTargetCurve = (FullTargetCurve)theEObject;
				T result = caseFullTargetCurve(fullTargetCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.HARMONIC_DISTORTION_MEASUREMENT_CURVE: {
				HarmonicDistortionMeasurementCurve harmonicDistortionMeasurementCurve = (HarmonicDistortionMeasurementCurve)theEObject;
				T result = caseHarmonicDistortionMeasurementCurve(harmonicDistortionMeasurementCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.HARMONIC_DISTORTION_POINT: {
				HarmonicDistortionPoint harmonicDistortionPoint = (HarmonicDistortionPoint)theEObject;
				T result = caseHarmonicDistortionPoint(harmonicDistortionPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.HEARING_INSTRUMENT_TEST_TYPE: {
				HearingInstrumentTestType hearingInstrumentTestType = (HearingInstrumentTestType)theEObject;
				T result = caseHearingInstrumentTestType(hearingInstrumentTestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.HIMSA_HIT_STANDARD_TYPE: {
				HIMSAHitStandardType himsaHitStandardType = (HIMSAHitStandardType)theEObject;
				T result = caseHIMSAHitStandardType(himsaHitStandardType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.INPUT_OUTPUT_MEASUREMENT: {
				InputOutputMeasurement inputOutputMeasurement = (InputOutputMeasurement)theEObject;
				T result = caseInputOutputMeasurement(inputOutputMeasurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.INPUT_OUTPUT_POINT: {
				InputOutputPoint inputOutputPoint = (InputOutputPoint)theEObject;
				T result = caseInputOutputPoint(inputOutputPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.INTERMODULATION_DISTORTION_MEASUREMENT: {
				IntermodulationDistortionMeasurement intermodulationDistortionMeasurement = (IntermodulationDistortionMeasurement)theEObject;
				T result = caseIntermodulationDistortionMeasurement(intermodulationDistortionMeasurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.INTERMODULATION_DISTORTION_POINT: {
				IntermodulationDistortionPoint intermodulationDistortionPoint = (IntermodulationDistortionPoint)theEObject;
				T result = caseIntermodulationDistortionPoint(intermodulationDistortionPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.MEASUREMENT_CONDITIONS: {
				MeasurementConditions measurementConditions = (MeasurementConditions)theEObject;
				T result = caseMeasurementConditions(measurementConditions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.OCCLUSION_EFFECTS: {
				OcclusionEffects occlusionEffects = (OcclusionEffects)theEObject;
				T result = caseOcclusionEffects(occlusionEffects);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.REAL_EAR_COUPLER_DIFFERENCE: {
				RealEarCouplerDifference realEarCouplerDifference = (RealEarCouplerDifference)theEObject;
				T result = caseRealEarCouplerDifference(realEarCouplerDifference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.TARGET_CURVE: {
				TargetCurve targetCurve = (TargetCurve)theEObject;
				T result = caseTargetCurve(targetCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.TARGET_MEASUREMENT: {
				TargetMeasurement targetMeasurement = (TargetMeasurement)theEObject;
				T result = caseTargetMeasurement(targetMeasurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.TARGET_MEASUREMENT_POINT: {
				TargetMeasurementPoint targetMeasurementPoint = (TargetMeasurementPoint)theEObject;
				T result = caseTargetMeasurementPoint(targetMeasurementPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestPackage.TARGET_POINT: {
				TargetPoint targetPoint = (TargetPoint)theEObject;
				T result = caseTargetPoint(targetPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attack Release Measurement Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attack Release Measurement Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttackReleaseMeasurementPoint(AttackReleaseMeasurementPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Battery Current Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Battery Current Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBatteryCurrentMeasurement(BatteryCurrentMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Battery Measurement Conditions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Battery Measurement Conditions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBatteryMeasurementConditions(BatteryMeasurementConditions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Battery Measurement Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Battery Measurement Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBatteryMeasurementPoint(BatteryMeasurementPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equivalent Input Noise</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equivalent Input Noise</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquivalentInputNoise(EquivalentInputNoise object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frequency Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frequency Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrequencyMeasurement(FrequencyMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frequency Measurement Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frequency Measurement Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrequencyMeasurementPoint(FrequencyMeasurementPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Full Target Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Full Target Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFullTargetCurve(FullTargetCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Harmonic Distortion Measurement Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Harmonic Distortion Measurement Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHarmonicDistortionMeasurementCurve(HarmonicDistortionMeasurementCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Harmonic Distortion Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Harmonic Distortion Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHarmonicDistortionPoint(HarmonicDistortionPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hearing Instrument Test Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hearing Instrument Test Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHearingInstrumentTestType(HearingInstrumentTestType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HIMSA Hit Standard Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HIMSA Hit Standard Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHIMSAHitStandardType(HIMSAHitStandardType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Output Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Output Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputOutputMeasurement(InputOutputMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Output Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Output Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputOutputPoint(InputOutputPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intermodulation Distortion Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intermodulation Distortion Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermodulationDistortionMeasurement(IntermodulationDistortionMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intermodulation Distortion Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intermodulation Distortion Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermodulationDistortionPoint(IntermodulationDistortionPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Conditions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Conditions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementConditions(MeasurementConditions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Occlusion Effects</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Occlusion Effects</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOcclusionEffects(OcclusionEffects object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Ear Coupler Difference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Ear Coupler Difference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealEarCouplerDifference(RealEarCouplerDifference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetCurve(TargetCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetMeasurement(TargetMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Measurement Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Measurement Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetMeasurementPoint(TargetMeasurementPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetPoint(TargetPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TestSwitch
