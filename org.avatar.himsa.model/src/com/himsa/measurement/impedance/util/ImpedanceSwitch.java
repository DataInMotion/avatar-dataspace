/**
 */
package com.himsa.measurement.impedance.util;

import com.himsa.measurement.impedance.*;

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
 * @see com.himsa.measurement.impedance.ImpedancePackage
 * @generated
 */
public class ImpedanceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ImpedancePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpedanceSwitch() {
		if (modelPackage == null) {
			modelPackage = ImpedancePackage.eINSTANCE;
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
			case ImpedancePackage.ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT_TYPE: {
				AcousticImpedanceCompleteMeasurementType acousticImpedanceCompleteMeasurementType = (AcousticImpedanceCompleteMeasurementType)theEObject;
				T result = caseAcousticImpedanceCompleteMeasurementType(acousticImpedanceCompleteMeasurementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImpedancePackage.COMPLIANCE_CURVE_TYPE: {
				ComplianceCurveType complianceCurveType = (ComplianceCurveType)theEObject;
				T result = caseComplianceCurveType(complianceCurveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImpedancePackage.COMPLIANCE_POINT_TYPE: {
				CompliancePointType compliancePointType = (CompliancePointType)theEObject;
				T result = caseCompliancePointType(compliancePointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImpedancePackage.COMPLIANCE_TYPE: {
				ComplianceType complianceType = (ComplianceType)theEObject;
				T result = caseComplianceType(complianceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImpedancePackage.COMPLIANCE_UNIT_TYPE: {
				ComplianceUnitType complianceUnitType = (ComplianceUnitType)theEObject;
				T result = caseComplianceUnitType(complianceUnitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImpedancePackage.COMPLIANCE_VALUE_TYPE: {
				ComplianceValueType complianceValueType = (ComplianceValueType)theEObject;
				T result = caseComplianceValueType(complianceValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImpedancePackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST: {
				EustachianTubeFunctionIntactEarDrumTest eustachianTubeFunctionIntactEarDrumTest = (EustachianTubeFunctionIntactEarDrumTest)theEObject;
				T result = caseEustachianTubeFunctionIntactEarDrumTest(eustachianTubeFunctionIntactEarDrumTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImpedancePackage.EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST: {
				EustachianTubeFunctionPerforatedEarDrumTest eustachianTubeFunctionPerforatedEarDrumTest = (EustachianTubeFunctionPerforatedEarDrumTest)theEObject;
				T result = caseEustachianTubeFunctionPerforatedEarDrumTest(eustachianTubeFunctionPerforatedEarDrumTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImpedancePackage.GRADIENT_TYPE: {
				GradientType gradientType = (GradientType)theEObject;
				T result = caseGradientType(gradientType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE: {
				ImpedanceMeasurementConditionType impedanceMeasurementConditionType = (ImpedanceMeasurementConditionType)theEObject;
				T result = caseImpedanceMeasurementConditionType(impedanceMeasurementConditionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImpedancePackage.PRESSURE_POINT_TYPE: {
				PressurePointType pressurePointType = (PressurePointType)theEObject;
				T result = casePressurePointType(pressurePointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImpedancePackage.REFLEX_CURVE_TYPE: {
				ReflexCurveType reflexCurveType = (ReflexCurveType)theEObject;
				T result = caseReflexCurveType(reflexCurveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImpedancePackage.REFLEX_POINT_TYPE: {
				ReflexPointType reflexPointType = (ReflexPointType)theEObject;
				T result = caseReflexPointType(reflexPointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImpedancePackage.REFLEX_TEST_TYPE: {
				ReflexTestType reflexTestType = (ReflexTestType)theEObject;
				T result = caseReflexTestType(reflexTestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImpedancePackage.TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE: {
				TympanogramMeasurementConditionsType tympanogramMeasurementConditionsType = (TympanogramMeasurementConditionsType)theEObject;
				T result = caseTympanogramMeasurementConditionsType(tympanogramMeasurementConditionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE: {
				TympanogramTestType tympanogramTestType = (TympanogramTestType)theEObject;
				T result = caseTympanogramTestType(tympanogramTestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acoustic Impedance Complete Measurement Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acoustic Impedance Complete Measurement Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcousticImpedanceCompleteMeasurementType(AcousticImpedanceCompleteMeasurementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compliance Curve Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compliance Curve Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplianceCurveType(ComplianceCurveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compliance Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compliance Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompliancePointType(CompliancePointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compliance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compliance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplianceType(ComplianceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compliance Unit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compliance Unit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplianceUnitType(ComplianceUnitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compliance Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compliance Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplianceValueType(ComplianceValueType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Eustachian Tube Function Intact Ear Drum Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eustachian Tube Function Intact Ear Drum Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEustachianTubeFunctionIntactEarDrumTest(EustachianTubeFunctionIntactEarDrumTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eustachian Tube Function Perforated Ear Drum Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eustachian Tube Function Perforated Ear Drum Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEustachianTubeFunctionPerforatedEarDrumTest(EustachianTubeFunctionPerforatedEarDrumTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gradient Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gradient Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGradientType(GradientType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Condition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Condition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImpedanceMeasurementConditionType(ImpedanceMeasurementConditionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pressure Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pressure Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePressurePointType(PressurePointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reflex Curve Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reflex Curve Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReflexCurveType(ReflexCurveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reflex Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reflex Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReflexPointType(ReflexPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reflex Test Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reflex Test Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReflexTestType(ReflexTestType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tympanogram Measurement Conditions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tympanogram Measurement Conditions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTympanogramMeasurementConditionsType(TympanogramMeasurementConditionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tympanogram Test Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tympanogram Test Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTympanogramTestType(TympanogramTestType object) {
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

} //ImpedanceSwitch
