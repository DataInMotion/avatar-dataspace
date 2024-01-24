/*
 */
package audiogram502;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Difference Limen Frequency Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link audiogram502.DifferenceLimenFrequencyType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}</li>
 *   <li>{@link audiogram502.DifferenceLimenFrequencyType#getDifferenceLimenFrequencyPoints <em>Difference Limen Frequency Points</em>}</li>
 * </ul>
 *
 * @see audiogram502.Audiogram502Package#getDifferenceLimenFrequencyType()
 * @model extendedMetaData="name='DifferenceLimenFrequency_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DifferenceLimenFrequencyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Aud Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Global Element used throughout this standard - see AudioMetricMeasurementConditions_Type for more details
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aud Measurement Conditions</em>' containment reference.
	 * @see #setAudMeasurementConditions(AudioMetricMeasurementConditionsType)
	 * @see audiogram502.Audiogram502Package#getDifferenceLimenFrequencyType_AudMeasurementConditions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AudMeasurementConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	AudioMetricMeasurementConditionsType getAudMeasurementConditions();

	/**
	 * Sets the value of the '{@link audiogram502.DifferenceLimenFrequencyType#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aud Measurement Conditions</em>' containment reference.
	 * @see #getAudMeasurementConditions()
	 * @generated
	 */
	void setAudMeasurementConditions(AudioMetricMeasurementConditionsType value);

	/**
	 * Returns the value of the '<em><b>Difference Limen Frequency Points</b></em>' containment reference list.
	 * The list contents are of type {@link audiogram502.DifferenceLimenFrequencyPointType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difference Limen Frequency Points</em>' containment reference list.
	 * @see audiogram502.Audiogram502Package#getDifferenceLimenFrequencyType_DifferenceLimenFrequencyPoints()
	 * @model containment="true" required="true" upper="24"
	 *        extendedMetaData="kind='element' name='DifferenceLimenFrequencyPoints' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DifferenceLimenFrequencyPointType> getDifferenceLimenFrequencyPoints();

} // DifferenceLimenFrequencyType
