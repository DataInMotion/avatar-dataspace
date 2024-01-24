/*
 */
package impedance;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tympanogram Measurement Conditions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Measure Conditions (tymp)
 * ## TTyMeasCond ##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link impedance.TympanogramMeasurementConditionsType#getSweepSpeed <em>Sweep Speed</em>}</li>
 *   <li>{@link impedance.TympanogramMeasurementConditionsType#getRecordMode <em>Record Mode</em>}</li>
 *   <li>{@link impedance.TympanogramMeasurementConditionsType#getProbeFrequency <em>Probe Frequency</em>}</li>
 * </ul>
 *
 * @see impedance.ImpedancePackage#getTympanogramMeasurementConditionsType()
 * @model extendedMetaData="name='TympanogramMeasurementConditions_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TympanogramMeasurementConditionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Sweep Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change in the pressure in which the curve is recorded. Measured and saved in
	 * dekaPascal per second (daPa/s).
	 * 
	 * ## sweepSpeed ##
	 * 
	 * @@ REV 5 Converter Change 100>500
	 * If undefined, will be given the value -32767
	 * @@
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sweep Speed</em>' attribute.
	 * @see #setSweepSpeed(BigInteger)
	 * @see impedance.ImpedancePackage#getTympanogramMeasurementConditionsType_SweepSpeed()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='SweepSpeed' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getSweepSpeed();

	/**
	 * Sets the value of the '{@link impedance.TympanogramMeasurementConditionsType#getSweepSpeed <em>Sweep Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sweep Speed</em>' attribute.
	 * @see #getSweepSpeed()
	 * @generated
	 */
	void setSweepSpeed(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Record Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link impedance.RecordingModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How is the compliance curve recorded, Compensated or Non Compensated.
	 * 
	 * The admittance equivalent to the Ear canal volume is conventionally subtracted
	 * from measures of total aural admittance to yield an estimate of the middle ear
	 * admittance. This is referred to as compensated admittance. 
	 * 
	 * Katz pg 169
	 * 
	 * ## recordMode ##
	 * 
	 * @@ REV 5 Converter Change 100>500
	 * If undefined, will be given the value Compensated
	 * @@
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Record Mode</em>' attribute.
	 * @see impedance.RecordingModeType
	 * @see #isSetRecordMode()
	 * @see #unsetRecordMode()
	 * @see #setRecordMode(RecordingModeType)
	 * @see impedance.ImpedancePackage#getTympanogramMeasurementConditionsType_RecordMode()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='RecordMode' namespace='##targetNamespace'"
	 * @generated
	 */
	RecordingModeType getRecordMode();

	/**
	 * Sets the value of the '{@link impedance.TympanogramMeasurementConditionsType#getRecordMode <em>Record Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Mode</em>' attribute.
	 * @see impedance.RecordingModeType
	 * @see #isSetRecordMode()
	 * @see #unsetRecordMode()
	 * @see #getRecordMode()
	 * @generated
	 */
	void setRecordMode(RecordingModeType value);

	/**
	 * Unsets the value of the '{@link impedance.TympanogramMeasurementConditionsType#getRecordMode <em>Record Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRecordMode()
	 * @see #getRecordMode()
	 * @see #setRecordMode(RecordingModeType)
	 * @generated
	 */
	void unsetRecordMode();

	/**
	 * Returns whether the value of the '{@link impedance.TympanogramMeasurementConditionsType#getRecordMode <em>Record Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Record Mode</em>' attribute is set.
	 * @see #unsetRecordMode()
	 * @see #getRecordMode()
	 * @see #setRecordMode(RecordingModeType)
	 * @generated
	 */
	boolean isSetRecordMode();

	/**
	 * Returns the value of the '<em><b>Probe Frequency</b></em>' attribute.
	 * The default value is <code>"226"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Frequency of the probe tone
	 * 
	 * Format 100 defined this data as optional and if not specified was to be assumed to be a value of 226.  If the conversion DLL finds this value to be empty in a format 100 data record it will insert the value of 226.
	 * 
	 * @@ If reading format 100 and the field is empty then populate this element with the value of 226 @@
	 * 
	 * ## probeFreq ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Probe Frequency</em>' attribute.
	 * @see #isSetProbeFrequency()
	 * @see #unsetProbeFrequency()
	 * @see #setProbeFrequency(BigInteger)
	 * @see impedance.ImpedancePackage#getTympanogramMeasurementConditionsType_ProbeFrequency()
	 * @model default="226" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='ProbeFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getProbeFrequency();

	/**
	 * Sets the value of the '{@link impedance.TympanogramMeasurementConditionsType#getProbeFrequency <em>Probe Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probe Frequency</em>' attribute.
	 * @see #isSetProbeFrequency()
	 * @see #unsetProbeFrequency()
	 * @see #getProbeFrequency()
	 * @generated
	 */
	void setProbeFrequency(BigInteger value);

	/**
	 * Unsets the value of the '{@link impedance.TympanogramMeasurementConditionsType#getProbeFrequency <em>Probe Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProbeFrequency()
	 * @see #getProbeFrequency()
	 * @see #setProbeFrequency(BigInteger)
	 * @generated
	 */
	void unsetProbeFrequency();

	/**
	 * Returns whether the value of the '{@link impedance.TympanogramMeasurementConditionsType#getProbeFrequency <em>Probe Frequency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Probe Frequency</em>' attribute is set.
	 * @see #unsetProbeFrequency()
	 * @see #getProbeFrequency()
	 * @see #setProbeFrequency(BigInteger)
	 * @generated
	 */
	boolean isSetProbeFrequency();

} // TympanogramMeasurementConditionsType
