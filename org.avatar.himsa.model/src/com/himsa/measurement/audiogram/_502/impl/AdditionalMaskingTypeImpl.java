/*
 */
package com.himsa.measurement.audiogram._502.impl;

import com.himsa.measurement.audiogram._502.AdditionalMaskingType;
import com.himsa.measurement.audiogram._502.PointStatusType;
import com.himsa.measurement.audiogram._502._502Package;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Additional Masking Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram._502.impl.AdditionalMaskingTypeImpl#getAdditionalStimulusLevel <em>Additional Stimulus Level</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.impl.AdditionalMaskingTypeImpl#getAdditionalMaskingLevel <em>Additional Masking Level</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.impl.AdditionalMaskingTypeImpl#getAdditionalMaskingPointStatus <em>Additional Masking Point Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdditionalMaskingTypeImpl extends MinimalEObjectImpl.Container implements AdditionalMaskingType {
	/**
	 * The default value of the '{@link #getAdditionalStimulusLevel() <em>Additional Stimulus Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalStimulusLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ADDITIONAL_STIMULUS_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalStimulusLevel() <em>Additional Stimulus Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalStimulusLevel()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal additionalStimulusLevel = ADDITIONAL_STIMULUS_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalMaskingLevel() <em>Additional Masking Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalMaskingLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ADDITIONAL_MASKING_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalMaskingLevel() <em>Additional Masking Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalMaskingLevel()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal additionalMaskingLevel = ADDITIONAL_MASKING_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalMaskingPointStatus() <em>Additional Masking Point Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalMaskingPointStatus()
	 * @generated
	 * @ordered
	 */
	protected static final PointStatusType ADDITIONAL_MASKING_POINT_STATUS_EDEFAULT = PointStatusType.UNKNOWN;

	/**
	 * The cached value of the '{@link #getAdditionalMaskingPointStatus() <em>Additional Masking Point Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalMaskingPointStatus()
	 * @generated
	 * @ordered
	 */
	protected PointStatusType additionalMaskingPointStatus = ADDITIONAL_MASKING_POINT_STATUS_EDEFAULT;

	/**
	 * This is true if the Additional Masking Point Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean additionalMaskingPointStatusESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionalMaskingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _502Package.Literals.ADDITIONAL_MASKING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAdditionalStimulusLevel() {
		return additionalStimulusLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalStimulusLevel(BigDecimal newAdditionalStimulusLevel) {
		BigDecimal oldAdditionalStimulusLevel = additionalStimulusLevel;
		additionalStimulusLevel = newAdditionalStimulusLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _502Package.ADDITIONAL_MASKING_TYPE__ADDITIONAL_STIMULUS_LEVEL, oldAdditionalStimulusLevel, additionalStimulusLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAdditionalMaskingLevel() {
		return additionalMaskingLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalMaskingLevel(BigDecimal newAdditionalMaskingLevel) {
		BigDecimal oldAdditionalMaskingLevel = additionalMaskingLevel;
		additionalMaskingLevel = newAdditionalMaskingLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _502Package.ADDITIONAL_MASKING_TYPE__ADDITIONAL_MASKING_LEVEL, oldAdditionalMaskingLevel, additionalMaskingLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointStatusType getAdditionalMaskingPointStatus() {
		return additionalMaskingPointStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalMaskingPointStatus(PointStatusType newAdditionalMaskingPointStatus) {
		PointStatusType oldAdditionalMaskingPointStatus = additionalMaskingPointStatus;
		additionalMaskingPointStatus = newAdditionalMaskingPointStatus == null ? ADDITIONAL_MASKING_POINT_STATUS_EDEFAULT : newAdditionalMaskingPointStatus;
		boolean oldAdditionalMaskingPointStatusESet = additionalMaskingPointStatusESet;
		additionalMaskingPointStatusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _502Package.ADDITIONAL_MASKING_TYPE__ADDITIONAL_MASKING_POINT_STATUS, oldAdditionalMaskingPointStatus, additionalMaskingPointStatus, !oldAdditionalMaskingPointStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAdditionalMaskingPointStatus() {
		PointStatusType oldAdditionalMaskingPointStatus = additionalMaskingPointStatus;
		boolean oldAdditionalMaskingPointStatusESet = additionalMaskingPointStatusESet;
		additionalMaskingPointStatus = ADDITIONAL_MASKING_POINT_STATUS_EDEFAULT;
		additionalMaskingPointStatusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _502Package.ADDITIONAL_MASKING_TYPE__ADDITIONAL_MASKING_POINT_STATUS, oldAdditionalMaskingPointStatus, ADDITIONAL_MASKING_POINT_STATUS_EDEFAULT, oldAdditionalMaskingPointStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAdditionalMaskingPointStatus() {
		return additionalMaskingPointStatusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _502Package.ADDITIONAL_MASKING_TYPE__ADDITIONAL_STIMULUS_LEVEL:
				return getAdditionalStimulusLevel();
			case _502Package.ADDITIONAL_MASKING_TYPE__ADDITIONAL_MASKING_LEVEL:
				return getAdditionalMaskingLevel();
			case _502Package.ADDITIONAL_MASKING_TYPE__ADDITIONAL_MASKING_POINT_STATUS:
				return getAdditionalMaskingPointStatus();
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
			case _502Package.ADDITIONAL_MASKING_TYPE__ADDITIONAL_STIMULUS_LEVEL:
				setAdditionalStimulusLevel((BigDecimal)newValue);
				return;
			case _502Package.ADDITIONAL_MASKING_TYPE__ADDITIONAL_MASKING_LEVEL:
				setAdditionalMaskingLevel((BigDecimal)newValue);
				return;
			case _502Package.ADDITIONAL_MASKING_TYPE__ADDITIONAL_MASKING_POINT_STATUS:
				setAdditionalMaskingPointStatus((PointStatusType)newValue);
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
			case _502Package.ADDITIONAL_MASKING_TYPE__ADDITIONAL_STIMULUS_LEVEL:
				setAdditionalStimulusLevel(ADDITIONAL_STIMULUS_LEVEL_EDEFAULT);
				return;
			case _502Package.ADDITIONAL_MASKING_TYPE__ADDITIONAL_MASKING_LEVEL:
				setAdditionalMaskingLevel(ADDITIONAL_MASKING_LEVEL_EDEFAULT);
				return;
			case _502Package.ADDITIONAL_MASKING_TYPE__ADDITIONAL_MASKING_POINT_STATUS:
				unsetAdditionalMaskingPointStatus();
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
			case _502Package.ADDITIONAL_MASKING_TYPE__ADDITIONAL_STIMULUS_LEVEL:
				return ADDITIONAL_STIMULUS_LEVEL_EDEFAULT == null ? additionalStimulusLevel != null : !ADDITIONAL_STIMULUS_LEVEL_EDEFAULT.equals(additionalStimulusLevel);
			case _502Package.ADDITIONAL_MASKING_TYPE__ADDITIONAL_MASKING_LEVEL:
				return ADDITIONAL_MASKING_LEVEL_EDEFAULT == null ? additionalMaskingLevel != null : !ADDITIONAL_MASKING_LEVEL_EDEFAULT.equals(additionalMaskingLevel);
			case _502Package.ADDITIONAL_MASKING_TYPE__ADDITIONAL_MASKING_POINT_STATUS:
				return isSetAdditionalMaskingPointStatus();
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
		result.append(" (additionalStimulusLevel: ");
		result.append(additionalStimulusLevel);
		result.append(", additionalMaskingLevel: ");
		result.append(additionalMaskingLevel);
		result.append(", additionalMaskingPointStatus: ");
		if (additionalMaskingPointStatusESet) result.append(additionalMaskingPointStatus); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AdditionalMaskingTypeImpl
