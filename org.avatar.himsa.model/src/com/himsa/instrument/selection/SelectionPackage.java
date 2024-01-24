/*
 */
package com.himsa.instrument.selection;


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
 * @see com.himsa.instrument.selection.SelectionFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = SelectionPackage.eNS_URI, genModel = "/model/PatientExportV5-1.genmodel", genModelSourceLocations = {"model/PatientExportV5-1.genmodel","org.avatar.himsa.model/model/PatientExportV5-1.genmodel"}, ecore="/model/instrument-selection.ecore", ecoreSourceLocations="/model/instrument-selection.ecore")
public interface SelectionPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "selection";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.himsa.com/Instrument/Selection";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "selection";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SelectionPackage eINSTANCE = com.himsa.instrument.selection.impl.SelectionPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.himsa.instrument.selection.impl.BatteryTypeImpl <em>Battery Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.instrument.selection.impl.BatteryTypeImpl
	 * @see com.himsa.instrument.selection.impl.SelectionPackageImpl#getBatteryType()
	 * @generated
	 */
	int BATTERY_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Battery Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_TYPE__BATTERY_TYPE_CODE = 0;

	/**
	 * The feature id for the '<em><b>Battery Type Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_TYPE__BATTERY_TYPE_TEXT = 1;

	/**
	 * The number of structural features of the '<em>Battery Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Battery Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.instrument.selection.impl.DeviceCategoryTypeImpl <em>Device Category Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.instrument.selection.impl.DeviceCategoryTypeImpl
	 * @see com.himsa.instrument.selection.impl.SelectionPackageImpl#getDeviceCategoryType()
	 * @generated
	 */
	int DEVICE_CATEGORY_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Device Category Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CATEGORY_TYPE__DEVICE_CATEGORY_TYPE_CODE = 0;

	/**
	 * The feature id for the '<em><b>Device Category Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CATEGORY_TYPE__DEVICE_CATEGORY_TEXT = 1;

	/**
	 * The number of structural features of the '<em>Device Category Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CATEGORY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Device Category Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CATEGORY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.instrument.selection.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.instrument.selection.impl.DocumentRootImpl
	 * @see com.himsa.instrument.selection.impl.SelectionPackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>Hearing Instrument Selection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HEARING_INSTRUMENT_SELECTION = 3;

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
	 * The meta object id for the '{@link com.himsa.instrument.selection.impl.HearingInstrumentSelectionTypeImpl <em>Hearing Instrument Selection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.instrument.selection.impl.HearingInstrumentSelectionTypeImpl
	 * @see com.himsa.instrument.selection.impl.SelectionPackageImpl#getHearingInstrumentSelectionType()
	 * @generated
	 */
	int HEARING_INSTRUMENT_SELECTION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Instrument Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARING_INSTRUMENT_SELECTION_TYPE__INSTRUMENT_TYPE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Device Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARING_INSTRUMENT_SELECTION_TYPE__DEVICE_CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARING_INSTRUMENT_SELECTION_TYPE__SERIAL_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Vent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARING_INSTRUMENT_SELECTION_TYPE__VENT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Ear Mold Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARING_INSTRUMENT_SELECTION_TYPE__EAR_MOLD_FORM = 4;

	/**
	 * The feature id for the '<em><b>Ear Mold Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARING_INSTRUMENT_SELECTION_TYPE__EAR_MOLD_TEXT = 5;

	/**
	 * The feature id for the '<em><b>Sound Canal Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARING_INSTRUMENT_SELECTION_TYPE__SOUND_CANAL_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Battery Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARING_INSTRUMENT_SELECTION_TYPE__BATTERY_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Reserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARING_INSTRUMENT_SELECTION_TYPE__RESERVED = 8;

	/**
	 * The feature id for the '<em><b>Private Selection Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARING_INSTRUMENT_SELECTION_TYPE__PRIVATE_SELECTION_DATA = 9;

	/**
	 * The feature id for the '<em><b>Converted From Data Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARING_INSTRUMENT_SELECTION_TYPE__CONVERTED_FROM_DATA_STANDARD = 10;

	/**
	 * The feature id for the '<em><b>Validated By NOAH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARING_INSTRUMENT_SELECTION_TYPE__VALIDATED_BY_NOAH = 11;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARING_INSTRUMENT_SELECTION_TYPE__VERSION = 12;

	/**
	 * The number of structural features of the '<em>Hearing Instrument Selection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARING_INSTRUMENT_SELECTION_TYPE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Hearing Instrument Selection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARING_INSTRUMENT_SELECTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Battery Type Text Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.instrument.selection.impl.SelectionPackageImpl#getBatteryTypeTextType()
	 * @generated
	 */
	int BATTERY_TYPE_TEXT_TYPE = 4;

	/**
	 * The meta object id for the '<em>Converted From Data Standard Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.himsa.instrument.selection.impl.SelectionPackageImpl#getConvertedFromDataStandardType()
	 * @generated
	 */
	int CONVERTED_FROM_DATA_STANDARD_TYPE = 5;

	/**
	 * The meta object id for the '<em>Device Category Text Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.instrument.selection.impl.SelectionPackageImpl#getDeviceCategoryTextType()
	 * @generated
	 */
	int DEVICE_CATEGORY_TEXT_TYPE = 6;

	/**
	 * The meta object id for the '<em>Ear Mold Form Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.himsa.instrument.selection.impl.SelectionPackageImpl#getEarMoldFormType()
	 * @generated
	 */
	int EAR_MOLD_FORM_TYPE = 7;

	/**
	 * The meta object id for the '<em>Ear Mold Text Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.instrument.selection.impl.SelectionPackageImpl#getEarMoldTextType()
	 * @generated
	 */
	int EAR_MOLD_TEXT_TYPE = 8;

	/**
	 * The meta object id for the '<em>Instrument Type Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.instrument.selection.impl.SelectionPackageImpl#getInstrumentTypeNameType()
	 * @generated
	 */
	int INSTRUMENT_TYPE_NAME_TYPE = 9;

	/**
	 * The meta object id for the '<em>Serial Number Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.instrument.selection.impl.SelectionPackageImpl#getSerialNumberType()
	 * @generated
	 */
	int SERIAL_NUMBER_TYPE = 10;

	/**
	 * The meta object id for the '<em>Sound Canal Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.himsa.instrument.selection.impl.SelectionPackageImpl#getSoundCanalType()
	 * @generated
	 */
	int SOUND_CANAL_TYPE = 11;

	/**
	 * The meta object id for the '<em>Vent Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.himsa.instrument.selection.impl.SelectionPackageImpl#getVentType()
	 * @generated
	 */
	int VENT_TYPE = 12;

	/**
	 * The meta object id for the '<em>Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.himsa.instrument.selection.impl.SelectionPackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 13;


	/**
	 * Returns the meta object for class '{@link com.himsa.instrument.selection.BatteryType <em>Battery Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Battery Type</em>'.
	 * @see com.himsa.instrument.selection.BatteryType
	 * @generated
	 */
	EClass getBatteryType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.instrument.selection.BatteryType#getBatteryTypeCode <em>Battery Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery Type Code</em>'.
	 * @see com.himsa.instrument.selection.BatteryType#getBatteryTypeCode()
	 * @see #getBatteryType()
	 * @generated
	 */
	EAttribute getBatteryType_BatteryTypeCode();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.instrument.selection.BatteryType#getBatteryTypeText <em>Battery Type Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery Type Text</em>'.
	 * @see com.himsa.instrument.selection.BatteryType#getBatteryTypeText()
	 * @see #getBatteryType()
	 * @generated
	 */
	EAttribute getBatteryType_BatteryTypeText();

	/**
	 * Returns the meta object for class '{@link com.himsa.instrument.selection.DeviceCategoryType <em>Device Category Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Category Type</em>'.
	 * @see com.himsa.instrument.selection.DeviceCategoryType
	 * @generated
	 */
	EClass getDeviceCategoryType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.instrument.selection.DeviceCategoryType#getDeviceCategoryTypeCode <em>Device Category Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Category Type Code</em>'.
	 * @see com.himsa.instrument.selection.DeviceCategoryType#getDeviceCategoryTypeCode()
	 * @see #getDeviceCategoryType()
	 * @generated
	 */
	EAttribute getDeviceCategoryType_DeviceCategoryTypeCode();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.instrument.selection.DeviceCategoryType#getDeviceCategoryText <em>Device Category Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Category Text</em>'.
	 * @see com.himsa.instrument.selection.DeviceCategoryType#getDeviceCategoryText()
	 * @see #getDeviceCategoryType()
	 * @generated
	 */
	EAttribute getDeviceCategoryType_DeviceCategoryText();

	/**
	 * Returns the meta object for class '{@link com.himsa.instrument.selection.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.himsa.instrument.selection.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.himsa.instrument.selection.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.himsa.instrument.selection.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.himsa.instrument.selection.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.himsa.instrument.selection.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.himsa.instrument.selection.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.himsa.instrument.selection.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.instrument.selection.DocumentRoot#getHearingInstrumentSelection <em>Hearing Instrument Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hearing Instrument Selection</em>'.
	 * @see com.himsa.instrument.selection.DocumentRoot#getHearingInstrumentSelection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HearingInstrumentSelection();

	/**
	 * Returns the meta object for class '{@link com.himsa.instrument.selection.HearingInstrumentSelectionType <em>Hearing Instrument Selection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hearing Instrument Selection Type</em>'.
	 * @see com.himsa.instrument.selection.HearingInstrumentSelectionType
	 * @generated
	 */
	EClass getHearingInstrumentSelectionType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getInstrumentTypeName <em>Instrument Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instrument Type Name</em>'.
	 * @see com.himsa.instrument.selection.HearingInstrumentSelectionType#getInstrumentTypeName()
	 * @see #getHearingInstrumentSelectionType()
	 * @generated
	 */
	EAttribute getHearingInstrumentSelectionType_InstrumentTypeName();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getDeviceCategory <em>Device Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Category</em>'.
	 * @see com.himsa.instrument.selection.HearingInstrumentSelectionType#getDeviceCategory()
	 * @see #getHearingInstrumentSelectionType()
	 * @generated
	 */
	EReference getHearingInstrumentSelectionType_DeviceCategory();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getSerialNumber <em>Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Number</em>'.
	 * @see com.himsa.instrument.selection.HearingInstrumentSelectionType#getSerialNumber()
	 * @see #getHearingInstrumentSelectionType()
	 * @generated
	 */
	EAttribute getHearingInstrumentSelectionType_SerialNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getVentType <em>Vent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vent Type</em>'.
	 * @see com.himsa.instrument.selection.HearingInstrumentSelectionType#getVentType()
	 * @see #getHearingInstrumentSelectionType()
	 * @generated
	 */
	EAttribute getHearingInstrumentSelectionType_VentType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getEarMoldForm <em>Ear Mold Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ear Mold Form</em>'.
	 * @see com.himsa.instrument.selection.HearingInstrumentSelectionType#getEarMoldForm()
	 * @see #getHearingInstrumentSelectionType()
	 * @generated
	 */
	EAttribute getHearingInstrumentSelectionType_EarMoldForm();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getEarMoldText <em>Ear Mold Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ear Mold Text</em>'.
	 * @see com.himsa.instrument.selection.HearingInstrumentSelectionType#getEarMoldText()
	 * @see #getHearingInstrumentSelectionType()
	 * @generated
	 */
	EAttribute getHearingInstrumentSelectionType_EarMoldText();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getSoundCanalType <em>Sound Canal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sound Canal Type</em>'.
	 * @see com.himsa.instrument.selection.HearingInstrumentSelectionType#getSoundCanalType()
	 * @see #getHearingInstrumentSelectionType()
	 * @generated
	 */
	EAttribute getHearingInstrumentSelectionType_SoundCanalType();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getBatteryType <em>Battery Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Battery Type</em>'.
	 * @see com.himsa.instrument.selection.HearingInstrumentSelectionType#getBatteryType()
	 * @see #getHearingInstrumentSelectionType()
	 * @generated
	 */
	EReference getHearingInstrumentSelectionType_BatteryType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getReserved <em>Reserved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserved</em>'.
	 * @see com.himsa.instrument.selection.HearingInstrumentSelectionType#getReserved()
	 * @see #getHearingInstrumentSelectionType()
	 * @generated
	 */
	EAttribute getHearingInstrumentSelectionType_Reserved();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getPrivateSelectionData <em>Private Selection Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Selection Data</em>'.
	 * @see com.himsa.instrument.selection.HearingInstrumentSelectionType#getPrivateSelectionData()
	 * @see #getHearingInstrumentSelectionType()
	 * @generated
	 */
	EAttribute getHearingInstrumentSelectionType_PrivateSelectionData();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getConvertedFromDataStandard <em>Converted From Data Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Converted From Data Standard</em>'.
	 * @see com.himsa.instrument.selection.HearingInstrumentSelectionType#getConvertedFromDataStandard()
	 * @see #getHearingInstrumentSelectionType()
	 * @generated
	 */
	EAttribute getHearingInstrumentSelectionType_ConvertedFromDataStandard();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#isValidatedByNOAH <em>Validated By NOAH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validated By NOAH</em>'.
	 * @see com.himsa.instrument.selection.HearingInstrumentSelectionType#isValidatedByNOAH()
	 * @see #getHearingInstrumentSelectionType()
	 * @generated
	 */
	EAttribute getHearingInstrumentSelectionType_ValidatedByNOAH();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.instrument.selection.HearingInstrumentSelectionType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.himsa.instrument.selection.HearingInstrumentSelectionType#getVersion()
	 * @see #getHearingInstrumentSelectionType()
	 * @generated
	 */
	EAttribute getHearingInstrumentSelectionType_Version();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Battery Type Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Battery Type Text Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='BatteryTypeText_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='21'"
	 * @generated
	 */
	EDataType getBatteryTypeTextType();

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
	 * Returns the meta object for data type '{@link java.lang.String <em>Device Category Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Device Category Text Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='DeviceCategoryText_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='21'"
	 * @generated
	 */
	EDataType getDeviceCategoryTextType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Ear Mold Form Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * EarMoldForm Type is defined by the manufacturer as an integer value and not a publicly shared value across all HIMSA Manufacturers
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Ear Mold Form Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='EarMoldForm_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#integer'"
	 * @generated
	 */
	EDataType getEarMoldFormType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ear Mold Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ear Mold Text Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='EarMoldText_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='61'"
	 * @generated
	 */
	EDataType getEarMoldTextType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Instrument Type Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Instrument Type Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='InstrumentTypeName_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='41'"
	 * @generated
	 */
	EDataType getInstrumentTypeNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Serial Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Serial Number Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SerialNumber_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='21'"
	 * @generated
	 */
	EDataType getSerialNumberType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Sound Canal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * SoundCanal Type Type is defined by the manufacturer as an integer value and not a publicly shared value across all HIMSA Manufacturers
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Sound Canal Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='SoundCanal_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#integer'"
	 * @generated
	 */
	EDataType getSoundCanalType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Vent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Vent Type is defined by the manufacturer as an integer value and not a publicly shared value across all HIMSA Manufacturers
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Vent Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='Vent_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#integer'"
	 * @generated
	 */
	EDataType getVentType();

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
	SelectionFactory getSelectionFactory();

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
		 * The meta object literal for the '{@link com.himsa.instrument.selection.impl.BatteryTypeImpl <em>Battery Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.instrument.selection.impl.BatteryTypeImpl
		 * @see com.himsa.instrument.selection.impl.SelectionPackageImpl#getBatteryType()
		 * @generated
		 */
		EClass BATTERY_TYPE = eINSTANCE.getBatteryType();

		/**
		 * The meta object literal for the '<em><b>Battery Type Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_TYPE__BATTERY_TYPE_CODE = eINSTANCE.getBatteryType_BatteryTypeCode();

		/**
		 * The meta object literal for the '<em><b>Battery Type Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_TYPE__BATTERY_TYPE_TEXT = eINSTANCE.getBatteryType_BatteryTypeText();

		/**
		 * The meta object literal for the '{@link com.himsa.instrument.selection.impl.DeviceCategoryTypeImpl <em>Device Category Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.instrument.selection.impl.DeviceCategoryTypeImpl
		 * @see com.himsa.instrument.selection.impl.SelectionPackageImpl#getDeviceCategoryType()
		 * @generated
		 */
		EClass DEVICE_CATEGORY_TYPE = eINSTANCE.getDeviceCategoryType();

		/**
		 * The meta object literal for the '<em><b>Device Category Type Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_CATEGORY_TYPE__DEVICE_CATEGORY_TYPE_CODE = eINSTANCE.getDeviceCategoryType_DeviceCategoryTypeCode();

		/**
		 * The meta object literal for the '<em><b>Device Category Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_CATEGORY_TYPE__DEVICE_CATEGORY_TEXT = eINSTANCE.getDeviceCategoryType_DeviceCategoryText();

		/**
		 * The meta object literal for the '{@link com.himsa.instrument.selection.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.instrument.selection.impl.DocumentRootImpl
		 * @see com.himsa.instrument.selection.impl.SelectionPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Hearing Instrument Selection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HEARING_INSTRUMENT_SELECTION = eINSTANCE.getDocumentRoot_HearingInstrumentSelection();

		/**
		 * The meta object literal for the '{@link com.himsa.instrument.selection.impl.HearingInstrumentSelectionTypeImpl <em>Hearing Instrument Selection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.instrument.selection.impl.HearingInstrumentSelectionTypeImpl
		 * @see com.himsa.instrument.selection.impl.SelectionPackageImpl#getHearingInstrumentSelectionType()
		 * @generated
		 */
		EClass HEARING_INSTRUMENT_SELECTION_TYPE = eINSTANCE.getHearingInstrumentSelectionType();

		/**
		 * The meta object literal for the '<em><b>Instrument Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEARING_INSTRUMENT_SELECTION_TYPE__INSTRUMENT_TYPE_NAME = eINSTANCE.getHearingInstrumentSelectionType_InstrumentTypeName();

		/**
		 * The meta object literal for the '<em><b>Device Category</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEARING_INSTRUMENT_SELECTION_TYPE__DEVICE_CATEGORY = eINSTANCE.getHearingInstrumentSelectionType_DeviceCategory();

		/**
		 * The meta object literal for the '<em><b>Serial Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEARING_INSTRUMENT_SELECTION_TYPE__SERIAL_NUMBER = eINSTANCE.getHearingInstrumentSelectionType_SerialNumber();

		/**
		 * The meta object literal for the '<em><b>Vent Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEARING_INSTRUMENT_SELECTION_TYPE__VENT_TYPE = eINSTANCE.getHearingInstrumentSelectionType_VentType();

		/**
		 * The meta object literal for the '<em><b>Ear Mold Form</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEARING_INSTRUMENT_SELECTION_TYPE__EAR_MOLD_FORM = eINSTANCE.getHearingInstrumentSelectionType_EarMoldForm();

		/**
		 * The meta object literal for the '<em><b>Ear Mold Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEARING_INSTRUMENT_SELECTION_TYPE__EAR_MOLD_TEXT = eINSTANCE.getHearingInstrumentSelectionType_EarMoldText();

		/**
		 * The meta object literal for the '<em><b>Sound Canal Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEARING_INSTRUMENT_SELECTION_TYPE__SOUND_CANAL_TYPE = eINSTANCE.getHearingInstrumentSelectionType_SoundCanalType();

		/**
		 * The meta object literal for the '<em><b>Battery Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEARING_INSTRUMENT_SELECTION_TYPE__BATTERY_TYPE = eINSTANCE.getHearingInstrumentSelectionType_BatteryType();

		/**
		 * The meta object literal for the '<em><b>Reserved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEARING_INSTRUMENT_SELECTION_TYPE__RESERVED = eINSTANCE.getHearingInstrumentSelectionType_Reserved();

		/**
		 * The meta object literal for the '<em><b>Private Selection Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEARING_INSTRUMENT_SELECTION_TYPE__PRIVATE_SELECTION_DATA = eINSTANCE.getHearingInstrumentSelectionType_PrivateSelectionData();

		/**
		 * The meta object literal for the '<em><b>Converted From Data Standard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEARING_INSTRUMENT_SELECTION_TYPE__CONVERTED_FROM_DATA_STANDARD = eINSTANCE.getHearingInstrumentSelectionType_ConvertedFromDataStandard();

		/**
		 * The meta object literal for the '<em><b>Validated By NOAH</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEARING_INSTRUMENT_SELECTION_TYPE__VALIDATED_BY_NOAH = eINSTANCE.getHearingInstrumentSelectionType_ValidatedByNOAH();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEARING_INSTRUMENT_SELECTION_TYPE__VERSION = eINSTANCE.getHearingInstrumentSelectionType_Version();

		/**
		 * The meta object literal for the '<em>Battery Type Text Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.instrument.selection.impl.SelectionPackageImpl#getBatteryTypeTextType()
		 * @generated
		 */
		EDataType BATTERY_TYPE_TEXT_TYPE = eINSTANCE.getBatteryTypeTextType();

		/**
		 * The meta object literal for the '<em>Converted From Data Standard Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see com.himsa.instrument.selection.impl.SelectionPackageImpl#getConvertedFromDataStandardType()
		 * @generated
		 */
		EDataType CONVERTED_FROM_DATA_STANDARD_TYPE = eINSTANCE.getConvertedFromDataStandardType();

		/**
		 * The meta object literal for the '<em>Device Category Text Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.instrument.selection.impl.SelectionPackageImpl#getDeviceCategoryTextType()
		 * @generated
		 */
		EDataType DEVICE_CATEGORY_TEXT_TYPE = eINSTANCE.getDeviceCategoryTextType();

		/**
		 * The meta object literal for the '<em>Ear Mold Form Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see com.himsa.instrument.selection.impl.SelectionPackageImpl#getEarMoldFormType()
		 * @generated
		 */
		EDataType EAR_MOLD_FORM_TYPE = eINSTANCE.getEarMoldFormType();

		/**
		 * The meta object literal for the '<em>Ear Mold Text Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.instrument.selection.impl.SelectionPackageImpl#getEarMoldTextType()
		 * @generated
		 */
		EDataType EAR_MOLD_TEXT_TYPE = eINSTANCE.getEarMoldTextType();

		/**
		 * The meta object literal for the '<em>Instrument Type Name Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.instrument.selection.impl.SelectionPackageImpl#getInstrumentTypeNameType()
		 * @generated
		 */
		EDataType INSTRUMENT_TYPE_NAME_TYPE = eINSTANCE.getInstrumentTypeNameType();

		/**
		 * The meta object literal for the '<em>Serial Number Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.instrument.selection.impl.SelectionPackageImpl#getSerialNumberType()
		 * @generated
		 */
		EDataType SERIAL_NUMBER_TYPE = eINSTANCE.getSerialNumberType();

		/**
		 * The meta object literal for the '<em>Sound Canal Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see com.himsa.instrument.selection.impl.SelectionPackageImpl#getSoundCanalType()
		 * @generated
		 */
		EDataType SOUND_CANAL_TYPE = eINSTANCE.getSoundCanalType();

		/**
		 * The meta object literal for the '<em>Vent Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see com.himsa.instrument.selection.impl.SelectionPackageImpl#getVentType()
		 * @generated
		 */
		EDataType VENT_TYPE = eINSTANCE.getVentType();

		/**
		 * The meta object literal for the '<em>Version Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see com.himsa.instrument.selection.impl.SelectionPackageImpl#getVersionType()
		 * @generated
		 */
		EDataType VERSION_TYPE = eINSTANCE.getVersionType();

	}

} //SelectionPackage
