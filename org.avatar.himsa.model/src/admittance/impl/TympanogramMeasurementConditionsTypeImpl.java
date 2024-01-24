/*
 */
package admittance.impl;

import admittance.AdmittancePackage;
import admittance.ProbeFrequencyType;
import admittance.RecordingModeType;
import admittance.TympanogramMeasurementConditionsType;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tympanogram Measurement Conditions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link admittance.impl.TympanogramMeasurementConditionsTypeImpl#getSweepSpeed <em>Sweep Speed</em>}</li>
 *   <li>{@link admittance.impl.TympanogramMeasurementConditionsTypeImpl#getRecordMode <em>Record Mode</em>}</li>
 *   <li>{@link admittance.impl.TympanogramMeasurementConditionsTypeImpl#getProbeFrequency <em>Probe Frequency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TympanogramMeasurementConditionsTypeImpl extends MinimalEObjectImpl.Container implements TympanogramMeasurementConditionsType {
	/**
	 * The default value of the '{@link #getSweepSpeed() <em>Sweep Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSweepSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SWEEP_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSweepSpeed() <em>Sweep Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSweepSpeed()
	 * @generated
	 * @ordered
	 */
	protected BigInteger sweepSpeed = SWEEP_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecordMode() <em>Record Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordMode()
	 * @generated
	 * @ordered
	 */
	protected static final RecordingModeType RECORD_MODE_EDEFAULT = RecordingModeType.COMPENSATED;

	/**
	 * The cached value of the '{@link #getRecordMode() <em>Record Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordMode()
	 * @generated
	 * @ordered
	 */
	protected RecordingModeType recordMode = RECORD_MODE_EDEFAULT;

	/**
	 * This is true if the Record Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean recordModeESet;

	/**
	 * The cached value of the '{@link #getProbeFrequency() <em>Probe Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbeFrequency()
	 * @generated
	 * @ordered
	 */
	protected ProbeFrequencyType probeFrequency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TympanogramMeasurementConditionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdmittancePackage.Literals.TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getSweepSpeed() {
		return sweepSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSweepSpeed(BigInteger newSweepSpeed) {
		BigInteger oldSweepSpeed = sweepSpeed;
		sweepSpeed = newSweepSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__SWEEP_SPEED, oldSweepSpeed, sweepSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecordingModeType getRecordMode() {
		return recordMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecordMode(RecordingModeType newRecordMode) {
		RecordingModeType oldRecordMode = recordMode;
		recordMode = newRecordMode == null ? RECORD_MODE_EDEFAULT : newRecordMode;
		boolean oldRecordModeESet = recordModeESet;
		recordModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__RECORD_MODE, oldRecordMode, recordMode, !oldRecordModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRecordMode() {
		RecordingModeType oldRecordMode = recordMode;
		boolean oldRecordModeESet = recordModeESet;
		recordMode = RECORD_MODE_EDEFAULT;
		recordModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdmittancePackage.TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__RECORD_MODE, oldRecordMode, RECORD_MODE_EDEFAULT, oldRecordModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRecordMode() {
		return recordModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProbeFrequencyType getProbeFrequency() {
		return probeFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProbeFrequency(ProbeFrequencyType newProbeFrequency, NotificationChain msgs) {
		ProbeFrequencyType oldProbeFrequency = probeFrequency;
		probeFrequency = newProbeFrequency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdmittancePackage.TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__PROBE_FREQUENCY, oldProbeFrequency, newProbeFrequency);
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
	public void setProbeFrequency(ProbeFrequencyType newProbeFrequency) {
		if (newProbeFrequency != probeFrequency) {
			NotificationChain msgs = null;
			if (probeFrequency != null)
				msgs = ((InternalEObject)probeFrequency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__PROBE_FREQUENCY, null, msgs);
			if (newProbeFrequency != null)
				msgs = ((InternalEObject)newProbeFrequency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__PROBE_FREQUENCY, null, msgs);
			msgs = basicSetProbeFrequency(newProbeFrequency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__PROBE_FREQUENCY, newProbeFrequency, newProbeFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdmittancePackage.TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__PROBE_FREQUENCY:
				return basicSetProbeFrequency(null, msgs);
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
			case AdmittancePackage.TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__SWEEP_SPEED:
				return getSweepSpeed();
			case AdmittancePackage.TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__RECORD_MODE:
				return getRecordMode();
			case AdmittancePackage.TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__PROBE_FREQUENCY:
				return getProbeFrequency();
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
			case AdmittancePackage.TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__SWEEP_SPEED:
				setSweepSpeed((BigInteger)newValue);
				return;
			case AdmittancePackage.TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__RECORD_MODE:
				setRecordMode((RecordingModeType)newValue);
				return;
			case AdmittancePackage.TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__PROBE_FREQUENCY:
				setProbeFrequency((ProbeFrequencyType)newValue);
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
			case AdmittancePackage.TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__SWEEP_SPEED:
				setSweepSpeed(SWEEP_SPEED_EDEFAULT);
				return;
			case AdmittancePackage.TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__RECORD_MODE:
				unsetRecordMode();
				return;
			case AdmittancePackage.TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__PROBE_FREQUENCY:
				setProbeFrequency((ProbeFrequencyType)null);
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
			case AdmittancePackage.TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__SWEEP_SPEED:
				return SWEEP_SPEED_EDEFAULT == null ? sweepSpeed != null : !SWEEP_SPEED_EDEFAULT.equals(sweepSpeed);
			case AdmittancePackage.TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__RECORD_MODE:
				return isSetRecordMode();
			case AdmittancePackage.TYMPANOGRAM_MEASUREMENT_CONDITIONS_TYPE__PROBE_FREQUENCY:
				return probeFrequency != null;
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
		result.append(" (sweepSpeed: ");
		result.append(sweepSpeed);
		result.append(", recordMode: ");
		if (recordModeESet) result.append(recordMode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TympanogramMeasurementConditionsTypeImpl
