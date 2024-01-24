/*
 */
package com.himsa.measurement.impedance;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.himsa.measurement.impedance.ImpedancePackage
 * @generated
 */
@ProviderType
public interface ImpedanceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImpedanceFactory eINSTANCE = com.himsa.measurement.impedance.impl.ImpedanceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Acoustic Impedance Complete Measurement Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acoustic Impedance Complete Measurement Type</em>'.
	 * @generated
	 */
	AcousticImpedanceCompleteMeasurementType createAcousticImpedanceCompleteMeasurementType();

	/**
	 * Returns a new object of class '<em>Compliance Curve Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compliance Curve Type</em>'.
	 * @generated
	 */
	ComplianceCurveType createComplianceCurveType();

	/**
	 * Returns a new object of class '<em>Compliance Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compliance Point Type</em>'.
	 * @generated
	 */
	CompliancePointType createCompliancePointType();

	/**
	 * Returns a new object of class '<em>Compliance Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compliance Type</em>'.
	 * @generated
	 */
	ComplianceType createComplianceType();

	/**
	 * Returns a new object of class '<em>Compliance Unit Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compliance Unit Type</em>'.
	 * @generated
	 */
	ComplianceUnitType createComplianceUnitType();

	/**
	 * Returns a new object of class '<em>Compliance Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compliance Value Type</em>'.
	 * @generated
	 */
	ComplianceValueType createComplianceValueType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Eustachian Tube Function Intact Ear Drum Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eustachian Tube Function Intact Ear Drum Test</em>'.
	 * @generated
	 */
	EustachianTubeFunctionIntactEarDrumTest createEustachianTubeFunctionIntactEarDrumTest();

	/**
	 * Returns a new object of class '<em>Eustachian Tube Function Perforated Ear Drum Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eustachian Tube Function Perforated Ear Drum Test</em>'.
	 * @generated
	 */
	EustachianTubeFunctionPerforatedEarDrumTest createEustachianTubeFunctionPerforatedEarDrumTest();

	/**
	 * Returns a new object of class '<em>Gradient Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gradient Type</em>'.
	 * @generated
	 */
	GradientType createGradientType();

	/**
	 * Returns a new object of class '<em>Measurement Condition Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measurement Condition Type</em>'.
	 * @generated
	 */
	ImpedanceMeasurementConditionType createImpedanceMeasurementConditionType();

	/**
	 * Returns a new object of class '<em>Pressure Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pressure Point Type</em>'.
	 * @generated
	 */
	PressurePointType createPressurePointType();

	/**
	 * Returns a new object of class '<em>Reflex Curve Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reflex Curve Type</em>'.
	 * @generated
	 */
	ReflexCurveType createReflexCurveType();

	/**
	 * Returns a new object of class '<em>Reflex Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reflex Point Type</em>'.
	 * @generated
	 */
	ReflexPointType createReflexPointType();

	/**
	 * Returns a new object of class '<em>Reflex Test Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reflex Test Type</em>'.
	 * @generated
	 */
	ReflexTestType createReflexTestType();

	/**
	 * Returns a new object of class '<em>Tympanogram Measurement Conditions Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tympanogram Measurement Conditions Type</em>'.
	 * @generated
	 */
	TympanogramMeasurementConditionsType createTympanogramMeasurementConditionsType();

	/**
	 * Returns a new object of class '<em>Tympanogram Test Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tympanogram Test Type</em>'.
	 * @generated
	 */
	TympanogramTestType createTympanogramTestType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ImpedancePackage getImpedancePackage();

} //ImpedanceFactory
