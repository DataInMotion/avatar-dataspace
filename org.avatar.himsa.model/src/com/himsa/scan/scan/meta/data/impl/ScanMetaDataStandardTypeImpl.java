/*
 */
package com.himsa.scan.scan.meta.data.impl;

import com.himsa.scan.scan.meta.data.DataPackage;
import com.himsa.scan.scan.meta.data.PackageType;
import com.himsa.scan.scan.meta.data.ScanMetaDataStandardType;
import com.himsa.scan.scan.meta.data.ScansType;

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
 * An implementation of the model object '<em><b>Scan Meta Data Standard Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.scan.scan.meta.data.impl.ScanMetaDataStandardTypeImpl#getScanPackage <em>Scan Package</em>}</li>
 *   <li>{@link com.himsa.scan.scan.meta.data.impl.ScanMetaDataStandardTypeImpl#getScans <em>Scans</em>}</li>
 *   <li>{@link com.himsa.scan.scan.meta.data.impl.ScanMetaDataStandardTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScanMetaDataStandardTypeImpl extends MinimalEObjectImpl.Container implements ScanMetaDataStandardType {
	/**
	 * The cached value of the '{@link #getScanPackage() <em>Scan Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScanPackage()
	 * @generated
	 * @ordered
	 */
	protected PackageType scanPackage;

	/**
	 * The cached value of the '{@link #getScans() <em>Scans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScans()
	 * @generated
	 * @ordered
	 */
	protected EList<ScansType> scans;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "500";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

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
	protected ScanMetaDataStandardTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.SCAN_META_DATA_STANDARD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageType getScanPackage() {
		return scanPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScanPackage(PackageType newScanPackage, NotificationChain msgs) {
		PackageType oldScanPackage = scanPackage;
		scanPackage = newScanPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataPackage.SCAN_META_DATA_STANDARD_TYPE__SCAN_PACKAGE, oldScanPackage, newScanPackage);
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
	public void setScanPackage(PackageType newScanPackage) {
		if (newScanPackage != scanPackage) {
			NotificationChain msgs = null;
			if (scanPackage != null)
				msgs = ((InternalEObject)scanPackage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataPackage.SCAN_META_DATA_STANDARD_TYPE__SCAN_PACKAGE, null, msgs);
			if (newScanPackage != null)
				msgs = ((InternalEObject)newScanPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataPackage.SCAN_META_DATA_STANDARD_TYPE__SCAN_PACKAGE, null, msgs);
			msgs = basicSetScanPackage(newScanPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCAN_META_DATA_STANDARD_TYPE__SCAN_PACKAGE, newScanPackage, newScanPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScansType> getScans() {
		if (scans == null) {
			scans = new EObjectContainmentEList<ScansType>(ScansType.class, this, DataPackage.SCAN_META_DATA_STANDARD_TYPE__SCANS);
		}
		return scans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		boolean oldVersionESet = versionESet;
		versionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCAN_META_DATA_STANDARD_TYPE__VERSION, oldVersion, version, !oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVersion() {
		String oldVersion = version;
		boolean oldVersionESet = versionESet;
		version = VERSION_EDEFAULT;
		versionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DataPackage.SCAN_META_DATA_STANDARD_TYPE__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
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
			case DataPackage.SCAN_META_DATA_STANDARD_TYPE__SCAN_PACKAGE:
				return basicSetScanPackage(null, msgs);
			case DataPackage.SCAN_META_DATA_STANDARD_TYPE__SCANS:
				return ((InternalEList<?>)getScans()).basicRemove(otherEnd, msgs);
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
			case DataPackage.SCAN_META_DATA_STANDARD_TYPE__SCAN_PACKAGE:
				return getScanPackage();
			case DataPackage.SCAN_META_DATA_STANDARD_TYPE__SCANS:
				return getScans();
			case DataPackage.SCAN_META_DATA_STANDARD_TYPE__VERSION:
				return getVersion();
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
			case DataPackage.SCAN_META_DATA_STANDARD_TYPE__SCAN_PACKAGE:
				setScanPackage((PackageType)newValue);
				return;
			case DataPackage.SCAN_META_DATA_STANDARD_TYPE__SCANS:
				getScans().clear();
				getScans().addAll((Collection<? extends ScansType>)newValue);
				return;
			case DataPackage.SCAN_META_DATA_STANDARD_TYPE__VERSION:
				setVersion((String)newValue);
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
			case DataPackage.SCAN_META_DATA_STANDARD_TYPE__SCAN_PACKAGE:
				setScanPackage((PackageType)null);
				return;
			case DataPackage.SCAN_META_DATA_STANDARD_TYPE__SCANS:
				getScans().clear();
				return;
			case DataPackage.SCAN_META_DATA_STANDARD_TYPE__VERSION:
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
			case DataPackage.SCAN_META_DATA_STANDARD_TYPE__SCAN_PACKAGE:
				return scanPackage != null;
			case DataPackage.SCAN_META_DATA_STANDARD_TYPE__SCANS:
				return scans != null && !scans.isEmpty();
			case DataPackage.SCAN_META_DATA_STANDARD_TYPE__VERSION:
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
		result.append(" (version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ScanMetaDataStandardTypeImpl
