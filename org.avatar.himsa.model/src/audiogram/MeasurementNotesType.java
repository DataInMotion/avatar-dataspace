/*
 */
package audiogram;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Notes Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Measurement Notes structure is designed to hold the notes from an Audiological
 * Measurement. The information herein could be useful to other entities as the information
 * affects the test and its results.
 * 
 * ## TMeasurementNotes ##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link audiogram.MeasurementNotesType#getAudiometerMakeModel <em>Audiometer Make Model</em>}</li>
 *   <li>{@link audiogram.MeasurementNotesType#getAudiometerSerialNumber <em>Audiometer Serial Number</em>}</li>
 *   <li>{@link audiogram.MeasurementNotesType#getAudiometerLastCalibration <em>Audiometer Last Calibration</em>}</li>
 *   <li>{@link audiogram.MeasurementNotesType#getTestMethod <em>Test Method</em>}</li>
 *   <li>{@link audiogram.MeasurementNotesType#getTestReliability <em>Test Reliability</em>}</li>
 * </ul>
 *
 * @see audiogram.AudiogramPackage#getMeasurementNotesType()
 * @model extendedMetaData="name='MeasurementNotes_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MeasurementNotesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Audiometer Make Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Manufacturer Make Model of the equipment used.
	 * 
	 * ## makeModel ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Audiometer Make Model</em>' attribute.
	 * @see #setAudiometerMakeModel(String)
	 * @see audiogram.AudiogramPackage#getMeasurementNotesType_AudiometerMakeModel()
	 * @model dataType="audiogram.AudiometerMakeModelType"
	 *        extendedMetaData="kind='element' name='AudiometerMakeModel' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAudiometerMakeModel();

	/**
	 * Sets the value of the '{@link audiogram.MeasurementNotesType#getAudiometerMakeModel <em>Audiometer Make Model</em>}' attribute.
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
	 * The Manufacturer Serial Number of the equipment used.
	 * 
	 * ## serialNo ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Audiometer Serial Number</em>' attribute.
	 * @see #setAudiometerSerialNumber(String)
	 * @see audiogram.AudiogramPackage#getMeasurementNotesType_AudiometerSerialNumber()
	 * @model dataType="audiogram.AudiometerSerialNumberType"
	 *        extendedMetaData="kind='element' name='AudiometerSerialNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAudiometerSerialNumber();

	/**
	 * Sets the value of the '{@link audiogram.MeasurementNotesType#getAudiometerSerialNumber <em>Audiometer Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audiometer Serial Number</em>' attribute.
	 * @see #getAudiometerSerialNumber()
	 * @generated
	 */
	void setAudiometerSerialNumber(String value);

	/**
	 * Returns the value of the '<em><b>Audiometer Last Calibration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date of Last Calibration of the equipment used.
	 * 
	 * ## dateOfLastCalibration ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Audiometer Last Calibration</em>' attribute.
	 * @see #setAudiometerLastCalibration(XMLGregorianCalendar)
	 * @see audiogram.AudiogramPackage#getMeasurementNotesType_AudiometerLastCalibration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='AudiometerLastCalibration' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getAudiometerLastCalibration();

	/**
	 * Sets the value of the '{@link audiogram.MeasurementNotesType#getAudiometerLastCalibration <em>Audiometer Last Calibration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audiometer Last Calibration</em>' attribute.
	 * @see #getAudiometerLastCalibration()
	 * @generated
	 */
	void setAudiometerLastCalibration(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Test Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * It is possible to carry out Audiological tests according to a number of different protocols. This field allows the actual method of testing to be described.  For example, Visual reinforcement Audiometry is used to achieve a Pure Tone Audiogram from small children and the audiologist would comment that testing was performed using this method.
	 * 
	 * ## testMethod ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Method</em>' attribute.
	 * @see #setTestMethod(String)
	 * @see audiogram.AudiogramPackage#getMeasurementNotesType_TestMethod()
	 * @model dataType="audiogram.TestMethodType"
	 *        extendedMetaData="kind='element' name='TestMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTestMethod();

	/**
	 * Sets the value of the '{@link audiogram.MeasurementNotesType#getTestMethod <em>Test Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Method</em>' attribute.
	 * @see #getTestMethod()
	 * @generated
	 */
	void setTestMethod(String value);

	/**
	 * Returns the value of the '<em><b>Test Reliability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Patients are required to respond consistently at the same level during pure tone audiometry in order to find their HTL accurately. For some patients this is not possible and an accurate HTL cannot be established because the patient responds at varying levels during the testing claiming them to be their HTL. The audiologist would generally remark that the responses were not accurate by writing a comment in the reliability field
	 * 
	 * ## testReliability ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Reliability</em>' attribute.
	 * @see #setTestReliability(String)
	 * @see audiogram.AudiogramPackage#getMeasurementNotesType_TestReliability()
	 * @model dataType="audiogram.TestReliabilityType"
	 *        extendedMetaData="kind='element' name='TestReliability' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTestReliability();

	/**
	 * Sets the value of the '{@link audiogram.MeasurementNotesType#getTestReliability <em>Test Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Reliability</em>' attribute.
	 * @see #getTestReliability()
	 * @generated
	 */
	void setTestReliability(String value);

} // MeasurementNotesType
