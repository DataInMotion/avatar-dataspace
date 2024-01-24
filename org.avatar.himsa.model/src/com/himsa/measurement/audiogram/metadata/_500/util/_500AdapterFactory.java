/**
 */
package com.himsa.measurement.audiogram.metadata._500.util;

import com.himsa.measurement.audiogram.metadata._500.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.himsa.measurement.audiogram.metadata._500._500Package
 * @generated
 */
public class _500AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _500Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _500AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = _500Package.eINSTANCE;
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
	protected _500Switch<Adapter> modelSwitch =
		new _500Switch<Adapter>() {
			@Override
			public Adapter caseAMCLASSType(AMCLASSType object) {
				return createAMCLASSTypeAdapter();
			}
			@Override
			public Adapter caseAMCLASSType1(AMCLASSType1 object) {
				return createAMCLASSType1Adapter();
			}
			@Override
			public Adapter caseAudiogramClassificationsType(AudiogramClassificationsType object) {
				return createAudiogramClassificationsTypeAdapter();
			}
			@Override
			public Adapter caseConfigurationSeverityChoiceType(ConfigurationSeverityChoiceType object) {
				return createConfigurationSeverityChoiceTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseHIMSAAudiogramMetadataStandardType(HIMSAAudiogramMetadataStandardType object) {
				return createHIMSAAudiogramMetadataStandardTypeAdapter();
			}
			@Override
			public Adapter caseNonStandardizedType(NonStandardizedType object) {
				return createNonStandardizedTypeAdapter();
			}
			@Override
			public Adapter casePredictedAccuraciesType(PredictedAccuraciesType object) {
				return createPredictedAccuraciesTypeAdapter();
			}
			@Override
			public Adapter caseQualindType(QualindType object) {
				return createQualindTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.audiogram.metadata._500.AMCLASSType <em>AMCLASS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.audiogram.metadata._500.AMCLASSType
	 * @generated
	 */
	public Adapter createAMCLASSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.audiogram.metadata._500.AMCLASSType1 <em>AMCLASS Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.audiogram.metadata._500.AMCLASSType1
	 * @generated
	 */
	public Adapter createAMCLASSType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.audiogram.metadata._500.AudiogramClassificationsType <em>Audiogram Classifications Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.audiogram.metadata._500.AudiogramClassificationsType
	 * @generated
	 */
	public Adapter createAudiogramClassificationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.audiogram.metadata._500.ConfigurationSeverityChoiceType <em>Configuration Severity Choice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.audiogram.metadata._500.ConfigurationSeverityChoiceType
	 * @generated
	 */
	public Adapter createConfigurationSeverityChoiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.audiogram.metadata._500.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.audiogram.metadata._500.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.audiogram.metadata._500.HIMSAAudiogramMetadataStandardType <em>HIMSA Audiogram Metadata Standard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.audiogram.metadata._500.HIMSAAudiogramMetadataStandardType
	 * @generated
	 */
	public Adapter createHIMSAAudiogramMetadataStandardTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.audiogram.metadata._500.NonStandardizedType <em>Non Standardized Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.audiogram.metadata._500.NonStandardizedType
	 * @generated
	 */
	public Adapter createNonStandardizedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.audiogram.metadata._500.PredictedAccuraciesType <em>Predicted Accuracies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.audiogram.metadata._500.PredictedAccuraciesType
	 * @generated
	 */
	public Adapter createPredictedAccuraciesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.himsa.measurement.audiogram.metadata._500.QualindType <em>Qualind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.himsa.measurement.audiogram.metadata._500.QualindType
	 * @generated
	 */
	public Adapter createQualindTypeAdapter() {
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

} //_500AdapterFactory
