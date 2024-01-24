/*
 */
package com.himsa.instrument.remote.control.impl;

import com.himsa.instrument.remote.control.BatteryType;
import com.himsa.instrument.remote.control.ControlPackage;
import com.himsa.instrument.remote.control.RemoteControlSelectionType;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remote Control Selection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.instrument.remote.control.impl.RemoteControlSelectionTypeImpl#getInstrumentTypeName <em>Instrument Type Name</em>}</li>
 *   <li>{@link com.himsa.instrument.remote.control.impl.RemoteControlSelectionTypeImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link com.himsa.instrument.remote.control.impl.RemoteControlSelectionTypeImpl#getBatteryType <em>Battery Type</em>}</li>
 *   <li>{@link com.himsa.instrument.remote.control.impl.RemoteControlSelectionTypeImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link com.himsa.instrument.remote.control.impl.RemoteControlSelectionTypeImpl#getPrivateSelectionData <em>Private Selection Data</em>}</li>
 *   <li>{@link com.himsa.instrument.remote.control.impl.RemoteControlSelectionTypeImpl#getConvertedFromDataStandard <em>Converted From Data Standard</em>}</li>
 *   <li>{@link com.himsa.instrument.remote.control.impl.RemoteControlSelectionTypeImpl#isValidatedByNOAH <em>Validated By NOAH</em>}</li>
 *   <li>{@link com.himsa.instrument.remote.control.impl.RemoteControlSelectionTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoteControlSelectionTypeImpl extends MinimalEObjectImpl.Container implements RemoteControlSelectionType {
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
	protected RemoteControlSelectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlPackage.Literals.REMOTE_CONTROL_SELECTION_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__INSTRUMENT_TYPE_NAME, oldInstrumentTypeName, instrumentTypeName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__SERIAL_NUMBER, oldSerialNumber, serialNumber));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__BATTERY_TYPE, oldBatteryType, newBatteryType);
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
				msgs = ((InternalEObject)batteryType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__BATTERY_TYPE, null, msgs);
			if (newBatteryType != null)
				msgs = ((InternalEObject)newBatteryType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__BATTERY_TYPE, null, msgs);
			msgs = basicSetBatteryType(newBatteryType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__BATTERY_TYPE, newBatteryType, newBatteryType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__RESERVED, oldReserved, reserved));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__PRIVATE_SELECTION_DATA, oldPrivateSelectionData, privateSelectionData));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__CONVERTED_FROM_DATA_STANDARD, oldConvertedFromDataStandard, convertedFromDataStandard));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__VALIDATED_BY_NOAH, oldValidatedByNOAH, validatedByNOAH, !oldValidatedByNOAHESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__VALIDATED_BY_NOAH, oldValidatedByNOAH, VALIDATED_BY_NOAH_EDEFAULT, oldValidatedByNOAHESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__VERSION, oldVersion, version, !oldVersionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
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
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__BATTERY_TYPE:
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
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__INSTRUMENT_TYPE_NAME:
				return getInstrumentTypeName();
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__SERIAL_NUMBER:
				return getSerialNumber();
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__BATTERY_TYPE:
				return getBatteryType();
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__RESERVED:
				return getReserved();
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__PRIVATE_SELECTION_DATA:
				return getPrivateSelectionData();
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__CONVERTED_FROM_DATA_STANDARD:
				return getConvertedFromDataStandard();
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__VALIDATED_BY_NOAH:
				return isValidatedByNOAH();
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__VERSION:
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
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__INSTRUMENT_TYPE_NAME:
				setInstrumentTypeName((String)newValue);
				return;
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__SERIAL_NUMBER:
				setSerialNumber((String)newValue);
				return;
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__BATTERY_TYPE:
				setBatteryType((BatteryType)newValue);
				return;
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__RESERVED:
				setReserved((byte[])newValue);
				return;
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__PRIVATE_SELECTION_DATA:
				setPrivateSelectionData((byte[])newValue);
				return;
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__CONVERTED_FROM_DATA_STANDARD:
				setConvertedFromDataStandard((BigInteger)newValue);
				return;
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__VALIDATED_BY_NOAH:
				setValidatedByNOAH((Boolean)newValue);
				return;
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__VERSION:
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
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__INSTRUMENT_TYPE_NAME:
				setInstrumentTypeName(INSTRUMENT_TYPE_NAME_EDEFAULT);
				return;
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__SERIAL_NUMBER:
				setSerialNumber(SERIAL_NUMBER_EDEFAULT);
				return;
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__BATTERY_TYPE:
				setBatteryType((BatteryType)null);
				return;
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__RESERVED:
				setReserved(RESERVED_EDEFAULT);
				return;
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__PRIVATE_SELECTION_DATA:
				setPrivateSelectionData(PRIVATE_SELECTION_DATA_EDEFAULT);
				return;
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__CONVERTED_FROM_DATA_STANDARD:
				setConvertedFromDataStandard(CONVERTED_FROM_DATA_STANDARD_EDEFAULT);
				return;
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__VALIDATED_BY_NOAH:
				unsetValidatedByNOAH();
				return;
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__VERSION:
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
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__INSTRUMENT_TYPE_NAME:
				return INSTRUMENT_TYPE_NAME_EDEFAULT == null ? instrumentTypeName != null : !INSTRUMENT_TYPE_NAME_EDEFAULT.equals(instrumentTypeName);
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__SERIAL_NUMBER:
				return SERIAL_NUMBER_EDEFAULT == null ? serialNumber != null : !SERIAL_NUMBER_EDEFAULT.equals(serialNumber);
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__BATTERY_TYPE:
				return batteryType != null;
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__RESERVED:
				return RESERVED_EDEFAULT == null ? reserved != null : !RESERVED_EDEFAULT.equals(reserved);
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__PRIVATE_SELECTION_DATA:
				return PRIVATE_SELECTION_DATA_EDEFAULT == null ? privateSelectionData != null : !PRIVATE_SELECTION_DATA_EDEFAULT.equals(privateSelectionData);
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__CONVERTED_FROM_DATA_STANDARD:
				return CONVERTED_FROM_DATA_STANDARD_EDEFAULT == null ? convertedFromDataStandard != null : !CONVERTED_FROM_DATA_STANDARD_EDEFAULT.equals(convertedFromDataStandard);
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__VALIDATED_BY_NOAH:
				return isSetValidatedByNOAH();
			case ControlPackage.REMOTE_CONTROL_SELECTION_TYPE__VERSION:
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

} //RemoteControlSelectionTypeImpl
