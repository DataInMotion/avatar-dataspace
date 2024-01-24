/*
 */
package admittance;

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
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link admittance.EustachianTubeFunctionIntactEarDrumTest#getAdmittanceCurve <em>Admittance Curve</em>}</li>
 *   <li>{@link admittance.EustachianTubeFunctionIntactEarDrumTest#getPressure <em>Pressure</em>}</li>
 *   <li>{@link admittance.EustachianTubeFunctionIntactEarDrumTest#getCanalVolume <em>Canal Volume</em>}</li>
 *   <li>{@link admittance.EustachianTubeFunctionIntactEarDrumTest#getMeasurementCondition <em>Measurement Condition</em>}</li>
 * </ul>
 *
 * @see admittance.AdmittancePackage#getEustachianTubeFunctionIntactEarDrumTest()
 * @model extendedMetaData="name='EustachianTubeFunctionIntactEarDrumTest' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EustachianTubeFunctionIntactEarDrumTest extends EObject {
	/**
	 * Returns the value of the '<em><b>Admittance Curve</b></em>' containment reference list.
	 * The list contents are of type {@link admittance.AdmittanceCurveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Admittance curves 
	 * 
	 * @@ Format 501 to 500 conversion
	 * 
	 * Format 500 was defned to have a max of 3 curves which is now removed.
	 * 
	 * When converting data HIMSA will take a simple approach and convert the first 3 curves and will drop the remaining curves.  
	 * 
	 * @@
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Admittance Curve</em>' containment reference list.
	 * @see admittance.AdmittancePackage#getEustachianTubeFunctionIntactEarDrumTest_AdmittanceCurve()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AdmittanceCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AdmittanceCurveType> getAdmittanceCurve();

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
	 * @@ Format 501 to 500 conversion
	 * 
	 * Format 500 was defned to have a max of 3 pressure valudes which is now removed.
	 * 
	 * When converting data HIMSA will take a simple approach and convert the first 3 pressure values and will drop the remaining values.
	 * 
	 * @@
	 * 
	 * 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pressure</em>' attribute list.
	 * @see admittance.AdmittancePackage#getEustachianTubeFunctionIntactEarDrumTest_Pressure()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
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
	 * +Ca / is the acoustic admittance in m3/Pa
	 * +Note 1 / The ear canal volume equivalent is valid at the probe tone frequency 226 Hz.
	 * +Note 2 / The equivalent volume of air is equal to its physical value for values not exceeding 5 ccm.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Canal Volume</em>' containment reference.
	 * @see #setCanalVolume(AdmittanceType)
	 * @see admittance.AdmittancePackage#getEustachianTubeFunctionIntactEarDrumTest_CanalVolume()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CanalVolume' namespace='##targetNamespace'"
	 * @generated
	 */
	AdmittanceType getCanalVolume();

	/**
	 * Sets the value of the '{@link admittance.EustachianTubeFunctionIntactEarDrumTest#getCanalVolume <em>Canal Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canal Volume</em>' containment reference.
	 * @see #getCanalVolume()
	 * @generated
	 */
	void setCanalVolume(AdmittanceType value);

	/**
	 * Returns the value of the '<em><b>Measurement Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measure conditions
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measurement Condition</em>' containment reference.
	 * @see #setMeasurementCondition(TympanogramMeasurementConditionsType)
	 * @see admittance.AdmittancePackage#getEustachianTubeFunctionIntactEarDrumTest_MeasurementCondition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MeasurementCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	TympanogramMeasurementConditionsType getMeasurementCondition();

	/**
	 * Sets the value of the '{@link admittance.EustachianTubeFunctionIntactEarDrumTest#getMeasurementCondition <em>Measurement Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Condition</em>' containment reference.
	 * @see #getMeasurementCondition()
	 * @generated
	 */
	void setMeasurementCondition(TympanogramMeasurementConditionsType value);

} // EustachianTubeFunctionIntactEarDrumTest
