/*
 */
package com.himsa.measurement.audiogram.metadata._500.impl;

import com.himsa.measurement.audiogram.metadata._500.ConfigurationSeverityChoiceType;
import com.himsa.measurement.audiogram.metadata._500.FlatHearingLossType;
import com.himsa.measurement.audiogram.metadata._500.OtherType;
import com.himsa.measurement.audiogram.metadata._500.PeakedHearingLossType;
import com.himsa.measurement.audiogram.metadata._500.RisingHearingLossType;
import com.himsa.measurement.audiogram.metadata._500.SlopingHearingLossType;
import com.himsa.measurement.audiogram.metadata._500.TroughShapedHearingLossType;
import com.himsa.measurement.audiogram.metadata._500._500Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Severity Choice Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram.metadata._500.impl.ConfigurationSeverityChoiceTypeImpl#isNormalHearing <em>Normal Hearing</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.metadata._500.impl.ConfigurationSeverityChoiceTypeImpl#getFlatHearingLoss <em>Flat Hearing Loss</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.metadata._500.impl.ConfigurationSeverityChoiceTypeImpl#getSlopingHearingLoss <em>Sloping Hearing Loss</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.metadata._500.impl.ConfigurationSeverityChoiceTypeImpl#getRisingHearingLoss <em>Rising Hearing Loss</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.metadata._500.impl.ConfigurationSeverityChoiceTypeImpl#getTroughShapedHearingLoss <em>Trough Shaped Hearing Loss</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.metadata._500.impl.ConfigurationSeverityChoiceTypeImpl#getPeakedHearingLoss <em>Peaked Hearing Loss</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.metadata._500.impl.ConfigurationSeverityChoiceTypeImpl#getOther <em>Other</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationSeverityChoiceTypeImpl extends MinimalEObjectImpl.Container implements ConfigurationSeverityChoiceType {
	/**
	 * The default value of the '{@link #isNormalHearing() <em>Normal Hearing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNormalHearing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NORMAL_HEARING_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isNormalHearing() <em>Normal Hearing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNormalHearing()
	 * @generated
	 * @ordered
	 */
	protected boolean normalHearing = NORMAL_HEARING_EDEFAULT;

	/**
	 * This is true if the Normal Hearing attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean normalHearingESet;

	/**
	 * The default value of the '{@link #getFlatHearingLoss() <em>Flat Hearing Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlatHearingLoss()
	 * @generated
	 * @ordered
	 */
	protected static final FlatHearingLossType FLAT_HEARING_LOSS_EDEFAULT = FlatHearingLossType.MILD;

	/**
	 * The cached value of the '{@link #getFlatHearingLoss() <em>Flat Hearing Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlatHearingLoss()
	 * @generated
	 * @ordered
	 */
	protected FlatHearingLossType flatHearingLoss = FLAT_HEARING_LOSS_EDEFAULT;

	/**
	 * This is true if the Flat Hearing Loss attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean flatHearingLossESet;

	/**
	 * The default value of the '{@link #getSlopingHearingLoss() <em>Sloping Hearing Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlopingHearingLoss()
	 * @generated
	 * @ordered
	 */
	protected static final SlopingHearingLossType SLOPING_HEARING_LOSS_EDEFAULT = SlopingHearingLossType.NORMAL_MILD;

	/**
	 * The cached value of the '{@link #getSlopingHearingLoss() <em>Sloping Hearing Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlopingHearingLoss()
	 * @generated
	 * @ordered
	 */
	protected SlopingHearingLossType slopingHearingLoss = SLOPING_HEARING_LOSS_EDEFAULT;

	/**
	 * This is true if the Sloping Hearing Loss attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean slopingHearingLossESet;

	/**
	 * The default value of the '{@link #getRisingHearingLoss() <em>Rising Hearing Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisingHearingLoss()
	 * @generated
	 * @ordered
	 */
	protected static final RisingHearingLossType RISING_HEARING_LOSS_EDEFAULT = RisingHearingLossType.MILD_NORMAL;

	/**
	 * The cached value of the '{@link #getRisingHearingLoss() <em>Rising Hearing Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisingHearingLoss()
	 * @generated
	 * @ordered
	 */
	protected RisingHearingLossType risingHearingLoss = RISING_HEARING_LOSS_EDEFAULT;

	/**
	 * This is true if the Rising Hearing Loss attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean risingHearingLossESet;

	/**
	 * The default value of the '{@link #getTroughShapedHearingLoss() <em>Trough Shaped Hearing Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTroughShapedHearingLoss()
	 * @generated
	 * @ordered
	 */
	protected static final TroughShapedHearingLossType TROUGH_SHAPED_HEARING_LOSS_EDEFAULT = TroughShapedHearingLossType.MILD;

	/**
	 * The cached value of the '{@link #getTroughShapedHearingLoss() <em>Trough Shaped Hearing Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTroughShapedHearingLoss()
	 * @generated
	 * @ordered
	 */
	protected TroughShapedHearingLossType troughShapedHearingLoss = TROUGH_SHAPED_HEARING_LOSS_EDEFAULT;

	/**
	 * This is true if the Trough Shaped Hearing Loss attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean troughShapedHearingLossESet;

	/**
	 * The default value of the '{@link #getPeakedHearingLoss() <em>Peaked Hearing Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeakedHearingLoss()
	 * @generated
	 * @ordered
	 */
	protected static final PeakedHearingLossType PEAKED_HEARING_LOSS_EDEFAULT = PeakedHearingLossType.MILD;

	/**
	 * The cached value of the '{@link #getPeakedHearingLoss() <em>Peaked Hearing Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeakedHearingLoss()
	 * @generated
	 * @ordered
	 */
	protected PeakedHearingLossType peakedHearingLoss = PEAKED_HEARING_LOSS_EDEFAULT;

	/**
	 * This is true if the Peaked Hearing Loss attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean peakedHearingLossESet;

	/**
	 * The default value of the '{@link #getOther() <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther()
	 * @generated
	 * @ordered
	 */
	protected static final OtherType OTHER_EDEFAULT = OtherType.MILD;

	/**
	 * The cached value of the '{@link #getOther() <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther()
	 * @generated
	 * @ordered
	 */
	protected OtherType other = OTHER_EDEFAULT;

	/**
	 * This is true if the Other attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean otherESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationSeverityChoiceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _500Package.Literals.CONFIGURATION_SEVERITY_CHOICE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNormalHearing() {
		return normalHearing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNormalHearing(boolean newNormalHearing) {
		boolean oldNormalHearing = normalHearing;
		normalHearing = newNormalHearing;
		boolean oldNormalHearingESet = normalHearingESet;
		normalHearingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__NORMAL_HEARING, oldNormalHearing, normalHearing, !oldNormalHearingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetNormalHearing() {
		boolean oldNormalHearing = normalHearing;
		boolean oldNormalHearingESet = normalHearingESet;
		normalHearing = NORMAL_HEARING_EDEFAULT;
		normalHearingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__NORMAL_HEARING, oldNormalHearing, NORMAL_HEARING_EDEFAULT, oldNormalHearingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNormalHearing() {
		return normalHearingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlatHearingLossType getFlatHearingLoss() {
		return flatHearingLoss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlatHearingLoss(FlatHearingLossType newFlatHearingLoss) {
		FlatHearingLossType oldFlatHearingLoss = flatHearingLoss;
		flatHearingLoss = newFlatHearingLoss == null ? FLAT_HEARING_LOSS_EDEFAULT : newFlatHearingLoss;
		boolean oldFlatHearingLossESet = flatHearingLossESet;
		flatHearingLossESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__FLAT_HEARING_LOSS, oldFlatHearingLoss, flatHearingLoss, !oldFlatHearingLossESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFlatHearingLoss() {
		FlatHearingLossType oldFlatHearingLoss = flatHearingLoss;
		boolean oldFlatHearingLossESet = flatHearingLossESet;
		flatHearingLoss = FLAT_HEARING_LOSS_EDEFAULT;
		flatHearingLossESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__FLAT_HEARING_LOSS, oldFlatHearingLoss, FLAT_HEARING_LOSS_EDEFAULT, oldFlatHearingLossESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFlatHearingLoss() {
		return flatHearingLossESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SlopingHearingLossType getSlopingHearingLoss() {
		return slopingHearingLoss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSlopingHearingLoss(SlopingHearingLossType newSlopingHearingLoss) {
		SlopingHearingLossType oldSlopingHearingLoss = slopingHearingLoss;
		slopingHearingLoss = newSlopingHearingLoss == null ? SLOPING_HEARING_LOSS_EDEFAULT : newSlopingHearingLoss;
		boolean oldSlopingHearingLossESet = slopingHearingLossESet;
		slopingHearingLossESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__SLOPING_HEARING_LOSS, oldSlopingHearingLoss, slopingHearingLoss, !oldSlopingHearingLossESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSlopingHearingLoss() {
		SlopingHearingLossType oldSlopingHearingLoss = slopingHearingLoss;
		boolean oldSlopingHearingLossESet = slopingHearingLossESet;
		slopingHearingLoss = SLOPING_HEARING_LOSS_EDEFAULT;
		slopingHearingLossESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__SLOPING_HEARING_LOSS, oldSlopingHearingLoss, SLOPING_HEARING_LOSS_EDEFAULT, oldSlopingHearingLossESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSlopingHearingLoss() {
		return slopingHearingLossESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RisingHearingLossType getRisingHearingLoss() {
		return risingHearingLoss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRisingHearingLoss(RisingHearingLossType newRisingHearingLoss) {
		RisingHearingLossType oldRisingHearingLoss = risingHearingLoss;
		risingHearingLoss = newRisingHearingLoss == null ? RISING_HEARING_LOSS_EDEFAULT : newRisingHearingLoss;
		boolean oldRisingHearingLossESet = risingHearingLossESet;
		risingHearingLossESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__RISING_HEARING_LOSS, oldRisingHearingLoss, risingHearingLoss, !oldRisingHearingLossESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRisingHearingLoss() {
		RisingHearingLossType oldRisingHearingLoss = risingHearingLoss;
		boolean oldRisingHearingLossESet = risingHearingLossESet;
		risingHearingLoss = RISING_HEARING_LOSS_EDEFAULT;
		risingHearingLossESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__RISING_HEARING_LOSS, oldRisingHearingLoss, RISING_HEARING_LOSS_EDEFAULT, oldRisingHearingLossESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRisingHearingLoss() {
		return risingHearingLossESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TroughShapedHearingLossType getTroughShapedHearingLoss() {
		return troughShapedHearingLoss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTroughShapedHearingLoss(TroughShapedHearingLossType newTroughShapedHearingLoss) {
		TroughShapedHearingLossType oldTroughShapedHearingLoss = troughShapedHearingLoss;
		troughShapedHearingLoss = newTroughShapedHearingLoss == null ? TROUGH_SHAPED_HEARING_LOSS_EDEFAULT : newTroughShapedHearingLoss;
		boolean oldTroughShapedHearingLossESet = troughShapedHearingLossESet;
		troughShapedHearingLossESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__TROUGH_SHAPED_HEARING_LOSS, oldTroughShapedHearingLoss, troughShapedHearingLoss, !oldTroughShapedHearingLossESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTroughShapedHearingLoss() {
		TroughShapedHearingLossType oldTroughShapedHearingLoss = troughShapedHearingLoss;
		boolean oldTroughShapedHearingLossESet = troughShapedHearingLossESet;
		troughShapedHearingLoss = TROUGH_SHAPED_HEARING_LOSS_EDEFAULT;
		troughShapedHearingLossESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__TROUGH_SHAPED_HEARING_LOSS, oldTroughShapedHearingLoss, TROUGH_SHAPED_HEARING_LOSS_EDEFAULT, oldTroughShapedHearingLossESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTroughShapedHearingLoss() {
		return troughShapedHearingLossESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PeakedHearingLossType getPeakedHearingLoss() {
		return peakedHearingLoss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeakedHearingLoss(PeakedHearingLossType newPeakedHearingLoss) {
		PeakedHearingLossType oldPeakedHearingLoss = peakedHearingLoss;
		peakedHearingLoss = newPeakedHearingLoss == null ? PEAKED_HEARING_LOSS_EDEFAULT : newPeakedHearingLoss;
		boolean oldPeakedHearingLossESet = peakedHearingLossESet;
		peakedHearingLossESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__PEAKED_HEARING_LOSS, oldPeakedHearingLoss, peakedHearingLoss, !oldPeakedHearingLossESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPeakedHearingLoss() {
		PeakedHearingLossType oldPeakedHearingLoss = peakedHearingLoss;
		boolean oldPeakedHearingLossESet = peakedHearingLossESet;
		peakedHearingLoss = PEAKED_HEARING_LOSS_EDEFAULT;
		peakedHearingLossESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__PEAKED_HEARING_LOSS, oldPeakedHearingLoss, PEAKED_HEARING_LOSS_EDEFAULT, oldPeakedHearingLossESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPeakedHearingLoss() {
		return peakedHearingLossESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OtherType getOther() {
		return other;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOther(OtherType newOther) {
		OtherType oldOther = other;
		other = newOther == null ? OTHER_EDEFAULT : newOther;
		boolean oldOtherESet = otherESet;
		otherESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__OTHER, oldOther, other, !oldOtherESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOther() {
		OtherType oldOther = other;
		boolean oldOtherESet = otherESet;
		other = OTHER_EDEFAULT;
		otherESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__OTHER, oldOther, OTHER_EDEFAULT, oldOtherESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOther() {
		return otherESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__NORMAL_HEARING:
				return isNormalHearing();
			case _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__FLAT_HEARING_LOSS:
				return getFlatHearingLoss();
			case _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__SLOPING_HEARING_LOSS:
				return getSlopingHearingLoss();
			case _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__RISING_HEARING_LOSS:
				return getRisingHearingLoss();
			case _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__TROUGH_SHAPED_HEARING_LOSS:
				return getTroughShapedHearingLoss();
			case _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__PEAKED_HEARING_LOSS:
				return getPeakedHearingLoss();
			case _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__OTHER:
				return getOther();
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
			case _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__NORMAL_HEARING:
				setNormalHearing((Boolean)newValue);
				return;
			case _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__FLAT_HEARING_LOSS:
				setFlatHearingLoss((FlatHearingLossType)newValue);
				return;
			case _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__SLOPING_HEARING_LOSS:
				setSlopingHearingLoss((SlopingHearingLossType)newValue);
				return;
			case _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__RISING_HEARING_LOSS:
				setRisingHearingLoss((RisingHearingLossType)newValue);
				return;
			case _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__TROUGH_SHAPED_HEARING_LOSS:
				setTroughShapedHearingLoss((TroughShapedHearingLossType)newValue);
				return;
			case _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__PEAKED_HEARING_LOSS:
				setPeakedHearingLoss((PeakedHearingLossType)newValue);
				return;
			case _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__OTHER:
				setOther((OtherType)newValue);
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
			case _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__NORMAL_HEARING:
				unsetNormalHearing();
				return;
			case _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__FLAT_HEARING_LOSS:
				unsetFlatHearingLoss();
				return;
			case _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__SLOPING_HEARING_LOSS:
				unsetSlopingHearingLoss();
				return;
			case _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__RISING_HEARING_LOSS:
				unsetRisingHearingLoss();
				return;
			case _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__TROUGH_SHAPED_HEARING_LOSS:
				unsetTroughShapedHearingLoss();
				return;
			case _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__PEAKED_HEARING_LOSS:
				unsetPeakedHearingLoss();
				return;
			case _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__OTHER:
				unsetOther();
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
			case _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__NORMAL_HEARING:
				return isSetNormalHearing();
			case _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__FLAT_HEARING_LOSS:
				return isSetFlatHearingLoss();
			case _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__SLOPING_HEARING_LOSS:
				return isSetSlopingHearingLoss();
			case _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__RISING_HEARING_LOSS:
				return isSetRisingHearingLoss();
			case _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__TROUGH_SHAPED_HEARING_LOSS:
				return isSetTroughShapedHearingLoss();
			case _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__PEAKED_HEARING_LOSS:
				return isSetPeakedHearingLoss();
			case _500Package.CONFIGURATION_SEVERITY_CHOICE_TYPE__OTHER:
				return isSetOther();
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
		result.append(" (normalHearing: ");
		if (normalHearingESet) result.append(normalHearing); else result.append("<unset>");
		result.append(", flatHearingLoss: ");
		if (flatHearingLossESet) result.append(flatHearingLoss); else result.append("<unset>");
		result.append(", slopingHearingLoss: ");
		if (slopingHearingLossESet) result.append(slopingHearingLoss); else result.append("<unset>");
		result.append(", risingHearingLoss: ");
		if (risingHearingLossESet) result.append(risingHearingLoss); else result.append("<unset>");
		result.append(", troughShapedHearingLoss: ");
		if (troughShapedHearingLossESet) result.append(troughShapedHearingLoss); else result.append("<unset>");
		result.append(", peakedHearingLoss: ");
		if (peakedHearingLossESet) result.append(peakedHearingLoss); else result.append("<unset>");
		result.append(", other: ");
		if (otherESet) result.append(other); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ConfigurationSeverityChoiceTypeImpl
