/*
 */
package tinnitus.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tinnitus.BandwidthType;
import tinnitus.IntensityType1;
import tinnitus.MeasurementFrequencyPointType;
import tinnitus.TinnitusPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement Frequency Point Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tinnitus.impl.MeasurementFrequencyPointTypeImpl#getStimulusFrequency <em>Stimulus Frequency</em>}</li>
 *   <li>{@link tinnitus.impl.MeasurementFrequencyPointTypeImpl#getStimulusIntensity <em>Stimulus Intensity</em>}</li>
 *   <li>{@link tinnitus.impl.MeasurementFrequencyPointTypeImpl#getStimulusBandwidth <em>Stimulus Bandwidth</em>}</li>
 *   <li>{@link tinnitus.impl.MeasurementFrequencyPointTypeImpl#getStimulusPulseDuration <em>Stimulus Pulse Duration</em>}</li>
 *   <li>{@link tinnitus.impl.MeasurementFrequencyPointTypeImpl#getMaskingFrequency <em>Masking Frequency</em>}</li>
 *   <li>{@link tinnitus.impl.MeasurementFrequencyPointTypeImpl#getMaskingIntensity <em>Masking Intensity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementFrequencyPointTypeImpl extends MinimalEObjectImpl.Container implements MeasurementFrequencyPointType {
	/**
	 * The default value of the '{@link #getStimulusFrequency() <em>Stimulus Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger STIMULUS_FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStimulusFrequency() <em>Stimulus Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusFrequency()
	 * @generated
	 * @ordered
	 */
	protected BigInteger stimulusFrequency = STIMULUS_FREQUENCY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStimulusIntensity() <em>Stimulus Intensity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusIntensity()
	 * @generated
	 * @ordered
	 */
	protected EList<IntensityType1> stimulusIntensity;

	/**
	 * The cached value of the '{@link #getStimulusBandwidth() <em>Stimulus Bandwidth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusBandwidth()
	 * @generated
	 * @ordered
	 */
	protected BandwidthType stimulusBandwidth;

	/**
	 * The default value of the '{@link #getStimulusPulseDuration() <em>Stimulus Pulse Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusPulseDuration()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal STIMULUS_PULSE_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStimulusPulseDuration() <em>Stimulus Pulse Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusPulseDuration()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal stimulusPulseDuration = STIMULUS_PULSE_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaskingFrequency() <em>Masking Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MASKING_FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaskingFrequency() <em>Masking Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingFrequency()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maskingFrequency = MASKING_FREQUENCY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMaskingIntensity() <em>Masking Intensity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingIntensity()
	 * @generated
	 * @ordered
	 */
	protected EList<IntensityType1> maskingIntensity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementFrequencyPointTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TinnitusPackage.Literals.MEASUREMENT_FREQUENCY_POINT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getStimulusFrequency() {
		return stimulusFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulusFrequency(BigInteger newStimulusFrequency) {
		BigInteger oldStimulusFrequency = stimulusFrequency;
		stimulusFrequency = newStimulusFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_FREQUENCY, oldStimulusFrequency, stimulusFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IntensityType1> getStimulusIntensity() {
		if (stimulusIntensity == null) {
			stimulusIntensity = new EObjectContainmentEList<IntensityType1>(IntensityType1.class, this, TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_INTENSITY);
		}
		return stimulusIntensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BandwidthType getStimulusBandwidth() {
		return stimulusBandwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStimulusBandwidth(BandwidthType newStimulusBandwidth, NotificationChain msgs) {
		BandwidthType oldStimulusBandwidth = stimulusBandwidth;
		stimulusBandwidth = newStimulusBandwidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_BANDWIDTH, oldStimulusBandwidth, newStimulusBandwidth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulusBandwidth(BandwidthType newStimulusBandwidth) {
		if (newStimulusBandwidth != stimulusBandwidth) {
			NotificationChain msgs = null;
			if (stimulusBandwidth != null)
				msgs = ((InternalEObject)stimulusBandwidth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_BANDWIDTH, null, msgs);
			if (newStimulusBandwidth != null)
				msgs = ((InternalEObject)newStimulusBandwidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_BANDWIDTH, null, msgs);
			msgs = basicSetStimulusBandwidth(newStimulusBandwidth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_BANDWIDTH, newStimulusBandwidth, newStimulusBandwidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getStimulusPulseDuration() {
		return stimulusPulseDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulusPulseDuration(BigDecimal newStimulusPulseDuration) {
		BigDecimal oldStimulusPulseDuration = stimulusPulseDuration;
		stimulusPulseDuration = newStimulusPulseDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_PULSE_DURATION, oldStimulusPulseDuration, stimulusPulseDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getMaskingFrequency() {
		return maskingFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaskingFrequency(BigInteger newMaskingFrequency) {
		BigInteger oldMaskingFrequency = maskingFrequency;
		maskingFrequency = newMaskingFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__MASKING_FREQUENCY, oldMaskingFrequency, maskingFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IntensityType1> getMaskingIntensity() {
		if (maskingIntensity == null) {
			maskingIntensity = new EObjectContainmentEList<IntensityType1>(IntensityType1.class, this, TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__MASKING_INTENSITY);
		}
		return maskingIntensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_INTENSITY:
				return ((InternalEList<?>)getStimulusIntensity()).basicRemove(otherEnd, msgs);
			case TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_BANDWIDTH:
				return basicSetStimulusBandwidth(null, msgs);
			case TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__MASKING_INTENSITY:
				return ((InternalEList<?>)getMaskingIntensity()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_FREQUENCY:
				return getStimulusFrequency();
			case TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_INTENSITY:
				return getStimulusIntensity();
			case TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_BANDWIDTH:
				return getStimulusBandwidth();
			case TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_PULSE_DURATION:
				return getStimulusPulseDuration();
			case TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__MASKING_FREQUENCY:
				return getMaskingFrequency();
			case TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__MASKING_INTENSITY:
				return getMaskingIntensity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_FREQUENCY:
				setStimulusFrequency((BigInteger)newValue);
				return;
			case TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_INTENSITY:
				getStimulusIntensity().clear();
				getStimulusIntensity().addAll((Collection<? extends IntensityType1>)newValue);
				return;
			case TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_BANDWIDTH:
				setStimulusBandwidth((BandwidthType)newValue);
				return;
			case TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_PULSE_DURATION:
				setStimulusPulseDuration((BigDecimal)newValue);
				return;
			case TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__MASKING_FREQUENCY:
				setMaskingFrequency((BigInteger)newValue);
				return;
			case TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__MASKING_INTENSITY:
				getMaskingIntensity().clear();
				getMaskingIntensity().addAll((Collection<? extends IntensityType1>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_FREQUENCY:
				setStimulusFrequency(STIMULUS_FREQUENCY_EDEFAULT);
				return;
			case TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_INTENSITY:
				getStimulusIntensity().clear();
				return;
			case TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_BANDWIDTH:
				setStimulusBandwidth((BandwidthType)null);
				return;
			case TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_PULSE_DURATION:
				setStimulusPulseDuration(STIMULUS_PULSE_DURATION_EDEFAULT);
				return;
			case TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__MASKING_FREQUENCY:
				setMaskingFrequency(MASKING_FREQUENCY_EDEFAULT);
				return;
			case TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__MASKING_INTENSITY:
				getMaskingIntensity().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_FREQUENCY:
				return STIMULUS_FREQUENCY_EDEFAULT == null ? stimulusFrequency != null : !STIMULUS_FREQUENCY_EDEFAULT.equals(stimulusFrequency);
			case TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_INTENSITY:
				return stimulusIntensity != null && !stimulusIntensity.isEmpty();
			case TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_BANDWIDTH:
				return stimulusBandwidth != null;
			case TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__STIMULUS_PULSE_DURATION:
				return STIMULUS_PULSE_DURATION_EDEFAULT == null ? stimulusPulseDuration != null : !STIMULUS_PULSE_DURATION_EDEFAULT.equals(stimulusPulseDuration);
			case TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__MASKING_FREQUENCY:
				return MASKING_FREQUENCY_EDEFAULT == null ? maskingFrequency != null : !MASKING_FREQUENCY_EDEFAULT.equals(maskingFrequency);
			case TinnitusPackage.MEASUREMENT_FREQUENCY_POINT_TYPE__MASKING_INTENSITY:
				return maskingIntensity != null && !maskingIntensity.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (stimulusFrequency: ");
		result.append(stimulusFrequency);
		result.append(", stimulusPulseDuration: ");
		result.append(stimulusPulseDuration);
		result.append(", maskingFrequency: ");
		result.append(maskingFrequency);
		result.append(')');
		return result.toString();
	}

} //MeasurementFrequencyPointTypeImpl
