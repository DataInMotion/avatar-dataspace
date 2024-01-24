/*
 */
package com.himsa.instrument.fitting;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see com.himsa.instrument.fitting.FittingFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = FittingPackage.eNS_URI, genModel = "/model/PatientExportV5-1.genmodel", genModelSourceLocations = {"model/PatientExportV5-1.genmodel","org.avatar.himsa.model/model/PatientExportV5-1.genmodel"}, ecore="/model/instrument-fitting.ecore", ecoreSourceLocations="/model/instrument-fitting.ecore")
public interface FittingPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fitting";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.himsa.com/Instrument/Fitting";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fitting";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FittingPackage eINSTANCE = com.himsa.instrument.fitting.impl.FittingPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.himsa.instrument.fitting.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.instrument.fitting.impl.DocumentRootImpl
	 * @see com.himsa.instrument.fitting.impl.FittingPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

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
	 * The feature id for the '<em><b>Hearing Instrument Fitting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HEARING_INSTRUMENT_FITTING = 3;

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
	 * The meta object id for the '{@link com.himsa.instrument.fitting.impl.HearingInstrumentFittingTypeImpl <em>Hearing Instrument Fitting Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.instrument.fitting.impl.HearingInstrumentFittingTypeImpl
	 * @see com.himsa.instrument.fitting.impl.FittingPackageImpl#getHearingInstrumentFittingType()
	 * @generated
	 */
	int HEARING_INSTRUMENT_FITTING_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Date Of Audiogram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARING_INSTRUMENT_FITTING_TYPE__DATE_OF_AUDIOGRAM = 0;

	/**
	 * The feature id for the '<em><b>Reserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARING_INSTRUMENT_FITTING_TYPE__RESERVED = 1;

	/**
	 * The feature id for the '<em><b>Private Fitting Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARING_INSTRUMENT_FITTING_TYPE__PRIVATE_FITTING_DATA = 2;

	/**
	 * The feature id for the '<em><b>Converted From Data Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARING_INSTRUMENT_FITTING_TYPE__CONVERTED_FROM_DATA_STANDARD = 3;

	/**
	 * The feature id for the '<em><b>Validated By NOAH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARING_INSTRUMENT_FITTING_TYPE__VALIDATED_BY_NOAH = 4;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARING_INSTRUMENT_FITTING_TYPE__VERSION = 5;

	/**
	 * The number of structural features of the '<em>Hearing Instrument Fitting Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARING_INSTRUMENT_FITTING_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Hearing Instrument Fitting Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARING_INSTRUMENT_FITTING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Converted From Data Standard Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.himsa.instrument.fitting.impl.FittingPackageImpl#getConvertedFromDataStandardType()
	 * @generated
	 */
	int CONVERTED_FROM_DATA_STANDARD_TYPE = 2;

	/**
	 * The meta object id for the '<em>Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.himsa.instrument.fitting.impl.FittingPackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 3;


	/**
	 * Returns the meta object for class '{@link com.himsa.instrument.fitting.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.himsa.instrument.fitting.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.himsa.instrument.fitting.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.himsa.instrument.fitting.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.himsa.instrument.fitting.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.himsa.instrument.fitting.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.himsa.instrument.fitting.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.himsa.instrument.fitting.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.instrument.fitting.DocumentRoot#getHearingInstrumentFitting <em>Hearing Instrument Fitting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hearing Instrument Fitting</em>'.
	 * @see com.himsa.instrument.fitting.DocumentRoot#getHearingInstrumentFitting()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HearingInstrumentFitting();

	/**
	 * Returns the meta object for class '{@link com.himsa.instrument.fitting.HearingInstrumentFittingType <em>Hearing Instrument Fitting Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hearing Instrument Fitting Type</em>'.
	 * @see com.himsa.instrument.fitting.HearingInstrumentFittingType
	 * @generated
	 */
	EClass getHearingInstrumentFittingType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.instrument.fitting.HearingInstrumentFittingType#getDateOfAudiogram <em>Date Of Audiogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Audiogram</em>'.
	 * @see com.himsa.instrument.fitting.HearingInstrumentFittingType#getDateOfAudiogram()
	 * @see #getHearingInstrumentFittingType()
	 * @generated
	 */
	EAttribute getHearingInstrumentFittingType_DateOfAudiogram();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.instrument.fitting.HearingInstrumentFittingType#getReserved <em>Reserved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserved</em>'.
	 * @see com.himsa.instrument.fitting.HearingInstrumentFittingType#getReserved()
	 * @see #getHearingInstrumentFittingType()
	 * @generated
	 */
	EAttribute getHearingInstrumentFittingType_Reserved();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.instrument.fitting.HearingInstrumentFittingType#getPrivateFittingData <em>Private Fitting Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Fitting Data</em>'.
	 * @see com.himsa.instrument.fitting.HearingInstrumentFittingType#getPrivateFittingData()
	 * @see #getHearingInstrumentFittingType()
	 * @generated
	 */
	EAttribute getHearingInstrumentFittingType_PrivateFittingData();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.instrument.fitting.HearingInstrumentFittingType#getConvertedFromDataStandard <em>Converted From Data Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Converted From Data Standard</em>'.
	 * @see com.himsa.instrument.fitting.HearingInstrumentFittingType#getConvertedFromDataStandard()
	 * @see #getHearingInstrumentFittingType()
	 * @generated
	 */
	EAttribute getHearingInstrumentFittingType_ConvertedFromDataStandard();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.instrument.fitting.HearingInstrumentFittingType#isValidatedByNOAH <em>Validated By NOAH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validated By NOAH</em>'.
	 * @see com.himsa.instrument.fitting.HearingInstrumentFittingType#isValidatedByNOAH()
	 * @see #getHearingInstrumentFittingType()
	 * @generated
	 */
	EAttribute getHearingInstrumentFittingType_ValidatedByNOAH();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.instrument.fitting.HearingInstrumentFittingType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.himsa.instrument.fitting.HearingInstrumentFittingType#getVersion()
	 * @see #getHearingInstrumentFittingType()
	 * @generated
	 */
	EAttribute getHearingInstrumentFittingType_Version();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Converted From Data Standard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Converted From Data Standard Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='ConvertedFromDataStandard_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minInclusive='100'"
	 * @generated
	 */
	EDataType getConvertedFromDataStandardType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='Version_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#integer'"
	 * @generated
	 */
	EDataType getVersionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FittingFactory getFittingFactory();

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
		 * The meta object literal for the '{@link com.himsa.instrument.fitting.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.instrument.fitting.impl.DocumentRootImpl
		 * @see com.himsa.instrument.fitting.impl.FittingPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Hearing Instrument Fitting</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HEARING_INSTRUMENT_FITTING = eINSTANCE.getDocumentRoot_HearingInstrumentFitting();

		/**
		 * The meta object literal for the '{@link com.himsa.instrument.fitting.impl.HearingInstrumentFittingTypeImpl <em>Hearing Instrument Fitting Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.instrument.fitting.impl.HearingInstrumentFittingTypeImpl
		 * @see com.himsa.instrument.fitting.impl.FittingPackageImpl#getHearingInstrumentFittingType()
		 * @generated
		 */
		EClass HEARING_INSTRUMENT_FITTING_TYPE = eINSTANCE.getHearingInstrumentFittingType();

		/**
		 * The meta object literal for the '<em><b>Date Of Audiogram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEARING_INSTRUMENT_FITTING_TYPE__DATE_OF_AUDIOGRAM = eINSTANCE.getHearingInstrumentFittingType_DateOfAudiogram();

		/**
		 * The meta object literal for the '<em><b>Reserved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEARING_INSTRUMENT_FITTING_TYPE__RESERVED = eINSTANCE.getHearingInstrumentFittingType_Reserved();

		/**
		 * The meta object literal for the '<em><b>Private Fitting Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEARING_INSTRUMENT_FITTING_TYPE__PRIVATE_FITTING_DATA = eINSTANCE.getHearingInstrumentFittingType_PrivateFittingData();

		/**
		 * The meta object literal for the '<em><b>Converted From Data Standard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEARING_INSTRUMENT_FITTING_TYPE__CONVERTED_FROM_DATA_STANDARD = eINSTANCE.getHearingInstrumentFittingType_ConvertedFromDataStandard();

		/**
		 * The meta object literal for the '<em><b>Validated By NOAH</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEARING_INSTRUMENT_FITTING_TYPE__VALIDATED_BY_NOAH = eINSTANCE.getHearingInstrumentFittingType_ValidatedByNOAH();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEARING_INSTRUMENT_FITTING_TYPE__VERSION = eINSTANCE.getHearingInstrumentFittingType_Version();

		/**
		 * The meta object literal for the '<em>Converted From Data Standard Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see com.himsa.instrument.fitting.impl.FittingPackageImpl#getConvertedFromDataStandardType()
		 * @generated
		 */
		EDataType CONVERTED_FROM_DATA_STANDARD_TYPE = eINSTANCE.getConvertedFromDataStandardType();

		/**
		 * The meta object literal for the '<em>Version Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see com.himsa.instrument.fitting.impl.FittingPackageImpl#getVersionType()
		 * @generated
		 */
		EDataType VERSION_TYPE = eINSTANCE.getVersionType();

	}

} //FittingPackage
