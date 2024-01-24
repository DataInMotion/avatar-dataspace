/*
 */
package com.himsa.measurement.tinnitus._500.impl;

import com.himsa.measurement.tinnitus._500.BandwidthType;
import com.himsa.measurement.tinnitus._500._500Package;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bandwidth Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.BandwidthTypeImpl#getUpperLimit <em>Upper Limit</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.BandwidthTypeImpl#getUpperSlope <em>Upper Slope</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.BandwidthTypeImpl#getPlateauSlope <em>Plateau Slope</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.BandwidthTypeImpl#getLowerLimit <em>Lower Limit</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.BandwidthTypeImpl#getLowerSlope <em>Lower Slope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BandwidthTypeImpl extends MinimalEObjectImpl.Container implements BandwidthType {
	/**
	 * The default value of the '{@link #getUpperLimit() <em>Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperLimit()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal UPPER_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpperLimit() <em>Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperLimit()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal upperLimit = UPPER_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperSlope() <em>Upper Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperSlope()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal UPPER_SLOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpperSlope() <em>Upper Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperSlope()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal upperSlope = UPPER_SLOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlateauSlope() <em>Plateau Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlateauSlope()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PLATEAU_SLOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlateauSlope() <em>Plateau Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlateauSlope()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal plateauSlope = PLATEAU_SLOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerLimit() <em>Lower Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerLimit()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal LOWER_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerLimit() <em>Lower Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerLimit()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal lowerLimit = LOWER_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerSlope() <em>Lower Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerSlope()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal LOWER_SLOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerSlope() <em>Lower Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerSlope()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal lowerSlope = LOWER_SLOPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BandwidthTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _500Package.Literals.BANDWIDTH_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getUpperLimit() {
		return upperLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpperLimit(BigDecimal newUpperLimit) {
		BigDecimal oldUpperLimit = upperLimit;
		upperLimit = newUpperLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.BANDWIDTH_TYPE__UPPER_LIMIT, oldUpperLimit, upperLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getUpperSlope() {
		return upperSlope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpperSlope(BigDecimal newUpperSlope) {
		BigDecimal oldUpperSlope = upperSlope;
		upperSlope = newUpperSlope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.BANDWIDTH_TYPE__UPPER_SLOPE, oldUpperSlope, upperSlope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getPlateauSlope() {
		return plateauSlope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlateauSlope(BigDecimal newPlateauSlope) {
		BigDecimal oldPlateauSlope = plateauSlope;
		plateauSlope = newPlateauSlope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.BANDWIDTH_TYPE__PLATEAU_SLOPE, oldPlateauSlope, plateauSlope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getLowerLimit() {
		return lowerLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowerLimit(BigDecimal newLowerLimit) {
		BigDecimal oldLowerLimit = lowerLimit;
		lowerLimit = newLowerLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.BANDWIDTH_TYPE__LOWER_LIMIT, oldLowerLimit, lowerLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getLowerSlope() {
		return lowerSlope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowerSlope(BigDecimal newLowerSlope) {
		BigDecimal oldLowerSlope = lowerSlope;
		lowerSlope = newLowerSlope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.BANDWIDTH_TYPE__LOWER_SLOPE, oldLowerSlope, lowerSlope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _500Package.BANDWIDTH_TYPE__UPPER_LIMIT:
				return getUpperLimit();
			case _500Package.BANDWIDTH_TYPE__UPPER_SLOPE:
				return getUpperSlope();
			case _500Package.BANDWIDTH_TYPE__PLATEAU_SLOPE:
				return getPlateauSlope();
			case _500Package.BANDWIDTH_TYPE__LOWER_LIMIT:
				return getLowerLimit();
			case _500Package.BANDWIDTH_TYPE__LOWER_SLOPE:
				return getLowerSlope();
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
			case _500Package.BANDWIDTH_TYPE__UPPER_LIMIT:
				setUpperLimit((BigDecimal)newValue);
				return;
			case _500Package.BANDWIDTH_TYPE__UPPER_SLOPE:
				setUpperSlope((BigDecimal)newValue);
				return;
			case _500Package.BANDWIDTH_TYPE__PLATEAU_SLOPE:
				setPlateauSlope((BigDecimal)newValue);
				return;
			case _500Package.BANDWIDTH_TYPE__LOWER_LIMIT:
				setLowerLimit((BigDecimal)newValue);
				return;
			case _500Package.BANDWIDTH_TYPE__LOWER_SLOPE:
				setLowerSlope((BigDecimal)newValue);
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
			case _500Package.BANDWIDTH_TYPE__UPPER_LIMIT:
				setUpperLimit(UPPER_LIMIT_EDEFAULT);
				return;
			case _500Package.BANDWIDTH_TYPE__UPPER_SLOPE:
				setUpperSlope(UPPER_SLOPE_EDEFAULT);
				return;
			case _500Package.BANDWIDTH_TYPE__PLATEAU_SLOPE:
				setPlateauSlope(PLATEAU_SLOPE_EDEFAULT);
				return;
			case _500Package.BANDWIDTH_TYPE__LOWER_LIMIT:
				setLowerLimit(LOWER_LIMIT_EDEFAULT);
				return;
			case _500Package.BANDWIDTH_TYPE__LOWER_SLOPE:
				setLowerSlope(LOWER_SLOPE_EDEFAULT);
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
			case _500Package.BANDWIDTH_TYPE__UPPER_LIMIT:
				return UPPER_LIMIT_EDEFAULT == null ? upperLimit != null : !UPPER_LIMIT_EDEFAULT.equals(upperLimit);
			case _500Package.BANDWIDTH_TYPE__UPPER_SLOPE:
				return UPPER_SLOPE_EDEFAULT == null ? upperSlope != null : !UPPER_SLOPE_EDEFAULT.equals(upperSlope);
			case _500Package.BANDWIDTH_TYPE__PLATEAU_SLOPE:
				return PLATEAU_SLOPE_EDEFAULT == null ? plateauSlope != null : !PLATEAU_SLOPE_EDEFAULT.equals(plateauSlope);
			case _500Package.BANDWIDTH_TYPE__LOWER_LIMIT:
				return LOWER_LIMIT_EDEFAULT == null ? lowerLimit != null : !LOWER_LIMIT_EDEFAULT.equals(lowerLimit);
			case _500Package.BANDWIDTH_TYPE__LOWER_SLOPE:
				return LOWER_SLOPE_EDEFAULT == null ? lowerSlope != null : !LOWER_SLOPE_EDEFAULT.equals(lowerSlope);
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
		result.append(" (upperLimit: ");
		result.append(upperLimit);
		result.append(", upperSlope: ");
		result.append(upperSlope);
		result.append(", plateauSlope: ");
		result.append(plateauSlope);
		result.append(", lowerLimit: ");
		result.append(lowerLimit);
		result.append(", lowerSlope: ");
		result.append(lowerSlope);
		result.append(')');
		return result.toString();
	}

} //BandwidthTypeImpl
