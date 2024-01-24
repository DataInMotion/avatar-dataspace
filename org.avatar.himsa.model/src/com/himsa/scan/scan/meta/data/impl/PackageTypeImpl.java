/*
 */
package com.himsa.scan.scan.meta.data.impl;

import com.himsa.scan.scan.meta.data.DataPackage;
import com.himsa.scan.scan.meta.data.PackageType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.scan.scan.meta.data.impl.PackageTypeImpl#getPackageLocation <em>Package Location</em>}</li>
 *   <li>{@link com.himsa.scan.scan.meta.data.impl.PackageTypeImpl#getPackageID <em>Package ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageTypeImpl extends MinimalEObjectImpl.Container implements PackageType {
	/**
	 * The default value of the '{@link #getPackageLocation() <em>Package Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageLocation() <em>Package Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageLocation()
	 * @generated
	 * @ordered
	 */
	protected String packageLocation = PACKAGE_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageID() <em>Package ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageID()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageID() <em>Package ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageID()
	 * @generated
	 * @ordered
	 */
	protected String packageID = PACKAGE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.PACKAGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPackageLocation() {
		return packageLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackageLocation(String newPackageLocation) {
		String oldPackageLocation = packageLocation;
		packageLocation = newPackageLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.PACKAGE_TYPE__PACKAGE_LOCATION, oldPackageLocation, packageLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPackageID() {
		return packageID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackageID(String newPackageID) {
		String oldPackageID = packageID;
		packageID = newPackageID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.PACKAGE_TYPE__PACKAGE_ID, oldPackageID, packageID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.PACKAGE_TYPE__PACKAGE_LOCATION:
				return getPackageLocation();
			case DataPackage.PACKAGE_TYPE__PACKAGE_ID:
				return getPackageID();
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
			case DataPackage.PACKAGE_TYPE__PACKAGE_LOCATION:
				setPackageLocation((String)newValue);
				return;
			case DataPackage.PACKAGE_TYPE__PACKAGE_ID:
				setPackageID((String)newValue);
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
			case DataPackage.PACKAGE_TYPE__PACKAGE_LOCATION:
				setPackageLocation(PACKAGE_LOCATION_EDEFAULT);
				return;
			case DataPackage.PACKAGE_TYPE__PACKAGE_ID:
				setPackageID(PACKAGE_ID_EDEFAULT);
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
			case DataPackage.PACKAGE_TYPE__PACKAGE_LOCATION:
				return PACKAGE_LOCATION_EDEFAULT == null ? packageLocation != null : !PACKAGE_LOCATION_EDEFAULT.equals(packageLocation);
			case DataPackage.PACKAGE_TYPE__PACKAGE_ID:
				return PACKAGE_ID_EDEFAULT == null ? packageID != null : !PACKAGE_ID_EDEFAULT.equals(packageID);
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
		result.append(" (packageLocation: ");
		result.append(packageLocation);
		result.append(", packageID: ");
		result.append(packageID);
		result.append(')');
		return result.toString();
	}

} //PackageTypeImpl
