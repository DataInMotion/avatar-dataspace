/*
 */
package impedance;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eustachian Tube Function Intact Ear Drum Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Eustachian Tube Function Intact ear drum
 * 
 * ## TEtfIntactTest ##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link impedance.EustachianTubeFunctionIntactEarDrumTest#getComplianceCurve <em>Compliance Curve</em>}</li>
 *   <li>{@link impedance.EustachianTubeFunctionIntactEarDrumTest#getPressure <em>Pressure</em>}</li>
 *   <li>{@link impedance.EustachianTubeFunctionIntactEarDrumTest#getCanalVolume <em>Canal Volume</em>}</li>
 *   <li>{@link impedance.EustachianTubeFunctionIntactEarDrumTest#getMeasurementCondition <em>Measurement Condition</em>}</li>
 * </ul>
 *
 * @see impedance.ImpedancePackage#getEustachianTubeFunctionIntactEarDrumTest()
 * @model extendedMetaData="name='EustachianTubeFunctionIntactEarDrumTest' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EustachianTubeFunctionIntactEarDrumTest extends EObject {
	/**
	 * Returns the value of the '<em><b>Compliance Curve</b></em>' containment reference list.
	 * The list contents are of type {@link impedance.ComplianceCurveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Compliance curves 
	 * 
	 * ## complCrv ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compliance Curve</em>' containment reference list.
	 * @see impedance.ImpedancePackage#getEustachianTubeFunctionIntactEarDrumTest_ComplianceCurve()
	 * @model containment="true" required="true" upper="3"
	 *        extendedMetaData="kind='element' name='ComplianceCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ComplianceCurveType> getComplianceCurve();

	/**
	 * Returns the value of the '<em><b>Pressure</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Middle Ear Pressure at maximum
	 * 
	 * From the Middle Ear Pressure curve, only the peak value is stored for each
	 * curve.
	 * 
	 * ## pressure ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pressure</em>' attribute list.
	 * @see impedance.ImpedancePackage#getEustachianTubeFunctionIntactEarDrumTest_Pressure()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true" upper="3"
	 *        extendedMetaData="kind='element' name='Pressure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BigInteger> getPressure();

	/**
	 * Returns the value of the '<em><b>Canal Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * canalVolume / The admittance equivalent to the Ear canal volume is conventionally subtracted from measures of total aural admittance to yield an estimate of the middle ear admittance. This is referred to as compensated admittance. Ear canal volumes are in the range of [0.30 .. 1.00] ccm in children and
	 * [0.65 .. 1.75] ccm in adults. Katz pg 180. The volume is given by the formula
	 * 
	 * Vc = γ . ps . Ca = ρ . c2 . Ca where
	 * 
	 * +Vc / is the equivalent volume in m3
	 * +γ / is the ratio of specific heat for air at constant pressure to that at constant volume, approximately 1.40.
	 * +ps / is the barometric pressure in Pa, normal pressure 0.1013 MPa.
	 * +ρ / is the ambient density of air in kg/m3, at the temperature and pressure of the measurement
	 * +c / is the speed of sound in m/s at the temperature and pressure of the measurement
	 * +Ca / is the acoustic compliance in m3/Pa
	 * +Note 1 / The ear canal volume equivalent is valid at the probe tone frequency 226 Hz.
	 * +Note 2 / The equivalent volume of air is equal to its physical value for values not exceeding 5 ccm.
	 * 
	 * ## canalVolume ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Canal Volume</em>' containment reference.
	 * @see #setCanalVolume(ComplianceType)
	 * @see impedance.ImpedancePackage#getEustachianTubeFunctionIntactEarDrumTest_CanalVolume()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CanalVolume' namespace='##targetNamespace'"
	 * @generated
	 */
	ComplianceType getCanalVolume();

	/**
	 * Sets the value of the '{@link impedance.EustachianTubeFunctionIntactEarDrumTest#getCanalVolume <em>Canal Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canal Volume</em>' containment reference.
	 * @see #getCanalVolume()
	 * @generated
	 */
	void setCanalVolume(ComplianceType value);

	/**
	 * Returns the value of the '<em><b>Measurement Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measure conditions
	 * 
	 * ## measCond ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measurement Condition</em>' containment reference.
	 * @see #setMeasurementCondition(TympanogramMeasurementConditionsType)
	 * @see impedance.ImpedancePackage#getEustachianTubeFunctionIntactEarDrumTest_MeasurementCondition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MeasurementCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	TympanogramMeasurementConditionsType getMeasurementCondition();

	/**
	 * Sets the value of the '{@link impedance.EustachianTubeFunctionIntactEarDrumTest#getMeasurementCondition <em>Measurement Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Condition</em>' containment reference.
	 * @see #getMeasurementCondition()
	 * @generated
	 */
	void setMeasurementCondition(TympanogramMeasurementConditionsType value);

} // EustachianTubeFunctionIntactEarDrumTest
