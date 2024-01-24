/**
 */
package com.himsa.measurement.impedance.util;

import com.himsa.measurement.impedance.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.himsa.measurement.impedance.ImpedancePackage
 * @generated
 */
public class ImpedanceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ImpedancePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpedanceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ImpedancePackage.eINSTANCE;
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
	protected ImpedanceSwitch<Adapter> modelSwitch =
		new ImpedanceSwitch<Adapter>() {
			@Override
			public Adapter caseAcousticImpedanceCompleteMeasurementType(AcousticImpedanceCompleteMeasurementType object) {
				return createAcousticImpedanceCompleteMeasurementTypeAdapter();
			}
			@Override
			public Adapter caseComplianceCurveType(ComplianceCurveType object) {
				return createComplianceCurveTypeAdapter();
			}
			@Override
			public Adapter caseCompliancePointType(CompliancePointType object) {
				return createCompliancePointTypeAdapter();
			}
			@Override
			public Adapter caseComplianceType(ComplianceType object) {
				return createComplianceTypeAdapter();
			}
			@Override
			public Adapter caseComplianceUnitType(ComplianceUnitType object) {
				return createComplianceUnitTypeAdapter();
			}
			@Override
			public Adapter caseComplianceValueType(ComplianceValueType object) {
				return createComplianceValueTypeAdapter();
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
			public Adapter caseImpedanceMeasurementConditionType(ImpedanceMeasurementConditionType object) {
				return createImpedanceMeasurementConditionTypeAdapter();
			}
			@Override
			public Adapter casePressurePointType(PressurePointType object) {
				return createPressurePointTypeAdapter();
			}
			@Override
			public Adapter caseReflexCurveType(ReflexCurveType object) {
				return createReflexCurveTypeAdapter();
			}
			@Override
			public Adapter caseReflexPointType(ReflexPointType object) {
				return createReflexPointTypeAdapter();
			}
			@Override
			public Adapter caseReflexTestType(ReflexTestType object) {
				return createReflexTestTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.impedance.AcousticImpedanceCompleteMeasurementType <em>Acoustic Impedance Complete Measurement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.impedance.AcousticImpedanceCompleteMeasurementType
	 * @generated
	 */
	public Adapter createAcousticImpedanceCompleteMeasurementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.impedance.ComplianceCurveType <em>Compliance Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.impedance.ComplianceCurveType
	 * @generated
	 */
	public Adapter createComplianceCurveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.impedance.CompliancePointType <em>Compliance Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.impedance.CompliancePointType
	 * @generated
	 */
	public Adapter createCompliancePointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.impedance.ComplianceType <em>Compliance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.impedance.ComplianceType
	 * @generated
	 */
	public Adapter createComplianceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.impedance.ComplianceUnitType <em>Compliance Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.impedance.ComplianceUnitType
	 * @generated
	 */
	public Adapter createComplianceUnitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.impedance.ComplianceValueType <em>Compliance Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.impedance.ComplianceValueType
	 * @generated
	 */
	public Adapter createComplianceValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.impedance.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.impedance.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.impedance.EustachianTubeFunctionIntactEarDrumTest <em>Eustachian Tube Function Intact Ear Drum Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.impedance.EustachianTubeFunctionIntactEarDrumTest
	 * @generated
	 */
	public Adapter createEustachianTubeFunctionIntactEarDrumTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.impedance.EustachianTubeFunctionPerforatedEarDrumTest <em>Eustachian Tube Function Perforated Ear Drum Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.impedance.EustachianTubeFunctionPerforatedEarDrumTest
	 * @generated
	 */
	public Adapter createEustachianTubeFunctionPerforatedEarDrumTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.impedance.GradientType <em>Gradient Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.impedance.GradientType
	 * @generated
	 */
	public Adapter createGradientTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.impedance.ImpedanceMeasurementConditionType <em>Measurement Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.impedance.ImpedanceMeasurementConditionType
	 * @generated
	 */
	public Adapter createImpedanceMeasurementConditionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.impedance.PressurePointType <em>Pressure Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.impedance.PressurePointType
	 * @generated
	 */
	public Adapter createPressurePointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.impedance.ReflexCurveType <em>Reflex Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.impedance.ReflexCurveType
	 * @generated
	 */
	public Adapter createReflexCurveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.impedance.ReflexPointType <em>Reflex Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.impedance.ReflexPointType
	 * @generated
	 */
	public Adapter createReflexPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.impedance.ReflexTestType <em>Reflex Test Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.impedance.ReflexTestType
	 * @generated
	 */
	public Adapter createReflexTestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.impedance.TympanogramMeasurementConditionsType <em>Tympanogram Measurement Conditions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.impedance.TympanogramMeasurementConditionsType
	 * @generated
	 */
	public Adapter createTympanogramMeasurementConditionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.impedance.TympanogramTestType <em>Tympanogram Test Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.impedance.TympanogramTestType
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

} //ImpedanceAdapterFactory
