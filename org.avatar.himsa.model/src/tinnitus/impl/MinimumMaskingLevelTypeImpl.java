/*
 */
package tinnitus.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tinnitus.MeasurementConditionsType;
import tinnitus.MeasurementIntensityPointType;
import tinnitus.MinimumMaskingLevelType;
import tinnitus.TinnitusMatchSucessType;
import tinnitus.TinnitusPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Minimum Masking Level Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tinnitus.impl.MinimumMaskingLevelTypeImpl#getMeasurementConditions <em>Measurement Conditions</em>}</li>
 *   <li>{@link tinnitus.impl.MinimumMaskingLevelTypeImpl#getMeasurementPoint <em>Measurement Point</em>}</li>
 *   <li>{@link tinnitus.impl.MinimumMaskingLevelTypeImpl#getMatchingSuccess <em>Matching Success</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MinimumMaskingLevelTypeImpl extends MinimalEObjectImpl.Container implements MinimumMaskingLevelType {
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
	protected MeasurementIntensityPointType measurementPoint;

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
	protected MinimumMaskingLevelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TinnitusPackage.Literals.MINIMUM_MASKING_LEVEL_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TinnitusPackage.MINIMUM_MASKING_LEVEL_TYPE__MEASUREMENT_CONDITIONS, oldMeasurementConditions, newMeasurementConditions);
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
				msgs = ((InternalEObject)measurementConditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TinnitusPackage.MINIMUM_MASKING_LEVEL_TYPE__MEASUREMENT_CONDITIONS, null, msgs);
			if (newMeasurementConditions != null)
				msgs = ((InternalEObject)newMeasurementConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TinnitusPackage.MINIMUM_MASKING_LEVEL_TYPE__MEASUREMENT_CONDITIONS, null, msgs);
			msgs = basicSetMeasurementConditions(newMeasurementConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TinnitusPackage.MINIMUM_MASKING_LEVEL_TYPE__MEASUREMENT_CONDITIONS, newMeasurementConditions, newMeasurementConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementIntensityPointType getMeasurementPoint() {
		return measurementPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementPoint(MeasurementIntensityPointType newMeasurementPoint, NotificationChain msgs) {
		MeasurementIntensityPointType oldMeasurementPoint = measurementPoint;
		measurementPoint = newMeasurementPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TinnitusPackage.MINIMUM_MASKING_LEVEL_TYPE__MEASUREMENT_POINT, oldMeasurementPoint, newMeasurementPoint);
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
	public void setMeasurementPoint(MeasurementIntensityPointType newMeasurementPoint) {
		if (newMeasurementPoint != measurementPoint) {
			NotificationChain msgs = null;
			if (measurementPoint != null)
				msgs = ((InternalEObject)measurementPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TinnitusPackage.MINIMUM_MASKING_LEVEL_TYPE__MEASUREMENT_POINT, null, msgs);
			if (newMeasurementPoint != null)
				msgs = ((InternalEObject)newMeasurementPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TinnitusPackage.MINIMUM_MASKING_LEVEL_TYPE__MEASUREMENT_POINT, null, msgs);
			msgs = basicSetMeasurementPoint(newMeasurementPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TinnitusPackage.MINIMUM_MASKING_LEVEL_TYPE__MEASUREMENT_POINT, newMeasurementPoint, newMeasurementPoint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TinnitusPackage.MINIMUM_MASKING_LEVEL_TYPE__MATCHING_SUCCESS, oldMatchingSuccess, matchingSuccess, !oldMatchingSuccessESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TinnitusPackage.MINIMUM_MASKING_LEVEL_TYPE__MATCHING_SUCCESS, oldMatchingSuccess, MATCHING_SUCCESS_EDEFAULT, oldMatchingSuccessESet));
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
			case TinnitusPackage.MINIMUM_MASKING_LEVEL_TYPE__MEASUREMENT_CONDITIONS:
				return basicSetMeasurementConditions(null, msgs);
			case TinnitusPackage.MINIMUM_MASKING_LEVEL_TYPE__MEASUREMENT_POINT:
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
			case TinnitusPackage.MINIMUM_MASKING_LEVEL_TYPE__MEASUREMENT_CONDITIONS:
				return getMeasurementConditions();
			case TinnitusPackage.MINIMUM_MASKING_LEVEL_TYPE__MEASUREMENT_POINT:
				return getMeasurementPoint();
			case TinnitusPackage.MINIMUM_MASKING_LEVEL_TYPE__MATCHING_SUCCESS:
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
			case TinnitusPackage.MINIMUM_MASKING_LEVEL_TYPE__MEASUREMENT_CONDITIONS:
				setMeasurementConditions((MeasurementConditionsType)newValue);
				return;
			case TinnitusPackage.MINIMUM_MASKING_LEVEL_TYPE__MEASUREMENT_POINT:
				setMeasurementPoint((MeasurementIntensityPointType)newValue);
				return;
			case TinnitusPackage.MINIMUM_MASKING_LEVEL_TYPE__MATCHING_SUCCESS:
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
			case TinnitusPackage.MINIMUM_MASKING_LEVEL_TYPE__MEASUREMENT_CONDITIONS:
				setMeasurementConditions((MeasurementConditionsType)null);
				return;
			case TinnitusPackage.MINIMUM_MASKING_LEVEL_TYPE__MEASUREMENT_POINT:
				setMeasurementPoint((MeasurementIntensityPointType)null);
				return;
			case TinnitusPackage.MINIMUM_MASKING_LEVEL_TYPE__MATCHING_SUCCESS:
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
			case TinnitusPackage.MINIMUM_MASKING_LEVEL_TYPE__MEASUREMENT_CONDITIONS:
				return measurementConditions != null;
			case TinnitusPackage.MINIMUM_MASKING_LEVEL_TYPE__MEASUREMENT_POINT:
				return measurementPoint != null;
			case TinnitusPackage.MINIMUM_MASKING_LEVEL_TYPE__MATCHING_SUCCESS:
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

} //MinimumMaskingLevelTypeImpl
