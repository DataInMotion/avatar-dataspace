/*
 */
package com.himsa.measurement.tinnitus._500;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tinnitus Measurement Notes Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Measurement Notes structure is designed to hold the general notes from the Tinnitus Measurement. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementNotesType#getTinnitusPerceptionLocation <em>Tinnitus Perception Location</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementNotesType#getTinnitusTemporalCharacteristic <em>Tinnitus Temporal Characteristic</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementNotesType#getOtherMeasurementNotes <em>Other Measurement Notes</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.tinnitus._500._500Package#getTinnitusMeasurementNotesType()
 * @model extendedMetaData="name='TinnitusMeasurementNotes_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TinnitusMeasurementNotesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Tinnitus Perception Location</b></em>' attribute.
	 * The literals are from the enumeration {@link com.himsa.measurement.tinnitus._500.TinnitusPerceptionLocationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The perceived location of tinnitus
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tinnitus Perception Location</em>' attribute.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusPerceptionLocationType
	 * @see #isSetTinnitusPerceptionLocation()
	 * @see #unsetTinnitusPerceptionLocation()
	 * @see #setTinnitusPerceptionLocation(TinnitusPerceptionLocationType)
	 * @see com.himsa.measurement.tinnitus._500._500Package#getTinnitusMeasurementNotesType_TinnitusPerceptionLocation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TinnitusPerceptionLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	TinnitusPerceptionLocationType getTinnitusPerceptionLocation();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementNotesType#getTinnitusPerceptionLocation <em>Tinnitus Perception Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tinnitus Perception Location</em>' attribute.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusPerceptionLocationType
	 * @see #isSetTinnitusPerceptionLocation()
	 * @see #unsetTinnitusPerceptionLocation()
	 * @see #getTinnitusPerceptionLocation()
	 * @generated
	 */
	void setTinnitusPerceptionLocation(TinnitusPerceptionLocationType value);

	/**
	 * Unsets the value of the '{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementNotesType#getTinnitusPerceptionLocation <em>Tinnitus Perception Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTinnitusPerceptionLocation()
	 * @see #getTinnitusPerceptionLocation()
	 * @see #setTinnitusPerceptionLocation(TinnitusPerceptionLocationType)
	 * @generated
	 */
	void unsetTinnitusPerceptionLocation();

	/**
	 * Returns whether the value of the '{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementNotesType#getTinnitusPerceptionLocation <em>Tinnitus Perception Location</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tinnitus Perception Location</em>' attribute is set.
	 * @see #unsetTinnitusPerceptionLocation()
	 * @see #getTinnitusPerceptionLocation()
	 * @see #setTinnitusPerceptionLocation(TinnitusPerceptionLocationType)
	 * @generated
	 */
	boolean isSetTinnitusPerceptionLocation();

	/**
	 * Returns the value of the '<em><b>Tinnitus Temporal Characteristic</b></em>' attribute.
	 * The literals are from the enumeration {@link com.himsa.measurement.tinnitus._500.TinnitusTemporalCharacteristicType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The temporal characteristic of Tinnitus. How is the tinnitus experienced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tinnitus Temporal Characteristic</em>' attribute.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusTemporalCharacteristicType
	 * @see #isSetTinnitusTemporalCharacteristic()
	 * @see #unsetTinnitusTemporalCharacteristic()
	 * @see #setTinnitusTemporalCharacteristic(TinnitusTemporalCharacteristicType)
	 * @see com.himsa.measurement.tinnitus._500._500Package#getTinnitusMeasurementNotesType_TinnitusTemporalCharacteristic()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TinnitusTemporalCharacteristic' namespace='##targetNamespace'"
	 * @generated
	 */
	TinnitusTemporalCharacteristicType getTinnitusTemporalCharacteristic();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementNotesType#getTinnitusTemporalCharacteristic <em>Tinnitus Temporal Characteristic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tinnitus Temporal Characteristic</em>' attribute.
	 * @see com.himsa.measurement.tinnitus._500.TinnitusTemporalCharacteristicType
	 * @see #isSetTinnitusTemporalCharacteristic()
	 * @see #unsetTinnitusTemporalCharacteristic()
	 * @see #getTinnitusTemporalCharacteristic()
	 * @generated
	 */
	void setTinnitusTemporalCharacteristic(TinnitusTemporalCharacteristicType value);

	/**
	 * Unsets the value of the '{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementNotesType#getTinnitusTemporalCharacteristic <em>Tinnitus Temporal Characteristic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTinnitusTemporalCharacteristic()
	 * @see #getTinnitusTemporalCharacteristic()
	 * @see #setTinnitusTemporalCharacteristic(TinnitusTemporalCharacteristicType)
	 * @generated
	 */
	void unsetTinnitusTemporalCharacteristic();

	/**
	 * Returns whether the value of the '{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementNotesType#getTinnitusTemporalCharacteristic <em>Tinnitus Temporal Characteristic</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tinnitus Temporal Characteristic</em>' attribute is set.
	 * @see #unsetTinnitusTemporalCharacteristic()
	 * @see #getTinnitusTemporalCharacteristic()
	 * @see #setTinnitusTemporalCharacteristic(TinnitusTemporalCharacteristicType)
	 * @generated
	 */
	boolean isSetTinnitusTemporalCharacteristic();

	/**
	 * Returns the value of the '<em><b>Other Measurement Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other notes. Eg. Tinnitus etiology information
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Measurement Notes</em>' attribute.
	 * @see #setOtherMeasurementNotes(String)
	 * @see com.himsa.measurement.tinnitus._500._500Package#getTinnitusMeasurementNotesType_OtherMeasurementNotes()
	 * @model dataType="com.himsa.measurement.tinnitus._500.OtherMeasurementNotesType"
	 *        extendedMetaData="kind='element' name='OtherMeasurementNotes' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOtherMeasurementNotes();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.tinnitus._500.TinnitusMeasurementNotesType#getOtherMeasurementNotes <em>Other Measurement Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Measurement Notes</em>' attribute.
	 * @see #getOtherMeasurementNotes()
	 * @generated
	 */
	void setOtherMeasurementNotes(String value);

} // TinnitusMeasurementNotesType
