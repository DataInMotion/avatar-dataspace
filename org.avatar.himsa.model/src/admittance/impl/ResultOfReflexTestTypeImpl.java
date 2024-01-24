/*
 */
package admittance.impl;

import admittance.AdmittancePackage;
import admittance.DecayBasicResultType;
import admittance.ResultOfReflexTestType;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Of Reflex Test Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link admittance.impl.ResultOfReflexTestTypeImpl#isReflexDetected <em>Reflex Detected</em>}</li>
 *   <li>{@link admittance.impl.ResultOfReflexTestTypeImpl#getDecayBasicResult <em>Decay Basic Result</em>}</li>
 *   <li>{@link admittance.impl.ResultOfReflexTestTypeImpl#getDecayPercent <em>Decay Percent</em>}</li>
 *   <li>{@link admittance.impl.ResultOfReflexTestTypeImpl#getLatencyTime <em>Latency Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultOfReflexTestTypeImpl extends MinimalEObjectImpl.Container implements ResultOfReflexTestType {
	/**
	 * The default value of the '{@link #isReflexDetected() <em>Reflex Detected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReflexDetected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REFLEX_DETECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReflexDetected() <em>Reflex Detected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReflexDetected()
	 * @generated
	 * @ordered
	 */
	protected boolean reflexDetected = REFLEX_DETECTED_EDEFAULT;

	/**
	 * This is true if the Reflex Detected attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reflexDetectedESet;

	/**
	 * The default value of the '{@link #getDecayBasicResult() <em>Decay Basic Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecayBasicResult()
	 * @generated
	 * @ordered
	 */
	protected static final DecayBasicResultType DECAY_BASIC_RESULT_EDEFAULT = DecayBasicResultType.POSITIVE;

	/**
	 * The cached value of the '{@link #getDecayBasicResult() <em>Decay Basic Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecayBasicResult()
	 * @generated
	 * @ordered
	 */
	protected DecayBasicResultType decayBasicResult = DECAY_BASIC_RESULT_EDEFAULT;

	/**
	 * This is true if the Decay Basic Result attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean decayBasicResultESet;

	/**
	 * The default value of the '{@link #getDecayPercent() <em>Decay Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecayPercent()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DECAY_PERCENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecayPercent() <em>Decay Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecayPercent()
	 * @generated
	 * @ordered
	 */
	protected BigInteger decayPercent = DECAY_PERCENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatencyTime() <em>Latency Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatencyTime()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LATENCY_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLatencyTime() <em>Latency Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatencyTime()
	 * @generated
	 * @ordered
	 */
	protected BigInteger latencyTime = LATENCY_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultOfReflexTestTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdmittancePackage.Literals.RESULT_OF_REFLEX_TEST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReflexDetected() {
		return reflexDetected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReflexDetected(boolean newReflexDetected) {
		boolean oldReflexDetected = reflexDetected;
		reflexDetected = newReflexDetected;
		boolean oldReflexDetectedESet = reflexDetectedESet;
		reflexDetectedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.RESULT_OF_REFLEX_TEST_TYPE__REFLEX_DETECTED, oldReflexDetected, reflexDetected, !oldReflexDetectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetReflexDetected() {
		boolean oldReflexDetected = reflexDetected;
		boolean oldReflexDetectedESet = reflexDetectedESet;
		reflexDetected = REFLEX_DETECTED_EDEFAULT;
		reflexDetectedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdmittancePackage.RESULT_OF_REFLEX_TEST_TYPE__REFLEX_DETECTED, oldReflexDetected, REFLEX_DETECTED_EDEFAULT, oldReflexDetectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetReflexDetected() {
		return reflexDetectedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecayBasicResultType getDecayBasicResult() {
		return decayBasicResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecayBasicResult(DecayBasicResultType newDecayBasicResult) {
		DecayBasicResultType oldDecayBasicResult = decayBasicResult;
		decayBasicResult = newDecayBasicResult == null ? DECAY_BASIC_RESULT_EDEFAULT : newDecayBasicResult;
		boolean oldDecayBasicResultESet = decayBasicResultESet;
		decayBasicResultESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.RESULT_OF_REFLEX_TEST_TYPE__DECAY_BASIC_RESULT, oldDecayBasicResult, decayBasicResult, !oldDecayBasicResultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDecayBasicResult() {
		DecayBasicResultType oldDecayBasicResult = decayBasicResult;
		boolean oldDecayBasicResultESet = decayBasicResultESet;
		decayBasicResult = DECAY_BASIC_RESULT_EDEFAULT;
		decayBasicResultESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdmittancePackage.RESULT_OF_REFLEX_TEST_TYPE__DECAY_BASIC_RESULT, oldDecayBasicResult, DECAY_BASIC_RESULT_EDEFAULT, oldDecayBasicResultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDecayBasicResult() {
		return decayBasicResultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getDecayPercent() {
		return decayPercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecayPercent(BigInteger newDecayPercent) {
		BigInteger oldDecayPercent = decayPercent;
		decayPercent = newDecayPercent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.RESULT_OF_REFLEX_TEST_TYPE__DECAY_PERCENT, oldDecayPercent, decayPercent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getLatencyTime() {
		return latencyTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLatencyTime(BigInteger newLatencyTime) {
		BigInteger oldLatencyTime = latencyTime;
		latencyTime = newLatencyTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.RESULT_OF_REFLEX_TEST_TYPE__LATENCY_TIME, oldLatencyTime, latencyTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdmittancePackage.RESULT_OF_REFLEX_TEST_TYPE__REFLEX_DETECTED:
				return isReflexDetected();
			case AdmittancePackage.RESULT_OF_REFLEX_TEST_TYPE__DECAY_BASIC_RESULT:
				return getDecayBasicResult();
			case AdmittancePackage.RESULT_OF_REFLEX_TEST_TYPE__DECAY_PERCENT:
				return getDecayPercent();
			case AdmittancePackage.RESULT_OF_REFLEX_TEST_TYPE__LATENCY_TIME:
				return getLatencyTime();
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
			case AdmittancePackage.RESULT_OF_REFLEX_TEST_TYPE__REFLEX_DETECTED:
				setReflexDetected((Boolean)newValue);
				return;
			case AdmittancePackage.RESULT_OF_REFLEX_TEST_TYPE__DECAY_BASIC_RESULT:
				setDecayBasicResult((DecayBasicResultType)newValue);
				return;
			case AdmittancePackage.RESULT_OF_REFLEX_TEST_TYPE__DECAY_PERCENT:
				setDecayPercent((BigInteger)newValue);
				return;
			case AdmittancePackage.RESULT_OF_REFLEX_TEST_TYPE__LATENCY_TIME:
				setLatencyTime((BigInteger)newValue);
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
			case AdmittancePackage.RESULT_OF_REFLEX_TEST_TYPE__REFLEX_DETECTED:
				unsetReflexDetected();
				return;
			case AdmittancePackage.RESULT_OF_REFLEX_TEST_TYPE__DECAY_BASIC_RESULT:
				unsetDecayBasicResult();
				return;
			case AdmittancePackage.RESULT_OF_REFLEX_TEST_TYPE__DECAY_PERCENT:
				setDecayPercent(DECAY_PERCENT_EDEFAULT);
				return;
			case AdmittancePackage.RESULT_OF_REFLEX_TEST_TYPE__LATENCY_TIME:
				setLatencyTime(LATENCY_TIME_EDEFAULT);
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
			case AdmittancePackage.RESULT_OF_REFLEX_TEST_TYPE__REFLEX_DETECTED:
				return isSetReflexDetected();
			case AdmittancePackage.RESULT_OF_REFLEX_TEST_TYPE__DECAY_BASIC_RESULT:
				return isSetDecayBasicResult();
			case AdmittancePackage.RESULT_OF_REFLEX_TEST_TYPE__DECAY_PERCENT:
				return DECAY_PERCENT_EDEFAULT == null ? decayPercent != null : !DECAY_PERCENT_EDEFAULT.equals(decayPercent);
			case AdmittancePackage.RESULT_OF_REFLEX_TEST_TYPE__LATENCY_TIME:
				return LATENCY_TIME_EDEFAULT == null ? latencyTime != null : !LATENCY_TIME_EDEFAULT.equals(latencyTime);
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
		result.append(" (reflexDetected: ");
		if (reflexDetectedESet) result.append(reflexDetected); else result.append("<unset>");
		result.append(", decayBasicResult: ");
		if (decayBasicResultESet) result.append(decayBasicResult); else result.append("<unset>");
		result.append(", decayPercent: ");
		result.append(decayPercent);
		result.append(", latencyTime: ");
		result.append(latencyTime);
		result.append(')');
		return result.toString();
	}

} //ResultOfReflexTestTypeImpl
