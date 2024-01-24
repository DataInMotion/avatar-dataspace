/*
 */
package com.himsa.measurement.tinnitus._500.impl;

import com.himsa.measurement.tinnitus._500.MeasurementConditionsType;
import com.himsa.measurement.tinnitus._500.MeasurementFrequencyPointType;
import com.himsa.measurement.tinnitus._500.TinnitusMatchSucessType;
import com.himsa.measurement.tinnitus._500.TinnitusPitchMatchType;
import com.himsa.measurement.tinnitus._500._500Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tinnitus Pitch Match Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.TinnitusPitchMatchTypeImpl#getMeasurementConditions <em>Measurement Conditions</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.TinnitusPitchMatchTypeImpl#getMeasurementPoint <em>Measurement Point</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.TinnitusPitchMatchTypeImpl#getMatchingSuccess <em>Matching Success</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TinnitusPitchMatchTypeImpl extends MinimalEObjectImpl.Container implements TinnitusPitchMatchType {
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
	 * The cached value of the '{@link #getMeasurementPoint() <em>Measurement Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementPoint()
	 * @generated
	 * @ordered
	 */
	protected MeasurementFrequencyPointType measurementPoint;

	/**
	 * The default value of the '{@link #getMatchingSuccess() <em>Matching Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchingSuccess()
	 * @generated
	 * @ordered
	 */
	protected static final TinnitusMatchSucessType MATCHING_SUCCESS_EDEFAULT = TinnitusMatchSucessType.PARTIAL;

	/**
	 * The cached value of the '{@link #getMatchingSuccess() <em>Matching Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchingSuccess()
	 * @generated
	 * @ordered
	 */
	protected TinnitusMatchSucessType matchingSuccess = MATCHING_SUCCESS_EDEFAULT;

	/**
	 * This is true if the Matching Success attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean matchingSuccessESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TinnitusPitchMatchTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _500Package.Literals.TINNITUS_PITCH_MATCH_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _500Package.TINNITUS_PITCH_MATCH_TYPE__MEASUREMENT_CONDITIONS, oldMeasurementConditions, newMeasurementConditions);
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
				msgs = ((InternalEObject)measurementConditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _500Package.TINNITUS_PITCH_MATCH_TYPE__MEASUREMENT_CONDITIONS, null, msgs);
			if (newMeasurementConditions != null)
				msgs = ((InternalEObject)newMeasurementConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _500Package.TINNITUS_PITCH_MATCH_TYPE__MEASUREMENT_CONDITIONS, null, msgs);
			msgs = basicSetMeasurementConditions(newMeasurementConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.TINNITUS_PITCH_MATCH_TYPE__MEASUREMENT_CONDITIONS, newMeasurementConditions, newMeasurementConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementFrequencyPointType getMeasurementPoint() {
		return measurementPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementPoint(MeasurementFrequencyPointType newMeasurementPoint, NotificationChain msgs) {
		MeasurementFrequencyPointType oldMeasurementPoint = measurementPoint;
		measurementPoint = newMeasurementPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _500Package.TINNITUS_PITCH_MATCH_TYPE__MEASUREMENT_POINT, oldMeasurementPoint, newMeasurementPoint);
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
	public void setMeasurementPoint(MeasurementFrequencyPointType newMeasurementPoint) {
		if (newMeasurementPoint != measurementPoint) {
			NotificationChain msgs = null;
			if (measurementPoint != null)
				msgs = ((InternalEObject)measurementPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _500Package.TINNITUS_PITCH_MATCH_TYPE__MEASUREMENT_POINT, null, msgs);
			if (newMeasurementPoint != null)
				msgs = ((InternalEObject)newMeasurementPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _500Package.TINNITUS_PITCH_MATCH_TYPE__MEASUREMENT_POINT, null, msgs);
			msgs = basicSetMeasurementPoint(newMeasurementPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.TINNITUS_PITCH_MATCH_TYPE__MEASUREMENT_POINT, newMeasurementPoint, newMeasurementPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TinnitusMatchSucessType getMatchingSuccess() {
		return matchingSuccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatchingSuccess(TinnitusMatchSucessType newMatchingSuccess) {
		TinnitusMatchSucessType oldMatchingSuccess = matchingSuccess;
		matchingSuccess = newMatchingSuccess == null ? MATCHING_SUCCESS_EDEFAULT : newMatchingSuccess;
		boolean oldMatchingSuccessESet = matchingSuccessESet;
		matchingSuccessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.TINNITUS_PITCH_MATCH_TYPE__MATCHING_SUCCESS, oldMatchingSuccess, matchingSuccess, !oldMatchingSuccessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMatchingSuccess() {
		TinnitusMatchSucessType oldMatchingSuccess = matchingSuccess;
		boolean oldMatchingSuccessESet = matchingSuccessESet;
		matchingSuccess = MATCHING_SUCCESS_EDEFAULT;
		matchingSuccessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _500Package.TINNITUS_PITCH_MATCH_TYPE__MATCHING_SUCCESS, oldMatchingSuccess, MATCHING_SUCCESS_EDEFAULT, oldMatchingSuccessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMatchingSuccess() {
		return matchingSuccessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _500Package.TINNITUS_PITCH_MATCH_TYPE__MEASUREMENT_CONDITIONS:
				return basicSetMeasurementConditions(null, msgs);
			case _500Package.TINNITUS_PITCH_MATCH_TYPE__MEASUREMENT_POINT:
				return basicSetMeasurementPoint(null, msgs);
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
			case _500Package.TINNITUS_PITCH_MATCH_TYPE__MEASUREMENT_CONDITIONS:
				return getMeasurementConditions();
			case _500Package.TINNITUS_PITCH_MATCH_TYPE__MEASUREMENT_POINT:
				return getMeasurementPoint();
			case _500Package.TINNITUS_PITCH_MATCH_TYPE__MATCHING_SUCCESS:
				return getMatchingSuccess();
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
			case _500Package.TINNITUS_PITCH_MATCH_TYPE__MEASUREMENT_CONDITIONS:
				setMeasurementConditions((MeasurementConditionsType)newValue);
				return;
			case _500Package.TINNITUS_PITCH_MATCH_TYPE__MEASUREMENT_POINT:
				setMeasurementPoint((MeasurementFrequencyPointType)newValue);
				return;
			case _500Package.TINNITUS_PITCH_MATCH_TYPE__MATCHING_SUCCESS:
				setMatchingSuccess((TinnitusMatchSucessType)newValue);
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
			case _500Package.TINNITUS_PITCH_MATCH_TYPE__MEASUREMENT_CONDITIONS:
				setMeasurementConditions((MeasurementConditionsType)null);
				return;
			case _500Package.TINNITUS_PITCH_MATCH_TYPE__MEASUREMENT_POINT:
				setMeasurementPoint((MeasurementFrequencyPointType)null);
				return;
			case _500Package.TINNITUS_PITCH_MATCH_TYPE__MATCHING_SUCCESS:
				unsetMatchingSuccess();
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
			case _500Package.TINNITUS_PITCH_MATCH_TYPE__MEASUREMENT_CONDITIONS:
				return measurementConditions != null;
			case _500Package.TINNITUS_PITCH_MATCH_TYPE__MEASUREMENT_POINT:
				return measurementPoint != null;
			case _500Package.TINNITUS_PITCH_MATCH_TYPE__MATCHING_SUCCESS:
				return isSetMatchingSuccess();
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
		result.append(" (matchingSuccess: ");
		if (matchingSuccessESet) result.append(matchingSuccess); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TinnitusPitchMatchTypeImpl
