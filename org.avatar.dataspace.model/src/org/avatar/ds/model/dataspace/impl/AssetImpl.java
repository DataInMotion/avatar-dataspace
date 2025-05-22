/*
 */
package org.avatar.ds.model.dataspace.impl;

import org.avatar.ds.model.dataspace.Asset;
import org.avatar.ds.model.dataspace.DataAddress;
import org.avatar.ds.model.dataspace.DataspacePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.avatar.ds.model.dataspace.impl.AssetImpl#getDataAddress <em>Data Address</em>}</li>
 *   <li>{@link org.avatar.ds.model.dataspace.impl.AssetImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetImpl extends DataSpaceResponseImpl implements Asset {
	/**
	 * The cached value of the '{@link #getDataAddress() <em>Data Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataAddress()
	 * @generated
	 * @ordered
	 */
	protected DataAddress dataAddress;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataspacePackage.Literals.ASSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataAddress getDataAddress() {
		return dataAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataAddress(DataAddress newDataAddress, NotificationChain msgs) {
		DataAddress oldDataAddress = dataAddress;
		dataAddress = newDataAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataspacePackage.ASSET__DATA_ADDRESS, oldDataAddress, newDataAddress);
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
	public void setDataAddress(DataAddress newDataAddress) {
		if (newDataAddress != dataAddress) {
			NotificationChain msgs = null;
			if (dataAddress != null)
				msgs = ((InternalEObject)dataAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataspacePackage.ASSET__DATA_ADDRESS, null, msgs);
			if (newDataAddress != null)
				msgs = ((InternalEObject)newDataAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataspacePackage.ASSET__DATA_ADDRESS, null, msgs);
			msgs = basicSetDataAddress(newDataAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataspacePackage.ASSET__DATA_ADDRESS, newDataAddress, newDataAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getProperties() {
		if (properties == null) {
			properties = new EcoreEMap<String,String>(DataspacePackage.Literals.PROPERTY_MAP, PropertyMapImpl.class, this, DataspacePackage.ASSET__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataspacePackage.ASSET__DATA_ADDRESS:
				return basicSetDataAddress(null, msgs);
			case DataspacePackage.ASSET__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case DataspacePackage.ASSET__DATA_ADDRESS:
				return getDataAddress();
			case DataspacePackage.ASSET__PROPERTIES:
				if (coreType) return getProperties();
				else return getProperties().map();
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
			case DataspacePackage.ASSET__DATA_ADDRESS:
				setDataAddress((DataAddress)newValue);
				return;
			case DataspacePackage.ASSET__PROPERTIES:
				((EStructuralFeature.Setting)getProperties()).set(newValue);
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
			case DataspacePackage.ASSET__DATA_ADDRESS:
				setDataAddress((DataAddress)null);
				return;
			case DataspacePackage.ASSET__PROPERTIES:
				getProperties().clear();
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
			case DataspacePackage.ASSET__DATA_ADDRESS:
				return dataAddress != null;
			case DataspacePackage.ASSET__PROPERTIES:
				return properties != null && !properties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssetImpl
