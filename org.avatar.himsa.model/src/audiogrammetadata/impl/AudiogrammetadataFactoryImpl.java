/**
 */
package audiogrammetadata.impl;

import audiogrammetadata.*;

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
public class AudiogrammetadataFactoryImpl extends EFactoryImpl implements AudiogrammetadataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AudiogrammetadataFactory init() {
		try {
			AudiogrammetadataFactory theAudiogrammetadataFactory = (AudiogrammetadataFactory)EPackage.Registry.INSTANCE.getEFactory(AudiogrammetadataPackage.eNS_URI);
			if (theAudiogrammetadataFactory != null) {
				return theAudiogrammetadataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AudiogrammetadataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudiogrammetadataFactoryImpl() {
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
			case AudiogrammetadataPackage.AMCLASS_TYPE: return createAMCLASSType();
			case AudiogrammetadataPackage.AMCLASS_TYPE1: return createAMCLASSType1();
			case AudiogrammetadataPackage.AUDIOGRAM_CLASSIFICATIONS_TYPE: return createAudiogramClassificationsType();
			case AudiogrammetadataPackage.CONFIGURATION_SEVERITY_CHOICE_TYPE: return createConfigurationSeverityChoiceType();
			case AudiogrammetadataPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case AudiogrammetadataPackage.HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE: return createHIMSAAudiogramMetadataStandardType();
			case AudiogrammetadataPackage.NON_STANDARDIZED_TYPE: return createNonStandardizedType();
			case AudiogrammetadataPackage.PREDICTED_ACCURACIES_TYPE: return createPredictedAccuraciesType();
			case AudiogrammetadataPackage.QUALIND_TYPE: return createQualindType();
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
			case AudiogrammetadataPackage.DEFINED_VALUE_TYPE:
				return createDefinedValueTypeFromString(eDataType, initialValue);
			case AudiogrammetadataPackage.DEFINED_VALUE_TYPE1:
				return createDefinedValueType1FromString(eDataType, initialValue);
			case AudiogrammetadataPackage.FLAT_HEARING_LOSS_TYPE:
				return createFlatHearingLossTypeFromString(eDataType, initialValue);
			case AudiogrammetadataPackage.OTHER_TYPE:
				return createOtherTypeFromString(eDataType, initialValue);
			case AudiogrammetadataPackage.PEAKED_HEARING_LOSS_TYPE:
				return createPeakedHearingLossTypeFromString(eDataType, initialValue);
			case AudiogrammetadataPackage.RISING_HEARING_LOSS_TYPE:
				return createRisingHearingLossTypeFromString(eDataType, initialValue);
			case AudiogrammetadataPackage.SITE_OF_LESION_TYPE:
				return createSiteOfLesionTypeFromString(eDataType, initialValue);
			case AudiogrammetadataPackage.SLOPING_HEARING_LOSS_TYPE:
				return createSlopingHearingLossTypeFromString(eDataType, initialValue);
			case AudiogrammetadataPackage.SYMMETRY_TYPE:
				return createSymmetryTypeFromString(eDataType, initialValue);
			case AudiogrammetadataPackage.TROUGH_SHAPED_HEARING_LOSS_TYPE:
				return createTroughShapedHearingLossTypeFromString(eDataType, initialValue);
			case AudiogrammetadataPackage.DEFINED_VALUE_TYPE_OBJECT:
				return createDefinedValueTypeObjectFromString(eDataType, initialValue);
			case AudiogrammetadataPackage.DEFINED_VALUE_TYPE_OBJECT1:
				return createDefinedValueTypeObject1FromString(eDataType, initialValue);
			case AudiogrammetadataPackage.FLAT_HEARING_LOSS_TYPE_OBJECT:
				return createFlatHearingLossTypeObjectFromString(eDataType, initialValue);
			case AudiogrammetadataPackage.OTHER_TYPE_OBJECT:
				return createOtherTypeObjectFromString(eDataType, initialValue);
			case AudiogrammetadataPackage.PEAKED_HEARING_LOSS_TYPE_OBJECT:
				return createPeakedHearingLossTypeObjectFromString(eDataType, initialValue);
			case AudiogrammetadataPackage.RISING_HEARING_LOSS_TYPE_OBJECT:
				return createRisingHearingLossTypeObjectFromString(eDataType, initialValue);
			case AudiogrammetadataPackage.SITE_OF_LESION_TYPE_OBJECT:
				return createSiteOfLesionTypeObjectFromString(eDataType, initialValue);
			case AudiogrammetadataPackage.SLOPING_HEARING_LOSS_TYPE_OBJECT:
				return createSlopingHearingLossTypeObjectFromString(eDataType, initialValue);
			case AudiogrammetadataPackage.SYMMETRY_TYPE_OBJECT:
				return createSymmetryTypeObjectFromString(eDataType, initialValue);
			case AudiogrammetadataPackage.TROUGH_SHAPED_HEARING_LOSS_TYPE_OBJECT:
				return createTroughShapedHearingLossTypeObjectFromString(eDataType, initialValue);
			case AudiogrammetadataPackage.VERSION_TYPE:
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
			case AudiogrammetadataPackage.DEFINED_VALUE_TYPE:
				return convertDefinedValueTypeToString(eDataType, instanceValue);
			case AudiogrammetadataPackage.DEFINED_VALUE_TYPE1:
				return convertDefinedValueType1ToString(eDataType, instanceValue);
			case AudiogrammetadataPackage.FLAT_HEARING_LOSS_TYPE:
				return convertFlatHearingLossTypeToString(eDataType, instanceValue);
			case AudiogrammetadataPackage.OTHER_TYPE:
				return convertOtherTypeToString(eDataType, instanceValue);
			case AudiogrammetadataPackage.PEAKED_HEARING_LOSS_TYPE:
				return convertPeakedHearingLossTypeToString(eDataType, instanceValue);
			case AudiogrammetadataPackage.RISING_HEARING_LOSS_TYPE:
				return convertRisingHearingLossTypeToString(eDataType, instanceValue);
			case AudiogrammetadataPackage.SITE_OF_LESION_TYPE:
				return convertSiteOfLesionTypeToString(eDataType, instanceValue);
			case AudiogrammetadataPackage.SLOPING_HEARING_LOSS_TYPE:
				return convertSlopingHearingLossTypeToString(eDataType, instanceValue);
			case AudiogrammetadataPackage.SYMMETRY_TYPE:
				return convertSymmetryTypeToString(eDataType, instanceValue);
			case AudiogrammetadataPackage.TROUGH_SHAPED_HEARING_LOSS_TYPE:
				return convertTroughShapedHearingLossTypeToString(eDataType, instanceValue);
			case AudiogrammetadataPackage.DEFINED_VALUE_TYPE_OBJECT:
				return convertDefinedValueTypeObjectToString(eDataType, instanceValue);
			case AudiogrammetadataPackage.DEFINED_VALUE_TYPE_OBJECT1:
				return convertDefinedValueTypeObject1ToString(eDataType, instanceValue);
			case AudiogrammetadataPackage.FLAT_HEARING_LOSS_TYPE_OBJECT:
				return convertFlatHearingLossTypeObjectToString(eDataType, instanceValue);
			case AudiogrammetadataPackage.OTHER_TYPE_OBJECT:
				return convertOtherTypeObjectToString(eDataType, instanceValue);
			case AudiogrammetadataPackage.PEAKED_HEARING_LOSS_TYPE_OBJECT:
				return convertPeakedHearingLossTypeObjectToString(eDataType, instanceValue);
			case AudiogrammetadataPackage.RISING_HEARING_LOSS_TYPE_OBJECT:
				return convertRisingHearingLossTypeObjectToString(eDataType, instanceValue);
			case AudiogrammetadataPackage.SITE_OF_LESION_TYPE_OBJECT:
				return convertSiteOfLesionTypeObjectToString(eDataType, instanceValue);
			case AudiogrammetadataPackage.SLOPING_HEARING_LOSS_TYPE_OBJECT:
				return convertSlopingHearingLossTypeObjectToString(eDataType, instanceValue);
			case AudiogrammetadataPackage.SYMMETRY_TYPE_OBJECT:
				return convertSymmetryTypeObjectToString(eDataType, instanceValue);
			case AudiogrammetadataPackage.TROUGH_SHAPED_HEARING_LOSS_TYPE_OBJECT:
				return convertTroughShapedHearingLossTypeObjectToString(eDataType, instanceValue);
			case AudiogrammetadataPackage.VERSION_TYPE:
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
		return createDefinedValueTypeFromString(AudiogrammetadataPackage.Literals.DEFINED_VALUE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefinedValueTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDefinedValueTypeToString(AudiogrammetadataPackage.Literals.DEFINED_VALUE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinedValueType1 createDefinedValueTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createDefinedValueType1FromString(AudiogrammetadataPackage.Literals.DEFINED_VALUE_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefinedValueTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertDefinedValueType1ToString(AudiogrammetadataPackage.Literals.DEFINED_VALUE_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlatHearingLossType createFlatHearingLossTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFlatHearingLossTypeFromString(AudiogrammetadataPackage.Literals.FLAT_HEARING_LOSS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlatHearingLossTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFlatHearingLossTypeToString(AudiogrammetadataPackage.Literals.FLAT_HEARING_LOSS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherType createOtherTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createOtherTypeFromString(AudiogrammetadataPackage.Literals.OTHER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOtherTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOtherTypeToString(AudiogrammetadataPackage.Literals.OTHER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeakedHearingLossType createPeakedHearingLossTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPeakedHearingLossTypeFromString(AudiogrammetadataPackage.Literals.PEAKED_HEARING_LOSS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPeakedHearingLossTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPeakedHearingLossTypeToString(AudiogrammetadataPackage.Literals.PEAKED_HEARING_LOSS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RisingHearingLossType createRisingHearingLossTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRisingHearingLossTypeFromString(AudiogrammetadataPackage.Literals.RISING_HEARING_LOSS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRisingHearingLossTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRisingHearingLossTypeToString(AudiogrammetadataPackage.Literals.RISING_HEARING_LOSS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteOfLesionType createSiteOfLesionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSiteOfLesionTypeFromString(AudiogrammetadataPackage.Literals.SITE_OF_LESION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSiteOfLesionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSiteOfLesionTypeToString(AudiogrammetadataPackage.Literals.SITE_OF_LESION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlopingHearingLossType createSlopingHearingLossTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSlopingHearingLossTypeFromString(AudiogrammetadataPackage.Literals.SLOPING_HEARING_LOSS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSlopingHearingLossTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSlopingHearingLossTypeToString(AudiogrammetadataPackage.Literals.SLOPING_HEARING_LOSS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType createSymmetryTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSymmetryTypeFromString(AudiogrammetadataPackage.Literals.SYMMETRY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSymmetryTypeToString(AudiogrammetadataPackage.Literals.SYMMETRY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TroughShapedHearingLossType createTroughShapedHearingLossTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTroughShapedHearingLossTypeFromString(AudiogrammetadataPackage.Literals.TROUGH_SHAPED_HEARING_LOSS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTroughShapedHearingLossTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTroughShapedHearingLossTypeToString(AudiogrammetadataPackage.Literals.TROUGH_SHAPED_HEARING_LOSS_TYPE, instanceValue);
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
	public AudiogrammetadataPackage getAudiogrammetadataPackage() {
		return (AudiogrammetadataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AudiogrammetadataPackage getPackage() {
		return AudiogrammetadataPackage.eINSTANCE;
	}

} //AudiogrammetadataFactoryImpl
