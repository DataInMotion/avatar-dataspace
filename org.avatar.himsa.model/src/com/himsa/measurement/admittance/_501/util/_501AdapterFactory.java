/**
 */
package com.himsa.measurement.admittance._501.util;

import com.himsa.measurement.admittance._501.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.himsa.measurement.admittance._501._501Package
 * @generated
 */
public class _501AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _501Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _501AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = _501Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected _501Switch<Adapter> modelSwitch =
		new _501Switch<Adapter>() {
			@Override
			public Adapter caseAcousticImmittanceAssessmentType(AcousticImmittanceAssessmentType object) {
				return createAcousticImmittanceAssessmentTypeAdapter();
			}
			@Override
			public Adapter caseAdmittanceCurveType(AdmittanceCurveType object) {
				return createAdmittanceCurveTypeAdapter();
			}
			@Override
			public Adapter caseAdmittanceMeasurementConditionType(AdmittanceMeasurementConditionType object) {
				return createAdmittanceMeasurementConditionTypeAdapter();
			}
			@Override
			public Adapter caseAdmittanceType(AdmittanceType object) {
				return createAdmittanceTypeAdapter();
			}
			@Override
			public Adapter caseAdmittanceUnitCalculatedType(AdmittanceUnitCalculatedType object) {
				return createAdmittanceUnitCalculatedTypeAdapter();
			}
			@Override
			public Adapter caseAdmittanceUnitMeasuredType(AdmittanceUnitMeasuredType object) {
				return createAdmittanceUnitMeasuredTypeAdapter();
			}
			@Override
			public Adapter caseAdmittanceUnitType(AdmittanceUnitType object) {
				return createAdmittanceUnitTypeAdapter();
			}
			@Override
			public Adapter caseAdmittanceValueCalculatedType(AdmittanceValueCalculatedType object) {
				return createAdmittanceValueCalculatedTypeAdapter();
			}
			@Override
			public Adapter caseAdmittanceValueMeasuredType(AdmittanceValueMeasuredType object) {
				return createAdmittanceValueMeasuredTypeAdapter();
			}
			@Override
			public Adapter caseAdmittanceValuePointCalculatedType(AdmittanceValuePointCalculatedType object) {
				return createAdmittanceValuePointCalculatedTypeAdapter();
			}
			@Override
			public Adapter caseAdmittanceValuePointMeasuredType(AdmittanceValuePointMeasuredType object) {
				return createAdmittanceValuePointMeasuredTypeAdapter();
			}
			@Override
			public Adapter caseAdmittanceValueType(AdmittanceValueType object) {
				return createAdmittanceValueTypeAdapter();
			}
			@Override
			public Adapter caseCalculatedAdmittancePointsType(CalculatedAdmittancePointsType object) {
				return createCalculatedAdmittancePointsTypeAdapter();
			}
			@Override
			public Adapter caseCalculatedType(CalculatedType object) {
				return createCalculatedTypeAdapter();
			}
			@Override
			public Adapter caseCalculatedType1(CalculatedType1 object) {
				return createCalculatedType1Adapter();
			}
			@Override
			public Adapter caseDeltaYPointsType(DeltaYPointsType object) {
				return createDeltaYPointsTypeAdapter();
			}
			@Override
			public Adapter caseDeltaYType(DeltaYType object) {
				return createDeltaYTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEustachianTubeFunctionIntactEarDrumTest(EustachianTubeFunctionIntactEarDrumTest object) {
				return createEustachianTubeFunctionIntactEarDrumTestAdapter();
			}
			@Override
			public Adapter caseEustachianTubeFunctionPerforatedEarDrumTest(EustachianTubeFunctionPerforatedEarDrumTest object) {
				return createEustachianTubeFunctionPerforatedEarDrumTestAdapter();
			}
			@Override
			public Adapter caseGradientType(GradientType object) {
				return createGradientTypeAdapter();
			}
			@Override
			public Adapter caseInformationType(InformationType object) {
				return createInformationTypeAdapter();
			}
			@Override
			public Adapter caseMeasuredAdmittancePointsType(MeasuredAdmittancePointsType object) {
				return createMeasuredAdmittancePointsTypeAdapter();
			}
			@Override
			public Adapter caseMeasuredType(MeasuredType object) {
				return createMeasuredTypeAdapter();
			}
			@Override
			public Adapter caseMeasuredType1(MeasuredType1 object) {
				return createMeasuredType1Adapter();
			}
			@Override
			public Adapter caseMeasurementNotesType(MeasurementNotesType object) {
				return createMeasurementNotesTypeAdapter();
			}
			@Override
			public Adapter caseNumericDeltaType(NumericDeltaType object) {
				return createNumericDeltaTypeAdapter();
			}
			@Override
			public Adapter caseNumericDeltaYPointsType(NumericDeltaYPointsType object) {
				return createNumericDeltaYPointsTypeAdapter();
			}
			@Override
			public Adapter casePressurePointType(PressurePointType object) {
				return createPressurePointTypeAdapter();
			}
			@Override
			public Adapter caseProbeFrequencyType(ProbeFrequencyType object) {
				return createProbeFrequencyTypeAdapter();
			}
			@Override
			public Adapter caseReflexCurveType(ReflexCurveType object) {
				return createReflexCurveTypeAdapter();
			}
			@Override
			public Adapter caseReflexTestType(ReflexTestType object) {
				return createReflexTestTypeAdapter();
			}
			@Override
			public Adapter caseReflexValuePointCalculatedType(ReflexValuePointCalculatedType object) {
				return createReflexValuePointCalculatedTypeAdapter();
			}
			@Override
			public Adapter caseReflexValuePointMeasuredType(ReflexValuePointMeasuredType object) {
				return createReflexValuePointMeasuredTypeAdapter();
			}
			@Override
			public Adapter caseResultOfReflexTestType(ResultOfReflexTestType object) {
				return createResultOfReflexTestTypeAdapter();
			}
			@Override
			public Adapter caseSignalLevelType(SignalLevelType object) {
				return createSignalLevelTypeAdapter();
			}
			@Override
			public Adapter caseStaticAdmittanceType(StaticAdmittanceType object) {
				return createStaticAdmittanceTypeAdapter();
			}
			@Override
			public Adapter caseSupplementaryDataType(SupplementaryDataType object) {
				return createSupplementaryDataTypeAdapter();
			}
			@Override
			public Adapter caseTympanogramMeasurementConditionsType(TympanogramMeasurementConditionsType object) {
				return createTympanogramMeasurementConditionsTypeAdapter();
			}
			@Override
			public Adapter caseTympanogramTestType(TympanogramTestType object) {
				return createTympanogramTestTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.AcousticImmittanceAssessmentType <em>Acoustic Immittance Assessment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.AcousticImmittanceAssessmentType
	 * @generated
	 */
	public Adapter createAcousticImmittanceAssessmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.AdmittanceCurveType <em>Admittance Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.AdmittanceCurveType
	 * @generated
	 */
	public Adapter createAdmittanceCurveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.AdmittanceMeasurementConditionType <em>Admittance Measurement Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.AdmittanceMeasurementConditionType
	 * @generated
	 */
	public Adapter createAdmittanceMeasurementConditionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.AdmittanceType <em>Admittance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.AdmittanceType
	 * @generated
	 */
	public Adapter createAdmittanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.AdmittanceUnitCalculatedType <em>Admittance Unit Calculated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.AdmittanceUnitCalculatedType
	 * @generated
	 */
	public Adapter createAdmittanceUnitCalculatedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.AdmittanceUnitMeasuredType <em>Admittance Unit Measured Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.AdmittanceUnitMeasuredType
	 * @generated
	 */
	public Adapter createAdmittanceUnitMeasuredTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.AdmittanceUnitType <em>Admittance Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.AdmittanceUnitType
	 * @generated
	 */
	public Adapter createAdmittanceUnitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.AdmittanceValueCalculatedType <em>Admittance Value Calculated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.AdmittanceValueCalculatedType
	 * @generated
	 */
	public Adapter createAdmittanceValueCalculatedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.AdmittanceValueMeasuredType <em>Admittance Value Measured Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.AdmittanceValueMeasuredType
	 * @generated
	 */
	public Adapter createAdmittanceValueMeasuredTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.AdmittanceValuePointCalculatedType <em>Admittance Value Point Calculated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.AdmittanceValuePointCalculatedType
	 * @generated
	 */
	public Adapter createAdmittanceValuePointCalculatedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.AdmittanceValuePointMeasuredType <em>Admittance Value Point Measured Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.AdmittanceValuePointMeasuredType
	 * @generated
	 */
	public Adapter createAdmittanceValuePointMeasuredTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.AdmittanceValueType <em>Admittance Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.AdmittanceValueType
	 * @generated
	 */
	public Adapter createAdmittanceValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.CalculatedAdmittancePointsType <em>Calculated Admittance Points Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.CalculatedAdmittancePointsType
	 * @generated
	 */
	public Adapter createCalculatedAdmittancePointsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.CalculatedType <em>Calculated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.CalculatedType
	 * @generated
	 */
	public Adapter createCalculatedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.CalculatedType1 <em>Calculated Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.CalculatedType1
	 * @generated
	 */
	public Adapter createCalculatedType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.DeltaYPointsType <em>Delta YPoints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.DeltaYPointsType
	 * @generated
	 */
	public Adapter createDeltaYPointsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.DeltaYType <em>Delta YType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.DeltaYType
	 * @generated
	 */
	public Adapter createDeltaYTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.EustachianTubeFunctionIntactEarDrumTest <em>Eustachian Tube Function Intact Ear Drum Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.EustachianTubeFunctionIntactEarDrumTest
	 * @generated
	 */
	public Adapter createEustachianTubeFunctionIntactEarDrumTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.EustachianTubeFunctionPerforatedEarDrumTest <em>Eustachian Tube Function Perforated Ear Drum Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.EustachianTubeFunctionPerforatedEarDrumTest
	 * @generated
	 */
	public Adapter createEustachianTubeFunctionPerforatedEarDrumTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.GradientType <em>Gradient Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.GradientType
	 * @generated
	 */
	public Adapter createGradientTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.InformationType <em>Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.InformationType
	 * @generated
	 */
	public Adapter createInformationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.MeasuredAdmittancePointsType <em>Measured Admittance Points Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.MeasuredAdmittancePointsType
	 * @generated
	 */
	public Adapter createMeasuredAdmittancePointsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.MeasuredType <em>Measured Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.MeasuredType
	 * @generated
	 */
	public Adapter createMeasuredTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.MeasuredType1 <em>Measured Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.MeasuredType1
	 * @generated
	 */
	public Adapter createMeasuredType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.MeasurementNotesType <em>Measurement Notes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.MeasurementNotesType
	 * @generated
	 */
	public Adapter createMeasurementNotesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.NumericDeltaType <em>Numeric Delta Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.NumericDeltaType
	 * @generated
	 */
	public Adapter createNumericDeltaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.NumericDeltaYPointsType <em>Numeric Delta YPoints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.NumericDeltaYPointsType
	 * @generated
	 */
	public Adapter createNumericDeltaYPointsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.PressurePointType <em>Pressure Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.PressurePointType
	 * @generated
	 */
	public Adapter createPressurePointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.ProbeFrequencyType <em>Probe Frequency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.ProbeFrequencyType
	 * @generated
	 */
	public Adapter createProbeFrequencyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.ReflexCurveType <em>Reflex Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.ReflexCurveType
	 * @generated
	 */
	public Adapter createReflexCurveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.ReflexTestType <em>Reflex Test Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.ReflexTestType
	 * @generated
	 */
	public Adapter createReflexTestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.ReflexValuePointCalculatedType <em>Reflex Value Point Calculated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.ReflexValuePointCalculatedType
	 * @generated
	 */
	public Adapter createReflexValuePointCalculatedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.ReflexValuePointMeasuredType <em>Reflex Value Point Measured Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.ReflexValuePointMeasuredType
	 * @generated
	 */
	public Adapter createReflexValuePointMeasuredTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.ResultOfReflexTestType <em>Result Of Reflex Test Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.ResultOfReflexTestType
	 * @generated
	 */
	public Adapter createResultOfReflexTestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.SignalLevelType <em>Signal Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.SignalLevelType
	 * @generated
	 */
	public Adapter createSignalLevelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.StaticAdmittanceType <em>Static Admittance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.StaticAdmittanceType
	 * @generated
	 */
	public Adapter createStaticAdmittanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.SupplementaryDataType <em>Supplementary Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.SupplementaryDataType
	 * @generated
	 */
	public Adapter createSupplementaryDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.TympanogramMeasurementConditionsType <em>Tympanogram Measurement Conditions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.TympanogramMeasurementConditionsType
	 * @generated
	 */
	public Adapter createTympanogramMeasurementConditionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.admittance._501.TympanogramTestType <em>Tympanogram Test Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.admittance._501.TympanogramTestType
	 * @generated
	 */
	public Adapter createTympanogramTestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //_501AdapterFactory
