/*
 */
package com.himsa.instrument.remote.control;


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
 * @see com.himsa.instrument.remote.control.ControlFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = ControlPackage.eNS_URI, genModel = "/model/PatientExportV5-1.genmodel", genModelSourceLocations = {"model/PatientExportV5-1.genmodel","org.avatar.himsa.model/model/PatientExportV5-1.genmodel"}, ecore="/model/remote-control.ecore", ecoreSourceLocations="/model/remote-control.ecore")
public interface ControlPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "control";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.himsa.com/Instrument/RemoteControl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "control";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ControlPackage eINSTANCE = com.himsa.instrument.remote.control.impl.ControlPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.himsa.instrument.remote.control.impl.BatteryTypeImpl <em>Battery Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.instrument.remote.control.impl.BatteryTypeImpl
	 * @see com.himsa.instrument.remote.control.impl.ControlPackageImpl#getBatteryType()
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
	 * The meta object id for the '{@link com.himsa.instrument.remote.control.impl.RemoteControlSelectionTypeImpl <em>Remote Control Selection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.instrument.remote.control.impl.RemoteControlSelectionTypeImpl
	 * @see com.himsa.instrument.remote.control.impl.ControlPackageImpl#getRemoteControlSelectionType()
	 * @generated
	 */
	int REMOTE_CONTROL_SELECTION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Instrument Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONTROL_SELECTION_TYPE__INSTRUMENT_TYPE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONTROL_SELECTION_TYPE__SERIAL_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Battery Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONTROL_SELECTION_TYPE__BATTERY_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Reserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONTROL_SELECTION_TYPE__RESERVED = 3;

	/**
	 * The feature id for the '<em><b>Private Selection Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONTROL_SELECTION_TYPE__PRIVATE_SELECTION_DATA = 4;

	/**
	 * The feature id for the '<em><b>Converted From Data Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONTROL_SELECTION_TYPE__CONVERTED_FROM_DATA_STANDARD = 5;

	/**
	 * The feature id for the '<em><b>Validated By NOAH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONTROL_SELECTION_TYPE__VALIDATED_BY_NOAH = 6;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONTROL_SELECTION_TYPE__VERSION = 7;

	/**
	 * The number of structural features of the '<em>Remote Control Selection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONTROL_SELECTION_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Remote Control Selection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONTROL_SELECTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.instrument.remote.control.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.instrument.remote.control.impl.DocumentRootImpl
	 * @see com.himsa.instrument.remote.control.impl.ControlPackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>Remote Control Selection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REMOTE_CONTROL_SELECTION = 3;

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
	 * The meta object id for the '<em>Battery Type Text Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.instrument.remote.control.impl.ControlPackageImpl#getBatteryTypeTextType()
	 * @generated
	 */
	int BATTERY_TYPE_TEXT_TYPE = 3;

	/**
	 * The meta object id for the '<em>Converted From Data Standard Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.himsa.instrument.remote.control.impl.ControlPackageImpl#getConvertedFromDataStandardType()
	 * @generated
	 */
	int CONVERTED_FROM_DATA_STANDARD_TYPE = 4;

	/**
	 * The meta object id for the '<em>Instrument Type Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.instrument.remote.control.impl.ControlPackageImpl#getInstrumentTypeNameType()
	 * @generated
	 */
	int INSTRUMENT_TYPE_NAME_TYPE = 5;

	/**
	 * The meta object id for the '<em>Serial Number Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.instrument.remote.control.impl.ControlPackageImpl#getSerialNumberType()
	 * @generated
	 */
	int SERIAL_NUMBER_TYPE = 6;

	/**
	 * The meta object id for the '<em>Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.himsa.instrument.remote.control.impl.ControlPackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 7;


	/**
	 * Returns the meta object for class '{@link com.himsa.instrument.remote.control.BatteryType <em>Battery Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Battery Type</em>'.
	 * @see com.himsa.instrument.remote.control.BatteryType
	 * @generated
	 */
	EClass getBatteryType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.instrument.remote.control.BatteryType#getBatteryTypeCode <em>Battery Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery Type Code</em>'.
	 * @see com.himsa.instrument.remote.control.BatteryType#getBatteryTypeCode()
	 * @see #getBatteryType()
	 * @generated
	 */
	EAttribute getBatteryType_BatteryTypeCode();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.instrument.remote.control.BatteryType#getBatteryTypeText <em>Battery Type Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery Type Text</em>'.
	 * @see com.himsa.instrument.remote.control.BatteryType#getBatteryTypeText()
	 * @see #getBatteryType()
	 * @generated
	 */
	EAttribute getBatteryType_BatteryTypeText();

	/**
	 * Returns the meta object for class '{@link com.himsa.instrument.remote.control.RemoteControlSelectionType <em>Remote Control Selection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Control Selection Type</em>'.
	 * @see com.himsa.instrument.remote.control.RemoteControlSelectionType
	 * @generated
	 */
	EClass getRemoteControlSelectionType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.instrument.remote.control.RemoteControlSelectionType#getInstrumentTypeName <em>Instrument Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instrument Type Name</em>'.
	 * @see com.himsa.instrument.remote.control.RemoteControlSelectionType#getInstrumentTypeName()
	 * @see #getRemoteControlSelectionType()
	 * @generated
	 */
	EAttribute getRemoteControlSelectionType_InstrumentTypeName();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.instrument.remote.control.RemoteControlSelectionType#getSerialNumber <em>Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Number</em>'.
	 * @see com.himsa.instrument.remote.control.RemoteControlSelectionType#getSerialNumber()
	 * @see #getRemoteControlSelectionType()
	 * @generated
	 */
	EAttribute getRemoteControlSelectionType_SerialNumber();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.instrument.remote.control.RemoteControlSelectionType#getBatteryType <em>Battery Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Battery Type</em>'.
	 * @see com.himsa.instrument.remote.control.RemoteControlSelectionType#getBatteryType()
	 * @see #getRemoteControlSelectionType()
	 * @generated
	 */
	EReference getRemoteControlSelectionType_BatteryType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.instrument.remote.control.RemoteControlSelectionType#getReserved <em>Reserved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserved</em>'.
	 * @see com.himsa.instrument.remote.control.RemoteControlSelectionType#getReserved()
	 * @see #getRemoteControlSelectionType()
	 * @generated
	 */
	EAttribute getRemoteControlSelectionType_Reserved();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.instrument.remote.control.RemoteControlSelectionType#getPrivateSelectionData <em>Private Selection Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Selection Data</em>'.
	 * @see com.himsa.instrument.remote.control.RemoteControlSelectionType#getPrivateSelectionData()
	 * @see #getRemoteControlSelectionType()
	 * @generated
	 */
	EAttribute getRemoteControlSelectionType_PrivateSelectionData();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.instrument.remote.control.RemoteControlSelectionType#getConvertedFromDataStandard <em>Converted From Data Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Converted From Data Standard</em>'.
	 * @see com.himsa.instrument.remote.control.RemoteControlSelectionType#getConvertedFromDataStandard()
	 * @see #getRemoteControlSelectionType()
	 * @generated
	 */
	EAttribute getRemoteControlSelectionType_ConvertedFromDataStandard();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.instrument.remote.control.RemoteControlSelectionType#isValidatedByNOAH <em>Validated By NOAH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validated By NOAH</em>'.
	 * @see com.himsa.instrument.remote.control.RemoteControlSelectionType#isValidatedByNOAH()
	 * @see #getRemoteControlSelectionType()
	 * @generated
	 */
	EAttribute getRemoteControlSelectionType_ValidatedByNOAH();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.instrument.remote.control.RemoteControlSelectionType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.himsa.instrument.remote.control.RemoteControlSelectionType#getVersion()
	 * @see #getRemoteControlSelectionType()
	 * @generated
	 */
	EAttribute getRemoteControlSelectionType_Version();

	/**
	 * Returns the meta object for class '{@link com.himsa.instrument.remote.control.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.himsa.instrument.remote.control.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.himsa.instrument.remote.control.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.himsa.instrument.remote.control.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.himsa.instrument.remote.control.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.himsa.instrument.remote.control.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.himsa.instrument.remote.control.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.himsa.instrument.remote.control.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.instrument.remote.control.DocumentRoot#getRemoteControlSelection <em>Remote Control Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remote Control Selection</em>'.
	 * @see com.himsa.instrument.remote.control.DocumentRoot#getRemoteControlSelection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RemoteControlSelection();

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
	ControlFactory getControlFactory();

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
		 * The meta object literal for the '{@link com.himsa.instrument.remote.control.impl.BatteryTypeImpl <em>Battery Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.instrument.remote.control.impl.BatteryTypeImpl
		 * @see com.himsa.instrument.remote.control.impl.ControlPackageImpl#getBatteryType()
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
		 * The meta object literal for the '{@link com.himsa.instrument.remote.control.impl.RemoteControlSelectionTypeImpl <em>Remote Control Selection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.instrument.remote.control.impl.RemoteControlSelectionTypeImpl
		 * @see com.himsa.instrument.remote.control.impl.ControlPackageImpl#getRemoteControlSelectionType()
		 * @generated
		 */
		EClass REMOTE_CONTROL_SELECTION_TYPE = eINSTANCE.getRemoteControlSelectionType();

		/**
		 * The meta object literal for the '<em><b>Instrument Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_CONTROL_SELECTION_TYPE__INSTRUMENT_TYPE_NAME = eINSTANCE.getRemoteControlSelectionType_InstrumentTypeName();

		/**
		 * The meta object literal for the '<em><b>Serial Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_CONTROL_SELECTION_TYPE__SERIAL_NUMBER = eINSTANCE.getRemoteControlSelectionType_SerialNumber();

		/**
		 * The meta object literal for the '<em><b>Battery Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOTE_CONTROL_SELECTION_TYPE__BATTERY_TYPE = eINSTANCE.getRemoteControlSelectionType_BatteryType();

		/**
		 * The meta object literal for the '<em><b>Reserved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_CONTROL_SELECTION_TYPE__RESERVED = eINSTANCE.getRemoteControlSelectionType_Reserved();

		/**
		 * The meta object literal for the '<em><b>Private Selection Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_CONTROL_SELECTION_TYPE__PRIVATE_SELECTION_DATA = eINSTANCE.getRemoteControlSelectionType_PrivateSelectionData();

		/**
		 * The meta object literal for the '<em><b>Converted From Data Standard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_CONTROL_SELECTION_TYPE__CONVERTED_FROM_DATA_STANDARD = eINSTANCE.getRemoteControlSelectionType_ConvertedFromDataStandard();

		/**
		 * The meta object literal for the '<em><b>Validated By NOAH</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_CONTROL_SELECTION_TYPE__VALIDATED_BY_NOAH = eINSTANCE.getRemoteControlSelectionType_ValidatedByNOAH();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_CONTROL_SELECTION_TYPE__VERSION = eINSTANCE.getRemoteControlSelectionType_Version();

		/**
		 * The meta object literal for the '{@link com.himsa.instrument.remote.control.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.instrument.remote.control.impl.DocumentRootImpl
		 * @see com.himsa.instrument.remote.control.impl.ControlPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Remote Control Selection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REMOTE_CONTROL_SELECTION = eINSTANCE.getDocumentRoot_RemoteControlSelection();

		/**
		 * The meta object literal for the '<em>Battery Type Text Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.instrument.remote.control.impl.ControlPackageImpl#getBatteryTypeTextType()
		 * @generated
		 */
		EDataType BATTERY_TYPE_TEXT_TYPE = eINSTANCE.getBatteryTypeTextType();

		/**
		 * The meta object literal for the '<em>Converted From Data Standard Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see com.himsa.instrument.remote.control.impl.ControlPackageImpl#getConvertedFromDataStandardType()
		 * @generated
		 */
		EDataType CONVERTED_FROM_DATA_STANDARD_TYPE = eINSTANCE.getConvertedFromDataStandardType();

		/**
		 * The meta object literal for the '<em>Instrument Type Name Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.instrument.remote.control.impl.ControlPackageImpl#getInstrumentTypeNameType()
		 * @generated
		 */
		EDataType INSTRUMENT_TYPE_NAME_TYPE = eINSTANCE.getInstrumentTypeNameType();

		/**
		 * The meta object literal for the '<em>Serial Number Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.instrument.remote.control.impl.ControlPackageImpl#getSerialNumberType()
		 * @generated
		 */
		EDataType SERIAL_NUMBER_TYPE = eINSTANCE.getSerialNumberType();

		/**
		 * The meta object literal for the '<em>Version Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see com.himsa.instrument.remote.control.impl.ControlPackageImpl#getVersionType()
		 * @generated
		 */
		EDataType VERSION_TYPE = eINSTANCE.getVersionType();

	}

} //ControlPackage
