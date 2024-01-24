/*
 */
package admittance;

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
 * 
 * @@Convert down Rule: Going from 501->500.  This element and concept did not exist so none of the data in this element can be convereted down @@
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link admittance.MeasurementNotesType#getTympanometerMakeModel <em>Tympanometer Make Model</em>}</li>
 *   <li>{@link admittance.MeasurementNotesType#getTympanometerSerialNumber <em>Tympanometer Serial Number</em>}</li>
 *   <li>{@link admittance.MeasurementNotesType#getTympanometerLastCalibration <em>Tympanometer Last Calibration</em>}</li>
 *   <li>{@link admittance.MeasurementNotesType#getIsDeaf <em>Is Deaf</em>}</li>
 * </ul>
 *
 * @see admittance.AdmittancePackage#getMeasurementNotesType()
 * @model extendedMetaData="name='MeasurementNotes_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MeasurementNotesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Tympanometer Make Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Manufacturer Make Model of the equipment used.
	 * 
	 * @@Convert down Rule: Going from 501->500.  This element and concept did not exist so none of the data in this element can be convereted down @@
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tympanometer Make Model</em>' attribute.
	 * @see #setTympanometerMakeModel(String)
	 * @see admittance.AdmittancePackage#getMeasurementNotesType_TympanometerMakeModel()
	 * @model dataType="admittance.TympanometerMakeModelType"
	 *        extendedMetaData="kind='element' name='TympanometerMakeModel' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTympanometerMakeModel();

	/**
	 * Sets the value of the '{@link admittance.MeasurementNotesType#getTympanometerMakeModel <em>Tympanometer Make Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tympanometer Make Model</em>' attribute.
	 * @see #getTympanometerMakeModel()
	 * @generated
	 */
	void setTympanometerMakeModel(String value);

	/**
	 * Returns the value of the '<em><b>Tympanometer Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Manufacturer Serial Number of the equipment used.
	 * 
	 * @@Convert down Rule: Going from 501->500.  This element and concept did not exist so none of the data in this element can be convereted down @@
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tympanometer Serial Number</em>' attribute.
	 * @see #setTympanometerSerialNumber(String)
	 * @see admittance.AdmittancePackage#getMeasurementNotesType_TympanometerSerialNumber()
	 * @model dataType="admittance.TympanometerSerialNumberType"
	 *        extendedMetaData="kind='element' name='TympanometerSerialNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTympanometerSerialNumber();

	/**
	 * Sets the value of the '{@link admittance.MeasurementNotesType#getTympanometerSerialNumber <em>Tympanometer Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tympanometer Serial Number</em>' attribute.
	 * @see #getTympanometerSerialNumber()
	 * @generated
	 */
	void setTympanometerSerialNumber(String value);

	/**
	 * Returns the value of the '<em><b>Tympanometer Last Calibration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date of Last Calibration of the equipment used.
	 * 
	 * @@Convert down Rule: Going from 501->500.  This element and concept did not exist so none of the data in this element can be convereted down @@
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tympanometer Last Calibration</em>' attribute.
	 * @see #setTympanometerLastCalibration(XMLGregorianCalendar)
	 * @see admittance.AdmittancePackage#getMeasurementNotesType_TympanometerLastCalibration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='TympanometerLastCalibration' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTympanometerLastCalibration();

	/**
	 * Sets the value of the '{@link admittance.MeasurementNotesType#getTympanometerLastCalibration <em>Tympanometer Last Calibration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tympanometer Last Calibration</em>' attribute.
	 * @see #getTympanometerLastCalibration()
	 * @generated
	 */
	void setTympanometerLastCalibration(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Is Deaf</b></em>' attribute.
	 * The literals are from the enumeration {@link admittance.EarType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element is used to clearly signal that the patient is deaf in the ear choice that is set.  If a value is set then the reader of the data can assume that this is a valid reason for why testing was conducted for the set ear(s) or any data present for a deaf ear.  If an ear selection is made then user conducting the Audiogram test has determined that the ear choice is deaf.
	 * 
	 * This approach is taken rather than requiring the reader of the data to pay attention to curves that may be present with the PointStatus_Type is set to something like DidNotTest or CouldNotTest, or NoResponse at the maximum output of the audiometer, which can vary per audiometer.
	 * 
	 * @@Convert down Rule: Going from 501->500.  This element and concept did not exist so none of the data in this element can be convereted down @@
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Deaf</em>' attribute.
	 * @see admittance.EarType
	 * @see #isSetIsDeaf()
	 * @see #unsetIsDeaf()
	 * @see #setIsDeaf(EarType)
	 * @see admittance.AdmittancePackage#getMeasurementNotesType_IsDeaf()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='IsDeaf' namespace='##targetNamespace'"
	 * @generated
	 */
	EarType getIsDeaf();

	/**
	 * Sets the value of the '{@link admittance.MeasurementNotesType#getIsDeaf <em>Is Deaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Deaf</em>' attribute.
	 * @see admittance.EarType
	 * @see #isSetIsDeaf()
	 * @see #unsetIsDeaf()
	 * @see #getIsDeaf()
	 * @generated
	 */
	void setIsDeaf(EarType value);

	/**
	 * Unsets the value of the '{@link admittance.MeasurementNotesType#getIsDeaf <em>Is Deaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsDeaf()
	 * @see #getIsDeaf()
	 * @see #setIsDeaf(EarType)
	 * @generated
	 */
	void unsetIsDeaf();

	/**
	 * Returns whether the value of the '{@link admittance.MeasurementNotesType#getIsDeaf <em>Is Deaf</em>}' attribute is set.
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
