/*
 */
package org.avatar.himsa.export;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.avatar.himsa.export.Patient#getPatientGUID <em>Patient GUID</em>}</li>
 *   <li>{@link org.avatar.himsa.export.Patient#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.avatar.himsa.export.Patient#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.avatar.himsa.export.Patient#getMiddleName <em>Middle Name</em>}</li>
 *   <li>{@link org.avatar.himsa.export.Patient#getPatientNo <em>Patient No</em>}</li>
 *   <li>{@link org.avatar.himsa.export.Patient#getActivePatient <em>Active Patient</em>}</li>
 *   <li>{@link org.avatar.himsa.export.Patient#getGender <em>Gender</em>}</li>
 *   <li>{@link org.avatar.himsa.export.Patient#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link org.avatar.himsa.export.Patient#getUserId <em>User Id</em>}</li>
 *   <li>{@link org.avatar.himsa.export.Patient#getCreateDate <em>Create Date</em>}</li>
 *   <li>{@link org.avatar.himsa.export.Patient#getAddress1 <em>Address1</em>}</li>
 *   <li>{@link org.avatar.himsa.export.Patient#getAddress2 <em>Address2</em>}</li>
 *   <li>{@link org.avatar.himsa.export.Patient#getAddress3 <em>Address3</em>}</li>
 *   <li>{@link org.avatar.himsa.export.Patient#getTitle <em>Title</em>}</li>
 *   <li>{@link org.avatar.himsa.export.Patient#getSalutation <em>Salutation</em>}</li>
 *   <li>{@link org.avatar.himsa.export.Patient#getSSNumber <em>SS Number</em>}</li>
 *   <li>{@link org.avatar.himsa.export.Patient#getZip <em>Zip</em>}</li>
 *   <li>{@link org.avatar.himsa.export.Patient#getCity <em>City</em>}</li>
 *   <li>{@link org.avatar.himsa.export.Patient#getProvince <em>Province</em>}</li>
 *   <li>{@link org.avatar.himsa.export.Patient#getCountry <em>Country</em>}</li>
 *   <li>{@link org.avatar.himsa.export.Patient#getEMail <em>EMail</em>}</li>
 *   <li>{@link org.avatar.himsa.export.Patient#getHomeTelephone <em>Home Telephone</em>}</li>
 *   <li>{@link org.avatar.himsa.export.Patient#getWorkTelephone <em>Work Telephone</em>}</li>
 *   <li>{@link org.avatar.himsa.export.Patient#getMobileTelephone <em>Mobile Telephone</em>}</li>
 *   <li>{@link org.avatar.himsa.export.Patient#getInsurance1 <em>Insurance1</em>}</li>
 *   <li>{@link org.avatar.himsa.export.Patient#getInsurance2 <em>Insurance2</em>}</li>
 *   <li>{@link org.avatar.himsa.export.Patient#getPhysician <em>Physician</em>}</li>
 *   <li>{@link org.avatar.himsa.export.Patient#getReferral <em>Referral</em>}</li>
 *   <li>{@link org.avatar.himsa.export.Patient#getOther1 <em>Other1</em>}</li>
 *   <li>{@link org.avatar.himsa.export.Patient#getOther2 <em>Other2</em>}</li>
 *   <li>{@link org.avatar.himsa.export.Patient#getBackEndSystemPatientId <em>Back End System Patient Id</em>}</li>
 * </ul>
 *
 * @see org.avatar.himsa.export.PatientExportPackage#getPatient()
 * @model extendedMetaData="name='Patient_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Patient extends EObject {
	/**
	 * Returns the value of the '<em><b>Patient GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient GUID</em>' attribute.
	 * @see #isSetPatientGUID()
	 * @see #unsetPatientGUID()
	 * @see #setPatientGUID(String)
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatient_PatientGUID()
	 * @model unsettable="true" id="true" dataType="org.avatar.himsa.export.PatientGUIDType"
	 *        extendedMetaData="kind='element' name='PatientGUID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPatientGUID();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.Patient#getPatientGUID <em>Patient GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient GUID</em>' attribute.
	 * @see #isSetPatientGUID()
	 * @see #unsetPatientGUID()
	 * @see #getPatientGUID()
	 * @generated
	 */
	void setPatientGUID(String value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.Patient#getPatientGUID <em>Patient GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPatientGUID()
	 * @see #getPatientGUID()
	 * @see #setPatientGUID(String)
	 * @generated
	 */
	void unsetPatientGUID();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.Patient#getPatientGUID <em>Patient GUID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Patient GUID</em>' attribute is set.
	 * @see #unsetPatientGUID()
	 * @see #getPatientGUID()
	 * @see #setPatientGUID(String)
	 * @generated
	 */
	boolean isSetPatientGUID();

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #isSetFirstName()
	 * @see #unsetFirstName()
	 * @see #setFirstName(String)
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatient_FirstName()
	 * @model unsettable="true" dataType="org.avatar.himsa.export.FirstNameType"
	 *        extendedMetaData="kind='element' name='FirstName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.Patient#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #isSetFirstName()
	 * @see #unsetFirstName()
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.Patient#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFirstName()
	 * @see #getFirstName()
	 * @see #setFirstName(String)
	 * @generated
	 */
	void unsetFirstName();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.Patient#getFirstName <em>First Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>First Name</em>' attribute is set.
	 * @see #unsetFirstName()
	 * @see #getFirstName()
	 * @see #setFirstName(String)
	 * @generated
	 */
	boolean isSetFirstName();

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #isSetLastName()
	 * @see #unsetLastName()
	 * @see #setLastName(String)
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatient_LastName()
	 * @model unsettable="true" dataType="org.avatar.himsa.export.LastNameType"
	 *        extendedMetaData="kind='element' name='LastName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.Patient#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #isSetLastName()
	 * @see #unsetLastName()
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.Patient#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLastName()
	 * @see #getLastName()
	 * @see #setLastName(String)
	 * @generated
	 */
	void unsetLastName();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.Patient#getLastName <em>Last Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Last Name</em>' attribute is set.
	 * @see #unsetLastName()
	 * @see #getLastName()
	 * @see #setLastName(String)
	 * @generated
	 */
	boolean isSetLastName();

	/**
	 * Returns the value of the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Middle Name</em>' attribute.
	 * @see #isSetMiddleName()
	 * @see #unsetMiddleName()
	 * @see #setMiddleName(String)
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatient_MiddleName()
	 * @model unsettable="true" dataType="org.avatar.himsa.export.MiddleNameType"
	 *        extendedMetaData="kind='element' name='MiddleName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMiddleName();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.Patient#getMiddleName <em>Middle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Middle Name</em>' attribute.
	 * @see #isSetMiddleName()
	 * @see #unsetMiddleName()
	 * @see #getMiddleName()
	 * @generated
	 */
	void setMiddleName(String value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.Patient#getMiddleName <em>Middle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMiddleName()
	 * @see #getMiddleName()
	 * @see #setMiddleName(String)
	 * @generated
	 */
	void unsetMiddleName();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.Patient#getMiddleName <em>Middle Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Middle Name</em>' attribute is set.
	 * @see #unsetMiddleName()
	 * @see #getMiddleName()
	 * @see #setMiddleName(String)
	 * @generated
	 */
	boolean isSetMiddleName();

	/**
	 * Returns the value of the '<em><b>Patient No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient No</em>' attribute.
	 * @see #isSetPatientNo()
	 * @see #unsetPatientNo()
	 * @see #setPatientNo(String)
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatient_PatientNo()
	 * @model unsettable="true" dataType="org.avatar.himsa.export.PatientNoType"
	 *        extendedMetaData="kind='element' name='PatientNo' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPatientNo();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.Patient#getPatientNo <em>Patient No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient No</em>' attribute.
	 * @see #isSetPatientNo()
	 * @see #unsetPatientNo()
	 * @see #getPatientNo()
	 * @generated
	 */
	void setPatientNo(String value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.Patient#getPatientNo <em>Patient No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPatientNo()
	 * @see #getPatientNo()
	 * @see #setPatientNo(String)
	 * @generated
	 */
	void unsetPatientNo();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.Patient#getPatientNo <em>Patient No</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Patient No</em>' attribute is set.
	 * @see #unsetPatientNo()
	 * @see #getPatientNo()
	 * @see #setPatientNo(String)
	 * @generated
	 */
	boolean isSetPatientNo();

	/**
	 * Returns the value of the '<em><b>Active Patient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Patient</em>' attribute.
	 * @see #isSetActivePatient()
	 * @see #unsetActivePatient()
	 * @see #setActivePatient(Boolean)
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatient_ActivePatient()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
	 *        extendedMetaData="kind='element' name='ActivePatient' namespace='##targetNamespace'"
	 * @generated
	 */
	Boolean getActivePatient();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.Patient#getActivePatient <em>Active Patient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Patient</em>' attribute.
	 * @see #isSetActivePatient()
	 * @see #unsetActivePatient()
	 * @see #getActivePatient()
	 * @generated
	 */
	void setActivePatient(Boolean value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.Patient#getActivePatient <em>Active Patient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActivePatient()
	 * @see #getActivePatient()
	 * @see #setActivePatient(Boolean)
	 * @generated
	 */
	void unsetActivePatient();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.Patient#getActivePatient <em>Active Patient</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Active Patient</em>' attribute is set.
	 * @see #unsetActivePatient()
	 * @see #getActivePatient()
	 * @see #setActivePatient(Boolean)
	 * @generated
	 */
	boolean isSetActivePatient();

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see #isSetGender()
	 * @see #unsetGender()
	 * @see #setGender(GenderType)
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatient_Gender()
	 * @model unsettable="true" dataType="org.avatar.himsa.export.GenderTypeObject"
	 *        extendedMetaData="kind='element' name='Gender' namespace='##targetNamespace'"
	 * @generated
	 */
	GenderType getGender();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.Patient#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see #isSetGender()
	 * @see #unsetGender()
	 * @see #getGender()
	 * @generated
	 */
	void setGender(GenderType value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.Patient#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGender()
	 * @see #getGender()
	 * @see #setGender(GenderType)
	 * @generated
	 */
	void unsetGender();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.Patient#getGender <em>Gender</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gender</em>' attribute is set.
	 * @see #unsetGender()
	 * @see #getGender()
	 * @see #setGender(GenderType)
	 * @generated
	 */
	boolean isSetGender();

	/**
	 * Returns the value of the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birth Date</em>' attribute.
	 * @see #isSetBirthDate()
	 * @see #unsetBirthDate()
	 * @see #setBirthDate(XMLGregorianCalendar)
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatient_BirthDate()
	 * @model unsettable="true" dataType="org.avatar.himsa.export.BirthDateType"
	 *        extendedMetaData="kind='element' name='BirthDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getBirthDate();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.Patient#getBirthDate <em>Birth Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birth Date</em>' attribute.
	 * @see #isSetBirthDate()
	 * @see #unsetBirthDate()
	 * @see #getBirthDate()
	 * @generated
	 */
	void setBirthDate(XMLGregorianCalendar value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.Patient#getBirthDate <em>Birth Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBirthDate()
	 * @see #getBirthDate()
	 * @see #setBirthDate(XMLGregorianCalendar)
	 * @generated
	 */
	void unsetBirthDate();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.Patient#getBirthDate <em>Birth Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Birth Date</em>' attribute is set.
	 * @see #unsetBirthDate()
	 * @see #getBirthDate()
	 * @see #setBirthDate(XMLGregorianCalendar)
	 * @generated
	 */
	boolean isSetBirthDate();

	/**
	 * Returns the value of the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Id</em>' attribute.
	 * @see #setUserId(String)
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatient_UserId()
	 * @model dataType="org.avatar.himsa.export.UserIdType1" required="true"
	 *        extendedMetaData="kind='element' name='UserId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUserId();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.Patient#getUserId <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Id</em>' attribute.
	 * @see #getUserId()
	 * @generated
	 */
	void setUserId(String value);

	/**
	 * Returns the value of the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Date</em>' attribute.
	 * @see #isSetCreateDate()
	 * @see #unsetCreateDate()
	 * @see #setCreateDate(XMLGregorianCalendar)
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatient_CreateDate()
	 * @model unsettable="true" dataType="org.avatar.himsa.export.CreateDateType"
	 *        extendedMetaData="kind='element' name='CreateDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getCreateDate();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.Patient#getCreateDate <em>Create Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Date</em>' attribute.
	 * @see #isSetCreateDate()
	 * @see #unsetCreateDate()
	 * @see #getCreateDate()
	 * @generated
	 */
	void setCreateDate(XMLGregorianCalendar value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.Patient#getCreateDate <em>Create Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCreateDate()
	 * @see #getCreateDate()
	 * @see #setCreateDate(XMLGregorianCalendar)
	 * @generated
	 */
	void unsetCreateDate();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.Patient#getCreateDate <em>Create Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Create Date</em>' attribute is set.
	 * @see #unsetCreateDate()
	 * @see #getCreateDate()
	 * @see #setCreateDate(XMLGregorianCalendar)
	 * @generated
	 */
	boolean isSetCreateDate();

	/**
	 * Returns the value of the '<em><b>Address1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address1</em>' attribute.
	 * @see #isSetAddress1()
	 * @see #unsetAddress1()
	 * @see #setAddress1(String)
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatient_Address1()
	 * @model unsettable="true" dataType="org.avatar.himsa.export.Address1Type"
	 *        extendedMetaData="kind='element' name='Address1' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAddress1();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.Patient#getAddress1 <em>Address1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address1</em>' attribute.
	 * @see #isSetAddress1()
	 * @see #unsetAddress1()
	 * @see #getAddress1()
	 * @generated
	 */
	void setAddress1(String value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.Patient#getAddress1 <em>Address1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAddress1()
	 * @see #getAddress1()
	 * @see #setAddress1(String)
	 * @generated
	 */
	void unsetAddress1();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.Patient#getAddress1 <em>Address1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Address1</em>' attribute is set.
	 * @see #unsetAddress1()
	 * @see #getAddress1()
	 * @see #setAddress1(String)
	 * @generated
	 */
	boolean isSetAddress1();

	/**
	 * Returns the value of the '<em><b>Address2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address2</em>' attribute.
	 * @see #isSetAddress2()
	 * @see #unsetAddress2()
	 * @see #setAddress2(String)
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatient_Address2()
	 * @model unsettable="true" dataType="org.avatar.himsa.export.Address2Type"
	 *        extendedMetaData="kind='element' name='Address2' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAddress2();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.Patient#getAddress2 <em>Address2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address2</em>' attribute.
	 * @see #isSetAddress2()
	 * @see #unsetAddress2()
	 * @see #getAddress2()
	 * @generated
	 */
	void setAddress2(String value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.Patient#getAddress2 <em>Address2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAddress2()
	 * @see #getAddress2()
	 * @see #setAddress2(String)
	 * @generated
	 */
	void unsetAddress2();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.Patient#getAddress2 <em>Address2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Address2</em>' attribute is set.
	 * @see #unsetAddress2()
	 * @see #getAddress2()
	 * @see #setAddress2(String)
	 * @generated
	 */
	boolean isSetAddress2();

	/**
	 * Returns the value of the '<em><b>Address3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address3</em>' attribute.
	 * @see #isSetAddress3()
	 * @see #unsetAddress3()
	 * @see #setAddress3(String)
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatient_Address3()
	 * @model unsettable="true" dataType="org.avatar.himsa.export.Address3Type"
	 *        extendedMetaData="kind='element' name='Address3' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAddress3();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.Patient#getAddress3 <em>Address3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address3</em>' attribute.
	 * @see #isSetAddress3()
	 * @see #unsetAddress3()
	 * @see #getAddress3()
	 * @generated
	 */
	void setAddress3(String value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.Patient#getAddress3 <em>Address3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAddress3()
	 * @see #getAddress3()
	 * @see #setAddress3(String)
	 * @generated
	 */
	void unsetAddress3();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.Patient#getAddress3 <em>Address3</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Address3</em>' attribute is set.
	 * @see #unsetAddress3()
	 * @see #getAddress3()
	 * @see #setAddress3(String)
	 * @generated
	 */
	boolean isSetAddress3();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #isSetTitle()
	 * @see #unsetTitle()
	 * @see #setTitle(String)
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatient_Title()
	 * @model unsettable="true" dataType="org.avatar.himsa.export.TitleType"
	 *        extendedMetaData="kind='element' name='Title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.Patient#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #isSetTitle()
	 * @see #unsetTitle()
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.Patient#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTitle()
	 * @see #getTitle()
	 * @see #setTitle(String)
	 * @generated
	 */
	void unsetTitle();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.Patient#getTitle <em>Title</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Title</em>' attribute is set.
	 * @see #unsetTitle()
	 * @see #getTitle()
	 * @see #setTitle(String)
	 * @generated
	 */
	boolean isSetTitle();

	/**
	 * Returns the value of the '<em><b>Salutation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salutation</em>' attribute.
	 * @see #isSetSalutation()
	 * @see #unsetSalutation()
	 * @see #setSalutation(String)
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatient_Salutation()
	 * @model unsettable="true" dataType="org.avatar.himsa.export.SalutationType"
	 *        extendedMetaData="kind='element' name='Salutation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSalutation();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.Patient#getSalutation <em>Salutation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salutation</em>' attribute.
	 * @see #isSetSalutation()
	 * @see #unsetSalutation()
	 * @see #getSalutation()
	 * @generated
	 */
	void setSalutation(String value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.Patient#getSalutation <em>Salutation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSalutation()
	 * @see #getSalutation()
	 * @see #setSalutation(String)
	 * @generated
	 */
	void unsetSalutation();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.Patient#getSalutation <em>Salutation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Salutation</em>' attribute is set.
	 * @see #unsetSalutation()
	 * @see #getSalutation()
	 * @see #setSalutation(String)
	 * @generated
	 */
	boolean isSetSalutation();

	/**
	 * Returns the value of the '<em><b>SS Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SS Number</em>' attribute.
	 * @see #isSetSSNumber()
	 * @see #unsetSSNumber()
	 * @see #setSSNumber(String)
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatient_SSNumber()
	 * @model unsettable="true" dataType="org.avatar.himsa.export.SSNumberType"
	 *        extendedMetaData="kind='element' name='SSNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSSNumber();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.Patient#getSSNumber <em>SS Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SS Number</em>' attribute.
	 * @see #isSetSSNumber()
	 * @see #unsetSSNumber()
	 * @see #getSSNumber()
	 * @generated
	 */
	void setSSNumber(String value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.Patient#getSSNumber <em>SS Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSSNumber()
	 * @see #getSSNumber()
	 * @see #setSSNumber(String)
	 * @generated
	 */
	void unsetSSNumber();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.Patient#getSSNumber <em>SS Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>SS Number</em>' attribute is set.
	 * @see #unsetSSNumber()
	 * @see #getSSNumber()
	 * @see #setSSNumber(String)
	 * @generated
	 */
	boolean isSetSSNumber();

	/**
	 * Returns the value of the '<em><b>Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Postal Code / Zip Code
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zip</em>' attribute.
	 * @see #isSetZip()
	 * @see #unsetZip()
	 * @see #setZip(String)
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatient_Zip()
	 * @model unsettable="true" dataType="org.avatar.himsa.export.ZipType"
	 *        extendedMetaData="kind='element' name='Zip' namespace='##targetNamespace'"
	 * @generated
	 */
	String getZip();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.Patient#getZip <em>Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zip</em>' attribute.
	 * @see #isSetZip()
	 * @see #unsetZip()
	 * @see #getZip()
	 * @generated
	 */
	void setZip(String value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.Patient#getZip <em>Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZip()
	 * @see #getZip()
	 * @see #setZip(String)
	 * @generated
	 */
	void unsetZip();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.Patient#getZip <em>Zip</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zip</em>' attribute is set.
	 * @see #unsetZip()
	 * @see #getZip()
	 * @see #setZip(String)
	 * @generated
	 */
	boolean isSetZip();

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #isSetCity()
	 * @see #unsetCity()
	 * @see #setCity(String)
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatient_City()
	 * @model unsettable="true" dataType="org.avatar.himsa.export.CityType"
	 *        extendedMetaData="kind='element' name='City' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.Patient#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #isSetCity()
	 * @see #unsetCity()
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.Patient#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCity()
	 * @see #getCity()
	 * @see #setCity(String)
	 * @generated
	 */
	void unsetCity();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.Patient#getCity <em>City</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>City</em>' attribute is set.
	 * @see #unsetCity()
	 * @see #getCity()
	 * @see #setCity(String)
	 * @generated
	 */
	boolean isSetCity();

	/**
	 * Returns the value of the '<em><b>Province</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Province</em>' attribute.
	 * @see #isSetProvince()
	 * @see #unsetProvince()
	 * @see #setProvince(String)
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatient_Province()
	 * @model unsettable="true" dataType="org.avatar.himsa.export.ProvinceType"
	 *        extendedMetaData="kind='element' name='Province' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProvince();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.Patient#getProvince <em>Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Province</em>' attribute.
	 * @see #isSetProvince()
	 * @see #unsetProvince()
	 * @see #getProvince()
	 * @generated
	 */
	void setProvince(String value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.Patient#getProvince <em>Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProvince()
	 * @see #getProvince()
	 * @see #setProvince(String)
	 * @generated
	 */
	void unsetProvince();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.Patient#getProvince <em>Province</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Province</em>' attribute is set.
	 * @see #unsetProvince()
	 * @see #getProvince()
	 * @see #setProvince(String)
	 * @generated
	 */
	boolean isSetProvince();

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #isSetCountry()
	 * @see #unsetCountry()
	 * @see #setCountry(String)
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatient_Country()
	 * @model unsettable="true" dataType="org.avatar.himsa.export.CountryType"
	 *        extendedMetaData="kind='element' name='Country' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.Patient#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #isSetCountry()
	 * @see #unsetCountry()
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.Patient#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCountry()
	 * @see #getCountry()
	 * @see #setCountry(String)
	 * @generated
	 */
	void unsetCountry();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.Patient#getCountry <em>Country</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Country</em>' attribute is set.
	 * @see #unsetCountry()
	 * @see #getCountry()
	 * @see #setCountry(String)
	 * @generated
	 */
	boolean isSetCountry();

	/**
	 * Returns the value of the '<em><b>EMail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EMail</em>' attribute.
	 * @see #isSetEMail()
	 * @see #unsetEMail()
	 * @see #setEMail(String)
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatient_EMail()
	 * @model unsettable="true" dataType="org.avatar.himsa.export.EMailType"
	 *        extendedMetaData="kind='element' name='EMail' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEMail();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.Patient#getEMail <em>EMail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EMail</em>' attribute.
	 * @see #isSetEMail()
	 * @see #unsetEMail()
	 * @see #getEMail()
	 * @generated
	 */
	void setEMail(String value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.Patient#getEMail <em>EMail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEMail()
	 * @see #getEMail()
	 * @see #setEMail(String)
	 * @generated
	 */
	void unsetEMail();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.Patient#getEMail <em>EMail</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>EMail</em>' attribute is set.
	 * @see #unsetEMail()
	 * @see #getEMail()
	 * @see #setEMail(String)
	 * @generated
	 */
	boolean isSetEMail();

	/**
	 * Returns the value of the '<em><b>Home Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Telephone</em>' attribute.
	 * @see #isSetHomeTelephone()
	 * @see #unsetHomeTelephone()
	 * @see #setHomeTelephone(String)
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatient_HomeTelephone()
	 * @model unsettable="true" dataType="org.avatar.himsa.export.HomeTelephoneType"
	 *        extendedMetaData="kind='element' name='HomeTelephone' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHomeTelephone();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.Patient#getHomeTelephone <em>Home Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Telephone</em>' attribute.
	 * @see #isSetHomeTelephone()
	 * @see #unsetHomeTelephone()
	 * @see #getHomeTelephone()
	 * @generated
	 */
	void setHomeTelephone(String value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.Patient#getHomeTelephone <em>Home Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHomeTelephone()
	 * @see #getHomeTelephone()
	 * @see #setHomeTelephone(String)
	 * @generated
	 */
	void unsetHomeTelephone();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.Patient#getHomeTelephone <em>Home Telephone</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Home Telephone</em>' attribute is set.
	 * @see #unsetHomeTelephone()
	 * @see #getHomeTelephone()
	 * @see #setHomeTelephone(String)
	 * @generated
	 */
	boolean isSetHomeTelephone();

	/**
	 * Returns the value of the '<em><b>Work Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Telephone</em>' attribute.
	 * @see #isSetWorkTelephone()
	 * @see #unsetWorkTelephone()
	 * @see #setWorkTelephone(String)
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatient_WorkTelephone()
	 * @model unsettable="true" dataType="org.avatar.himsa.export.WorkTelephoneType"
	 *        extendedMetaData="kind='element' name='WorkTelephone' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWorkTelephone();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.Patient#getWorkTelephone <em>Work Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Telephone</em>' attribute.
	 * @see #isSetWorkTelephone()
	 * @see #unsetWorkTelephone()
	 * @see #getWorkTelephone()
	 * @generated
	 */
	void setWorkTelephone(String value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.Patient#getWorkTelephone <em>Work Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorkTelephone()
	 * @see #getWorkTelephone()
	 * @see #setWorkTelephone(String)
	 * @generated
	 */
	void unsetWorkTelephone();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.Patient#getWorkTelephone <em>Work Telephone</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Work Telephone</em>' attribute is set.
	 * @see #unsetWorkTelephone()
	 * @see #getWorkTelephone()
	 * @see #setWorkTelephone(String)
	 * @generated
	 */
	boolean isSetWorkTelephone();

	/**
	 * Returns the value of the '<em><b>Mobile Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mobile Telephone</em>' attribute.
	 * @see #isSetMobileTelephone()
	 * @see #unsetMobileTelephone()
	 * @see #setMobileTelephone(String)
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatient_MobileTelephone()
	 * @model unsettable="true" dataType="org.avatar.himsa.export.MobileTelephoneType"
	 *        extendedMetaData="kind='element' name='MobileTelephone' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMobileTelephone();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.Patient#getMobileTelephone <em>Mobile Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mobile Telephone</em>' attribute.
	 * @see #isSetMobileTelephone()
	 * @see #unsetMobileTelephone()
	 * @see #getMobileTelephone()
	 * @generated
	 */
	void setMobileTelephone(String value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.Patient#getMobileTelephone <em>Mobile Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMobileTelephone()
	 * @see #getMobileTelephone()
	 * @see #setMobileTelephone(String)
	 * @generated
	 */
	void unsetMobileTelephone();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.Patient#getMobileTelephone <em>Mobile Telephone</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mobile Telephone</em>' attribute is set.
	 * @see #unsetMobileTelephone()
	 * @see #getMobileTelephone()
	 * @see #setMobileTelephone(String)
	 * @generated
	 */
	boolean isSetMobileTelephone();

	/**
	 * Returns the value of the '<em><b>Insurance1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insurance1</em>' attribute.
	 * @see #isSetInsurance1()
	 * @see #unsetInsurance1()
	 * @see #setInsurance1(String)
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatient_Insurance1()
	 * @model unsettable="true" dataType="org.avatar.himsa.export.Insurance1Type"
	 *        extendedMetaData="kind='element' name='Insurance1' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInsurance1();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.Patient#getInsurance1 <em>Insurance1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurance1</em>' attribute.
	 * @see #isSetInsurance1()
	 * @see #unsetInsurance1()
	 * @see #getInsurance1()
	 * @generated
	 */
	void setInsurance1(String value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.Patient#getInsurance1 <em>Insurance1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInsurance1()
	 * @see #getInsurance1()
	 * @see #setInsurance1(String)
	 * @generated
	 */
	void unsetInsurance1();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.Patient#getInsurance1 <em>Insurance1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Insurance1</em>' attribute is set.
	 * @see #unsetInsurance1()
	 * @see #getInsurance1()
	 * @see #setInsurance1(String)
	 * @generated
	 */
	boolean isSetInsurance1();

	/**
	 * Returns the value of the '<em><b>Insurance2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insurance2</em>' attribute.
	 * @see #isSetInsurance2()
	 * @see #unsetInsurance2()
	 * @see #setInsurance2(String)
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatient_Insurance2()
	 * @model unsettable="true" dataType="org.avatar.himsa.export.Insurance2Type"
	 *        extendedMetaData="kind='element' name='Insurance2' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInsurance2();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.Patient#getInsurance2 <em>Insurance2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurance2</em>' attribute.
	 * @see #isSetInsurance2()
	 * @see #unsetInsurance2()
	 * @see #getInsurance2()
	 * @generated
	 */
	void setInsurance2(String value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.Patient#getInsurance2 <em>Insurance2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInsurance2()
	 * @see #getInsurance2()
	 * @see #setInsurance2(String)
	 * @generated
	 */
	void unsetInsurance2();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.Patient#getInsurance2 <em>Insurance2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Insurance2</em>' attribute is set.
	 * @see #unsetInsurance2()
	 * @see #getInsurance2()
	 * @see #setInsurance2(String)
	 * @generated
	 */
	boolean isSetInsurance2();

	/**
	 * Returns the value of the '<em><b>Physician</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physician</em>' attribute.
	 * @see #isSetPhysician()
	 * @see #unsetPhysician()
	 * @see #setPhysician(String)
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatient_Physician()
	 * @model unsettable="true" dataType="org.avatar.himsa.export.PhysicianType"
	 *        extendedMetaData="kind='element' name='Physician' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPhysician();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.Patient#getPhysician <em>Physician</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physician</em>' attribute.
	 * @see #isSetPhysician()
	 * @see #unsetPhysician()
	 * @see #getPhysician()
	 * @generated
	 */
	void setPhysician(String value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.Patient#getPhysician <em>Physician</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhysician()
	 * @see #getPhysician()
	 * @see #setPhysician(String)
	 * @generated
	 */
	void unsetPhysician();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.Patient#getPhysician <em>Physician</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Physician</em>' attribute is set.
	 * @see #unsetPhysician()
	 * @see #getPhysician()
	 * @see #setPhysician(String)
	 * @generated
	 */
	boolean isSetPhysician();

	/**
	 * Returns the value of the '<em><b>Referral</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referral</em>' attribute.
	 * @see #isSetReferral()
	 * @see #unsetReferral()
	 * @see #setReferral(String)
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatient_Referral()
	 * @model unsettable="true" dataType="org.avatar.himsa.export.ReferralType"
	 *        extendedMetaData="kind='element' name='Referral' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReferral();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.Patient#getReferral <em>Referral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referral</em>' attribute.
	 * @see #isSetReferral()
	 * @see #unsetReferral()
	 * @see #getReferral()
	 * @generated
	 */
	void setReferral(String value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.Patient#getReferral <em>Referral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferral()
	 * @see #getReferral()
	 * @see #setReferral(String)
	 * @generated
	 */
	void unsetReferral();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.Patient#getReferral <em>Referral</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Referral</em>' attribute is set.
	 * @see #unsetReferral()
	 * @see #getReferral()
	 * @see #setReferral(String)
	 * @generated
	 */
	boolean isSetReferral();

	/**
	 * Returns the value of the '<em><b>Other1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other1</em>' attribute.
	 * @see #isSetOther1()
	 * @see #unsetOther1()
	 * @see #setOther1(String)
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatient_Other1()
	 * @model unsettable="true" dataType="org.avatar.himsa.export.Other1Type"
	 *        extendedMetaData="kind='element' name='Other1' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOther1();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.Patient#getOther1 <em>Other1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other1</em>' attribute.
	 * @see #isSetOther1()
	 * @see #unsetOther1()
	 * @see #getOther1()
	 * @generated
	 */
	void setOther1(String value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.Patient#getOther1 <em>Other1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOther1()
	 * @see #getOther1()
	 * @see #setOther1(String)
	 * @generated
	 */
	void unsetOther1();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.Patient#getOther1 <em>Other1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Other1</em>' attribute is set.
	 * @see #unsetOther1()
	 * @see #getOther1()
	 * @see #setOther1(String)
	 * @generated
	 */
	boolean isSetOther1();

	/**
	 * Returns the value of the '<em><b>Other2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other2</em>' attribute.
	 * @see #isSetOther2()
	 * @see #unsetOther2()
	 * @see #setOther2(String)
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatient_Other2()
	 * @model unsettable="true" dataType="org.avatar.himsa.export.Other2Type"
	 *        extendedMetaData="kind='element' name='Other2' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOther2();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.Patient#getOther2 <em>Other2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other2</em>' attribute.
	 * @see #isSetOther2()
	 * @see #unsetOther2()
	 * @see #getOther2()
	 * @generated
	 */
	void setOther2(String value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.Patient#getOther2 <em>Other2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOther2()
	 * @see #getOther2()
	 * @see #setOther2(String)
	 * @generated
	 */
	void unsetOther2();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.Patient#getOther2 <em>Other2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Other2</em>' attribute is set.
	 * @see #unsetOther2()
	 * @see #getOther2()
	 * @see #setOther2(String)
	 * @generated
	 */
	boolean isSetOther2();

	/**
	 * Returns the value of the '<em><b>Back End System Patient Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Back End System Patient Id</em>' attribute.
	 * @see #isSetBackEndSystemPatientId()
	 * @see #unsetBackEndSystemPatientId()
	 * @see #setBackEndSystemPatientId(String)
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatient_BackEndSystemPatientId()
	 * @model unsettable="true" dataType="org.avatar.himsa.export.BackEndSystemPatientIdType"
	 *        extendedMetaData="kind='element' name='BackEndSystemPatientId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBackEndSystemPatientId();

	/**
	 * Sets the value of the '{@link org.avatar.himsa.export.Patient#getBackEndSystemPatientId <em>Back End System Patient Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Back End System Patient Id</em>' attribute.
	 * @see #isSetBackEndSystemPatientId()
	 * @see #unsetBackEndSystemPatientId()
	 * @see #getBackEndSystemPatientId()
	 * @generated
	 */
	void setBackEndSystemPatientId(String value);

	/**
	 * Unsets the value of the '{@link org.avatar.himsa.export.Patient#getBackEndSystemPatientId <em>Back End System Patient Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBackEndSystemPatientId()
	 * @see #getBackEndSystemPatientId()
	 * @see #setBackEndSystemPatientId(String)
	 * @generated
	 */
	void unsetBackEndSystemPatientId();

	/**
	 * Returns whether the value of the '{@link org.avatar.himsa.export.Patient#getBackEndSystemPatientId <em>Back End System Patient Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Back End System Patient Id</em>' attribute is set.
	 * @see #unsetBackEndSystemPatientId()
	 * @see #getBackEndSystemPatientId()
	 * @see #setBackEndSystemPatientId(String)
	 * @generated
	 */
	boolean isSetBackEndSystemPatientId();

} // Patient
