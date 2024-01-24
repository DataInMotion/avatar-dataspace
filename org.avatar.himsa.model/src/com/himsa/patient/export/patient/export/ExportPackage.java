/*
 */
package com.himsa.patient.export.patient.export;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.himsa.patient.export.patient.export.ExportFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = ExportPackage.eNS_URI, genModel = "/model/PatientExportV5-1.genmodel", genModelSourceLocations = {"model/PatientExportV5-1.genmodel","org.avatar.himsa.model/model/PatientExportV5-1.genmodel"}, ecore="/model/patient-export.ecore", ecoreSourceLocations="/model/patient-export.ecore")
public interface ExportPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "export";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.himsa.com/PatientExport/PatientExport";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "export";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExportPackage eINSTANCE = com.himsa.patient.export.patient.export.impl.ExportPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.himsa.patient.export.patient.export.impl.ActionDataTypeImpl <em>Action Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.patient.export.patient.export.impl.ActionDataTypeImpl
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getActionDataType()
	 * @generated
	 */
	int ACTION_DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Type Of Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DATA_TYPE__TYPE_OF_DATA = 0;

	/**
	 * The feature id for the '<em><b>Data Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DATA_TYPE__DATA_FORMAT = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DATA_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Action Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DATA_TYPE__ACTION_DATE = 3;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DATA_TYPE__LAST_MODIFIED_DATE = 4;

	/**
	 * The feature id for the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DATA_TYPE__USER_ID = 5;

	/**
	 * The feature id for the '<em><b>Public Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DATA_TYPE__PUBLIC_DATA = 6;

	/**
	 * The feature id for the '<em><b>Action Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DATA_TYPE__ACTION_GROUP = 7;

	/**
	 * The feature id for the '<em><b>Device Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DATA_TYPE__DEVICE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Module Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DATA_TYPE__MODULE_ID = 9;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DATA_TYPE__OPERATION = 10;

	/**
	 * The number of structural features of the '<em>Action Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DATA_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Action Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.patient.export.patient.export.impl.ActionsTypeImpl <em>Actions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.patient.export.patient.export.impl.ActionsTypeImpl
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getActionsType()
	 * @generated
	 */
	int ACTIONS_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS_TYPE__ACTION = 0;

	/**
	 * The number of structural features of the '<em>Actions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Actions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.patient.export.patient.export.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.patient.export.patient.export.impl.DocumentRootImpl
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Patients</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PATIENTS = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.patient.export.patient.export.impl.PatientsTypeImpl <em>Patients Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.patient.export.patient.export.impl.PatientsTypeImpl
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getPatientsType()
	 * @generated
	 */
	int PATIENTS_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENTS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Patient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENTS_TYPE__PATIENT = 1;

	/**
	 * The number of structural features of the '<em>Patients Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENTS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Patients Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.patient.export.patient.export.impl.PatientTypeImpl <em>Patient Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.patient.export.patient.export.impl.PatientTypeImpl
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getPatientType()
	 * @generated
	 */
	int PATIENT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Patient GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE__PATIENT_GUID = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE__FIRST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE__LAST_NAME = 2;

	/**
	 * The feature id for the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE__MIDDLE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Patient No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE__PATIENT_NO = 4;

	/**
	 * The feature id for the '<em><b>Active Patient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE__ACTIVE_PATIENT = 5;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE__GENDER = 6;

	/**
	 * The feature id for the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE__BIRTH_DATE = 7;

	/**
	 * The feature id for the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE__USER_ID = 8;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE__CREATE_DATE = 9;

	/**
	 * The feature id for the '<em><b>Address1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE__ADDRESS1 = 10;

	/**
	 * The feature id for the '<em><b>Address2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE__ADDRESS2 = 11;

	/**
	 * The feature id for the '<em><b>Address3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE__ADDRESS3 = 12;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE__TITLE = 13;

	/**
	 * The feature id for the '<em><b>Salutation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE__SALUTATION = 14;

	/**
	 * The feature id for the '<em><b>SS Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE__SS_NUMBER = 15;

	/**
	 * The feature id for the '<em><b>Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE__ZIP = 16;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE__CITY = 17;

	/**
	 * The feature id for the '<em><b>Province</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE__PROVINCE = 18;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE__COUNTRY = 19;

	/**
	 * The feature id for the '<em><b>EMail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE__EMAIL = 20;

	/**
	 * The feature id for the '<em><b>Home Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE__HOME_TELEPHONE = 21;

	/**
	 * The feature id for the '<em><b>Work Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE__WORK_TELEPHONE = 22;

	/**
	 * The feature id for the '<em><b>Mobile Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE__MOBILE_TELEPHONE = 23;

	/**
	 * The feature id for the '<em><b>Insurance1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE__INSURANCE1 = 24;

	/**
	 * The feature id for the '<em><b>Insurance2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE__INSURANCE2 = 25;

	/**
	 * The feature id for the '<em><b>Physician</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE__PHYSICIAN = 26;

	/**
	 * The feature id for the '<em><b>Referral</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE__REFERRAL = 27;

	/**
	 * The feature id for the '<em><b>Other1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE__OTHER1 = 28;

	/**
	 * The feature id for the '<em><b>Other2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE__OTHER2 = 29;

	/**
	 * The feature id for the '<em><b>Back End System Patient Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE__BACK_END_SYSTEM_PATIENT_ID = 30;

	/**
	 * The number of structural features of the '<em>Patient Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE_FEATURE_COUNT = 31;

	/**
	 * The number of operations of the '<em>Patient Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.patient.export.patient.export.impl.PatientType1Impl <em>Patient Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.patient.export.patient.export.impl.PatientType1Impl
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getPatientType1()
	 * @generated
	 */
	int PATIENT_TYPE1 = 5;

	/**
	 * The feature id for the '<em><b>Patient GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__PATIENT_GUID = PATIENT_TYPE__PATIENT_GUID;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__FIRST_NAME = PATIENT_TYPE__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__LAST_NAME = PATIENT_TYPE__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__MIDDLE_NAME = PATIENT_TYPE__MIDDLE_NAME;

	/**
	 * The feature id for the '<em><b>Patient No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__PATIENT_NO = PATIENT_TYPE__PATIENT_NO;

	/**
	 * The feature id for the '<em><b>Active Patient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__ACTIVE_PATIENT = PATIENT_TYPE__ACTIVE_PATIENT;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__GENDER = PATIENT_TYPE__GENDER;

	/**
	 * The feature id for the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__BIRTH_DATE = PATIENT_TYPE__BIRTH_DATE;

	/**
	 * The feature id for the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__USER_ID = PATIENT_TYPE__USER_ID;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__CREATE_DATE = PATIENT_TYPE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Address1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__ADDRESS1 = PATIENT_TYPE__ADDRESS1;

	/**
	 * The feature id for the '<em><b>Address2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__ADDRESS2 = PATIENT_TYPE__ADDRESS2;

	/**
	 * The feature id for the '<em><b>Address3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__ADDRESS3 = PATIENT_TYPE__ADDRESS3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__TITLE = PATIENT_TYPE__TITLE;

	/**
	 * The feature id for the '<em><b>Salutation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__SALUTATION = PATIENT_TYPE__SALUTATION;

	/**
	 * The feature id for the '<em><b>SS Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__SS_NUMBER = PATIENT_TYPE__SS_NUMBER;

	/**
	 * The feature id for the '<em><b>Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__ZIP = PATIENT_TYPE__ZIP;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__CITY = PATIENT_TYPE__CITY;

	/**
	 * The feature id for the '<em><b>Province</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__PROVINCE = PATIENT_TYPE__PROVINCE;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__COUNTRY = PATIENT_TYPE__COUNTRY;

	/**
	 * The feature id for the '<em><b>EMail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__EMAIL = PATIENT_TYPE__EMAIL;

	/**
	 * The feature id for the '<em><b>Home Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__HOME_TELEPHONE = PATIENT_TYPE__HOME_TELEPHONE;

	/**
	 * The feature id for the '<em><b>Work Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__WORK_TELEPHONE = PATIENT_TYPE__WORK_TELEPHONE;

	/**
	 * The feature id for the '<em><b>Mobile Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__MOBILE_TELEPHONE = PATIENT_TYPE__MOBILE_TELEPHONE;

	/**
	 * The feature id for the '<em><b>Insurance1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__INSURANCE1 = PATIENT_TYPE__INSURANCE1;

	/**
	 * The feature id for the '<em><b>Insurance2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__INSURANCE2 = PATIENT_TYPE__INSURANCE2;

	/**
	 * The feature id for the '<em><b>Physician</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__PHYSICIAN = PATIENT_TYPE__PHYSICIAN;

	/**
	 * The feature id for the '<em><b>Referral</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__REFERRAL = PATIENT_TYPE__REFERRAL;

	/**
	 * The feature id for the '<em><b>Other1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__OTHER1 = PATIENT_TYPE__OTHER1;

	/**
	 * The feature id for the '<em><b>Other2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__OTHER2 = PATIENT_TYPE__OTHER2;

	/**
	 * The feature id for the '<em><b>Back End System Patient Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__BACK_END_SYSTEM_PATIENT_ID = PATIENT_TYPE__BACK_END_SYSTEM_PATIENT_ID;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1__ACTIONS = PATIENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Patient Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1_FEATURE_COUNT = PATIENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Patient Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_TYPE1_OPERATION_COUNT = PATIENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.himsa.patient.export.patient.export.impl.PubliclyFormattedDataImpl <em>Publicly Formatted Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.patient.export.patient.export.impl.PubliclyFormattedDataImpl
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getPubliclyFormattedData()
	 * @generated
	 */
	int PUBLICLY_FORMATTED_DATA = 6;

	/**
	 * The feature id for the '<em><b>HIMSA Audiometric Standard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOMETRIC_STANDARD = 0;

	/**
	 * The feature id for the '<em><b>HIMSA Audiometric Standard1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOMETRIC_STANDARD1 = 1;

	/**
	 * The feature id for the '<em><b>Hearing Instrument Selection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICLY_FORMATTED_DATA__HEARING_INSTRUMENT_SELECTION = 2;

	/**
	 * The feature id for the '<em><b>Hearing Instrument Fitting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICLY_FORMATTED_DATA__HEARING_INSTRUMENT_FITTING = 3;

	/**
	 * The feature id for the '<em><b>Remote Control Selection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICLY_FORMATTED_DATA__REMOTE_CONTROL_SELECTION = 4;

	/**
	 * The feature id for the '<em><b>HIMSA Rem Standard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICLY_FORMATTED_DATA__HIMSA_REM_STANDARD = 5;

	/**
	 * The feature id for the '<em><b>HIMSA Hit Standard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICLY_FORMATTED_DATA__HIMSA_HIT_STANDARD = 6;

	/**
	 * The feature id for the '<em><b>Acoustic Impedance Complete Measurement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICLY_FORMATTED_DATA__ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT = 7;

	/**
	 * The feature id for the '<em><b>Acoustic Immittance Assessment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICLY_FORMATTED_DATA__ACOUSTIC_IMMITTANCE_ASSESSMENT = 8;

	/**
	 * The feature id for the '<em><b>Tinnitus Measurement Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICLY_FORMATTED_DATA__TINNITUS_MEASUREMENT_DATA = 9;

	/**
	 * The feature id for the '<em><b>HIMSA Audiogram Metadata Standard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOGRAM_METADATA_STANDARD = 10;

	/**
	 * The feature id for the '<em><b>Cochlear Implant Sound Processor Selection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICLY_FORMATTED_DATA__COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION = 11;

	/**
	 * The feature id for the '<em><b>HIMSA Journal Standard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICLY_FORMATTED_DATA__HIMSA_JOURNAL_STANDARD = 12;

	/**
	 * The feature id for the '<em><b>Notification Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICLY_FORMATTED_DATA__NOTIFICATION_ACTION = 13;

	/**
	 * The feature id for the '<em><b>Scan Meta Data Standard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICLY_FORMATTED_DATA__SCAN_META_DATA_STANDARD = 14;

	/**
	 * The number of structural features of the '<em>Publicly Formatted Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICLY_FORMATTED_DATA_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Publicly Formatted Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICLY_FORMATTED_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.patient.export.patient.export.GenderType <em>Gender Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.patient.export.patient.export.GenderType
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getGenderType()
	 * @generated
	 */
	int GENDER_TYPE = 7;

	/**
	 * The meta object id for the '{@link com.himsa.patient.export.patient.export.OperationTYPE <em>Operation TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.patient.export.patient.export.OperationTYPE
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getOperationTYPE()
	 * @generated
	 */
	int OPERATION_TYPE = 8;

	/**
	 * The meta object id for the '{@link com.himsa.patient.export.patient.export.TypeOfDataType <em>Type Of Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.patient.export.patient.export.TypeOfDataType
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getTypeOfDataType()
	 * @generated
	 */
	int TYPE_OF_DATA_TYPE = 9;

	/**
	 * The meta object id for the '<em>Address1 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getAddress1Type()
	 * @generated
	 */
	int ADDRESS1_TYPE = 10;

	/**
	 * The meta object id for the '<em>Address2 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getAddress2Type()
	 * @generated
	 */
	int ADDRESS2_TYPE = 11;

	/**
	 * The meta object id for the '<em>Address3 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getAddress3Type()
	 * @generated
	 */
	int ADDRESS3_TYPE = 12;

	/**
	 * The meta object id for the '<em>Back End System Patient Id Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getBackEndSystemPatientIdType()
	 * @generated
	 */
	int BACK_END_SYSTEM_PATIENT_ID_TYPE = 13;

	/**
	 * The meta object id for the '<em>Birth Date Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getBirthDateType()
	 * @generated
	 */
	int BIRTH_DATE_TYPE = 14;

	/**
	 * The meta object id for the '<em>City Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getCityType()
	 * @generated
	 */
	int CITY_TYPE = 15;

	/**
	 * The meta object id for the '<em>Country Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getCountryType()
	 * @generated
	 */
	int COUNTRY_TYPE = 16;

	/**
	 * The meta object id for the '<em>Create Date Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getCreateDateType()
	 * @generated
	 */
	int CREATE_DATE_TYPE = 17;

	/**
	 * The meta object id for the '<em>Data Format Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getDataFormatType()
	 * @generated
	 */
	int DATA_FORMAT_TYPE = 18;

	/**
	 * The meta object id for the '<em>Description Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getDescriptionType()
	 * @generated
	 */
	int DESCRIPTION_TYPE = 19;

	/**
	 * The meta object id for the '<em>Device Type Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getDeviceTypeType()
	 * @generated
	 */
	int DEVICE_TYPE_TYPE = 20;

	/**
	 * The meta object id for the '<em>Device Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getDeviceTypeTypeObject()
	 * @generated
	 */
	int DEVICE_TYPE_TYPE_OBJECT = 21;

	/**
	 * The meta object id for the '<em>EMail Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getEMailType()
	 * @generated
	 */
	int EMAIL_TYPE = 22;

	/**
	 * The meta object id for the '<em>First Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getFirstNameType()
	 * @generated
	 */
	int FIRST_NAME_TYPE = 23;

	/**
	 * The meta object id for the '<em>Gender Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.patient.export.patient.export.GenderType
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getGenderTypeObject()
	 * @generated
	 */
	int GENDER_TYPE_OBJECT = 24;

	/**
	 * The meta object id for the '<em>Home Telephone Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getHomeTelephoneType()
	 * @generated
	 */
	int HOME_TELEPHONE_TYPE = 25;

	/**
	 * The meta object id for the '<em>Insurance1 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getInsurance1Type()
	 * @generated
	 */
	int INSURANCE1_TYPE = 26;

	/**
	 * The meta object id for the '<em>Insurance2 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getInsurance2Type()
	 * @generated
	 */
	int INSURANCE2_TYPE = 27;

	/**
	 * The meta object id for the '<em>Last Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getLastNameType()
	 * @generated
	 */
	int LAST_NAME_TYPE = 28;

	/**
	 * The meta object id for the '<em>Middle Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getMiddleNameType()
	 * @generated
	 */
	int MIDDLE_NAME_TYPE = 29;

	/**
	 * The meta object id for the '<em>Mobile Telephone Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getMobileTelephoneType()
	 * @generated
	 */
	int MOBILE_TELEPHONE_TYPE = 30;

	/**
	 * The meta object id for the '<em>Operation TYPE Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.patient.export.patient.export.OperationTYPE
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getOperationTYPEObject()
	 * @generated
	 */
	int OPERATION_TYPE_OBJECT = 31;

	/**
	 * The meta object id for the '<em>Other1 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getOther1Type()
	 * @generated
	 */
	int OTHER1_TYPE = 32;

	/**
	 * The meta object id for the '<em>Other2 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getOther2Type()
	 * @generated
	 */
	int OTHER2_TYPE = 33;

	/**
	 * The meta object id for the '<em>Patient GUID Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getPatientGUIDType()
	 * @generated
	 */
	int PATIENT_GUID_TYPE = 34;

	/**
	 * The meta object id for the '<em>Patient No Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getPatientNoType()
	 * @generated
	 */
	int PATIENT_NO_TYPE = 35;

	/**
	 * The meta object id for the '<em>Physician Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getPhysicianType()
	 * @generated
	 */
	int PHYSICIAN_TYPE = 36;

	/**
	 * The meta object id for the '<em>Province Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getProvinceType()
	 * @generated
	 */
	int PROVINCE_TYPE = 37;

	/**
	 * The meta object id for the '<em>Referral Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getReferralType()
	 * @generated
	 */
	int REFERRAL_TYPE = 38;

	/**
	 * The meta object id for the '<em>Salutation Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getSalutationType()
	 * @generated
	 */
	int SALUTATION_TYPE = 39;

	/**
	 * The meta object id for the '<em>SS Number Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getSSNumberType()
	 * @generated
	 */
	int SS_NUMBER_TYPE = 40;

	/**
	 * The meta object id for the '<em>Title Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getTitleType()
	 * @generated
	 */
	int TITLE_TYPE = 41;

	/**
	 * The meta object id for the '<em>Type Of Data Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.patient.export.patient.export.TypeOfDataType
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getTypeOfDataTypeObject()
	 * @generated
	 */
	int TYPE_OF_DATA_TYPE_OBJECT = 42;

	/**
	 * The meta object id for the '<em>User Id Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getUserIdType()
	 * @generated
	 */
	int USER_ID_TYPE = 43;

	/**
	 * The meta object id for the '<em>User Id Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getUserIdType1()
	 * @generated
	 */
	int USER_ID_TYPE1 = 44;

	/**
	 * The meta object id for the '<em>Work Telephone Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getWorkTelephoneType()
	 * @generated
	 */
	int WORK_TELEPHONE_TYPE = 45;

	/**
	 * The meta object id for the '<em>Zip Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getZipType()
	 * @generated
	 */
	int ZIP_TYPE = 46;


	/**
	 * Returns the meta object for class '{@link com.himsa.patient.export.patient.export.ActionDataType <em>Action Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Data Type</em>'.
	 * @see com.himsa.patient.export.patient.export.ActionDataType
	 * @generated
	 */
	EClass getActionDataType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.ActionDataType#getTypeOfData <em>Type Of Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Of Data</em>'.
	 * @see com.himsa.patient.export.patient.export.ActionDataType#getTypeOfData()
	 * @see #getActionDataType()
	 * @generated
	 */
	EAttribute getActionDataType_TypeOfData();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.ActionDataType#getDataFormat <em>Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Format</em>'.
	 * @see com.himsa.patient.export.patient.export.ActionDataType#getDataFormat()
	 * @see #getActionDataType()
	 * @generated
	 */
	EAttribute getActionDataType_DataFormat();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.ActionDataType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.himsa.patient.export.patient.export.ActionDataType#getDescription()
	 * @see #getActionDataType()
	 * @generated
	 */
	EAttribute getActionDataType_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.ActionDataType#getActionDate <em>Action Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Date</em>'.
	 * @see com.himsa.patient.export.patient.export.ActionDataType#getActionDate()
	 * @see #getActionDataType()
	 * @generated
	 */
	EAttribute getActionDataType_ActionDate();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.ActionDataType#getLastModifiedDate <em>Last Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date</em>'.
	 * @see com.himsa.patient.export.patient.export.ActionDataType#getLastModifiedDate()
	 * @see #getActionDataType()
	 * @generated
	 */
	EAttribute getActionDataType_LastModifiedDate();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.ActionDataType#getUserId <em>User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Id</em>'.
	 * @see com.himsa.patient.export.patient.export.ActionDataType#getUserId()
	 * @see #getActionDataType()
	 * @generated
	 */
	EAttribute getActionDataType_UserId();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.patient.export.patient.export.ActionDataType#getPublicData <em>Public Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Public Data</em>'.
	 * @see com.himsa.patient.export.patient.export.ActionDataType#getPublicData()
	 * @see #getActionDataType()
	 * @generated
	 */
	EReference getActionDataType_PublicData();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.ActionDataType#getActionGroup <em>Action Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Group</em>'.
	 * @see com.himsa.patient.export.patient.export.ActionDataType#getActionGroup()
	 * @see #getActionDataType()
	 * @generated
	 */
	EAttribute getActionDataType_ActionGroup();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.ActionDataType#getDeviceType <em>Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Type</em>'.
	 * @see com.himsa.patient.export.patient.export.ActionDataType#getDeviceType()
	 * @see #getActionDataType()
	 * @generated
	 */
	EAttribute getActionDataType_DeviceType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.ActionDataType#getModuleId <em>Module Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Id</em>'.
	 * @see com.himsa.patient.export.patient.export.ActionDataType#getModuleId()
	 * @see #getActionDataType()
	 * @generated
	 */
	EAttribute getActionDataType_ModuleId();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.ActionDataType#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see com.himsa.patient.export.patient.export.ActionDataType#getOperation()
	 * @see #getActionDataType()
	 * @generated
	 */
	EAttribute getActionDataType_Operation();

	/**
	 * Returns the meta object for class '{@link com.himsa.patient.export.patient.export.ActionsType <em>Actions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actions Type</em>'.
	 * @see com.himsa.patient.export.patient.export.ActionsType
	 * @generated
	 */
	EClass getActionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.patient.export.patient.export.ActionsType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see com.himsa.patient.export.patient.export.ActionsType#getAction()
	 * @see #getActionsType()
	 * @generated
	 */
	EReference getActionsType_Action();

	/**
	 * Returns the meta object for class '{@link com.himsa.patient.export.patient.export.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.himsa.patient.export.patient.export.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.himsa.patient.export.patient.export.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.himsa.patient.export.patient.export.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.himsa.patient.export.patient.export.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.himsa.patient.export.patient.export.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.himsa.patient.export.patient.export.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.himsa.patient.export.patient.export.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.patient.export.patient.export.DocumentRoot#getPatients <em>Patients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Patients</em>'.
	 * @see com.himsa.patient.export.patient.export.DocumentRoot#getPatients()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Patients();

	/**
	 * Returns the meta object for class '{@link com.himsa.patient.export.patient.export.PatientsType <em>Patients Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patients Type</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientsType
	 * @generated
	 */
	EClass getPatientsType();

	/**
	 * Returns the meta object for the attribute list '{@link com.himsa.patient.export.patient.export.PatientsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientsType#getGroup()
	 * @see #getPatientsType()
	 * @generated
	 */
	EAttribute getPatientsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.patient.export.patient.export.PatientsType#getPatient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patient</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientsType#getPatient()
	 * @see #getPatientsType()
	 * @generated
	 */
	EReference getPatientsType_Patient();

	/**
	 * Returns the meta object for class '{@link com.himsa.patient.export.patient.export.PatientType <em>Patient Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient Type</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType
	 * @generated
	 */
	EClass getPatientType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.PatientType#getPatientGUID <em>Patient GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patient GUID</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType#getPatientGUID()
	 * @see #getPatientType()
	 * @generated
	 */
	EAttribute getPatientType_PatientGUID();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.PatientType#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType#getFirstName()
	 * @see #getPatientType()
	 * @generated
	 */
	EAttribute getPatientType_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.PatientType#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType#getLastName()
	 * @see #getPatientType()
	 * @generated
	 */
	EAttribute getPatientType_LastName();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.PatientType#getMiddleName <em>Middle Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Middle Name</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType#getMiddleName()
	 * @see #getPatientType()
	 * @generated
	 */
	EAttribute getPatientType_MiddleName();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.PatientType#getPatientNo <em>Patient No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patient No</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType#getPatientNo()
	 * @see #getPatientType()
	 * @generated
	 */
	EAttribute getPatientType_PatientNo();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.PatientType#getActivePatient <em>Active Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Patient</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType#getActivePatient()
	 * @see #getPatientType()
	 * @generated
	 */
	EAttribute getPatientType_ActivePatient();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.PatientType#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType#getGender()
	 * @see #getPatientType()
	 * @generated
	 */
	EAttribute getPatientType_Gender();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.PatientType#getBirthDate <em>Birth Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth Date</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType#getBirthDate()
	 * @see #getPatientType()
	 * @generated
	 */
	EAttribute getPatientType_BirthDate();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.PatientType#getUserId <em>User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Id</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType#getUserId()
	 * @see #getPatientType()
	 * @generated
	 */
	EAttribute getPatientType_UserId();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.PatientType#getCreateDate <em>Create Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Date</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType#getCreateDate()
	 * @see #getPatientType()
	 * @generated
	 */
	EAttribute getPatientType_CreateDate();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.PatientType#getAddress1 <em>Address1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address1</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType#getAddress1()
	 * @see #getPatientType()
	 * @generated
	 */
	EAttribute getPatientType_Address1();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.PatientType#getAddress2 <em>Address2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address2</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType#getAddress2()
	 * @see #getPatientType()
	 * @generated
	 */
	EAttribute getPatientType_Address2();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.PatientType#getAddress3 <em>Address3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address3</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType#getAddress3()
	 * @see #getPatientType()
	 * @generated
	 */
	EAttribute getPatientType_Address3();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.PatientType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType#getTitle()
	 * @see #getPatientType()
	 * @generated
	 */
	EAttribute getPatientType_Title();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.PatientType#getSalutation <em>Salutation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salutation</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType#getSalutation()
	 * @see #getPatientType()
	 * @generated
	 */
	EAttribute getPatientType_Salutation();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.PatientType#getSSNumber <em>SS Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SS Number</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType#getSSNumber()
	 * @see #getPatientType()
	 * @generated
	 */
	EAttribute getPatientType_SSNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.PatientType#getZip <em>Zip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zip</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType#getZip()
	 * @see #getPatientType()
	 * @generated
	 */
	EAttribute getPatientType_Zip();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.PatientType#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType#getCity()
	 * @see #getPatientType()
	 * @generated
	 */
	EAttribute getPatientType_City();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.PatientType#getProvince <em>Province</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Province</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType#getProvince()
	 * @see #getPatientType()
	 * @generated
	 */
	EAttribute getPatientType_Province();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.PatientType#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType#getCountry()
	 * @see #getPatientType()
	 * @generated
	 */
	EAttribute getPatientType_Country();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.PatientType#getEMail <em>EMail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EMail</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType#getEMail()
	 * @see #getPatientType()
	 * @generated
	 */
	EAttribute getPatientType_EMail();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.PatientType#getHomeTelephone <em>Home Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home Telephone</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType#getHomeTelephone()
	 * @see #getPatientType()
	 * @generated
	 */
	EAttribute getPatientType_HomeTelephone();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.PatientType#getWorkTelephone <em>Work Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Telephone</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType#getWorkTelephone()
	 * @see #getPatientType()
	 * @generated
	 */
	EAttribute getPatientType_WorkTelephone();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.PatientType#getMobileTelephone <em>Mobile Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mobile Telephone</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType#getMobileTelephone()
	 * @see #getPatientType()
	 * @generated
	 */
	EAttribute getPatientType_MobileTelephone();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.PatientType#getInsurance1 <em>Insurance1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insurance1</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType#getInsurance1()
	 * @see #getPatientType()
	 * @generated
	 */
	EAttribute getPatientType_Insurance1();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.PatientType#getInsurance2 <em>Insurance2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insurance2</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType#getInsurance2()
	 * @see #getPatientType()
	 * @generated
	 */
	EAttribute getPatientType_Insurance2();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.PatientType#getPhysician <em>Physician</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physician</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType#getPhysician()
	 * @see #getPatientType()
	 * @generated
	 */
	EAttribute getPatientType_Physician();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.PatientType#getReferral <em>Referral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referral</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType#getReferral()
	 * @see #getPatientType()
	 * @generated
	 */
	EAttribute getPatientType_Referral();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.PatientType#getOther1 <em>Other1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other1</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType#getOther1()
	 * @see #getPatientType()
	 * @generated
	 */
	EAttribute getPatientType_Other1();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.PatientType#getOther2 <em>Other2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other2</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType#getOther2()
	 * @see #getPatientType()
	 * @generated
	 */
	EAttribute getPatientType_Other2();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.patient.export.patient.export.PatientType#getBackEndSystemPatientId <em>Back End System Patient Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Back End System Patient Id</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType#getBackEndSystemPatientId()
	 * @see #getPatientType()
	 * @generated
	 */
	EAttribute getPatientType_BackEndSystemPatientId();

	/**
	 * Returns the meta object for class '{@link com.himsa.patient.export.patient.export.PatientType1 <em>Patient Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient Type1</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType1
	 * @generated
	 */
	EClass getPatientType1();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.patient.export.patient.export.PatientType1#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actions</em>'.
	 * @see com.himsa.patient.export.patient.export.PatientType1#getActions()
	 * @see #getPatientType1()
	 * @generated
	 */
	EReference getPatientType1_Actions();

	/**
	 * Returns the meta object for class '{@link com.himsa.patient.export.patient.export.PubliclyFormattedData <em>Publicly Formatted Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publicly Formatted Data</em>'.
	 * @see com.himsa.patient.export.patient.export.PubliclyFormattedData
	 * @generated
	 */
	EClass getPubliclyFormattedData();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getHIMSAAudiometricStandard <em>HIMSA Audiometric Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>HIMSA Audiometric Standard</em>'.
	 * @see com.himsa.patient.export.patient.export.PubliclyFormattedData#getHIMSAAudiometricStandard()
	 * @see #getPubliclyFormattedData()
	 * @generated
	 */
	EReference getPubliclyFormattedData_HIMSAAudiometricStandard();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getHIMSAAudiometricStandard1 <em>HIMSA Audiometric Standard1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>HIMSA Audiometric Standard1</em>'.
	 * @see com.himsa.patient.export.patient.export.PubliclyFormattedData#getHIMSAAudiometricStandard1()
	 * @see #getPubliclyFormattedData()
	 * @generated
	 */
	EReference getPubliclyFormattedData_HIMSAAudiometricStandard1();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getHearingInstrumentSelection <em>Hearing Instrument Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hearing Instrument Selection</em>'.
	 * @see com.himsa.patient.export.patient.export.PubliclyFormattedData#getHearingInstrumentSelection()
	 * @see #getPubliclyFormattedData()
	 * @generated
	 */
	EReference getPubliclyFormattedData_HearingInstrumentSelection();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getHearingInstrumentFitting <em>Hearing Instrument Fitting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hearing Instrument Fitting</em>'.
	 * @see com.himsa.patient.export.patient.export.PubliclyFormattedData#getHearingInstrumentFitting()
	 * @see #getPubliclyFormattedData()
	 * @generated
	 */
	EReference getPubliclyFormattedData_HearingInstrumentFitting();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getRemoteControlSelection <em>Remote Control Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remote Control Selection</em>'.
	 * @see com.himsa.patient.export.patient.export.PubliclyFormattedData#getRemoteControlSelection()
	 * @see #getPubliclyFormattedData()
	 * @generated
	 */
	EReference getPubliclyFormattedData_RemoteControlSelection();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getHIMSARemStandard <em>HIMSA Rem Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>HIMSA Rem Standard</em>'.
	 * @see com.himsa.patient.export.patient.export.PubliclyFormattedData#getHIMSARemStandard()
	 * @see #getPubliclyFormattedData()
	 * @generated
	 */
	EReference getPubliclyFormattedData_HIMSARemStandard();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getHIMSAHitStandard <em>HIMSA Hit Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>HIMSA Hit Standard</em>'.
	 * @see com.himsa.patient.export.patient.export.PubliclyFormattedData#getHIMSAHitStandard()
	 * @see #getPubliclyFormattedData()
	 * @generated
	 */
	EReference getPubliclyFormattedData_HIMSAHitStandard();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getAcousticImpedanceCompleteMeasurement <em>Acoustic Impedance Complete Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Acoustic Impedance Complete Measurement</em>'.
	 * @see com.himsa.patient.export.patient.export.PubliclyFormattedData#getAcousticImpedanceCompleteMeasurement()
	 * @see #getPubliclyFormattedData()
	 * @generated
	 */
	EReference getPubliclyFormattedData_AcousticImpedanceCompleteMeasurement();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getAcousticImmittanceAssessment <em>Acoustic Immittance Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Acoustic Immittance Assessment</em>'.
	 * @see com.himsa.patient.export.patient.export.PubliclyFormattedData#getAcousticImmittanceAssessment()
	 * @see #getPubliclyFormattedData()
	 * @generated
	 */
	EReference getPubliclyFormattedData_AcousticImmittanceAssessment();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getTinnitusMeasurementData <em>Tinnitus Measurement Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tinnitus Measurement Data</em>'.
	 * @see com.himsa.patient.export.patient.export.PubliclyFormattedData#getTinnitusMeasurementData()
	 * @see #getPubliclyFormattedData()
	 * @generated
	 */
	EReference getPubliclyFormattedData_TinnitusMeasurementData();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getHIMSAAudiogramMetadataStandard <em>HIMSA Audiogram Metadata Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>HIMSA Audiogram Metadata Standard</em>'.
	 * @see com.himsa.patient.export.patient.export.PubliclyFormattedData#getHIMSAAudiogramMetadataStandard()
	 * @see #getPubliclyFormattedData()
	 * @generated
	 */
	EReference getPubliclyFormattedData_HIMSAAudiogramMetadataStandard();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getCochlearImplantSoundProcessorSelection <em>Cochlear Implant Sound Processor Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cochlear Implant Sound Processor Selection</em>'.
	 * @see com.himsa.patient.export.patient.export.PubliclyFormattedData#getCochlearImplantSoundProcessorSelection()
	 * @see #getPubliclyFormattedData()
	 * @generated
	 */
	EReference getPubliclyFormattedData_CochlearImplantSoundProcessorSelection();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getHIMSAJournalStandard <em>HIMSA Journal Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>HIMSA Journal Standard</em>'.
	 * @see com.himsa.patient.export.patient.export.PubliclyFormattedData#getHIMSAJournalStandard()
	 * @see #getPubliclyFormattedData()
	 * @generated
	 */
	EReference getPubliclyFormattedData_HIMSAJournalStandard();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getNotificationAction <em>Notification Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Notification Action</em>'.
	 * @see com.himsa.patient.export.patient.export.PubliclyFormattedData#getNotificationAction()
	 * @see #getPubliclyFormattedData()
	 * @generated
	 */
	EReference getPubliclyFormattedData_NotificationAction();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getScanMetaDataStandard <em>Scan Meta Data Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scan Meta Data Standard</em>'.
	 * @see com.himsa.patient.export.patient.export.PubliclyFormattedData#getScanMetaDataStandard()
	 * @see #getPubliclyFormattedData()
	 * @generated
	 */
	EReference getPubliclyFormattedData_ScanMetaDataStandard();

	/**
	 * Returns the meta object for enum '{@link com.himsa.patient.export.patient.export.GenderType <em>Gender Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gender Type</em>'.
	 * @see com.himsa.patient.export.patient.export.GenderType
	 * @generated
	 */
	EEnum getGenderType();

	/**
	 * Returns the meta object for enum '{@link com.himsa.patient.export.patient.export.OperationTYPE <em>Operation TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation TYPE</em>'.
	 * @see com.himsa.patient.export.patient.export.OperationTYPE
	 * @generated
	 */
	EEnum getOperationTYPE();

	/**
	 * Returns the meta object for enum '{@link com.himsa.patient.export.patient.export.TypeOfDataType <em>Type Of Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Of Data Type</em>'.
	 * @see com.himsa.patient.export.patient.export.TypeOfDataType
	 * @generated
	 */
	EEnum getTypeOfDataType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Address1 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Address1 Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Address1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='30'"
	 * @generated
	 */
	EDataType getAddress1Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Address2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Address2 Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Address2_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='30'"
	 * @generated
	 */
	EDataType getAddress2Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Address3 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Address3 Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Address3_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='30'"
	 * @generated
	 */
	EDataType getAddress3Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Back End System Patient Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Back End System Patient Id Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='BackEndSystemPatientId_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='255'"
	 * @generated
	 */
	EDataType getBackEndSystemPatientIdType();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Birth Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Birth Date Type</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='BirthDate_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#dateTime'"
	 * @generated
	 */
	EDataType getBirthDateType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>City Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>City Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='City_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='30'"
	 * @generated
	 */
	EDataType getCityType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Country Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Country Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Country_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='30'"
	 * @generated
	 */
	EDataType getCountryType();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Create Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Create Date Type</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='CreateDate_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#dateTime'"
	 * @generated
	 */
	EDataType getCreateDateType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Data Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Format Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='DataFormat_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#integer'"
	 * @generated
	 */
	EDataType getDataFormatType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Description Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Description_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='60'"
	 * @generated
	 */
	EDataType getDescriptionType();

	/**
	 * Returns the meta object for data type '<em>Device Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Device Type Type</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='DeviceType_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#int'"
	 * @generated
	 */
	EDataType getDeviceTypeType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Device Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Device Type Type Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='DeviceType_._type:Object' baseType='DeviceType_._type'"
	 * @generated
	 */
	EDataType getDeviceTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>EMail Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EMail Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='EMail_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
	 * @generated
	 */
	EDataType getEMailType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>First Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>First Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='FirstName_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='30'"
	 * @generated
	 */
	EDataType getFirstNameType();

	/**
	 * Returns the meta object for data type '{@link com.himsa.patient.export.patient.export.GenderType <em>Gender Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Gender Type Object</em>'.
	 * @see com.himsa.patient.export.patient.export.GenderType
	 * @model instanceClass="com.himsa.patient.export.patient.export.GenderType"
	 *        extendedMetaData="name='Gender_._type:Object' baseType='Gender_._type'"
	 * @generated
	 */
	EDataType getGenderTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Home Telephone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Home Telephone Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='HomeTelephone_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='30'"
	 * @generated
	 */
	EDataType getHomeTelephoneType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Insurance1 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Insurance1 Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Insurance1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='30'"
	 * @generated
	 */
	EDataType getInsurance1Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Insurance2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Insurance2 Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Insurance2_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='30'"
	 * @generated
	 */
	EDataType getInsurance2Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Last Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Last Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='LastName_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='30'"
	 * @generated
	 */
	EDataType getLastNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Middle Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Middle Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='MiddleName_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='30'"
	 * @generated
	 */
	EDataType getMiddleNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Mobile Telephone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mobile Telephone Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='MobileTelephone_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='30'"
	 * @generated
	 */
	EDataType getMobileTelephoneType();

	/**
	 * Returns the meta object for data type '{@link com.himsa.patient.export.patient.export.OperationTYPE <em>Operation TYPE Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Operation TYPE Object</em>'.
	 * @see com.himsa.patient.export.patient.export.OperationTYPE
	 * @model instanceClass="com.himsa.patient.export.patient.export.OperationTYPE"
	 *        extendedMetaData="name='operation_TYPE:Object' baseType='operation_TYPE'"
	 * @generated
	 */
	EDataType getOperationTYPEObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Other1 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Other1 Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Other1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='30'"
	 * @generated
	 */
	EDataType getOther1Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Other2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Other2 Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Other2_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='30'"
	 * @generated
	 */
	EDataType getOther2Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Patient GUID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Patient GUID Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='PatientGUID_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='\\{[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}\\}'"
	 * @generated
	 */
	EDataType getPatientGUIDType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Patient No Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Patient No Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='PatientNo_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='30'"
	 * @generated
	 */
	EDataType getPatientNoType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Physician Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Physician Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Physician_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='30'"
	 * @generated
	 */
	EDataType getPhysicianType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Province Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Province Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Province_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='30'"
	 * @generated
	 */
	EDataType getProvinceType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Referral Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Referral Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Referral_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='30'"
	 * @generated
	 */
	EDataType getReferralType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Salutation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Salutation Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Salutation_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='30'"
	 * @generated
	 */
	EDataType getSalutationType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>SS Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SS Number Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SSNumber_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='20'"
	 * @generated
	 */
	EDataType getSSNumberType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Title Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Title_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='30'"
	 * @generated
	 */
	EDataType getTitleType();

	/**
	 * Returns the meta object for data type '{@link com.himsa.patient.export.patient.export.TypeOfDataType <em>Type Of Data Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Of Data Type Object</em>'.
	 * @see com.himsa.patient.export.patient.export.TypeOfDataType
	 * @model instanceClass="com.himsa.patient.export.patient.export.TypeOfDataType"
	 *        extendedMetaData="name='TypeOfData_._type:Object' baseType='TypeOfData_._type'"
	 * @generated
	 */
	EDataType getTypeOfDataTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>User Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>User Id Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='UserId_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='3'"
	 * @generated
	 */
	EDataType getUserIdType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>User Id Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>User Id Type1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='UserId_._1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='3'"
	 * @generated
	 */
	EDataType getUserIdType1();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Work Telephone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Work Telephone Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='WorkTelephone_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='30'"
	 * @generated
	 */
	EDataType getWorkTelephoneType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Zip Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Zip Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Zip_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='20'"
	 * @generated
	 */
	EDataType getZipType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExportFactory getExportFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.himsa.patient.export.patient.export.impl.ActionDataTypeImpl <em>Action Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.patient.export.patient.export.impl.ActionDataTypeImpl
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getActionDataType()
		 * @generated
		 */
		EClass ACTION_DATA_TYPE = eINSTANCE.getActionDataType();

		/**
		 * The meta object literal for the '<em><b>Type Of Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_DATA_TYPE__TYPE_OF_DATA = eINSTANCE.getActionDataType_TypeOfData();

		/**
		 * The meta object literal for the '<em><b>Data Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_DATA_TYPE__DATA_FORMAT = eINSTANCE.getActionDataType_DataFormat();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_DATA_TYPE__DESCRIPTION = eINSTANCE.getActionDataType_Description();

		/**
		 * The meta object literal for the '<em><b>Action Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_DATA_TYPE__ACTION_DATE = eINSTANCE.getActionDataType_ActionDate();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_DATA_TYPE__LAST_MODIFIED_DATE = eINSTANCE.getActionDataType_LastModifiedDate();

		/**
		 * The meta object literal for the '<em><b>User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_DATA_TYPE__USER_ID = eINSTANCE.getActionDataType_UserId();

		/**
		 * The meta object literal for the '<em><b>Public Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_DATA_TYPE__PUBLIC_DATA = eINSTANCE.getActionDataType_PublicData();

		/**
		 * The meta object literal for the '<em><b>Action Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_DATA_TYPE__ACTION_GROUP = eINSTANCE.getActionDataType_ActionGroup();

		/**
		 * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_DATA_TYPE__DEVICE_TYPE = eINSTANCE.getActionDataType_DeviceType();

		/**
		 * The meta object literal for the '<em><b>Module Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_DATA_TYPE__MODULE_ID = eINSTANCE.getActionDataType_ModuleId();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_DATA_TYPE__OPERATION = eINSTANCE.getActionDataType_Operation();

		/**
		 * The meta object literal for the '{@link com.himsa.patient.export.patient.export.impl.ActionsTypeImpl <em>Actions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.patient.export.patient.export.impl.ActionsTypeImpl
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getActionsType()
		 * @generated
		 */
		EClass ACTIONS_TYPE = eINSTANCE.getActionsType();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIONS_TYPE__ACTION = eINSTANCE.getActionsType_Action();

		/**
		 * The meta object literal for the '{@link com.himsa.patient.export.patient.export.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.patient.export.patient.export.impl.DocumentRootImpl
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Patients</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PATIENTS = eINSTANCE.getDocumentRoot_Patients();

		/**
		 * The meta object literal for the '{@link com.himsa.patient.export.patient.export.impl.PatientsTypeImpl <em>Patients Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.patient.export.patient.export.impl.PatientsTypeImpl
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getPatientsType()
		 * @generated
		 */
		EClass PATIENTS_TYPE = eINSTANCE.getPatientsType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENTS_TYPE__GROUP = eINSTANCE.getPatientsType_Group();

		/**
		 * The meta object literal for the '<em><b>Patient</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENTS_TYPE__PATIENT = eINSTANCE.getPatientsType_Patient();

		/**
		 * The meta object literal for the '{@link com.himsa.patient.export.patient.export.impl.PatientTypeImpl <em>Patient Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.patient.export.patient.export.impl.PatientTypeImpl
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getPatientType()
		 * @generated
		 */
		EClass PATIENT_TYPE = eINSTANCE.getPatientType();

		/**
		 * The meta object literal for the '<em><b>Patient GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_TYPE__PATIENT_GUID = eINSTANCE.getPatientType_PatientGUID();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_TYPE__FIRST_NAME = eINSTANCE.getPatientType_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_TYPE__LAST_NAME = eINSTANCE.getPatientType_LastName();

		/**
		 * The meta object literal for the '<em><b>Middle Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_TYPE__MIDDLE_NAME = eINSTANCE.getPatientType_MiddleName();

		/**
		 * The meta object literal for the '<em><b>Patient No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_TYPE__PATIENT_NO = eINSTANCE.getPatientType_PatientNo();

		/**
		 * The meta object literal for the '<em><b>Active Patient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_TYPE__ACTIVE_PATIENT = eINSTANCE.getPatientType_ActivePatient();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_TYPE__GENDER = eINSTANCE.getPatientType_Gender();

		/**
		 * The meta object literal for the '<em><b>Birth Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_TYPE__BIRTH_DATE = eINSTANCE.getPatientType_BirthDate();

		/**
		 * The meta object literal for the '<em><b>User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_TYPE__USER_ID = eINSTANCE.getPatientType_UserId();

		/**
		 * The meta object literal for the '<em><b>Create Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_TYPE__CREATE_DATE = eINSTANCE.getPatientType_CreateDate();

		/**
		 * The meta object literal for the '<em><b>Address1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_TYPE__ADDRESS1 = eINSTANCE.getPatientType_Address1();

		/**
		 * The meta object literal for the '<em><b>Address2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_TYPE__ADDRESS2 = eINSTANCE.getPatientType_Address2();

		/**
		 * The meta object literal for the '<em><b>Address3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_TYPE__ADDRESS3 = eINSTANCE.getPatientType_Address3();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_TYPE__TITLE = eINSTANCE.getPatientType_Title();

		/**
		 * The meta object literal for the '<em><b>Salutation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_TYPE__SALUTATION = eINSTANCE.getPatientType_Salutation();

		/**
		 * The meta object literal for the '<em><b>SS Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_TYPE__SS_NUMBER = eINSTANCE.getPatientType_SSNumber();

		/**
		 * The meta object literal for the '<em><b>Zip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_TYPE__ZIP = eINSTANCE.getPatientType_Zip();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_TYPE__CITY = eINSTANCE.getPatientType_City();

		/**
		 * The meta object literal for the '<em><b>Province</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_TYPE__PROVINCE = eINSTANCE.getPatientType_Province();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_TYPE__COUNTRY = eINSTANCE.getPatientType_Country();

		/**
		 * The meta object literal for the '<em><b>EMail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_TYPE__EMAIL = eINSTANCE.getPatientType_EMail();

		/**
		 * The meta object literal for the '<em><b>Home Telephone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_TYPE__HOME_TELEPHONE = eINSTANCE.getPatientType_HomeTelephone();

		/**
		 * The meta object literal for the '<em><b>Work Telephone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_TYPE__WORK_TELEPHONE = eINSTANCE.getPatientType_WorkTelephone();

		/**
		 * The meta object literal for the '<em><b>Mobile Telephone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_TYPE__MOBILE_TELEPHONE = eINSTANCE.getPatientType_MobileTelephone();

		/**
		 * The meta object literal for the '<em><b>Insurance1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_TYPE__INSURANCE1 = eINSTANCE.getPatientType_Insurance1();

		/**
		 * The meta object literal for the '<em><b>Insurance2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_TYPE__INSURANCE2 = eINSTANCE.getPatientType_Insurance2();

		/**
		 * The meta object literal for the '<em><b>Physician</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_TYPE__PHYSICIAN = eINSTANCE.getPatientType_Physician();

		/**
		 * The meta object literal for the '<em><b>Referral</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_TYPE__REFERRAL = eINSTANCE.getPatientType_Referral();

		/**
		 * The meta object literal for the '<em><b>Other1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_TYPE__OTHER1 = eINSTANCE.getPatientType_Other1();

		/**
		 * The meta object literal for the '<em><b>Other2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_TYPE__OTHER2 = eINSTANCE.getPatientType_Other2();

		/**
		 * The meta object literal for the '<em><b>Back End System Patient Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_TYPE__BACK_END_SYSTEM_PATIENT_ID = eINSTANCE.getPatientType_BackEndSystemPatientId();

		/**
		 * The meta object literal for the '{@link com.himsa.patient.export.patient.export.impl.PatientType1Impl <em>Patient Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.patient.export.patient.export.impl.PatientType1Impl
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getPatientType1()
		 * @generated
		 */
		EClass PATIENT_TYPE1 = eINSTANCE.getPatientType1();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_TYPE1__ACTIONS = eINSTANCE.getPatientType1_Actions();

		/**
		 * The meta object literal for the '{@link com.himsa.patient.export.patient.export.impl.PubliclyFormattedDataImpl <em>Publicly Formatted Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.patient.export.patient.export.impl.PubliclyFormattedDataImpl
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getPubliclyFormattedData()
		 * @generated
		 */
		EClass PUBLICLY_FORMATTED_DATA = eINSTANCE.getPubliclyFormattedData();

		/**
		 * The meta object literal for the '<em><b>HIMSA Audiometric Standard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOMETRIC_STANDARD = eINSTANCE.getPubliclyFormattedData_HIMSAAudiometricStandard();

		/**
		 * The meta object literal for the '<em><b>HIMSA Audiometric Standard1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOMETRIC_STANDARD1 = eINSTANCE.getPubliclyFormattedData_HIMSAAudiometricStandard1();

		/**
		 * The meta object literal for the '<em><b>Hearing Instrument Selection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLICLY_FORMATTED_DATA__HEARING_INSTRUMENT_SELECTION = eINSTANCE.getPubliclyFormattedData_HearingInstrumentSelection();

		/**
		 * The meta object literal for the '<em><b>Hearing Instrument Fitting</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLICLY_FORMATTED_DATA__HEARING_INSTRUMENT_FITTING = eINSTANCE.getPubliclyFormattedData_HearingInstrumentFitting();

		/**
		 * The meta object literal for the '<em><b>Remote Control Selection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLICLY_FORMATTED_DATA__REMOTE_CONTROL_SELECTION = eINSTANCE.getPubliclyFormattedData_RemoteControlSelection();

		/**
		 * The meta object literal for the '<em><b>HIMSA Rem Standard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLICLY_FORMATTED_DATA__HIMSA_REM_STANDARD = eINSTANCE.getPubliclyFormattedData_HIMSARemStandard();

		/**
		 * The meta object literal for the '<em><b>HIMSA Hit Standard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLICLY_FORMATTED_DATA__HIMSA_HIT_STANDARD = eINSTANCE.getPubliclyFormattedData_HIMSAHitStandard();

		/**
		 * The meta object literal for the '<em><b>Acoustic Impedance Complete Measurement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLICLY_FORMATTED_DATA__ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT = eINSTANCE.getPubliclyFormattedData_AcousticImpedanceCompleteMeasurement();

		/**
		 * The meta object literal for the '<em><b>Acoustic Immittance Assessment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLICLY_FORMATTED_DATA__ACOUSTIC_IMMITTANCE_ASSESSMENT = eINSTANCE.getPubliclyFormattedData_AcousticImmittanceAssessment();

		/**
		 * The meta object literal for the '<em><b>Tinnitus Measurement Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLICLY_FORMATTED_DATA__TINNITUS_MEASUREMENT_DATA = eINSTANCE.getPubliclyFormattedData_TinnitusMeasurementData();

		/**
		 * The meta object literal for the '<em><b>HIMSA Audiogram Metadata Standard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOGRAM_METADATA_STANDARD = eINSTANCE.getPubliclyFormattedData_HIMSAAudiogramMetadataStandard();

		/**
		 * The meta object literal for the '<em><b>Cochlear Implant Sound Processor Selection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLICLY_FORMATTED_DATA__COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION = eINSTANCE.getPubliclyFormattedData_CochlearImplantSoundProcessorSelection();

		/**
		 * The meta object literal for the '<em><b>HIMSA Journal Standard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLICLY_FORMATTED_DATA__HIMSA_JOURNAL_STANDARD = eINSTANCE.getPubliclyFormattedData_HIMSAJournalStandard();

		/**
		 * The meta object literal for the '<em><b>Notification Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLICLY_FORMATTED_DATA__NOTIFICATION_ACTION = eINSTANCE.getPubliclyFormattedData_NotificationAction();

		/**
		 * The meta object literal for the '<em><b>Scan Meta Data Standard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLICLY_FORMATTED_DATA__SCAN_META_DATA_STANDARD = eINSTANCE.getPubliclyFormattedData_ScanMetaDataStandard();

		/**
		 * The meta object literal for the '{@link com.himsa.patient.export.patient.export.GenderType <em>Gender Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.patient.export.patient.export.GenderType
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getGenderType()
		 * @generated
		 */
		EEnum GENDER_TYPE = eINSTANCE.getGenderType();

		/**
		 * The meta object literal for the '{@link com.himsa.patient.export.patient.export.OperationTYPE <em>Operation TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.patient.export.patient.export.OperationTYPE
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getOperationTYPE()
		 * @generated
		 */
		EEnum OPERATION_TYPE = eINSTANCE.getOperationTYPE();

		/**
		 * The meta object literal for the '{@link com.himsa.patient.export.patient.export.TypeOfDataType <em>Type Of Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.patient.export.patient.export.TypeOfDataType
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getTypeOfDataType()
		 * @generated
		 */
		EEnum TYPE_OF_DATA_TYPE = eINSTANCE.getTypeOfDataType();

		/**
		 * The meta object literal for the '<em>Address1 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getAddress1Type()
		 * @generated
		 */
		EDataType ADDRESS1_TYPE = eINSTANCE.getAddress1Type();

		/**
		 * The meta object literal for the '<em>Address2 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getAddress2Type()
		 * @generated
		 */
		EDataType ADDRESS2_TYPE = eINSTANCE.getAddress2Type();

		/**
		 * The meta object literal for the '<em>Address3 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getAddress3Type()
		 * @generated
		 */
		EDataType ADDRESS3_TYPE = eINSTANCE.getAddress3Type();

		/**
		 * The meta object literal for the '<em>Back End System Patient Id Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getBackEndSystemPatientIdType()
		 * @generated
		 */
		EDataType BACK_END_SYSTEM_PATIENT_ID_TYPE = eINSTANCE.getBackEndSystemPatientIdType();

		/**
		 * The meta object literal for the '<em>Birth Date Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getBirthDateType()
		 * @generated
		 */
		EDataType BIRTH_DATE_TYPE = eINSTANCE.getBirthDateType();

		/**
		 * The meta object literal for the '<em>City Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getCityType()
		 * @generated
		 */
		EDataType CITY_TYPE = eINSTANCE.getCityType();

		/**
		 * The meta object literal for the '<em>Country Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getCountryType()
		 * @generated
		 */
		EDataType COUNTRY_TYPE = eINSTANCE.getCountryType();

		/**
		 * The meta object literal for the '<em>Create Date Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getCreateDateType()
		 * @generated
		 */
		EDataType CREATE_DATE_TYPE = eINSTANCE.getCreateDateType();

		/**
		 * The meta object literal for the '<em>Data Format Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getDataFormatType()
		 * @generated
		 */
		EDataType DATA_FORMAT_TYPE = eINSTANCE.getDataFormatType();

		/**
		 * The meta object literal for the '<em>Description Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getDescriptionType()
		 * @generated
		 */
		EDataType DESCRIPTION_TYPE = eINSTANCE.getDescriptionType();

		/**
		 * The meta object literal for the '<em>Device Type Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getDeviceTypeType()
		 * @generated
		 */
		EDataType DEVICE_TYPE_TYPE = eINSTANCE.getDeviceTypeType();

		/**
		 * The meta object literal for the '<em>Device Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getDeviceTypeTypeObject()
		 * @generated
		 */
		EDataType DEVICE_TYPE_TYPE_OBJECT = eINSTANCE.getDeviceTypeTypeObject();

		/**
		 * The meta object literal for the '<em>EMail Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getEMailType()
		 * @generated
		 */
		EDataType EMAIL_TYPE = eINSTANCE.getEMailType();

		/**
		 * The meta object literal for the '<em>First Name Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getFirstNameType()
		 * @generated
		 */
		EDataType FIRST_NAME_TYPE = eINSTANCE.getFirstNameType();

		/**
		 * The meta object literal for the '<em>Gender Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.patient.export.patient.export.GenderType
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getGenderTypeObject()
		 * @generated
		 */
		EDataType GENDER_TYPE_OBJECT = eINSTANCE.getGenderTypeObject();

		/**
		 * The meta object literal for the '<em>Home Telephone Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getHomeTelephoneType()
		 * @generated
		 */
		EDataType HOME_TELEPHONE_TYPE = eINSTANCE.getHomeTelephoneType();

		/**
		 * The meta object literal for the '<em>Insurance1 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getInsurance1Type()
		 * @generated
		 */
		EDataType INSURANCE1_TYPE = eINSTANCE.getInsurance1Type();

		/**
		 * The meta object literal for the '<em>Insurance2 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getInsurance2Type()
		 * @generated
		 */
		EDataType INSURANCE2_TYPE = eINSTANCE.getInsurance2Type();

		/**
		 * The meta object literal for the '<em>Last Name Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getLastNameType()
		 * @generated
		 */
		EDataType LAST_NAME_TYPE = eINSTANCE.getLastNameType();

		/**
		 * The meta object literal for the '<em>Middle Name Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getMiddleNameType()
		 * @generated
		 */
		EDataType MIDDLE_NAME_TYPE = eINSTANCE.getMiddleNameType();

		/**
		 * The meta object literal for the '<em>Mobile Telephone Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getMobileTelephoneType()
		 * @generated
		 */
		EDataType MOBILE_TELEPHONE_TYPE = eINSTANCE.getMobileTelephoneType();

		/**
		 * The meta object literal for the '<em>Operation TYPE Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.patient.export.patient.export.OperationTYPE
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getOperationTYPEObject()
		 * @generated
		 */
		EDataType OPERATION_TYPE_OBJECT = eINSTANCE.getOperationTYPEObject();

		/**
		 * The meta object literal for the '<em>Other1 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getOther1Type()
		 * @generated
		 */
		EDataType OTHER1_TYPE = eINSTANCE.getOther1Type();

		/**
		 * The meta object literal for the '<em>Other2 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getOther2Type()
		 * @generated
		 */
		EDataType OTHER2_TYPE = eINSTANCE.getOther2Type();

		/**
		 * The meta object literal for the '<em>Patient GUID Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getPatientGUIDType()
		 * @generated
		 */
		EDataType PATIENT_GUID_TYPE = eINSTANCE.getPatientGUIDType();

		/**
		 * The meta object literal for the '<em>Patient No Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getPatientNoType()
		 * @generated
		 */
		EDataType PATIENT_NO_TYPE = eINSTANCE.getPatientNoType();

		/**
		 * The meta object literal for the '<em>Physician Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getPhysicianType()
		 * @generated
		 */
		EDataType PHYSICIAN_TYPE = eINSTANCE.getPhysicianType();

		/**
		 * The meta object literal for the '<em>Province Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getProvinceType()
		 * @generated
		 */
		EDataType PROVINCE_TYPE = eINSTANCE.getProvinceType();

		/**
		 * The meta object literal for the '<em>Referral Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getReferralType()
		 * @generated
		 */
		EDataType REFERRAL_TYPE = eINSTANCE.getReferralType();

		/**
		 * The meta object literal for the '<em>Salutation Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getSalutationType()
		 * @generated
		 */
		EDataType SALUTATION_TYPE = eINSTANCE.getSalutationType();

		/**
		 * The meta object literal for the '<em>SS Number Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getSSNumberType()
		 * @generated
		 */
		EDataType SS_NUMBER_TYPE = eINSTANCE.getSSNumberType();

		/**
		 * The meta object literal for the '<em>Title Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getTitleType()
		 * @generated
		 */
		EDataType TITLE_TYPE = eINSTANCE.getTitleType();

		/**
		 * The meta object literal for the '<em>Type Of Data Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.patient.export.patient.export.TypeOfDataType
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getTypeOfDataTypeObject()
		 * @generated
		 */
		EDataType TYPE_OF_DATA_TYPE_OBJECT = eINSTANCE.getTypeOfDataTypeObject();

		/**
		 * The meta object literal for the '<em>User Id Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getUserIdType()
		 * @generated
		 */
		EDataType USER_ID_TYPE = eINSTANCE.getUserIdType();

		/**
		 * The meta object literal for the '<em>User Id Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getUserIdType1()
		 * @generated
		 */
		EDataType USER_ID_TYPE1 = eINSTANCE.getUserIdType1();

		/**
		 * The meta object literal for the '<em>Work Telephone Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getWorkTelephoneType()
		 * @generated
		 */
		EDataType WORK_TELEPHONE_TYPE = eINSTANCE.getWorkTelephoneType();

		/**
		 * The meta object literal for the '<em>Zip Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.patient.export.patient.export.impl.ExportPackageImpl#getZipType()
		 * @generated
		 */
		EDataType ZIP_TYPE = eINSTANCE.getZipType();

	}

} //ExportPackage
