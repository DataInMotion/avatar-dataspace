/**
 */
package com.himsa.patient.export.patient.export.util;

import com.himsa.patient.export.patient.export.*;

import java.math.BigInteger;

import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see com.himsa.patient.export.patient.export.ExportPackage
 * @generated
 */
public class ExportValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ExportValidator INSTANCE = new ExportValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "com.himsa.patient.export.patient.export";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExportValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ExportPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ExportPackage.ACTION_DATA_TYPE:
				return validateActionDataType((ActionDataType)value, diagnostics, context);
			case ExportPackage.ACTIONS_TYPE:
				return validateActionsType((ActionsType)value, diagnostics, context);
			case ExportPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case ExportPackage.PATIENTS_TYPE:
				return validatePatientsType((PatientsType)value, diagnostics, context);
			case ExportPackage.PATIENT_TYPE:
				return validatePatientType((PatientType)value, diagnostics, context);
			case ExportPackage.PATIENT_TYPE1:
				return validatePatientType1((PatientType1)value, diagnostics, context);
			case ExportPackage.PUBLICLY_FORMATTED_DATA:
				return validatePubliclyFormattedData((PubliclyFormattedData)value, diagnostics, context);
			case ExportPackage.GENDER_TYPE:
				return validateGenderType((GenderType)value, diagnostics, context);
			case ExportPackage.OPERATION_TYPE:
				return validateOperationTYPE((OperationTYPE)value, diagnostics, context);
			case ExportPackage.TYPE_OF_DATA_TYPE:
				return validateTypeOfDataType((TypeOfDataType)value, diagnostics, context);
			case ExportPackage.ADDRESS1_TYPE:
				return validateAddress1Type((String)value, diagnostics, context);
			case ExportPackage.ADDRESS2_TYPE:
				return validateAddress2Type((String)value, diagnostics, context);
			case ExportPackage.ADDRESS3_TYPE:
				return validateAddress3Type((String)value, diagnostics, context);
			case ExportPackage.BACK_END_SYSTEM_PATIENT_ID_TYPE:
				return validateBackEndSystemPatientIdType((String)value, diagnostics, context);
			case ExportPackage.BIRTH_DATE_TYPE:
				return validateBirthDateType((XMLGregorianCalendar)value, diagnostics, context);
			case ExportPackage.CITY_TYPE:
				return validateCityType((String)value, diagnostics, context);
			case ExportPackage.COUNTRY_TYPE:
				return validateCountryType((String)value, diagnostics, context);
			case ExportPackage.CREATE_DATE_TYPE:
				return validateCreateDateType((XMLGregorianCalendar)value, diagnostics, context);
			case ExportPackage.DATA_FORMAT_TYPE:
				return validateDataFormatType((BigInteger)value, diagnostics, context);
			case ExportPackage.DESCRIPTION_TYPE:
				return validateDescriptionType((String)value, diagnostics, context);
			case ExportPackage.DEVICE_TYPE_TYPE:
				return validateDeviceTypeType((Integer)value, diagnostics, context);
			case ExportPackage.DEVICE_TYPE_TYPE_OBJECT:
				return validateDeviceTypeTypeObject((Integer)value, diagnostics, context);
			case ExportPackage.EMAIL_TYPE:
				return validateEMailType((String)value, diagnostics, context);
			case ExportPackage.FIRST_NAME_TYPE:
				return validateFirstNameType((String)value, diagnostics, context);
			case ExportPackage.GENDER_TYPE_OBJECT:
				return validateGenderTypeObject((GenderType)value, diagnostics, context);
			case ExportPackage.HOME_TELEPHONE_TYPE:
				return validateHomeTelephoneType((String)value, diagnostics, context);
			case ExportPackage.INSURANCE1_TYPE:
				return validateInsurance1Type((String)value, diagnostics, context);
			case ExportPackage.INSURANCE2_TYPE:
				return validateInsurance2Type((String)value, diagnostics, context);
			case ExportPackage.LAST_NAME_TYPE:
				return validateLastNameType((String)value, diagnostics, context);
			case ExportPackage.MIDDLE_NAME_TYPE:
				return validateMiddleNameType((String)value, diagnostics, context);
			case ExportPackage.MOBILE_TELEPHONE_TYPE:
				return validateMobileTelephoneType((String)value, diagnostics, context);
			case ExportPackage.OPERATION_TYPE_OBJECT:
				return validateOperationTYPEObject((OperationTYPE)value, diagnostics, context);
			case ExportPackage.OTHER1_TYPE:
				return validateOther1Type((String)value, diagnostics, context);
			case ExportPackage.OTHER2_TYPE:
				return validateOther2Type((String)value, diagnostics, context);
			case ExportPackage.PATIENT_GUID_TYPE:
				return validatePatientGUIDType((String)value, diagnostics, context);
			case ExportPackage.PATIENT_NO_TYPE:
				return validatePatientNoType((String)value, diagnostics, context);
			case ExportPackage.PHYSICIAN_TYPE:
				return validatePhysicianType((String)value, diagnostics, context);
			case ExportPackage.PROVINCE_TYPE:
				return validateProvinceType((String)value, diagnostics, context);
			case ExportPackage.REFERRAL_TYPE:
				return validateReferralType((String)value, diagnostics, context);
			case ExportPackage.SALUTATION_TYPE:
				return validateSalutationType((String)value, diagnostics, context);
			case ExportPackage.SS_NUMBER_TYPE:
				return validateSSNumberType((String)value, diagnostics, context);
			case ExportPackage.TITLE_TYPE:
				return validateTitleType((String)value, diagnostics, context);
			case ExportPackage.TYPE_OF_DATA_TYPE_OBJECT:
				return validateTypeOfDataTypeObject((TypeOfDataType)value, diagnostics, context);
			case ExportPackage.USER_ID_TYPE:
				return validateUserIdType((String)value, diagnostics, context);
			case ExportPackage.USER_ID_TYPE1:
				return validateUserIdType1((String)value, diagnostics, context);
			case ExportPackage.WORK_TELEPHONE_TYPE:
				return validateWorkTelephoneType((String)value, diagnostics, context);
			case ExportPackage.ZIP_TYPE:
				return validateZipType((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionDataType(ActionDataType actionDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionsType(ActionsType actionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientsType(PatientsType patientsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patientsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientType(PatientType patientType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patientType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientType1(PatientType1 patientType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patientType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePubliclyFormattedData(PubliclyFormattedData publiclyFormattedData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(publiclyFormattedData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenderType(GenderType genderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationTYPE(OperationTYPE operationTYPE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeOfDataType(TypeOfDataType typeOfDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddress1Type(String address1Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAddress1Type_MaxLength(address1Type, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Address1 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddress1Type_MaxLength(String address1Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = address1Type.length();
		boolean result = length <= 30;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ExportPackage.Literals.ADDRESS1_TYPE, address1Type, length, 30, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddress2Type(String address2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAddress2Type_MaxLength(address2Type, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Address2 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddress2Type_MaxLength(String address2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = address2Type.length();
		boolean result = length <= 30;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ExportPackage.Literals.ADDRESS2_TYPE, address2Type, length, 30, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddress3Type(String address3Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAddress3Type_MaxLength(address3Type, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Address3 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddress3Type_MaxLength(String address3Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = address3Type.length();
		boolean result = length <= 30;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ExportPackage.Literals.ADDRESS3_TYPE, address3Type, length, 30, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackEndSystemPatientIdType(String backEndSystemPatientIdType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBackEndSystemPatientIdType_MaxLength(backEndSystemPatientIdType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Back End System Patient Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackEndSystemPatientIdType_MaxLength(String backEndSystemPatientIdType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = backEndSystemPatientIdType.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ExportPackage.Literals.BACK_END_SYSTEM_PATIENT_ID_TYPE, backEndSystemPatientIdType, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthDateType(XMLGregorianCalendar birthDateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCityType(String cityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCityType_MaxLength(cityType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>City Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCityType_MaxLength(String cityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = cityType.length();
		boolean result = length <= 30;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ExportPackage.Literals.CITY_TYPE, cityType, length, 30, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountryType(String countryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCountryType_MaxLength(countryType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Country Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountryType_MaxLength(String countryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = countryType.length();
		boolean result = length <= 30;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ExportPackage.Literals.COUNTRY_TYPE, countryType, length, 30, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateDateType(XMLGregorianCalendar createDateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataFormatType(BigInteger dataFormatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionType(String descriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDescriptionType_MaxLength(descriptionType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionType_MaxLength(String descriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = descriptionType.length();
		boolean result = length <= 60;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ExportPackage.Literals.DESCRIPTION_TYPE, descriptionType, length, 60, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceTypeType(int deviceTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceTypeTypeObject(Integer deviceTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMailType(String eMailType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateEMailType_MaxLength(eMailType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>EMail Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMailType_MaxLength(String eMailType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = eMailType.length();
		boolean result = length <= 50;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ExportPackage.Literals.EMAIL_TYPE, eMailType, length, 50, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirstNameType(String firstNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFirstNameType_MaxLength(firstNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>First Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirstNameType_MaxLength(String firstNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = firstNameType.length();
		boolean result = length <= 30;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ExportPackage.Literals.FIRST_NAME_TYPE, firstNameType, length, 30, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenderTypeObject(GenderType genderTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHomeTelephoneType(String homeTelephoneType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHomeTelephoneType_MaxLength(homeTelephoneType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Home Telephone Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHomeTelephoneType_MaxLength(String homeTelephoneType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = homeTelephoneType.length();
		boolean result = length <= 30;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ExportPackage.Literals.HOME_TELEPHONE_TYPE, homeTelephoneType, length, 30, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsurance1Type(String insurance1Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateInsurance1Type_MaxLength(insurance1Type, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Insurance1 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsurance1Type_MaxLength(String insurance1Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = insurance1Type.length();
		boolean result = length <= 30;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ExportPackage.Literals.INSURANCE1_TYPE, insurance1Type, length, 30, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsurance2Type(String insurance2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateInsurance2Type_MaxLength(insurance2Type, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Insurance2 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsurance2Type_MaxLength(String insurance2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = insurance2Type.length();
		boolean result = length <= 30;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ExportPackage.Literals.INSURANCE2_TYPE, insurance2Type, length, 30, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastNameType(String lastNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLastNameType_MaxLength(lastNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Last Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastNameType_MaxLength(String lastNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = lastNameType.length();
		boolean result = length <= 30;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ExportPackage.Literals.LAST_NAME_TYPE, lastNameType, length, 30, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMiddleNameType(String middleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMiddleNameType_MaxLength(middleNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Middle Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMiddleNameType_MaxLength(String middleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = middleNameType.length();
		boolean result = length <= 30;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ExportPackage.Literals.MIDDLE_NAME_TYPE, middleNameType, length, 30, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMobileTelephoneType(String mobileTelephoneType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMobileTelephoneType_MaxLength(mobileTelephoneType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Mobile Telephone Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMobileTelephoneType_MaxLength(String mobileTelephoneType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = mobileTelephoneType.length();
		boolean result = length <= 30;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ExportPackage.Literals.MOBILE_TELEPHONE_TYPE, mobileTelephoneType, length, 30, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationTYPEObject(OperationTYPE operationTYPEObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOther1Type(String other1Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOther1Type_MaxLength(other1Type, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Other1 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOther1Type_MaxLength(String other1Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = other1Type.length();
		boolean result = length <= 30;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ExportPackage.Literals.OTHER1_TYPE, other1Type, length, 30, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOther2Type(String other2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOther2Type_MaxLength(other2Type, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Other2 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOther2Type_MaxLength(String other2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = other2Type.length();
		boolean result = length <= 30;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ExportPackage.Literals.OTHER2_TYPE, other2Type, length, 30, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientGUIDType(String patientGUIDType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePatientGUIDType_Pattern(patientGUIDType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePatientGUIDType_Pattern
	 */
	public static final  PatternMatcher [][] PATIENT_GUID_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\{[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}\\}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Patient GUID Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientGUIDType_Pattern(String patientGUIDType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ExportPackage.Literals.PATIENT_GUID_TYPE, patientGUIDType, PATIENT_GUID_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientNoType(String patientNoType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePatientNoType_MaxLength(patientNoType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Patient No Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientNoType_MaxLength(String patientNoType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = patientNoType.length();
		boolean result = length <= 30;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ExportPackage.Literals.PATIENT_NO_TYPE, patientNoType, length, 30, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicianType(String physicianType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePhysicianType_MaxLength(physicianType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Physician Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicianType_MaxLength(String physicianType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = physicianType.length();
		boolean result = length <= 30;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ExportPackage.Literals.PHYSICIAN_TYPE, physicianType, length, 30, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvinceType(String provinceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateProvinceType_MaxLength(provinceType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Province Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvinceType_MaxLength(String provinceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = provinceType.length();
		boolean result = length <= 30;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ExportPackage.Literals.PROVINCE_TYPE, provinceType, length, 30, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralType(String referralType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateReferralType_MaxLength(referralType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Referral Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralType_MaxLength(String referralType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = referralType.length();
		boolean result = length <= 30;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ExportPackage.Literals.REFERRAL_TYPE, referralType, length, 30, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSalutationType(String salutationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSalutationType_MaxLength(salutationType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Salutation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSalutationType_MaxLength(String salutationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = salutationType.length();
		boolean result = length <= 30;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ExportPackage.Literals.SALUTATION_TYPE, salutationType, length, 30, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSSNumberType(String ssNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSSNumberType_MaxLength(ssNumberType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>SS Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSSNumberType_MaxLength(String ssNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = ssNumberType.length();
		boolean result = length <= 20;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ExportPackage.Literals.SS_NUMBER_TYPE, ssNumberType, length, 20, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTitleType(String titleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTitleType_MaxLength(titleType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTitleType_MaxLength(String titleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = titleType.length();
		boolean result = length <= 30;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ExportPackage.Literals.TITLE_TYPE, titleType, length, 30, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeOfDataTypeObject(TypeOfDataType typeOfDataTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserIdType(String userIdType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUserIdType_MaxLength(userIdType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>User Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserIdType_MaxLength(String userIdType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = userIdType.length();
		boolean result = length <= 3;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ExportPackage.Literals.USER_ID_TYPE, userIdType, length, 3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserIdType1(String userIdType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUserIdType1_MaxLength(userIdType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>User Id Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserIdType1_MaxLength(String userIdType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = userIdType1.length();
		boolean result = length <= 3;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ExportPackage.Literals.USER_ID_TYPE1, userIdType1, length, 3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkTelephoneType(String workTelephoneType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateWorkTelephoneType_MaxLength(workTelephoneType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Work Telephone Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkTelephoneType_MaxLength(String workTelephoneType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = workTelephoneType.length();
		boolean result = length <= 30;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ExportPackage.Literals.WORK_TELEPHONE_TYPE, workTelephoneType, length, 30, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZipType(String zipType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateZipType_MaxLength(zipType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Zip Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZipType_MaxLength(String zipType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = zipType.length();
		boolean result = length <= 20;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ExportPackage.Literals.ZIP_TYPE, zipType, length, 20, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ExportValidator
