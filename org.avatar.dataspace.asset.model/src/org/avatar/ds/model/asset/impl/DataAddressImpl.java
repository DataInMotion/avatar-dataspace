/*
 */
package org.avatar.ds.model.asset.impl;

import org.avatar.ds.model.asset.DataAddress;
import org.avatar.ds.model.asset.DataSpaceAssetPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.avatar.ds.model.asset.impl.DataAddressImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.avatar.ds.model.asset.impl.DataAddressImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.avatar.ds.model.asset.impl.DataAddressImpl#getBaseUrl <em>Base Url</em>}</li>
 *   <li>{@link org.avatar.ds.model.asset.impl.DataAddressImpl#isProxyPath <em>Proxy Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataAddressImpl extends MinimalEObjectImpl.Container implements DataAddress {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseUrl() <em>Base Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseUrl() <em>Base Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseUrl()
	 * @generated
	 * @ordered
	 */
	protected String baseUrl = BASE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #isProxyPath() <em>Proxy Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProxyPath()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROXY_PATH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProxyPath() <em>Proxy Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProxyPath()
	 * @generated
	 * @ordered
	 */
	protected boolean proxyPath = PROXY_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataSpaceAssetPackage.Literals.DATA_ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSpaceAssetPackage.DATA_ADDRESS__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSpaceAssetPackage.DATA_ADDRESS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBaseUrl() {
		return baseUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseUrl(String newBaseUrl) {
		String oldBaseUrl = baseUrl;
		baseUrl = newBaseUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSpaceAssetPackage.DATA_ADDRESS__BASE_URL, oldBaseUrl, baseUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isProxyPath() {
		return proxyPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProxyPath(boolean newProxyPath) {
		boolean oldProxyPath = proxyPath;
		proxyPath = newProxyPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSpaceAssetPackage.DATA_ADDRESS__PROXY_PATH, oldProxyPath, proxyPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataSpaceAssetPackage.DATA_ADDRESS__TYPE:
				return getType();
			case DataSpaceAssetPackage.DATA_ADDRESS__NAME:
				return getName();
			case DataSpaceAssetPackage.DATA_ADDRESS__BASE_URL:
				return getBaseUrl();
			case DataSpaceAssetPackage.DATA_ADDRESS__PROXY_PATH:
				return isProxyPath();
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
			case DataSpaceAssetPackage.DATA_ADDRESS__TYPE:
				setType((String)newValue);
				return;
			case DataSpaceAssetPackage.DATA_ADDRESS__NAME:
				setName((String)newValue);
				return;
			case DataSpaceAssetPackage.DATA_ADDRESS__BASE_URL:
				setBaseUrl((String)newValue);
				return;
			case DataSpaceAssetPackage.DATA_ADDRESS__PROXY_PATH:
				setProxyPath((Boolean)newValue);
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
			case DataSpaceAssetPackage.DATA_ADDRESS__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DataSpaceAssetPackage.DATA_ADDRESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DataSpaceAssetPackage.DATA_ADDRESS__BASE_URL:
				setBaseUrl(BASE_URL_EDEFAULT);
				return;
			case DataSpaceAssetPackage.DATA_ADDRESS__PROXY_PATH:
				setProxyPath(PROXY_PATH_EDEFAULT);
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
			case DataSpaceAssetPackage.DATA_ADDRESS__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case DataSpaceAssetPackage.DATA_ADDRESS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DataSpaceAssetPackage.DATA_ADDRESS__BASE_URL:
				return BASE_URL_EDEFAULT == null ? baseUrl != null : !BASE_URL_EDEFAULT.equals(baseUrl);
			case DataSpaceAssetPackage.DATA_ADDRESS__PROXY_PATH:
				return proxyPath != PROXY_PATH_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", name: ");
		result.append(name);
		result.append(", baseUrl: ");
		result.append(baseUrl);
		result.append(", proxyPath: ");
		result.append(proxyPath);
		result.append(')');
		return result.toString();
	}

} //DataAddressImpl
