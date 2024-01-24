/*
 */
package com.himsa.measurement.tinnitus._500.impl;

import com.himsa.measurement.tinnitus._500.IntensityType1;
import com.himsa.measurement.tinnitus._500.MeasurementIntensityPointType;
import com.himsa.measurement.tinnitus._500._500Package;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement Intensity Point Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.MeasurementIntensityPointTypeImpl#getStimulusIntensity <em>Stimulus Intensity</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.MeasurementIntensityPointTypeImpl#getStimulusFrequency <em>Stimulus Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.MeasurementIntensityPointTypeImpl#getMaskingFrequency <em>Masking Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.MeasurementIntensityPointTypeImpl#getMaskingIntensity <em>Masking Intensity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementIntensityPointTypeImpl extends MinimalEObjectImpl.Container implements MeasurementIntensityPointType {
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
	protected MeasurementIntensityPointTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _500Package.Literals.MEASUREMENT_INTENSITY_POINT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IntensityType1> getStimulusIntensity() {
		if (stimulusIntensity == null) {
			stimulusIntensity = new EObjectContainmentEList<IntensityType1>(IntensityType1.class, this, _500Package.MEASUREMENT_INTENSITY_POINT_TYPE__STIMULUS_INTENSITY);
		}
		return stimulusIntensity;
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
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.MEASUREMENT_INTENSITY_POINT_TYPE__STIMULUS_FREQUENCY, oldStimulusFrequency, stimulusFrequency));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.MEASUREMENT_INTENSITY_POINT_TYPE__MASKING_FREQUENCY, oldMaskingFrequency, maskingFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IntensityType1> getMaskingIntensity() {
		if (maskingIntensity == null) {
			maskingIntensity = new EObjectContainmentEList<IntensityType1>(IntensityType1.class, this, _500Package.MEASUREMENT_INTENSITY_POINT_TYPE__MASKING_INTENSITY);
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
			case _500Package.MEASUREMENT_INTENSITY_POINT_TYPE__STIMULUS_INTENSITY:
				return ((InternalEList<?>)getStimulusIntensity()).basicRemove(otherEnd, msgs);
			case _500Package.MEASUREMENT_INTENSITY_POINT_TYPE__MASKING_INTENSITY:
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
			case _500Package.MEASUREMENT_INTENSITY_POINT_TYPE__STIMULUS_INTENSITY:
				return getStimulusIntensity();
			case _500Package.MEASUREMENT_INTENSITY_POINT_TYPE__STIMULUS_FREQUENCY:
				return getStimulusFrequency();
			case _500Package.MEASUREMENT_INTENSITY_POINT_TYPE__MASKING_FREQUENCY:
				return getMaskingFrequency();
			case _500Package.MEASUREMENT_INTENSITY_POINT_TYPE__MASKING_INTENSITY:
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
			case _500Package.MEASUREMENT_INTENSITY_POINT_TYPE__STIMULUS_INTENSITY:
				getStimulusIntensity().clear();
				getStimulusIntensity().addAll((Collection<? extends IntensityType1>)newValue);
				return;
			case _500Package.MEASUREMENT_INTENSITY_POINT_TYPE__STIMULUS_FREQUENCY:
				setStimulusFrequency((BigInteger)newValue);
				return;
			case _500Package.MEASUREMENT_INTENSITY_POINT_TYPE__MASKING_FREQUENCY:
				setMaskingFrequency((BigInteger)newValue);
				return;
			case _500Package.MEASUREMENT_INTENSITY_POINT_TYPE__MASKING_INTENSITY:
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
			case _500Package.MEASUREMENT_INTENSITY_POINT_TYPE__STIMULUS_INTENSITY:
				getStimulusIntensity().clear();
				return;
			case _500Package.MEASUREMENT_INTENSITY_POINT_TYPE__STIMULUS_FREQUENCY:
				setStimulusFrequency(STIMULUS_FREQUENCY_EDEFAULT);
				return;
			case _500Package.MEASUREMENT_INTENSITY_POINT_TYPE__MASKING_FREQUENCY:
				setMaskingFrequency(MASKING_FREQUENCY_EDEFAULT);
				return;
			case _500Package.MEASUREMENT_INTENSITY_POINT_TYPE__MASKING_INTENSITY:
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
			case _500Package.MEASUREMENT_INTENSITY_POINT_TYPE__STIMULUS_INTENSITY:
				return stimulusIntensity != null && !stimulusIntensity.isEmpty();
			case _500Package.MEASUREMENT_INTENSITY_POINT_TYPE__STIMULUS_FREQUENCY:
				return STIMULUS_FREQUENCY_EDEFAULT == null ? stimulusFrequency != null : !STIMULUS_FREQUENCY_EDEFAULT.equals(stimulusFrequency);
			case _500Package.MEASUREMENT_INTENSITY_POINT_TYPE__MASKING_FREQUENCY:
				return MASKING_FREQUENCY_EDEFAULT == null ? maskingFrequency != null : !MASKING_FREQUENCY_EDEFAULT.equals(maskingFrequency);
			case _500Package.MEASUREMENT_INTENSITY_POINT_TYPE__MASKING_INTENSITY:
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
		result.append(", maskingFrequency: ");
		result.append(maskingFrequency);
		result.append(')');
		return result.toString();
	}

} //MeasurementIntensityPointTypeImpl
