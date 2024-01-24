/*
 */
package com.himsa.measurement.audiogram.metadata._500.impl;

import com.himsa.measurement.audiogram.metadata._500.AMCLASSType1;
import com.himsa.measurement.audiogram.metadata._500.AudiogramClassificationsType;
import com.himsa.measurement.audiogram.metadata._500._500Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audiogram Classifications Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram.metadata._500.impl.AudiogramClassificationsTypeImpl#getAMCLASS <em>AMCLASS</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.metadata._500.impl.AudiogramClassificationsTypeImpl#getNonStandardized <em>Non Standardized</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AudiogramClassificationsTypeImpl extends MinimalEObjectImpl.Container implements AudiogramClassificationsType {
	/**
	 * The cached value of the '{@link #getAMCLASS() <em>AMCLASS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAMCLASS()
	 * @generated
	 * @ordered
	 */
	protected AMCLASSType1 aMCLASS;

	/**
	 * The default value of the '{@link #getNonStandardized() <em>Non Standardized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonStandardized()
	 * @generated
	 * @ordered
	 */
	protected static final String NON_STANDARDIZED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNonStandardized() <em>Non Standardized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonStandardized()
	 * @generated
	 * @ordered
	 */
	protected String nonStandardized = NON_STANDARDIZED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AudiogramClassificationsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _500Package.Literals.AUDIOGRAM_CLASSIFICATIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AMCLASSType1 getAMCLASS() {
		return aMCLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAMCLASS(AMCLASSType1 newAMCLASS, NotificationChain msgs) {
		AMCLASSType1 oldAMCLASS = aMCLASS;
		aMCLASS = newAMCLASS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _500Package.AUDIOGRAM_CLASSIFICATIONS_TYPE__AMCLASS, oldAMCLASS, newAMCLASS);
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
	public void setAMCLASS(AMCLASSType1 newAMCLASS) {
		if (newAMCLASS != aMCLASS) {
			NotificationChain msgs = null;
			if (aMCLASS != null)
				msgs = ((InternalEObject)aMCLASS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _500Package.AUDIOGRAM_CLASSIFICATIONS_TYPE__AMCLASS, null, msgs);
			if (newAMCLASS != null)
				msgs = ((InternalEObject)newAMCLASS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _500Package.AUDIOGRAM_CLASSIFICATIONS_TYPE__AMCLASS, null, msgs);
			msgs = basicSetAMCLASS(newAMCLASS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.AUDIOGRAM_CLASSIFICATIONS_TYPE__AMCLASS, newAMCLASS, newAMCLASS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNonStandardized() {
		return nonStandardized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNonStandardized(String newNonStandardized) {
		String oldNonStandardized = nonStandardized;
		nonStandardized = newNonStandardized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.AUDIOGRAM_CLASSIFICATIONS_TYPE__NON_STANDARDIZED, oldNonStandardized, nonStandardized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _500Package.AUDIOGRAM_CLASSIFICATIONS_TYPE__AMCLASS:
				return basicSetAMCLASS(null, msgs);
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
			case _500Package.AUDIOGRAM_CLASSIFICATIONS_TYPE__AMCLASS:
				return getAMCLASS();
			case _500Package.AUDIOGRAM_CLASSIFICATIONS_TYPE__NON_STANDARDIZED:
				return getNonStandardized();
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
			case _500Package.AUDIOGRAM_CLASSIFICATIONS_TYPE__AMCLASS:
				setAMCLASS((AMCLASSType1)newValue);
				return;
			case _500Package.AUDIOGRAM_CLASSIFICATIONS_TYPE__NON_STANDARDIZED:
				setNonStandardized((String)newValue);
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
			case _500Package.AUDIOGRAM_CLASSIFICATIONS_TYPE__AMCLASS:
				setAMCLASS((AMCLASSType1)null);
				return;
			case _500Package.AUDIOGRAM_CLASSIFICATIONS_TYPE__NON_STANDARDIZED:
				setNonStandardized(NON_STANDARDIZED_EDEFAULT);
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
			case _500Package.AUDIOGRAM_CLASSIFICATIONS_TYPE__AMCLASS:
				return aMCLASS != null;
			case _500Package.AUDIOGRAM_CLASSIFICATIONS_TYPE__NON_STANDARDIZED:
				return NON_STANDARDIZED_EDEFAULT == null ? nonStandardized != null : !NON_STANDARDIZED_EDEFAULT.equals(nonStandardized);
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
		result.append(" (nonStandardized: ");
		result.append(nonStandardized);
		result.append(')');
		return result.toString();
	}

} //AudiogramClassificationsTypeImpl
