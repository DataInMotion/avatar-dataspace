/*
 */
package com.himsa.measurement.audiogram.metadata._500.impl;

import com.himsa.measurement.audiogram.metadata._500.AudiogramClassificationsType;
import com.himsa.measurement.audiogram.metadata._500.HIMSAAudiogramMetadataStandardType;
import com.himsa.measurement.audiogram.metadata._500.PredictedAccuraciesType;
import com.himsa.measurement.audiogram.metadata._500._500Package;

import java.math.BigInteger;

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
 * An implementation of the model object '<em><b>HIMSA Audiogram Metadata Standard Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram.metadata._500.impl.HIMSAAudiogramMetadataStandardTypeImpl#isAutomatedMeasurement <em>Automated Measurement</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.metadata._500.impl.HIMSAAudiogramMetadataStandardTypeImpl#getPredictedAccuracies <em>Predicted Accuracies</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.metadata._500.impl.HIMSAAudiogramMetadataStandardTypeImpl#getAudiogramClassifications <em>Audiogram Classifications</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.metadata._500.impl.HIMSAAudiogramMetadataStandardTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HIMSAAudiogramMetadataStandardTypeImpl extends MinimalEObjectImpl.Container implements HIMSAAudiogramMetadataStandardType {
	/**
	 * The default value of the '{@link #isAutomatedMeasurement() <em>Automated Measurement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutomatedMeasurement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTOMATED_MEASUREMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutomatedMeasurement() <em>Automated Measurement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutomatedMeasurement()
	 * @generated
	 * @ordered
	 */
	protected boolean automatedMeasurement = AUTOMATED_MEASUREMENT_EDEFAULT;

	/**
	 * This is true if the Automated Measurement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean automatedMeasurementESet;

	/**
	 * The cached value of the '{@link #getPredictedAccuracies() <em>Predicted Accuracies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredictedAccuracies()
	 * @generated
	 * @ordered
	 */
	protected EList<PredictedAccuraciesType> predictedAccuracies;

	/**
	 * The cached value of the '{@link #getAudiogramClassifications() <em>Audiogram Classifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudiogramClassifications()
	 * @generated
	 * @ordered
	 */
	protected EList<AudiogramClassificationsType> audiogramClassifications;

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
	protected HIMSAAudiogramMetadataStandardTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _500Package.Literals.HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutomatedMeasurement() {
		return automatedMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutomatedMeasurement(boolean newAutomatedMeasurement) {
		boolean oldAutomatedMeasurement = automatedMeasurement;
		automatedMeasurement = newAutomatedMeasurement;
		boolean oldAutomatedMeasurementESet = automatedMeasurementESet;
		automatedMeasurementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__AUTOMATED_MEASUREMENT, oldAutomatedMeasurement, automatedMeasurement, !oldAutomatedMeasurementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAutomatedMeasurement() {
		boolean oldAutomatedMeasurement = automatedMeasurement;
		boolean oldAutomatedMeasurementESet = automatedMeasurementESet;
		automatedMeasurement = AUTOMATED_MEASUREMENT_EDEFAULT;
		automatedMeasurementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _500Package.HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__AUTOMATED_MEASUREMENT, oldAutomatedMeasurement, AUTOMATED_MEASUREMENT_EDEFAULT, oldAutomatedMeasurementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAutomatedMeasurement() {
		return automatedMeasurementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PredictedAccuraciesType> getPredictedAccuracies() {
		if (predictedAccuracies == null) {
			predictedAccuracies = new EObjectContainmentEList<PredictedAccuraciesType>(PredictedAccuraciesType.class, this, _500Package.HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__PREDICTED_ACCURACIES);
		}
		return predictedAccuracies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AudiogramClassificationsType> getAudiogramClassifications() {
		if (audiogramClassifications == null) {
			audiogramClassifications = new EObjectContainmentEList<AudiogramClassificationsType>(AudiogramClassificationsType.class, this, _500Package.HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__AUDIOGRAM_CLASSIFICATIONS);
		}
		return audiogramClassifications;
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
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__VERSION, oldVersion, version, !oldVersionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, _500Package.HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
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
			case _500Package.HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__PREDICTED_ACCURACIES:
				return ((InternalEList<?>)getPredictedAccuracies()).basicRemove(otherEnd, msgs);
			case _500Package.HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__AUDIOGRAM_CLASSIFICATIONS:
				return ((InternalEList<?>)getAudiogramClassifications()).basicRemove(otherEnd, msgs);
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
			case _500Package.HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__AUTOMATED_MEASUREMENT:
				return isAutomatedMeasurement();
			case _500Package.HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__PREDICTED_ACCURACIES:
				return getPredictedAccuracies();
			case _500Package.HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__AUDIOGRAM_CLASSIFICATIONS:
				return getAudiogramClassifications();
			case _500Package.HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__VERSION:
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
			case _500Package.HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__AUTOMATED_MEASUREMENT:
				setAutomatedMeasurement((Boolean)newValue);
				return;
			case _500Package.HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__PREDICTED_ACCURACIES:
				getPredictedAccuracies().clear();
				getPredictedAccuracies().addAll((Collection<? extends PredictedAccuraciesType>)newValue);
				return;
			case _500Package.HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__AUDIOGRAM_CLASSIFICATIONS:
				getAudiogramClassifications().clear();
				getAudiogramClassifications().addAll((Collection<? extends AudiogramClassificationsType>)newValue);
				return;
			case _500Package.HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__VERSION:
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
			case _500Package.HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__AUTOMATED_MEASUREMENT:
				unsetAutomatedMeasurement();
				return;
			case _500Package.HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__PREDICTED_ACCURACIES:
				getPredictedAccuracies().clear();
				return;
			case _500Package.HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__AUDIOGRAM_CLASSIFICATIONS:
				getAudiogramClassifications().clear();
				return;
			case _500Package.HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__VERSION:
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
			case _500Package.HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__AUTOMATED_MEASUREMENT:
				return isSetAutomatedMeasurement();
			case _500Package.HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__PREDICTED_ACCURACIES:
				return predictedAccuracies != null && !predictedAccuracies.isEmpty();
			case _500Package.HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__AUDIOGRAM_CLASSIFICATIONS:
				return audiogramClassifications != null && !audiogramClassifications.isEmpty();
			case _500Package.HIMSA_AUDIOGRAM_METADATA_STANDARD_TYPE__VERSION:
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
		result.append(" (automatedMeasurement: ");
		if (automatedMeasurementESet) result.append(automatedMeasurement); else result.append("<unset>");
		result.append(", version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //HIMSAAudiogramMetadataStandardTypeImpl
