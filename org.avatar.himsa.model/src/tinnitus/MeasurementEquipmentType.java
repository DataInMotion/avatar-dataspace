/*
 */
package tinnitus;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Equipment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Measurement equipment used for the Tinnitus Measurement. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tinnitus.MeasurementEquipmentType#getAudiometerMakeModel <em>Audiometer Make Model</em>}</li>
 *   <li>{@link tinnitus.MeasurementEquipmentType#getAudiometerSerialNumber <em>Audiometer Serial Number</em>}</li>
 *   <li>{@link tinnitus.MeasurementEquipmentType#getAudiometerLastCalibrationDate <em>Audiometer Last Calibration Date</em>}</li>
 * </ul>
 *
 * @see tinnitus.TinnitusPackage#getMeasurementEquipmentType()
 * @model extendedMetaData="name='MeasurementEquipment_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MeasurementEquipmentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Audiometer Make Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Manufacturer Make Model of the equipment used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Audiometer Make Model</em>' attribute.
	 * @see #setAudiometerMakeModel(String)
	 * @see tinnitus.TinnitusPackage#getMeasurementEquipmentType_AudiometerMakeModel()
	 * @model dataType="tinnitus.AudiometerMakeModelType"
	 *        extendedMetaData="kind='element' name='AudiometerMakeModel' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAudiometerMakeModel();

	/**
	 * Sets the value of the '{@link tinnitus.MeasurementEquipmentType#getAudiometerMakeModel <em>Audiometer Make Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audiometer Make Model</em>' attribute.
	 * @see #getAudiometerMakeModel()
	 * @generated
	 */
	void setAudiometerMakeModel(String value);

	/**
	 * Returns the value of the '<em><b>Audiometer Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Serial Number of the equipment used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Audiometer Serial Number</em>' attribute.
	 * @see #setAudiometerSerialNumber(String)
	 * @see tinnitus.TinnitusPackage#getMeasurementEquipmentType_AudiometerSerialNumber()
	 * @model dataType="tinnitus.AudiometerSerialNumberType"
	 *        extendedMetaData="kind='element' name='AudiometerSerialNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAudiometerSerialNumber();

	/**
	 * Sets the value of the '{@link tinnitus.MeasurementEquipmentType#getAudiometerSerialNumber <em>Audiometer Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audiometer Serial Number</em>' attribute.
	 * @see #getAudiometerSerialNumber()
	 * @generated
	 */
	void setAudiometerSerialNumber(String value);

	/**
	 * Returns the value of the '<em><b>Audiometer Last Calibration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date of Last Calibration of the equipment used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Audiometer Last Calibration Date</em>' attribute.
	 * @see #setAudiometerLastCalibrationDate(XMLGregorianCalendar)
	 * @see tinnitus.TinnitusPackage#getMeasurementEquipmentType_AudiometerLastCalibrationDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='AudiometerLastCalibrationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getAudiometerLastCalibrationDate();

	/**
	 * Sets the value of the '{@link tinnitus.MeasurementEquipmentType#getAudiometerLastCalibrationDate <em>Audiometer Last Calibration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audiometer Last Calibration Date</em>' attribute.
	 * @see #getAudiometerLastCalibrationDate()
	 * @generated
	 */
	void setAudiometerLastCalibrationDate(XMLGregorianCalendar value);

} // MeasurementEquipmentType
