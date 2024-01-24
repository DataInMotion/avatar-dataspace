/*
 */
package com.himsa.measurement.real.ear.impl;

import com.himsa.measurement.real.ear.CouplerType;
import com.himsa.measurement.real.ear.EarPackage;
import com.himsa.measurement.real.ear.FittingRule;
import com.himsa.measurement.real.ear.FullTargetCurve;
import com.himsa.measurement.real.ear.HearingInstrumentType;
import com.himsa.measurement.real.ear.TargetPoint;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Full Target Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.real.ear.impl.FullTargetCurveImpl#getManufacturersCode <em>Manufacturers Code</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.impl.FullTargetCurveImpl#getDeviceTypeCode <em>Device Type Code</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.impl.FullTargetCurveImpl#getFittingRule <em>Fitting Rule</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.impl.FullTargetCurveImpl#getHearingInstrumentType <em>Hearing Instrument Type</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.impl.FullTargetCurveImpl#getVentCanalDiameter <em>Vent Canal Diameter</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.impl.FullTargetCurveImpl#getVentCanalLength <em>Vent Canal Length</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.impl.FullTargetCurveImpl#getReserveGain <em>Reserve Gain</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.impl.FullTargetCurveImpl#getCouplerType <em>Coupler Type</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.impl.FullTargetCurveImpl#getSignalLevel <em>Signal Level</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.impl.FullTargetCurveImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.impl.FullTargetCurveImpl#getRuleName <em>Rule Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FullTargetCurveImpl extends MinimalEObjectImpl.Container implements FullTargetCurve {
	/**
	 * The default value of the '{@link #getManufacturersCode() <em>Manufacturers Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturersCode()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MANUFACTURERS_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManufacturersCode() <em>Manufacturers Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturersCode()
	 * @generated
	 * @ordered
	 */
	protected BigInteger manufacturersCode = MANUFACTURERS_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeviceTypeCode() <em>Device Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceTypeCode()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DEVICE_TYPE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceTypeCode() <em>Device Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceTypeCode()
	 * @generated
	 * @ordered
	 */
	protected BigInteger deviceTypeCode = DEVICE_TYPE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFittingRule() <em>Fitting Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFittingRule()
	 * @generated
	 * @ordered
	 */
	protected static final FittingRule FITTING_RULE_EDEFAULT = FittingRule.UNDEFINED;

	/**
	 * The cached value of the '{@link #getFittingRule() <em>Fitting Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFittingRule()
	 * @generated
	 * @ordered
	 */
	protected FittingRule fittingRule = FITTING_RULE_EDEFAULT;

	/**
	 * This is true if the Fitting Rule attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fittingRuleESet;

	/**
	 * The default value of the '{@link #getHearingInstrumentType() <em>Hearing Instrument Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHearingInstrumentType()
	 * @generated
	 * @ordered
	 */
	protected static final HearingInstrumentType HEARING_INSTRUMENT_TYPE_EDEFAULT = HearingInstrumentType.UNDEFINED;

	/**
	 * The cached value of the '{@link #getHearingInstrumentType() <em>Hearing Instrument Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHearingInstrumentType()
	 * @generated
	 * @ordered
	 */
	protected HearingInstrumentType hearingInstrumentType = HEARING_INSTRUMENT_TYPE_EDEFAULT;

	/**
	 * This is true if the Hearing Instrument Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hearingInstrumentTypeESet;

	/**
	 * The default value of the '{@link #getVentCanalDiameter() <em>Vent Canal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVentCanalDiameter()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal VENT_CANAL_DIAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVentCanalDiameter() <em>Vent Canal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVentCanalDiameter()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal ventCanalDiameter = VENT_CANAL_DIAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVentCanalLength() <em>Vent Canal Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVentCanalLength()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal VENT_CANAL_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVentCanalLength() <em>Vent Canal Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVentCanalLength()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal ventCanalLength = VENT_CANAL_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getReserveGain() <em>Reserve Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserveGain()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal RESERVE_GAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserveGain() <em>Reserve Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserveGain()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal reserveGain = RESERVE_GAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCouplerType() <em>Coupler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouplerType()
	 * @generated
	 * @ordered
	 */
	protected static final CouplerType COUPLER_TYPE_EDEFAULT = CouplerType.UNDEFINED;

	/**
	 * The cached value of the '{@link #getCouplerType() <em>Coupler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouplerType()
	 * @generated
	 * @ordered
	 */
	protected CouplerType couplerType = COUPLER_TYPE_EDEFAULT;

	/**
	 * This is true if the Coupler Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean couplerTypeESet;

	/**
	 * The default value of the '{@link #getSignalLevel() <em>Signal Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SIGNAL_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignalLevel() <em>Signal Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalLevel()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal signalLevel = SIGNAL_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetPoint> target;

	/**
	 * The default value of the '{@link #getRuleName() <em>Rule Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleName()
	 * @generated
	 * @ordered
	 */
	protected static final String RULE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuleName() <em>Rule Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleName()
	 * @generated
	 * @ordered
	 */
	protected String ruleName = RULE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FullTargetCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EarPackage.Literals.FULL_TARGET_CURVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getManufacturersCode() {
		return manufacturersCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManufacturersCode(BigInteger newManufacturersCode) {
		BigInteger oldManufacturersCode = manufacturersCode;
		manufacturersCode = newManufacturersCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarPackage.FULL_TARGET_CURVE__MANUFACTURERS_CODE, oldManufacturersCode, manufacturersCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getDeviceTypeCode() {
		return deviceTypeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceTypeCode(BigInteger newDeviceTypeCode) {
		BigInteger oldDeviceTypeCode = deviceTypeCode;
		deviceTypeCode = newDeviceTypeCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarPackage.FULL_TARGET_CURVE__DEVICE_TYPE_CODE, oldDeviceTypeCode, deviceTypeCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FittingRule getFittingRule() {
		return fittingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFittingRule(FittingRule newFittingRule) {
		FittingRule oldFittingRule = fittingRule;
		fittingRule = newFittingRule == null ? FITTING_RULE_EDEFAULT : newFittingRule;
		boolean oldFittingRuleESet = fittingRuleESet;
		fittingRuleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarPackage.FULL_TARGET_CURVE__FITTING_RULE, oldFittingRule, fittingRule, !oldFittingRuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFittingRule() {
		FittingRule oldFittingRule = fittingRule;
		boolean oldFittingRuleESet = fittingRuleESet;
		fittingRule = FITTING_RULE_EDEFAULT;
		fittingRuleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EarPackage.FULL_TARGET_CURVE__FITTING_RULE, oldFittingRule, FITTING_RULE_EDEFAULT, oldFittingRuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFittingRule() {
		return fittingRuleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HearingInstrumentType getHearingInstrumentType() {
		return hearingInstrumentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHearingInstrumentType(HearingInstrumentType newHearingInstrumentType) {
		HearingInstrumentType oldHearingInstrumentType = hearingInstrumentType;
		hearingInstrumentType = newHearingInstrumentType == null ? HEARING_INSTRUMENT_TYPE_EDEFAULT : newHearingInstrumentType;
		boolean oldHearingInstrumentTypeESet = hearingInstrumentTypeESet;
		hearingInstrumentTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarPackage.FULL_TARGET_CURVE__HEARING_INSTRUMENT_TYPE, oldHearingInstrumentType, hearingInstrumentType, !oldHearingInstrumentTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHearingInstrumentType() {
		HearingInstrumentType oldHearingInstrumentType = hearingInstrumentType;
		boolean oldHearingInstrumentTypeESet = hearingInstrumentTypeESet;
		hearingInstrumentType = HEARING_INSTRUMENT_TYPE_EDEFAULT;
		hearingInstrumentTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EarPackage.FULL_TARGET_CURVE__HEARING_INSTRUMENT_TYPE, oldHearingInstrumentType, HEARING_INSTRUMENT_TYPE_EDEFAULT, oldHearingInstrumentTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHearingInstrumentType() {
		return hearingInstrumentTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getVentCanalDiameter() {
		return ventCanalDiameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVentCanalDiameter(BigDecimal newVentCanalDiameter) {
		BigDecimal oldVentCanalDiameter = ventCanalDiameter;
		ventCanalDiameter = newVentCanalDiameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarPackage.FULL_TARGET_CURVE__VENT_CANAL_DIAMETER, oldVentCanalDiameter, ventCanalDiameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getVentCanalLength() {
		return ventCanalLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVentCanalLength(BigDecimal newVentCanalLength) {
		BigDecimal oldVentCanalLength = ventCanalLength;
		ventCanalLength = newVentCanalLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarPackage.FULL_TARGET_CURVE__VENT_CANAL_LENGTH, oldVentCanalLength, ventCanalLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReserveGain() {
		return reserveGain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReserveGain(BigDecimal newReserveGain) {
		BigDecimal oldReserveGain = reserveGain;
		reserveGain = newReserveGain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarPackage.FULL_TARGET_CURVE__RESERVE_GAIN, oldReserveGain, reserveGain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CouplerType getCouplerType() {
		return couplerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCouplerType(CouplerType newCouplerType) {
		CouplerType oldCouplerType = couplerType;
		couplerType = newCouplerType == null ? COUPLER_TYPE_EDEFAULT : newCouplerType;
		boolean oldCouplerTypeESet = couplerTypeESet;
		couplerTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarPackage.FULL_TARGET_CURVE__COUPLER_TYPE, oldCouplerType, couplerType, !oldCouplerTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCouplerType() {
		CouplerType oldCouplerType = couplerType;
		boolean oldCouplerTypeESet = couplerTypeESet;
		couplerType = COUPLER_TYPE_EDEFAULT;
		couplerTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EarPackage.FULL_TARGET_CURVE__COUPLER_TYPE, oldCouplerType, COUPLER_TYPE_EDEFAULT, oldCouplerTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCouplerType() {
		return couplerTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getSignalLevel() {
		return signalLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignalLevel(BigDecimal newSignalLevel) {
		BigDecimal oldSignalLevel = signalLevel;
		signalLevel = newSignalLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarPackage.FULL_TARGET_CURVE__SIGNAL_LEVEL, oldSignalLevel, signalLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TargetPoint> getTarget() {
		if (target == null) {
			target = new EObjectContainmentEList<TargetPoint>(TargetPoint.class, this, EarPackage.FULL_TARGET_CURVE__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRuleName() {
		return ruleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuleName(String newRuleName) {
		String oldRuleName = ruleName;
		ruleName = newRuleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarPackage.FULL_TARGET_CURVE__RULE_NAME, oldRuleName, ruleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EarPackage.FULL_TARGET_CURVE__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
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
			case EarPackage.FULL_TARGET_CURVE__MANUFACTURERS_CODE:
				return getManufacturersCode();
			case EarPackage.FULL_TARGET_CURVE__DEVICE_TYPE_CODE:
				return getDeviceTypeCode();
			case EarPackage.FULL_TARGET_CURVE__FITTING_RULE:
				return getFittingRule();
			case EarPackage.FULL_TARGET_CURVE__HEARING_INSTRUMENT_TYPE:
				return getHearingInstrumentType();
			case EarPackage.FULL_TARGET_CURVE__VENT_CANAL_DIAMETER:
				return getVentCanalDiameter();
			case EarPackage.FULL_TARGET_CURVE__VENT_CANAL_LENGTH:
				return getVentCanalLength();
			case EarPackage.FULL_TARGET_CURVE__RESERVE_GAIN:
				return getReserveGain();
			case EarPackage.FULL_TARGET_CURVE__COUPLER_TYPE:
				return getCouplerType();
			case EarPackage.FULL_TARGET_CURVE__SIGNAL_LEVEL:
				return getSignalLevel();
			case EarPackage.FULL_TARGET_CURVE__TARGET:
				return getTarget();
			case EarPackage.FULL_TARGET_CURVE__RULE_NAME:
				return getRuleName();
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
			case EarPackage.FULL_TARGET_CURVE__MANUFACTURERS_CODE:
				setManufacturersCode((BigInteger)newValue);
				return;
			case EarPackage.FULL_TARGET_CURVE__DEVICE_TYPE_CODE:
				setDeviceTypeCode((BigInteger)newValue);
				return;
			case EarPackage.FULL_TARGET_CURVE__FITTING_RULE:
				setFittingRule((FittingRule)newValue);
				return;
			case EarPackage.FULL_TARGET_CURVE__HEARING_INSTRUMENT_TYPE:
				setHearingInstrumentType((HearingInstrumentType)newValue);
				return;
			case EarPackage.FULL_TARGET_CURVE__VENT_CANAL_DIAMETER:
				setVentCanalDiameter((BigDecimal)newValue);
				return;
			case EarPackage.FULL_TARGET_CURVE__VENT_CANAL_LENGTH:
				setVentCanalLength((BigDecimal)newValue);
				return;
			case EarPackage.FULL_TARGET_CURVE__RESERVE_GAIN:
				setReserveGain((BigDecimal)newValue);
				return;
			case EarPackage.FULL_TARGET_CURVE__COUPLER_TYPE:
				setCouplerType((CouplerType)newValue);
				return;
			case EarPackage.FULL_TARGET_CURVE__SIGNAL_LEVEL:
				setSignalLevel((BigDecimal)newValue);
				return;
			case EarPackage.FULL_TARGET_CURVE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends TargetPoint>)newValue);
				return;
			case EarPackage.FULL_TARGET_CURVE__RULE_NAME:
				setRuleName((String)newValue);
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
			case EarPackage.FULL_TARGET_CURVE__MANUFACTURERS_CODE:
				setManufacturersCode(MANUFACTURERS_CODE_EDEFAULT);
				return;
			case EarPackage.FULL_TARGET_CURVE__DEVICE_TYPE_CODE:
				setDeviceTypeCode(DEVICE_TYPE_CODE_EDEFAULT);
				return;
			case EarPackage.FULL_TARGET_CURVE__FITTING_RULE:
				unsetFittingRule();
				return;
			case EarPackage.FULL_TARGET_CURVE__HEARING_INSTRUMENT_TYPE:
				unsetHearingInstrumentType();
				return;
			case EarPackage.FULL_TARGET_CURVE__VENT_CANAL_DIAMETER:
				setVentCanalDiameter(VENT_CANAL_DIAMETER_EDEFAULT);
				return;
			case EarPackage.FULL_TARGET_CURVE__VENT_CANAL_LENGTH:
				setVentCanalLength(VENT_CANAL_LENGTH_EDEFAULT);
				return;
			case EarPackage.FULL_TARGET_CURVE__RESERVE_GAIN:
				setReserveGain(RESERVE_GAIN_EDEFAULT);
				return;
			case EarPackage.FULL_TARGET_CURVE__COUPLER_TYPE:
				unsetCouplerType();
				return;
			case EarPackage.FULL_TARGET_CURVE__SIGNAL_LEVEL:
				setSignalLevel(SIGNAL_LEVEL_EDEFAULT);
				return;
			case EarPackage.FULL_TARGET_CURVE__TARGET:
				getTarget().clear();
				return;
			case EarPackage.FULL_TARGET_CURVE__RULE_NAME:
				setRuleName(RULE_NAME_EDEFAULT);
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
			case EarPackage.FULL_TARGET_CURVE__MANUFACTURERS_CODE:
				return MANUFACTURERS_CODE_EDEFAULT == null ? manufacturersCode != null : !MANUFACTURERS_CODE_EDEFAULT.equals(manufacturersCode);
			case EarPackage.FULL_TARGET_CURVE__DEVICE_TYPE_CODE:
				return DEVICE_TYPE_CODE_EDEFAULT == null ? deviceTypeCode != null : !DEVICE_TYPE_CODE_EDEFAULT.equals(deviceTypeCode);
			case EarPackage.FULL_TARGET_CURVE__FITTING_RULE:
				return isSetFittingRule();
			case EarPackage.FULL_TARGET_CURVE__HEARING_INSTRUMENT_TYPE:
				return isSetHearingInstrumentType();
			case EarPackage.FULL_TARGET_CURVE__VENT_CANAL_DIAMETER:
				return VENT_CANAL_DIAMETER_EDEFAULT == null ? ventCanalDiameter != null : !VENT_CANAL_DIAMETER_EDEFAULT.equals(ventCanalDiameter);
			case EarPackage.FULL_TARGET_CURVE__VENT_CANAL_LENGTH:
				return VENT_CANAL_LENGTH_EDEFAULT == null ? ventCanalLength != null : !VENT_CANAL_LENGTH_EDEFAULT.equals(ventCanalLength);
			case EarPackage.FULL_TARGET_CURVE__RESERVE_GAIN:
				return RESERVE_GAIN_EDEFAULT == null ? reserveGain != null : !RESERVE_GAIN_EDEFAULT.equals(reserveGain);
			case EarPackage.FULL_TARGET_CURVE__COUPLER_TYPE:
				return isSetCouplerType();
			case EarPackage.FULL_TARGET_CURVE__SIGNAL_LEVEL:
				return SIGNAL_LEVEL_EDEFAULT == null ? signalLevel != null : !SIGNAL_LEVEL_EDEFAULT.equals(signalLevel);
			case EarPackage.FULL_TARGET_CURVE__TARGET:
				return target != null && !target.isEmpty();
			case EarPackage.FULL_TARGET_CURVE__RULE_NAME:
				return RULE_NAME_EDEFAULT == null ? ruleName != null : !RULE_NAME_EDEFAULT.equals(ruleName);
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
		result.append(" (manufacturersCode: ");
		result.append(manufacturersCode);
		result.append(", deviceTypeCode: ");
		result.append(deviceTypeCode);
		result.append(", fittingRule: ");
		if (fittingRuleESet) result.append(fittingRule); else result.append("<unset>");
		result.append(", hearingInstrumentType: ");
		if (hearingInstrumentTypeESet) result.append(hearingInstrumentType); else result.append("<unset>");
		result.append(", ventCanalDiameter: ");
		result.append(ventCanalDiameter);
		result.append(", ventCanalLength: ");
		result.append(ventCanalLength);
		result.append(", reserveGain: ");
		result.append(reserveGain);
		result.append(", couplerType: ");
		if (couplerTypeESet) result.append(couplerType); else result.append("<unset>");
		result.append(", signalLevel: ");
		result.append(signalLevel);
		result.append(", ruleName: ");
		result.append(ruleName);
		result.append(')');
		return result.toString();
	}

} //FullTargetCurveImpl
