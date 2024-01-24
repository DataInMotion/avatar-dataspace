/**
 */
package test.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import test.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see test.TestPackage
 * @generated
 */
public class TestAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TestPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TestPackage.eINSTANCE;
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
	protected TestSwitch<Adapter> modelSwitch =
		new TestSwitch<Adapter>() {
			@Override
			public Adapter caseAttackReleaseMeasurementPoint(AttackReleaseMeasurementPoint object) {
				return createAttackReleaseMeasurementPointAdapter();
			}
			@Override
			public Adapter caseBatteryCurrentMeasurement(BatteryCurrentMeasurement object) {
				return createBatteryCurrentMeasurementAdapter();
			}
			@Override
			public Adapter caseBatteryMeasurementConditions(BatteryMeasurementConditions object) {
				return createBatteryMeasurementConditionsAdapter();
			}
			@Override
			public Adapter caseBatteryMeasurementPoint(BatteryMeasurementPoint object) {
				return createBatteryMeasurementPointAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEquivalentInputNoise(EquivalentInputNoise object) {
				return createEquivalentInputNoiseAdapter();
			}
			@Override
			public Adapter caseFrequencyMeasurement(FrequencyMeasurement object) {
				return createFrequencyMeasurementAdapter();
			}
			@Override
			public Adapter caseFrequencyMeasurementPoint(FrequencyMeasurementPoint object) {
				return createFrequencyMeasurementPointAdapter();
			}
			@Override
			public Adapter caseFullTargetCurve(FullTargetCurve object) {
				return createFullTargetCurveAdapter();
			}
			@Override
			public Adapter caseHarmonicDistortionMeasurementCurve(HarmonicDistortionMeasurementCurve object) {
				return createHarmonicDistortionMeasurementCurveAdapter();
			}
			@Override
			public Adapter caseHarmonicDistortionPoint(HarmonicDistortionPoint object) {
				return createHarmonicDistortionPointAdapter();
			}
			@Override
			public Adapter caseHearingInstrumentTestType(HearingInstrumentTestType object) {
				return createHearingInstrumentTestTypeAdapter();
			}
			@Override
			public Adapter caseHIMSAHitStandardType(HIMSAHitStandardType object) {
				return createHIMSAHitStandardTypeAdapter();
			}
			@Override
			public Adapter caseInputOutputMeasurement(InputOutputMeasurement object) {
				return createInputOutputMeasurementAdapter();
			}
			@Override
			public Adapter caseInputOutputPoint(InputOutputPoint object) {
				return createInputOutputPointAdapter();
			}
			@Override
			public Adapter caseIntermodulationDistortionMeasurement(IntermodulationDistortionMeasurement object) {
				return createIntermodulationDistortionMeasurementAdapter();
			}
			@Override
			public Adapter caseIntermodulationDistortionPoint(IntermodulationDistortionPoint object) {
				return createIntermodulationDistortionPointAdapter();
			}
			@Override
			public Adapter caseMeasurementConditions(MeasurementConditions object) {
				return createMeasurementConditionsAdapter();
			}
			@Override
			public Adapter caseOcclusionEffects(OcclusionEffects object) {
				return createOcclusionEffectsAdapter();
			}
			@Override
			public Adapter caseRealEarCouplerDifference(RealEarCouplerDifference object) {
				return createRealEarCouplerDifferenceAdapter();
			}
			@Override
			public Adapter caseTargetCurve(TargetCurve object) {
				return createTargetCurveAdapter();
			}
			@Override
			public Adapter caseTargetMeasurement(TargetMeasurement object) {
				return createTargetMeasurementAdapter();
			}
			@Override
			public Adapter caseTargetMeasurementPoint(TargetMeasurementPoint object) {
				return createTargetMeasurementPointAdapter();
			}
			@Override
			public Adapter caseTargetPoint(TargetPoint object) {
				return createTargetPointAdapter();
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
	 * Creates a new adapter for an object of class '{@link test.AttackReleaseMeasurementPoint <em>Attack Release Measurement Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.AttackReleaseMeasurementPoint
	 * @generated
	 */
	public Adapter createAttackReleaseMeasurementPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.BatteryCurrentMeasurement <em>Battery Current Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.BatteryCurrentMeasurement
	 * @generated
	 */
	public Adapter createBatteryCurrentMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.BatteryMeasurementConditions <em>Battery Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.BatteryMeasurementConditions
	 * @generated
	 */
	public Adapter createBatteryMeasurementConditionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.BatteryMeasurementPoint <em>Battery Measurement Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.BatteryMeasurementPoint
	 * @generated
	 */
	public Adapter createBatteryMeasurementPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.EquivalentInputNoise <em>Equivalent Input Noise</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.EquivalentInputNoise
	 * @generated
	 */
	public Adapter createEquivalentInputNoiseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.FrequencyMeasurement <em>Frequency Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.FrequencyMeasurement
	 * @generated
	 */
	public Adapter createFrequencyMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.FrequencyMeasurementPoint <em>Frequency Measurement Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.FrequencyMeasurementPoint
	 * @generated
	 */
	public Adapter createFrequencyMeasurementPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.FullTargetCurve <em>Full Target Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.FullTargetCurve
	 * @generated
	 */
	public Adapter createFullTargetCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.HarmonicDistortionMeasurementCurve <em>Harmonic Distortion Measurement Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.HarmonicDistortionMeasurementCurve
	 * @generated
	 */
	public Adapter createHarmonicDistortionMeasurementCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.HarmonicDistortionPoint <em>Harmonic Distortion Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.HarmonicDistortionPoint
	 * @generated
	 */
	public Adapter createHarmonicDistortionPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.HearingInstrumentTestType <em>Hearing Instrument Test Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.HearingInstrumentTestType
	 * @generated
	 */
	public Adapter createHearingInstrumentTestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.HIMSAHitStandardType <em>HIMSA Hit Standard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.HIMSAHitStandardType
	 * @generated
	 */
	public Adapter createHIMSAHitStandardTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.InputOutputMeasurement <em>Input Output Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.InputOutputMeasurement
	 * @generated
	 */
	public Adapter createInputOutputMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.InputOutputPoint <em>Input Output Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.InputOutputPoint
	 * @generated
	 */
	public Adapter createInputOutputPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.IntermodulationDistortionMeasurement <em>Intermodulation Distortion Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.IntermodulationDistortionMeasurement
	 * @generated
	 */
	public Adapter createIntermodulationDistortionMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.IntermodulationDistortionPoint <em>Intermodulation Distortion Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.IntermodulationDistortionPoint
	 * @generated
	 */
	public Adapter createIntermodulationDistortionPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.MeasurementConditions <em>Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.MeasurementConditions
	 * @generated
	 */
	public Adapter createMeasurementConditionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.OcclusionEffects <em>Occlusion Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.OcclusionEffects
	 * @generated
	 */
	public Adapter createOcclusionEffectsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.RealEarCouplerDifference <em>Real Ear Coupler Difference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.RealEarCouplerDifference
	 * @generated
	 */
	public Adapter createRealEarCouplerDifferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.TargetCurve <em>Target Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.TargetCurve
	 * @generated
	 */
	public Adapter createTargetCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.TargetMeasurement <em>Target Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.TargetMeasurement
	 * @generated
	 */
	public Adapter createTargetMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.TargetMeasurementPoint <em>Target Measurement Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.TargetMeasurementPoint
	 * @generated
	 */
	public Adapter createTargetMeasurementPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link test.TargetPoint <em>Target Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see test.TargetPoint
	 * @generated
	 */
	public Adapter createTargetPointAdapter() {
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

} //TestAdapterFactory
