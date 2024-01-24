/*
 */
package com.himsa.cochlear.implant.sound.processor.selection._500;


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
 * @see com.himsa.cochlear.implant.sound.processor.selection._500._500Factory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = _500Package.eNS_URI, genModel = "/model/PatientExportV5-1.genmodel", genModelSourceLocations = {"model/PatientExportV5-1.genmodel","org.avatar.himsa.model/model/PatientExportV5-1.genmodel"}, ecore="/model/cochlear.ecore", ecoreSourceLocations="/model/cochlear.ecore")
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
	String eNS_URI = "http://www.himsa.com/CochlearImplantSoundProcessorSelection/500";

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
	_500Package eINSTANCE = com.himsa.cochlear.implant.sound.processor.selection._500.impl._500PackageImpl.init();

	/**
	 * The meta object id for the '{@link com.himsa.cochlear.implant.sound.processor.selection._500.impl.CochlearImplantSoundProcessorSelectionTypeImpl <em>Cochlear Implant Sound Processor Selection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.cochlear.implant.sound.processor.selection._500.impl.CochlearImplantSoundProcessorSelectionTypeImpl
	 * @see com.himsa.cochlear.implant.sound.processor.selection._500.impl._500PackageImpl#getCochlearImplantSoundProcessorSelectionType()
	 * @generated
	 */
	int COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Sound Processor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_TYPE__SOUND_PROCESSOR = 0;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_TYPE__SERIAL_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_TYPE__VERSION = 2;

	/**
	 * The number of structural features of the '<em>Cochlear Implant Sound Processor Selection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cochlear Implant Sound Processor Selection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.himsa.cochlear.implant.sound.processor.selection._500.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.himsa.cochlear.implant.sound.processor.selection._500.impl.DocumentRootImpl
	 * @see com.himsa.cochlear.implant.sound.processor.selection._500.impl._500PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

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
	 * The feature id for the '<em><b>Cochlear Implant Sound Processor Selection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION = 3;

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
	 * The meta object id for the '<em>Serial Number Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.cochlear.implant.sound.processor.selection._500.impl._500PackageImpl#getSerialNumberType()
	 * @generated
	 */
	int SERIAL_NUMBER_TYPE = 2;

	/**
	 * The meta object id for the '<em>Sound Processor Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.himsa.cochlear.implant.sound.processor.selection._500.impl._500PackageImpl#getSoundProcessorType()
	 * @generated
	 */
	int SOUND_PROCESSOR_TYPE = 3;

	/**
	 * The meta object id for the '<em>Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.himsa.cochlear.implant.sound.processor.selection._500.impl._500PackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 4;


	/**
	 * Returns the meta object for class '{@link com.himsa.cochlear.implant.sound.processor.selection._500.CochlearImplantSoundProcessorSelectionType <em>Cochlear Implant Sound Processor Selection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cochlear Implant Sound Processor Selection Type</em>'.
	 * @see com.himsa.cochlear.implant.sound.processor.selection._500.CochlearImplantSoundProcessorSelectionType
	 * @generated
	 */
	EClass getCochlearImplantSoundProcessorSelectionType();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.cochlear.implant.sound.processor.selection._500.CochlearImplantSoundProcessorSelectionType#getSoundProcessor <em>Sound Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sound Processor</em>'.
	 * @see com.himsa.cochlear.implant.sound.processor.selection._500.CochlearImplantSoundProcessorSelectionType#getSoundProcessor()
	 * @see #getCochlearImplantSoundProcessorSelectionType()
	 * @generated
	 */
	EAttribute getCochlearImplantSoundProcessorSelectionType_SoundProcessor();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.cochlear.implant.sound.processor.selection._500.CochlearImplantSoundProcessorSelectionType#getSerialNumber <em>Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Number</em>'.
	 * @see com.himsa.cochlear.implant.sound.processor.selection._500.CochlearImplantSoundProcessorSelectionType#getSerialNumber()
	 * @see #getCochlearImplantSoundProcessorSelectionType()
	 * @generated
	 */
	EAttribute getCochlearImplantSoundProcessorSelectionType_SerialNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.himsa.cochlear.implant.sound.processor.selection._500.CochlearImplantSoundProcessorSelectionType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.himsa.cochlear.implant.sound.processor.selection._500.CochlearImplantSoundProcessorSelectionType#getVersion()
	 * @see #getCochlearImplantSoundProcessorSelectionType()
	 * @generated
	 */
	EAttribute getCochlearImplantSoundProcessorSelectionType_Version();

	/**
	 * Returns the meta object for class '{@link com.himsa.cochlear.implant.sound.processor.selection._500.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.himsa.cochlear.implant.sound.processor.selection._500.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.himsa.cochlear.implant.sound.processor.selection._500.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.himsa.cochlear.implant.sound.processor.selection._500.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.himsa.cochlear.implant.sound.processor.selection._500.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.himsa.cochlear.implant.sound.processor.selection._500.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.himsa.cochlear.implant.sound.processor.selection._500.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.himsa.cochlear.implant.sound.processor.selection._500.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.himsa.cochlear.implant.sound.processor.selection._500.DocumentRoot#getCochlearImplantSoundProcessorSelection <em>Cochlear Implant Sound Processor Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cochlear Implant Sound Processor Selection</em>'.
	 * @see com.himsa.cochlear.implant.sound.processor.selection._500.DocumentRoot#getCochlearImplantSoundProcessorSelection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CochlearImplantSoundProcessorSelection();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Serial Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Serial Number Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SerialNumber_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getSerialNumberType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Sound Processor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sound Processor Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SoundProcessor_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getSoundProcessorType();

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
		 * The meta object literal for the '{@link com.himsa.cochlear.implant.sound.processor.selection._500.impl.CochlearImplantSoundProcessorSelectionTypeImpl <em>Cochlear Implant Sound Processor Selection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.cochlear.implant.sound.processor.selection._500.impl.CochlearImplantSoundProcessorSelectionTypeImpl
		 * @see com.himsa.cochlear.implant.sound.processor.selection._500.impl._500PackageImpl#getCochlearImplantSoundProcessorSelectionType()
		 * @generated
		 */
		EClass COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_TYPE = eINSTANCE.getCochlearImplantSoundProcessorSelectionType();

		/**
		 * The meta object literal for the '<em><b>Sound Processor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_TYPE__SOUND_PROCESSOR = eINSTANCE.getCochlearImplantSoundProcessorSelectionType_SoundProcessor();

		/**
		 * The meta object literal for the '<em><b>Serial Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_TYPE__SERIAL_NUMBER = eINSTANCE.getCochlearImplantSoundProcessorSelectionType_SerialNumber();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_TYPE__VERSION = eINSTANCE.getCochlearImplantSoundProcessorSelectionType_Version();

		/**
		 * The meta object literal for the '{@link com.himsa.cochlear.implant.sound.processor.selection._500.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.himsa.cochlear.implant.sound.processor.selection._500.impl.DocumentRootImpl
		 * @see com.himsa.cochlear.implant.sound.processor.selection._500.impl._500PackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Cochlear Implant Sound Processor Selection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION = eINSTANCE.getDocumentRoot_CochlearImplantSoundProcessorSelection();

		/**
		 * The meta object literal for the '<em>Serial Number Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.cochlear.implant.sound.processor.selection._500.impl._500PackageImpl#getSerialNumberType()
		 * @generated
		 */
		EDataType SERIAL_NUMBER_TYPE = eINSTANCE.getSerialNumberType();

		/**
		 * The meta object literal for the '<em>Sound Processor Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.himsa.cochlear.implant.sound.processor.selection._500.impl._500PackageImpl#getSoundProcessorType()
		 * @generated
		 */
		EDataType SOUND_PROCESSOR_TYPE = eINSTANCE.getSoundProcessorType();

		/**
		 * The meta object literal for the '<em>Version Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see com.himsa.cochlear.implant.sound.processor.selection._500.impl._500PackageImpl#getVersionType()
		 * @generated
		 */
		EDataType VERSION_TYPE = eINSTANCE.getVersionType();

	}

} //_500Package
