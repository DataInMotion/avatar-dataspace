/*
 */
package com.himsa.measurement.audiogram.metadata._500.impl;

import com.himsa.measurement.audiogram.metadata._500.AMCLASSType;
import com.himsa.measurement.audiogram.metadata._500.ConfigurationSeverityChoiceType;
import com.himsa.measurement.audiogram.metadata._500.SiteOfLesionType;
import com.himsa.measurement.audiogram.metadata._500._500Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AMCLASS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram.metadata._500.impl.AMCLASSTypeImpl#getSiteOfLesion <em>Site Of Lesion</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.metadata._500.impl.AMCLASSTypeImpl#getConfigurationSeverityChoice <em>Configuration Severity Choice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AMCLASSTypeImpl extends MinimalEObjectImpl.Container implements AMCLASSType {
	/**
	 * The default value of the '{@link #getSiteOfLesion() <em>Site Of Lesion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteOfLesion()
	 * @generated
	 * @ordered
	 */
	protected static final SiteOfLesionType SITE_OF_LESION_EDEFAULT = SiteOfLesionType.CONDUCTIVE;

	/**
	 * The cached value of the '{@link #getSiteOfLesion() <em>Site Of Lesion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteOfLesion()
	 * @generated
	 * @ordered
	 */
	protected SiteOfLesionType siteOfLesion = SITE_OF_LESION_EDEFAULT;

	/**
	 * This is true if the Site Of Lesion attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean siteOfLesionESet;

	/**
	 * The cached value of the '{@link #getConfigurationSeverityChoice() <em>Configuration Severity Choice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationSeverityChoice()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationSeverityChoiceType configurationSeverityChoice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AMCLASSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _500Package.Literals.AMCLASS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SiteOfLesionType getSiteOfLesion() {
		return siteOfLesion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSiteOfLesion(SiteOfLesionType newSiteOfLesion) {
		SiteOfLesionType oldSiteOfLesion = siteOfLesion;
		siteOfLesion = newSiteOfLesion == null ? SITE_OF_LESION_EDEFAULT : newSiteOfLesion;
		boolean oldSiteOfLesionESet = siteOfLesionESet;
		siteOfLesionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.AMCLASS_TYPE__SITE_OF_LESION, oldSiteOfLesion, siteOfLesion, !oldSiteOfLesionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSiteOfLesion() {
		SiteOfLesionType oldSiteOfLesion = siteOfLesion;
		boolean oldSiteOfLesionESet = siteOfLesionESet;
		siteOfLesion = SITE_OF_LESION_EDEFAULT;
		siteOfLesionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _500Package.AMCLASS_TYPE__SITE_OF_LESION, oldSiteOfLesion, SITE_OF_LESION_EDEFAULT, oldSiteOfLesionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSiteOfLesion() {
		return siteOfLesionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationSeverityChoiceType getConfigurationSeverityChoice() {
		return configurationSeverityChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigurationSeverityChoice(ConfigurationSeverityChoiceType newConfigurationSeverityChoice, NotificationChain msgs) {
		ConfigurationSeverityChoiceType oldConfigurationSeverityChoice = configurationSeverityChoice;
		configurationSeverityChoice = newConfigurationSeverityChoice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _500Package.AMCLASS_TYPE__CONFIGURATION_SEVERITY_CHOICE, oldConfigurationSeverityChoice, newConfigurationSeverityChoice);
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
	public void setConfigurationSeverityChoice(ConfigurationSeverityChoiceType newConfigurationSeverityChoice) {
		if (newConfigurationSeverityChoice != configurationSeverityChoice) {
			NotificationChain msgs = null;
			if (configurationSeverityChoice != null)
				msgs = ((InternalEObject)configurationSeverityChoice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _500Package.AMCLASS_TYPE__CONFIGURATION_SEVERITY_CHOICE, null, msgs);
			if (newConfigurationSeverityChoice != null)
				msgs = ((InternalEObject)newConfigurationSeverityChoice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _500Package.AMCLASS_TYPE__CONFIGURATION_SEVERITY_CHOICE, null, msgs);
			msgs = basicSetConfigurationSeverityChoice(newConfigurationSeverityChoice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.AMCLASS_TYPE__CONFIGURATION_SEVERITY_CHOICE, newConfigurationSeverityChoice, newConfigurationSeverityChoice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _500Package.AMCLASS_TYPE__CONFIGURATION_SEVERITY_CHOICE:
				return basicSetConfigurationSeverityChoice(null, msgs);
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
			case _500Package.AMCLASS_TYPE__SITE_OF_LESION:
				return getSiteOfLesion();
			case _500Package.AMCLASS_TYPE__CONFIGURATION_SEVERITY_CHOICE:
				return getConfigurationSeverityChoice();
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
			case _500Package.AMCLASS_TYPE__SITE_OF_LESION:
				setSiteOfLesion((SiteOfLesionType)newValue);
				return;
			case _500Package.AMCLASS_TYPE__CONFIGURATION_SEVERITY_CHOICE:
				setConfigurationSeverityChoice((ConfigurationSeverityChoiceType)newValue);
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
			case _500Package.AMCLASS_TYPE__SITE_OF_LESION:
				unsetSiteOfLesion();
				return;
			case _500Package.AMCLASS_TYPE__CONFIGURATION_SEVERITY_CHOICE:
				setConfigurationSeverityChoice((ConfigurationSeverityChoiceType)null);
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
			case _500Package.AMCLASS_TYPE__SITE_OF_LESION:
				return isSetSiteOfLesion();
			case _500Package.AMCLASS_TYPE__CONFIGURATION_SEVERITY_CHOICE:
				return configurationSeverityChoice != null;
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
		result.append(" (siteOfLesion: ");
		if (siteOfLesionESet) result.append(siteOfLesion); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AMCLASSTypeImpl
