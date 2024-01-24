/**
 */
package com.himsa.patient.export.patient.export.impl;

import com.himsa.patient.export.patient.export.*;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExportFactoryImpl extends EFactoryImpl implements ExportFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExportFactory init() {
		try {
			ExportFactory theExportFactory = (ExportFactory)EPackage.Registry.INSTANCE.getEFactory(ExportPackage.eNS_URI);
			if (theExportFactory != null) {
				return theExportFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExportFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExportFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ExportPackage.ACTION_DATA_TYPE: return createActionDataType();
			case ExportPackage.ACTIONS_TYPE: return createActionsType();
			case ExportPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ExportPackage.PATIENTS_TYPE: return createPatientsType();
			case ExportPackage.PATIENT_TYPE: return createPatientType();
			case ExportPackage.PATIENT_TYPE1: return createPatientType1();
			case ExportPackage.PUBLICLY_FORMATTED_DATA: return createPubliclyFormattedData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ExportPackage.GENDER_TYPE:
				return createGenderTypeFromString(eDataType, initialValue);
			case ExportPackage.OPERATION_TYPE:
				return createOperationTYPEFromString(eDataType, initialValue);
			case ExportPackage.TYPE_OF_DATA_TYPE:
				return createTypeOfDataTypeFromString(eDataType, initialValue);
			case ExportPackage.ADDRESS1_TYPE:
				return createAddress1TypeFromString(eDataType, initialValue);
			case ExportPackage.ADDRESS2_TYPE:
				return createAddress2TypeFromString(eDataType, initialValue);
			case ExportPackage.ADDRESS3_TYPE:
				return createAddress3TypeFromString(eDataType, initialValue);
			case ExportPackage.BACK_END_SYSTEM_PATIENT_ID_TYPE:
				return createBackEndSystemPatientIdTypeFromString(eDataType, initialValue);
			case ExportPackage.BIRTH_DATE_TYPE:
				return createBirthDateTypeFromString(eDataType, initialValue);
			case ExportPackage.CITY_TYPE:
				return createCityTypeFromString(eDataType, initialValue);
			case ExportPackage.COUNTRY_TYPE:
				return createCountryTypeFromString(eDataType, initialValue);
			case ExportPackage.CREATE_DATE_TYPE:
				return createCreateDateTypeFromString(eDataType, initialValue);
			case ExportPackage.DATA_FORMAT_TYPE:
				return createDataFormatTypeFromString(eDataType, initialValue);
			case ExportPackage.DESCRIPTION_TYPE:
				return createDescriptionTypeFromString(eDataType, initialValue);
			case ExportPackage.DEVICE_TYPE_TYPE:
				return createDeviceTypeTypeFromString(eDataType, initialValue);
			case ExportPackage.DEVICE_TYPE_TYPE_OBJECT:
				return createDeviceTypeTypeObjectFromString(eDataType, initialValue);
			case ExportPackage.EMAIL_TYPE:
				return createEMailTypeFromString(eDataType, initialValue);
			case ExportPackage.FIRST_NAME_TYPE:
				return createFirstNameTypeFromString(eDataType, initialValue);
			case ExportPackage.GENDER_TYPE_OBJECT:
				return createGenderTypeObjectFromString(eDataType, initialValue);
			case ExportPackage.HOME_TELEPHONE_TYPE:
				return createHomeTelephoneTypeFromString(eDataType, initialValue);
			case ExportPackage.INSURANCE1_TYPE:
				return createInsurance1TypeFromString(eDataType, initialValue);
			case ExportPackage.INSURANCE2_TYPE:
				return createInsurance2TypeFromString(eDataType, initialValue);
			case ExportPackage.LAST_NAME_TYPE:
				return createLastNameTypeFromString(eDataType, initialValue);
			case ExportPackage.MIDDLE_NAME_TYPE:
				return createMiddleNameTypeFromString(eDataType, initialValue);
			case ExportPackage.MOBILE_TELEPHONE_TYPE:
				return createMobileTelephoneTypeFromString(eDataType, initialValue);
			case ExportPackage.OPERATION_TYPE_OBJECT:
				return createOperationTYPEObjectFromString(eDataType, initialValue);
			case ExportPackage.OTHER1_TYPE:
				return createOther1TypeFromString(eDataType, initialValue);
			case ExportPackage.OTHER2_TYPE:
				return createOther2TypeFromString(eDataType, initialValue);
			case ExportPackage.PATIENT_GUID_TYPE:
				return createPatientGUIDTypeFromString(eDataType, initialValue);
			case ExportPackage.PATIENT_NO_TYPE:
				return createPatientNoTypeFromString(eDataType, initialValue);
			case ExportPackage.PHYSICIAN_TYPE:
				return createPhysicianTypeFromString(eDataType, initialValue);
			case ExportPackage.PROVINCE_TYPE:
				return createProvinceTypeFromString(eDataType, initialValue);
			case ExportPackage.REFERRAL_TYPE:
				return createReferralTypeFromString(eDataType, initialValue);
			case ExportPackage.SALUTATION_TYPE:
				return createSalutationTypeFromString(eDataType, initialValue);
			case ExportPackage.SS_NUMBER_TYPE:
				return createSSNumberTypeFromString(eDataType, initialValue);
			case ExportPackage.TITLE_TYPE:
				return createTitleTypeFromString(eDataType, initialValue);
			case ExportPackage.TYPE_OF_DATA_TYPE_OBJECT:
				return createTypeOfDataTypeObjectFromString(eDataType, initialValue);
			case ExportPackage.USER_ID_TYPE:
				return createUserIdTypeFromString(eDataType, initialValue);
			case ExportPackage.USER_ID_TYPE1:
				return createUserIdType1FromString(eDataType, initialValue);
			case ExportPackage.WORK_TELEPHONE_TYPE:
				return createWorkTelephoneTypeFromString(eDataType, initialValue);
			case ExportPackage.ZIP_TYPE:
				return createZipTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ExportPackage.GENDER_TYPE:
				return convertGenderTypeToString(eDataType, instanceValue);
			case ExportPackage.OPERATION_TYPE:
				return convertOperationTYPEToString(eDataType, instanceValue);
			case ExportPackage.TYPE_OF_DATA_TYPE:
				return convertTypeOfDataTypeToString(eDataType, instanceValue);
			case ExportPackage.ADDRESS1_TYPE:
				return convertAddress1TypeToString(eDataType, instanceValue);
			case ExportPackage.ADDRESS2_TYPE:
				return convertAddress2TypeToString(eDataType, instanceValue);
			case ExportPackage.ADDRESS3_TYPE:
				return convertAddress3TypeToString(eDataType, instanceValue);
			case ExportPackage.BACK_END_SYSTEM_PATIENT_ID_TYPE:
				return convertBackEndSystemPatientIdTypeToString(eDataType, instanceValue);
			case ExportPackage.BIRTH_DATE_TYPE:
				return convertBirthDateTypeToString(eDataType, instanceValue);
			case ExportPackage.CITY_TYPE:
				return convertCityTypeToString(eDataType, instanceValue);
			case ExportPackage.COUNTRY_TYPE:
				return convertCountryTypeToString(eDataType, instanceValue);
			case ExportPackage.CREATE_DATE_TYPE:
				return convertCreateDateTypeToString(eDataType, instanceValue);
			case ExportPackage.DATA_FORMAT_TYPE:
				return convertDataFormatTypeToString(eDataType, instanceValue);
			case ExportPackage.DESCRIPTION_TYPE:
				return convertDescriptionTypeToString(eDataType, instanceValue);
			case ExportPackage.DEVICE_TYPE_TYPE:
				return convertDeviceTypeTypeToString(eDataType, instanceValue);
			case ExportPackage.DEVICE_TYPE_TYPE_OBJECT:
				return convertDeviceTypeTypeObjectToString(eDataType, instanceValue);
			case ExportPackage.EMAIL_TYPE:
				return convertEMailTypeToString(eDataType, instanceValue);
			case ExportPackage.FIRST_NAME_TYPE:
				return convertFirstNameTypeToString(eDataType, instanceValue);
			case ExportPackage.GENDER_TYPE_OBJECT:
				return convertGenderTypeObjectToString(eDataType, instanceValue);
			case ExportPackage.HOME_TELEPHONE_TYPE:
				return convertHomeTelephoneTypeToString(eDataType, instanceValue);
			case ExportPackage.INSURANCE1_TYPE:
				return convertInsurance1TypeToString(eDataType, instanceValue);
			case ExportPackage.INSURANCE2_TYPE:
				return convertInsurance2TypeToString(eDataType, instanceValue);
			case ExportPackage.LAST_NAME_TYPE:
				return convertLastNameTypeToString(eDataType, instanceValue);
			case ExportPackage.MIDDLE_NAME_TYPE:
				return convertMiddleNameTypeToString(eDataType, instanceValue);
			case ExportPackage.MOBILE_TELEPHONE_TYPE:
				return convertMobileTelephoneTypeToString(eDataType, instanceValue);
			case ExportPackage.OPERATION_TYPE_OBJECT:
				return convertOperationTYPEObjectToString(eDataType, instanceValue);
			case ExportPackage.OTHER1_TYPE:
				return convertOther1TypeToString(eDataType, instanceValue);
			case ExportPackage.OTHER2_TYPE:
				return convertOther2TypeToString(eDataType, instanceValue);
			case ExportPackage.PATIENT_GUID_TYPE:
				return convertPatientGUIDTypeToString(eDataType, instanceValue);
			case ExportPackage.PATIENT_NO_TYPE:
				return convertPatientNoTypeToString(eDataType, instanceValue);
			case ExportPackage.PHYSICIAN_TYPE:
				return convertPhysicianTypeToString(eDataType, instanceValue);
			case ExportPackage.PROVINCE_TYPE:
				return convertProvinceTypeToString(eDataType, instanceValue);
			case ExportPackage.REFERRAL_TYPE:
				return convertReferralTypeToString(eDataType, instanceValue);
			case ExportPackage.SALUTATION_TYPE:
				return convertSalutationTypeToString(eDataType, instanceValue);
			case ExportPackage.SS_NUMBER_TYPE:
				return convertSSNumberTypeToString(eDataType, instanceValue);
			case ExportPackage.TITLE_TYPE:
				return convertTitleTypeToString(eDataType, instanceValue);
			case ExportPackage.TYPE_OF_DATA_TYPE_OBJECT:
				return convertTypeOfDataTypeObjectToString(eDataType, instanceValue);
			case ExportPackage.USER_ID_TYPE:
				return convertUserIdTypeToString(eDataType, instanceValue);
			case ExportPackage.USER_ID_TYPE1:
				return convertUserIdType1ToString(eDataType, instanceValue);
			case ExportPackage.WORK_TELEPHONE_TYPE:
				return convertWorkTelephoneTypeToString(eDataType, instanceValue);
			case ExportPackage.ZIP_TYPE:
				return convertZipTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionDataType createActionDataType() {
		ActionDataTypeImpl actionDataType = new ActionDataTypeImpl();
		return actionDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionsType createActionsType() {
		ActionsTypeImpl actionsType = new ActionsTypeImpl();
		return actionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatientsType createPatientsType() {
		PatientsTypeImpl patientsType = new PatientsTypeImpl();
		return patientsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatientType createPatientType() {
		PatientTypeImpl patientType = new PatientTypeImpl();
		return patientType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatientType1 createPatientType1() {
		PatientType1Impl patientType1 = new PatientType1Impl();
		return patientType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PubliclyFormattedData createPubliclyFormattedData() {
		PubliclyFormattedDataImpl publiclyFormattedData = new PubliclyFormattedDataImpl();
		return publiclyFormattedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenderType createGenderTypeFromString(EDataType eDataType, String initialValue) {
		GenderType result = GenderType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationTYPE createOperationTYPEFromString(EDataType eDataType, String initialValue) {
		OperationTYPE result = OperationTYPE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationTYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOfDataType createTypeOfDataTypeFromString(EDataType eDataType, String initialValue) {
		TypeOfDataType result = TypeOfDataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeOfDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAddress1TypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddress1TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAddress2TypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddress2TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAddress3TypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddress3TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBackEndSystemPatientIdTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBackEndSystemPatientIdTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createBirthDateTypeFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBirthDateTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCityTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCityTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCountryTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCountryTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createCreateDateTypeFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCreateDateTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createDataFormatTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataFormatTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDescriptionTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDescriptionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createDeviceTypeTypeFromString(EDataType eDataType, String initialValue) {
		return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createDeviceTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceTypeTypeFromString(ExportPackage.Literals.DEVICE_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceTypeTypeToString(ExportPackage.Literals.DEVICE_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEMailTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEMailTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFirstNameTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFirstNameTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenderType createGenderTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createGenderTypeFromString(ExportPackage.Literals.GENDER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenderTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGenderTypeToString(ExportPackage.Literals.GENDER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createHomeTelephoneTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHomeTelephoneTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createInsurance1TypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInsurance1TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createInsurance2TypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInsurance2TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLastNameTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLastNameTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMiddleNameTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMiddleNameTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMobileTelephoneTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMobileTelephoneTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationTYPE createOperationTYPEObjectFromString(EDataType eDataType, String initialValue) {
		return createOperationTYPEFromString(ExportPackage.Literals.OPERATION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationTYPEObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOperationTYPEToString(ExportPackage.Literals.OPERATION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOther1TypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOther1TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOther2TypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOther2TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPatientGUIDTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPatientGUIDTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPatientNoTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPatientNoTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPhysicianTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPhysicianTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createProvinceTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProvinceTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createReferralTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferralTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSalutationTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSalutationTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSSNumberTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSSNumberTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTitleTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTitleTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOfDataType createTypeOfDataTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeOfDataTypeFromString(ExportPackage.Literals.TYPE_OF_DATA_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeOfDataTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeOfDataTypeToString(ExportPackage.Literals.TYPE_OF_DATA_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUserIdTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUserIdTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUserIdType1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUserIdType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createWorkTelephoneTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkTelephoneTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createZipTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZipTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExportPackage getExportPackage() {
		return (ExportPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExportPackage getPackage() {
		return ExportPackage.eINSTANCE;
	}

} //ExportFactoryImpl
