/*
 */
package com.himsa.measurement.audiogram._502.impl;

import com.himsa.measurement.audiogram._502.WeberPointStatusType;
import com.himsa.measurement.audiogram._502.WeberPointType;
import com.himsa.measurement.audiogram._502._502Package;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weber Point Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram._502.impl.WeberPointTypeImpl#getStimulusFrequency <em>Stimulus Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.impl.WeberPointTypeImpl#getStimulusLevel <em>Stimulus Level</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.impl.WeberPointTypeImpl#getPointStatus <em>Point Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeberPointTypeImpl extends MinimalEObjectImpl.Container implements WeberPointType {
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
	 * The default value of the '{@link #getPointStatus() <em>Point Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointStatus()
	 * @generated
	 * @ordered
	 */
	protected static final WeberPointStatusType POINT_STATUS_EDEFAULT = WeberPointStatusType.RIGHT;

	/**
	 * The cached value of the '{@link #getPointStatus() <em>Point Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointStatus()
	 * @generated
	 * @ordered
	 */
	protected WeberPointStatusType pointStatus = POINT_STATUS_EDEFAULT;

	/**
	 * This is true if the Point Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pointStatusESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeberPointTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _502Package.Literals.WEBER_POINT_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, _502Package.WEBER_POINT_TYPE__STIMULUS_FREQUENCY, oldStimulusFrequency, stimulusFrequency));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _502Package.WEBER_POINT_TYPE__STIMULUS_LEVEL, oldStimulusLevel, stimulusLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeberPointStatusType getPointStatus() {
		return pointStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPointStatus(WeberPointStatusType newPointStatus) {
		WeberPointStatusType oldPointStatus = pointStatus;
		pointStatus = newPointStatus == null ? POINT_STATUS_EDEFAULT : newPointStatus;
		boolean oldPointStatusESet = pointStatusESet;
		pointStatusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _502Package.WEBER_POINT_TYPE__POINT_STATUS, oldPointStatus, pointStatus, !oldPointStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPointStatus() {
		WeberPointStatusType oldPointStatus = pointStatus;
		boolean oldPointStatusESet = pointStatusESet;
		pointStatus = POINT_STATUS_EDEFAULT;
		pointStatusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _502Package.WEBER_POINT_TYPE__POINT_STATUS, oldPointStatus, POINT_STATUS_EDEFAULT, oldPointStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPointStatus() {
		return pointStatusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _502Package.WEBER_POINT_TYPE__STIMULUS_FREQUENCY:
				return getStimulusFrequency();
			case _502Package.WEBER_POINT_TYPE__STIMULUS_LEVEL:
				return getStimulusLevel();
			case _502Package.WEBER_POINT_TYPE__POINT_STATUS:
				return getPointStatus();
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
			case _502Package.WEBER_POINT_TYPE__STIMULUS_FREQUENCY:
				setStimulusFrequency((BigInteger)newValue);
				return;
			case _502Package.WEBER_POINT_TYPE__STIMULUS_LEVEL:
				setStimulusLevel((BigDecimal)newValue);
				return;
			case _502Package.WEBER_POINT_TYPE__POINT_STATUS:
				setPointStatus((WeberPointStatusType)newValue);
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
			case _502Package.WEBER_POINT_TYPE__STIMULUS_FREQUENCY:
				setStimulusFrequency(STIMULUS_FREQUENCY_EDEFAULT);
				return;
			case _502Package.WEBER_POINT_TYPE__STIMULUS_LEVEL:
				setStimulusLevel(STIMULUS_LEVEL_EDEFAULT);
				return;
			case _502Package.WEBER_POINT_TYPE__POINT_STATUS:
				unsetPointStatus();
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
			case _502Package.WEBER_POINT_TYPE__STIMULUS_FREQUENCY:
				return STIMULUS_FREQUENCY_EDEFAULT == null ? stimulusFrequency != null : !STIMULUS_FREQUENCY_EDEFAULT.equals(stimulusFrequency);
			case _502Package.WEBER_POINT_TYPE__STIMULUS_LEVEL:
				return STIMULUS_LEVEL_EDEFAULT == null ? stimulusLevel != null : !STIMULUS_LEVEL_EDEFAULT.equals(stimulusLevel);
			case _502Package.WEBER_POINT_TYPE__POINT_STATUS:
				return isSetPointStatus();
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
		result.append(", pointStatus: ");
		if (pointStatusESet) result.append(pointStatus); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //WeberPointTypeImpl
