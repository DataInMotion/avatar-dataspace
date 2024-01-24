/*
 */
package com.himsa.measurement.impedance;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tympanogram Test Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ## TTympTest ##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.impedance.TympanogramTestType#getComplianceCurve <em>Compliance Curve</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.TympanogramTestType#getMaximumCompliance <em>Maximum Compliance</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.TympanogramTestType#getCanalVolume <em>Canal Volume</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.TympanogramTestType#getGradient <em>Gradient</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.TympanogramTestType#getPressure <em>Pressure</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.TympanogramTestType#getResonanceFrequency <em>Resonance Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.TympanogramTestType#getResult <em>Result</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.TympanogramTestType#getMeasurementCondition <em>Measurement Condition</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.impedance.ImpedancePackage#getTympanogramTestType()
 * @model extendedMetaData="name='TympanogramTest_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TympanogramTestType extends EObject {
	/**
	 * Returns the value of the '<em><b>Compliance Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Graphics representation of measurement
	 * 
	 * ## complCrv ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compliance Curve</em>' containment reference.
	 * @see #setComplianceCurve(ComplianceCurveType)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getTympanogramTestType_ComplianceCurve()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ComplianceCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	ComplianceCurveType getComplianceCurve();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.TympanogramTestType#getComplianceCurve <em>Compliance Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compliance Curve</em>' containment reference.
	 * @see #getComplianceCurve()
	 * @generated
	 */
	void setComplianceCurve(ComplianceCurveType value);

	/**
	 * Returns the value of the '<em><b>Maximum Compliance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Peak value for the compliance curve
	 * 
	 * ## maxCompl ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Compliance</em>' containment reference.
	 * @see #setMaximumCompliance(ComplianceType)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getTympanogramTestType_MaximumCompliance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MaximumCompliance' namespace='##targetNamespace'"
	 * @generated
	 */
	ComplianceType getMaximumCompliance();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.TympanogramTestType#getMaximumCompliance <em>Maximum Compliance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Compliance</em>' containment reference.
	 * @see #getMaximumCompliance()
	 * @generated
	 */
	void setMaximumCompliance(ComplianceType value);

	/**
	 * Returns the value of the '<em><b>Canal Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * canalVolume / The admittance equivalent to the Ear canal volume is conventionally subtracted from measures of total aural admittance to yield an estimate of the middle ear admittance. This is referred to as compensated admittance. Ear canal volumes are in the range of [0.30 .. 1.00] ccm in children and
	 * [0.65 .. 1.75] ccm in adults. Katz pg 180. The volume is given by the formula
	 * Vcc = γ . ps . Ca = ρ . c2 . Ca where
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
	 * ##  canalVolume  ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Canal Volume</em>' containment reference.
	 * @see #setCanalVolume(ComplianceType)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getTympanogramTestType_CanalVolume()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CanalVolume' namespace='##targetNamespace'"
	 * @generated
	 */
	ComplianceType getCanalVolume();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.TympanogramTestType#getCanalVolume <em>Canal Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canal Volume</em>' containment reference.
	 * @see #getCanalVolume()
	 * @generated
	 */
	void setCanalVolume(ComplianceType value);

	/**
	 * Returns the value of the '<em><b>Gradient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gradient of the compliance curve
	 * 
	 * ##  gradient  ##
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gradient</em>' containment reference.
	 * @see #setGradient(GradientType)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getTympanogramTestType_Gradient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Gradient' namespace='##targetNamespace'"
	 * @generated
	 */
	GradientType getGradient();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.TympanogramTestType#getGradient <em>Gradient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gradient</em>' containment reference.
	 * @see #getGradient()
	 * @generated
	 */
	void setGradient(GradientType value);

	/**
	 * Returns the value of the '<em><b>Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Middle ear pressure at the point of maximum admittance.
	 * 
	 * ## pressure ##
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pressure</em>' attribute.
	 * @see #setPressure(BigInteger)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getTympanogramTestType_Pressure()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='Pressure' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPressure();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.TympanogramTestType#getPressure <em>Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure</em>' attribute.
	 * @see #getPressure()
	 * @generated
	 */
	void setPressure(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Resonance Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defined as the frequency at which compliant and mass succeptance are equal. Normal middle ear resonance falls between 800 and 1200Hz. Below the resonant frequency the middle ear is stiffness controlled and above the resonant frequency it is mass controlled (Katz pg 189)
	 * 
	 * Various middle ear pathologies will have an effect on the mass or stiffness of the system resulting in altered resonant frequencies in abnormal ears.
	 * 
	 * 
	 * ## ResFrq ##
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resonance Frequency</em>' attribute.
	 * @see #setResonanceFrequency(BigInteger)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getTympanogramTestType_ResonanceFrequency()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='ResonanceFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getResonanceFrequency();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.TympanogramTestType#getResonanceFrequency <em>Resonance Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resonance Frequency</em>' attribute.
	 * @see #getResonanceFrequency()
	 * @generated
	 */
	void setResonanceFrequency(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * The literals are from the enumeration {@link com.himsa.measurement.impedance.TympanogramResultType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Jerger 1970 classified the shapes of tympanograms and this system is still commonly used today and is applicable only to a 226Hz probe test.
	 * 
	 * A / tympanograms have peaks near atmospheric pressure
	 * AD / tympanograms have a high peak near atmospheric pressure
	 * As / tympanograms have a shallow peak near atmospheric pressure
	 * B / tympanograms are flat
	 * C / tympanograms have negative pressure peaks
	 * D/ and E tympanograms have a notched peak and are more common with higher probe frequencies.
	 * 
	 * Katz pg 177
	 * 
	 * 
	 * ##  result  ##
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see com.himsa.measurement.impedance.TympanogramResultType
	 * @see #isSetResult()
	 * @see #unsetResult()
	 * @see #setResult(TympanogramResultType)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getTympanogramTestType_Result()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Result' namespace='##targetNamespace'"
	 * @generated
	 */
	TympanogramResultType getResult();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.TympanogramTestType#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see com.himsa.measurement.impedance.TympanogramResultType
	 * @see #isSetResult()
	 * @see #unsetResult()
	 * @see #getResult()
	 * @generated
	 */
	void setResult(TympanogramResultType value);

	/**
	 * Unsets the value of the '{@link com.himsa.measurement.impedance.TympanogramTestType#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResult()
	 * @see #getResult()
	 * @see #setResult(TympanogramResultType)
	 * @generated
	 */
	void unsetResult();

	/**
	 * Returns whether the value of the '{@link com.himsa.measurement.impedance.TympanogramTestType#getResult <em>Result</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Result</em>' attribute is set.
	 * @see #unsetResult()
	 * @see #getResult()
	 * @see #setResult(TympanogramResultType)
	 * @generated
	 */
	boolean isSetResult();

	/**
	 * Returns the value of the '<em><b>Measurement Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## measCond ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measurement Condition</em>' containment reference.
	 * @see #setMeasurementCondition(TympanogramMeasurementConditionsType)
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getTympanogramTestType_MeasurementCondition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MeasurementCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	TympanogramMeasurementConditionsType getMeasurementCondition();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.TympanogramTestType#getMeasurementCondition <em>Measurement Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Condition</em>' containment reference.
	 * @see #getMeasurementCondition()
	 * @generated
	 */
	void setMeasurementCondition(TympanogramMeasurementConditionsType value);

} // TympanogramTestType
