/*
 */
package com.himsa.measurement.audiogram.metadata._500;


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
 * @see com.himsa.measurement.audiogram.metadata._500._500Factory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = _500Package.eNS_URI, genModel = "/model/PatientExportV5-1.genmodel", genModelSourceLocations = {"model/PatientExportV5-1.genmodel","org.avatar.himsa.model/model/PatientExportV5-1.genmodel"}, ecore="/model/audiogram-metadata.ecore", ecoreSourceLocations="/model/audiogram-metadata.ecore")
public interface _500Package extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "_500";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.himsa.com/Measurement/AudiogramMetadata/500";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "_500";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	_500Package eINSTANCE = com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl.init();

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.metadata._500.impl.AMCLASSTypeImpl <em>AMCLASS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.metadata._500.impl.AMCLASSTypeImpl
	 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getAMCLASSType()
	 * @generated
	 */
	int AMCLASS_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Site Of Lesion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMCLASS_TYPE__SITE_OF_LESION = 0;

	/**
	 * The feature id for the '<em><b>Configuration Severity Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMCLASS_TYPE__CONFIGURATION_SEVERITY_CHOICE = 1;

	/**
	 * The number of structural features of the '<em>AMCLASS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMCLASS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>AMCLASS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMCLASS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.metadata._500.impl.AMCLASSType1Impl <em>AMCLASS Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.metadata._500.impl.AMCLASSType1Impl
	 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getAMCLASSType1()
	 * @generated
	 */
	int AMCLASS_TYPE1 = 1;

	/**
	 * The feature id for the '<em><b>Symmetry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMCLASS_TYPE1__SYMMETRY = 0;

	/**
	 * The feature id for the '<em><b>Right Ear</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMCLASS_TYPE1__RIGHT_EAR = 1;

	/**
	 * The feature id for the '<em><b>Left Ear</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMCLASS_TYPE1__LEFT_EAR = 2;

	/**
	 * The number of structural features of the '<em>AMCLASS Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMCLASS_TYPE1_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>AMCLASS Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMCLASS_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.metadata._500.impl.AudiogramClassificationsTypeImpl <em>Audiogram Classifications Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.metadata._500.impl.AudiogramClassificationsTypeImpl
	 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getAudiogramClassificationsType()
	 * @generated
	 */
	int AUDIOGRAM_CLASSIFICATIONS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>AMCLASS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIOGRAM_CLASSIFICATIONS_TYPE__AMCLASS = 0;

	/**
	 * The feature id for the '<em><b>Non Standardized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIOGRAM_CLASSIFICATIONS_TYPE__NON_STANDARDIZED = 1;

	/**
	 * The number of structural features of the '<em>Audiogram Classifications Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIOGRAM_CLASSIFICATIONS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Audiogram Classifications Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIOGRAM_CLASSIFICATIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.metadata._500.impl.ConfigurationSeverityChoiceTypeImpl <em>Configuration Severity Choice Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.metadata._500.impl.ConfigurationSeverityChoiceTypeImpl
	 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getConfigurationSeverityChoiceType()
	 * @generated
	 */
	int CONFIGURATION_SEVERITY_CHOICE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Normal Hearing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SEVERITY_CHOICE_TYPE__NORMAL_HEARING = 0;

	/**
	 * The feature id for the '<em><b>Flat Hearing Loss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SEVERITY_CHOICE_TYPE__FLAT_HEARING_LOSS = 1;

	/**
	 * The feature id for the '<em><b>Sloping Hearing Loss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SEVERITY_CHOICE_TYPE__SLOPING_HEARING_LOSS = 2;

	/**
	 * The feature id for the '<em><b>Rising Hearing Loss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SEVERITY_CHOICE_TYPE__RISING_HEARING_LOSS = 3;

	/**
	 * The feature id for the '<em><b>Trough Shaped Hearing Loss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SEVERITY_CHOICE_TYPE__TROUGH_SHAPED_HEARING_LOSS = 4;

	/**
	 * The feature id for the '<em><b>Peaked Hearing Loss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SEVERITY_CHOICE_TYPE__PEAKED_HEARING_LOSS = 5;

	/**
	 * The feature id for the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SEVERITY_CHOICE_TYPE__OTHER = 6;

	/**
	 * The number of structural features of the '<em>Configuration Severity Choice Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SEVERITY_CHOICE_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Configuration Severity Choice Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SEVERITY_CHOICE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.metadata._500.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.metadata._500.impl.DocumentRootImpl
	 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 4;

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
	 * The feature id for the '<em><b>HIMSA Audiogram Metadata Standard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HIMSA_AUDIOGRAM_METADATA_STANDARD = 3;

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
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.metadata._500.impl.HIMSAAudiogramMetadataStandardTypeImpl <em>HIMSA Audiogram Metadata Standard Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.metadata._500.impl.HIMSAAudiogramMetadataStandardTypeImpl
	 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getHIMSAAudiogramMetadataStandardType()
	 * @generated
	 */
	int HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Automated Measurement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__AUTOMATED_MEASUREMENT = 0;

	/**
	 * The feature id for the '<em><b>Predicted Accuracies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__PREDICTED_ACCURACIES = 1;

	/**
	 * The feature id for the '<em><b>Audiogram Classifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__AUDIOGRAM_CLASSIFICATIONS = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__VERSION = 3;

	/**
	 * The number of structural features of the '<em>HIMSA Audiogram Metadata Standard Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>HIMSA Audiogram Metadata Standard Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.metadata._500.impl.NonStandardizedTypeImpl <em>Non Standardized Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.metadata._500.impl.NonStandardizedTypeImpl
	 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getNonStandardizedType()
	 * @generated
	 */
	int NON_STANDARDIZED_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Defined Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARDIZED_TYPE__DEFINED_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Custom Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARDIZED_TYPE__CUSTOM_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Non Standardized Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARDIZED_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Non Standardized Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_STANDARDIZED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.metadata._500.impl.PredictedAccuraciesTypeImpl <em>Predicted Accuracies Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.metadata._500.impl.PredictedAccuraciesTypeImpl
	 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getPredictedAccuraciesType()
	 * @generated
	 */
	int PREDICTED_ACCURACIES_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Qualind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTED_ACCURACIES_TYPE__QUALIND = 0;

	/**
	 * The feature id for the '<em><b>Non Standardized</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTED_ACCURACIES_TYPE__NON_STANDARDIZED = 1;

	/**
	 * The number of structural features of the '<em>Predicted Accuracies Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTED_ACCURACIES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Predicted Accuracies Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTED_ACCURACIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.metadata._500.impl.QualindTypeImpl <em>Qualind Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.metadata._500.impl.QualindTypeImpl
	 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getQualindType()
	 * @generated
	 */
	int QUALIND_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Defined Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIND_TYPE__DEFINED_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Disagree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIND_TYPE__DISAGREE = 1;

	/**
	 * The number of structural features of the '<em>Qualind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIND_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Qualind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIND_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.metadata._500.DefinedValueType <em>Defined Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.metadata._500.DefinedValueType
	 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getDefinedValueType()
	 * @generated
	 */
	int DEFINED_VALUE_TYPE = 9;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.metadata._500.DefinedValueType1 <em>Defined Value Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.metadata._500.DefinedValueType1
	 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getDefinedValueType1()
	 * @generated
	 */
	int DEFINED_VALUE_TYPE1 = 10;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.metadata._500.FlatHearingLossType <em>Flat Hearing Loss Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.metadata._500.FlatHearingLossType
	 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getFlatHearingLossType()
	 * @generated
	 */
	int FLAT_HEARING_LOSS_TYPE = 11;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.metadata._500.OtherType <em>Other Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.metadata._500.OtherType
	 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getOtherType()
	 * @generated
	 */
	int OTHER_TYPE = 12;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.metadata._500.PeakedHearingLossType <em>Peaked Hearing Loss Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.metadata._500.PeakedHearingLossType
	 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getPeakedHearingLossType()
	 * @generated
	 */
	int PEAKED_HEARING_LOSS_TYPE = 13;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.metadata._500.RisingHearingLossType <em>Rising Hearing Loss Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.metadata._500.RisingHearingLossType
	 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getRisingHearingLossType()
	 * @generated
	 */
	int RISING_HEARING_LOSS_TYPE = 14;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.metadata._500.SiteOfLesionType <em>Site Of Lesion Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.metadata._500.SiteOfLesionType
	 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getSiteOfLesionType()
	 * @generated
	 */
	int SITE_OF_LESION_TYPE = 15;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.metadata._500.SlopingHearingLossType <em>Sloping Hearing Loss Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.metadata._500.SlopingHearingLossType
	 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getSlopingHearingLossType()
	 * @generated
	 */
	int SLOPING_HEARING_LOSS_TYPE = 16;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.metadata._500.SymmetryType <em>Symmetry Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.metadata._500.SymmetryType
	 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getSymmetryType()
	 * @generated
	 */
	int SYMMETRY_TYPE = 17;

	/**
	 * The meta object id for the '{@link com.himsa.measurement.audiogram.metadata._500.TroughShapedHearingLossType <em>Trough Shaped Hearing Loss Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.metadata._500.TroughShapedHearingLossType
	 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getTroughShapedHearingLossType()
	 * @generated
	 */
	int TROUGH_SHAPED_HEARING_LOSS_TYPE = 18;

	/**
	 * The meta object id for the '<em>Defined Value Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.metadata._500.DefinedValueType
	 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getDefinedValueTypeObject()
	 * @generated
	 */
	int DEFINED_VALUE_TYPE_OBJECT = 19;

	/**
	 * The meta object id for the '<em>Defined Value Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.metadata._500.DefinedValueType1
	 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getDefinedValueTypeObject1()
	 * @generated
	 */
	int DEFINED_VALUE_TYPE_OBJECT1 = 20;

	/**
	 * The meta object id for the '<em>Flat Hearing Loss Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.metadata._500.FlatHearingLossType
	 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getFlatHearingLossTypeObject()
	 * @generated
	 */
	int FLAT_HEARING_LOSS_TYPE_OBJECT = 21;

	/**
	 * The meta object id for the '<em>Other Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.metadata._500.OtherType
	 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getOtherTypeObject()
	 * @generated
	 */
	int OTHER_TYPE_OBJECT = 22;

	/**
	 * The meta object id for the '<em>Peaked Hearing Loss Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.metadata._500.PeakedHearingLossType
	 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getPeakedHearingLossTypeObject()
	 * @generated
	 */
	int PEAKED_HEARING_LOSS_TYPE_OBJECT = 23;

	/**
	 * The meta object id for the '<em>Rising Hearing Loss Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.metadata._500.RisingHearingLossType
	 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getRisingHearingLossTypeObject()
	 * @generated
	 */
	int RISING_HEARING_LOSS_TYPE_OBJECT = 24;

	/**
	 * The meta object id for the '<em>Site Of Lesion Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.metadata._500.SiteOfLesionType
	 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getSiteOfLesionTypeObject()
	 * @generated
	 */
	int SITE_OF_LESION_TYPE_OBJECT = 25;

	/**
	 * The meta object id for the '<em>Sloping Hearing Loss Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.metadata._500.SlopingHearingLossType
	 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getSlopingHearingLossTypeObject()
	 * @generated
	 */
	int SLOPING_HEARING_LOSS_TYPE_OBJECT = 26;

	/**
	 * The meta object id for the '<em>Symmetry Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.metadata._500.SymmetryType
	 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getSymmetryTypeObject()
	 * @generated
	 */
	int SYMMETRY_TYPE_OBJECT = 27;

	/**
	 * The meta object id for the '<em>Trough Shaped Hearing Loss Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.measurement.audiogram.metadata._500.TroughShapedHearingLossType
	 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getTroughShapedHearingLossTypeObject()
	 * @generated
	 */
	int TROUGH_SHAPED_HEARING_LOSS_TYPE_OBJECT = 28;

	/**
	 * The meta object id for the '<em>Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 29;


	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.metadata._500.AMCLASSType <em>AMCLASS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AMCLASS Type</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.AMCLASSType
	 * @generated
	 */
	EClass getAMCLASSType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.metadata._500.AMCLASSType#getSiteOfLesion <em>Site Of Lesion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site Of Lesion</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.AMCLASSType#getSiteOfLesion()
	 * @see #getAMCLASSType()
	 * @generated
	 */
	EAttribute getAMCLASSType_SiteOfLesion();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.audiogram.metadata._500.AMCLASSType#getConfigurationSeverityChoice <em>Configuration Severity Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration Severity Choice</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.AMCLASSType#getConfigurationSeverityChoice()
	 * @see #getAMCLASSType()
	 * @generated
	 */
	EReference getAMCLASSType_ConfigurationSeverityChoice();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.metadata._500.AMCLASSType1 <em>AMCLASS Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AMCLASS Type1</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.AMCLASSType1
	 * @generated
	 */
	EClass getAMCLASSType1();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.metadata._500.AMCLASSType1#getSymmetry <em>Symmetry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symmetry</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.AMCLASSType1#getSymmetry()
	 * @see #getAMCLASSType1()
	 * @generated
	 */
	EAttribute getAMCLASSType1_Symmetry();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.audiogram.metadata._500.AMCLASSType1#getRightEar <em>Right Ear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Ear</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.AMCLASSType1#getRightEar()
	 * @see #getAMCLASSType1()
	 * @generated
	 */
	EReference getAMCLASSType1_RightEar();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.audiogram.metadata._500.AMCLASSType1#getLeftEar <em>Left Ear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Ear</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.AMCLASSType1#getLeftEar()
	 * @see #getAMCLASSType1()
	 * @generated
	 */
	EReference getAMCLASSType1_LeftEar();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.metadata._500.AudiogramClassificationsType <em>Audiogram Classifications Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audiogram Classifications Type</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.AudiogramClassificationsType
	 * @generated
	 */
	EClass getAudiogramClassificationsType();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.audiogram.metadata._500.AudiogramClassificationsType#getAMCLASS <em>AMCLASS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>AMCLASS</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.AudiogramClassificationsType#getAMCLASS()
	 * @see #getAudiogramClassificationsType()
	 * @generated
	 */
	EReference getAudiogramClassificationsType_AMCLASS();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.metadata._500.AudiogramClassificationsType#getNonStandardized <em>Non Standardized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Non Standardized</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.AudiogramClassificationsType#getNonStandardized()
	 * @see #getAudiogramClassificationsType()
	 * @generated
	 */
	EAttribute getAudiogramClassificationsType_NonStandardized();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.metadata._500.ConfigurationSeverityChoiceType <em>Configuration Severity Choice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Severity Choice Type</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.ConfigurationSeverityChoiceType
	 * @generated
	 */
	EClass getConfigurationSeverityChoiceType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.metadata._500.ConfigurationSeverityChoiceType#isNormalHearing <em>Normal Hearing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal Hearing</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.ConfigurationSeverityChoiceType#isNormalHearing()
	 * @see #getConfigurationSeverityChoiceType()
	 * @generated
	 */
	EAttribute getConfigurationSeverityChoiceType_NormalHearing();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.metadata._500.ConfigurationSeverityChoiceType#getFlatHearingLoss <em>Flat Hearing Loss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flat Hearing Loss</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.ConfigurationSeverityChoiceType#getFlatHearingLoss()
	 * @see #getConfigurationSeverityChoiceType()
	 * @generated
	 */
	EAttribute getConfigurationSeverityChoiceType_FlatHearingLoss();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.metadata._500.ConfigurationSeverityChoiceType#getSlopingHearingLoss <em>Sloping Hearing Loss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sloping Hearing Loss</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.ConfigurationSeverityChoiceType#getSlopingHearingLoss()
	 * @see #getConfigurationSeverityChoiceType()
	 * @generated
	 */
	EAttribute getConfigurationSeverityChoiceType_SlopingHearingLoss();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.metadata._500.ConfigurationSeverityChoiceType#getRisingHearingLoss <em>Rising Hearing Loss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rising Hearing Loss</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.ConfigurationSeverityChoiceType#getRisingHearingLoss()
	 * @see #getConfigurationSeverityChoiceType()
	 * @generated
	 */
	EAttribute getConfigurationSeverityChoiceType_RisingHearingLoss();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.metadata._500.ConfigurationSeverityChoiceType#getTroughShapedHearingLoss <em>Trough Shaped Hearing Loss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trough Shaped Hearing Loss</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.ConfigurationSeverityChoiceType#getTroughShapedHearingLoss()
	 * @see #getConfigurationSeverityChoiceType()
	 * @generated
	 */
	EAttribute getConfigurationSeverityChoiceType_TroughShapedHearingLoss();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.metadata._500.ConfigurationSeverityChoiceType#getPeakedHearingLoss <em>Peaked Hearing Loss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peaked Hearing Loss</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.ConfigurationSeverityChoiceType#getPeakedHearingLoss()
	 * @see #getConfigurationSeverityChoiceType()
	 * @generated
	 */
	EAttribute getConfigurationSeverityChoiceType_PeakedHearingLoss();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.metadata._500.ConfigurationSeverityChoiceType#getOther <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.ConfigurationSeverityChoiceType#getOther()
	 * @see #getConfigurationSeverityChoiceType()
	 * @generated
	 */
	EAttribute getConfigurationSeverityChoiceType_Other();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.metadata._500.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.himsa.measurement.audiogram.metadata._500.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.himsa.measurement.audiogram.metadata._500.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.himsa.measurement.audiogram.metadata._500.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.audiogram.metadata._500.DocumentRoot#getHIMSAAudiogramMetadataStandard <em>HIMSA Audiogram Metadata Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>HIMSA Audiogram Metadata Standard</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.DocumentRoot#getHIMSAAudiogramMetadataStandard()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HIMSAAudiogramMetadataStandard();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.metadata._500.HIMSAAudiogramMetadataStandardType <em>HIMSA Audiogram Metadata Standard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HIMSA Audiogram Metadata Standard Type</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.HIMSAAudiogramMetadataStandardType
	 * @generated
	 */
	EClass getHIMSAAudiogramMetadataStandardType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.metadata._500.HIMSAAudiogramMetadataStandardType#isAutomatedMeasurement <em>Automated Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Automated Measurement</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.HIMSAAudiogramMetadataStandardType#isAutomatedMeasurement()
	 * @see #getHIMSAAudiogramMetadataStandardType()
	 * @generated
	 */
	EAttribute getHIMSAAudiogramMetadataStandardType_AutomatedMeasurement();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.audiogram.metadata._500.HIMSAAudiogramMetadataStandardType#getPredictedAccuracies <em>Predicted Accuracies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predicted Accuracies</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.HIMSAAudiogramMetadataStandardType#getPredictedAccuracies()
	 * @see #getHIMSAAudiogramMetadataStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiogramMetadataStandardType_PredictedAccuracies();

	/**
	 * Returns the meta object for the containment reference list '{@link com.himsa.measurement.audiogram.metadata._500.HIMSAAudiogramMetadataStandardType#getAudiogramClassifications <em>Audiogram Classifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Audiogram Classifications</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.HIMSAAudiogramMetadataStandardType#getAudiogramClassifications()
	 * @see #getHIMSAAudiogramMetadataStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiogramMetadataStandardType_AudiogramClassifications();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.metadata._500.HIMSAAudiogramMetadataStandardType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.HIMSAAudiogramMetadataStandardType#getVersion()
	 * @see #getHIMSAAudiogramMetadataStandardType()
	 * @generated
	 */
	EAttribute getHIMSAAudiogramMetadataStandardType_Version();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.metadata._500.NonStandardizedType <em>Non Standardized Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Standardized Type</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.NonStandardizedType
	 * @generated
	 */
	EClass getNonStandardizedType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.metadata._500.NonStandardizedType#getDefinedValue <em>Defined Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Defined Value</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.NonStandardizedType#getDefinedValue()
	 * @see #getNonStandardizedType()
	 * @generated
	 */
	EAttribute getNonStandardizedType_DefinedValue();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.metadata._500.NonStandardizedType#getCustomValue <em>Custom Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Value</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.NonStandardizedType#getCustomValue()
	 * @see #getNonStandardizedType()
	 * @generated
	 */
	EAttribute getNonStandardizedType_CustomValue();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.metadata._500.PredictedAccuraciesType <em>Predicted Accuracies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicted Accuracies Type</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.PredictedAccuraciesType
	 * @generated
	 */
	EClass getPredictedAccuraciesType();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.audiogram.metadata._500.PredictedAccuraciesType#getQualind <em>Qualind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualind</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.PredictedAccuraciesType#getQualind()
	 * @see #getPredictedAccuraciesType()
	 * @generated
	 */
	EReference getPredictedAccuraciesType_Qualind();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.measurement.audiogram.metadata._500.PredictedAccuraciesType#getNonStandardized <em>Non Standardized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Non Standardized</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.PredictedAccuraciesType#getNonStandardized()
	 * @see #getPredictedAccuraciesType()
	 * @generated
	 */
	EReference getPredictedAccuraciesType_NonStandardized();

	/**
	 * Returns the meta object for class '{@link com.himsa.measurement.audiogram.metadata._500.QualindType <em>Qualind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualind Type</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.QualindType
	 * @generated
	 */
	EClass getQualindType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.metadata._500.QualindType#getDefinedValue <em>Defined Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Defined Value</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.QualindType#getDefinedValue()
	 * @see #getQualindType()
	 * @generated
	 */
	EAttribute getQualindType_DefinedValue();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.measurement.audiogram.metadata._500.QualindType#getDisagree <em>Disagree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disagree</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.QualindType#getDisagree()
	 * @see #getQualindType()
	 * @generated
	 */
	EAttribute getQualindType_Disagree();

	/**
	 * Returns the meta object for enum '{@link com.himsa.measurement.audiogram.metadata._500.DefinedValueType <em>Defined Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Defined Value Type</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.DefinedValueType
	 * @generated
	 */
	EEnum getDefinedValueType();

	/**
	 * Returns the meta object for enum '{@link com.himsa.measurement.audiogram.metadata._500.DefinedValueType1 <em>Defined Value Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Defined Value Type1</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.DefinedValueType1
	 * @generated
	 */
	EEnum getDefinedValueType1();

	/**
	 * Returns the meta object for enum '{@link com.himsa.measurement.audiogram.metadata._500.FlatHearingLossType <em>Flat Hearing Loss Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flat Hearing Loss Type</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.FlatHearingLossType
	 * @generated
	 */
	EEnum getFlatHearingLossType();

	/**
	 * Returns the meta object for enum '{@link com.himsa.measurement.audiogram.metadata._500.OtherType <em>Other Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Other Type</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.OtherType
	 * @generated
	 */
	EEnum getOtherType();

	/**
	 * Returns the meta object for enum '{@link com.himsa.measurement.audiogram.metadata._500.PeakedHearingLossType <em>Peaked Hearing Loss Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Peaked Hearing Loss Type</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.PeakedHearingLossType
	 * @generated
	 */
	EEnum getPeakedHearingLossType();

	/**
	 * Returns the meta object for enum '{@link com.himsa.measurement.audiogram.metadata._500.RisingHearingLossType <em>Rising Hearing Loss Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rising Hearing Loss Type</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.RisingHearingLossType
	 * @generated
	 */
	EEnum getRisingHearingLossType();

	/**
	 * Returns the meta object for enum '{@link com.himsa.measurement.audiogram.metadata._500.SiteOfLesionType <em>Site Of Lesion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Site Of Lesion Type</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.SiteOfLesionType
	 * @generated
	 */
	EEnum getSiteOfLesionType();

	/**
	 * Returns the meta object for enum '{@link com.himsa.measurement.audiogram.metadata._500.SlopingHearingLossType <em>Sloping Hearing Loss Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sloping Hearing Loss Type</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.SlopingHearingLossType
	 * @generated
	 */
	EEnum getSlopingHearingLossType();

	/**
	 * Returns the meta object for enum '{@link com.himsa.measurement.audiogram.metadata._500.SymmetryType <em>Symmetry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Symmetry Type</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.SymmetryType
	 * @generated
	 */
	EEnum getSymmetryType();

	/**
	 * Returns the meta object for enum '{@link com.himsa.measurement.audiogram.metadata._500.TroughShapedHearingLossType <em>Trough Shaped Hearing Loss Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trough Shaped Hearing Loss Type</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.TroughShapedHearingLossType
	 * @generated
	 */
	EEnum getTroughShapedHearingLossType();

	/**
	 * Returns the meta object for data type '{@link com.himsa.measurement.audiogram.metadata._500.DefinedValueType <em>Defined Value Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Defined Value Type Object</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.DefinedValueType
	 * @model instanceClass="com.himsa.measurement.audiogram.metadata._500.DefinedValueType"
	 *        extendedMetaData="name='DefinedValue_._type:Object' baseType='DefinedValue_._type'"
	 * @generated
	 */
	EDataType getDefinedValueTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.himsa.measurement.audiogram.metadata._500.DefinedValueType1 <em>Defined Value Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Defined Value Type Object1</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.DefinedValueType1
	 * @model instanceClass="com.himsa.measurement.audiogram.metadata._500.DefinedValueType1"
	 *        extendedMetaData="name='DefinedValue_._1_._type:Object' baseType='DefinedValue_._1_._type'"
	 * @generated
	 */
	EDataType getDefinedValueTypeObject1();

	/**
	 * Returns the meta object for data type '{@link com.himsa.measurement.audiogram.metadata._500.FlatHearingLossType <em>Flat Hearing Loss Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Flat Hearing Loss Type Object</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.FlatHearingLossType
	 * @model instanceClass="com.himsa.measurement.audiogram.metadata._500.FlatHearingLossType"
	 *        extendedMetaData="name='FlatHearingLoss_._type:Object' baseType='FlatHearingLoss_._type'"
	 * @generated
	 */
	EDataType getFlatHearingLossTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.himsa.measurement.audiogram.metadata._500.OtherType <em>Other Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Other Type Object</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.OtherType
	 * @model instanceClass="com.himsa.measurement.audiogram.metadata._500.OtherType"
	 *        extendedMetaData="name='Other_._type:Object' baseType='Other_._type'"
	 * @generated
	 */
	EDataType getOtherTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.himsa.measurement.audiogram.metadata._500.PeakedHearingLossType <em>Peaked Hearing Loss Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Peaked Hearing Loss Type Object</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.PeakedHearingLossType
	 * @model instanceClass="com.himsa.measurement.audiogram.metadata._500.PeakedHearingLossType"
	 *        extendedMetaData="name='PeakedHearingLoss_._type:Object' baseType='PeakedHearingLoss_._type'"
	 * @generated
	 */
	EDataType getPeakedHearingLossTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.himsa.measurement.audiogram.metadata._500.RisingHearingLossType <em>Rising Hearing Loss Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rising Hearing Loss Type Object</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.RisingHearingLossType
	 * @model instanceClass="com.himsa.measurement.audiogram.metadata._500.RisingHearingLossType"
	 *        extendedMetaData="name='RisingHearingLoss_._type:Object' baseType='RisingHearingLoss_._type'"
	 * @generated
	 */
	EDataType getRisingHearingLossTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.himsa.measurement.audiogram.metadata._500.SiteOfLesionType <em>Site Of Lesion Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Site Of Lesion Type Object</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.SiteOfLesionType
	 * @model instanceClass="com.himsa.measurement.audiogram.metadata._500.SiteOfLesionType"
	 *        extendedMetaData="name='SiteOfLesion_._type:Object' baseType='SiteOfLesion_._type'"
	 * @generated
	 */
	EDataType getSiteOfLesionTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.himsa.measurement.audiogram.metadata._500.SlopingHearingLossType <em>Sloping Hearing Loss Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sloping Hearing Loss Type Object</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.SlopingHearingLossType
	 * @model instanceClass="com.himsa.measurement.audiogram.metadata._500.SlopingHearingLossType"
	 *        extendedMetaData="name='SlopingHearingLoss_._type:Object' baseType='SlopingHearingLoss_._type'"
	 * @generated
	 */
	EDataType getSlopingHearingLossTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.himsa.measurement.audiogram.metadata._500.SymmetryType <em>Symmetry Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Symmetry Type Object</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.SymmetryType
	 * @model instanceClass="com.himsa.measurement.audiogram.metadata._500.SymmetryType"
	 *        extendedMetaData="name='Symmetry_._type:Object' baseType='Symmetry_._type'"
	 * @generated
	 */
	EDataType getSymmetryTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.himsa.measurement.audiogram.metadata._500.TroughShapedHearingLossType <em>Trough Shaped Hearing Loss Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Trough Shaped Hearing Loss Type Object</em>'.
	 * @see com.himsa.measurement.audiogram.metadata._500.TroughShapedHearingLossType
	 * @model instanceClass="com.himsa.measurement.audiogram.metadata._500.TroughShapedHearingLossType"
	 *        extendedMetaData="name='TroughShapedHearingLoss_._type:Object' baseType='TroughShapedHearingLoss_._type'"
	 * @generated
	 */
	EDataType getTroughShapedHearingLossTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='Version_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minInclusive='500'"
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
	_500Factory get_500Factory();

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
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.metadata._500.impl.AMCLASSTypeImpl <em>AMCLASS Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.metadata._500.impl.AMCLASSTypeImpl
		 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getAMCLASSType()
		 * @generated
		 */
		EClass AMCLASS_TYPE = eINSTANCE.getAMCLASSType();

		/**
		 * The meta object literal for the '<em><b>Site Of Lesion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMCLASS_TYPE__SITE_OF_LESION = eINSTANCE.getAMCLASSType_SiteOfLesion();

		/**
		 * The meta object literal for the '<em><b>Configuration Severity Choice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMCLASS_TYPE__CONFIGURATION_SEVERITY_CHOICE = eINSTANCE.getAMCLASSType_ConfigurationSeverityChoice();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.metadata._500.impl.AMCLASSType1Impl <em>AMCLASS Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.metadata._500.impl.AMCLASSType1Impl
		 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getAMCLASSType1()
		 * @generated
		 */
		EClass AMCLASS_TYPE1 = eINSTANCE.getAMCLASSType1();

		/**
		 * The meta object literal for the '<em><b>Symmetry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMCLASS_TYPE1__SYMMETRY = eINSTANCE.getAMCLASSType1_Symmetry();

		/**
		 * The meta object literal for the '<em><b>Right Ear</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMCLASS_TYPE1__RIGHT_EAR = eINSTANCE.getAMCLASSType1_RightEar();

		/**
		 * The meta object literal for the '<em><b>Left Ear</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMCLASS_TYPE1__LEFT_EAR = eINSTANCE.getAMCLASSType1_LeftEar();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.metadata._500.impl.AudiogramClassificationsTypeImpl <em>Audiogram Classifications Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.metadata._500.impl.AudiogramClassificationsTypeImpl
		 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getAudiogramClassificationsType()
		 * @generated
		 */
		EClass AUDIOGRAM_CLASSIFICATIONS_TYPE = eINSTANCE.getAudiogramClassificationsType();

		/**
		 * The meta object literal for the '<em><b>AMCLASS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIOGRAM_CLASSIFICATIONS_TYPE__AMCLASS = eINSTANCE.getAudiogramClassificationsType_AMCLASS();

		/**
		 * The meta object literal for the '<em><b>Non Standardized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIOGRAM_CLASSIFICATIONS_TYPE__NON_STANDARDIZED = eINSTANCE.getAudiogramClassificationsType_NonStandardized();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.metadata._500.impl.ConfigurationSeverityChoiceTypeImpl <em>Configuration Severity Choice Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.metadata._500.impl.ConfigurationSeverityChoiceTypeImpl
		 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getConfigurationSeverityChoiceType()
		 * @generated
		 */
		EClass CONFIGURATION_SEVERITY_CHOICE_TYPE = eINSTANCE.getConfigurationSeverityChoiceType();

		/**
		 * The meta object literal for the '<em><b>Normal Hearing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_SEVERITY_CHOICE_TYPE__NORMAL_HEARING = eINSTANCE.getConfigurationSeverityChoiceType_NormalHearing();

		/**
		 * The meta object literal for the '<em><b>Flat Hearing Loss</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_SEVERITY_CHOICE_TYPE__FLAT_HEARING_LOSS = eINSTANCE.getConfigurationSeverityChoiceType_FlatHearingLoss();

		/**
		 * The meta object literal for the '<em><b>Sloping Hearing Loss</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_SEVERITY_CHOICE_TYPE__SLOPING_HEARING_LOSS = eINSTANCE.getConfigurationSeverityChoiceType_SlopingHearingLoss();

		/**
		 * The meta object literal for the '<em><b>Rising Hearing Loss</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_SEVERITY_CHOICE_TYPE__RISING_HEARING_LOSS = eINSTANCE.getConfigurationSeverityChoiceType_RisingHearingLoss();

		/**
		 * The meta object literal for the '<em><b>Trough Shaped Hearing Loss</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_SEVERITY_CHOICE_TYPE__TROUGH_SHAPED_HEARING_LOSS = eINSTANCE.getConfigurationSeverityChoiceType_TroughShapedHearingLoss();

		/**
		 * The meta object literal for the '<em><b>Peaked Hearing Loss</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_SEVERITY_CHOICE_TYPE__PEAKED_HEARING_LOSS = eINSTANCE.getConfigurationSeverityChoiceType_PeakedHearingLoss();

		/**
		 * The meta object literal for the '<em><b>Other</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_SEVERITY_CHOICE_TYPE__OTHER = eINSTANCE.getConfigurationSeverityChoiceType_Other();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.metadata._500.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.metadata._500.impl.DocumentRootImpl
		 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>HIMSA Audiogram Metadata Standard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HIMSA_AUDIOGRAM_METADATA_STANDARD = eINSTANCE.getDocumentRoot_HIMSAAudiogramMetadataStandard();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.metadata._500.impl.HIMSAAudiogramMetadataStandardTypeImpl <em>HIMSA Audiogram Metadata Standard Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.metadata._500.impl.HIMSAAudiogramMetadataStandardTypeImpl
		 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getHIMSAAudiogramMetadataStandardType()
		 * @generated
		 */
		EClass HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE = eINSTANCE.getHIMSAAudiogramMetadataStandardType();

		/**
		 * The meta object literal for the '<em><b>Automated Measurement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__AUTOMATED_MEASUREMENT = eINSTANCE.getHIMSAAudiogramMetadataStandardType_AutomatedMeasurement();

		/**
		 * The meta object literal for the '<em><b>Predicted Accuracies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__PREDICTED_ACCURACIES = eINSTANCE.getHIMSAAudiogramMetadataStandardType_PredictedAccuracies();

		/**
		 * The meta object literal for the '<em><b>Audiogram Classifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__AUDIOGRAM_CLASSIFICATIONS = eINSTANCE.getHIMSAAudiogramMetadataStandardType_AudiogramClassifications();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__VERSION = eINSTANCE.getHIMSAAudiogramMetadataStandardType_Version();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.metadata._500.impl.NonStandardizedTypeImpl <em>Non Standardized Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.metadata._500.impl.NonStandardizedTypeImpl
		 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getNonStandardizedType()
		 * @generated
		 */
		EClass NON_STANDARDIZED_TYPE = eINSTANCE.getNonStandardizedType();

		/**
		 * The meta object literal for the '<em><b>Defined Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_STANDARDIZED_TYPE__DEFINED_VALUE = eINSTANCE.getNonStandardizedType_DefinedValue();

		/**
		 * The meta object literal for the '<em><b>Custom Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_STANDARDIZED_TYPE__CUSTOM_VALUE = eINSTANCE.getNonStandardizedType_CustomValue();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.metadata._500.impl.PredictedAccuraciesTypeImpl <em>Predicted Accuracies Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.metadata._500.impl.PredictedAccuraciesTypeImpl
		 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getPredictedAccuraciesType()
		 * @generated
		 */
		EClass PREDICTED_ACCURACIES_TYPE = eINSTANCE.getPredictedAccuraciesType();

		/**
		 * The meta object literal for the '<em><b>Qualind</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICTED_ACCURACIES_TYPE__QUALIND = eINSTANCE.getPredictedAccuraciesType_Qualind();

		/**
		 * The meta object literal for the '<em><b>Non Standardized</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICTED_ACCURACIES_TYPE__NON_STANDARDIZED = eINSTANCE.getPredictedAccuraciesType_NonStandardized();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.metadata._500.impl.QualindTypeImpl <em>Qualind Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.metadata._500.impl.QualindTypeImpl
		 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getQualindType()
		 * @generated
		 */
		EClass QUALIND_TYPE = eINSTANCE.getQualindType();

		/**
		 * The meta object literal for the '<em><b>Defined Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIND_TYPE__DEFINED_VALUE = eINSTANCE.getQualindType_DefinedValue();

		/**
		 * The meta object literal for the '<em><b>Disagree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIND_TYPE__DISAGREE = eINSTANCE.getQualindType_Disagree();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.metadata._500.DefinedValueType <em>Defined Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.metadata._500.DefinedValueType
		 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getDefinedValueType()
		 * @generated
		 */
		EEnum DEFINED_VALUE_TYPE = eINSTANCE.getDefinedValueType();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.metadata._500.DefinedValueType1 <em>Defined Value Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.metadata._500.DefinedValueType1
		 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getDefinedValueType1()
		 * @generated
		 */
		EEnum DEFINED_VALUE_TYPE1 = eINSTANCE.getDefinedValueType1();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.metadata._500.FlatHearingLossType <em>Flat Hearing Loss Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.metadata._500.FlatHearingLossType
		 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getFlatHearingLossType()
		 * @generated
		 */
		EEnum FLAT_HEARING_LOSS_TYPE = eINSTANCE.getFlatHearingLossType();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.metadata._500.OtherType <em>Other Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.metadata._500.OtherType
		 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getOtherType()
		 * @generated
		 */
		EEnum OTHER_TYPE = eINSTANCE.getOtherType();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.metadata._500.PeakedHearingLossType <em>Peaked Hearing Loss Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.metadata._500.PeakedHearingLossType
		 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getPeakedHearingLossType()
		 * @generated
		 */
		EEnum PEAKED_HEARING_LOSS_TYPE = eINSTANCE.getPeakedHearingLossType();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.metadata._500.RisingHearingLossType <em>Rising Hearing Loss Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.metadata._500.RisingHearingLossType
		 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getRisingHearingLossType()
		 * @generated
		 */
		EEnum RISING_HEARING_LOSS_TYPE = eINSTANCE.getRisingHearingLossType();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.metadata._500.SiteOfLesionType <em>Site Of Lesion Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.metadata._500.SiteOfLesionType
		 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getSiteOfLesionType()
		 * @generated
		 */
		EEnum SITE_OF_LESION_TYPE = eINSTANCE.getSiteOfLesionType();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.metadata._500.SlopingHearingLossType <em>Sloping Hearing Loss Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.metadata._500.SlopingHearingLossType
		 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getSlopingHearingLossType()
		 * @generated
		 */
		EEnum SLOPING_HEARING_LOSS_TYPE = eINSTANCE.getSlopingHearingLossType();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.metadata._500.SymmetryType <em>Symmetry Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.metadata._500.SymmetryType
		 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getSymmetryType()
		 * @generated
		 */
		EEnum SYMMETRY_TYPE = eINSTANCE.getSymmetryType();

		/**
		 * The meta object literal for the '{@link com.himsa.measurement.audiogram.metadata._500.TroughShapedHearingLossType <em>Trough Shaped Hearing Loss Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.metadata._500.TroughShapedHearingLossType
		 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getTroughShapedHearingLossType()
		 * @generated
		 */
		EEnum TROUGH_SHAPED_HEARING_LOSS_TYPE = eINSTANCE.getTroughShapedHearingLossType();

		/**
		 * The meta object literal for the '<em>Defined Value Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.metadata._500.DefinedValueType
		 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getDefinedValueTypeObject()
		 * @generated
		 */
		EDataType DEFINED_VALUE_TYPE_OBJECT = eINSTANCE.getDefinedValueTypeObject();

		/**
		 * The meta object literal for the '<em>Defined Value Type Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.metadata._500.DefinedValueType1
		 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getDefinedValueTypeObject1()
		 * @generated
		 */
		EDataType DEFINED_VALUE_TYPE_OBJECT1 = eINSTANCE.getDefinedValueTypeObject1();

		/**
		 * The meta object literal for the '<em>Flat Hearing Loss Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.metadata._500.FlatHearingLossType
		 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getFlatHearingLossTypeObject()
		 * @generated
		 */
		EDataType FLAT_HEARING_LOSS_TYPE_OBJECT = eINSTANCE.getFlatHearingLossTypeObject();

		/**
		 * The meta object literal for the '<em>Other Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.metadata._500.OtherType
		 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getOtherTypeObject()
		 * @generated
		 */
		EDataType OTHER_TYPE_OBJECT = eINSTANCE.getOtherTypeObject();

		/**
		 * The meta object literal for the '<em>Peaked Hearing Loss Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.metadata._500.PeakedHearingLossType
		 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getPeakedHearingLossTypeObject()
		 * @generated
		 */
		EDataType PEAKED_HEARING_LOSS_TYPE_OBJECT = eINSTANCE.getPeakedHearingLossTypeObject();

		/**
		 * The meta object literal for the '<em>Rising Hearing Loss Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.metadata._500.RisingHearingLossType
		 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getRisingHearingLossTypeObject()
		 * @generated
		 */
		EDataType RISING_HEARING_LOSS_TYPE_OBJECT = eINSTANCE.getRisingHearingLossTypeObject();

		/**
		 * The meta object literal for the '<em>Site Of Lesion Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.metadata._500.SiteOfLesionType
		 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getSiteOfLesionTypeObject()
		 * @generated
		 */
		EDataType SITE_OF_LESION_TYPE_OBJECT = eINSTANCE.getSiteOfLesionTypeObject();

		/**
		 * The meta object literal for the '<em>Sloping Hearing Loss Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.metadata._500.SlopingHearingLossType
		 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getSlopingHearingLossTypeObject()
		 * @generated
		 */
		EDataType SLOPING_HEARING_LOSS_TYPE_OBJECT = eINSTANCE.getSlopingHearingLossTypeObject();

		/**
		 * The meta object literal for the '<em>Symmetry Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.metadata._500.SymmetryType
		 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getSymmetryTypeObject()
		 * @generated
		 */
		EDataType SYMMETRY_TYPE_OBJECT = eINSTANCE.getSymmetryTypeObject();

		/**
		 * The meta object literal for the '<em>Trough Shaped Hearing Loss Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.measurement.audiogram.metadata._500.TroughShapedHearingLossType
		 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getTroughShapedHearingLossTypeObject()
		 * @generated
		 */
		EDataType TROUGH_SHAPED_HEARING_LOSS_TYPE_OBJECT = eINSTANCE.getTroughShapedHearingLossTypeObject();

		/**
		 * The meta object literal for the '<em>Version Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see com.himsa.measurement.audiogram.metadata._500.impl._500PackageImpl#getVersionType()
		 * @generated
		 */
		EDataType VERSION_TYPE = eINSTANCE.getVersionType();

	}

} //_500Package
