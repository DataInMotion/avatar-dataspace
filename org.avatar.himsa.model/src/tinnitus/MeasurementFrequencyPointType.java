/*
 */
package tinnitus;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Frequency Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Measurement Point with Frequency and optional Intensity, bandwidth and pulseDuration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tinnitus.MeasurementFrequencyPointType#getStimulusFrequency <em>Stimulus Frequency</em>}</li>
 *   <li>{@link tinnitus.MeasurementFrequencyPointType#getStimulusIntensity <em>Stimulus Intensity</em>}</li>
 *   <li>{@link tinnitus.MeasurementFrequencyPointType#getStimulusBandwidth <em>Stimulus Bandwidth</em>}</li>
 *   <li>{@link tinnitus.MeasurementFrequencyPointType#getStimulusPulseDuration <em>Stimulus Pulse Duration</em>}</li>
 *   <li>{@link tinnitus.MeasurementFrequencyPointType#getMaskingFrequency <em>Masking Frequency</em>}</li>
 *   <li>{@link tinnitus.MeasurementFrequencyPointType#getMaskingIntensity <em>Masking Intensity</em>}</li>
 * </ul>
 *
 * @see tinnitus.TinnitusPackage#getMeasurementFrequencyPointType()
 * @model extendedMetaData="name='MeasurementFrequencyPoint_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MeasurementFrequencyPointType extends EObject {
	/**
	 * Returns the value of the '<em><b>Stimulus Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The frequency at which the measurement was done.
	 * ##freq## 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Frequency</em>' attribute.
	 * @see #setStimulusFrequency(BigInteger)
	 * @see tinnitus.TinnitusPackage#getMeasurementFrequencyPointType_StimulusFrequency()
	 * @model dataType="tinnitus.StimulusFrequencyType1" required="true"
	 *        extendedMetaData="kind='element' name='StimulusFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStimulusFrequency();

	/**
	 * Sets the value of the '{@link tinnitus.MeasurementFrequencyPointType#getStimulusFrequency <em>Stimulus Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Frequency</em>' attribute.
	 * @see #getStimulusFrequency()
	 * @generated
	 */
	void setStimulusFrequency(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Stimulus Intensity</b></em>' containment reference list.
	 * The list contents are of type {@link tinnitus.IntensityType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The signal intensity and unit used for the stimulus signals.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Intensity</em>' containment reference list.
	 * @see tinnitus.TinnitusPackage#getMeasurementFrequencyPointType_StimulusIntensity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StimulusIntensity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IntensityType1> getStimulusIntensity();

	/**
	 * Returns the value of the '<em><b>Stimulus Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The width of the shaped noise defined by upper and lower limits in Hz. Center of noise defined in frequency and level in intensity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Bandwidth</em>' containment reference.
	 * @see #setStimulusBandwidth(BandwidthType)
	 * @see tinnitus.TinnitusPackage#getMeasurementFrequencyPointType_StimulusBandwidth()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StimulusBandwidth' namespace='##targetNamespace'"
	 * @generated
	 */
	BandwidthType getStimulusBandwidth();

	/**
	 * Sets the value of the '{@link tinnitus.MeasurementFrequencyPointType#getStimulusBandwidth <em>Stimulus Bandwidth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Bandwidth</em>' containment reference.
	 * @see #getStimulusBandwidth()
	 * @generated
	 */
	void setStimulusBandwidth(BandwidthType value);

	/**
	 * Returns the value of the '<em><b>Stimulus Pulse Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Duration of acoustic signal when using pulsed stimuli in seconds. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulus Pulse Duration</em>' attribute.
	 * @see #setStimulusPulseDuration(BigDecimal)
	 * @see tinnitus.TinnitusPackage#getMeasurementFrequencyPointType_StimulusPulseDuration()
	 * @model dataType="tinnitus.StimulusPulseDurationType"
	 *        extendedMetaData="kind='element' name='StimulusPulseDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getStimulusPulseDuration();

	/**
	 * Sets the value of the '{@link tinnitus.MeasurementFrequencyPointType#getStimulusPulseDuration <em>Stimulus Pulse Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Pulse Duration</em>' attribute.
	 * @see #getStimulusPulseDuration()
	 * @generated
	 */
	void setStimulusPulseDuration(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Masking Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The frequency at which the measurement was done.
	 * ##freq## 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Frequency</em>' attribute.
	 * @see #setMaskingFrequency(BigInteger)
	 * @see tinnitus.TinnitusPackage#getMeasurementFrequencyPointType_MaskingFrequency()
	 * @model dataType="tinnitus.MaskingFrequencyType1"
	 *        extendedMetaData="kind='element' name='MaskingFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMaskingFrequency();

	/**
	 * Sets the value of the '{@link tinnitus.MeasurementFrequencyPointType#getMaskingFrequency <em>Masking Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masking Frequency</em>' attribute.
	 * @see #getMaskingFrequency()
	 * @generated
	 */
	void setMaskingFrequency(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Masking Intensity</b></em>' containment reference list.
	 * The list contents are of type {@link tinnitus.IntensityType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The signal intensity and unit used for the stimulus signals.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Masking Intensity</em>' containment reference list.
	 * @see tinnitus.TinnitusPackage#getMeasurementFrequencyPointType_MaskingIntensity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MaskingIntensity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IntensityType1> getMaskingIntensity();

} // MeasurementFrequencyPointType
