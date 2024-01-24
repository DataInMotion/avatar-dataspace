/*
 */
package audiogrammetadata;


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
 * @see audiogrammetadata.AudiogrammetadataFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = AudiogrammetadataPackage.eNS_URI, genModel = "/model/patient-export-5.1.genmodel", genModelSourceLocations = {"model/patient-export-5.1.genmodel","org.avatar.himsa.model/model/patient-export-5.1.genmodel"}, ecore="/model/audiogram-metadata.ecore", ecoreSourceLocations="/model/audiogram-metadata.ecore")
public interface AudiogrammetadataPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "audiogrammetadata";

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
	String eNS_PREFIX = "agmeta";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AudiogrammetadataPackage eINSTANCE = audiogrammetadata.impl.AudiogrammetadataPackageImpl.init();

	/**
	 * The meta object id for the '{@link audiogrammetadata.impl.AMCLASSTypeImpl <em>AMCLASS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogrammetadata.impl.AMCLASSTypeImpl
	 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getAMCLASSType()
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
	 * The meta object id for the '{@link audiogrammetadata.impl.AMCLASSType1Impl <em>AMCLASS Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogrammetadata.impl.AMCLASSType1Impl
	 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getAMCLASSType1()
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
	 * The meta object id for the '{@link audiogrammetadata.impl.AudiogramClassificationsTypeImpl <em>Audiogram Classifications Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogrammetadata.impl.AudiogramClassificationsTypeImpl
	 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getAudiogramClassificationsType()
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
	 * The meta object id for the '{@link audiogrammetadata.impl.ConfigurationSeverityChoiceTypeImpl <em>Configuration Severity Choice Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogrammetadata.impl.ConfigurationSeverityChoiceTypeImpl
	 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getConfigurationSeverityChoiceType()
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
	 * The meta object id for the '{@link audiogrammetadata.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogrammetadata.impl.DocumentRootImpl
	 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getDocumentRoot()
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
	 * The meta object id for the '{@link audiogrammetadata.impl.HIMSAAudiogramMetadataStandardTypeImpl <em>HIMSA Audiogram Metadata Standard Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogrammetadata.impl.HIMSAAudiogramMetadataStandardTypeImpl
	 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getHIMSAAudiogramMetadataStandardType()
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
	 * The meta object id for the '{@link audiogrammetadata.impl.NonStandardizedTypeImpl <em>Non Standardized Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogrammetadata.impl.NonStandardizedTypeImpl
	 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getNonStandardizedType()
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
	 * The meta object id for the '{@link audiogrammetadata.impl.PredictedAccuraciesTypeImpl <em>Predicted Accuracies Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogrammetadata.impl.PredictedAccuraciesTypeImpl
	 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getPredictedAccuraciesType()
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
	 * The meta object id for the '{@link audiogrammetadata.impl.QualindTypeImpl <em>Qualind Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogrammetadata.impl.QualindTypeImpl
	 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getQualindType()
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
	 * The meta object id for the '{@link audiogrammetadata.DefinedValueType <em>Defined Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogrammetadata.DefinedValueType
	 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getDefinedValueType()
	 * @generated
	 */
	int DEFINED_VALUE_TYPE = 9;

	/**
	 * The meta object id for the '{@link audiogrammetadata.DefinedValueType1 <em>Defined Value Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogrammetadata.DefinedValueType1
	 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getDefinedValueType1()
	 * @generated
	 */
	int DEFINED_VALUE_TYPE1 = 10;

	/**
	 * The meta object id for the '{@link audiogrammetadata.FlatHearingLossType <em>Flat Hearing Loss Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogrammetadata.FlatHearingLossType
	 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getFlatHearingLossType()
	 * @generated
	 */
	int FLAT_HEARING_LOSS_TYPE = 11;

	/**
	 * The meta object id for the '{@link audiogrammetadata.OtherType <em>Other Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogrammetadata.OtherType
	 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getOtherType()
	 * @generated
	 */
	int OTHER_TYPE = 12;

	/**
	 * The meta object id for the '{@link audiogrammetadata.PeakedHearingLossType <em>Peaked Hearing Loss Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogrammetadata.PeakedHearingLossType
	 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getPeakedHearingLossType()
	 * @generated
	 */
	int PEAKED_HEARING_LOSS_TYPE = 13;

	/**
	 * The meta object id for the '{@link audiogrammetadata.RisingHearingLossType <em>Rising Hearing Loss Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogrammetadata.RisingHearingLossType
	 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getRisingHearingLossType()
	 * @generated
	 */
	int RISING_HEARING_LOSS_TYPE = 14;

	/**
	 * The meta object id for the '{@link audiogrammetadata.SiteOfLesionType <em>Site Of Lesion Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogrammetadata.SiteOfLesionType
	 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getSiteOfLesionType()
	 * @generated
	 */
	int SITE_OF_LESION_TYPE = 15;

	/**
	 * The meta object id for the '{@link audiogrammetadata.SlopingHearingLossType <em>Sloping Hearing Loss Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogrammetadata.SlopingHearingLossType
	 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getSlopingHearingLossType()
	 * @generated
	 */
	int SLOPING_HEARING_LOSS_TYPE = 16;

	/**
	 * The meta object id for the '{@link audiogrammetadata.SymmetryType <em>Symmetry Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogrammetadata.SymmetryType
	 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getSymmetryType()
	 * @generated
	 */
	int SYMMETRY_TYPE = 17;

	/**
	 * The meta object id for the '{@link audiogrammetadata.TroughShapedHearingLossType <em>Trough Shaped Hearing Loss Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogrammetadata.TroughShapedHearingLossType
	 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getTroughShapedHearingLossType()
	 * @generated
	 */
	int TROUGH_SHAPED_HEARING_LOSS_TYPE = 18;

	/**
	 * The meta object id for the '<em>Defined Value Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogrammetadata.DefinedValueType
	 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getDefinedValueTypeObject()
	 * @generated
	 */
	int DEFINED_VALUE_TYPE_OBJECT = 19;

	/**
	 * The meta object id for the '<em>Defined Value Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogrammetadata.DefinedValueType1
	 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getDefinedValueTypeObject1()
	 * @generated
	 */
	int DEFINED_VALUE_TYPE_OBJECT1 = 20;

	/**
	 * The meta object id for the '<em>Flat Hearing Loss Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogrammetadata.FlatHearingLossType
	 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getFlatHearingLossTypeObject()
	 * @generated
	 */
	int FLAT_HEARING_LOSS_TYPE_OBJECT = 21;

	/**
	 * The meta object id for the '<em>Other Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogrammetadata.OtherType
	 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getOtherTypeObject()
	 * @generated
	 */
	int OTHER_TYPE_OBJECT = 22;

	/**
	 * The meta object id for the '<em>Peaked Hearing Loss Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogrammetadata.PeakedHearingLossType
	 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getPeakedHearingLossTypeObject()
	 * @generated
	 */
	int PEAKED_HEARING_LOSS_TYPE_OBJECT = 23;

	/**
	 * The meta object id for the '<em>Rising Hearing Loss Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogrammetadata.RisingHearingLossType
	 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getRisingHearingLossTypeObject()
	 * @generated
	 */
	int RISING_HEARING_LOSS_TYPE_OBJECT = 24;

	/**
	 * The meta object id for the '<em>Site Of Lesion Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogrammetadata.SiteOfLesionType
	 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getSiteOfLesionTypeObject()
	 * @generated
	 */
	int SITE_OF_LESION_TYPE_OBJECT = 25;

	/**
	 * The meta object id for the '<em>Sloping Hearing Loss Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogrammetadata.SlopingHearingLossType
	 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getSlopingHearingLossTypeObject()
	 * @generated
	 */
	int SLOPING_HEARING_LOSS_TYPE_OBJECT = 26;

	/**
	 * The meta object id for the '<em>Symmetry Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogrammetadata.SymmetryType
	 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getSymmetryTypeObject()
	 * @generated
	 */
	int SYMMETRY_TYPE_OBJECT = 27;

	/**
	 * The meta object id for the '<em>Trough Shaped Hearing Loss Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see audiogrammetadata.TroughShapedHearingLossType
	 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getTroughShapedHearingLossTypeObject()
	 * @generated
	 */
	int TROUGH_SHAPED_HEARING_LOSS_TYPE_OBJECT = 28;

	/**
	 * The meta object id for the '<em>Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 29;


	/**
	 * Returns the meta object for class '{@link audiogrammetadata.AMCLASSType <em>AMCLASS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AMCLASS Type</em>'.
	 * @see audiogrammetadata.AMCLASSType
	 * @generated
	 */
	EClass getAMCLASSType();

	/**
	 * Returns the meta object for the attribute '{@link audiogrammetadata.AMCLASSType#getSiteOfLesion <em>Site Of Lesion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site Of Lesion</em>'.
	 * @see audiogrammetadata.AMCLASSType#getSiteOfLesion()
	 * @see #getAMCLASSType()
	 * @generated
	 */
	EAttribute getAMCLASSType_SiteOfLesion();

	/**
	 * Returns the meta object for the containment reference '{@link audiogrammetadata.AMCLASSType#getConfigurationSeverityChoice <em>Configuration Severity Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration Severity Choice</em>'.
	 * @see audiogrammetadata.AMCLASSType#getConfigurationSeverityChoice()
	 * @see #getAMCLASSType()
	 * @generated
	 */
	EReference getAMCLASSType_ConfigurationSeverityChoice();

	/**
	 * Returns the meta object for class '{@link audiogrammetadata.AMCLASSType1 <em>AMCLASS Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AMCLASS Type1</em>'.
	 * @see audiogrammetadata.AMCLASSType1
	 * @generated
	 */
	EClass getAMCLASSType1();

	/**
	 * Returns the meta object for the attribute '{@link audiogrammetadata.AMCLASSType1#getSymmetry <em>Symmetry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symmetry</em>'.
	 * @see audiogrammetadata.AMCLASSType1#getSymmetry()
	 * @see #getAMCLASSType1()
	 * @generated
	 */
	EAttribute getAMCLASSType1_Symmetry();

	/**
	 * Returns the meta object for the containment reference '{@link audiogrammetadata.AMCLASSType1#getRightEar <em>Right Ear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Ear</em>'.
	 * @see audiogrammetadata.AMCLASSType1#getRightEar()
	 * @see #getAMCLASSType1()
	 * @generated
	 */
	EReference getAMCLASSType1_RightEar();

	/**
	 * Returns the meta object for the containment reference '{@link audiogrammetadata.AMCLASSType1#getLeftEar <em>Left Ear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Ear</em>'.
	 * @see audiogrammetadata.AMCLASSType1#getLeftEar()
	 * @see #getAMCLASSType1()
	 * @generated
	 */
	EReference getAMCLASSType1_LeftEar();

	/**
	 * Returns the meta object for class '{@link audiogrammetadata.AudiogramClassificationsType <em>Audiogram Classifications Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audiogram Classifications Type</em>'.
	 * @see audiogrammetadata.AudiogramClassificationsType
	 * @generated
	 */
	EClass getAudiogramClassificationsType();

	/**
	 * Returns the meta object for the containment reference '{@link audiogrammetadata.AudiogramClassificationsType#getAMCLASS <em>AMCLASS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>AMCLASS</em>'.
	 * @see audiogrammetadata.AudiogramClassificationsType#getAMCLASS()
	 * @see #getAudiogramClassificationsType()
	 * @generated
	 */
	EReference getAudiogramClassificationsType_AMCLASS();

	/**
	 * Returns the meta object for the attribute '{@link audiogrammetadata.AudiogramClassificationsType#getNonStandardized <em>Non Standardized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Non Standardized</em>'.
	 * @see audiogrammetadata.AudiogramClassificationsType#getNonStandardized()
	 * @see #getAudiogramClassificationsType()
	 * @generated
	 */
	EAttribute getAudiogramClassificationsType_NonStandardized();

	/**
	 * Returns the meta object for class '{@link audiogrammetadata.ConfigurationSeverityChoiceType <em>Configuration Severity Choice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Severity Choice Type</em>'.
	 * @see audiogrammetadata.ConfigurationSeverityChoiceType
	 * @generated
	 */
	EClass getConfigurationSeverityChoiceType();

	/**
	 * Returns the meta object for the attribute '{@link audiogrammetadata.ConfigurationSeverityChoiceType#isNormalHearing <em>Normal Hearing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal Hearing</em>'.
	 * @see audiogrammetadata.ConfigurationSeverityChoiceType#isNormalHearing()
	 * @see #getConfigurationSeverityChoiceType()
	 * @generated
	 */
	EAttribute getConfigurationSeverityChoiceType_NormalHearing();

	/**
	 * Returns the meta object for the attribute '{@link audiogrammetadata.ConfigurationSeverityChoiceType#getFlatHearingLoss <em>Flat Hearing Loss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flat Hearing Loss</em>'.
	 * @see audiogrammetadata.ConfigurationSeverityChoiceType#getFlatHearingLoss()
	 * @see #getConfigurationSeverityChoiceType()
	 * @generated
	 */
	EAttribute getConfigurationSeverityChoiceType_FlatHearingLoss();

	/**
	 * Returns the meta object for the attribute '{@link audiogrammetadata.ConfigurationSeverityChoiceType#getSlopingHearingLoss <em>Sloping Hearing Loss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sloping Hearing Loss</em>'.
	 * @see audiogrammetadata.ConfigurationSeverityChoiceType#getSlopingHearingLoss()
	 * @see #getConfigurationSeverityChoiceType()
	 * @generated
	 */
	EAttribute getConfigurationSeverityChoiceType_SlopingHearingLoss();

	/**
	 * Returns the meta object for the attribute '{@link audiogrammetadata.ConfigurationSeverityChoiceType#getRisingHearingLoss <em>Rising Hearing Loss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rising Hearing Loss</em>'.
	 * @see audiogrammetadata.ConfigurationSeverityChoiceType#getRisingHearingLoss()
	 * @see #getConfigurationSeverityChoiceType()
	 * @generated
	 */
	EAttribute getConfigurationSeverityChoiceType_RisingHearingLoss();

	/**
	 * Returns the meta object for the attribute '{@link audiogrammetadata.ConfigurationSeverityChoiceType#getTroughShapedHearingLoss <em>Trough Shaped Hearing Loss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trough Shaped Hearing Loss</em>'.
	 * @see audiogrammetadata.ConfigurationSeverityChoiceType#getTroughShapedHearingLoss()
	 * @see #getConfigurationSeverityChoiceType()
	 * @generated
	 */
	EAttribute getConfigurationSeverityChoiceType_TroughShapedHearingLoss();

	/**
	 * Returns the meta object for the attribute '{@link audiogrammetadata.ConfigurationSeverityChoiceType#getPeakedHearingLoss <em>Peaked Hearing Loss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peaked Hearing Loss</em>'.
	 * @see audiogrammetadata.ConfigurationSeverityChoiceType#getPeakedHearingLoss()
	 * @see #getConfigurationSeverityChoiceType()
	 * @generated
	 */
	EAttribute getConfigurationSeverityChoiceType_PeakedHearingLoss();

	/**
	 * Returns the meta object for the attribute '{@link audiogrammetadata.ConfigurationSeverityChoiceType#getOther <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other</em>'.
	 * @see audiogrammetadata.ConfigurationSeverityChoiceType#getOther()
	 * @see #getConfigurationSeverityChoiceType()
	 * @generated
	 */
	EAttribute getConfigurationSeverityChoiceType_Other();

	/**
	 * Returns the meta object for class '{@link audiogrammetadata.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see audiogrammetadata.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link audiogrammetadata.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see audiogrammetadata.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link audiogrammetadata.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see audiogrammetadata.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link audiogrammetadata.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see audiogrammetadata.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link audiogrammetadata.DocumentRoot#getHIMSAAudiogramMetadataStandard <em>HIMSA Audiogram Metadata Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>HIMSA Audiogram Metadata Standard</em>'.
	 * @see audiogrammetadata.DocumentRoot#getHIMSAAudiogramMetadataStandard()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HIMSAAudiogramMetadataStandard();

	/**
	 * Returns the meta object for class '{@link audiogrammetadata.HIMSAAudiogramMetadataStandardType <em>HIMSA Audiogram Metadata Standard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HIMSA Audiogram Metadata Standard Type</em>'.
	 * @see audiogrammetadata.HIMSAAudiogramMetadataStandardType
	 * @generated
	 */
	EClass getHIMSAAudiogramMetadataStandardType();

	/**
	 * Returns the meta object for the attribute '{@link audiogrammetadata.HIMSAAudiogramMetadataStandardType#isAutomatedMeasurement <em>Automated Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Automated Measurement</em>'.
	 * @see audiogrammetadata.HIMSAAudiogramMetadataStandardType#isAutomatedMeasurement()
	 * @see #getHIMSAAudiogramMetadataStandardType()
	 * @generated
	 */
	EAttribute getHIMSAAudiogramMetadataStandardType_AutomatedMeasurement();

	/**
	 * Returns the meta object for the containment reference list '{@link audiogrammetadata.HIMSAAudiogramMetadataStandardType#getPredictedAccuracies <em>Predicted Accuracies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predicted Accuracies</em>'.
	 * @see audiogrammetadata.HIMSAAudiogramMetadataStandardType#getPredictedAccuracies()
	 * @see #getHIMSAAudiogramMetadataStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiogramMetadataStandardType_PredictedAccuracies();

	/**
	 * Returns the meta object for the containment reference list '{@link audiogrammetadata.HIMSAAudiogramMetadataStandardType#getAudiogramClassifications <em>Audiogram Classifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Audiogram Classifications</em>'.
	 * @see audiogrammetadata.HIMSAAudiogramMetadataStandardType#getAudiogramClassifications()
	 * @see #getHIMSAAudiogramMetadataStandardType()
	 * @generated
	 */
	EReference getHIMSAAudiogramMetadataStandardType_AudiogramClassifications();

	/**
	 * Returns the meta object for the attribute '{@link audiogrammetadata.HIMSAAudiogramMetadataStandardType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see audiogrammetadata.HIMSAAudiogramMetadataStandardType#getVersion()
	 * @see #getHIMSAAudiogramMetadataStandardType()
	 * @generated
	 */
	EAttribute getHIMSAAudiogramMetadataStandardType_Version();

	/**
	 * Returns the meta object for class '{@link audiogrammetadata.NonStandardizedType <em>Non Standardized Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Standardized Type</em>'.
	 * @see audiogrammetadata.NonStandardizedType
	 * @generated
	 */
	EClass getNonStandardizedType();

	/**
	 * Returns the meta object for the attribute '{@link audiogrammetadata.NonStandardizedType#getDefinedValue <em>Defined Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Defined Value</em>'.
	 * @see audiogrammetadata.NonStandardizedType#getDefinedValue()
	 * @see #getNonStandardizedType()
	 * @generated
	 */
	EAttribute getNonStandardizedType_DefinedValue();

	/**
	 * Returns the meta object for the attribute '{@link audiogrammetadata.NonStandardizedType#getCustomValue <em>Custom Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Value</em>'.
	 * @see audiogrammetadata.NonStandardizedType#getCustomValue()
	 * @see #getNonStandardizedType()
	 * @generated
	 */
	EAttribute getNonStandardizedType_CustomValue();

	/**
	 * Returns the meta object for class '{@link audiogrammetadata.PredictedAccuraciesType <em>Predicted Accuracies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicted Accuracies Type</em>'.
	 * @see audiogrammetadata.PredictedAccuraciesType
	 * @generated
	 */
	EClass getPredictedAccuraciesType();

	/**
	 * Returns the meta object for the containment reference '{@link audiogrammetadata.PredictedAccuraciesType#getQualind <em>Qualind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualind</em>'.
	 * @see audiogrammetadata.PredictedAccuraciesType#getQualind()
	 * @see #getPredictedAccuraciesType()
	 * @generated
	 */
	EReference getPredictedAccuraciesType_Qualind();

	/**
	 * Returns the meta object for the containment reference '{@link audiogrammetadata.PredictedAccuraciesType#getNonStandardized <em>Non Standardized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Non Standardized</em>'.
	 * @see audiogrammetadata.PredictedAccuraciesType#getNonStandardized()
	 * @see #getPredictedAccuraciesType()
	 * @generated
	 */
	EReference getPredictedAccuraciesType_NonStandardized();

	/**
	 * Returns the meta object for class '{@link audiogrammetadata.QualindType <em>Qualind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualind Type</em>'.
	 * @see audiogrammetadata.QualindType
	 * @generated
	 */
	EClass getQualindType();

	/**
	 * Returns the meta object for the attribute '{@link audiogrammetadata.QualindType#getDefinedValue <em>Defined Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Defined Value</em>'.
	 * @see audiogrammetadata.QualindType#getDefinedValue()
	 * @see #getQualindType()
	 * @generated
	 */
	EAttribute getQualindType_DefinedValue();

	/**
	 * Returns the meta object for the attribute '{@link audiogrammetadata.QualindType#getDisagree <em>Disagree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disagree</em>'.
	 * @see audiogrammetadata.QualindType#getDisagree()
	 * @see #getQualindType()
	 * @generated
	 */
	EAttribute getQualindType_Disagree();

	/**
	 * Returns the meta object for enum '{@link audiogrammetadata.DefinedValueType <em>Defined Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Defined Value Type</em>'.
	 * @see audiogrammetadata.DefinedValueType
	 * @generated
	 */
	EEnum getDefinedValueType();

	/**
	 * Returns the meta object for enum '{@link audiogrammetadata.DefinedValueType1 <em>Defined Value Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Defined Value Type1</em>'.
	 * @see audiogrammetadata.DefinedValueType1
	 * @generated
	 */
	EEnum getDefinedValueType1();

	/**
	 * Returns the meta object for enum '{@link audiogrammetadata.FlatHearingLossType <em>Flat Hearing Loss Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flat Hearing Loss Type</em>'.
	 * @see audiogrammetadata.FlatHearingLossType
	 * @generated
	 */
	EEnum getFlatHearingLossType();

	/**
	 * Returns the meta object for enum '{@link audiogrammetadata.OtherType <em>Other Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Other Type</em>'.
	 * @see audiogrammetadata.OtherType
	 * @generated
	 */
	EEnum getOtherType();

	/**
	 * Returns the meta object for enum '{@link audiogrammetadata.PeakedHearingLossType <em>Peaked Hearing Loss Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Peaked Hearing Loss Type</em>'.
	 * @see audiogrammetadata.PeakedHearingLossType
	 * @generated
	 */
	EEnum getPeakedHearingLossType();

	/**
	 * Returns the meta object for enum '{@link audiogrammetadata.RisingHearingLossType <em>Rising Hearing Loss Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rising Hearing Loss Type</em>'.
	 * @see audiogrammetadata.RisingHearingLossType
	 * @generated
	 */
	EEnum getRisingHearingLossType();

	/**
	 * Returns the meta object for enum '{@link audiogrammetadata.SiteOfLesionType <em>Site Of Lesion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Site Of Lesion Type</em>'.
	 * @see audiogrammetadata.SiteOfLesionType
	 * @generated
	 */
	EEnum getSiteOfLesionType();

	/**
	 * Returns the meta object for enum '{@link audiogrammetadata.SlopingHearingLossType <em>Sloping Hearing Loss Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sloping Hearing Loss Type</em>'.
	 * @see audiogrammetadata.SlopingHearingLossType
	 * @generated
	 */
	EEnum getSlopingHearingLossType();

	/**
	 * Returns the meta object for enum '{@link audiogrammetadata.SymmetryType <em>Symmetry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Symmetry Type</em>'.
	 * @see audiogrammetadata.SymmetryType
	 * @generated
	 */
	EEnum getSymmetryType();

	/**
	 * Returns the meta object for enum '{@link audiogrammetadata.TroughShapedHearingLossType <em>Trough Shaped Hearing Loss Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trough Shaped Hearing Loss Type</em>'.
	 * @see audiogrammetadata.TroughShapedHearingLossType
	 * @generated
	 */
	EEnum getTroughShapedHearingLossType();

	/**
	 * Returns the meta object for data type '{@link audiogrammetadata.DefinedValueType <em>Defined Value Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Defined Value Type Object</em>'.
	 * @see audiogrammetadata.DefinedValueType
	 * @model instanceClass="audiogrammetadata.DefinedValueType"
	 *        extendedMetaData="name='DefinedValue_._type:Object' baseType='DefinedValue_._type'"
	 * @generated
	 */
	EDataType getDefinedValueTypeObject();

	/**
	 * Returns the meta object for data type '{@link audiogrammetadata.DefinedValueType1 <em>Defined Value Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Defined Value Type Object1</em>'.
	 * @see audiogrammetadata.DefinedValueType1
	 * @model instanceClass="audiogrammetadata.DefinedValueType1"
	 *        extendedMetaData="name='DefinedValue_._1_._type:Object' baseType='DefinedValue_._1_._type'"
	 * @generated
	 */
	EDataType getDefinedValueTypeObject1();

	/**
	 * Returns the meta object for data type '{@link audiogrammetadata.FlatHearingLossType <em>Flat Hearing Loss Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Flat Hearing Loss Type Object</em>'.
	 * @see audiogrammetadata.FlatHearingLossType
	 * @model instanceClass="audiogrammetadata.FlatHearingLossType"
	 *        extendedMetaData="name='FlatHearingLoss_._type:Object' baseType='FlatHearingLoss_._type'"
	 * @generated
	 */
	EDataType getFlatHearingLossTypeObject();

	/**
	 * Returns the meta object for data type '{@link audiogrammetadata.OtherType <em>Other Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Other Type Object</em>'.
	 * @see audiogrammetadata.OtherType
	 * @model instanceClass="audiogrammetadata.OtherType"
	 *        extendedMetaData="name='Other_._type:Object' baseType='Other_._type'"
	 * @generated
	 */
	EDataType getOtherTypeObject();

	/**
	 * Returns the meta object for data type '{@link audiogrammetadata.PeakedHearingLossType <em>Peaked Hearing Loss Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Peaked Hearing Loss Type Object</em>'.
	 * @see audiogrammetadata.PeakedHearingLossType
	 * @model instanceClass="audiogrammetadata.PeakedHearingLossType"
	 *        extendedMetaData="name='PeakedHearingLoss_._type:Object' baseType='PeakedHearingLoss_._type'"
	 * @generated
	 */
	EDataType getPeakedHearingLossTypeObject();

	/**
	 * Returns the meta object for data type '{@link audiogrammetadata.RisingHearingLossType <em>Rising Hearing Loss Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rising Hearing Loss Type Object</em>'.
	 * @see audiogrammetadata.RisingHearingLossType
	 * @model instanceClass="audiogrammetadata.RisingHearingLossType"
	 *        extendedMetaData="name='RisingHearingLoss_._type:Object' baseType='RisingHearingLoss_._type'"
	 * @generated
	 */
	EDataType getRisingHearingLossTypeObject();

	/**
	 * Returns the meta object for data type '{@link audiogrammetadata.SiteOfLesionType <em>Site Of Lesion Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Site Of Lesion Type Object</em>'.
	 * @see audiogrammetadata.SiteOfLesionType
	 * @model instanceClass="audiogrammetadata.SiteOfLesionType"
	 *        extendedMetaData="name='SiteOfLesion_._type:Object' baseType='SiteOfLesion_._type'"
	 * @generated
	 */
	EDataType getSiteOfLesionTypeObject();

	/**
	 * Returns the meta object for data type '{@link audiogrammetadata.SlopingHearingLossType <em>Sloping Hearing Loss Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sloping Hearing Loss Type Object</em>'.
	 * @see audiogrammetadata.SlopingHearingLossType
	 * @model instanceClass="audiogrammetadata.SlopingHearingLossType"
	 *        extendedMetaData="name='SlopingHearingLoss_._type:Object' baseType='SlopingHearingLoss_._type'"
	 * @generated
	 */
	EDataType getSlopingHearingLossTypeObject();

	/**
	 * Returns the meta object for data type '{@link audiogrammetadata.SymmetryType <em>Symmetry Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Symmetry Type Object</em>'.
	 * @see audiogrammetadata.SymmetryType
	 * @model instanceClass="audiogrammetadata.SymmetryType"
	 *        extendedMetaData="name='Symmetry_._type:Object' baseType='Symmetry_._type'"
	 * @generated
	 */
	EDataType getSymmetryTypeObject();

	/**
	 * Returns the meta object for data type '{@link audiogrammetadata.TroughShapedHearingLossType <em>Trough Shaped Hearing Loss Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Trough Shaped Hearing Loss Type Object</em>'.
	 * @see audiogrammetadata.TroughShapedHearingLossType
	 * @model instanceClass="audiogrammetadata.TroughShapedHearingLossType"
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
	AudiogrammetadataFactory getAudiogrammetadataFactory();

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
		 * The meta object literal for the '{@link audiogrammetadata.impl.AMCLASSTypeImpl <em>AMCLASS Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogrammetadata.impl.AMCLASSTypeImpl
		 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getAMCLASSType()
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
		 * The meta object literal for the '{@link audiogrammetadata.impl.AMCLASSType1Impl <em>AMCLASS Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogrammetadata.impl.AMCLASSType1Impl
		 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getAMCLASSType1()
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
		 * The meta object literal for the '{@link audiogrammetadata.impl.AudiogramClassificationsTypeImpl <em>Audiogram Classifications Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogrammetadata.impl.AudiogramClassificationsTypeImpl
		 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getAudiogramClassificationsType()
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
		 * The meta object literal for the '{@link audiogrammetadata.impl.ConfigurationSeverityChoiceTypeImpl <em>Configuration Severity Choice Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogrammetadata.impl.ConfigurationSeverityChoiceTypeImpl
		 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getConfigurationSeverityChoiceType()
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
		 * The meta object literal for the '{@link audiogrammetadata.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogrammetadata.impl.DocumentRootImpl
		 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '{@link audiogrammetadata.impl.HIMSAAudiogramMetadataStandardTypeImpl <em>HIMSA Audiogram Metadata Standard Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogrammetadata.impl.HIMSAAudiogramMetadataStandardTypeImpl
		 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getHIMSAAudiogramMetadataStandardType()
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
		 * The meta object literal for the '{@link audiogrammetadata.impl.NonStandardizedTypeImpl <em>Non Standardized Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogrammetadata.impl.NonStandardizedTypeImpl
		 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getNonStandardizedType()
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
		 * The meta object literal for the '{@link audiogrammetadata.impl.PredictedAccuraciesTypeImpl <em>Predicted Accuracies Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogrammetadata.impl.PredictedAccuraciesTypeImpl
		 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getPredictedAccuraciesType()
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
		 * The meta object literal for the '{@link audiogrammetadata.impl.QualindTypeImpl <em>Qualind Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogrammetadata.impl.QualindTypeImpl
		 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getQualindType()
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
		 * The meta object literal for the '{@link audiogrammetadata.DefinedValueType <em>Defined Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogrammetadata.DefinedValueType
		 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getDefinedValueType()
		 * @generated
		 */
		EEnum DEFINED_VALUE_TYPE = eINSTANCE.getDefinedValueType();

		/**
		 * The meta object literal for the '{@link audiogrammetadata.DefinedValueType1 <em>Defined Value Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogrammetadata.DefinedValueType1
		 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getDefinedValueType1()
		 * @generated
		 */
		EEnum DEFINED_VALUE_TYPE1 = eINSTANCE.getDefinedValueType1();

		/**
		 * The meta object literal for the '{@link audiogrammetadata.FlatHearingLossType <em>Flat Hearing Loss Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogrammetadata.FlatHearingLossType
		 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getFlatHearingLossType()
		 * @generated
		 */
		EEnum FLAT_HEARING_LOSS_TYPE = eINSTANCE.getFlatHearingLossType();

		/**
		 * The meta object literal for the '{@link audiogrammetadata.OtherType <em>Other Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogrammetadata.OtherType
		 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getOtherType()
		 * @generated
		 */
		EEnum OTHER_TYPE = eINSTANCE.getOtherType();

		/**
		 * The meta object literal for the '{@link audiogrammetadata.PeakedHearingLossType <em>Peaked Hearing Loss Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogrammetadata.PeakedHearingLossType
		 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getPeakedHearingLossType()
		 * @generated
		 */
		EEnum PEAKED_HEARING_LOSS_TYPE = eINSTANCE.getPeakedHearingLossType();

		/**
		 * The meta object literal for the '{@link audiogrammetadata.RisingHearingLossType <em>Rising Hearing Loss Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogrammetadata.RisingHearingLossType
		 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getRisingHearingLossType()
		 * @generated
		 */
		EEnum RISING_HEARING_LOSS_TYPE = eINSTANCE.getRisingHearingLossType();

		/**
		 * The meta object literal for the '{@link audiogrammetadata.SiteOfLesionType <em>Site Of Lesion Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogrammetadata.SiteOfLesionType
		 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getSiteOfLesionType()
		 * @generated
		 */
		EEnum SITE_OF_LESION_TYPE = eINSTANCE.getSiteOfLesionType();

		/**
		 * The meta object literal for the '{@link audiogrammetadata.SlopingHearingLossType <em>Sloping Hearing Loss Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogrammetadata.SlopingHearingLossType
		 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getSlopingHearingLossType()
		 * @generated
		 */
		EEnum SLOPING_HEARING_LOSS_TYPE = eINSTANCE.getSlopingHearingLossType();

		/**
		 * The meta object literal for the '{@link audiogrammetadata.SymmetryType <em>Symmetry Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogrammetadata.SymmetryType
		 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getSymmetryType()
		 * @generated
		 */
		EEnum SYMMETRY_TYPE = eINSTANCE.getSymmetryType();

		/**
		 * The meta object literal for the '{@link audiogrammetadata.TroughShapedHearingLossType <em>Trough Shaped Hearing Loss Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogrammetadata.TroughShapedHearingLossType
		 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getTroughShapedHearingLossType()
		 * @generated
		 */
		EEnum TROUGH_SHAPED_HEARING_LOSS_TYPE = eINSTANCE.getTroughShapedHearingLossType();

		/**
		 * The meta object literal for the '<em>Defined Value Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogrammetadata.DefinedValueType
		 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getDefinedValueTypeObject()
		 * @generated
		 */
		EDataType DEFINED_VALUE_TYPE_OBJECT = eINSTANCE.getDefinedValueTypeObject();

		/**
		 * The meta object literal for the '<em>Defined Value Type Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogrammetadata.DefinedValueType1
		 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getDefinedValueTypeObject1()
		 * @generated
		 */
		EDataType DEFINED_VALUE_TYPE_OBJECT1 = eINSTANCE.getDefinedValueTypeObject1();

		/**
		 * The meta object literal for the '<em>Flat Hearing Loss Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogrammetadata.FlatHearingLossType
		 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getFlatHearingLossTypeObject()
		 * @generated
		 */
		EDataType FLAT_HEARING_LOSS_TYPE_OBJECT = eINSTANCE.getFlatHearingLossTypeObject();

		/**
		 * The meta object literal for the '<em>Other Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogrammetadata.OtherType
		 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getOtherTypeObject()
		 * @generated
		 */
		EDataType OTHER_TYPE_OBJECT = eINSTANCE.getOtherTypeObject();

		/**
		 * The meta object literal for the '<em>Peaked Hearing Loss Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogrammetadata.PeakedHearingLossType
		 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getPeakedHearingLossTypeObject()
		 * @generated
		 */
		EDataType PEAKED_HEARING_LOSS_TYPE_OBJECT = eINSTANCE.getPeakedHearingLossTypeObject();

		/**
		 * The meta object literal for the '<em>Rising Hearing Loss Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogrammetadata.RisingHearingLossType
		 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getRisingHearingLossTypeObject()
		 * @generated
		 */
		EDataType RISING_HEARING_LOSS_TYPE_OBJECT = eINSTANCE.getRisingHearingLossTypeObject();

		/**
		 * The meta object literal for the '<em>Site Of Lesion Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogrammetadata.SiteOfLesionType
		 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getSiteOfLesionTypeObject()
		 * @generated
		 */
		EDataType SITE_OF_LESION_TYPE_OBJECT = eINSTANCE.getSiteOfLesionTypeObject();

		/**
		 * The meta object literal for the '<em>Sloping Hearing Loss Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogrammetadata.SlopingHearingLossType
		 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getSlopingHearingLossTypeObject()
		 * @generated
		 */
		EDataType SLOPING_HEARING_LOSS_TYPE_OBJECT = eINSTANCE.getSlopingHearingLossTypeObject();

		/**
		 * The meta object literal for the '<em>Symmetry Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogrammetadata.SymmetryType
		 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getSymmetryTypeObject()
		 * @generated
		 */
		EDataType SYMMETRY_TYPE_OBJECT = eINSTANCE.getSymmetryTypeObject();

		/**
		 * The meta object literal for the '<em>Trough Shaped Hearing Loss Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see audiogrammetadata.TroughShapedHearingLossType
		 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getTroughShapedHearingLossTypeObject()
		 * @generated
		 */
		EDataType TROUGH_SHAPED_HEARING_LOSS_TYPE_OBJECT = eINSTANCE.getTroughShapedHearingLossTypeObject();

		/**
		 * The meta object literal for the '<em>Version Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see audiogrammetadata.impl.AudiogrammetadataPackageImpl#getVersionType()
		 * @generated
		 */
		EDataType VERSION_TYPE = eINSTANCE.getVersionType();

	}

} //AudiogrammetadataPackage
