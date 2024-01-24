/*
 */
package com.himsa.measurement.audiogram._502.impl;

import com.himsa.measurement.audiogram._502.AdditionalMaskingType;
import com.himsa.measurement.audiogram._502.PointStatusType;
import com.himsa.measurement.audiogram._502.TonePointsType;
import com.himsa.measurement.audiogram._502._502Package;

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
 * An implementation of the model object '<em><b>Tone Points Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram._502.impl.TonePointsTypeImpl#getStimulusFrequency <em>Stimulus Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.impl.TonePointsTypeImpl#getStimulusLevel <em>Stimulus Level</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.impl.TonePointsTypeImpl#getMaskingFrequency <em>Masking Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.impl.TonePointsTypeImpl#getMaskingLevel <em>Masking Level</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.impl.TonePointsTypeImpl#getTonePointStatus <em>Tone Point Status</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.impl.TonePointsTypeImpl#getAdditionalMaskingPoint <em>Additional Masking Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TonePointsTypeImpl extends MinimalEObjectImpl.Container implements TonePointsType {
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
	 * The default value of the '{@link #getStimulusLevel() <em>Stimulus Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal STIMULUS_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStimulusLevel() <em>Stimulus Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusLevel()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal stimulusLevel = STIMULUS_LEVEL_EDEFAULT;

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
	 * The default value of the '{@link #getMaskingLevel() <em>Masking Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MASKING_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaskingLevel() <em>Masking Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingLevel()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal maskingLevel = MASKING_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTonePointStatus() <em>Tone Point Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTonePointStatus()
	 * @generated
	 * @ordered
	 */
	protected static final PointStatusType TONE_POINT_STATUS_EDEFAULT = PointStatusType.UNKNOWN;

	/**
	 * The cached value of the '{@link #getTonePointStatus() <em>Tone Point Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTonePointStatus()
	 * @generated
	 * @ordered
	 */
	protected PointStatusType tonePointStatus = TONE_POINT_STATUS_EDEFAULT;

	/**
	 * This is true if the Tone Point Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tonePointStatusESet;

	/**
	 * The cached value of the '{@link #getAdditionalMaskingPoint() <em>Additional Masking Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalMaskingPoint()
	 * @generated
	 * @ordered
	 */
	protected AdditionalMaskingType additionalMaskingPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TonePointsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _502Package.Literals.TONE_POINTS_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, _502Package.TONE_POINTS_TYPE__STIMULUS_FREQUENCY, oldStimulusFrequency, stimulusFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getStimulusLevel() {
		return stimulusLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulusLevel(BigDecimal newStimulusLevel) {
		BigDecimal oldStimulusLevel = stimulusLevel;
		stimulusLevel = newStimulusLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _502Package.TONE_POINTS_TYPE__STIMULUS_LEVEL, oldStimulusLevel, stimulusLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _502Package.TONE_POINTS_TYPE__MASKING_FREQUENCY, oldMaskingFrequency, maskingFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMaskingLevel() {
		return maskingLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaskingLevel(BigDecimal newMaskingLevel) {
		BigDecimal oldMaskingLevel = maskingLevel;
		maskingLevel = newMaskingLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _502Package.TONE_POINTS_TYPE__MASKING_LEVEL, oldMaskingLevel, maskingLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointStatusType getTonePointStatus() {
		return tonePointStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTonePointStatus(PointStatusType newTonePointStatus) {
		PointStatusType oldTonePointStatus = tonePointStatus;
		tonePointStatus = newTonePointStatus == null ? TONE_POINT_STATUS_EDEFAULT : newTonePointStatus;
		boolean oldTonePointStatusESet = tonePointStatusESet;
		tonePointStatusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _502Package.TONE_POINTS_TYPE__TONE_POINT_STATUS, oldTonePointStatus, tonePointStatus, !oldTonePointStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTonePointStatus() {
		PointStatusType oldTonePointStatus = tonePointStatus;
		boolean oldTonePointStatusESet = tonePointStatusESet;
		tonePointStatus = TONE_POINT_STATUS_EDEFAULT;
		tonePointStatusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _502Package.TONE_POINTS_TYPE__TONE_POINT_STATUS, oldTonePointStatus, TONE_POINT_STATUS_EDEFAULT, oldTonePointStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTonePointStatus() {
		return tonePointStatusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdditionalMaskingType getAdditionalMaskingPoint() {
		return additionalMaskingPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalMaskingPoint(AdditionalMaskingType newAdditionalMaskingPoint, NotificationChain msgs) {
		AdditionalMaskingType oldAdditionalMaskingPoint = additionalMaskingPoint;
		additionalMaskingPoint = newAdditionalMaskingPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _502Package.TONE_POINTS_TYPE__ADDITIONAL_MASKING_POINT, oldAdditionalMaskingPoint, newAdditionalMaskingPoint);
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
	public void setAdditionalMaskingPoint(AdditionalMaskingType newAdditionalMaskingPoint) {
		if (newAdditionalMaskingPoint != additionalMaskingPoint) {
			NotificationChain msgs = null;
			if (additionalMaskingPoint != null)
				msgs = ((InternalEObject)additionalMaskingPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _502Package.TONE_POINTS_TYPE__ADDITIONAL_MASKING_POINT, null, msgs);
			if (newAdditionalMaskingPoint != null)
				msgs = ((InternalEObject)newAdditionalMaskingPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _502Package.TONE_POINTS_TYPE__ADDITIONAL_MASKING_POINT, null, msgs);
			msgs = basicSetAdditionalMaskingPoint(newAdditionalMaskingPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _502Package.TONE_POINTS_TYPE__ADDITIONAL_MASKING_POINT, newAdditionalMaskingPoint, newAdditionalMaskingPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _502Package.TONE_POINTS_TYPE__ADDITIONAL_MASKING_POINT:
				return basicSetAdditionalMaskingPoint(null, msgs);
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
			case _502Package.TONE_POINTS_TYPE__STIMULUS_FREQUENCY:
				return getStimulusFrequency();
			case _502Package.TONE_POINTS_TYPE__STIMULUS_LEVEL:
				return getStimulusLevel();
			case _502Package.TONE_POINTS_TYPE__MASKING_FREQUENCY:
				return getMaskingFrequency();
			case _502Package.TONE_POINTS_TYPE__MASKING_LEVEL:
				return getMaskingLevel();
			case _502Package.TONE_POINTS_TYPE__TONE_POINT_STATUS:
				return getTonePointStatus();
			case _502Package.TONE_POINTS_TYPE__ADDITIONAL_MASKING_POINT:
				return getAdditionalMaskingPoint();
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
			case _502Package.TONE_POINTS_TYPE__STIMULUS_FREQUENCY:
				setStimulusFrequency((BigInteger)newValue);
				return;
			case _502Package.TONE_POINTS_TYPE__STIMULUS_LEVEL:
				setStimulusLevel((BigDecimal)newValue);
				return;
			case _502Package.TONE_POINTS_TYPE__MASKING_FREQUENCY:
				setMaskingFrequency((BigInteger)newValue);
				return;
			case _502Package.TONE_POINTS_TYPE__MASKING_LEVEL:
				setMaskingLevel((BigDecimal)newValue);
				return;
			case _502Package.TONE_POINTS_TYPE__TONE_POINT_STATUS:
				setTonePointStatus((PointStatusType)newValue);
				return;
			case _502Package.TONE_POINTS_TYPE__ADDITIONAL_MASKING_POINT:
				setAdditionalMaskingPoint((AdditionalMaskingType)newValue);
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
			case _502Package.TONE_POINTS_TYPE__STIMULUS_FREQUENCY:
				setStimulusFrequency(STIMULUS_FREQUENCY_EDEFAULT);
				return;
			case _502Package.TONE_POINTS_TYPE__STIMULUS_LEVEL:
				setStimulusLevel(STIMULUS_LEVEL_EDEFAULT);
				return;
			case _502Package.TONE_POINTS_TYPE__MASKING_FREQUENCY:
				setMaskingFrequency(MASKING_FREQUENCY_EDEFAULT);
				return;
			case _502Package.TONE_POINTS_TYPE__MASKING_LEVEL:
				setMaskingLevel(MASKING_LEVEL_EDEFAULT);
				return;
			case _502Package.TONE_POINTS_TYPE__TONE_POINT_STATUS:
				unsetTonePointStatus();
				return;
			case _502Package.TONE_POINTS_TYPE__ADDITIONAL_MASKING_POINT:
				setAdditionalMaskingPoint((AdditionalMaskingType)null);
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
			case _502Package.TONE_POINTS_TYPE__STIMULUS_FREQUENCY:
				return STIMULUS_FREQUENCY_EDEFAULT == null ? stimulusFrequency != null : !STIMULUS_FREQUENCY_EDEFAULT.equals(stimulusFrequency);
			case _502Package.TONE_POINTS_TYPE__STIMULUS_LEVEL:
				return STIMULUS_LEVEL_EDEFAULT == null ? stimulusLevel != null : !STIMULUS_LEVEL_EDEFAULT.equals(stimulusLevel);
			case _502Package.TONE_POINTS_TYPE__MASKING_FREQUENCY:
				return MASKING_FREQUENCY_EDEFAULT == null ? maskingFrequency != null : !MASKING_FREQUENCY_EDEFAULT.equals(maskingFrequency);
			case _502Package.TONE_POINTS_TYPE__MASKING_LEVEL:
				return MASKING_LEVEL_EDEFAULT == null ? maskingLevel != null : !MASKING_LEVEL_EDEFAULT.equals(maskingLevel);
			case _502Package.TONE_POINTS_TYPE__TONE_POINT_STATUS:
				return isSetTonePointStatus();
			case _502Package.TONE_POINTS_TYPE__ADDITIONAL_MASKING_POINT:
				return additionalMaskingPoint != null;
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
		result.append(", stimulusLevel: ");
		result.append(stimulusLevel);
		result.append(", maskingFrequency: ");
		result.append(maskingFrequency);
		result.append(", maskingLevel: ");
		result.append(maskingLevel);
		result.append(", tonePointStatus: ");
		if (tonePointStatusESet) result.append(tonePointStatus); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TonePointsTypeImpl
