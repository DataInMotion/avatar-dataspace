/**
 */
package admittance.util;

import admittance.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see admittance.AdmittancePackage
 * @generated
 */
public class AdmittanceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AdmittancePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdmittanceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AdmittancePackage.eINSTANCE;
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
	protected AdmittanceSwitch<Adapter> modelSwitch =
		new AdmittanceSwitch<Adapter>() {
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
	 * Creates a new adapter for an object of class '{@link admittance.AcousticImmittanceAssessmentType <em>Acoustic Immittance Assessment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.AcousticImmittanceAssessmentType
	 * @generated
	 */
	public Adapter createAcousticImmittanceAssessmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.AdmittanceCurveType <em>Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.AdmittanceCurveType
	 * @generated
	 */
	public Adapter createAdmittanceCurveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.AdmittanceMeasurementConditionType <em>Measurement Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.AdmittanceMeasurementConditionType
	 * @generated
	 */
	public Adapter createAdmittanceMeasurementConditionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.AdmittanceType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.AdmittanceType
	 * @generated
	 */
	public Adapter createAdmittanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.AdmittanceUnitCalculatedType <em>Unit Calculated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.AdmittanceUnitCalculatedType
	 * @generated
	 */
	public Adapter createAdmittanceUnitCalculatedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.AdmittanceUnitMeasuredType <em>Unit Measured Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.AdmittanceUnitMeasuredType
	 * @generated
	 */
	public Adapter createAdmittanceUnitMeasuredTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.AdmittanceUnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.AdmittanceUnitType
	 * @generated
	 */
	public Adapter createAdmittanceUnitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.AdmittanceValueCalculatedType <em>Value Calculated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.AdmittanceValueCalculatedType
	 * @generated
	 */
	public Adapter createAdmittanceValueCalculatedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.AdmittanceValueMeasuredType <em>Value Measured Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.AdmittanceValueMeasuredType
	 * @generated
	 */
	public Adapter createAdmittanceValueMeasuredTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.AdmittanceValuePointCalculatedType <em>Value Point Calculated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.AdmittanceValuePointCalculatedType
	 * @generated
	 */
	public Adapter createAdmittanceValuePointCalculatedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.AdmittanceValuePointMeasuredType <em>Value Point Measured Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.AdmittanceValuePointMeasuredType
	 * @generated
	 */
	public Adapter createAdmittanceValuePointMeasuredTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.AdmittanceValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.AdmittanceValueType
	 * @generated
	 */
	public Adapter createAdmittanceValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.CalculatedAdmittancePointsType <em>Calculated Admittance Points Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.CalculatedAdmittancePointsType
	 * @generated
	 */
	public Adapter createCalculatedAdmittancePointsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.CalculatedType <em>Calculated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.CalculatedType
	 * @generated
	 */
	public Adapter createCalculatedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.CalculatedType1 <em>Calculated Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.CalculatedType1
	 * @generated
	 */
	public Adapter createCalculatedType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.DeltaYPointsType <em>Delta YPoints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.DeltaYPointsType
	 * @generated
	 */
	public Adapter createDeltaYPointsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.DeltaYType <em>Delta YType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.DeltaYType
	 * @generated
	 */
	public Adapter createDeltaYTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.EustachianTubeFunctionIntactEarDrumTest <em>Eustachian Tube Function Intact Ear Drum Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.EustachianTubeFunctionIntactEarDrumTest
	 * @generated
	 */
	public Adapter createEustachianTubeFunctionIntactEarDrumTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.EustachianTubeFunctionPerforatedEarDrumTest <em>Eustachian Tube Function Perforated Ear Drum Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.EustachianTubeFunctionPerforatedEarDrumTest
	 * @generated
	 */
	public Adapter createEustachianTubeFunctionPerforatedEarDrumTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.GradientType <em>Gradient Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.GradientType
	 * @generated
	 */
	public Adapter createGradientTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.InformationType <em>Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.InformationType
	 * @generated
	 */
	public Adapter createInformationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.MeasuredAdmittancePointsType <em>Measured Admittance Points Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.MeasuredAdmittancePointsType
	 * @generated
	 */
	public Adapter createMeasuredAdmittancePointsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.MeasuredType <em>Measured Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.MeasuredType
	 * @generated
	 */
	public Adapter createMeasuredTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.MeasuredType1 <em>Measured Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.MeasuredType1
	 * @generated
	 */
	public Adapter createMeasuredType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.MeasurementNotesType <em>Measurement Notes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.MeasurementNotesType
	 * @generated
	 */
	public Adapter createMeasurementNotesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.NumericDeltaType <em>Numeric Delta Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.NumericDeltaType
	 * @generated
	 */
	public Adapter createNumericDeltaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.NumericDeltaYPointsType <em>Numeric Delta YPoints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.NumericDeltaYPointsType
	 * @generated
	 */
	public Adapter createNumericDeltaYPointsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.PressurePointType <em>Pressure Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.PressurePointType
	 * @generated
	 */
	public Adapter createPressurePointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.ProbeFrequencyType <em>Probe Frequency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.ProbeFrequencyType
	 * @generated
	 */
	public Adapter createProbeFrequencyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.ReflexCurveType <em>Reflex Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.ReflexCurveType
	 * @generated
	 */
	public Adapter createReflexCurveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.ReflexTestType <em>Reflex Test Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.ReflexTestType
	 * @generated
	 */
	public Adapter createReflexTestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.ReflexValuePointCalculatedType <em>Reflex Value Point Calculated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.ReflexValuePointCalculatedType
	 * @generated
	 */
	public Adapter createReflexValuePointCalculatedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.ReflexValuePointMeasuredType <em>Reflex Value Point Measured Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.ReflexValuePointMeasuredType
	 * @generated
	 */
	public Adapter createReflexValuePointMeasuredTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.ResultOfReflexTestType <em>Result Of Reflex Test Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.ResultOfReflexTestType
	 * @generated
	 */
	public Adapter createResultOfReflexTestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.SignalLevelType <em>Signal Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.SignalLevelType
	 * @generated
	 */
	public Adapter createSignalLevelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.StaticAdmittanceType <em>Static Admittance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.StaticAdmittanceType
	 * @generated
	 */
	public Adapter createStaticAdmittanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.SupplementaryDataType <em>Supplementary Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.SupplementaryDataType
	 * @generated
	 */
	public Adapter createSupplementaryDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.TympanogramMeasurementConditionsType <em>Tympanogram Measurement Conditions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.TympanogramMeasurementConditionsType
	 * @generated
	 */
	public Adapter createTympanogramMeasurementConditionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admittance.TympanogramTestType <em>Tympanogram Test Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admittance.TympanogramTestType
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

} //AdmittanceAdapterFactory
