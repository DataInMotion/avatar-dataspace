/*
 */
package impedance.impl;

import impedance.ComplianceCurveType;
import impedance.ComplianceType;
import impedance.GradientType;
import impedance.ImpedancePackage;
import impedance.TympanogramMeasurementConditionsType;
import impedance.TympanogramResultType;
import impedance.TympanogramTestType;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tympanogram Test Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link impedance.impl.TympanogramTestTypeImpl#getComplianceCurve <em>Compliance Curve</em>}</li>
 *   <li>{@link impedance.impl.TympanogramTestTypeImpl#getMaximumCompliance <em>Maximum Compliance</em>}</li>
 *   <li>{@link impedance.impl.TympanogramTestTypeImpl#getCanalVolume <em>Canal Volume</em>}</li>
 *   <li>{@link impedance.impl.TympanogramTestTypeImpl#getGradient <em>Gradient</em>}</li>
 *   <li>{@link impedance.impl.TympanogramTestTypeImpl#getPressure <em>Pressure</em>}</li>
 *   <li>{@link impedance.impl.TympanogramTestTypeImpl#getResonanceFrequency <em>Resonance Frequency</em>}</li>
 *   <li>{@link impedance.impl.TympanogramTestTypeImpl#getResult <em>Result</em>}</li>
 *   <li>{@link impedance.impl.TympanogramTestTypeImpl#getMeasurementCondition <em>Measurement Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TympanogramTestTypeImpl extends MinimalEObjectImpl.Container implements TympanogramTestType {
	/**
	 * The cached value of the '{@link #getComplianceCurve() <em>Compliance Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplianceCurve()
	 * @generated
	 * @ordered
	 */
	protected ComplianceCurveType complianceCurve;

	/**
	 * The cached value of the '{@link #getMaximumCompliance() <em>Maximum Compliance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumCompliance()
	 * @generated
	 * @ordered
	 */
	protected ComplianceType maximumCompliance;

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
	 * The cached value of the '{@link #getGradient() <em>Gradient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradient()
	 * @generated
	 * @ordered
	 */
	protected GradientType gradient;

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
	 * The default value of the '{@link #getResonanceFrequency() <em>Resonance Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResonanceFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger RESONANCE_FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResonanceFrequency() <em>Resonance Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResonanceFrequency()
	 * @generated
	 * @ordered
	 */
	protected BigInteger resonanceFrequency = RESONANCE_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected static final TympanogramResultType RESULT_EDEFAULT = TympanogramResultType.A;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected TympanogramResultType result = RESULT_EDEFAULT;

	/**
	 * This is true if the Result attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resultESet;

	/**
	 * The cached value of the '{@link #getMeasurementCondition() <em>Measurement Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementCondition()
	 * @generated
	 * @ordered
	 */
	protected TympanogramMeasurementConditionsType measurementCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TympanogramTestTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImpedancePackage.Literals.TYMPANOGRAM_TEST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplianceCurveType getComplianceCurve() {
		return complianceCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplianceCurve(ComplianceCurveType newComplianceCurve, NotificationChain msgs) {
		ComplianceCurveType oldComplianceCurve = complianceCurve;
		complianceCurve = newComplianceCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImpedancePackage.TYMPANOGRAM_TEST_TYPE__COMPLIANCE_CURVE, oldComplianceCurve, newComplianceCurve);
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
	public void setComplianceCurve(ComplianceCurveType newComplianceCurve) {
		if (newComplianceCurve != complianceCurve) {
			NotificationChain msgs = null;
			if (complianceCurve != null)
				msgs = ((InternalEObject)complianceCurve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.TYMPANOGRAM_TEST_TYPE__COMPLIANCE_CURVE, null, msgs);
			if (newComplianceCurve != null)
				msgs = ((InternalEObject)newComplianceCurve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.TYMPANOGRAM_TEST_TYPE__COMPLIANCE_CURVE, null, msgs);
			msgs = basicSetComplianceCurve(newComplianceCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.TYMPANOGRAM_TEST_TYPE__COMPLIANCE_CURVE, newComplianceCurve, newComplianceCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplianceType getMaximumCompliance() {
		return maximumCompliance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaximumCompliance(ComplianceType newMaximumCompliance, NotificationChain msgs) {
		ComplianceType oldMaximumCompliance = maximumCompliance;
		maximumCompliance = newMaximumCompliance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImpedancePackage.TYMPANOGRAM_TEST_TYPE__MAXIMUM_COMPLIANCE, oldMaximumCompliance, newMaximumCompliance);
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
	public void setMaximumCompliance(ComplianceType newMaximumCompliance) {
		if (newMaximumCompliance != maximumCompliance) {
			NotificationChain msgs = null;
			if (maximumCompliance != null)
				msgs = ((InternalEObject)maximumCompliance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.TYMPANOGRAM_TEST_TYPE__MAXIMUM_COMPLIANCE, null, msgs);
			if (newMaximumCompliance != null)
				msgs = ((InternalEObject)newMaximumCompliance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.TYMPANOGRAM_TEST_TYPE__MAXIMUM_COMPLIANCE, null, msgs);
			msgs = basicSetMaximumCompliance(newMaximumCompliance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.TYMPANOGRAM_TEST_TYPE__MAXIMUM_COMPLIANCE, newMaximumCompliance, newMaximumCompliance));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImpedancePackage.TYMPANOGRAM_TEST_TYPE__CANAL_VOLUME, oldCanalVolume, newCanalVolume);
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
				msgs = ((InternalEObject)canalVolume).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.TYMPANOGRAM_TEST_TYPE__CANAL_VOLUME, null, msgs);
			if (newCanalVolume != null)
				msgs = ((InternalEObject)newCanalVolume).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.TYMPANOGRAM_TEST_TYPE__CANAL_VOLUME, null, msgs);
			msgs = basicSetCanalVolume(newCanalVolume, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.TYMPANOGRAM_TEST_TYPE__CANAL_VOLUME, newCanalVolume, newCanalVolume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GradientType getGradient() {
		return gradient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGradient(GradientType newGradient, NotificationChain msgs) {
		GradientType oldGradient = gradient;
		gradient = newGradient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImpedancePackage.TYMPANOGRAM_TEST_TYPE__GRADIENT, oldGradient, newGradient);
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
	public void setGradient(GradientType newGradient) {
		if (newGradient != gradient) {
			NotificationChain msgs = null;
			if (gradient != null)
				msgs = ((InternalEObject)gradient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.TYMPANOGRAM_TEST_TYPE__GRADIENT, null, msgs);
			if (newGradient != null)
				msgs = ((InternalEObject)newGradient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.TYMPANOGRAM_TEST_TYPE__GRADIENT, null, msgs);
			msgs = basicSetGradient(newGradient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.TYMPANOGRAM_TEST_TYPE__GRADIENT, newGradient, newGradient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.TYMPANOGRAM_TEST_TYPE__PRESSURE, oldPressure, pressure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getResonanceFrequency() {
		return resonanceFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResonanceFrequency(BigInteger newResonanceFrequency) {
		BigInteger oldResonanceFrequency = resonanceFrequency;
		resonanceFrequency = newResonanceFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.TYMPANOGRAM_TEST_TYPE__RESONANCE_FREQUENCY, oldResonanceFrequency, resonanceFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TympanogramResultType getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResult(TympanogramResultType newResult) {
		TympanogramResultType oldResult = result;
		result = newResult == null ? RESULT_EDEFAULT : newResult;
		boolean oldResultESet = resultESet;
		resultESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.TYMPANOGRAM_TEST_TYPE__RESULT, oldResult, result, !oldResultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetResult() {
		TympanogramResultType oldResult = result;
		boolean oldResultESet = resultESet;
		result = RESULT_EDEFAULT;
		resultESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ImpedancePackage.TYMPANOGRAM_TEST_TYPE__RESULT, oldResult, RESULT_EDEFAULT, oldResultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetResult() {
		return resultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TympanogramMeasurementConditionsType getMeasurementCondition() {
		return measurementCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementCondition(TympanogramMeasurementConditionsType newMeasurementCondition, NotificationChain msgs) {
		TympanogramMeasurementConditionsType oldMeasurementCondition = measurementCondition;
		measurementCondition = newMeasurementCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImpedancePackage.TYMPANOGRAM_TEST_TYPE__MEASUREMENT_CONDITION, oldMeasurementCondition, newMeasurementCondition);
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
	public void setMeasurementCondition(TympanogramMeasurementConditionsType newMeasurementCondition) {
		if (newMeasurementCondition != measurementCondition) {
			NotificationChain msgs = null;
			if (measurementCondition != null)
				msgs = ((InternalEObject)measurementCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.TYMPANOGRAM_TEST_TYPE__MEASUREMENT_CONDITION, null, msgs);
			if (newMeasurementCondition != null)
				msgs = ((InternalEObject)newMeasurementCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.TYMPANOGRAM_TEST_TYPE__MEASUREMENT_CONDITION, null, msgs);
			msgs = basicSetMeasurementCondition(newMeasurementCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.TYMPANOGRAM_TEST_TYPE__MEASUREMENT_CONDITION, newMeasurementCondition, newMeasurementCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__COMPLIANCE_CURVE:
				return basicSetComplianceCurve(null, msgs);
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__MAXIMUM_COMPLIANCE:
				return basicSetMaximumCompliance(null, msgs);
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__CANAL_VOLUME:
				return basicSetCanalVolume(null, msgs);
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__GRADIENT:
				return basicSetGradient(null, msgs);
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__MEASUREMENT_CONDITION:
				return basicSetMeasurementCondition(null, msgs);
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
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__COMPLIANCE_CURVE:
				return getComplianceCurve();
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__MAXIMUM_COMPLIANCE:
				return getMaximumCompliance();
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__CANAL_VOLUME:
				return getCanalVolume();
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__GRADIENT:
				return getGradient();
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__PRESSURE:
				return getPressure();
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__RESONANCE_FREQUENCY:
				return getResonanceFrequency();
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__RESULT:
				return getResult();
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__MEASUREMENT_CONDITION:
				return getMeasurementCondition();
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
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__COMPLIANCE_CURVE:
				setComplianceCurve((ComplianceCurveType)newValue);
				return;
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__MAXIMUM_COMPLIANCE:
				setMaximumCompliance((ComplianceType)newValue);
				return;
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__CANAL_VOLUME:
				setCanalVolume((ComplianceType)newValue);
				return;
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__GRADIENT:
				setGradient((GradientType)newValue);
				return;
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__PRESSURE:
				setPressure((BigInteger)newValue);
				return;
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__RESONANCE_FREQUENCY:
				setResonanceFrequency((BigInteger)newValue);
				return;
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__RESULT:
				setResult((TympanogramResultType)newValue);
				return;
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__MEASUREMENT_CONDITION:
				setMeasurementCondition((TympanogramMeasurementConditionsType)newValue);
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
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__COMPLIANCE_CURVE:
				setComplianceCurve((ComplianceCurveType)null);
				return;
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__MAXIMUM_COMPLIANCE:
				setMaximumCompliance((ComplianceType)null);
				return;
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__CANAL_VOLUME:
				setCanalVolume((ComplianceType)null);
				return;
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__GRADIENT:
				setGradient((GradientType)null);
				return;
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__PRESSURE:
				setPressure(PRESSURE_EDEFAULT);
				return;
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__RESONANCE_FREQUENCY:
				setResonanceFrequency(RESONANCE_FREQUENCY_EDEFAULT);
				return;
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__RESULT:
				unsetResult();
				return;
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__MEASUREMENT_CONDITION:
				setMeasurementCondition((TympanogramMeasurementConditionsType)null);
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
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__COMPLIANCE_CURVE:
				return complianceCurve != null;
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__MAXIMUM_COMPLIANCE:
				return maximumCompliance != null;
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__CANAL_VOLUME:
				return canalVolume != null;
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__GRADIENT:
				return gradient != null;
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__PRESSURE:
				return PRESSURE_EDEFAULT == null ? pressure != null : !PRESSURE_EDEFAULT.equals(pressure);
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__RESONANCE_FREQUENCY:
				return RESONANCE_FREQUENCY_EDEFAULT == null ? resonanceFrequency != null : !RESONANCE_FREQUENCY_EDEFAULT.equals(resonanceFrequency);
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__RESULT:
				return isSetResult();
			case ImpedancePackage.TYMPANOGRAM_TEST_TYPE__MEASUREMENT_CONDITION:
				return measurementCondition != null;
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
		result.append(" (pressure: ");
		result.append(pressure);
		result.append(", resonanceFrequency: ");
		result.append(resonanceFrequency);
		result.append(", result: ");
		if (resultESet) result.append(result); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TympanogramTestTypeImpl
