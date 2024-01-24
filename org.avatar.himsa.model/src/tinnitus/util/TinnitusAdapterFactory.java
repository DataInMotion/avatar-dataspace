/**
 */
package tinnitus.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tinnitus.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tinnitus.TinnitusPackage
 * @generated
 */
public class TinnitusAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TinnitusPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TinnitusAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TinnitusPackage.eINSTANCE;
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
	protected TinnitusSwitch<Adapter> modelSwitch =
		new TinnitusSwitch<Adapter>() {
			@Override
			public Adapter caseBandwidthType(BandwidthType object) {
				return createBandwidthTypeAdapter();
			}
			@Override
			public Adapter caseIntensityType1(IntensityType1 object) {
				return createIntensityType1Adapter();
			}
			@Override
			public Adapter caseMeasurementConditionsType(MeasurementConditionsType object) {
				return createMeasurementConditionsTypeAdapter();
			}
			@Override
			public Adapter caseMeasurementEquipmentType(MeasurementEquipmentType object) {
				return createMeasurementEquipmentTypeAdapter();
			}
			@Override
			public Adapter caseMeasurementFrequencyPointType(MeasurementFrequencyPointType object) {
				return createMeasurementFrequencyPointTypeAdapter();
			}
			@Override
			public Adapter caseMeasurementIntensityPointType(MeasurementIntensityPointType object) {
				return createMeasurementIntensityPointTypeAdapter();
			}
			@Override
			public Adapter caseMinimumMaskingLevelType(MinimumMaskingLevelType object) {
				return createMinimumMaskingLevelTypeAdapter();
			}
			@Override
			public Adapter caseResidualInhibitionType(ResidualInhibitionType object) {
				return createResidualInhibitionTypeAdapter();
			}
			@Override
			public Adapter caseSignalType(SignalType object) {
				return createSignalTypeAdapter();
			}
			@Override
			public Adapter caseTinnitusLoudnessMatchType(TinnitusLoudnessMatchType object) {
				return createTinnitusLoudnessMatchTypeAdapter();
			}
			@Override
			public Adapter caseTinnitusMeasurementDataType(TinnitusMeasurementDataType object) {
				return createTinnitusMeasurementDataTypeAdapter();
			}
			@Override
			public Adapter caseTinnitusMeasurementNotesType(TinnitusMeasurementNotesType object) {
				return createTinnitusMeasurementNotesTypeAdapter();
			}
			@Override
			public Adapter caseTinnitusPitchMatchType(TinnitusPitchMatchType object) {
				return createTinnitusPitchMatchTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
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
	 * Creates a new adapter for an object of class '{@link tinnitus.BandwidthType <em>Bandwidth Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tinnitus.BandwidthType
	 * @generated
	 */
	public Adapter createBandwidthTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tinnitus.IntensityType1 <em>Intensity Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tinnitus.IntensityType1
	 * @generated
	 */
	public Adapter createIntensityType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tinnitus.MeasurementConditionsType <em>Measurement Conditions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tinnitus.MeasurementConditionsType
	 * @generated
	 */
	public Adapter createMeasurementConditionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tinnitus.MeasurementEquipmentType <em>Measurement Equipment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tinnitus.MeasurementEquipmentType
	 * @generated
	 */
	public Adapter createMeasurementEquipmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tinnitus.MeasurementFrequencyPointType <em>Measurement Frequency Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tinnitus.MeasurementFrequencyPointType
	 * @generated
	 */
	public Adapter createMeasurementFrequencyPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tinnitus.MeasurementIntensityPointType <em>Measurement Intensity Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tinnitus.MeasurementIntensityPointType
	 * @generated
	 */
	public Adapter createMeasurementIntensityPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tinnitus.MinimumMaskingLevelType <em>Minimum Masking Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tinnitus.MinimumMaskingLevelType
	 * @generated
	 */
	public Adapter createMinimumMaskingLevelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tinnitus.ResidualInhibitionType <em>Residual Inhibition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tinnitus.ResidualInhibitionType
	 * @generated
	 */
	public Adapter createResidualInhibitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tinnitus.SignalType <em>Signal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tinnitus.SignalType
	 * @generated
	 */
	public Adapter createSignalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tinnitus.TinnitusLoudnessMatchType <em>Loudness Match Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tinnitus.TinnitusLoudnessMatchType
	 * @generated
	 */
	public Adapter createTinnitusLoudnessMatchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tinnitus.TinnitusMeasurementDataType <em>Measurement Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tinnitus.TinnitusMeasurementDataType
	 * @generated
	 */
	public Adapter createTinnitusMeasurementDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tinnitus.TinnitusMeasurementNotesType <em>Measurement Notes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tinnitus.TinnitusMeasurementNotesType
	 * @generated
	 */
	public Adapter createTinnitusMeasurementNotesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tinnitus.TinnitusPitchMatchType <em>Pitch Match Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tinnitus.TinnitusPitchMatchType
	 * @generated
	 */
	public Adapter createTinnitusPitchMatchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tinnitus.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tinnitus.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
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

} //TinnitusAdapterFactory
