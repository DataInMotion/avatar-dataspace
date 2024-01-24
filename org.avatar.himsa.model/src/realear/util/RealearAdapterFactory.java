/**
 */
package realear.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import realear.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see realear.RealearPackage
 * @generated
 */
public class RealearAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RealearPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealearAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RealearPackage.eINSTANCE;
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
	protected RealearSwitch<Adapter> modelSwitch =
		new RealearSwitch<Adapter>() {
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
			public Adapter caseHIMSARemStandardType(HIMSARemStandardType object) {
				return createHIMSARemStandardTypeAdapter();
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
			public Adapter caseRealEarDataType(RealEarDataType object) {
				return createRealEarDataTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link realear.AttackReleaseMeasurementPoint <em>Attack Release Measurement Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see realear.AttackReleaseMeasurementPoint
	 * @generated
	 */
	public Adapter createAttackReleaseMeasurementPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link realear.BatteryCurrentMeasurement <em>Battery Current Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see realear.BatteryCurrentMeasurement
	 * @generated
	 */
	public Adapter createBatteryCurrentMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link realear.BatteryMeasurementConditions <em>Battery Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see realear.BatteryMeasurementConditions
	 * @generated
	 */
	public Adapter createBatteryMeasurementConditionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link realear.BatteryMeasurementPoint <em>Battery Measurement Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see realear.BatteryMeasurementPoint
	 * @generated
	 */
	public Adapter createBatteryMeasurementPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link realear.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see realear.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link realear.EquivalentInputNoise <em>Equivalent Input Noise</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see realear.EquivalentInputNoise
	 * @generated
	 */
	public Adapter createEquivalentInputNoiseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link realear.FrequencyMeasurement <em>Frequency Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see realear.FrequencyMeasurement
	 * @generated
	 */
	public Adapter createFrequencyMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link realear.FrequencyMeasurementPoint <em>Frequency Measurement Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see realear.FrequencyMeasurementPoint
	 * @generated
	 */
	public Adapter createFrequencyMeasurementPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link realear.FullTargetCurve <em>Full Target Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see realear.FullTargetCurve
	 * @generated
	 */
	public Adapter createFullTargetCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link realear.HarmonicDistortionMeasurementCurve <em>Harmonic Distortion Measurement Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see realear.HarmonicDistortionMeasurementCurve
	 * @generated
	 */
	public Adapter createHarmonicDistortionMeasurementCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link realear.HarmonicDistortionPoint <em>Harmonic Distortion Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see realear.HarmonicDistortionPoint
	 * @generated
	 */
	public Adapter createHarmonicDistortionPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link realear.HIMSARemStandardType <em>HIMSA Rem Standard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see realear.HIMSARemStandardType
	 * @generated
	 */
	public Adapter createHIMSARemStandardTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link realear.InputOutputMeasurement <em>Input Output Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see realear.InputOutputMeasurement
	 * @generated
	 */
	public Adapter createInputOutputMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link realear.InputOutputPoint <em>Input Output Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see realear.InputOutputPoint
	 * @generated
	 */
	public Adapter createInputOutputPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link realear.IntermodulationDistortionMeasurement <em>Intermodulation Distortion Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see realear.IntermodulationDistortionMeasurement
	 * @generated
	 */
	public Adapter createIntermodulationDistortionMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link realear.IntermodulationDistortionPoint <em>Intermodulation Distortion Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see realear.IntermodulationDistortionPoint
	 * @generated
	 */
	public Adapter createIntermodulationDistortionPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link realear.MeasurementConditions <em>Measurement Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see realear.MeasurementConditions
	 * @generated
	 */
	public Adapter createMeasurementConditionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link realear.OcclusionEffects <em>Occlusion Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see realear.OcclusionEffects
	 * @generated
	 */
	public Adapter createOcclusionEffectsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link realear.RealEarCouplerDifference <em>Real Ear Coupler Difference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see realear.RealEarCouplerDifference
	 * @generated
	 */
	public Adapter createRealEarCouplerDifferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link realear.RealEarDataType <em>Real Ear Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see realear.RealEarDataType
	 * @generated
	 */
	public Adapter createRealEarDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link realear.TargetCurve <em>Target Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see realear.TargetCurve
	 * @generated
	 */
	public Adapter createTargetCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link realear.TargetMeasurement <em>Target Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see realear.TargetMeasurement
	 * @generated
	 */
	public Adapter createTargetMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link realear.TargetMeasurementPoint <em>Target Measurement Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see realear.TargetMeasurementPoint
	 * @generated
	 */
	public Adapter createTargetMeasurementPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link realear.TargetPoint <em>Target Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see realear.TargetPoint
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

} //RealearAdapterFactory
