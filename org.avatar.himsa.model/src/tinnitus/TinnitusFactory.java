/*
 */
package tinnitus;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tinnitus.TinnitusPackage
 * @generated
 */
@ProviderType
public interface TinnitusFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TinnitusFactory eINSTANCE = tinnitus.impl.TinnitusFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bandwidth Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bandwidth Type</em>'.
	 * @generated
	 */
	BandwidthType createBandwidthType();

	/**
	 * Returns a new object of class '<em>Intensity Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intensity Type1</em>'.
	 * @generated
	 */
	IntensityType1 createIntensityType1();

	/**
	 * Returns a new object of class '<em>Measurement Conditions Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measurement Conditions Type</em>'.
	 * @generated
	 */
	MeasurementConditionsType createMeasurementConditionsType();

	/**
	 * Returns a new object of class '<em>Measurement Equipment Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measurement Equipment Type</em>'.
	 * @generated
	 */
	MeasurementEquipmentType createMeasurementEquipmentType();

	/**
	 * Returns a new object of class '<em>Measurement Frequency Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measurement Frequency Point Type</em>'.
	 * @generated
	 */
	MeasurementFrequencyPointType createMeasurementFrequencyPointType();

	/**
	 * Returns a new object of class '<em>Measurement Intensity Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measurement Intensity Point Type</em>'.
	 * @generated
	 */
	MeasurementIntensityPointType createMeasurementIntensityPointType();

	/**
	 * Returns a new object of class '<em>Minimum Masking Level Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minimum Masking Level Type</em>'.
	 * @generated
	 */
	MinimumMaskingLevelType createMinimumMaskingLevelType();

	/**
	 * Returns a new object of class '<em>Residual Inhibition Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Residual Inhibition Type</em>'.
	 * @generated
	 */
	ResidualInhibitionType createResidualInhibitionType();

	/**
	 * Returns a new object of class '<em>Signal Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Type</em>'.
	 * @generated
	 */
	SignalType createSignalType();

	/**
	 * Returns a new object of class '<em>Loudness Match Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loudness Match Type</em>'.
	 * @generated
	 */
	TinnitusLoudnessMatchType createTinnitusLoudnessMatchType();

	/**
	 * Returns a new object of class '<em>Measurement Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measurement Data Type</em>'.
	 * @generated
	 */
	TinnitusMeasurementDataType createTinnitusMeasurementDataType();

	/**
	 * Returns a new object of class '<em>Measurement Notes Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measurement Notes Type</em>'.
	 * @generated
	 */
	TinnitusMeasurementNotesType createTinnitusMeasurementNotesType();

	/**
	 * Returns a new object of class '<em>Pitch Match Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pitch Match Type</em>'.
	 * @generated
	 */
	TinnitusPitchMatchType createTinnitusPitchMatchType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TinnitusPackage getTinnitusPackage();

} //TinnitusFactory
