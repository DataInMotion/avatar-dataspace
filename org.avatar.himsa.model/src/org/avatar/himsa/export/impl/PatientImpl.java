/*
 */
package org.avatar.himsa.export.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.avatar.himsa.export.GenderType;
import org.avatar.himsa.export.Patient;
import org.avatar.himsa.export.PatientExportPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.avatar.himsa.export.impl.PatientImpl#getPatientGUID <em>Patient GUID</em>}</li>
 *   <li>{@link org.avatar.himsa.export.impl.PatientImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.avatar.himsa.export.impl.PatientImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.avatar.himsa.export.impl.PatientImpl#getMiddleName <em>Middle Name</em>}</li>
 *   <li>{@link org.avatar.himsa.export.impl.PatientImpl#getPatientNo <em>Patient No</em>}</li>
 *   <li>{@link org.avatar.himsa.export.impl.PatientImpl#getActivePatient <em>Active Patient</em>}</li>
 *   <li>{@link org.avatar.himsa.export.impl.PatientImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link org.avatar.himsa.export.impl.PatientImpl#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link org.avatar.himsa.export.impl.PatientImpl#getUserId <em>User Id</em>}</li>
 *   <li>{@link org.avatar.himsa.export.impl.PatientImpl#getCreateDate <em>Create Date</em>}</li>
 *   <li>{@link org.avatar.himsa.export.impl.PatientImpl#getAddress1 <em>Address1</em>}</li>
 *   <li>{@link org.avatar.himsa.export.impl.PatientImpl#getAddress2 <em>Address2</em>}</li>
 *   <li>{@link org.avatar.himsa.export.impl.PatientImpl#getAddress3 <em>Address3</em>}</li>
 *   <li>{@link org.avatar.himsa.export.impl.PatientImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.avatar.himsa.export.impl.PatientImpl#getSalutation <em>Salutation</em>}</li>
 *   <li>{@link org.avatar.himsa.export.impl.PatientImpl#getSSNumber <em>SS Number</em>}</li>
 *   <li>{@link org.avatar.himsa.export.impl.PatientImpl#getZip <em>Zip</em>}</li>
 *   <li>{@link org.avatar.himsa.export.impl.PatientImpl#getCity <em>City</em>}</li>
 *   <li>{@link org.avatar.himsa.export.impl.PatientImpl#getProvince <em>Province</em>}</li>
 *   <li>{@link org.avatar.himsa.export.impl.PatientImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.avatar.himsa.export.impl.PatientImpl#getEMail <em>EMail</em>}</li>
 *   <li>{@link org.avatar.himsa.export.impl.PatientImpl#getHomeTelephone <em>Home Telephone</em>}</li>
 *   <li>{@link org.avatar.himsa.export.impl.PatientImpl#getWorkTelephone <em>Work Telephone</em>}</li>
 *   <li>{@link org.avatar.himsa.export.impl.PatientImpl#getMobileTelephone <em>Mobile Telephone</em>}</li>
 *   <li>{@link org.avatar.himsa.export.impl.PatientImpl#getInsurance1 <em>Insurance1</em>}</li>
 *   <li>{@link org.avatar.himsa.export.impl.PatientImpl#getInsurance2 <em>Insurance2</em>}</li>
 *   <li>{@link org.avatar.himsa.export.impl.PatientImpl#getPhysician <em>Physician</em>}</li>
 *   <li>{@link org.avatar.himsa.export.impl.PatientImpl#getReferral <em>Referral</em>}</li>
 *   <li>{@link org.avatar.himsa.export.impl.PatientImpl#getOther1 <em>Other1</em>}</li>
 *   <li>{@link org.avatar.himsa.export.impl.PatientImpl#getOther2 <em>Other2</em>}</li>
 *   <li>{@link org.avatar.himsa.export.impl.PatientImpl#getBackEndSystemPatientId <em>Back End System Patient Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatientImpl extends MinimalEObjectImpl.Container implements Patient {
	/**
	 * The default value of the '{@link #getPatientGUID() <em>Patient GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientGUID()
	 * @generated
	 * @ordered
	 */
	protected static final String PATIENT_GUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPatientGUID() <em>Patient GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientGUID()
	 * @generated
	 * @ordered
	 */
	protected String patientGUID = PATIENT_GUID_EDEFAULT;

	/**
	 * This is true if the Patient GUID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean patientGUIDESet;

	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * This is true if the First Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean firstNameESet;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * This is true if the Last Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lastNameESet;

	/**
	 * The default value of the '{@link #getMiddleName() <em>Middle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddleName()
	 * @generated
	 * @ordered
	 */
	protected static final String MIDDLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMiddleName() <em>Middle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddleName()
	 * @generated
	 * @ordered
	 */
	protected String middleName = MIDDLE_NAME_EDEFAULT;

	/**
	 * This is true if the Middle Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean middleNameESet;

	/**
	 * The default value of the '{@link #getPatientNo() <em>Patient No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientNo()
	 * @generated
	 * @ordered
	 */
	protected static final String PATIENT_NO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPatientNo() <em>Patient No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientNo()
	 * @generated
	 * @ordered
	 */
	protected String patientNo = PATIENT_NO_EDEFAULT;

	/**
	 * This is true if the Patient No attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean patientNoESet;

	/**
	 * The default value of the '{@link #getActivePatient() <em>Active Patient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePatient()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ACTIVE_PATIENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivePatient() <em>Active Patient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePatient()
	 * @generated
	 * @ordered
	 */
	protected Boolean activePatient = ACTIVE_PATIENT_EDEFAULT;

	/**
	 * This is true if the Active Patient attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean activePatientESet;

	/**
	 * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected static final GenderType GENDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected GenderType gender = GENDER_EDEFAULT;

	/**
	 * This is true if the Gender attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean genderESet;

	/**
	 * The default value of the '{@link #getBirthDate() <em>Birth Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar BIRTH_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBirthDate() <em>Birth Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar birthDate = BIRTH_DATE_EDEFAULT;

	/**
	 * This is true if the Birth Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean birthDateESet;

	/**
	 * The default value of the '{@link #getUserId() <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserId()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserId() <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserId()
	 * @generated
	 * @ordered
	 */
	protected String userId = USER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreateDate() <em>Create Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CREATE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreateDate() <em>Create Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar createDate = CREATE_DATE_EDEFAULT;

	/**
	 * This is true if the Create Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean createDateESet;

	/**
	 * The default value of the '{@link #getAddress1() <em>Address1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress1()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress1() <em>Address1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress1()
	 * @generated
	 * @ordered
	 */
	protected String address1 = ADDRESS1_EDEFAULT;

	/**
	 * This is true if the Address1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean address1ESet;

	/**
	 * The default value of the '{@link #getAddress2() <em>Address2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress2()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress2() <em>Address2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress2()
	 * @generated
	 * @ordered
	 */
	protected String address2 = ADDRESS2_EDEFAULT;

	/**
	 * This is true if the Address2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean address2ESet;

	/**
	 * The default value of the '{@link #getAddress3() <em>Address3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress3()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress3() <em>Address3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress3()
	 * @generated
	 * @ordered
	 */
	protected String address3 = ADDRESS3_EDEFAULT;

	/**
	 * This is true if the Address3 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean address3ESet;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * This is true if the Title attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean titleESet;

	/**
	 * The default value of the '{@link #getSalutation() <em>Salutation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalutation()
	 * @generated
	 * @ordered
	 */
	protected static final String SALUTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSalutation() <em>Salutation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalutation()
	 * @generated
	 * @ordered
	 */
	protected String salutation = SALUTATION_EDEFAULT;

	/**
	 * This is true if the Salutation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean salutationESet;

	/**
	 * The default value of the '{@link #getSSNumber() <em>SS Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SS_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSNumber() <em>SS Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSNumber()
	 * @generated
	 * @ordered
	 */
	protected String sSNumber = SS_NUMBER_EDEFAULT;

	/**
	 * This is true if the SS Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sSNumberESet;

	/**
	 * The default value of the '{@link #getZip() <em>Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZip()
	 * @generated
	 * @ordered
	 */
	protected static final String ZIP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZip() <em>Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZip()
	 * @generated
	 * @ordered
	 */
	protected String zip = ZIP_EDEFAULT;

	/**
	 * This is true if the Zip attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zipESet;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * This is true if the City attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cityESet;

	/**
	 * The default value of the '{@link #getProvince() <em>Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvince()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVINCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProvince() <em>Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvince()
	 * @generated
	 * @ordered
	 */
	protected String province = PROVINCE_EDEFAULT;

	/**
	 * This is true if the Province attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean provinceESet;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * This is true if the Country attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean countryESet;

	/**
	 * The default value of the '{@link #getEMail() <em>EMail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEMail() <em>EMail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMail()
	 * @generated
	 * @ordered
	 */
	protected String eMail = EMAIL_EDEFAULT;

	/**
	 * This is true if the EMail attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eMailESet;

	/**
	 * The default value of the '{@link #getHomeTelephone() <em>Home Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeTelephone()
	 * @generated
	 * @ordered
	 */
	protected static final String HOME_TELEPHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHomeTelephone() <em>Home Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeTelephone()
	 * @generated
	 * @ordered
	 */
	protected String homeTelephone = HOME_TELEPHONE_EDEFAULT;

	/**
	 * This is true if the Home Telephone attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean homeTelephoneESet;

	/**
	 * The default value of the '{@link #getWorkTelephone() <em>Work Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkTelephone()
	 * @generated
	 * @ordered
	 */
	protected static final String WORK_TELEPHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkTelephone() <em>Work Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkTelephone()
	 * @generated
	 * @ordered
	 */
	protected String workTelephone = WORK_TELEPHONE_EDEFAULT;

	/**
	 * This is true if the Work Telephone attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean workTelephoneESet;

	/**
	 * The default value of the '{@link #getMobileTelephone() <em>Mobile Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobileTelephone()
	 * @generated
	 * @ordered
	 */
	protected static final String MOBILE_TELEPHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMobileTelephone() <em>Mobile Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobileTelephone()
	 * @generated
	 * @ordered
	 */
	protected String mobileTelephone = MOBILE_TELEPHONE_EDEFAULT;

	/**
	 * This is true if the Mobile Telephone attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mobileTelephoneESet;

	/**
	 * The default value of the '{@link #getInsurance1() <em>Insurance1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurance1()
	 * @generated
	 * @ordered
	 */
	protected static final String INSURANCE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInsurance1() <em>Insurance1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurance1()
	 * @generated
	 * @ordered
	 */
	protected String insurance1 = INSURANCE1_EDEFAULT;

	/**
	 * This is true if the Insurance1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean insurance1ESet;

	/**
	 * The default value of the '{@link #getInsurance2() <em>Insurance2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurance2()
	 * @generated
	 * @ordered
	 */
	protected static final String INSURANCE2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInsurance2() <em>Insurance2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurance2()
	 * @generated
	 * @ordered
	 */
	protected String insurance2 = INSURANCE2_EDEFAULT;

	/**
	 * This is true if the Insurance2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean insurance2ESet;

	/**
	 * The default value of the '{@link #getPhysician() <em>Physician</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysician()
	 * @generated
	 * @ordered
	 */
	protected static final String PHYSICIAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhysician() <em>Physician</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysician()
	 * @generated
	 * @ordered
	 */
	protected String physician = PHYSICIAN_EDEFAULT;

	/**
	 * This is true if the Physician attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean physicianESet;

	/**
	 * The default value of the '{@link #getReferral() <em>Referral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferral()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERRAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferral() <em>Referral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferral()
	 * @generated
	 * @ordered
	 */
	protected String referral = REFERRAL_EDEFAULT;

	/**
	 * This is true if the Referral attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean referralESet;

	/**
	 * The default value of the '{@link #getOther1() <em>Other1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther1()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOther1() <em>Other1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther1()
	 * @generated
	 * @ordered
	 */
	protected String other1 = OTHER1_EDEFAULT;

	/**
	 * This is true if the Other1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean other1ESet;

	/**
	 * The default value of the '{@link #getOther2() <em>Other2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther2()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOther2() <em>Other2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther2()
	 * @generated
	 * @ordered
	 */
	protected String other2 = OTHER2_EDEFAULT;

	/**
	 * This is true if the Other2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean other2ESet;

	/**
	 * The default value of the '{@link #getBackEndSystemPatientId() <em>Back End System Patient Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackEndSystemPatientId()
	 * @generated
	 * @ordered
	 */
	protected static final String BACK_END_SYSTEM_PATIENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackEndSystemPatientId() <em>Back End System Patient Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackEndSystemPatientId()
	 * @generated
	 * @ordered
	 */
	protected String backEndSystemPatientId = BACK_END_SYSTEM_PATIENT_ID_EDEFAULT;

	/**
	 * This is true if the Back End System Patient Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean backEndSystemPatientIdESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatientExportPackage.Literals.PATIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPatientGUID() {
		return patientGUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatientGUID(String newPatientGUID) {
		String oldPatientGUID = patientGUID;
		patientGUID = newPatientGUID;
		boolean oldPatientGUIDESet = patientGUIDESet;
		patientGUIDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatientExportPackage.PATIENT__PATIENT_GUID, oldPatientGUID, patientGUID, !oldPatientGUIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPatientGUID() {
		String oldPatientGUID = patientGUID;
		boolean oldPatientGUIDESet = patientGUIDESet;
		patientGUID = PATIENT_GUID_EDEFAULT;
		patientGUIDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PatientExportPackage.PATIENT__PATIENT_GUID, oldPatientGUID, PATIENT_GUID_EDEFAULT, oldPatientGUIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPatientGUID() {
		return patientGUIDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		boolean oldFirstNameESet = firstNameESet;
		firstNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatientExportPackage.PATIENT__FIRST_NAME, oldFirstName, firstName, !oldFirstNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFirstName() {
		String oldFirstName = firstName;
		boolean oldFirstNameESet = firstNameESet;
		firstName = FIRST_NAME_EDEFAULT;
		firstNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PatientExportPackage.PATIENT__FIRST_NAME, oldFirstName, FIRST_NAME_EDEFAULT, oldFirstNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFirstName() {
		return firstNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		boolean oldLastNameESet = lastNameESet;
		lastNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatientExportPackage.PATIENT__LAST_NAME, oldLastName, lastName, !oldLastNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLastName() {
		String oldLastName = lastName;
		boolean oldLastNameESet = lastNameESet;
		lastName = LAST_NAME_EDEFAULT;
		lastNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PatientExportPackage.PATIENT__LAST_NAME, oldLastName, LAST_NAME_EDEFAULT, oldLastNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLastName() {
		return lastNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMiddleName(String newMiddleName) {
		String oldMiddleName = middleName;
		middleName = newMiddleName;
		boolean oldMiddleNameESet = middleNameESet;
		middleNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatientExportPackage.PATIENT__MIDDLE_NAME, oldMiddleName, middleName, !oldMiddleNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMiddleName() {
		String oldMiddleName = middleName;
		boolean oldMiddleNameESet = middleNameESet;
		middleName = MIDDLE_NAME_EDEFAULT;
		middleNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PatientExportPackage.PATIENT__MIDDLE_NAME, oldMiddleName, MIDDLE_NAME_EDEFAULT, oldMiddleNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMiddleName() {
		return middleNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPatientNo() {
		return patientNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatientNo(String newPatientNo) {
		String oldPatientNo = patientNo;
		patientNo = newPatientNo;
		boolean oldPatientNoESet = patientNoESet;
		patientNoESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatientExportPackage.PATIENT__PATIENT_NO, oldPatientNo, patientNo, !oldPatientNoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPatientNo() {
		String oldPatientNo = patientNo;
		boolean oldPatientNoESet = patientNoESet;
		patientNo = PATIENT_NO_EDEFAULT;
		patientNoESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PatientExportPackage.PATIENT__PATIENT_NO, oldPatientNo, PATIENT_NO_EDEFAULT, oldPatientNoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPatientNo() {
		return patientNoESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getActivePatient() {
		return activePatient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivePatient(Boolean newActivePatient) {
		Boolean oldActivePatient = activePatient;
		activePatient = newActivePatient;
		boolean oldActivePatientESet = activePatientESet;
		activePatientESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatientExportPackage.PATIENT__ACTIVE_PATIENT, oldActivePatient, activePatient, !oldActivePatientESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetActivePatient() {
		Boolean oldActivePatient = activePatient;
		boolean oldActivePatientESet = activePatientESet;
		activePatient = ACTIVE_PATIENT_EDEFAULT;
		activePatientESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PatientExportPackage.PATIENT__ACTIVE_PATIENT, oldActivePatient, ACTIVE_PATIENT_EDEFAULT, oldActivePatientESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetActivePatient() {
		return activePatientESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenderType getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGender(GenderType newGender) {
		GenderType oldGender = gender;
		gender = newGender;
		boolean oldGenderESet = genderESet;
		genderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatientExportPackage.PATIENT__GENDER, oldGender, gender, !oldGenderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetGender() {
		GenderType oldGender = gender;
		boolean oldGenderESet = genderESet;
		gender = GENDER_EDEFAULT;
		genderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PatientExportPackage.PATIENT__GENDER, oldGender, GENDER_EDEFAULT, oldGenderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetGender() {
		return genderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getBirthDate() {
		return birthDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBirthDate(XMLGregorianCalendar newBirthDate) {
		XMLGregorianCalendar oldBirthDate = birthDate;
		birthDate = newBirthDate;
		boolean oldBirthDateESet = birthDateESet;
		birthDateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatientExportPackage.PATIENT__BIRTH_DATE, oldBirthDate, birthDate, !oldBirthDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBirthDate() {
		XMLGregorianCalendar oldBirthDate = birthDate;
		boolean oldBirthDateESet = birthDateESet;
		birthDate = BIRTH_DATE_EDEFAULT;
		birthDateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PatientExportPackage.PATIENT__BIRTH_DATE, oldBirthDate, BIRTH_DATE_EDEFAULT, oldBirthDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBirthDate() {
		return birthDateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserId() {
		return userId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserId(String newUserId) {
		String oldUserId = userId;
		userId = newUserId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatientExportPackage.PATIENT__USER_ID, oldUserId, userId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getCreateDate() {
		return createDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreateDate(XMLGregorianCalendar newCreateDate) {
		XMLGregorianCalendar oldCreateDate = createDate;
		createDate = newCreateDate;
		boolean oldCreateDateESet = createDateESet;
		createDateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatientExportPackage.PATIENT__CREATE_DATE, oldCreateDate, createDate, !oldCreateDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCreateDate() {
		XMLGregorianCalendar oldCreateDate = createDate;
		boolean oldCreateDateESet = createDateESet;
		createDate = CREATE_DATE_EDEFAULT;
		createDateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PatientExportPackage.PATIENT__CREATE_DATE, oldCreateDate, CREATE_DATE_EDEFAULT, oldCreateDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCreateDate() {
		return createDateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress1() {
		return address1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress1(String newAddress1) {
		String oldAddress1 = address1;
		address1 = newAddress1;
		boolean oldAddress1ESet = address1ESet;
		address1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatientExportPackage.PATIENT__ADDRESS1, oldAddress1, address1, !oldAddress1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAddress1() {
		String oldAddress1 = address1;
		boolean oldAddress1ESet = address1ESet;
		address1 = ADDRESS1_EDEFAULT;
		address1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PatientExportPackage.PATIENT__ADDRESS1, oldAddress1, ADDRESS1_EDEFAULT, oldAddress1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAddress1() {
		return address1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress2() {
		return address2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress2(String newAddress2) {
		String oldAddress2 = address2;
		address2 = newAddress2;
		boolean oldAddress2ESet = address2ESet;
		address2ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatientExportPackage.PATIENT__ADDRESS2, oldAddress2, address2, !oldAddress2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAddress2() {
		String oldAddress2 = address2;
		boolean oldAddress2ESet = address2ESet;
		address2 = ADDRESS2_EDEFAULT;
		address2ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PatientExportPackage.PATIENT__ADDRESS2, oldAddress2, ADDRESS2_EDEFAULT, oldAddress2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAddress2() {
		return address2ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress3() {
		return address3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress3(String newAddress3) {
		String oldAddress3 = address3;
		address3 = newAddress3;
		boolean oldAddress3ESet = address3ESet;
		address3ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatientExportPackage.PATIENT__ADDRESS3, oldAddress3, address3, !oldAddress3ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAddress3() {
		String oldAddress3 = address3;
		boolean oldAddress3ESet = address3ESet;
		address3 = ADDRESS3_EDEFAULT;
		address3ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PatientExportPackage.PATIENT__ADDRESS3, oldAddress3, ADDRESS3_EDEFAULT, oldAddress3ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAddress3() {
		return address3ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		boolean oldTitleESet = titleESet;
		titleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatientExportPackage.PATIENT__TITLE, oldTitle, title, !oldTitleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTitle() {
		String oldTitle = title;
		boolean oldTitleESet = titleESet;
		title = TITLE_EDEFAULT;
		titleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PatientExportPackage.PATIENT__TITLE, oldTitle, TITLE_EDEFAULT, oldTitleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTitle() {
		return titleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSalutation() {
		return salutation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalutation(String newSalutation) {
		String oldSalutation = salutation;
		salutation = newSalutation;
		boolean oldSalutationESet = salutationESet;
		salutationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatientExportPackage.PATIENT__SALUTATION, oldSalutation, salutation, !oldSalutationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSalutation() {
		String oldSalutation = salutation;
		boolean oldSalutationESet = salutationESet;
		salutation = SALUTATION_EDEFAULT;
		salutationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PatientExportPackage.PATIENT__SALUTATION, oldSalutation, SALUTATION_EDEFAULT, oldSalutationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSalutation() {
		return salutationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSSNumber() {
		return sSNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSNumber(String newSSNumber) {
		String oldSSNumber = sSNumber;
		sSNumber = newSSNumber;
		boolean oldSSNumberESet = sSNumberESet;
		sSNumberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatientExportPackage.PATIENT__SS_NUMBER, oldSSNumber, sSNumber, !oldSSNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSSNumber() {
		String oldSSNumber = sSNumber;
		boolean oldSSNumberESet = sSNumberESet;
		sSNumber = SS_NUMBER_EDEFAULT;
		sSNumberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PatientExportPackage.PATIENT__SS_NUMBER, oldSSNumber, SS_NUMBER_EDEFAULT, oldSSNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSSNumber() {
		return sSNumberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZip() {
		return zip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZip(String newZip) {
		String oldZip = zip;
		zip = newZip;
		boolean oldZipESet = zipESet;
		zipESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatientExportPackage.PATIENT__ZIP, oldZip, zip, !oldZipESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetZip() {
		String oldZip = zip;
		boolean oldZipESet = zipESet;
		zip = ZIP_EDEFAULT;
		zipESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PatientExportPackage.PATIENT__ZIP, oldZip, ZIP_EDEFAULT, oldZipESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetZip() {
		return zipESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		boolean oldCityESet = cityESet;
		cityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatientExportPackage.PATIENT__CITY, oldCity, city, !oldCityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCity() {
		String oldCity = city;
		boolean oldCityESet = cityESet;
		city = CITY_EDEFAULT;
		cityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PatientExportPackage.PATIENT__CITY, oldCity, CITY_EDEFAULT, oldCityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCity() {
		return cityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProvince() {
		return province;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvince(String newProvince) {
		String oldProvince = province;
		province = newProvince;
		boolean oldProvinceESet = provinceESet;
		provinceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatientExportPackage.PATIENT__PROVINCE, oldProvince, province, !oldProvinceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetProvince() {
		String oldProvince = province;
		boolean oldProvinceESet = provinceESet;
		province = PROVINCE_EDEFAULT;
		provinceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PatientExportPackage.PATIENT__PROVINCE, oldProvince, PROVINCE_EDEFAULT, oldProvinceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetProvince() {
		return provinceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		boolean oldCountryESet = countryESet;
		countryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatientExportPackage.PATIENT__COUNTRY, oldCountry, country, !oldCountryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCountry() {
		String oldCountry = country;
		boolean oldCountryESet = countryESet;
		country = COUNTRY_EDEFAULT;
		countryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PatientExportPackage.PATIENT__COUNTRY, oldCountry, COUNTRY_EDEFAULT, oldCountryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCountry() {
		return countryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEMail() {
		return eMail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEMail(String newEMail) {
		String oldEMail = eMail;
		eMail = newEMail;
		boolean oldEMailESet = eMailESet;
		eMailESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatientExportPackage.PATIENT__EMAIL, oldEMail, eMail, !oldEMailESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEMail() {
		String oldEMail = eMail;
		boolean oldEMailESet = eMailESet;
		eMail = EMAIL_EDEFAULT;
		eMailESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PatientExportPackage.PATIENT__EMAIL, oldEMail, EMAIL_EDEFAULT, oldEMailESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEMail() {
		return eMailESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHomeTelephone() {
		return homeTelephone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHomeTelephone(String newHomeTelephone) {
		String oldHomeTelephone = homeTelephone;
		homeTelephone = newHomeTelephone;
		boolean oldHomeTelephoneESet = homeTelephoneESet;
		homeTelephoneESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatientExportPackage.PATIENT__HOME_TELEPHONE, oldHomeTelephone, homeTelephone, !oldHomeTelephoneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHomeTelephone() {
		String oldHomeTelephone = homeTelephone;
		boolean oldHomeTelephoneESet = homeTelephoneESet;
		homeTelephone = HOME_TELEPHONE_EDEFAULT;
		homeTelephoneESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PatientExportPackage.PATIENT__HOME_TELEPHONE, oldHomeTelephone, HOME_TELEPHONE_EDEFAULT, oldHomeTelephoneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHomeTelephone() {
		return homeTelephoneESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkTelephone() {
		return workTelephone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkTelephone(String newWorkTelephone) {
		String oldWorkTelephone = workTelephone;
		workTelephone = newWorkTelephone;
		boolean oldWorkTelephoneESet = workTelephoneESet;
		workTelephoneESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatientExportPackage.PATIENT__WORK_TELEPHONE, oldWorkTelephone, workTelephone, !oldWorkTelephoneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWorkTelephone() {
		String oldWorkTelephone = workTelephone;
		boolean oldWorkTelephoneESet = workTelephoneESet;
		workTelephone = WORK_TELEPHONE_EDEFAULT;
		workTelephoneESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PatientExportPackage.PATIENT__WORK_TELEPHONE, oldWorkTelephone, WORK_TELEPHONE_EDEFAULT, oldWorkTelephoneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWorkTelephone() {
		return workTelephoneESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMobileTelephone() {
		return mobileTelephone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMobileTelephone(String newMobileTelephone) {
		String oldMobileTelephone = mobileTelephone;
		mobileTelephone = newMobileTelephone;
		boolean oldMobileTelephoneESet = mobileTelephoneESet;
		mobileTelephoneESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatientExportPackage.PATIENT__MOBILE_TELEPHONE, oldMobileTelephone, mobileTelephone, !oldMobileTelephoneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMobileTelephone() {
		String oldMobileTelephone = mobileTelephone;
		boolean oldMobileTelephoneESet = mobileTelephoneESet;
		mobileTelephone = MOBILE_TELEPHONE_EDEFAULT;
		mobileTelephoneESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PatientExportPackage.PATIENT__MOBILE_TELEPHONE, oldMobileTelephone, MOBILE_TELEPHONE_EDEFAULT, oldMobileTelephoneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMobileTelephone() {
		return mobileTelephoneESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInsurance1() {
		return insurance1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInsurance1(String newInsurance1) {
		String oldInsurance1 = insurance1;
		insurance1 = newInsurance1;
		boolean oldInsurance1ESet = insurance1ESet;
		insurance1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatientExportPackage.PATIENT__INSURANCE1, oldInsurance1, insurance1, !oldInsurance1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetInsurance1() {
		String oldInsurance1 = insurance1;
		boolean oldInsurance1ESet = insurance1ESet;
		insurance1 = INSURANCE1_EDEFAULT;
		insurance1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PatientExportPackage.PATIENT__INSURANCE1, oldInsurance1, INSURANCE1_EDEFAULT, oldInsurance1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInsurance1() {
		return insurance1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInsurance2() {
		return insurance2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInsurance2(String newInsurance2) {
		String oldInsurance2 = insurance2;
		insurance2 = newInsurance2;
		boolean oldInsurance2ESet = insurance2ESet;
		insurance2ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatientExportPackage.PATIENT__INSURANCE2, oldInsurance2, insurance2, !oldInsurance2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetInsurance2() {
		String oldInsurance2 = insurance2;
		boolean oldInsurance2ESet = insurance2ESet;
		insurance2 = INSURANCE2_EDEFAULT;
		insurance2ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PatientExportPackage.PATIENT__INSURANCE2, oldInsurance2, INSURANCE2_EDEFAULT, oldInsurance2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInsurance2() {
		return insurance2ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPhysician() {
		return physician;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysician(String newPhysician) {
		String oldPhysician = physician;
		physician = newPhysician;
		boolean oldPhysicianESet = physicianESet;
		physicianESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatientExportPackage.PATIENT__PHYSICIAN, oldPhysician, physician, !oldPhysicianESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPhysician() {
		String oldPhysician = physician;
		boolean oldPhysicianESet = physicianESet;
		physician = PHYSICIAN_EDEFAULT;
		physicianESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PatientExportPackage.PATIENT__PHYSICIAN, oldPhysician, PHYSICIAN_EDEFAULT, oldPhysicianESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPhysician() {
		return physicianESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReferral() {
		return referral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferral(String newReferral) {
		String oldReferral = referral;
		referral = newReferral;
		boolean oldReferralESet = referralESet;
		referralESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatientExportPackage.PATIENT__REFERRAL, oldReferral, referral, !oldReferralESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetReferral() {
		String oldReferral = referral;
		boolean oldReferralESet = referralESet;
		referral = REFERRAL_EDEFAULT;
		referralESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PatientExportPackage.PATIENT__REFERRAL, oldReferral, REFERRAL_EDEFAULT, oldReferralESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetReferral() {
		return referralESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOther1() {
		return other1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOther1(String newOther1) {
		String oldOther1 = other1;
		other1 = newOther1;
		boolean oldOther1ESet = other1ESet;
		other1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatientExportPackage.PATIENT__OTHER1, oldOther1, other1, !oldOther1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOther1() {
		String oldOther1 = other1;
		boolean oldOther1ESet = other1ESet;
		other1 = OTHER1_EDEFAULT;
		other1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PatientExportPackage.PATIENT__OTHER1, oldOther1, OTHER1_EDEFAULT, oldOther1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOther1() {
		return other1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOther2() {
		return other2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOther2(String newOther2) {
		String oldOther2 = other2;
		other2 = newOther2;
		boolean oldOther2ESet = other2ESet;
		other2ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatientExportPackage.PATIENT__OTHER2, oldOther2, other2, !oldOther2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOther2() {
		String oldOther2 = other2;
		boolean oldOther2ESet = other2ESet;
		other2 = OTHER2_EDEFAULT;
		other2ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PatientExportPackage.PATIENT__OTHER2, oldOther2, OTHER2_EDEFAULT, oldOther2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOther2() {
		return other2ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBackEndSystemPatientId() {
		return backEndSystemPatientId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackEndSystemPatientId(String newBackEndSystemPatientId) {
		String oldBackEndSystemPatientId = backEndSystemPatientId;
		backEndSystemPatientId = newBackEndSystemPatientId;
		boolean oldBackEndSystemPatientIdESet = backEndSystemPatientIdESet;
		backEndSystemPatientIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatientExportPackage.PATIENT__BACK_END_SYSTEM_PATIENT_ID, oldBackEndSystemPatientId, backEndSystemPatientId, !oldBackEndSystemPatientIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBackEndSystemPatientId() {
		String oldBackEndSystemPatientId = backEndSystemPatientId;
		boolean oldBackEndSystemPatientIdESet = backEndSystemPatientIdESet;
		backEndSystemPatientId = BACK_END_SYSTEM_PATIENT_ID_EDEFAULT;
		backEndSystemPatientIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PatientExportPackage.PATIENT__BACK_END_SYSTEM_PATIENT_ID, oldBackEndSystemPatientId, BACK_END_SYSTEM_PATIENT_ID_EDEFAULT, oldBackEndSystemPatientIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBackEndSystemPatientId() {
		return backEndSystemPatientIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatientExportPackage.PATIENT__PATIENT_GUID:
				return getPatientGUID();
			case PatientExportPackage.PATIENT__FIRST_NAME:
				return getFirstName();
			case PatientExportPackage.PATIENT__LAST_NAME:
				return getLastName();
			case PatientExportPackage.PATIENT__MIDDLE_NAME:
				return getMiddleName();
			case PatientExportPackage.PATIENT__PATIENT_NO:
				return getPatientNo();
			case PatientExportPackage.PATIENT__ACTIVE_PATIENT:
				return getActivePatient();
			case PatientExportPackage.PATIENT__GENDER:
				return getGender();
			case PatientExportPackage.PATIENT__BIRTH_DATE:
				return getBirthDate();
			case PatientExportPackage.PATIENT__USER_ID:
				return getUserId();
			case PatientExportPackage.PATIENT__CREATE_DATE:
				return getCreateDate();
			case PatientExportPackage.PATIENT__ADDRESS1:
				return getAddress1();
			case PatientExportPackage.PATIENT__ADDRESS2:
				return getAddress2();
			case PatientExportPackage.PATIENT__ADDRESS3:
				return getAddress3();
			case PatientExportPackage.PATIENT__TITLE:
				return getTitle();
			case PatientExportPackage.PATIENT__SALUTATION:
				return getSalutation();
			case PatientExportPackage.PATIENT__SS_NUMBER:
				return getSSNumber();
			case PatientExportPackage.PATIENT__ZIP:
				return getZip();
			case PatientExportPackage.PATIENT__CITY:
				return getCity();
			case PatientExportPackage.PATIENT__PROVINCE:
				return getProvince();
			case PatientExportPackage.PATIENT__COUNTRY:
				return getCountry();
			case PatientExportPackage.PATIENT__EMAIL:
				return getEMail();
			case PatientExportPackage.PATIENT__HOME_TELEPHONE:
				return getHomeTelephone();
			case PatientExportPackage.PATIENT__WORK_TELEPHONE:
				return getWorkTelephone();
			case PatientExportPackage.PATIENT__MOBILE_TELEPHONE:
				return getMobileTelephone();
			case PatientExportPackage.PATIENT__INSURANCE1:
				return getInsurance1();
			case PatientExportPackage.PATIENT__INSURANCE2:
				return getInsurance2();
			case PatientExportPackage.PATIENT__PHYSICIAN:
				return getPhysician();
			case PatientExportPackage.PATIENT__REFERRAL:
				return getReferral();
			case PatientExportPackage.PATIENT__OTHER1:
				return getOther1();
			case PatientExportPackage.PATIENT__OTHER2:
				return getOther2();
			case PatientExportPackage.PATIENT__BACK_END_SYSTEM_PATIENT_ID:
				return getBackEndSystemPatientId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PatientExportPackage.PATIENT__PATIENT_GUID:
				setPatientGUID((String)newValue);
				return;
			case PatientExportPackage.PATIENT__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case PatientExportPackage.PATIENT__LAST_NAME:
				setLastName((String)newValue);
				return;
			case PatientExportPackage.PATIENT__MIDDLE_NAME:
				setMiddleName((String)newValue);
				return;
			case PatientExportPackage.PATIENT__PATIENT_NO:
				setPatientNo((String)newValue);
				return;
			case PatientExportPackage.PATIENT__ACTIVE_PATIENT:
				setActivePatient((Boolean)newValue);
				return;
			case PatientExportPackage.PATIENT__GENDER:
				setGender((GenderType)newValue);
				return;
			case PatientExportPackage.PATIENT__BIRTH_DATE:
				setBirthDate((XMLGregorianCalendar)newValue);
				return;
			case PatientExportPackage.PATIENT__USER_ID:
				setUserId((String)newValue);
				return;
			case PatientExportPackage.PATIENT__CREATE_DATE:
				setCreateDate((XMLGregorianCalendar)newValue);
				return;
			case PatientExportPackage.PATIENT__ADDRESS1:
				setAddress1((String)newValue);
				return;
			case PatientExportPackage.PATIENT__ADDRESS2:
				setAddress2((String)newValue);
				return;
			case PatientExportPackage.PATIENT__ADDRESS3:
				setAddress3((String)newValue);
				return;
			case PatientExportPackage.PATIENT__TITLE:
				setTitle((String)newValue);
				return;
			case PatientExportPackage.PATIENT__SALUTATION:
				setSalutation((String)newValue);
				return;
			case PatientExportPackage.PATIENT__SS_NUMBER:
				setSSNumber((String)newValue);
				return;
			case PatientExportPackage.PATIENT__ZIP:
				setZip((String)newValue);
				return;
			case PatientExportPackage.PATIENT__CITY:
				setCity((String)newValue);
				return;
			case PatientExportPackage.PATIENT__PROVINCE:
				setProvince((String)newValue);
				return;
			case PatientExportPackage.PATIENT__COUNTRY:
				setCountry((String)newValue);
				return;
			case PatientExportPackage.PATIENT__EMAIL:
				setEMail((String)newValue);
				return;
			case PatientExportPackage.PATIENT__HOME_TELEPHONE:
				setHomeTelephone((String)newValue);
				return;
			case PatientExportPackage.PATIENT__WORK_TELEPHONE:
				setWorkTelephone((String)newValue);
				return;
			case PatientExportPackage.PATIENT__MOBILE_TELEPHONE:
				setMobileTelephone((String)newValue);
				return;
			case PatientExportPackage.PATIENT__INSURANCE1:
				setInsurance1((String)newValue);
				return;
			case PatientExportPackage.PATIENT__INSURANCE2:
				setInsurance2((String)newValue);
				return;
			case PatientExportPackage.PATIENT__PHYSICIAN:
				setPhysician((String)newValue);
				return;
			case PatientExportPackage.PATIENT__REFERRAL:
				setReferral((String)newValue);
				return;
			case PatientExportPackage.PATIENT__OTHER1:
				setOther1((String)newValue);
				return;
			case PatientExportPackage.PATIENT__OTHER2:
				setOther2((String)newValue);
				return;
			case PatientExportPackage.PATIENT__BACK_END_SYSTEM_PATIENT_ID:
				setBackEndSystemPatientId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PatientExportPackage.PATIENT__PATIENT_GUID:
				unsetPatientGUID();
				return;
			case PatientExportPackage.PATIENT__FIRST_NAME:
				unsetFirstName();
				return;
			case PatientExportPackage.PATIENT__LAST_NAME:
				unsetLastName();
				return;
			case PatientExportPackage.PATIENT__MIDDLE_NAME:
				unsetMiddleName();
				return;
			case PatientExportPackage.PATIENT__PATIENT_NO:
				unsetPatientNo();
				return;
			case PatientExportPackage.PATIENT__ACTIVE_PATIENT:
				unsetActivePatient();
				return;
			case PatientExportPackage.PATIENT__GENDER:
				unsetGender();
				return;
			case PatientExportPackage.PATIENT__BIRTH_DATE:
				unsetBirthDate();
				return;
			case PatientExportPackage.PATIENT__USER_ID:
				setUserId(USER_ID_EDEFAULT);
				return;
			case PatientExportPackage.PATIENT__CREATE_DATE:
				unsetCreateDate();
				return;
			case PatientExportPackage.PATIENT__ADDRESS1:
				unsetAddress1();
				return;
			case PatientExportPackage.PATIENT__ADDRESS2:
				unsetAddress2();
				return;
			case PatientExportPackage.PATIENT__ADDRESS3:
				unsetAddress3();
				return;
			case PatientExportPackage.PATIENT__TITLE:
				unsetTitle();
				return;
			case PatientExportPackage.PATIENT__SALUTATION:
				unsetSalutation();
				return;
			case PatientExportPackage.PATIENT__SS_NUMBER:
				unsetSSNumber();
				return;
			case PatientExportPackage.PATIENT__ZIP:
				unsetZip();
				return;
			case PatientExportPackage.PATIENT__CITY:
				unsetCity();
				return;
			case PatientExportPackage.PATIENT__PROVINCE:
				unsetProvince();
				return;
			case PatientExportPackage.PATIENT__COUNTRY:
				unsetCountry();
				return;
			case PatientExportPackage.PATIENT__EMAIL:
				unsetEMail();
				return;
			case PatientExportPackage.PATIENT__HOME_TELEPHONE:
				unsetHomeTelephone();
				return;
			case PatientExportPackage.PATIENT__WORK_TELEPHONE:
				unsetWorkTelephone();
				return;
			case PatientExportPackage.PATIENT__MOBILE_TELEPHONE:
				unsetMobileTelephone();
				return;
			case PatientExportPackage.PATIENT__INSURANCE1:
				unsetInsurance1();
				return;
			case PatientExportPackage.PATIENT__INSURANCE2:
				unsetInsurance2();
				return;
			case PatientExportPackage.PATIENT__PHYSICIAN:
				unsetPhysician();
				return;
			case PatientExportPackage.PATIENT__REFERRAL:
				unsetReferral();
				return;
			case PatientExportPackage.PATIENT__OTHER1:
				unsetOther1();
				return;
			case PatientExportPackage.PATIENT__OTHER2:
				unsetOther2();
				return;
			case PatientExportPackage.PATIENT__BACK_END_SYSTEM_PATIENT_ID:
				unsetBackEndSystemPatientId();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PatientExportPackage.PATIENT__PATIENT_GUID:
				return isSetPatientGUID();
			case PatientExportPackage.PATIENT__FIRST_NAME:
				return isSetFirstName();
			case PatientExportPackage.PATIENT__LAST_NAME:
				return isSetLastName();
			case PatientExportPackage.PATIENT__MIDDLE_NAME:
				return isSetMiddleName();
			case PatientExportPackage.PATIENT__PATIENT_NO:
				return isSetPatientNo();
			case PatientExportPackage.PATIENT__ACTIVE_PATIENT:
				return isSetActivePatient();
			case PatientExportPackage.PATIENT__GENDER:
				return isSetGender();
			case PatientExportPackage.PATIENT__BIRTH_DATE:
				return isSetBirthDate();
			case PatientExportPackage.PATIENT__USER_ID:
				return USER_ID_EDEFAULT == null ? userId != null : !USER_ID_EDEFAULT.equals(userId);
			case PatientExportPackage.PATIENT__CREATE_DATE:
				return isSetCreateDate();
			case PatientExportPackage.PATIENT__ADDRESS1:
				return isSetAddress1();
			case PatientExportPackage.PATIENT__ADDRESS2:
				return isSetAddress2();
			case PatientExportPackage.PATIENT__ADDRESS3:
				return isSetAddress3();
			case PatientExportPackage.PATIENT__TITLE:
				return isSetTitle();
			case PatientExportPackage.PATIENT__SALUTATION:
				return isSetSalutation();
			case PatientExportPackage.PATIENT__SS_NUMBER:
				return isSetSSNumber();
			case PatientExportPackage.PATIENT__ZIP:
				return isSetZip();
			case PatientExportPackage.PATIENT__CITY:
				return isSetCity();
			case PatientExportPackage.PATIENT__PROVINCE:
				return isSetProvince();
			case PatientExportPackage.PATIENT__COUNTRY:
				return isSetCountry();
			case PatientExportPackage.PATIENT__EMAIL:
				return isSetEMail();
			case PatientExportPackage.PATIENT__HOME_TELEPHONE:
				return isSetHomeTelephone();
			case PatientExportPackage.PATIENT__WORK_TELEPHONE:
				return isSetWorkTelephone();
			case PatientExportPackage.PATIENT__MOBILE_TELEPHONE:
				return isSetMobileTelephone();
			case PatientExportPackage.PATIENT__INSURANCE1:
				return isSetInsurance1();
			case PatientExportPackage.PATIENT__INSURANCE2:
				return isSetInsurance2();
			case PatientExportPackage.PATIENT__PHYSICIAN:
				return isSetPhysician();
			case PatientExportPackage.PATIENT__REFERRAL:
				return isSetReferral();
			case PatientExportPackage.PATIENT__OTHER1:
				return isSetOther1();
			case PatientExportPackage.PATIENT__OTHER2:
				return isSetOther2();
			case PatientExportPackage.PATIENT__BACK_END_SYSTEM_PATIENT_ID:
				return isSetBackEndSystemPatientId();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (patientGUID: ");
		if (patientGUIDESet) result.append(patientGUID); else result.append("<unset>");
		result.append(", firstName: ");
		if (firstNameESet) result.append(firstName); else result.append("<unset>");
		result.append(", lastName: ");
		if (lastNameESet) result.append(lastName); else result.append("<unset>");
		result.append(", middleName: ");
		if (middleNameESet) result.append(middleName); else result.append("<unset>");
		result.append(", patientNo: ");
		if (patientNoESet) result.append(patientNo); else result.append("<unset>");
		result.append(", activePatient: ");
		if (activePatientESet) result.append(activePatient); else result.append("<unset>");
		result.append(", gender: ");
		if (genderESet) result.append(gender); else result.append("<unset>");
		result.append(", birthDate: ");
		if (birthDateESet) result.append(birthDate); else result.append("<unset>");
		result.append(", userId: ");
		result.append(userId);
		result.append(", createDate: ");
		if (createDateESet) result.append(createDate); else result.append("<unset>");
		result.append(", address1: ");
		if (address1ESet) result.append(address1); else result.append("<unset>");
		result.append(", address2: ");
		if (address2ESet) result.append(address2); else result.append("<unset>");
		result.append(", address3: ");
		if (address3ESet) result.append(address3); else result.append("<unset>");
		result.append(", title: ");
		if (titleESet) result.append(title); else result.append("<unset>");
		result.append(", salutation: ");
		if (salutationESet) result.append(salutation); else result.append("<unset>");
		result.append(", sSNumber: ");
		if (sSNumberESet) result.append(sSNumber); else result.append("<unset>");
		result.append(", zip: ");
		if (zipESet) result.append(zip); else result.append("<unset>");
		result.append(", city: ");
		if (cityESet) result.append(city); else result.append("<unset>");
		result.append(", province: ");
		if (provinceESet) result.append(province); else result.append("<unset>");
		result.append(", country: ");
		if (countryESet) result.append(country); else result.append("<unset>");
		result.append(", eMail: ");
		if (eMailESet) result.append(eMail); else result.append("<unset>");
		result.append(", homeTelephone: ");
		if (homeTelephoneESet) result.append(homeTelephone); else result.append("<unset>");
		result.append(", workTelephone: ");
		if (workTelephoneESet) result.append(workTelephone); else result.append("<unset>");
		result.append(", mobileTelephone: ");
		if (mobileTelephoneESet) result.append(mobileTelephone); else result.append("<unset>");
		result.append(", insurance1: ");
		if (insurance1ESet) result.append(insurance1); else result.append("<unset>");
		result.append(", insurance2: ");
		if (insurance2ESet) result.append(insurance2); else result.append("<unset>");
		result.append(", physician: ");
		if (physicianESet) result.append(physician); else result.append("<unset>");
		result.append(", referral: ");
		if (referralESet) result.append(referral); else result.append("<unset>");
		result.append(", other1: ");
		if (other1ESet) result.append(other1); else result.append("<unset>");
		result.append(", other2: ");
		if (other2ESet) result.append(other2); else result.append("<unset>");
		result.append(", backEndSystemPatientId: ");
		if (backEndSystemPatientIdESet) result.append(backEndSystemPatientId); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PatientImpl
