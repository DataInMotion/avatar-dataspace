/*
 */
package com.himsa.measurement.audiogram._502.impl;

import com.himsa.measurement.audiogram._502.InformationType;
import com.himsa.measurement.audiogram._502.SupplementaryDataType;
import com.himsa.measurement.audiogram._502._502Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supplementary Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram._502.impl.SupplementaryDataTypeImpl#getInformation <em>Information</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram._502.impl.SupplementaryDataTypeImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplementaryDataTypeImpl extends MinimalEObjectImpl.Container implements SupplementaryDataType {
	/**
	 * The cached value of the '{@link #getInformation() <em>Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformation()
	 * @generated
	 * @ordered
	 */
	protected InformationType information;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplementaryDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _502Package.Literals.SUPPLEMENTARY_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InformationType getInformation() {
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInformation(InformationType newInformation, NotificationChain msgs) {
		InformationType oldInformation = information;
		information = newInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _502Package.SUPPLEMENTARY_DATA_TYPE__INFORMATION, oldInformation, newInformation);
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
	public void setInformation(InformationType newInformation) {
		if (newInformation != information) {
			NotificationChain msgs = null;
			if (information != null)
				msgs = ((InternalEObject)information).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _502Package.SUPPLEMENTARY_DATA_TYPE__INFORMATION, null, msgs);
			if (newInformation != null)
				msgs = ((InternalEObject)newInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _502Package.SUPPLEMENTARY_DATA_TYPE__INFORMATION, null, msgs);
			msgs = basicSetInformation(newInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _502Package.SUPPLEMENTARY_DATA_TYPE__INFORMATION, newInformation, newInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, _502Package.SUPPLEMENTARY_DATA_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _502Package.SUPPLEMENTARY_DATA_TYPE__INFORMATION:
				return basicSetInformation(null, msgs);
			case _502Package.SUPPLEMENTARY_DATA_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case _502Package.SUPPLEMENTARY_DATA_TYPE__INFORMATION:
				return getInformation();
			case _502Package.SUPPLEMENTARY_DATA_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
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
			case _502Package.SUPPLEMENTARY_DATA_TYPE__INFORMATION:
				setInformation((InformationType)newValue);
				return;
			case _502Package.SUPPLEMENTARY_DATA_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
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
			case _502Package.SUPPLEMENTARY_DATA_TYPE__INFORMATION:
				setInformation((InformationType)null);
				return;
			case _502Package.SUPPLEMENTARY_DATA_TYPE__ANY:
				getAny().clear();
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
			case _502Package.SUPPLEMENTARY_DATA_TYPE__INFORMATION:
				return information != null;
			case _502Package.SUPPLEMENTARY_DATA_TYPE__ANY:
				return any != null && !any.isEmpty();
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
		result.append(" (any: ");
		result.append(any);
		result.append(')');
		return result.toString();
	}

} //SupplementaryDataTypeImpl
