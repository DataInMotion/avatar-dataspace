/*
 */
package selection.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import selection.BatteryType;
import selection.DeviceCategoryType;
import selection.HearingInstrumentSelectionType;
import selection.SelectionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hearing Instrument Selection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link selection.impl.HearingInstrumentSelectionTypeImpl#getInstrumentTypeName <em>Instrument Type Name</em>}</li>
 *   <li>{@link selection.impl.HearingInstrumentSelectionTypeImpl#getDeviceCategory <em>Device Category</em>}</li>
 *   <li>{@link selection.impl.HearingInstrumentSelectionTypeImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link selection.impl.HearingInstrumentSelectionTypeImpl#getVentType <em>Vent Type</em>}</li>
 *   <li>{@link selection.impl.HearingInstrumentSelectionTypeImpl#getEarMoldForm <em>Ear Mold Form</em>}</li>
 *   <li>{@link selection.impl.HearingInstrumentSelectionTypeImpl#getEarMoldText <em>Ear Mold Text</em>}</li>
 *   <li>{@link selection.impl.HearingInstrumentSelectionTypeImpl#getSoundCanalType <em>Sound Canal Type</em>}</li>
 *   <li>{@link selection.impl.HearingInstrumentSelectionTypeImpl#getBatteryType <em>Battery Type</em>}</li>
 *   <li>{@link selection.impl.HearingInstrumentSelectionTypeImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link selection.impl.HearingInstrumentSelectionTypeImpl#getPrivateSelectionData <em>Private Selection Data</em>}</li>
 *   <li>{@link selection.impl.HearingInstrumentSelectionTypeImpl#getConvertedFromDataStandard <em>Converted From Data Standard</em>}</li>
 *   <li>{@link selection.impl.HearingInstrumentSelectionTypeImpl#isValidatedByNOAH <em>Validated By NOAH</em>}</li>
 *   <li>{@link selection.impl.HearingInstrumentSelectionTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HearingInstrumentSelectionTypeImpl extends MinimalEObjectImpl.Container implements HearingInstrumentSelectionType {
	/**
	 * The default value of the '{@link #getInstrumentTypeName() <em>Instrument Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstrumentTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTRUMENT_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstrumentTypeName() <em>Instrument Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstrumentTypeName()
	 * @generated
	 * @ordered
	 */
	protected String instrumentTypeName = INSTRUMENT_TYPE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeviceCategory() <em>Device Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceCategory()
	 * @generated
	 * @ordered
	 */
	protected DeviceCategoryType deviceCategory;

	/**
	 * The default value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SERIAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected String serialNumber = SERIAL_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVentType() <em>Vent Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVentType()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger VENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVentType() <em>Vent Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVentType()
	 * @generated
	 * @ordered
	 */
	protected BigInteger ventType = VENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEarMoldForm() <em>Ear Mold Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarMoldForm()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger EAR_MOLD_FORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEarMoldForm() <em>Ear Mold Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarMoldForm()
	 * @generated
	 * @ordered
	 */
	protected BigInteger earMoldForm = EAR_MOLD_FORM_EDEFAULT;

	/**
	 * The default value of the '{@link #getEarMoldText() <em>Ear Mold Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarMoldText()
	 * @generated
	 * @ordered
	 */
	protected static final String EAR_MOLD_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEarMoldText() <em>Ear Mold Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarMoldText()
	 * @generated
	 * @ordered
	 */
	protected String earMoldText = EAR_MOLD_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoundCanalType() <em>Sound Canal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoundCanalType()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SOUND_CANAL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoundCanalType() <em>Sound Canal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoundCanalType()
	 * @generated
	 * @ordered
	 */
	protected BigInteger soundCanalType = SOUND_CANAL_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBatteryType() <em>Battery Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryType()
	 * @generated
	 * @ordered
	 */
	protected BatteryType batteryType;

	/**
	 * The default value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] RESERVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected byte[] reserved = RESERVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivateSelectionData() <em>Private Selection Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateSelectionData()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] PRIVATE_SELECTION_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateSelectionData() <em>Private Selection Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateSelectionData()
	 * @generated
	 * @ordered
	 */
	protected byte[] privateSelectionData = PRIVATE_SELECTION_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getConvertedFromDataStandard() <em>Converted From Data Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvertedFromDataStandard()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CONVERTED_FROM_DATA_STANDARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConvertedFromDataStandard() <em>Converted From Data Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvertedFromDataStandard()
	 * @generated
	 * @ordered
	 */
	protected BigInteger convertedFromDataStandard = CONVERTED_FROM_DATA_STANDARD_EDEFAULT;

	/**
	 * The default value of the '{@link #isValidatedByNOAH() <em>Validated By NOAH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidatedByNOAH()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALIDATED_BY_NOAH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValidatedByNOAH() <em>Validated By NOAH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidatedByNOAH()
	 * @generated
	 * @ordered
	 */
	protected boolean validatedByNOAH = VALIDATED_BY_NOAH_EDEFAULT;

	/**
	 * This is true if the Validated By NOAH attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean validatedByNOAHESet;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger VERSION_EDEFAULT = new BigInteger("500");

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected BigInteger version = VERSION_EDEFAULT;

	/**
	 * This is true if the Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean versionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HearingInstrumentSelectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelectionPackage.Literals.HEARING_INSTRUMENT_SELECTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstrumentTypeName() {
		return instrumentTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstrumentTypeName(String newInstrumentTypeName) {
		String oldInstrumentTypeName = instrumentTypeName;
		instrumentTypeName = newInstrumentTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__INSTRUMENT_TYPE_NAME, oldInstrumentTypeName, instrumentTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceCategoryType getDeviceCategory() {
		return deviceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceCategory(DeviceCategoryType newDeviceCategory, NotificationChain msgs) {
		DeviceCategoryType oldDeviceCategory = deviceCategory;
		deviceCategory = newDeviceCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__DEVICE_CATEGORY, oldDeviceCategory, newDeviceCategory);
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
	public void setDeviceCategory(DeviceCategoryType newDeviceCategory) {
		if (newDeviceCategory != deviceCategory) {
			NotificationChain msgs = null;
			if (deviceCategory != null)
				msgs = ((InternalEObject)deviceCategory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__DEVICE_CATEGORY, null, msgs);
			if (newDeviceCategory != null)
				msgs = ((InternalEObject)newDeviceCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__DEVICE_CATEGORY, null, msgs);
			msgs = basicSetDeviceCategory(newDeviceCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__DEVICE_CATEGORY, newDeviceCategory, newDeviceCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSerialNumber(String newSerialNumber) {
		String oldSerialNumber = serialNumber;
		serialNumber = newSerialNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__SERIAL_NUMBER, oldSerialNumber, serialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getVentType() {
		return ventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVentType(BigInteger newVentType) {
		BigInteger oldVentType = ventType;
		ventType = newVentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__VENT_TYPE, oldVentType, ventType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getEarMoldForm() {
		return earMoldForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEarMoldForm(BigInteger newEarMoldForm) {
		BigInteger oldEarMoldForm = earMoldForm;
		earMoldForm = newEarMoldForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__EAR_MOLD_FORM, oldEarMoldForm, earMoldForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEarMoldText() {
		return earMoldText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEarMoldText(String newEarMoldText) {
		String oldEarMoldText = earMoldText;
		earMoldText = newEarMoldText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__EAR_MOLD_TEXT, oldEarMoldText, earMoldText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getSoundCanalType() {
		return soundCanalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoundCanalType(BigInteger newSoundCanalType) {
		BigInteger oldSoundCanalType = soundCanalType;
		soundCanalType = newSoundCanalType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__SOUND_CANAL_TYPE, oldSoundCanalType, soundCanalType));
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
	public NotificationChain basicSetBatteryType(BatteryType newBatteryType, NotificationChain msgs) {
		BatteryType oldBatteryType = batteryType;
		batteryType = newBatteryType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__BATTERY_TYPE, oldBatteryType, newBatteryType);
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
	public void setBatteryType(BatteryType newBatteryType) {
		if (newBatteryType != batteryType) {
			NotificationChain msgs = null;
			if (batteryType != null)
				msgs = ((InternalEObject)batteryType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__BATTERY_TYPE, null, msgs);
			if (newBatteryType != null)
				msgs = ((InternalEObject)newBatteryType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__BATTERY_TYPE, null, msgs);
			msgs = basicSetBatteryType(newBatteryType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__BATTERY_TYPE, newBatteryType, newBatteryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getReserved() {
		return reserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReserved(byte[] newReserved) {
		byte[] oldReserved = reserved;
		reserved = newReserved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__RESERVED, oldReserved, reserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getPrivateSelectionData() {
		return privateSelectionData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivateSelectionData(byte[] newPrivateSelectionData) {
		byte[] oldPrivateSelectionData = privateSelectionData;
		privateSelectionData = newPrivateSelectionData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__PRIVATE_SELECTION_DATA, oldPrivateSelectionData, privateSelectionData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getConvertedFromDataStandard() {
		return convertedFromDataStandard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConvertedFromDataStandard(BigInteger newConvertedFromDataStandard) {
		BigInteger oldConvertedFromDataStandard = convertedFromDataStandard;
		convertedFromDataStandard = newConvertedFromDataStandard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__CONVERTED_FROM_DATA_STANDARD, oldConvertedFromDataStandard, convertedFromDataStandard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isValidatedByNOAH() {
		return validatedByNOAH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidatedByNOAH(boolean newValidatedByNOAH) {
		boolean oldValidatedByNOAH = validatedByNOAH;
		validatedByNOAH = newValidatedByNOAH;
		boolean oldValidatedByNOAHESet = validatedByNOAHESet;
		validatedByNOAHESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__VALIDATED_BY_NOAH, oldValidatedByNOAH, validatedByNOAH, !oldValidatedByNOAHESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetValidatedByNOAH() {
		boolean oldValidatedByNOAH = validatedByNOAH;
		boolean oldValidatedByNOAHESet = validatedByNOAHESet;
		validatedByNOAH = VALIDATED_BY_NOAH_EDEFAULT;
		validatedByNOAHESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__VALIDATED_BY_NOAH, oldValidatedByNOAH, VALIDATED_BY_NOAH_EDEFAULT, oldValidatedByNOAHESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetValidatedByNOAH() {
		return validatedByNOAHESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(BigInteger newVersion) {
		BigInteger oldVersion = version;
		version = newVersion;
		boolean oldVersionESet = versionESet;
		versionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__VERSION, oldVersion, version, !oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVersion() {
		BigInteger oldVersion = version;
		boolean oldVersionESet = versionESet;
		version = VERSION_EDEFAULT;
		versionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVersion() {
		return versionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__DEVICE_CATEGORY:
				return basicSetDeviceCategory(null, msgs);
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__BATTERY_TYPE:
				return basicSetBatteryType(null, msgs);
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
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__INSTRUMENT_TYPE_NAME:
				return getInstrumentTypeName();
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__DEVICE_CATEGORY:
				return getDeviceCategory();
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__SERIAL_NUMBER:
				return getSerialNumber();
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__VENT_TYPE:
				return getVentType();
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__EAR_MOLD_FORM:
				return getEarMoldForm();
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__EAR_MOLD_TEXT:
				return getEarMoldText();
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__SOUND_CANAL_TYPE:
				return getSoundCanalType();
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__BATTERY_TYPE:
				return getBatteryType();
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__RESERVED:
				return getReserved();
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__PRIVATE_SELECTION_DATA:
				return getPrivateSelectionData();
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__CONVERTED_FROM_DATA_STANDARD:
				return getConvertedFromDataStandard();
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__VALIDATED_BY_NOAH:
				return isValidatedByNOAH();
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__VERSION:
				return getVersion();
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
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__INSTRUMENT_TYPE_NAME:
				setInstrumentTypeName((String)newValue);
				return;
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__DEVICE_CATEGORY:
				setDeviceCategory((DeviceCategoryType)newValue);
				return;
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__SERIAL_NUMBER:
				setSerialNumber((String)newValue);
				return;
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__VENT_TYPE:
				setVentType((BigInteger)newValue);
				return;
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__EAR_MOLD_FORM:
				setEarMoldForm((BigInteger)newValue);
				return;
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__EAR_MOLD_TEXT:
				setEarMoldText((String)newValue);
				return;
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__SOUND_CANAL_TYPE:
				setSoundCanalType((BigInteger)newValue);
				return;
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__BATTERY_TYPE:
				setBatteryType((BatteryType)newValue);
				return;
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__RESERVED:
				setReserved((byte[])newValue);
				return;
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__PRIVATE_SELECTION_DATA:
				setPrivateSelectionData((byte[])newValue);
				return;
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__CONVERTED_FROM_DATA_STANDARD:
				setConvertedFromDataStandard((BigInteger)newValue);
				return;
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__VALIDATED_BY_NOAH:
				setValidatedByNOAH((Boolean)newValue);
				return;
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__VERSION:
				setVersion((BigInteger)newValue);
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
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__INSTRUMENT_TYPE_NAME:
				setInstrumentTypeName(INSTRUMENT_TYPE_NAME_EDEFAULT);
				return;
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__DEVICE_CATEGORY:
				setDeviceCategory((DeviceCategoryType)null);
				return;
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__SERIAL_NUMBER:
				setSerialNumber(SERIAL_NUMBER_EDEFAULT);
				return;
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__VENT_TYPE:
				setVentType(VENT_TYPE_EDEFAULT);
				return;
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__EAR_MOLD_FORM:
				setEarMoldForm(EAR_MOLD_FORM_EDEFAULT);
				return;
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__EAR_MOLD_TEXT:
				setEarMoldText(EAR_MOLD_TEXT_EDEFAULT);
				return;
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__SOUND_CANAL_TYPE:
				setSoundCanalType(SOUND_CANAL_TYPE_EDEFAULT);
				return;
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__BATTERY_TYPE:
				setBatteryType((BatteryType)null);
				return;
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__RESERVED:
				setReserved(RESERVED_EDEFAULT);
				return;
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__PRIVATE_SELECTION_DATA:
				setPrivateSelectionData(PRIVATE_SELECTION_DATA_EDEFAULT);
				return;
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__CONVERTED_FROM_DATA_STANDARD:
				setConvertedFromDataStandard(CONVERTED_FROM_DATA_STANDARD_EDEFAULT);
				return;
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__VALIDATED_BY_NOAH:
				unsetValidatedByNOAH();
				return;
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__VERSION:
				unsetVersion();
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
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__INSTRUMENT_TYPE_NAME:
				return INSTRUMENT_TYPE_NAME_EDEFAULT == null ? instrumentTypeName != null : !INSTRUMENT_TYPE_NAME_EDEFAULT.equals(instrumentTypeName);
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__DEVICE_CATEGORY:
				return deviceCategory != null;
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__SERIAL_NUMBER:
				return SERIAL_NUMBER_EDEFAULT == null ? serialNumber != null : !SERIAL_NUMBER_EDEFAULT.equals(serialNumber);
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__VENT_TYPE:
				return VENT_TYPE_EDEFAULT == null ? ventType != null : !VENT_TYPE_EDEFAULT.equals(ventType);
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__EAR_MOLD_FORM:
				return EAR_MOLD_FORM_EDEFAULT == null ? earMoldForm != null : !EAR_MOLD_FORM_EDEFAULT.equals(earMoldForm);
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__EAR_MOLD_TEXT:
				return EAR_MOLD_TEXT_EDEFAULT == null ? earMoldText != null : !EAR_MOLD_TEXT_EDEFAULT.equals(earMoldText);
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__SOUND_CANAL_TYPE:
				return SOUND_CANAL_TYPE_EDEFAULT == null ? soundCanalType != null : !SOUND_CANAL_TYPE_EDEFAULT.equals(soundCanalType);
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__BATTERY_TYPE:
				return batteryType != null;
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__RESERVED:
				return RESERVED_EDEFAULT == null ? reserved != null : !RESERVED_EDEFAULT.equals(reserved);
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__PRIVATE_SELECTION_DATA:
				return PRIVATE_SELECTION_DATA_EDEFAULT == null ? privateSelectionData != null : !PRIVATE_SELECTION_DATA_EDEFAULT.equals(privateSelectionData);
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__CONVERTED_FROM_DATA_STANDARD:
				return CONVERTED_FROM_DATA_STANDARD_EDEFAULT == null ? convertedFromDataStandard != null : !CONVERTED_FROM_DATA_STANDARD_EDEFAULT.equals(convertedFromDataStandard);
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__VALIDATED_BY_NOAH:
				return isSetValidatedByNOAH();
			case SelectionPackage.HEARING_INSTRUMENT_SELECTION_TYPE__VERSION:
				return isSetVersion();
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
		result.append(" (instrumentTypeName: ");
		result.append(instrumentTypeName);
		result.append(", serialNumber: ");
		result.append(serialNumber);
		result.append(", ventType: ");
		result.append(ventType);
		result.append(", earMoldForm: ");
		result.append(earMoldForm);
		result.append(", earMoldText: ");
		result.append(earMoldText);
		result.append(", soundCanalType: ");
		result.append(soundCanalType);
		result.append(", reserved: ");
		result.append(reserved);
		result.append(", privateSelectionData: ");
		result.append(privateSelectionData);
		result.append(", convertedFromDataStandard: ");
		result.append(convertedFromDataStandard);
		result.append(", validatedByNOAH: ");
		if (validatedByNOAHESet) result.append(validatedByNOAH); else result.append("<unset>");
		result.append(", version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //HearingInstrumentSelectionTypeImpl
