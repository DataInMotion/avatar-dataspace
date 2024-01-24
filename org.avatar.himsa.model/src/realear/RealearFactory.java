/*
 */
package realear;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see realear.RealearPackage
 * @generated
 */
@ProviderType
public interface RealearFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RealearFactory eINSTANCE = realear.impl.RealearFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Attack Release Measurement Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attack Release Measurement Point</em>'.
	 * @generated
	 */
	AttackReleaseMeasurementPoint createAttackReleaseMeasurementPoint();

	/**
	 * Returns a new object of class '<em>Battery Current Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Battery Current Measurement</em>'.
	 * @generated
	 */
	BatteryCurrentMeasurement createBatteryCurrentMeasurement();

	/**
	 * Returns a new object of class '<em>Battery Measurement Conditions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Battery Measurement Conditions</em>'.
	 * @generated
	 */
	BatteryMeasurementConditions createBatteryMeasurementConditions();

	/**
	 * Returns a new object of class '<em>Battery Measurement Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Battery Measurement Point</em>'.
	 * @generated
	 */
	BatteryMeasurementPoint createBatteryMeasurementPoint();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Equivalent Input Noise</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equivalent Input Noise</em>'.
	 * @generated
	 */
	EquivalentInputNoise createEquivalentInputNoise();

	/**
	 * Returns a new object of class '<em>Frequency Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Frequency Measurement</em>'.
	 * @generated
	 */
	FrequencyMeasurement createFrequencyMeasurement();

	/**
	 * Returns a new object of class '<em>Frequency Measurement Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Frequency Measurement Point</em>'.
	 * @generated
	 */
	FrequencyMeasurementPoint createFrequencyMeasurementPoint();

	/**
	 * Returns a new object of class '<em>Full Target Curve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Full Target Curve</em>'.
	 * @generated
	 */
	FullTargetCurve createFullTargetCurve();

	/**
	 * Returns a new object of class '<em>Harmonic Distortion Measurement Curve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Harmonic Distortion Measurement Curve</em>'.
	 * @generated
	 */
	HarmonicDistortionMeasurementCurve createHarmonicDistortionMeasurementCurve();

	/**
	 * Returns a new object of class '<em>Harmonic Distortion Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Harmonic Distortion Point</em>'.
	 * @generated
	 */
	HarmonicDistortionPoint createHarmonicDistortionPoint();

	/**
	 * Returns a new object of class '<em>HIMSA Rem Standard Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HIMSA Rem Standard Type</em>'.
	 * @generated
	 */
	HIMSARemStandardType createHIMSARemStandardType();

	/**
	 * Returns a new object of class '<em>Input Output Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Output Measurement</em>'.
	 * @generated
	 */
	InputOutputMeasurement createInputOutputMeasurement();

	/**
	 * Returns a new object of class '<em>Input Output Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Output Point</em>'.
	 * @generated
	 */
	InputOutputPoint createInputOutputPoint();

	/**
	 * Returns a new object of class '<em>Intermodulation Distortion Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intermodulation Distortion Measurement</em>'.
	 * @generated
	 */
	IntermodulationDistortionMeasurement createIntermodulationDistortionMeasurement();

	/**
	 * Returns a new object of class '<em>Intermodulation Distortion Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intermodulation Distortion Point</em>'.
	 * @generated
	 */
	IntermodulationDistortionPoint createIntermodulationDistortionPoint();

	/**
	 * Returns a new object of class '<em>Measurement Conditions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measurement Conditions</em>'.
	 * @generated
	 */
	MeasurementConditions createMeasurementConditions();

	/**
	 * Returns a new object of class '<em>Occlusion Effects</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Occlusion Effects</em>'.
	 * @generated
	 */
	OcclusionEffects createOcclusionEffects();

	/**
	 * Returns a new object of class '<em>Real Ear Coupler Difference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real Ear Coupler Difference</em>'.
	 * @generated
	 */
	RealEarCouplerDifference createRealEarCouplerDifference();

	/**
	 * Returns a new object of class '<em>Real Ear Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real Ear Data Type</em>'.
	 * @generated
	 */
	RealEarDataType createRealEarDataType();

	/**
	 * Returns a new object of class '<em>Target Curve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Curve</em>'.
	 * @generated
	 */
	TargetCurve createTargetCurve();

	/**
	 * Returns a new object of class '<em>Target Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Measurement</em>'.
	 * @generated
	 */
	TargetMeasurement createTargetMeasurement();

	/**
	 * Returns a new object of class '<em>Target Measurement Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Measurement Point</em>'.
	 * @generated
	 */
	TargetMeasurementPoint createTargetMeasurementPoint();

	/**
	 * Returns a new object of class '<em>Target Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Point</em>'.
	 * @generated
	 */
	TargetPoint createTargetPoint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RealearPackage getRealearPackage();

} //RealearFactory
