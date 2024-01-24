/*
 */
package com.himsa.measurement.tinnitus._500.impl;

import com.himsa.measurement.tinnitus._500.MeasurementConditionsType;
import com.himsa.measurement.tinnitus._500.MeasurementIntensityPointType;
import com.himsa.measurement.tinnitus._500.ResidualInhibitionType;
import com.himsa.measurement.tinnitus._500.TinnitusInhibitionSucessType;
import com.himsa.measurement.tinnitus._500.TinnitusPerceptionLocationType;
import com.himsa.measurement.tinnitus._500._500Package;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Residual Inhibition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.ResidualInhibitionTypeImpl#getMeasurementConditions <em>Measurement Conditions</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.ResidualInhibitionTypeImpl#getSignalIntensity <em>Signal Intensity</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.ResidualInhibitionTypeImpl#getStimulusExposureTime <em>Stimulus Exposure Time</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.ResidualInhibitionTypeImpl#getInhibitionTime <em>Inhibition Time</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.ResidualInhibitionTypeImpl#getPulseDuration <em>Pulse Duration</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.ResidualInhibitionTypeImpl#getGapDuration <em>Gap Duration</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.ResidualInhibitionTypeImpl#getNumberOfCycles <em>Number Of Cycles</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.ResidualInhibitionTypeImpl#getInhibitionSuccess <em>Inhibition Success</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.ResidualInhibitionTypeImpl#getPerceptionLocation <em>Perception Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResidualInhibitionTypeImpl extends MinimalEObjectImpl.Container implements ResidualInhibitionType {
	/**
	 * The cached value of the '{@link #getMeasurementConditions() <em>Measurement Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementConditions()
	 * @generated
	 * @ordered
	 */
	protected MeasurementConditionsType measurementConditions;

	/**
	 * The cached value of the '{@link #getSignalIntensity() <em>Signal Intensity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalIntensity()
	 * @generated
	 * @ordered
	 */
	protected MeasurementIntensityPointType signalIntensity;

	/**
	 * The default value of the '{@link #getStimulusExposureTime() <em>Stimulus Exposure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusExposureTime()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal STIMULUS_EXPOSURE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStimulusExposureTime() <em>Stimulus Exposure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusExposureTime()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal stimulusExposureTime = STIMULUS_EXPOSURE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInhibitionTime() <em>Inhibition Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInhibitionTime()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal INHIBITION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInhibitionTime() <em>Inhibition Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInhibitionTime()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal inhibitionTime = INHIBITION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPulseDuration() <em>Pulse Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPulseDuration()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PULSE_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPulseDuration() <em>Pulse Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPulseDuration()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal pulseDuration = PULSE_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getGapDuration() <em>Gap Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGapDuration()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal GAP_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGapDuration() <em>Gap Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGapDuration()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal gapDuration = GAP_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfCycles() <em>Number Of Cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfCycles()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_OF_CYCLES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfCycles() <em>Number Of Cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfCycles()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numberOfCycles = NUMBER_OF_CYCLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getInhibitionSuccess() <em>Inhibition Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInhibitionSuccess()
	 * @generated
	 * @ordered
	 */
	protected static final TinnitusInhibitionSucessType INHIBITION_SUCCESS_EDEFAULT = TinnitusInhibitionSucessType.PARTIAL;

	/**
	 * The cached value of the '{@link #getInhibitionSuccess() <em>Inhibition Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInhibitionSuccess()
	 * @generated
	 * @ordered
	 */
	protected TinnitusInhibitionSucessType inhibitionSuccess = INHIBITION_SUCCESS_EDEFAULT;

	/**
	 * This is true if the Inhibition Success attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inhibitionSuccessESet;

	/**
	 * The default value of the '{@link #getPerceptionLocation() <em>Perception Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerceptionLocation()
	 * @generated
	 * @ordered
	 */
	protected static final TinnitusPerceptionLocationType PERCEPTION_LOCATION_EDEFAULT = TinnitusPerceptionLocationType.CENTRAL;

	/**
	 * The cached value of the '{@link #getPerceptionLocation() <em>Perception Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerceptionLocation()
	 * @generated
	 * @ordered
	 */
	protected TinnitusPerceptionLocationType perceptionLocation = PERCEPTION_LOCATION_EDEFAULT;

	/**
	 * This is true if the Perception Location attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean perceptionLocationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResidualInhibitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _500Package.Literals.RESIDUAL_INHIBITION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementConditionsType getMeasurementConditions() {
		return measurementConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementConditions(MeasurementConditionsType newMeasurementConditions, NotificationChain msgs) {
		MeasurementConditionsType oldMeasurementConditions = measurementConditions;
		measurementConditions = newMeasurementConditions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _500Package.RESIDUAL_INHIBITION_TYPE__MEASUREMENT_CONDITIONS, oldMeasurementConditions, newMeasurementConditions);
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
	public void setMeasurementConditions(MeasurementConditionsType newMeasurementConditions) {
		if (newMeasurementConditions != measurementConditions) {
			NotificationChain msgs = null;
			if (measurementConditions != null)
				msgs = ((InternalEObject)measurementConditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _500Package.RESIDUAL_INHIBITION_TYPE__MEASUREMENT_CONDITIONS, null, msgs);
			if (newMeasurementConditions != null)
				msgs = ((InternalEObject)newMeasurementConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _500Package.RESIDUAL_INHIBITION_TYPE__MEASUREMENT_CONDITIONS, null, msgs);
			msgs = basicSetMeasurementConditions(newMeasurementConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.RESIDUAL_INHIBITION_TYPE__MEASUREMENT_CONDITIONS, newMeasurementConditions, newMeasurementConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementIntensityPointType getSignalIntensity() {
		return signalIntensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalIntensity(MeasurementIntensityPointType newSignalIntensity, NotificationChain msgs) {
		MeasurementIntensityPointType oldSignalIntensity = signalIntensity;
		signalIntensity = newSignalIntensity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _500Package.RESIDUAL_INHIBITION_TYPE__SIGNAL_INTENSITY, oldSignalIntensity, newSignalIntensity);
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
	public void setSignalIntensity(MeasurementIntensityPointType newSignalIntensity) {
		if (newSignalIntensity != signalIntensity) {
			NotificationChain msgs = null;
			if (signalIntensity != null)
				msgs = ((InternalEObject)signalIntensity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _500Package.RESIDUAL_INHIBITION_TYPE__SIGNAL_INTENSITY, null, msgs);
			if (newSignalIntensity != null)
				msgs = ((InternalEObject)newSignalIntensity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _500Package.RESIDUAL_INHIBITION_TYPE__SIGNAL_INTENSITY, null, msgs);
			msgs = basicSetSignalIntensity(newSignalIntensity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.RESIDUAL_INHIBITION_TYPE__SIGNAL_INTENSITY, newSignalIntensity, newSignalIntensity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getStimulusExposureTime() {
		return stimulusExposureTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulusExposureTime(BigDecimal newStimulusExposureTime) {
		BigDecimal oldStimulusExposureTime = stimulusExposureTime;
		stimulusExposureTime = newStimulusExposureTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.RESIDUAL_INHIBITION_TYPE__STIMULUS_EXPOSURE_TIME, oldStimulusExposureTime, stimulusExposureTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getInhibitionTime() {
		return inhibitionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInhibitionTime(BigDecimal newInhibitionTime) {
		BigDecimal oldInhibitionTime = inhibitionTime;
		inhibitionTime = newInhibitionTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.RESIDUAL_INHIBITION_TYPE__INHIBITION_TIME, oldInhibitionTime, inhibitionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getPulseDuration() {
		return pulseDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPulseDuration(BigDecimal newPulseDuration) {
		BigDecimal oldPulseDuration = pulseDuration;
		pulseDuration = newPulseDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.RESIDUAL_INHIBITION_TYPE__PULSE_DURATION, oldPulseDuration, pulseDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getGapDuration() {
		return gapDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGapDuration(BigDecimal newGapDuration) {
		BigDecimal oldGapDuration = gapDuration;
		gapDuration = newGapDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.RESIDUAL_INHIBITION_TYPE__GAP_DURATION, oldGapDuration, gapDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getNumberOfCycles() {
		return numberOfCycles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfCycles(BigInteger newNumberOfCycles) {
		BigInteger oldNumberOfCycles = numberOfCycles;
		numberOfCycles = newNumberOfCycles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.RESIDUAL_INHIBITION_TYPE__NUMBER_OF_CYCLES, oldNumberOfCycles, numberOfCycles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TinnitusInhibitionSucessType getInhibitionSuccess() {
		return inhibitionSuccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInhibitionSuccess(TinnitusInhibitionSucessType newInhibitionSuccess) {
		TinnitusInhibitionSucessType oldInhibitionSuccess = inhibitionSuccess;
		inhibitionSuccess = newInhibitionSuccess == null ? INHIBITION_SUCCESS_EDEFAULT : newInhibitionSuccess;
		boolean oldInhibitionSuccessESet = inhibitionSuccessESet;
		inhibitionSuccessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.RESIDUAL_INHIBITION_TYPE__INHIBITION_SUCCESS, oldInhibitionSuccess, inhibitionSuccess, !oldInhibitionSuccessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetInhibitionSuccess() {
		TinnitusInhibitionSucessType oldInhibitionSuccess = inhibitionSuccess;
		boolean oldInhibitionSuccessESet = inhibitionSuccessESet;
		inhibitionSuccess = INHIBITION_SUCCESS_EDEFAULT;
		inhibitionSuccessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _500Package.RESIDUAL_INHIBITION_TYPE__INHIBITION_SUCCESS, oldInhibitionSuccess, INHIBITION_SUCCESS_EDEFAULT, oldInhibitionSuccessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInhibitionSuccess() {
		return inhibitionSuccessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TinnitusPerceptionLocationType getPerceptionLocation() {
		return perceptionLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerceptionLocation(TinnitusPerceptionLocationType newPerceptionLocation) {
		TinnitusPerceptionLocationType oldPerceptionLocation = perceptionLocation;
		perceptionLocation = newPerceptionLocation == null ? PERCEPTION_LOCATION_EDEFAULT : newPerceptionLocation;
		boolean oldPerceptionLocationESet = perceptionLocationESet;
		perceptionLocationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.RESIDUAL_INHIBITION_TYPE__PERCEPTION_LOCATION, oldPerceptionLocation, perceptionLocation, !oldPerceptionLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPerceptionLocation() {
		TinnitusPerceptionLocationType oldPerceptionLocation = perceptionLocation;
		boolean oldPerceptionLocationESet = perceptionLocationESet;
		perceptionLocation = PERCEPTION_LOCATION_EDEFAULT;
		perceptionLocationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _500Package.RESIDUAL_INHIBITION_TYPE__PERCEPTION_LOCATION, oldPerceptionLocation, PERCEPTION_LOCATION_EDEFAULT, oldPerceptionLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPerceptionLocation() {
		return perceptionLocationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _500Package.RESIDUAL_INHIBITION_TYPE__MEASUREMENT_CONDITIONS:
				return basicSetMeasurementConditions(null, msgs);
			case _500Package.RESIDUAL_INHIBITION_TYPE__SIGNAL_INTENSITY:
				return basicSetSignalIntensity(null, msgs);
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
			case _500Package.RESIDUAL_INHIBITION_TYPE__MEASUREMENT_CONDITIONS:
				return getMeasurementConditions();
			case _500Package.RESIDUAL_INHIBITION_TYPE__SIGNAL_INTENSITY:
				return getSignalIntensity();
			case _500Package.RESIDUAL_INHIBITION_TYPE__STIMULUS_EXPOSURE_TIME:
				return getStimulusExposureTime();
			case _500Package.RESIDUAL_INHIBITION_TYPE__INHIBITION_TIME:
				return getInhibitionTime();
			case _500Package.RESIDUAL_INHIBITION_TYPE__PULSE_DURATION:
				return getPulseDuration();
			case _500Package.RESIDUAL_INHIBITION_TYPE__GAP_DURATION:
				return getGapDuration();
			case _500Package.RESIDUAL_INHIBITION_TYPE__NUMBER_OF_CYCLES:
				return getNumberOfCycles();
			case _500Package.RESIDUAL_INHIBITION_TYPE__INHIBITION_SUCCESS:
				return getInhibitionSuccess();
			case _500Package.RESIDUAL_INHIBITION_TYPE__PERCEPTION_LOCATION:
				return getPerceptionLocation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _500Package.RESIDUAL_INHIBITION_TYPE__MEASUREMENT_CONDITIONS:
				setMeasurementConditions((MeasurementConditionsType)newValue);
				return;
			case _500Package.RESIDUAL_INHIBITION_TYPE__SIGNAL_INTENSITY:
				setSignalIntensity((MeasurementIntensityPointType)newValue);
				return;
			case _500Package.RESIDUAL_INHIBITION_TYPE__STIMULUS_EXPOSURE_TIME:
				setStimulusExposureTime((BigDecimal)newValue);
				return;
			case _500Package.RESIDUAL_INHIBITION_TYPE__INHIBITION_TIME:
				setInhibitionTime((BigDecimal)newValue);
				return;
			case _500Package.RESIDUAL_INHIBITION_TYPE__PULSE_DURATION:
				setPulseDuration((BigDecimal)newValue);
				return;
			case _500Package.RESIDUAL_INHIBITION_TYPE__GAP_DURATION:
				setGapDuration((BigDecimal)newValue);
				return;
			case _500Package.RESIDUAL_INHIBITION_TYPE__NUMBER_OF_CYCLES:
				setNumberOfCycles((BigInteger)newValue);
				return;
			case _500Package.RESIDUAL_INHIBITION_TYPE__INHIBITION_SUCCESS:
				setInhibitionSuccess((TinnitusInhibitionSucessType)newValue);
				return;
			case _500Package.RESIDUAL_INHIBITION_TYPE__PERCEPTION_LOCATION:
				setPerceptionLocation((TinnitusPerceptionLocationType)newValue);
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
			case _500Package.RESIDUAL_INHIBITION_TYPE__MEASUREMENT_CONDITIONS:
				setMeasurementConditions((MeasurementConditionsType)null);
				return;
			case _500Package.RESIDUAL_INHIBITION_TYPE__SIGNAL_INTENSITY:
				setSignalIntensity((MeasurementIntensityPointType)null);
				return;
			case _500Package.RESIDUAL_INHIBITION_TYPE__STIMULUS_EXPOSURE_TIME:
				setStimulusExposureTime(STIMULUS_EXPOSURE_TIME_EDEFAULT);
				return;
			case _500Package.RESIDUAL_INHIBITION_TYPE__INHIBITION_TIME:
				setInhibitionTime(INHIBITION_TIME_EDEFAULT);
				return;
			case _500Package.RESIDUAL_INHIBITION_TYPE__PULSE_DURATION:
				setPulseDuration(PULSE_DURATION_EDEFAULT);
				return;
			case _500Package.RESIDUAL_INHIBITION_TYPE__GAP_DURATION:
				setGapDuration(GAP_DURATION_EDEFAULT);
				return;
			case _500Package.RESIDUAL_INHIBITION_TYPE__NUMBER_OF_CYCLES:
				setNumberOfCycles(NUMBER_OF_CYCLES_EDEFAULT);
				return;
			case _500Package.RESIDUAL_INHIBITION_TYPE__INHIBITION_SUCCESS:
				unsetInhibitionSuccess();
				return;
			case _500Package.RESIDUAL_INHIBITION_TYPE__PERCEPTION_LOCATION:
				unsetPerceptionLocation();
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
			case _500Package.RESIDUAL_INHIBITION_TYPE__MEASUREMENT_CONDITIONS:
				return measurementConditions != null;
			case _500Package.RESIDUAL_INHIBITION_TYPE__SIGNAL_INTENSITY:
				return signalIntensity != null;
			case _500Package.RESIDUAL_INHIBITION_TYPE__STIMULUS_EXPOSURE_TIME:
				return STIMULUS_EXPOSURE_TIME_EDEFAULT == null ? stimulusExposureTime != null : !STIMULUS_EXPOSURE_TIME_EDEFAULT.equals(stimulusExposureTime);
			case _500Package.RESIDUAL_INHIBITION_TYPE__INHIBITION_TIME:
				return INHIBITION_TIME_EDEFAULT == null ? inhibitionTime != null : !INHIBITION_TIME_EDEFAULT.equals(inhibitionTime);
			case _500Package.RESIDUAL_INHIBITION_TYPE__PULSE_DURATION:
				return PULSE_DURATION_EDEFAULT == null ? pulseDuration != null : !PULSE_DURATION_EDEFAULT.equals(pulseDuration);
			case _500Package.RESIDUAL_INHIBITION_TYPE__GAP_DURATION:
				return GAP_DURATION_EDEFAULT == null ? gapDuration != null : !GAP_DURATION_EDEFAULT.equals(gapDuration);
			case _500Package.RESIDUAL_INHIBITION_TYPE__NUMBER_OF_CYCLES:
				return NUMBER_OF_CYCLES_EDEFAULT == null ? numberOfCycles != null : !NUMBER_OF_CYCLES_EDEFAULT.equals(numberOfCycles);
			case _500Package.RESIDUAL_INHIBITION_TYPE__INHIBITION_SUCCESS:
				return isSetInhibitionSuccess();
			case _500Package.RESIDUAL_INHIBITION_TYPE__PERCEPTION_LOCATION:
				return isSetPerceptionLocation();
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
		result.append(" (stimulusExposureTime: ");
		result.append(stimulusExposureTime);
		result.append(", inhibitionTime: ");
		result.append(inhibitionTime);
		result.append(", pulseDuration: ");
		result.append(pulseDuration);
		result.append(", gapDuration: ");
		result.append(gapDuration);
		result.append(", numberOfCycles: ");
		result.append(numberOfCycles);
		result.append(", inhibitionSuccess: ");
		if (inhibitionSuccessESet) result.append(inhibitionSuccess); else result.append("<unset>");
		result.append(", perceptionLocation: ");
		if (perceptionLocationESet) result.append(perceptionLocation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ResidualInhibitionTypeImpl
