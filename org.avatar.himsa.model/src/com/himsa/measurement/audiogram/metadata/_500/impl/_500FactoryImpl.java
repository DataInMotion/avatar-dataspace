/**
 */
package com.himsa.measurement.audiogram.metadata._500.impl;

import com.himsa.measurement.audiogram.metadata._500.*;

import java.math.BigInteger;

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
public class _500FactoryImpl extends EFactoryImpl implements _500Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static _500Factory init() {
		try {
			_500Factory the_500Factory = (_500Factory)EPackage.Registry.INSTANCE.getEFactory(_500Package.eNS_URI);
			if (the_500Factory != null) {
				return the_500Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new _500FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _500FactoryImpl() {
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
			case _500Package.AMCLASS_TYPE: return createAMCLASSType();
			case _500Package.AMCLASS_TYPE1: return createAMCLASSType1();
			case _500Package.AUDIOGRAM_CLASSIFICATIONS_TYPE: return createAudiogramClassificationsType();
			case _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE: return createConfigurationSeverityChoiceType();
			case _500Package.DOCUMENT_ROOT: return createDocumentRoot();
			case _500Package.HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE: return createHIMSAAudiogramMetadataStandardType();
			case _500Package.NON_STANDARDIZED_TYPE: return createNonStandardizedType();
			case _500Package.PREDICTED_ACCURACIES_TYPE: return createPredictedAccuraciesType();
			case _500Package.QUALIND_TYPE: return createQualindType();
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
			case _500Package.DEFINED_VALUE_TYPE:
				return createDefinedValueTypeFromString(eDataType, initialValue);
			case _500Package.DEFINED_VALUE_TYPE1:
				return createDefinedValueType1FromString(eDataType, initialValue);
			case _500Package.FLAT_HEARING_LOSS_TYPE:
				return createFlatHearingLossTypeFromString(eDataType, initialValue);
			case _500Package.OTHER_TYPE:
				return createOtherTypeFromString(eDataType, initialValue);
			case _500Package.PEAKED_HEARING_LOSS_TYPE:
				return createPeakedHearingLossTypeFromString(eDataType, initialValue);
			case _500Package.RISING_HEARING_LOSS_TYPE:
				return createRisingHearingLossTypeFromString(eDataType, initialValue);
			case _500Package.SITE_OF_LESION_TYPE:
				return createSiteOfLesionTypeFromString(eDataType, initialValue);
			case _500Package.SLOPING_HEARING_LOSS_TYPE:
				return createSlopingHearingLossTypeFromString(eDataType, initialValue);
			case _500Package.SYMMETRY_TYPE:
				return createSymmetryTypeFromString(eDataType, initialValue);
			case _500Package.TROUGH_SHAPED_HEARING_LOSS_TYPE:
				return createTroughShapedHearingLossTypeFromString(eDataType, initialValue);
			case _500Package.DEFINED_VALUE_TYPE_OBJECT:
				return createDefinedValueTypeObjectFromString(eDataType, initialValue);
			case _500Package.DEFINED_VALUE_TYPE_OBJECT1:
				return createDefinedValueTypeObject1FromString(eDataType, initialValue);
			case _500Package.FLAT_HEARING_LOSS_TYPE_OBJECT:
				return createFlatHearingLossTypeObjectFromString(eDataType, initialValue);
			case _500Package.OTHER_TYPE_OBJECT:
				return createOtherTypeObjectFromString(eDataType, initialValue);
			case _500Package.PEAKED_HEARING_LOSS_TYPE_OBJECT:
				return createPeakedHearingLossTypeObjectFromString(eDataType, initialValue);
			case _500Package.RISING_HEARING_LOSS_TYPE_OBJECT:
				return createRisingHearingLossTypeObjectFromString(eDataType, initialValue);
			case _500Package.SITE_OF_LESION_TYPE_OBJECT:
				return createSiteOfLesionTypeObjectFromString(eDataType, initialValue);
			case _500Package.SLOPING_HEARING_LOSS_TYPE_OBJECT:
				return createSlopingHearingLossTypeObjectFromString(eDataType, initialValue);
			case _500Package.SYMMETRY_TYPE_OBJECT:
				return createSymmetryTypeObjectFromString(eDataType, initialValue);
			case _500Package.TROUGH_SHAPED_HEARING_LOSS_TYPE_OBJECT:
				return createTroughShapedHearingLossTypeObjectFromString(eDataType, initialValue);
			case _500Package.VERSION_TYPE:
				return createVersionTypeFromString(eDataType, initialValue);
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
			case _500Package.DEFINED_VALUE_TYPE:
				return convertDefinedValueTypeToString(eDataType, instanceValue);
			case _500Package.DEFINED_VALUE_TYPE1:
				return convertDefinedValueType1ToString(eDataType, instanceValue);
			case _500Package.FLAT_HEARING_LOSS_TYPE:
				return convertFlatHearingLossTypeToString(eDataType, instanceValue);
			case _500Package.OTHER_TYPE:
				return convertOtherTypeToString(eDataType, instanceValue);
			case _500Package.PEAKED_HEARING_LOSS_TYPE:
				return convertPeakedHearingLossTypeToString(eDataType, instanceValue);
			case _500Package.RISING_HEARING_LOSS_TYPE:
				return convertRisingHearingLossTypeToString(eDataType, instanceValue);
			case _500Package.SITE_OF_LESION_TYPE:
				return convertSiteOfLesionTypeToString(eDataType, instanceValue);
			case _500Package.SLOPING_HEARING_LOSS_TYPE:
				return convertSlopingHearingLossTypeToString(eDataType, instanceValue);
			case _500Package.SYMMETRY_TYPE:
				return convertSymmetryTypeToString(eDataType, instanceValue);
			case _500Package.TROUGH_SHAPED_HEARING_LOSS_TYPE:
				return convertTroughShapedHearingLossTypeToString(eDataType, instanceValue);
			case _500Package.DEFINED_VALUE_TYPE_OBJECT:
				return convertDefinedValueTypeObjectToString(eDataType, instanceValue);
			case _500Package.DEFINED_VALUE_TYPE_OBJECT1:
				return convertDefinedValueTypeObject1ToString(eDataType, instanceValue);
			case _500Package.FLAT_HEARING_LOSS_TYPE_OBJECT:
				return convertFlatHearingLossTypeObjectToString(eDataType, instanceValue);
			case _500Package.OTHER_TYPE_OBJECT:
				return convertOtherTypeObjectToString(eDataType, instanceValue);
			case _500Package.PEAKED_HEARING_LOSS_TYPE_OBJECT:
				return convertPeakedHearingLossTypeObjectToString(eDataType, instanceValue);
			case _500Package.RISING_HEARING_LOSS_TYPE_OBJECT:
				return convertRisingHearingLossTypeObjectToString(eDataType, instanceValue);
			case _500Package.SITE_OF_LESION_TYPE_OBJECT:
				return convertSiteOfLesionTypeObjectToString(eDataType, instanceValue);
			case _500Package.SLOPING_HEARING_LOSS_TYPE_OBJECT:
				return convertSlopingHearingLossTypeObjectToString(eDataType, instanceValue);
			case _500Package.SYMMETRY_TYPE_OBJECT:
				return convertSymmetryTypeObjectToString(eDataType, instanceValue);
			case _500Package.TROUGH_SHAPED_HEARING_LOSS_TYPE_OBJECT:
				return convertTroughShapedHearingLossTypeObjectToString(eDataType, instanceValue);
			case _500Package.VERSION_TYPE:
				return convertVersionTypeToString(eDataType, instanceValue);
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
	public AMCLASSType createAMCLASSType() {
		AMCLASSTypeImpl amclassType = new AMCLASSTypeImpl();
		return amclassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AMCLASSType1 createAMCLASSType1() {
		AMCLASSType1Impl amclassType1 = new AMCLASSType1Impl();
		return amclassType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AudiogramClassificationsType createAudiogramClassificationsType() {
		AudiogramClassificationsTypeImpl audiogramClassificationsType = new AudiogramClassificationsTypeImpl();
		return audiogramClassificationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationSeverityChoiceType createConfigurationSeverityChoiceType() {
		ConfigurationSeverityChoiceTypeImpl configurationSeverityChoiceType = new ConfigurationSeverityChoiceTypeImpl();
		return configurationSeverityChoiceType;
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
	public HIMSAAudiogramMetadataStandardType createHIMSAAudiogramMetadataStandardType() {
		HIMSAAudiogramMetadataStandardTypeImpl himsaAudiogramMetadataStandardType = new HIMSAAudiogramMetadataStandardTypeImpl();
		return himsaAudiogramMetadataStandardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonStandardizedType createNonStandardizedType() {
		NonStandardizedTypeImpl nonStandardizedType = new NonStandardizedTypeImpl();
		return nonStandardizedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PredictedAccuraciesType createPredictedAccuraciesType() {
		PredictedAccuraciesTypeImpl predictedAccuraciesType = new PredictedAccuraciesTypeImpl();
		return predictedAccuraciesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualindType createQualindType() {
		QualindTypeImpl qualindType = new QualindTypeImpl();
		return qualindType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinedValueType createDefinedValueTypeFromString(EDataType eDataType, String initialValue) {
		DefinedValueType result = DefinedValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefinedValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinedValueType1 createDefinedValueType1FromString(EDataType eDataType, String initialValue) {
		DefinedValueType1 result = DefinedValueType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefinedValueType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlatHearingLossType createFlatHearingLossTypeFromString(EDataType eDataType, String initialValue) {
		FlatHearingLossType result = FlatHearingLossType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlatHearingLossTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherType createOtherTypeFromString(EDataType eDataType, String initialValue) {
		OtherType result = OtherType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOtherTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeakedHearingLossType createPeakedHearingLossTypeFromString(EDataType eDataType, String initialValue) {
		PeakedHearingLossType result = PeakedHearingLossType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPeakedHearingLossTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RisingHearingLossType createRisingHearingLossTypeFromString(EDataType eDataType, String initialValue) {
		RisingHearingLossType result = RisingHearingLossType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRisingHearingLossTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteOfLesionType createSiteOfLesionTypeFromString(EDataType eDataType, String initialValue) {
		SiteOfLesionType result = SiteOfLesionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSiteOfLesionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlopingHearingLossType createSlopingHearingLossTypeFromString(EDataType eDataType, String initialValue) {
		SlopingHearingLossType result = SlopingHearingLossType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSlopingHearingLossTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType createSymmetryTypeFromString(EDataType eDataType, String initialValue) {
		SymmetryType result = SymmetryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TroughShapedHearingLossType createTroughShapedHearingLossTypeFromString(EDataType eDataType, String initialValue) {
		TroughShapedHearingLossType result = TroughShapedHearingLossType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTroughShapedHearingLossTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinedValueType createDefinedValueTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDefinedValueTypeFromString(_500Package.Literals.DEFINED_VALUE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefinedValueTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDefinedValueTypeToString(_500Package.Literals.DEFINED_VALUE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinedValueType1 createDefinedValueTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createDefinedValueType1FromString(_500Package.Literals.DEFINED_VALUE_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefinedValueTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertDefinedValueType1ToString(_500Package.Literals.DEFINED_VALUE_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlatHearingLossType createFlatHearingLossTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFlatHearingLossTypeFromString(_500Package.Literals.FLAT_HEARING_LOSS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlatHearingLossTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFlatHearingLossTypeToString(_500Package.Literals.FLAT_HEARING_LOSS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherType createOtherTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createOtherTypeFromString(_500Package.Literals.OTHER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOtherTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOtherTypeToString(_500Package.Literals.OTHER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeakedHearingLossType createPeakedHearingLossTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPeakedHearingLossTypeFromString(_500Package.Literals.PEAKED_HEARING_LOSS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPeakedHearingLossTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPeakedHearingLossTypeToString(_500Package.Literals.PEAKED_HEARING_LOSS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RisingHearingLossType createRisingHearingLossTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRisingHearingLossTypeFromString(_500Package.Literals.RISING_HEARING_LOSS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRisingHearingLossTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRisingHearingLossTypeToString(_500Package.Literals.RISING_HEARING_LOSS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteOfLesionType createSiteOfLesionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSiteOfLesionTypeFromString(_500Package.Literals.SITE_OF_LESION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSiteOfLesionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSiteOfLesionTypeToString(_500Package.Literals.SITE_OF_LESION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlopingHearingLossType createSlopingHearingLossTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSlopingHearingLossTypeFromString(_500Package.Literals.SLOPING_HEARING_LOSS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSlopingHearingLossTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSlopingHearingLossTypeToString(_500Package.Literals.SLOPING_HEARING_LOSS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType createSymmetryTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSymmetryTypeFromString(_500Package.Literals.SYMMETRY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSymmetryTypeToString(_500Package.Literals.SYMMETRY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TroughShapedHearingLossType createTroughShapedHearingLossTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTroughShapedHearingLossTypeFromString(_500Package.Literals.TROUGH_SHAPED_HEARING_LOSS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTroughShapedHearingLossTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTroughShapedHearingLossTypeToString(_500Package.Literals.TROUGH_SHAPED_HEARING_LOSS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createVersionTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public _500Package get_500Package() {
		return (_500Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static _500Package getPackage() {
		return _500Package.eINSTANCE;
	}

} //_500FactoryImpl
