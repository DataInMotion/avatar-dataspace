/*
 */
package com.himsa.measurement.audiogram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Difference Limen Intensity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram.DifferenceLimenIntensityType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.DifferenceLimenIntensityType#getDifferenceLimenIntensityPoints <em>Difference Limen Intensity Points</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.audiogram.AudiogramPackage#getDifferenceLimenIntensityType()
 * @model extendedMetaData="name='DifferenceLimenIntensity_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DifferenceLimenIntensityType extends EObject {
	/**
	 * Returns the value of the '<em><b>Aud Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Global Element used throughout this standard - see AudioMetricMeasurementConditions_Type for more details
	 * 
	 * The same set of measurement conditions are used for all Audiogram curves.
	 * The Audiogram measurement conditions are very versatile and expandable in such a way that whenever new measurement methods are discovered they can be added to the existing ones.
	 * 
	 * They are meant to be used both by the ENT (Ear, Nose, Throat) for diagnostics purposes and for fitting hearing instruments as well. It is very important to realize that combinations of measurement conditions that make perfect sense to the ENT can be meaningless when programming hearing instruments. It is therefore important to examine all measurement conditions to ascertain whether they are useful for the intended purpose.
	 * 
	 * The measurement conditions have initial (default) values that must be filled in.
	 * 
	 * The following elements are mandatory and have initial values set:
	 * StimulusSignalType, MaskingSignalType
	 * StimulusSignalOutput, MaskingSignalOutput
	 * StimulusdBWeighting, MaskingdBWeighting
	 * 
	 * In addition to the initial default values listed above recording the following audiogram test requires the following elements be set (even though they are listed as optional in the XSD schema file)
	 * 
	 * For tone audiograms these are:
	 * StimulusPresentationType, MaskingPresentationType
	 * 
	 * For speech audiograms these are:
	 * StimulusAuxiliary
	 * MaskingAuxiliary
	 * 
	 * ## TMeasCond ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aud Measurement Conditions</em>' containment reference.
	 * @see #setAudMeasurementConditions(AudioMetricMeasurementConditionsType)
	 * @see com.himsa.measurement.audiogram.AudiogramPackage#getDifferenceLimenIntensityType_AudMeasurementConditions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AudMeasurementConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	AudioMetricMeasurementConditionsType getAudMeasurementConditions();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram.DifferenceLimenIntensityType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aud Measurement Conditions</em>' containment reference.
	 * @see #getAudMeasurementConditions()
	 * @generated
	 */
	void setAudMeasurementConditions(AudioMetricMeasurementConditionsType value);

	/**
	 * Returns the value of the '<em><b>Difference Limen Intensity Points</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.measurement.audiogram.DifferenceLimenIntensityPointType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## TDLIPoint ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Difference Limen Intensity Points</em>' containment reference list.
	 * @see com.himsa.measurement.audiogram.AudiogramPackage#getDifferenceLimenIntensityType_DifferenceLimenIntensityPoints()
	 * @model containment="true" required="true" upper="24"
	 *        extendedMetaData="kind='element' name='DifferenceLimenIntensityPoints' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DifferenceLimenIntensityPointType> getDifferenceLimenIntensityPoints();

} // DifferenceLimenIntensityType
