/*
 */
package com.himsa.measurement.audiogram._502;

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
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram._502.MeasurementNotesType#getAudiometerMakeModel <em>Audiometer Make Model</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.MeasurementNotesType#getAudiometerSerialNumber <em>Audiometer Serial Number</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.MeasurementNotesType#getAudiometerLastCalibration <em>Audiometer Last Calibration</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.MeasurementNotesType#getTestMethod <em>Test Method</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.MeasurementNotesType#getTestReliability <em>Test Reliability</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.MeasurementNotesType#getIsDeaf <em>Is Deaf</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.audiogram._502._502Package#getMeasurementNotesType()
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
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Audiometer Make Model</em>' attribute.
	 * @see #setAudiometerMakeModel(String)
	 * @see com.himsa.measurement.audiogram._502._502Package#getMeasurementNotesType_AudiometerMakeModel()
	 * @model dataType="com.himsa.measurement.audiogram._502.AudiometerMakeModelType"
	 *        extendedMetaData="kind='element' name='AudiometerMakeModel' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAudiometerMakeModel();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.MeasurementNotesType#getAudiometerMakeModel <em>Audiometer Make Model</em>}' attribute.
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
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Audiometer Serial Number</em>' attribute.
	 * @see #setAudiometerSerialNumber(String)
	 * @see com.himsa.measurement.audiogram._502._502Package#getMeasurementNotesType_AudiometerSerialNumber()
	 * @model dataType="com.himsa.measurement.audiogram._502.AudiometerSerialNumberType"
	 *        extendedMetaData="kind='element' name='AudiometerSerialNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAudiometerSerialNumber();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.MeasurementNotesType#getAudiometerSerialNumber <em>Audiometer Serial Number</em>}' attribute.
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
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Audiometer Last Calibration</em>' attribute.
	 * @see #setAudiometerLastCalibration(XMLGregorianCalendar)
	 * @see com.himsa.measurement.audiogram._502._502Package#getMeasurementNotesType_AudiometerLastCalibration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='AudiometerLastCalibration' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getAudiometerLastCalibration();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.MeasurementNotesType#getAudiometerLastCalibration <em>Audiometer Last Calibration</em>}' attribute.
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
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Method</em>' attribute.
	 * @see #setTestMethod(String)
	 * @see com.himsa.measurement.audiogram._502._502Package#getMeasurementNotesType_TestMethod()
	 * @model dataType="com.himsa.measurement.audiogram._502.TestMethodType"
	 *        extendedMetaData="kind='element' name='TestMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTestMethod();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.MeasurementNotesType#getTestMethod <em>Test Method</em>}' attribute.
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
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Reliability</em>' attribute.
	 * @see #setTestReliability(String)
	 * @see com.himsa.measurement.audiogram._502._502Package#getMeasurementNotesType_TestReliability()
	 * @model dataType="com.himsa.measurement.audiogram._502.TestReliabilityType"
	 *        extendedMetaData="kind='element' name='TestReliability' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTestReliability();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.MeasurementNotesType#getTestReliability <em>Test Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Reliability</em>' attribute.
	 * @see #getTestReliability()
	 * @generated
	 */
	void setTestReliability(String value);

	/**
	 * Returns the value of the '<em><b>Is Deaf</b></em>' attribute.
	 * The literals are from the enumeration {@link com.himsa.measurement.audiogram._502.EarType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element is used to clearly signal that the patient is deaf in the ear choice that is set.  If a value is set then the reader of the data can assume that this is a valid reason for why testing was conducted for the set ear(s) or any data present for a deaf ear.  If an ear selection is made then user conducting the Audiogram test has determined that the ear choice is deaf.
	 * 
	 * This approach is taken rather than requiring the reader of the data to pay attention to curves that may be present with the PointStatus_Type is set to something like DidNotTest or CouldNotTest, or NoResponse at the maximum output of the audiometer, which can vary per audiometer.
	 * 
	 * @@Convert down Rule: Going from 502->500.  This element and concept did not exist so none of the data in this element can be convereted down @@
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Deaf</em>' attribute.
	 * @see com.himsa.measurement.audiogram._502.EarType
	 * @see #isSetIsDeaf()
	 * @see #unsetIsDeaf()
	 * @see #setIsDeaf(EarType)
	 * @see com.himsa.measurement.audiogram._502._502Package#getMeasurementNotesType_IsDeaf()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='IsDeaf' namespace='##targetNamespace'"
	 * @generated
	 */
	EarType getIsDeaf();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram._502.MeasurementNotesType#getIsDeaf <em>Is Deaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Deaf</em>' attribute.
	 * @see com.himsa.measurement.audiogram._502.EarType
	 * @see #isSetIsDeaf()
	 * @see #unsetIsDeaf()
	 * @see #getIsDeaf()
	 * @generated
	 */
	void setIsDeaf(EarType value);

	/**
	 * Unsets the value of the '{@link com.himsa.measurement.audiogram._502.MeasurementNotesType#getIsDeaf <em>Is Deaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsDeaf()
	 * @see #getIsDeaf()
	 * @see #setIsDeaf(EarType)
	 * @generated
	 */
	void unsetIsDeaf();

	/**
	 * Returns whether the value of the '{@link com.himsa.measurement.audiogram._502.MeasurementNotesType#getIsDeaf <em>Is Deaf</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Deaf</em>' attribute is set.
	 * @see #unsetIsDeaf()
	 * @see #getIsDeaf()
	 * @see #setIsDeaf(EarType)
	 * @generated
	 */
	boolean isSetIsDeaf();

} // MeasurementNotesType
