/*
 */
package com.himsa.measurement.tinnitus._500;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Minimum Masking Level Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * (MML). Test attempt to determine the lowest level at which a standard band of noise "covered" the tinnitus
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.tinnitus._500.MinimumMaskingLevelType#getMeasurementConditions <em>Measurement Conditions</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.MinimumMaskingLevelType#getMeasurementPoint <em>Measurement Point</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.MinimumMaskingLevelType#getMatchingSuccess <em>Matching Success</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.tinnitus._500._500Package#getMinimumMaskingLevelType()
 * @model extendedMetaData="name='MinimumMaskingLevel_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MinimumMaskingLevelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measurement Conditions for the Minimum Masking Level measurement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measurement Conditions</em>' containment reference.
	 * @see #setMeasurementConditions(MeasurementConditionsType)
	 * @see com.himsa.measurement.tinnitus._500._500Package#getMinimumMaskingLevelType_MeasurementConditions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MeasurementConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasurementConditionsType getMeasurementConditions();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.tinnitus._500.MinimumMaskingLevelType#getMeasurementConditions <em>Measurement Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Conditions</em>' containment reference.
	 * @see #getMeasurementConditions()
	 * @generated
	 */
	void setMeasurementConditions(MeasurementConditionsType value);

	/**
	 * Returns the value of the '<em><b>Measurement Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Minimum Masking Level point
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measurement Point</em>' containment reference.
	 * @see #setMeasurementPoint(MeasurementIntensityPointType)
	 * @see com.himsa.measurement.tinnitus._500._500Package#getMinimumMaskingLevelType_MeasurementPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MeasurementPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasurementIntensityPointType getMeasurementPoint();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.tinnitus._500.MinimumMaskingLevelType#getMeasurementPoint <em>Measurement Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Point</em>' containment reference.
	 * @see #getMeasurementPoint()
	 * @generated
	 */
	void setMeasurementPoint(MeasurementIntensityPointType value);

	/**
	 * Returns the value of the '<em><b>Matching Success</b></em>' attribute.
	 * The literals are from the enumeration {@link com.himsa.measurement.tinnitus._500.TinnitusMatchSucessType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sucess of masking
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Matching Success</em>' attribute.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusMatchSucessType
	 * @see #isSetMatchingSuccess()
	 * @see #unsetMatchingSuccess()
	 * @see #setMatchingSuccess(TinnitusMatchSucessType)
	 * @see com.himsa.measurement.tinnitus._500._500Package#getMinimumMaskingLevelType_MatchingSuccess()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MatchingSuccess' namespace='##targetNamespace'"
	 * @generated
	 */
	TinnitusMatchSucessType getMatchingSuccess();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.tinnitus._500.MinimumMaskingLevelType#getMatchingSuccess <em>Matching Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matching Success</em>' attribute.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusMatchSucessType
	 * @see #isSetMatchingSuccess()
	 * @see #unsetMatchingSuccess()
	 * @see #getMatchingSuccess()
	 * @generated
	 */
	void setMatchingSuccess(TinnitusMatchSucessType value);

	/**
	 * Unsets the value of the '{@link com.himsa.measurement.tinnitus._500.MinimumMaskingLevelType#getMatchingSuccess <em>Matching Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMatchingSuccess()
	 * @see #getMatchingSuccess()
	 * @see #setMatchingSuccess(TinnitusMatchSucessType)
	 * @generated
	 */
	void unsetMatchingSuccess();

	/**
	 * Returns whether the value of the '{@link com.himsa.measurement.tinnitus._500.MinimumMaskingLevelType#getMatchingSuccess <em>Matching Success</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Matching Success</em>' attribute is set.
	 * @see #unsetMatchingSuccess()
	 * @see #getMatchingSuccess()
	 * @see #setMatchingSuccess(TinnitusMatchSucessType)
	 * @generated
	 */
	boolean isSetMatchingSuccess();

} // MinimumMaskingLevelType
