/*
 */
package com.himsa.scan.scan.meta.data.impl;

import com.himsa.scan.scan.meta.data.DataPackage;
import com.himsa.scan.scan.meta.data.StoredInNoahType;
import com.himsa.scan.scan.meta.data.StoredPublicOrPrivateType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stored In Noah Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.scan.scan.meta.data.impl.StoredInNoahTypeImpl#getStoredPublicOrPrivate <em>Stored Public Or Private</em>}</li>
 *   <li>{@link com.himsa.scan.scan.meta.data.impl.StoredInNoahTypeImpl#getActionDateTimeStamp <em>Action Date Time Stamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoredInNoahTypeImpl extends MinimalEObjectImpl.Container implements StoredInNoahType {
	/**
	 * The default value of the '{@link #getStoredPublicOrPrivate() <em>Stored Public Or Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoredPublicOrPrivate()
	 * @generated
	 * @ordered
	 */
	protected static final StoredPublicOrPrivateType STORED_PUBLIC_OR_PRIVATE_EDEFAULT = StoredPublicOrPrivateType.PUBLIC;

	/**
	 * The cached value of the '{@link #getStoredPublicOrPrivate() <em>Stored Public Or Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoredPublicOrPrivate()
	 * @generated
	 * @ordered
	 */
	protected StoredPublicOrPrivateType storedPublicOrPrivate = STORED_PUBLIC_OR_PRIVATE_EDEFAULT;

	/**
	 * This is true if the Stored Public Or Private attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean storedPublicOrPrivateESet;

	/**
	 * The default value of the '{@link #getActionDateTimeStamp() <em>Action Date Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionDateTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ACTION_DATE_TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionDateTimeStamp() <em>Action Date Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionDateTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar actionDateTimeStamp = ACTION_DATE_TIME_STAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoredInNoahTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.STORED_IN_NOAH_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StoredPublicOrPrivateType getStoredPublicOrPrivate() {
		return storedPublicOrPrivate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStoredPublicOrPrivate(StoredPublicOrPrivateType newStoredPublicOrPrivate) {
		StoredPublicOrPrivateType oldStoredPublicOrPrivate = storedPublicOrPrivate;
		storedPublicOrPrivate = newStoredPublicOrPrivate == null ? STORED_PUBLIC_OR_PRIVATE_EDEFAULT : newStoredPublicOrPrivate;
		boolean oldStoredPublicOrPrivateESet = storedPublicOrPrivateESet;
		storedPublicOrPrivateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.STORED_IN_NOAH_TYPE__STORED_PUBLIC_OR_PRIVATE, oldStoredPublicOrPrivate, storedPublicOrPrivate, !oldStoredPublicOrPrivateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStoredPublicOrPrivate() {
		StoredPublicOrPrivateType oldStoredPublicOrPrivate = storedPublicOrPrivate;
		boolean oldStoredPublicOrPrivateESet = storedPublicOrPrivateESet;
		storedPublicOrPrivate = STORED_PUBLIC_OR_PRIVATE_EDEFAULT;
		storedPublicOrPrivateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DataPackage.STORED_IN_NOAH_TYPE__STORED_PUBLIC_OR_PRIVATE, oldStoredPublicOrPrivate, STORED_PUBLIC_OR_PRIVATE_EDEFAULT, oldStoredPublicOrPrivateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStoredPublicOrPrivate() {
		return storedPublicOrPrivateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getActionDateTimeStamp() {
		return actionDateTimeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActionDateTimeStamp(XMLGregorianCalendar newActionDateTimeStamp) {
		XMLGregorianCalendar oldActionDateTimeStamp = actionDateTimeStamp;
		actionDateTimeStamp = newActionDateTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.STORED_IN_NOAH_TYPE__ACTION_DATE_TIME_STAMP, oldActionDateTimeStamp, actionDateTimeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.STORED_IN_NOAH_TYPE__STORED_PUBLIC_OR_PRIVATE:
				return getStoredPublicOrPrivate();
			case DataPackage.STORED_IN_NOAH_TYPE__ACTION_DATE_TIME_STAMP:
				return getActionDateTimeStamp();
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
			case DataPackage.STORED_IN_NOAH_TYPE__STORED_PUBLIC_OR_PRIVATE:
				setStoredPublicOrPrivate((StoredPublicOrPrivateType)newValue);
				return;
			case DataPackage.STORED_IN_NOAH_TYPE__ACTION_DATE_TIME_STAMP:
				setActionDateTimeStamp((XMLGregorianCalendar)newValue);
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
			case DataPackage.STORED_IN_NOAH_TYPE__STORED_PUBLIC_OR_PRIVATE:
				unsetStoredPublicOrPrivate();
				return;
			case DataPackage.STORED_IN_NOAH_TYPE__ACTION_DATE_TIME_STAMP:
				setActionDateTimeStamp(ACTION_DATE_TIME_STAMP_EDEFAULT);
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
			case DataPackage.STORED_IN_NOAH_TYPE__STORED_PUBLIC_OR_PRIVATE:
				return isSetStoredPublicOrPrivate();
			case DataPackage.STORED_IN_NOAH_TYPE__ACTION_DATE_TIME_STAMP:
				return ACTION_DATE_TIME_STAMP_EDEFAULT == null ? actionDateTimeStamp != null : !ACTION_DATE_TIME_STAMP_EDEFAULT.equals(actionDateTimeStamp);
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
		result.append(" (storedPublicOrPrivate: ");
		if (storedPublicOrPrivateESet) result.append(storedPublicOrPrivate); else result.append("<unset>");
		result.append(", actionDateTimeStamp: ");
		result.append(actionDateTimeStamp);
		result.append(')');
		return result.toString();
	}

} //StoredInNoahTypeImpl
