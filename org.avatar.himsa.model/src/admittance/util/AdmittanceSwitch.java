/**
 */
package admittance.util;

import admittance.*;

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
 * @see admittance.AdmittancePackage
 * @generated
 */
public class AdmittanceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AdmittancePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdmittanceSwitch() {
		if (modelPackage == null) {
			modelPackage = AdmittancePackage.eINSTANCE;
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
			case AdmittancePackage.ACOUSTIC_IMMITTANCE_ASSESSMENT_TYPE: {
				AcousticImmittanceAssessmentType acousticImmittanceAssessmentType = (AcousticImmittanceAssessmentType)theEObject;
				T result = caseAcousticImmittanceAssessmentType(acousticImmittanceAssessmentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.ADMITTANCE_CURVE_TYPE: {
				AdmittanceCurveType admittanceCurveType = (AdmittanceCurveType)theEObject;
				T result = caseAdmittanceCurveType(admittanceCurveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.ADMITTANCE_MEASUREMENT_CONDITION_TYPE: {
				AdmittanceMeasurementConditionType admittanceMeasurementConditionType = (AdmittanceMeasurementConditionType)theEObject;
				T result = caseAdmittanceMeasurementConditionType(admittanceMeasurementConditionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.ADMITTANCE_TYPE: {
				AdmittanceType admittanceType = (AdmittanceType)theEObject;
				T result = caseAdmittanceType(admittanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.ADMITTANCE_UNIT_CALCULATED_TYPE: {
				AdmittanceUnitCalculatedType admittanceUnitCalculatedType = (AdmittanceUnitCalculatedType)theEObject;
				T result = caseAdmittanceUnitCalculatedType(admittanceUnitCalculatedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.ADMITTANCE_UNIT_MEASURED_TYPE: {
				AdmittanceUnitMeasuredType admittanceUnitMeasuredType = (AdmittanceUnitMeasuredType)theEObject;
				T result = caseAdmittanceUnitMeasuredType(admittanceUnitMeasuredType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.ADMITTANCE_UNIT_TYPE: {
				AdmittanceUnitType admittanceUnitType = (AdmittanceUnitType)theEObject;
				T result = caseAdmittanceUnitType(admittanceUnitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.ADMITTANCE_VALUE_CALCULATED_TYPE: {
				AdmittanceValueCalculatedType admittanceValueCalculatedType = (AdmittanceValueCalculatedType)theEObject;
				T result = caseAdmittanceValueCalculatedType(admittanceValueCalculatedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.ADMITTANCE_VALUE_MEASURED_TYPE: {
				AdmittanceValueMeasuredType admittanceValueMeasuredType = (AdmittanceValueMeasuredType)theEObject;
				T result = caseAdmittanceValueMeasuredType(admittanceValueMeasuredType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.ADMITTANCE_VALUE_POINT_CALCULATED_TYPE: {
				AdmittanceValuePointCalculatedType admittanceValuePointCalculatedType = (AdmittanceValuePointCalculatedType)theEObject;
				T result = caseAdmittanceValuePointCalculatedType(admittanceValuePointCalculatedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.ADMITTANCE_VALUE_POINT_MEASURED_TYPE: {
				AdmittanceValuePointMeasuredType admittanceValuePointMeasuredType = (AdmittanceValuePointMeasuredType)theEObject;
				T result = caseAdmittanceValuePointMeasuredType(admittanceValuePointMeasuredType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.ADMITTANCE_VALUE_TYPE: {
				AdmittanceValueType admittanceValueType = (AdmittanceValueType)theEObject;
				T result = caseAdmittanceValueType(admittanceValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.CALCULATED_ADMITTANCE_POINTS_TYPE: {
				CalculatedAdmittancePointsType calculatedAdmittancePointsType = (CalculatedAdmittancePointsType)theEObject;
				T result = caseCalculatedAdmittancePointsType(calculatedAdmittancePointsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.CALCULATED_TYPE: {
				CalculatedType calculatedType = (CalculatedType)theEObject;
				T result = caseCalculatedType(calculatedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.CALCULATED_TYPE1: {
				CalculatedType1 calculatedType1 = (CalculatedType1)theEObject;
				T result = caseCalculatedType1(calculatedType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.DELTA_YPOINTS_TYPE: {
				DeltaYPointsType deltaYPointsType = (DeltaYPointsType)theEObject;
				T result = caseDeltaYPointsType(deltaYPointsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.DELTA_YTYPE: {
				DeltaYType deltaYType = (DeltaYType)theEObject;
				T result = caseDeltaYType(deltaYType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_INTACT_EAR_DRUM_TEST: {
				EustachianTubeFunctionIntactEarDrumTest eustachianTubeFunctionIntactEarDrumTest = (EustachianTubeFunctionIntactEarDrumTest)theEObject;
				T result = caseEustachianTubeFunctionIntactEarDrumTest(eustachianTubeFunctionIntactEarDrumTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.EUSTACHIAN_TUBE_FUNCTION_PERFORATED_EAR_DRUM_TEST: {
				EustachianTubeFunctionPerforatedEarDrumTest eustachianTubeFunctionPerforatedEarDrumTest = (EustachianTubeFunctionPerforatedEarDrumTest)theEObject;
				T result = caseEustachianTubeFunctionPerforatedEarDrumTest(eustachianTubeFunctionPerforatedEarDrumTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.GRADIENT_TYPE: {
				GradientType gradientType = (GradientType)theEObject;
				T result = caseGradientType(gradientType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.INFORMATION_TYPE: {
				InformationType informationType = (InformationType)theEObject;
				T result = caseInformationType(informationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.MEASURED_ADMITTANCE_POINTS_TYPE: {
				MeasuredAdmittancePointsType measuredAdmittancePointsType = (MeasuredAdmittancePointsType)theEObject;
				T result = caseMeasuredAdmittancePointsType(measuredAdmittancePointsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.MEASURED_TYPE: {
				MeasuredType measuredType = (MeasuredType)theEObject;
				T result = caseMeasuredType(measuredType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.MEASURED_TYPE1: {
				MeasuredType1 measuredType1 = (MeasuredType1)theEObject;
				T result = caseMeasuredType1(measuredType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.MEASUREMENT_NOTES_TYPE: {
				MeasurementNotesType measurementNotesType = (MeasurementNotesType)theEObject;
				T result = caseMeasurementNotesType(measurementNotesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.NUMERIC_DELTA_TYPE: {
				NumericDeltaType numericDeltaType = (NumericDeltaType)theEObject;
				T result = caseNumericDeltaType(numericDeltaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.NUMERIC_DELTA_YPOINTS_TYPE: {
				NumericDeltaYPointsType numericDeltaYPointsType = (NumericDeltaYPointsType)theEObject;
				T result = caseNumericDeltaYPointsType(numericDeltaYPointsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.PRESSURE_POINT_TYPE: {
				PressurePointType pressurePointType = (PressurePointType)theEObject;
				T result = casePressurePointType(pressurePointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.PROBE_FREQUENCY_TYPE: {
				ProbeFrequencyType probeFrequencyType = (ProbeFrequencyType)theEObject;
				T result = caseProbeFrequencyType(probeFrequencyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.REFLEX_CURVE_TYPE: {
				ReflexCurveType reflexCurveType = (ReflexCurveType)theEObject;
				T result = caseReflexCurveType(reflexCurveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.REFLEX_TEST_TYPE: {
				ReflexTestType reflexTestType = (ReflexTestType)theEObject;
				T result = caseReflexTestType(reflexTestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.REFLEX_VALUE_POINT_CALCULATED_TYPE: {
				ReflexValuePointCalculatedType reflexValuePointCalculatedType = (ReflexValuePointCalculatedType)theEObject;
				T result = caseReflexValuePointCalculatedType(reflexValuePointCalculatedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.REFLEX_VALUE_POINT_MEASURED_TYPE: {
				ReflexValuePointMeasuredType reflexValuePointMeasuredType = (ReflexValuePointMeasuredType)theEObject;
				T result = caseReflexValuePointMeasuredType(reflexValuePointMeasuredType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.RESULT_OF_REFLEX_TEST_TYPE: {
				ResultOfReflexTestType resultOfReflexTestType = (ResultOfReflexTestType)theEObject;
				T result = caseResultOfReflexTestType(resultOfReflexTestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.SIGNAL_LEVEL_TYPE: {
				SignalLevelType signalLevelType = (SignalLevelType)theEObject;
				T result = caseSignalLevelType(signalLevelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.STATIC_ADMITTANCE_TYPE: {
				StaticAdmittanceType staticAdmittanceType = (StaticAdmittanceType)theEObject;
				T result = caseStaticAdmittanceType(staticAdmittanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.SUPPLEMENTARY_DATA_TYPE: {
				SupplementaryDataType supplementaryDataType = (SupplementaryDataType)theEObject;
				T result = caseSupplementaryDataType(supplementaryDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE: {
				TympanogramMeasurementConditionsType tympanogramMeasurementConditionsType = (TympanogramMeasurementConditionsType)theEObject;
				T result = caseTympanogramMeasurementConditionsType(tympanogramMeasurementConditionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdmittancePackage.TYMPANOGRAM_TEST_TYPE: {
				TympanogramTestType tympanogramTestType = (TympanogramTestType)theEObject;
				T result = caseTympanogramTestType(tympanogramTestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acoustic Immittance Assessment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acoustic Immittance Assessment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcousticImmittanceAssessmentType(AcousticImmittanceAssessmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curve Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curve Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdmittanceCurveType(AdmittanceCurveType object) {
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
	public T caseAdmittanceMeasurementConditionType(AdmittanceMeasurementConditionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdmittanceType(AdmittanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Calculated Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Calculated Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdmittanceUnitCalculatedType(AdmittanceUnitCalculatedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Measured Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Measured Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdmittanceUnitMeasuredType(AdmittanceUnitMeasuredType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdmittanceUnitType(AdmittanceUnitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Calculated Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Calculated Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdmittanceValueCalculatedType(AdmittanceValueCalculatedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Measured Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Measured Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdmittanceValueMeasuredType(AdmittanceValueMeasuredType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Point Calculated Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Point Calculated Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdmittanceValuePointCalculatedType(AdmittanceValuePointCalculatedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Point Measured Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Point Measured Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdmittanceValuePointMeasuredType(AdmittanceValuePointMeasuredType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdmittanceValueType(AdmittanceValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculated Admittance Points Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculated Admittance Points Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculatedAdmittancePointsType(CalculatedAdmittancePointsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculated Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculated Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculatedType(CalculatedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculated Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculated Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculatedType1(CalculatedType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delta YPoints Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delta YPoints Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeltaYPointsType(DeltaYPointsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delta YType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delta YType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeltaYType(DeltaYType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Information Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationType(InformationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measured Admittance Points Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measured Admittance Points Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasuredAdmittancePointsType(MeasuredAdmittancePointsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measured Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measured Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasuredType(MeasuredType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measured Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measured Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasuredType1(MeasuredType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Notes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Notes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementNotesType(MeasurementNotesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Delta Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Delta Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericDeltaType(NumericDeltaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Delta YPoints Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Delta YPoints Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericDeltaYPointsType(NumericDeltaYPointsType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Probe Frequency Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Probe Frequency Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProbeFrequencyType(ProbeFrequencyType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Reflex Value Point Calculated Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reflex Value Point Calculated Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReflexValuePointCalculatedType(ReflexValuePointCalculatedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reflex Value Point Measured Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reflex Value Point Measured Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReflexValuePointMeasuredType(ReflexValuePointMeasuredType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Of Reflex Test Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Of Reflex Test Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultOfReflexTestType(ResultOfReflexTestType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Level Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Level Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalLevelType(SignalLevelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Admittance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Admittance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticAdmittanceType(StaticAdmittanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supplementary Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supplementary Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupplementaryDataType(SupplementaryDataType object) {
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

} //AdmittanceSwitch
