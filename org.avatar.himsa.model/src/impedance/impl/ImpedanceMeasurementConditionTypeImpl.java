/*
 */
package impedance.impl;

import impedance.ComplianceType;
import impedance.ImpedanceMeasurementConditionType;
import impedance.ImpedancePackage;
import impedance.ReflexTestTypeType;
import impedance.SignalOutputType;
import impedance.SignalTypeType;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement Condition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link impedance.impl.ImpedanceMeasurementConditionTypeImpl#getSignalLevel <em>Signal Level</em>}</li>
 *   <li>{@link impedance.impl.ImpedanceMeasurementConditionTypeImpl#getSignalType <em>Signal Type</em>}</li>
 *   <li>{@link impedance.impl.ImpedanceMeasurementConditionTypeImpl#getSignalOutput <em>Signal Output</em>}</li>
 *   <li>{@link impedance.impl.ImpedanceMeasurementConditionTypeImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link impedance.impl.ImpedanceMeasurementConditionTypeImpl#getPressure <em>Pressure</em>}</li>
 *   <li>{@link impedance.impl.ImpedanceMeasurementConditionTypeImpl#getProbeFrequency <em>Probe Frequency</em>}</li>
 *   <li>{@link impedance.impl.ImpedanceMeasurementConditionTypeImpl#getTestType <em>Test Type</em>}</li>
 *   <li>{@link impedance.impl.ImpedanceMeasurementConditionTypeImpl#getCanalVolume <em>Canal Volume</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImpedanceMeasurementConditionTypeImpl extends MinimalEObjectImpl.Container implements ImpedanceMeasurementConditionType {
	/**
	 * The default value of the '{@link #getSignalLevel() <em>Signal Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SIGNAL_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignalLevel() <em>Signal Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalLevel()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal signalLevel = SIGNAL_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignalType() <em>Signal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalType()
	 * @generated
	 * @ordered
	 */
	protected static final SignalTypeType SIGNAL_TYPE_EDEFAULT = SignalTypeType.PURE_TONE;

	/**
	 * The cached value of the '{@link #getSignalType() <em>Signal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalType()
	 * @generated
	 * @ordered
	 */
	protected SignalTypeType signalType = SIGNAL_TYPE_EDEFAULT;

	/**
	 * This is true if the Signal Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean signalTypeESet;

	/**
	 * The default value of the '{@link #getSignalOutput() <em>Signal Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalOutput()
	 * @generated
	 * @ordered
	 */
	protected static final SignalOutputType SIGNAL_OUTPUT_EDEFAULT = SignalOutputType.IPSILATERAL;

	/**
	 * The cached value of the '{@link #getSignalOutput() <em>Signal Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalOutput()
	 * @generated
	 * @ordered
	 */
	protected SignalOutputType signalOutput = SIGNAL_OUTPUT_EDEFAULT;

	/**
	 * This is true if the Signal Output attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean signalOutputESet;

	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected BigInteger frequency = FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPressure() <em>Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressure()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PRESSURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPressure() <em>Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressure()
	 * @generated
	 * @ordered
	 */
	protected BigInteger pressure = PRESSURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProbeFrequency() <em>Probe Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbeFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PROBE_FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProbeFrequency() <em>Probe Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbeFrequency()
	 * @generated
	 * @ordered
	 */
	protected BigInteger probeFrequency = PROBE_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestType() <em>Test Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestType()
	 * @generated
	 * @ordered
	 */
	protected static final ReflexTestTypeType TEST_TYPE_EDEFAULT = ReflexTestTypeType.FIXED_LEVEL;

	/**
	 * The cached value of the '{@link #getTestType() <em>Test Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestType()
	 * @generated
	 * @ordered
	 */
	protected ReflexTestTypeType testType = TEST_TYPE_EDEFAULT;

	/**
	 * This is true if the Test Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean testTypeESet;

	/**
	 * The cached value of the '{@link #getCanalVolume() <em>Canal Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanalVolume()
	 * @generated
	 * @ordered
	 */
	protected ComplianceType canalVolume;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImpedanceMeasurementConditionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImpedancePackage.Literals.IMPEDANCE_MEASUREMENT_CONDITION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getSignalLevel() {
		return signalLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignalLevel(BigDecimal newSignalLevel) {
		BigDecimal oldSignalLevel = signalLevel;
		signalLevel = newSignalLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_LEVEL, oldSignalLevel, signalLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignalTypeType getSignalType() {
		return signalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignalType(SignalTypeType newSignalType) {
		SignalTypeType oldSignalType = signalType;
		signalType = newSignalType == null ? SIGNAL_TYPE_EDEFAULT : newSignalType;
		boolean oldSignalTypeESet = signalTypeESet;
		signalTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_TYPE, oldSignalType, signalType, !oldSignalTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSignalType() {
		SignalTypeType oldSignalType = signalType;
		boolean oldSignalTypeESet = signalTypeESet;
		signalType = SIGNAL_TYPE_EDEFAULT;
		signalTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_TYPE, oldSignalType, SIGNAL_TYPE_EDEFAULT, oldSignalTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSignalType() {
		return signalTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignalOutputType getSignalOutput() {
		return signalOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignalOutput(SignalOutputType newSignalOutput) {
		SignalOutputType oldSignalOutput = signalOutput;
		signalOutput = newSignalOutput == null ? SIGNAL_OUTPUT_EDEFAULT : newSignalOutput;
		boolean oldSignalOutputESet = signalOutputESet;
		signalOutputESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_OUTPUT, oldSignalOutput, signalOutput, !oldSignalOutputESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSignalOutput() {
		SignalOutputType oldSignalOutput = signalOutput;
		boolean oldSignalOutputESet = signalOutputESet;
		signalOutput = SIGNAL_OUTPUT_EDEFAULT;
		signalOutputESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_OUTPUT, oldSignalOutput, SIGNAL_OUTPUT_EDEFAULT, oldSignalOutputESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSignalOutput() {
		return signalOutputESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrequency(BigInteger newFrequency) {
		BigInteger oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getPressure() {
		return pressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPressure(BigInteger newPressure) {
		BigInteger oldPressure = pressure;
		pressure = newPressure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__PRESSURE, oldPressure, pressure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getProbeFrequency() {
		return probeFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProbeFrequency(BigInteger newProbeFrequency) {
		BigInteger oldProbeFrequency = probeFrequency;
		probeFrequency = newProbeFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__PROBE_FREQUENCY, oldProbeFrequency, probeFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReflexTestTypeType getTestType() {
		return testType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestType(ReflexTestTypeType newTestType) {
		ReflexTestTypeType oldTestType = testType;
		testType = newTestType == null ? TEST_TYPE_EDEFAULT : newTestType;
		boolean oldTestTypeESet = testTypeESet;
		testTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__TEST_TYPE, oldTestType, testType, !oldTestTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTestType() {
		ReflexTestTypeType oldTestType = testType;
		boolean oldTestTypeESet = testTypeESet;
		testType = TEST_TYPE_EDEFAULT;
		testTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__TEST_TYPE, oldTestType, TEST_TYPE_EDEFAULT, oldTestTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTestType() {
		return testTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplianceType getCanalVolume() {
		return canalVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCanalVolume(ComplianceType newCanalVolume, NotificationChain msgs) {
		ComplianceType oldCanalVolume = canalVolume;
		canalVolume = newCanalVolume;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__CANAL_VOLUME, oldCanalVolume, newCanalVolume);
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
	public void setCanalVolume(ComplianceType newCanalVolume) {
		if (newCanalVolume != canalVolume) {
			NotificationChain msgs = null;
			if (canalVolume != null)
				msgs = ((InternalEObject)canalVolume).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__CANAL_VOLUME, null, msgs);
			if (newCanalVolume != null)
				msgs = ((InternalEObject)newCanalVolume).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__CANAL_VOLUME, null, msgs);
			msgs = basicSetCanalVolume(newCanalVolume, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__CANAL_VOLUME, newCanalVolume, newCanalVolume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__CANAL_VOLUME:
				return basicSetCanalVolume(null, msgs);
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
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_LEVEL:
				return getSignalLevel();
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_TYPE:
				return getSignalType();
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_OUTPUT:
				return getSignalOutput();
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__FREQUENCY:
				return getFrequency();
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__PRESSURE:
				return getPressure();
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__PROBE_FREQUENCY:
				return getProbeFrequency();
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__TEST_TYPE:
				return getTestType();
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__CANAL_VOLUME:
				return getCanalVolume();
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
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_LEVEL:
				setSignalLevel((BigDecimal)newValue);
				return;
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_TYPE:
				setSignalType((SignalTypeType)newValue);
				return;
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_OUTPUT:
				setSignalOutput((SignalOutputType)newValue);
				return;
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__FREQUENCY:
				setFrequency((BigInteger)newValue);
				return;
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__PRESSURE:
				setPressure((BigInteger)newValue);
				return;
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__PROBE_FREQUENCY:
				setProbeFrequency((BigInteger)newValue);
				return;
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__TEST_TYPE:
				setTestType((ReflexTestTypeType)newValue);
				return;
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__CANAL_VOLUME:
				setCanalVolume((ComplianceType)newValue);
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
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_LEVEL:
				setSignalLevel(SIGNAL_LEVEL_EDEFAULT);
				return;
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_TYPE:
				unsetSignalType();
				return;
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_OUTPUT:
				unsetSignalOutput();
				return;
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
				return;
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__PRESSURE:
				setPressure(PRESSURE_EDEFAULT);
				return;
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__PROBE_FREQUENCY:
				setProbeFrequency(PROBE_FREQUENCY_EDEFAULT);
				return;
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__TEST_TYPE:
				unsetTestType();
				return;
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__CANAL_VOLUME:
				setCanalVolume((ComplianceType)null);
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
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_LEVEL:
				return SIGNAL_LEVEL_EDEFAULT == null ? signalLevel != null : !SIGNAL_LEVEL_EDEFAULT.equals(signalLevel);
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_TYPE:
				return isSetSignalType();
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__SIGNAL_OUTPUT:
				return isSetSignalOutput();
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__FREQUENCY:
				return FREQUENCY_EDEFAULT == null ? frequency != null : !FREQUENCY_EDEFAULT.equals(frequency);
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__PRESSURE:
				return PRESSURE_EDEFAULT == null ? pressure != null : !PRESSURE_EDEFAULT.equals(pressure);
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__PROBE_FREQUENCY:
				return PROBE_FREQUENCY_EDEFAULT == null ? probeFrequency != null : !PROBE_FREQUENCY_EDEFAULT.equals(probeFrequency);
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__TEST_TYPE:
				return isSetTestType();
			case ImpedancePackage.IMPEDANCE_MEASUREMENT_CONDITION_TYPE__CANAL_VOLUME:
				return canalVolume != null;
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
		result.append(" (signalLevel: ");
		result.append(signalLevel);
		result.append(", signalType: ");
		if (signalTypeESet) result.append(signalType); else result.append("<unset>");
		result.append(", signalOutput: ");
		if (signalOutputESet) result.append(signalOutput); else result.append("<unset>");
		result.append(", frequency: ");
		result.append(frequency);
		result.append(", pressure: ");
		result.append(pressure);
		result.append(", probeFrequency: ");
		result.append(probeFrequency);
		result.append(", testType: ");
		if (testTypeESet) result.append(testType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ImpedanceMeasurementConditionTypeImpl
