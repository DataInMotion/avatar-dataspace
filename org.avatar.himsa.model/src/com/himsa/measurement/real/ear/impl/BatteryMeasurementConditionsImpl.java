/*
 */
package com.himsa.measurement.real.ear.impl;

import com.himsa.measurement.real.ear.BatteryMeasurementConditions;
import com.himsa.measurement.real.ear.BatteryPillType;
import com.himsa.measurement.real.ear.BatteryType;
import com.himsa.measurement.real.ear.EarPackage;
import com.himsa.measurement.real.ear.MeasurementIdentification;
import com.himsa.measurement.real.ear.MeasurementMode;
import com.himsa.measurement.real.ear.SignalOutputType;
import com.himsa.measurement.real.ear.SignalType;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Battery Measurement Conditions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.real.ear.impl.BatteryMeasurementConditionsImpl#getManufacturerCode <em>Manufacturer Code</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.impl.BatteryMeasurementConditionsImpl#getDevTypeCode <em>Dev Type Code</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.impl.BatteryMeasurementConditionsImpl#getSignalType <em>Signal Type</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.impl.BatteryMeasurementConditionsImpl#getSignalOutput <em>Signal Output</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.impl.BatteryMeasurementConditionsImpl#getSignalLevel <em>Signal Level</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.impl.BatteryMeasurementConditionsImpl#getSignalFrequency <em>Signal Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.impl.BatteryMeasurementConditionsImpl#getBatteryType <em>Battery Type</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.impl.BatteryMeasurementConditionsImpl#getBatteryPillType <em>Battery Pill Type</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.impl.BatteryMeasurementConditionsImpl#getBatteryVoltage <em>Battery Voltage</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.impl.BatteryMeasurementConditionsImpl#getBatteryImpedance <em>Battery Impedance</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.impl.BatteryMeasurementConditionsImpl#isUseRealEarCoupler <em>Use Real Ear Coupler</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.impl.BatteryMeasurementConditionsImpl#getMeasurementMode <em>Measurement Mode</em>}</li>
 *   <li>{@link com.himsa.measurement.real.ear.impl.BatteryMeasurementConditionsImpl#getMeasurementIdentification <em>Measurement Identification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BatteryMeasurementConditionsImpl extends MinimalEObjectImpl.Container implements BatteryMeasurementConditions {
	/**
	 * The default value of the '{@link #getManufacturerCode() <em>Manufacturer Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturerCode()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MANUFACTURER_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManufacturerCode() <em>Manufacturer Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturerCode()
	 * @generated
	 * @ordered
	 */
	protected BigInteger manufacturerCode = MANUFACTURER_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDevTypeCode() <em>Dev Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevTypeCode()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DEV_TYPE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDevTypeCode() <em>Dev Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevTypeCode()
	 * @generated
	 * @ordered
	 */
	protected BigInteger devTypeCode = DEV_TYPE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignalType() <em>Signal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalType()
	 * @generated
	 * @ordered
	 */
	protected static final SignalType SIGNAL_TYPE_EDEFAULT = SignalType.UNDEFINED;

	/**
	 * The cached value of the '{@link #getSignalType() <em>Signal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalType()
	 * @generated
	 * @ordered
	 */
	protected SignalType signalType = SIGNAL_TYPE_EDEFAULT;

	/**
	 * This is true if the Signal Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean signalTypeESet;

	/**
	 * The default value of the '{@link #getSignalOutput() <em>Signal Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalOutput()
	 * @generated
	 * @ordered
	 */
	protected static final SignalOutputType SIGNAL_OUTPUT_EDEFAULT = SignalOutputType.UNDEFINED;

	/**
	 * The cached value of the '{@link #getSignalOutput() <em>Signal Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalOutput()
	 * @generated
	 * @ordered
	 */
	protected SignalOutputType signalOutput = SIGNAL_OUTPUT_EDEFAULT;

	/**
	 * This is true if the Signal Output attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean signalOutputESet;

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
	 * The default value of the '{@link #getSignalFrequency() <em>Signal Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SIGNAL_FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignalFrequency() <em>Signal Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalFrequency()
	 * @generated
	 * @ordered
	 */
	protected BigInteger signalFrequency = SIGNAL_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBatteryType() <em>Battery Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryType()
	 * @generated
	 * @ordered
	 */
	protected static final BatteryType BATTERY_TYPE_EDEFAULT = BatteryType.UNDEFINED;

	/**
	 * The cached value of the '{@link #getBatteryType() <em>Battery Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryType()
	 * @generated
	 * @ordered
	 */
	protected BatteryType batteryType = BATTERY_TYPE_EDEFAULT;

	/**
	 * This is true if the Battery Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean batteryTypeESet;

	/**
	 * The default value of the '{@link #getBatteryPillType() <em>Battery Pill Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryPillType()
	 * @generated
	 * @ordered
	 */
	protected static final BatteryPillType BATTERY_PILL_TYPE_EDEFAULT = BatteryPillType.UNDEFINED;

	/**
	 * The cached value of the '{@link #getBatteryPillType() <em>Battery Pill Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryPillType()
	 * @generated
	 * @ordered
	 */
	protected BatteryPillType batteryPillType = BATTERY_PILL_TYPE_EDEFAULT;

	/**
	 * This is true if the Battery Pill Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean batteryPillTypeESet;

	/**
	 * The default value of the '{@link #getBatteryVoltage() <em>Battery Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal BATTERY_VOLTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBatteryVoltage() <em>Battery Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryVoltage()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal batteryVoltage = BATTERY_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBatteryImpedance() <em>Battery Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryImpedance()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal BATTERY_IMPEDANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBatteryImpedance() <em>Battery Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryImpedance()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal batteryImpedance = BATTERY_IMPEDANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseRealEarCoupler() <em>Use Real Ear Coupler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseRealEarCoupler()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_REAL_EAR_COUPLER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseRealEarCoupler() <em>Use Real Ear Coupler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseRealEarCoupler()
	 * @generated
	 * @ordered
	 */
	protected boolean useRealEarCoupler = USE_REAL_EAR_COUPLER_EDEFAULT;

	/**
	 * This is true if the Use Real Ear Coupler attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useRealEarCouplerESet;

	/**
	 * The default value of the '{@link #getMeasurementMode() <em>Measurement Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementMode()
	 * @generated
	 * @ordered
	 */
	protected static final MeasurementMode MEASUREMENT_MODE_EDEFAULT = MeasurementMode.UNDEFINED;

	/**
	 * The cached value of the '{@link #getMeasurementMode() <em>Measurement Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementMode()
	 * @generated
	 * @ordered
	 */
	protected MeasurementMode measurementMode = MEASUREMENT_MODE_EDEFAULT;

	/**
	 * This is true if the Measurement Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean measurementModeESet;

	/**
	 * The default value of the '{@link #getMeasurementIdentification() <em>Measurement Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementIdentification()
	 * @generated
	 * @ordered
	 */
	protected static final MeasurementIdentification MEASUREMENT_IDENTIFICATION_EDEFAULT = MeasurementIdentification.UNDEFINED;

	/**
	 * The cached value of the '{@link #getMeasurementIdentification() <em>Measurement Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementIdentification()
	 * @generated
	 * @ordered
	 */
	protected MeasurementIdentification measurementIdentification = MEASUREMENT_IDENTIFICATION_EDEFAULT;

	/**
	 * This is true if the Measurement Identification attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean measurementIdentificationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BatteryMeasurementConditionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EarPackage.Literals.BATTERY_MEASUREMENT_CONDITIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getManufacturerCode() {
		return manufacturerCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManufacturerCode(BigInteger newManufacturerCode) {
		BigInteger oldManufacturerCode = manufacturerCode;
		manufacturerCode = newManufacturerCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarPackage.BATTERY_MEASUREMENT_CONDITIONS__MANUFACTURER_CODE, oldManufacturerCode, manufacturerCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getDevTypeCode() {
		return devTypeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDevTypeCode(BigInteger newDevTypeCode) {
		BigInteger oldDevTypeCode = devTypeCode;
		devTypeCode = newDevTypeCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarPackage.BATTERY_MEASUREMENT_CONDITIONS__DEV_TYPE_CODE, oldDevTypeCode, devTypeCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignalType getSignalType() {
		return signalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignalType(SignalType newSignalType) {
		SignalType oldSignalType = signalType;
		signalType = newSignalType == null ? SIGNAL_TYPE_EDEFAULT : newSignalType;
		boolean oldSignalTypeESet = signalTypeESet;
		signalTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarPackage.BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_TYPE, oldSignalType, signalType, !oldSignalTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSignalType() {
		SignalType oldSignalType = signalType;
		boolean oldSignalTypeESet = signalTypeESet;
		signalType = SIGNAL_TYPE_EDEFAULT;
		signalTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EarPackage.BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_TYPE, oldSignalType, SIGNAL_TYPE_EDEFAULT, oldSignalTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSignalType() {
		return signalTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignalOutputType getSignalOutput() {
		return signalOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignalOutput(SignalOutputType newSignalOutput) {
		SignalOutputType oldSignalOutput = signalOutput;
		signalOutput = newSignalOutput == null ? SIGNAL_OUTPUT_EDEFAULT : newSignalOutput;
		boolean oldSignalOutputESet = signalOutputESet;
		signalOutputESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarPackage.BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_OUTPUT, oldSignalOutput, signalOutput, !oldSignalOutputESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSignalOutput() {
		SignalOutputType oldSignalOutput = signalOutput;
		boolean oldSignalOutputESet = signalOutputESet;
		signalOutput = SIGNAL_OUTPUT_EDEFAULT;
		signalOutputESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EarPackage.BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_OUTPUT, oldSignalOutput, SIGNAL_OUTPUT_EDEFAULT, oldSignalOutputESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSignalOutput() {
		return signalOutputESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EarPackage.BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_LEVEL, oldSignalLevel, signalLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getSignalFrequency() {
		return signalFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignalFrequency(BigInteger newSignalFrequency) {
		BigInteger oldSignalFrequency = signalFrequency;
		signalFrequency = newSignalFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarPackage.BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_FREQUENCY, oldSignalFrequency, signalFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BatteryType getBatteryType() {
		return batteryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBatteryType(BatteryType newBatteryType) {
		BatteryType oldBatteryType = batteryType;
		batteryType = newBatteryType == null ? BATTERY_TYPE_EDEFAULT : newBatteryType;
		boolean oldBatteryTypeESet = batteryTypeESet;
		batteryTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarPackage.BATTERY_MEASUREMENT_CONDITIONS__BATTERY_TYPE, oldBatteryType, batteryType, !oldBatteryTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBatteryType() {
		BatteryType oldBatteryType = batteryType;
		boolean oldBatteryTypeESet = batteryTypeESet;
		batteryType = BATTERY_TYPE_EDEFAULT;
		batteryTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EarPackage.BATTERY_MEASUREMENT_CONDITIONS__BATTERY_TYPE, oldBatteryType, BATTERY_TYPE_EDEFAULT, oldBatteryTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBatteryType() {
		return batteryTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BatteryPillType getBatteryPillType() {
		return batteryPillType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBatteryPillType(BatteryPillType newBatteryPillType) {
		BatteryPillType oldBatteryPillType = batteryPillType;
		batteryPillType = newBatteryPillType == null ? BATTERY_PILL_TYPE_EDEFAULT : newBatteryPillType;
		boolean oldBatteryPillTypeESet = batteryPillTypeESet;
		batteryPillTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarPackage.BATTERY_MEASUREMENT_CONDITIONS__BATTERY_PILL_TYPE, oldBatteryPillType, batteryPillType, !oldBatteryPillTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBatteryPillType() {
		BatteryPillType oldBatteryPillType = batteryPillType;
		boolean oldBatteryPillTypeESet = batteryPillTypeESet;
		batteryPillType = BATTERY_PILL_TYPE_EDEFAULT;
		batteryPillTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EarPackage.BATTERY_MEASUREMENT_CONDITIONS__BATTERY_PILL_TYPE, oldBatteryPillType, BATTERY_PILL_TYPE_EDEFAULT, oldBatteryPillTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBatteryPillType() {
		return batteryPillTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getBatteryVoltage() {
		return batteryVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBatteryVoltage(BigDecimal newBatteryVoltage) {
		BigDecimal oldBatteryVoltage = batteryVoltage;
		batteryVoltage = newBatteryVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarPackage.BATTERY_MEASUREMENT_CONDITIONS__BATTERY_VOLTAGE, oldBatteryVoltage, batteryVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getBatteryImpedance() {
		return batteryImpedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBatteryImpedance(BigDecimal newBatteryImpedance) {
		BigDecimal oldBatteryImpedance = batteryImpedance;
		batteryImpedance = newBatteryImpedance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarPackage.BATTERY_MEASUREMENT_CONDITIONS__BATTERY_IMPEDANCE, oldBatteryImpedance, batteryImpedance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseRealEarCoupler() {
		return useRealEarCoupler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseRealEarCoupler(boolean newUseRealEarCoupler) {
		boolean oldUseRealEarCoupler = useRealEarCoupler;
		useRealEarCoupler = newUseRealEarCoupler;
		boolean oldUseRealEarCouplerESet = useRealEarCouplerESet;
		useRealEarCouplerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarPackage.BATTERY_MEASUREMENT_CONDITIONS__USE_REAL_EAR_COUPLER, oldUseRealEarCoupler, useRealEarCoupler, !oldUseRealEarCouplerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetUseRealEarCoupler() {
		boolean oldUseRealEarCoupler = useRealEarCoupler;
		boolean oldUseRealEarCouplerESet = useRealEarCouplerESet;
		useRealEarCoupler = USE_REAL_EAR_COUPLER_EDEFAULT;
		useRealEarCouplerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EarPackage.BATTERY_MEASUREMENT_CONDITIONS__USE_REAL_EAR_COUPLER, oldUseRealEarCoupler, USE_REAL_EAR_COUPLER_EDEFAULT, oldUseRealEarCouplerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetUseRealEarCoupler() {
		return useRealEarCouplerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementMode getMeasurementMode() {
		return measurementMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeasurementMode(MeasurementMode newMeasurementMode) {
		MeasurementMode oldMeasurementMode = measurementMode;
		measurementMode = newMeasurementMode == null ? MEASUREMENT_MODE_EDEFAULT : newMeasurementMode;
		boolean oldMeasurementModeESet = measurementModeESet;
		measurementModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarPackage.BATTERY_MEASUREMENT_CONDITIONS__MEASUREMENT_MODE, oldMeasurementMode, measurementMode, !oldMeasurementModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMeasurementMode() {
		MeasurementMode oldMeasurementMode = measurementMode;
		boolean oldMeasurementModeESet = measurementModeESet;
		measurementMode = MEASUREMENT_MODE_EDEFAULT;
		measurementModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EarPackage.BATTERY_MEASUREMENT_CONDITIONS__MEASUREMENT_MODE, oldMeasurementMode, MEASUREMENT_MODE_EDEFAULT, oldMeasurementModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMeasurementMode() {
		return measurementModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementIdentification getMeasurementIdentification() {
		return measurementIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeasurementIdentification(MeasurementIdentification newMeasurementIdentification) {
		MeasurementIdentification oldMeasurementIdentification = measurementIdentification;
		measurementIdentification = newMeasurementIdentification == null ? MEASUREMENT_IDENTIFICATION_EDEFAULT : newMeasurementIdentification;
		boolean oldMeasurementIdentificationESet = measurementIdentificationESet;
		measurementIdentificationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EarPackage.BATTERY_MEASUREMENT_CONDITIONS__MEASUREMENT_IDENTIFICATION, oldMeasurementIdentification, measurementIdentification, !oldMeasurementIdentificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMeasurementIdentification() {
		MeasurementIdentification oldMeasurementIdentification = measurementIdentification;
		boolean oldMeasurementIdentificationESet = measurementIdentificationESet;
		measurementIdentification = MEASUREMENT_IDENTIFICATION_EDEFAULT;
		measurementIdentificationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EarPackage.BATTERY_MEASUREMENT_CONDITIONS__MEASUREMENT_IDENTIFICATION, oldMeasurementIdentification, MEASUREMENT_IDENTIFICATION_EDEFAULT, oldMeasurementIdentificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMeasurementIdentification() {
		return measurementIdentificationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__MANUFACTURER_CODE:
				return getManufacturerCode();
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__DEV_TYPE_CODE:
				return getDevTypeCode();
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_TYPE:
				return getSignalType();
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_OUTPUT:
				return getSignalOutput();
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_LEVEL:
				return getSignalLevel();
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_FREQUENCY:
				return getSignalFrequency();
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__BATTERY_TYPE:
				return getBatteryType();
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__BATTERY_PILL_TYPE:
				return getBatteryPillType();
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__BATTERY_VOLTAGE:
				return getBatteryVoltage();
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__BATTERY_IMPEDANCE:
				return getBatteryImpedance();
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__USE_REAL_EAR_COUPLER:
				return isUseRealEarCoupler();
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__MEASUREMENT_MODE:
				return getMeasurementMode();
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__MEASUREMENT_IDENTIFICATION:
				return getMeasurementIdentification();
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
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__MANUFACTURER_CODE:
				setManufacturerCode((BigInteger)newValue);
				return;
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__DEV_TYPE_CODE:
				setDevTypeCode((BigInteger)newValue);
				return;
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_TYPE:
				setSignalType((SignalType)newValue);
				return;
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_OUTPUT:
				setSignalOutput((SignalOutputType)newValue);
				return;
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_LEVEL:
				setSignalLevel((BigDecimal)newValue);
				return;
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_FREQUENCY:
				setSignalFrequency((BigInteger)newValue);
				return;
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__BATTERY_TYPE:
				setBatteryType((BatteryType)newValue);
				return;
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__BATTERY_PILL_TYPE:
				setBatteryPillType((BatteryPillType)newValue);
				return;
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__BATTERY_VOLTAGE:
				setBatteryVoltage((BigDecimal)newValue);
				return;
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__BATTERY_IMPEDANCE:
				setBatteryImpedance((BigDecimal)newValue);
				return;
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__USE_REAL_EAR_COUPLER:
				setUseRealEarCoupler((Boolean)newValue);
				return;
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__MEASUREMENT_MODE:
				setMeasurementMode((MeasurementMode)newValue);
				return;
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__MEASUREMENT_IDENTIFICATION:
				setMeasurementIdentification((MeasurementIdentification)newValue);
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
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__MANUFACTURER_CODE:
				setManufacturerCode(MANUFACTURER_CODE_EDEFAULT);
				return;
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__DEV_TYPE_CODE:
				setDevTypeCode(DEV_TYPE_CODE_EDEFAULT);
				return;
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_TYPE:
				unsetSignalType();
				return;
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_OUTPUT:
				unsetSignalOutput();
				return;
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_LEVEL:
				setSignalLevel(SIGNAL_LEVEL_EDEFAULT);
				return;
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_FREQUENCY:
				setSignalFrequency(SIGNAL_FREQUENCY_EDEFAULT);
				return;
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__BATTERY_TYPE:
				unsetBatteryType();
				return;
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__BATTERY_PILL_TYPE:
				unsetBatteryPillType();
				return;
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__BATTERY_VOLTAGE:
				setBatteryVoltage(BATTERY_VOLTAGE_EDEFAULT);
				return;
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__BATTERY_IMPEDANCE:
				setBatteryImpedance(BATTERY_IMPEDANCE_EDEFAULT);
				return;
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__USE_REAL_EAR_COUPLER:
				unsetUseRealEarCoupler();
				return;
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__MEASUREMENT_MODE:
				unsetMeasurementMode();
				return;
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__MEASUREMENT_IDENTIFICATION:
				unsetMeasurementIdentification();
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
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__MANUFACTURER_CODE:
				return MANUFACTURER_CODE_EDEFAULT == null ? manufacturerCode != null : !MANUFACTURER_CODE_EDEFAULT.equals(manufacturerCode);
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__DEV_TYPE_CODE:
				return DEV_TYPE_CODE_EDEFAULT == null ? devTypeCode != null : !DEV_TYPE_CODE_EDEFAULT.equals(devTypeCode);
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_TYPE:
				return isSetSignalType();
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_OUTPUT:
				return isSetSignalOutput();
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_LEVEL:
				return SIGNAL_LEVEL_EDEFAULT == null ? signalLevel != null : !SIGNAL_LEVEL_EDEFAULT.equals(signalLevel);
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__SIGNAL_FREQUENCY:
				return SIGNAL_FREQUENCY_EDEFAULT == null ? signalFrequency != null : !SIGNAL_FREQUENCY_EDEFAULT.equals(signalFrequency);
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__BATTERY_TYPE:
				return isSetBatteryType();
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__BATTERY_PILL_TYPE:
				return isSetBatteryPillType();
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__BATTERY_VOLTAGE:
				return BATTERY_VOLTAGE_EDEFAULT == null ? batteryVoltage != null : !BATTERY_VOLTAGE_EDEFAULT.equals(batteryVoltage);
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__BATTERY_IMPEDANCE:
				return BATTERY_IMPEDANCE_EDEFAULT == null ? batteryImpedance != null : !BATTERY_IMPEDANCE_EDEFAULT.equals(batteryImpedance);
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__USE_REAL_EAR_COUPLER:
				return isSetUseRealEarCoupler();
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__MEASUREMENT_MODE:
				return isSetMeasurementMode();
			case EarPackage.BATTERY_MEASUREMENT_CONDITIONS__MEASUREMENT_IDENTIFICATION:
				return isSetMeasurementIdentification();
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
		result.append(" (manufacturerCode: ");
		result.append(manufacturerCode);
		result.append(", devTypeCode: ");
		result.append(devTypeCode);
		result.append(", signalType: ");
		if (signalTypeESet) result.append(signalType); else result.append("<unset>");
		result.append(", signalOutput: ");
		if (signalOutputESet) result.append(signalOutput); else result.append("<unset>");
		result.append(", signalLevel: ");
		result.append(signalLevel);
		result.append(", signalFrequency: ");
		result.append(signalFrequency);
		result.append(", batteryType: ");
		if (batteryTypeESet) result.append(batteryType); else result.append("<unset>");
		result.append(", batteryPillType: ");
		if (batteryPillTypeESet) result.append(batteryPillType); else result.append("<unset>");
		result.append(", batteryVoltage: ");
		result.append(batteryVoltage);
		result.append(", batteryImpedance: ");
		result.append(batteryImpedance);
		result.append(", useRealEarCoupler: ");
		if (useRealEarCouplerESet) result.append(useRealEarCoupler); else result.append("<unset>");
		result.append(", measurementMode: ");
		if (measurementModeESet) result.append(measurementMode); else result.append("<unset>");
		result.append(", measurementIdentification: ");
		if (measurementIdentificationESet) result.append(measurementIdentification); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BatteryMeasurementConditionsImpl
