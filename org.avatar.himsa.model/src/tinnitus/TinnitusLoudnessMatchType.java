/*
 */
package tinnitus;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loudness Match Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * (TLM) Test attempt to determine loudness of the tinnitus
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tinnitus.TinnitusLoudnessMatchType#getMeasurementConditions <em>Measurement Conditions</em>}</li>
 *   <li>{@link tinnitus.TinnitusLoudnessMatchType#getMeasurementPoint <em>Measurement Point</em>}</li>
 *   <li>{@link tinnitus.TinnitusLoudnessMatchType#getMatchingSuccess <em>Matching Success</em>}</li>
 * </ul>
 *
 * @see tinnitus.TinnitusPackage#getTinnitusLoudnessMatchType()
 * @model extendedMetaData="name='TinnitusLoudnessMatch_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TinnitusLoudnessMatchType extends EObject {
	/**
	 * Returns the value of the '<em><b>Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measurement Conditions for the Loudness Match measurement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measurement Conditions</em>' containment reference.
	 * @see #setMeasurementConditions(MeasurementConditionsType)
	 * @see tinnitus.TinnitusPackage#getTinnitusLoudnessMatchType_MeasurementConditions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MeasurementConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasurementConditionsType getMeasurementConditions();

	/**
	 * Sets the value of the '{@link tinnitus.TinnitusLoudnessMatchType#getMeasurementConditions <em>Measurement Conditions</em>}' containment reference.
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
	 * The Loudness Match point
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measurement Point</em>' containment reference.
	 * @see #setMeasurementPoint(MeasurementIntensityPointType)
	 * @see tinnitus.TinnitusPackage#getTinnitusLoudnessMatchType_MeasurementPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MeasurementPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasurementIntensityPointType getMeasurementPoint();

	/**
	 * Sets the value of the '{@link tinnitus.TinnitusLoudnessMatchType#getMeasurementPoint <em>Measurement Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Point</em>' containment reference.
	 * @see #getMeasurementPoint()
	 * @generated
	 */
	void setMeasurementPoint(MeasurementIntensityPointType value);

	/**
	 * Returns the value of the '<em><b>Matching Success</b></em>' attribute.
	 * The literals are from the enumeration {@link tinnitus.TinnitusMatchSucessType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sucess of matching
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Matching Success</em>' attribute.
	 * @see tinnitus.TinnitusMatchSucessType
	 * @see #isSetMatchingSuccess()
	 * @see #unsetMatchingSuccess()
	 * @see #setMatchingSuccess(TinnitusMatchSucessType)
	 * @see tinnitus.TinnitusPackage#getTinnitusLoudnessMatchType_MatchingSuccess()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MatchingSuccess' namespace='##targetNamespace'"
	 * @generated
	 */
	TinnitusMatchSucessType getMatchingSuccess();

	/**
	 * Sets the value of the '{@link tinnitus.TinnitusLoudnessMatchType#getMatchingSuccess <em>Matching Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matching Success</em>' attribute.
	 * @see tinnitus.TinnitusMatchSucessType
	 * @see #isSetMatchingSuccess()
	 * @see #unsetMatchingSuccess()
	 * @see #getMatchingSuccess()
	 * @generated
	 */
	void setMatchingSuccess(TinnitusMatchSucessType value);

	/**
	 * Unsets the value of the '{@link tinnitus.TinnitusLoudnessMatchType#getMatchingSuccess <em>Matching Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMatchingSuccess()
	 * @see #getMatchingSuccess()
	 * @see #setMatchingSuccess(TinnitusMatchSucessType)
	 * @generated
	 */
	void unsetMatchingSuccess();

	/**
	 * Returns whether the value of the '{@link tinnitus.TinnitusLoudnessMatchType#getMatchingSuccess <em>Matching Success</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Matching Success</em>' attribute is set.
	 * @see #unsetMatchingSuccess()
	 * @see #getMatchingSuccess()
	 * @see #setMatchingSuccess(TinnitusMatchSucessType)
	 * @generated
	 */
	boolean isSetMatchingSuccess();

} // TinnitusLoudnessMatchType
