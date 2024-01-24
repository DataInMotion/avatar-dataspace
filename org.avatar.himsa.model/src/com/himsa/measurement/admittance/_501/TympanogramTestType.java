/*
 */
package com.himsa.measurement.admittance._501;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tympanogram Test Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.admittance._501.TympanogramTestType#getAdmittanceCurve <em>Admittance Curve</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.TympanogramTestType#getMaximumAdmittance <em>Maximum Admittance</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.TympanogramTestType#getCanalVolume <em>Canal Volume</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.TympanogramTestType#getGradient <em>Gradient</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.TympanogramTestType#getPressure <em>Pressure</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.TympanogramTestType#getResonanceFrequency <em>Resonance Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.TympanogramTestType#getResult <em>Result</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.TympanogramTestType#getMeasurementCondition <em>Measurement Condition</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.TympanogramTestType#getStaticAdmittance <em>Static Admittance</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.admittance._501._501Package#getTympanogramTestType()
 * @model extendedMetaData="name='TympanogramTest_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TympanogramTestType extends EObject {
	/**
	 * Returns the value of the '<em><b>Admittance Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Graphics representation of measurement
	 * 
	 * @@ 501 --> 500 This element was made to be optional starting in format 501.
	 * 
	 * If converting down to 500 AND there is no curve then create a curve with one point following format 500 with the following information:
	 * + admittancePoint > Pressure = 0
	 * + admittancePoint > admittance  > Argumentadmittance1 = 0
	 * + admittancePoint > admittance  > Argumentadmittance2 = 0
	 * + admittanceUnit > ArgumentUnit1 = CubicCentimetrer
	 * + admittanceUnit > ArgumentUnit2 = CubicCentimetrer
	 * 
	 * @@
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Admittance Curve</em>' containment reference.
	 * @see #setAdmittanceCurve(AdmittanceCurveType)
	 * @see com.himsa.measurement.admittance._501._501Package#getTympanogramTestType_AdmittanceCurve()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdmittanceCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	AdmittanceCurveType getAdmittanceCurve();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.TympanogramTestType#getAdmittanceCurve <em>Admittance Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admittance Curve</em>' containment reference.
	 * @see #getAdmittanceCurve()
	 * @generated
	 */
	void setAdmittanceCurve(AdmittanceCurveType value);

	/**
	 * Returns the value of the '<em><b>Maximum Admittance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Peak value for the admittance curve
	 * 
	 * @@ 501 --> 500 This element was made to be optional starting in format 501.
	 * 
	 * If converting down to 500 AND there is no curve then create an entry following format 500 with the following information:
	 * + admittancePoint > admittance  > Argumentadmittance1 = 0
	 * + admittancePoint > admittance  > Argumentadmittance2 = 0
	 * + admittanceUnit > ArgumentUnit1 = CubicCentimetrer
	 * + admittanceUnit > ArgumentUnit2 = CubicCentimetrer
	 * 
	 * @@
	 * 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Admittance</em>' containment reference.
	 * @see #setMaximumAdmittance(AdmittanceType)
	 * @see com.himsa.measurement.admittance._501._501Package#getTympanogramTestType_MaximumAdmittance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MaximumAdmittance' namespace='##targetNamespace'"
	 * @generated
	 */
	AdmittanceType getMaximumAdmittance();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.TympanogramTestType#getMaximumAdmittance <em>Maximum Admittance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Admittance</em>' containment reference.
	 * @see #getMaximumAdmittance()
	 * @generated
	 */
	void setMaximumAdmittance(AdmittanceType value);

	/**
	 * Returns the value of the '<em><b>Canal Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * canalVolume /  Ear canal volumes are in the range of [0.30 .. 1.00] ccm in children and
	 * [0.65 .. 1.75] ccm in adults. Katz pg 180. 
	 * 
	 * The admittance equivalent to the Ear canal volume is conventionally subtracted from measures of total aural admittance to yield an estimate of the middle ear admittance. This is referred to as compensated admittance.
	 * 
	 * The volume is given by the formula
	 * 
	 * Ve = γ . ps . Ca = ρ . c2 . Ca = γ . ps . Ya/(2 . pi . f)
	 * 
	 * +Ve / is the equivalent volume in m3
	 * +γ / is the ratio of specific heat for air at constant pressure to that at constant volume, approximately 1.40.
	 * +ps / is the barometric pressure in Pa, normal pressure 0.1013 MPa.
	 * +ρ / is the ambient density of air in kg/m3, at the temperature and pressure of the measurement
	 * +c / is the speed of sound in m/s at the temperature and pressure of the measurement
	 * +Ca / is the acoustic compliance in m3/Pa
	 * + Ya / is the magnitude of the acoustic admittance in m3/(Pa⋅s)
	 * + f / is the probetone frequency in Hz
	 * 
	 * In normal used units (Ve in ml, Ya in mmho and f in Hz) this can be approximated as:
	 * Ve [ml] =  Ya . f / 226
	 * 
	 * +Note 1 / The ear canal volume equivalent is valid at the probe tone frequency 226 Hz.
	 * +Note 2 / The equivalent volume of air is equal to its physical value for values not exceeding 5 ccm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Canal Volume</em>' containment reference.
	 * @see #setCanalVolume(AdmittanceType)
	 * @see com.himsa.measurement.admittance._501._501Package#getTympanogramTestType_CanalVolume()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CanalVolume' namespace='##targetNamespace'"
	 * @generated
	 */
	AdmittanceType getCanalVolume();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.TympanogramTestType#getCanalVolume <em>Canal Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canal Volume</em>' containment reference.
	 * @see #getCanalVolume()
	 * @generated
	 */
	void setCanalVolume(AdmittanceType value);

	/**
	 * Returns the value of the '<em><b>Gradient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gradient of the admittance curve
	 * 
	 * 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gradient</em>' containment reference.
	 * @see #setGradient(GradientType)
	 * @see com.himsa.measurement.admittance._501._501Package#getTympanogramTestType_Gradient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Gradient' namespace='##targetNamespace'"
	 * @generated
	 */
	GradientType getGradient();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.TympanogramTestType#getGradient <em>Gradient</em>}' containment reference.
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
	 * 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pressure</em>' attribute.
	 * @see #setPressure(BigInteger)
	 * @see com.himsa.measurement.admittance._501._501Package#getTympanogramTestType_Pressure()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='Pressure' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPressure();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.TympanogramTestType#getPressure <em>Pressure</em>}' attribute.
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
	 * 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resonance Frequency</em>' attribute.
	 * @see #setResonanceFrequency(BigInteger)
	 * @see com.himsa.measurement.admittance._501._501Package#getTympanogramTestType_ResonanceFrequency()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='ResonanceFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getResonanceFrequency();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.TympanogramTestType#getResonanceFrequency <em>Resonance Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resonance Frequency</em>' attribute.
	 * @see #getResonanceFrequency()
	 * @generated
	 */
	void setResonanceFrequency(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * The literals are from the enumeration {@link com.himsa.measurement.admittance._501.TympanogramResultType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Jerger 1970 classified the shapes of tympanograms and this system is still commonly used today and is applicable only to a 226Hz probe test.
	 * 
	 * See TympanogramResults_Type for further information
	 * Katz pg 177
	 * 
	 * 
	 * 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see com.himsa.measurement.admittance._501.TympanogramResultType
	 * @see #isSetResult()
	 * @see #unsetResult()
	 * @see #setResult(TympanogramResultType)
	 * @see com.himsa.measurement.admittance._501._501Package#getTympanogramTestType_Result()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Result' namespace='##targetNamespace'"
	 * @generated
	 */
	TympanogramResultType getResult();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.TympanogramTestType#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see com.himsa.measurement.admittance._501.TympanogramResultType
	 * @see #isSetResult()
	 * @see #unsetResult()
	 * @see #getResult()
	 * @generated
	 */
	void setResult(TympanogramResultType value);

	/**
	 * Unsets the value of the '{@link com.himsa.measurement.admittance._501.TympanogramTestType#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResult()
	 * @see #getResult()
	 * @see #setResult(TympanogramResultType)
	 * @generated
	 */
	void unsetResult();

	/**
	 * Returns whether the value of the '{@link com.himsa.measurement.admittance._501.TympanogramTestType#getResult <em>Result</em>}' attribute is set.
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
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measurement Condition</em>' containment reference.
	 * @see #setMeasurementCondition(TympanogramMeasurementConditionsType)
	 * @see com.himsa.measurement.admittance._501._501Package#getTympanogramTestType_MeasurementCondition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MeasurementCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	TympanogramMeasurementConditionsType getMeasurementCondition();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.TympanogramTestType#getMeasurementCondition <em>Measurement Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Condition</em>' containment reference.
	 * @see #getMeasurementCondition()
	 * @generated
	 */
	void setMeasurementCondition(TympanogramMeasurementConditionsType value);

	/**
	 * Returns the value of the '<em><b>Static Admittance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Also known as peak compensated static acoustic admittance. This is the height of the peak measured from the positive tail (typically +200daPa) to the peak. The term compensated means the admittance at the positive tail, which is used as an estimate of ear canal volume, has been removed from the measurement of peak height. 
	 * 
	 * @@ Convert 501  500
	 * This value was first introduced in format 501.
	 * When converting down the value will be discarded
	 * @@
	 * 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static Admittance</em>' containment reference.
	 * @see #setStaticAdmittance(StaticAdmittanceType)
	 * @see com.himsa.measurement.admittance._501._501Package#getTympanogramTestType_StaticAdmittance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StaticAdmittance' namespace='##targetNamespace'"
	 * @generated
	 */
	StaticAdmittanceType getStaticAdmittance();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.TympanogramTestType#getStaticAdmittance <em>Static Admittance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Admittance</em>' containment reference.
	 * @see #getStaticAdmittance()
	 * @generated
	 */
	void setStaticAdmittance(StaticAdmittanceType value);

} // TympanogramTestType
