/**
 */
package com.himsa.measurement.tinnitus._500.util;

import com.himsa.measurement.tinnitus._500.*;

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
 * @see com.himsa.measurement.tinnitus._500._500Package
 * @generated
 */
public class _500Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _500Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _500Switch() {
		if (modelPackage == null) {
			modelPackage = _500Package.eINSTANCE;
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
			case _500Package.BANDWIDTH_TYPE: {
				BandwidthType bandwidthType = (BandwidthType)theEObject;
				T result = caseBandwidthType(bandwidthType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _500Package.INTENSITY_TYPE1: {
				IntensityType1 intensityType1 = (IntensityType1)theEObject;
				T result = caseIntensityType1(intensityType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _500Package.MEASUREMENT_CONDITIONS_TYPE: {
				MeasurementConditionsType measurementConditionsType = (MeasurementConditionsType)theEObject;
				T result = caseMeasurementConditionsType(measurementConditionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _500Package.MEASUREMENT_EQUIPMENT_TYPE: {
				MeasurementEquipmentType measurementEquipmentType = (MeasurementEquipmentType)theEObject;
				T result = caseMeasurementEquipmentType(measurementEquipmentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _500Package.MEASUREMENT_FREQUENCY_POINT_TYPE: {
				MeasurementFrequencyPointType measurementFrequencyPointType = (MeasurementFrequencyPointType)theEObject;
				T result = caseMeasurementFrequencyPointType(measurementFrequencyPointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _500Package.MEASUREMENT_INTENSITY_POINT_TYPE: {
				MeasurementIntensityPointType measurementIntensityPointType = (MeasurementIntensityPointType)theEObject;
				T result = caseMeasurementIntensityPointType(measurementIntensityPointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _500Package.MINIMUM_MASKING_LEVEL_TYPE: {
				MinimumMaskingLevelType minimumMaskingLevelType = (MinimumMaskingLevelType)theEObject;
				T result = caseMinimumMaskingLevelType(minimumMaskingLevelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _500Package.RESIDUAL_INHIBITION_TYPE: {
				ResidualInhibitionType residualInhibitionType = (ResidualInhibitionType)theEObject;
				T result = caseResidualInhibitionType(residualInhibitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _500Package.SIGNAL_TYPE: {
				SignalType signalType = (SignalType)theEObject;
				T result = caseSignalType(signalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _500Package.TINNITUS_LOUDNESS_MATCH_TYPE: {
				TinnitusLoudnessMatchType tinnitusLoudnessMatchType = (TinnitusLoudnessMatchType)theEObject;
				T result = caseTinnitusLoudnessMatchType(tinnitusLoudnessMatchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _500Package.TINNITUS_MEASUREMENT_DATA_TYPE: {
				TinnitusMeasurementDataType tinnitusMeasurementDataType = (TinnitusMeasurementDataType)theEObject;
				T result = caseTinnitusMeasurementDataType(tinnitusMeasurementDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _500Package.TINNITUS_MEASUREMENT_NOTES_TYPE: {
				TinnitusMeasurementNotesType tinnitusMeasurementNotesType = (TinnitusMeasurementNotesType)theEObject;
				T result = caseTinnitusMeasurementNotesType(tinnitusMeasurementNotesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _500Package.TINNITUS_PITCH_MATCH_TYPE: {
				TinnitusPitchMatchType tinnitusPitchMatchType = (TinnitusPitchMatchType)theEObject;
				T result = caseTinnitusPitchMatchType(tinnitusPitchMatchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _500Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bandwidth Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bandwidth Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBandwidthType(BandwidthType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intensity Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intensity Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntensityType1(IntensityType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Conditions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Conditions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementConditionsType(MeasurementConditionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Equipment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Equipment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementEquipmentType(MeasurementEquipmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Frequency Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Frequency Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementFrequencyPointType(MeasurementFrequencyPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Intensity Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Intensity Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementIntensityPointType(MeasurementIntensityPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minimum Masking Level Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minimum Masking Level Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinimumMaskingLevelType(MinimumMaskingLevelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Residual Inhibition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Residual Inhibition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResidualInhibitionType(ResidualInhibitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalType(SignalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tinnitus Loudness Match Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tinnitus Loudness Match Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTinnitusLoudnessMatchType(TinnitusLoudnessMatchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tinnitus Measurement Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tinnitus Measurement Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTinnitusMeasurementDataType(TinnitusMeasurementDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tinnitus Measurement Notes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tinnitus Measurement Notes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTinnitusMeasurementNotesType(TinnitusMeasurementNotesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tinnitus Pitch Match Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tinnitus Pitch Match Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTinnitusPitchMatchType(TinnitusPitchMatchType object) {
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

} //_500Switch
