/*
 */
package com.himsa.scan.scan.meta.data.impl;

import com.himsa.scan.scan.meta.data.DataPackage;
import com.himsa.scan.scan.meta.data.ScannerHardwareType;
import com.himsa.scan.scan.meta.data.ScannerTypeType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scanner Hardware Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.scan.scan.meta.data.impl.ScannerHardwareTypeImpl#getScannerProvider <em>Scanner Provider</em>}</li>
 *   <li>{@link com.himsa.scan.scan.meta.data.impl.ScannerHardwareTypeImpl#getScannerModel <em>Scanner Model</em>}</li>
 *   <li>{@link com.himsa.scan.scan.meta.data.impl.ScannerHardwareTypeImpl#getScannerFirmware <em>Scanner Firmware</em>}</li>
 *   <li>{@link com.himsa.scan.scan.meta.data.impl.ScannerHardwareTypeImpl#getScannerType <em>Scanner Type</em>}</li>
 *   <li>{@link com.himsa.scan.scan.meta.data.impl.ScannerHardwareTypeImpl#getUniqueScannerID <em>Unique Scanner ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScannerHardwareTypeImpl extends MinimalEObjectImpl.Container implements ScannerHardwareType {
	/**
	 * The default value of the '{@link #getScannerProvider() <em>Scanner Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScannerProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String SCANNER_PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScannerProvider() <em>Scanner Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScannerProvider()
	 * @generated
	 * @ordered
	 */
	protected String scannerProvider = SCANNER_PROVIDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getScannerModel() <em>Scanner Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScannerModel()
	 * @generated
	 * @ordered
	 */
	protected static final String SCANNER_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScannerModel() <em>Scanner Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScannerModel()
	 * @generated
	 * @ordered
	 */
	protected String scannerModel = SCANNER_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getScannerFirmware() <em>Scanner Firmware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScannerFirmware()
	 * @generated
	 * @ordered
	 */
	protected static final String SCANNER_FIRMWARE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScannerFirmware() <em>Scanner Firmware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScannerFirmware()
	 * @generated
	 * @ordered
	 */
	protected String scannerFirmware = SCANNER_FIRMWARE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScannerType() <em>Scanner Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScannerType()
	 * @generated
	 * @ordered
	 */
	protected static final ScannerTypeType SCANNER_TYPE_EDEFAULT = ScannerTypeType.IMPRESSION;

	/**
	 * The cached value of the '{@link #getScannerType() <em>Scanner Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScannerType()
	 * @generated
	 * @ordered
	 */
	protected ScannerTypeType scannerType = SCANNER_TYPE_EDEFAULT;

	/**
	 * This is true if the Scanner Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scannerTypeESet;

	/**
	 * The default value of the '{@link #getUniqueScannerID() <em>Unique Scanner ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueScannerID()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_SCANNER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniqueScannerID() <em>Unique Scanner ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueScannerID()
	 * @generated
	 * @ordered
	 */
	protected String uniqueScannerID = UNIQUE_SCANNER_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScannerHardwareTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.SCANNER_HARDWARE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScannerProvider() {
		return scannerProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScannerProvider(String newScannerProvider) {
		String oldScannerProvider = scannerProvider;
		scannerProvider = newScannerProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCANNER_HARDWARE_TYPE__SCANNER_PROVIDER, oldScannerProvider, scannerProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScannerModel() {
		return scannerModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScannerModel(String newScannerModel) {
		String oldScannerModel = scannerModel;
		scannerModel = newScannerModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCANNER_HARDWARE_TYPE__SCANNER_MODEL, oldScannerModel, scannerModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScannerFirmware() {
		return scannerFirmware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScannerFirmware(String newScannerFirmware) {
		String oldScannerFirmware = scannerFirmware;
		scannerFirmware = newScannerFirmware;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCANNER_HARDWARE_TYPE__SCANNER_FIRMWARE, oldScannerFirmware, scannerFirmware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScannerTypeType getScannerType() {
		return scannerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScannerType(ScannerTypeType newScannerType) {
		ScannerTypeType oldScannerType = scannerType;
		scannerType = newScannerType == null ? SCANNER_TYPE_EDEFAULT : newScannerType;
		boolean oldScannerTypeESet = scannerTypeESet;
		scannerTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCANNER_HARDWARE_TYPE__SCANNER_TYPE, oldScannerType, scannerType, !oldScannerTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetScannerType() {
		ScannerTypeType oldScannerType = scannerType;
		boolean oldScannerTypeESet = scannerTypeESet;
		scannerType = SCANNER_TYPE_EDEFAULT;
		scannerTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DataPackage.SCANNER_HARDWARE_TYPE__SCANNER_TYPE, oldScannerType, SCANNER_TYPE_EDEFAULT, oldScannerTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetScannerType() {
		return scannerTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUniqueScannerID() {
		return uniqueScannerID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUniqueScannerID(String newUniqueScannerID) {
		String oldUniqueScannerID = uniqueScannerID;
		uniqueScannerID = newUniqueScannerID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCANNER_HARDWARE_TYPE__UNIQUE_SCANNER_ID, oldUniqueScannerID, uniqueScannerID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.SCANNER_HARDWARE_TYPE__SCANNER_PROVIDER:
				return getScannerProvider();
			case DataPackage.SCANNER_HARDWARE_TYPE__SCANNER_MODEL:
				return getScannerModel();
			case DataPackage.SCANNER_HARDWARE_TYPE__SCANNER_FIRMWARE:
				return getScannerFirmware();
			case DataPackage.SCANNER_HARDWARE_TYPE__SCANNER_TYPE:
				return getScannerType();
			case DataPackage.SCANNER_HARDWARE_TYPE__UNIQUE_SCANNER_ID:
				return getUniqueScannerID();
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
			case DataPackage.SCANNER_HARDWARE_TYPE__SCANNER_PROVIDER:
				setScannerProvider((String)newValue);
				return;
			case DataPackage.SCANNER_HARDWARE_TYPE__SCANNER_MODEL:
				setScannerModel((String)newValue);
				return;
			case DataPackage.SCANNER_HARDWARE_TYPE__SCANNER_FIRMWARE:
				setScannerFirmware((String)newValue);
				return;
			case DataPackage.SCANNER_HARDWARE_TYPE__SCANNER_TYPE:
				setScannerType((ScannerTypeType)newValue);
				return;
			case DataPackage.SCANNER_HARDWARE_TYPE__UNIQUE_SCANNER_ID:
				setUniqueScannerID((String)newValue);
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
			case DataPackage.SCANNER_HARDWARE_TYPE__SCANNER_PROVIDER:
				setScannerProvider(SCANNER_PROVIDER_EDEFAULT);
				return;
			case DataPackage.SCANNER_HARDWARE_TYPE__SCANNER_MODEL:
				setScannerModel(SCANNER_MODEL_EDEFAULT);
				return;
			case DataPackage.SCANNER_HARDWARE_TYPE__SCANNER_FIRMWARE:
				setScannerFirmware(SCANNER_FIRMWARE_EDEFAULT);
				return;
			case DataPackage.SCANNER_HARDWARE_TYPE__SCANNER_TYPE:
				unsetScannerType();
				return;
			case DataPackage.SCANNER_HARDWARE_TYPE__UNIQUE_SCANNER_ID:
				setUniqueScannerID(UNIQUE_SCANNER_ID_EDEFAULT);
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
			case DataPackage.SCANNER_HARDWARE_TYPE__SCANNER_PROVIDER:
				return SCANNER_PROVIDER_EDEFAULT == null ? scannerProvider != null : !SCANNER_PROVIDER_EDEFAULT.equals(scannerProvider);
			case DataPackage.SCANNER_HARDWARE_TYPE__SCANNER_MODEL:
				return SCANNER_MODEL_EDEFAULT == null ? scannerModel != null : !SCANNER_MODEL_EDEFAULT.equals(scannerModel);
			case DataPackage.SCANNER_HARDWARE_TYPE__SCANNER_FIRMWARE:
				return SCANNER_FIRMWARE_EDEFAULT == null ? scannerFirmware != null : !SCANNER_FIRMWARE_EDEFAULT.equals(scannerFirmware);
			case DataPackage.SCANNER_HARDWARE_TYPE__SCANNER_TYPE:
				return isSetScannerType();
			case DataPackage.SCANNER_HARDWARE_TYPE__UNIQUE_SCANNER_ID:
				return UNIQUE_SCANNER_ID_EDEFAULT == null ? uniqueScannerID != null : !UNIQUE_SCANNER_ID_EDEFAULT.equals(uniqueScannerID);
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
		result.append(" (scannerProvider: ");
		result.append(scannerProvider);
		result.append(", scannerModel: ");
		result.append(scannerModel);
		result.append(", scannerFirmware: ");
		result.append(scannerFirmware);
		result.append(", scannerType: ");
		if (scannerTypeESet) result.append(scannerType); else result.append("<unset>");
		result.append(", uniqueScannerID: ");
		result.append(uniqueScannerID);
		result.append(')');
		return result.toString();
	}

} //ScannerHardwareTypeImpl
