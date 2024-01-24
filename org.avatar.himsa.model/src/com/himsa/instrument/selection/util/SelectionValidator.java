/**
 */
package com.himsa.instrument.selection.util;

import com.himsa.instrument.selection.*;

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
 * @see com.himsa.instrument.selection.SelectionPackage
 * @generated
 */
public class SelectionValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SelectionValidator INSTANCE = new SelectionValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "com.himsa.instrument.selection";

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
	public SelectionValidator() {
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
	  return SelectionPackage.eINSTANCE;
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
			case SelectionPackage.BATTERY_TYPE:
				return validateBatteryType((BatteryType)value, diagnostics, context);
			case SelectionPackage.DEVICE_CATEGORY_TYPE:
				return validateDeviceCategoryType((DeviceCategoryType)value, diagnostics, context);
			case SelectionPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE:
				return validateHearingInstrumentSelectionType((HearingInstrumentSelectionType)value, diagnostics, context);
			case SelectionPackage.BATTERY_TYPE_TEXT_TYPE:
				return validateBatteryTypeTextType((String)value, diagnostics, context);
			case SelectionPackage.CONVERTED_FROM_DATA_STANDARD_TYPE:
				return validateConvertedFromDataStandardType((BigInteger)value, diagnostics, context);
			case SelectionPackage.DEVICE_CATEGORY_TEXT_TYPE:
				return validateDeviceCategoryTextType((String)value, diagnostics, context);
			case SelectionPackage.EAR_MOLD_FORM_TYPE:
				return validateEarMoldFormType((BigInteger)value, diagnostics, context);
			case SelectionPackage.EAR_MOLD_TEXT_TYPE:
				return validateEarMoldTextType((String)value, diagnostics, context);
			case SelectionPackage.INSTRUMENT_TYPE_NAME_TYPE:
				return validateInstrumentTypeNameType((String)value, diagnostics, context);
			case SelectionPackage.SERIAL_NUMBER_TYPE:
				return validateSerialNumberType((String)value, diagnostics, context);
			case SelectionPackage.SOUND_CANAL_TYPE:
				return validateSoundCanalType((BigInteger)value, diagnostics, context);
			case SelectionPackage.VENT_TYPE:
				return validateVentType((BigInteger)value, diagnostics, context);
			case SelectionPackage.VERSION_TYPE:
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
	public boolean validateBatteryType(BatteryType batteryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(batteryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceCategoryType(DeviceCategoryType deviceCategoryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceCategoryType, diagnostics, context);
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
	public boolean validateHearingInstrumentSelectionType(HearingInstrumentSelectionType hearingInstrumentSelectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hearingInstrumentSelectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBatteryTypeTextType(String batteryTypeTextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBatteryTypeTextType_MaxLength(batteryTypeTextType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Battery Type Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBatteryTypeTextType_MaxLength(String batteryTypeTextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = batteryTypeTextType.length();
		boolean result = length <= 21;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(SelectionPackage.Literals.BATTERY_TYPE_TEXT_TYPE, batteryTypeTextType, length, 21, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConvertedFromDataStandardType(BigInteger convertedFromDataStandardType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateConvertedFromDataStandardType_Min(convertedFromDataStandardType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateConvertedFromDataStandardType_Min
	 */
	public static final BigInteger CONVERTED_FROM_DATA_STANDARD_TYPE__MIN__VALUE = new BigInteger("100");

	/**
	 * Validates the Min constraint of '<em>Converted From Data Standard Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConvertedFromDataStandardType_Min(BigInteger convertedFromDataStandardType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = convertedFromDataStandardType.compareTo(CONVERTED_FROM_DATA_STANDARD_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(SelectionPackage.Literals.CONVERTED_FROM_DATA_STANDARD_TYPE, convertedFromDataStandardType, CONVERTED_FROM_DATA_STANDARD_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceCategoryTextType(String deviceCategoryTextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDeviceCategoryTextType_MaxLength(deviceCategoryTextType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Device Category Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceCategoryTextType_MaxLength(String deviceCategoryTextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = deviceCategoryTextType.length();
		boolean result = length <= 21;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(SelectionPackage.Literals.DEVICE_CATEGORY_TEXT_TYPE, deviceCategoryTextType, length, 21, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEarMoldFormType(BigInteger earMoldFormType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEarMoldTextType(String earMoldTextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateEarMoldTextType_MaxLength(earMoldTextType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Ear Mold Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEarMoldTextType_MaxLength(String earMoldTextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = earMoldTextType.length();
		boolean result = length <= 61;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(SelectionPackage.Literals.EAR_MOLD_TEXT_TYPE, earMoldTextType, length, 61, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstrumentTypeNameType(String instrumentTypeNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateInstrumentTypeNameType_MaxLength(instrumentTypeNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Instrument Type Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstrumentTypeNameType_MaxLength(String instrumentTypeNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = instrumentTypeNameType.length();
		boolean result = length <= 41;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(SelectionPackage.Literals.INSTRUMENT_TYPE_NAME_TYPE, instrumentTypeNameType, length, 41, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSerialNumberType(String serialNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSerialNumberType_MaxLength(serialNumberType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Serial Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSerialNumberType_MaxLength(String serialNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = serialNumberType.length();
		boolean result = length <= 21;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(SelectionPackage.Literals.SERIAL_NUMBER_TYPE, serialNumberType, length, 21, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoundCanalType(BigInteger soundCanalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVentType(BigInteger ventType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionType(BigInteger versionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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

} //SelectionValidator
