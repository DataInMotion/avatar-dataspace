/**
 */
package com.himsa.measurement.audiogram.metadata._500.util;

import com.himsa.measurement.audiogram.metadata._500.*;

import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see com.himsa.measurement.audiogram.metadata._500._500Package
 * @generated
 */
public class _500Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final _500Validator INSTANCE = new _500Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "com.himsa.measurement.audiogram.metadata._500";

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
	public _500Validator() {
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
	  return _500Package.eINSTANCE;
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
			case _500Package.AMCLASS_TYPE:
				return validateAMCLASSType((AMCLASSType)value, diagnostics, context);
			case _500Package.AMCLASS_TYPE1:
				return validateAMCLASSType1((AMCLASSType1)value, diagnostics, context);
			case _500Package.AUDIOGRAM_CLASSIFICATIONS_TYPE:
				return validateAudiogramClassificationsType((AudiogramClassificationsType)value, diagnostics, context);
			case _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE:
				return validateConfigurationSeverityChoiceType((ConfigurationSeverityChoiceType)value, diagnostics, context);
			case _500Package.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case _500Package.HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE:
				return validateHIMSAAudiogramMetadataStandardType((HIMSAAudiogramMetadataStandardType)value, diagnostics, context);
			case _500Package.NON_STANDARDIZED_TYPE:
				return validateNonStandardizedType((NonStandardizedType)value, diagnostics, context);
			case _500Package.PREDICTED_ACCURACIES_TYPE:
				return validatePredictedAccuraciesType((PredictedAccuraciesType)value, diagnostics, context);
			case _500Package.QUALIND_TYPE:
				return validateQualindType((QualindType)value, diagnostics, context);
			case _500Package.DEFINED_VALUE_TYPE:
				return validateDefinedValueType((DefinedValueType)value, diagnostics, context);
			case _500Package.DEFINED_VALUE_TYPE1:
				return validateDefinedValueType1((DefinedValueType1)value, diagnostics, context);
			case _500Package.FLAT_HEARING_LOSS_TYPE:
				return validateFlatHearingLossType((FlatHearingLossType)value, diagnostics, context);
			case _500Package.OTHER_TYPE:
				return validateOtherType((OtherType)value, diagnostics, context);
			case _500Package.PEAKED_HEARING_LOSS_TYPE:
				return validatePeakedHearingLossType((PeakedHearingLossType)value, diagnostics, context);
			case _500Package.RISING_HEARING_LOSS_TYPE:
				return validateRisingHearingLossType((RisingHearingLossType)value, diagnostics, context);
			case _500Package.SITE_OF_LESION_TYPE:
				return validateSiteOfLesionType((SiteOfLesionType)value, diagnostics, context);
			case _500Package.SLOPING_HEARING_LOSS_TYPE:
				return validateSlopingHearingLossType((SlopingHearingLossType)value, diagnostics, context);
			case _500Package.SYMMETRY_TYPE:
				return validateSymmetryType((SymmetryType)value, diagnostics, context);
			case _500Package.TROUGH_SHAPED_HEARING_LOSS_TYPE:
				return validateTroughShapedHearingLossType((TroughShapedHearingLossType)value, diagnostics, context);
			case _500Package.DEFINED_VALUE_TYPE_OBJECT:
				return validateDefinedValueTypeObject((DefinedValueType)value, diagnostics, context);
			case _500Package.DEFINED_VALUE_TYPE_OBJECT1:
				return validateDefinedValueTypeObject1((DefinedValueType1)value, diagnostics, context);
			case _500Package.FLAT_HEARING_LOSS_TYPE_OBJECT:
				return validateFlatHearingLossTypeObject((FlatHearingLossType)value, diagnostics, context);
			case _500Package.OTHER_TYPE_OBJECT:
				return validateOtherTypeObject((OtherType)value, diagnostics, context);
			case _500Package.PEAKED_HEARING_LOSS_TYPE_OBJECT:
				return validatePeakedHearingLossTypeObject((PeakedHearingLossType)value, diagnostics, context);
			case _500Package.RISING_HEARING_LOSS_TYPE_OBJECT:
				return validateRisingHearingLossTypeObject((RisingHearingLossType)value, diagnostics, context);
			case _500Package.SITE_OF_LESION_TYPE_OBJECT:
				return validateSiteOfLesionTypeObject((SiteOfLesionType)value, diagnostics, context);
			case _500Package.SLOPING_HEARING_LOSS_TYPE_OBJECT:
				return validateSlopingHearingLossTypeObject((SlopingHearingLossType)value, diagnostics, context);
			case _500Package.SYMMETRY_TYPE_OBJECT:
				return validateSymmetryTypeObject((SymmetryType)value, diagnostics, context);
			case _500Package.TROUGH_SHAPED_HEARING_LOSS_TYPE_OBJECT:
				return validateTroughShapedHearingLossTypeObject((TroughShapedHearingLossType)value, diagnostics, context);
			case _500Package.VERSION_TYPE:
				return validateVersionType((BigInteger)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAMCLASSType(AMCLASSType amclassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(amclassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAMCLASSType1(AMCLASSType1 amclassType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(amclassType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAudiogramClassificationsType(AudiogramClassificationsType audiogramClassificationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(audiogramClassificationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigurationSeverityChoiceType(ConfigurationSeverityChoiceType configurationSeverityChoiceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(configurationSeverityChoiceType, diagnostics, context);
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
	public boolean validateHIMSAAudiogramMetadataStandardType(HIMSAAudiogramMetadataStandardType himsaAudiogramMetadataStandardType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(himsaAudiogramMetadataStandardType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonStandardizedType(NonStandardizedType nonStandardizedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nonStandardizedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePredictedAccuraciesType(PredictedAccuraciesType predictedAccuraciesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(predictedAccuraciesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualindType(QualindType qualindType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(qualindType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinedValueType(DefinedValueType definedValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinedValueType1(DefinedValueType1 definedValueType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlatHearingLossType(FlatHearingLossType flatHearingLossType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherType(OtherType otherType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeakedHearingLossType(PeakedHearingLossType peakedHearingLossType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRisingHearingLossType(RisingHearingLossType risingHearingLossType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSiteOfLesionType(SiteOfLesionType siteOfLesionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlopingHearingLossType(SlopingHearingLossType slopingHearingLossType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymmetryType(SymmetryType symmetryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTroughShapedHearingLossType(TroughShapedHearingLossType troughShapedHearingLossType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinedValueTypeObject(DefinedValueType definedValueTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinedValueTypeObject1(DefinedValueType1 definedValueTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlatHearingLossTypeObject(FlatHearingLossType flatHearingLossTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherTypeObject(OtherType otherTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeakedHearingLossTypeObject(PeakedHearingLossType peakedHearingLossTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRisingHearingLossTypeObject(RisingHearingLossType risingHearingLossTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSiteOfLesionTypeObject(SiteOfLesionType siteOfLesionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlopingHearingLossTypeObject(SlopingHearingLossType slopingHearingLossTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymmetryTypeObject(SymmetryType symmetryTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTroughShapedHearingLossTypeObject(TroughShapedHearingLossType troughShapedHearingLossTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionType(BigInteger versionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVersionType_Min(versionType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateVersionType_Min
	 */
	public static final BigInteger VERSION_TYPE__MIN__VALUE = new BigInteger("500");

	/**
	 * Validates the Min constraint of '<em>Version Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionType_Min(BigInteger versionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = versionType.compareTo(VERSION_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(_500Package.Literals.VERSION_TYPE, versionType, VERSION_TYPE__MIN__VALUE, true, diagnostics, context);
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

} //_500Validator
