/*
 */
package com.himsa.measurement.admittance._501.impl;

import com.himsa.measurement.admittance._501.AdmittanceCurveType;
import com.himsa.measurement.admittance._501.AdmittanceType;
import com.himsa.measurement.admittance._501.GradientType;
import com.himsa.measurement.admittance._501.StaticAdmittanceType;
import com.himsa.measurement.admittance._501.TympanogramMeasurementConditionsType;
import com.himsa.measurement.admittance._501.TympanogramResultType;
import com.himsa.measurement.admittance._501.TympanogramTestType;
import com.himsa.measurement.admittance._501._501Package;

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
 *   <li>{@link com.himsa.measurement.admittance._501.impl.TympanogramTestTypeImpl#getAdmittanceCurve <em>Admittance Curve</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.TympanogramTestTypeImpl#getMaximumAdmittance <em>Maximum Admittance</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.TympanogramTestTypeImpl#getCanalVolume <em>Canal Volume</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.TympanogramTestTypeImpl#getGradient <em>Gradient</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.TympanogramTestTypeImpl#getPressure <em>Pressure</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.TympanogramTestTypeImpl#getResonanceFrequency <em>Resonance Frequency</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.TympanogramTestTypeImpl#getResult <em>Result</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.TympanogramTestTypeImpl#getMeasurementCondition <em>Measurement Condition</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.impl.TympanogramTestTypeImpl#getStaticAdmittance <em>Static Admittance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TympanogramTestTypeImpl extends MinimalEObjectImpl.Container implements TympanogramTestType {
	/**
	 * The cached value of the '{@link #getAdmittanceCurve() <em>Admittance Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmittanceCurve()
	 * @generated
	 * @ordered
	 */
	protected AdmittanceCurveType admittanceCurve;

	/**
	 * The cached value of the '{@link #getMaximumAdmittance() <em>Maximum Admittance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumAdmittance()
	 * @generated
	 * @ordered
	 */
	protected AdmittanceType maximumAdmittance;

	/**
	 * The cached value of the '{@link #getCanalVolume() <em>Canal Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanalVolume()
	 * @generated
	 * @ordered
	 */
	protected AdmittanceType canalVolume;

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
	 * The cached value of the '{@link #getStaticAdmittance() <em>Static Admittance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticAdmittance()
	 * @generated
	 * @ordered
	 */
	protected StaticAdmittanceType staticAdmittance;

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
		return _501Package.Literals.TYMPANOGRAM_TEST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceCurveType getAdmittanceCurve() {
		return admittanceCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdmittanceCurve(AdmittanceCurveType newAdmittanceCurve, NotificationChain msgs) {
		AdmittanceCurveType oldAdmittanceCurve = admittanceCurve;
		admittanceCurve = newAdmittanceCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _501Package.TYMPANOGRAM_TEST_TYPE__ADMITTANCE_CURVE, oldAdmittanceCurve, newAdmittanceCurve);
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
	public void setAdmittanceCurve(AdmittanceCurveType newAdmittanceCurve) {
		if (newAdmittanceCurve != admittanceCurve) {
			NotificationChain msgs = null;
			if (admittanceCurve != null)
				msgs = ((InternalEObject)admittanceCurve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _501Package.TYMPANOGRAM_TEST_TYPE__ADMITTANCE_CURVE, null, msgs);
			if (newAdmittanceCurve != null)
				msgs = ((InternalEObject)newAdmittanceCurve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _501Package.TYMPANOGRAM_TEST_TYPE__ADMITTANCE_CURVE, null, msgs);
			msgs = basicSetAdmittanceCurve(newAdmittanceCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _501Package.TYMPANOGRAM_TEST_TYPE__ADMITTANCE_CURVE, newAdmittanceCurve, newAdmittanceCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceType getMaximumAdmittance() {
		return maximumAdmittance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaximumAdmittance(AdmittanceType newMaximumAdmittance, NotificationChain msgs) {
		AdmittanceType oldMaximumAdmittance = maximumAdmittance;
		maximumAdmittance = newMaximumAdmittance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _501Package.TYMPANOGRAM_TEST_TYPE__MAXIMUM_ADMITTANCE, oldMaximumAdmittance, newMaximumAdmittance);
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
	public void setMaximumAdmittance(AdmittanceType newMaximumAdmittance) {
		if (newMaximumAdmittance != maximumAdmittance) {
			NotificationChain msgs = null;
			if (maximumAdmittance != null)
				msgs = ((InternalEObject)maximumAdmittance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _501Package.TYMPANOGRAM_TEST_TYPE__MAXIMUM_ADMITTANCE, null, msgs);
			if (newMaximumAdmittance != null)
				msgs = ((InternalEObject)newMaximumAdmittance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _501Package.TYMPANOGRAM_TEST_TYPE__MAXIMUM_ADMITTANCE, null, msgs);
			msgs = basicSetMaximumAdmittance(newMaximumAdmittance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _501Package.TYMPANOGRAM_TEST_TYPE__MAXIMUM_ADMITTANCE, newMaximumAdmittance, newMaximumAdmittance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceType getCanalVolume() {
		return canalVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCanalVolume(AdmittanceType newCanalVolume, NotificationChain msgs) {
		AdmittanceType oldCanalVolume = canalVolume;
		canalVolume = newCanalVolume;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _501Package.TYMPANOGRAM_TEST_TYPE__CANAL_VOLUME, oldCanalVolume, newCanalVolume);
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
	public void setCanalVolume(AdmittanceType newCanalVolume) {
		if (newCanalVolume != canalVolume) {
			NotificationChain msgs = null;
			if (canalVolume != null)
				msgs = ((InternalEObject)canalVolume).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _501Package.TYMPANOGRAM_TEST_TYPE__CANAL_VOLUME, null, msgs);
			if (newCanalVolume != null)
				msgs = ((InternalEObject)newCanalVolume).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _501Package.TYMPANOGRAM_TEST_TYPE__CANAL_VOLUME, null, msgs);
			msgs = basicSetCanalVolume(newCanalVolume, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _501Package.TYMPANOGRAM_TEST_TYPE__CANAL_VOLUME, newCanalVolume, newCanalVolume));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _501Package.TYMPANOGRAM_TEST_TYPE__GRADIENT, oldGradient, newGradient);
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
				msgs = ((InternalEObject)gradient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _501Package.TYMPANOGRAM_TEST_TYPE__GRADIENT, null, msgs);
			if (newGradient != null)
				msgs = ((InternalEObject)newGradient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _501Package.TYMPANOGRAM_TEST_TYPE__GRADIENT, null, msgs);
			msgs = basicSetGradient(newGradient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _501Package.TYMPANOGRAM_TEST_TYPE__GRADIENT, newGradient, newGradient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _501Package.TYMPANOGRAM_TEST_TYPE__PRESSURE, oldPressure, pressure));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _501Package.TYMPANOGRAM_TEST_TYPE__RESONANCE_FREQUENCY, oldResonanceFrequency, resonanceFrequency));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _501Package.TYMPANOGRAM_TEST_TYPE__RESULT, oldResult, result, !oldResultESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, _501Package.TYMPANOGRAM_TEST_TYPE__RESULT, oldResult, RESULT_EDEFAULT, oldResultESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _501Package.TYMPANOGRAM_TEST_TYPE__MEASUREMENT_CONDITION, oldMeasurementCondition, newMeasurementCondition);
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
				msgs = ((InternalEObject)measurementCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _501Package.TYMPANOGRAM_TEST_TYPE__MEASUREMENT_CONDITION, null, msgs);
			if (newMeasurementCondition != null)
				msgs = ((InternalEObject)newMeasurementCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _501Package.TYMPANOGRAM_TEST_TYPE__MEASUREMENT_CONDITION, null, msgs);
			msgs = basicSetMeasurementCondition(newMeasurementCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _501Package.TYMPANOGRAM_TEST_TYPE__MEASUREMENT_CONDITION, newMeasurementCondition, newMeasurementCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StaticAdmittanceType getStaticAdmittance() {
		return staticAdmittance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaticAdmittance(StaticAdmittanceType newStaticAdmittance, NotificationChain msgs) {
		StaticAdmittanceType oldStaticAdmittance = staticAdmittance;
		staticAdmittance = newStaticAdmittance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _501Package.TYMPANOGRAM_TEST_TYPE__STATIC_ADMITTANCE, oldStaticAdmittance, newStaticAdmittance);
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
	public void setStaticAdmittance(StaticAdmittanceType newStaticAdmittance) {
		if (newStaticAdmittance != staticAdmittance) {
			NotificationChain msgs = null;
			if (staticAdmittance != null)
				msgs = ((InternalEObject)staticAdmittance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _501Package.TYMPANOGRAM_TEST_TYPE__STATIC_ADMITTANCE, null, msgs);
			if (newStaticAdmittance != null)
				msgs = ((InternalEObject)newStaticAdmittance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _501Package.TYMPANOGRAM_TEST_TYPE__STATIC_ADMITTANCE, null, msgs);
			msgs = basicSetStaticAdmittance(newStaticAdmittance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _501Package.TYMPANOGRAM_TEST_TYPE__STATIC_ADMITTANCE, newStaticAdmittance, newStaticAdmittance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _501Package.TYMPANOGRAM_TEST_TYPE__ADMITTANCE_CURVE:
				return basicSetAdmittanceCurve(null, msgs);
			case _501Package.TYMPANOGRAM_TEST_TYPE__MAXIMUM_ADMITTANCE:
				return basicSetMaximumAdmittance(null, msgs);
			case _501Package.TYMPANOGRAM_TEST_TYPE__CANAL_VOLUME:
				return basicSetCanalVolume(null, msgs);
			case _501Package.TYMPANOGRAM_TEST_TYPE__GRADIENT:
				return basicSetGradient(null, msgs);
			case _501Package.TYMPANOGRAM_TEST_TYPE__MEASUREMENT_CONDITION:
				return basicSetMeasurementCondition(null, msgs);
			case _501Package.TYMPANOGRAM_TEST_TYPE__STATIC_ADMITTANCE:
				return basicSetStaticAdmittance(null, msgs);
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
			case _501Package.TYMPANOGRAM_TEST_TYPE__ADMITTANCE_CURVE:
				return getAdmittanceCurve();
			case _501Package.TYMPANOGRAM_TEST_TYPE__MAXIMUM_ADMITTANCE:
				return getMaximumAdmittance();
			case _501Package.TYMPANOGRAM_TEST_TYPE__CANAL_VOLUME:
				return getCanalVolume();
			case _501Package.TYMPANOGRAM_TEST_TYPE__GRADIENT:
				return getGradient();
			case _501Package.TYMPANOGRAM_TEST_TYPE__PRESSURE:
				return getPressure();
			case _501Package.TYMPANOGRAM_TEST_TYPE__RESONANCE_FREQUENCY:
				return getResonanceFrequency();
			case _501Package.TYMPANOGRAM_TEST_TYPE__RESULT:
				return getResult();
			case _501Package.TYMPANOGRAM_TEST_TYPE__MEASUREMENT_CONDITION:
				return getMeasurementCondition();
			case _501Package.TYMPANOGRAM_TEST_TYPE__STATIC_ADMITTANCE:
				return getStaticAdmittance();
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
			case _501Package.TYMPANOGRAM_TEST_TYPE__ADMITTANCE_CURVE:
				setAdmittanceCurve((AdmittanceCurveType)newValue);
				return;
			case _501Package.TYMPANOGRAM_TEST_TYPE__MAXIMUM_ADMITTANCE:
				setMaximumAdmittance((AdmittanceType)newValue);
				return;
			case _501Package.TYMPANOGRAM_TEST_TYPE__CANAL_VOLUME:
				setCanalVolume((AdmittanceType)newValue);
				return;
			case _501Package.TYMPANOGRAM_TEST_TYPE__GRADIENT:
				setGradient((GradientType)newValue);
				return;
			case _501Package.TYMPANOGRAM_TEST_TYPE__PRESSURE:
				setPressure((BigInteger)newValue);
				return;
			case _501Package.TYMPANOGRAM_TEST_TYPE__RESONANCE_FREQUENCY:
				setResonanceFrequency((BigInteger)newValue);
				return;
			case _501Package.TYMPANOGRAM_TEST_TYPE__RESULT:
				setResult((TympanogramResultType)newValue);
				return;
			case _501Package.TYMPANOGRAM_TEST_TYPE__MEASUREMENT_CONDITION:
				setMeasurementCondition((TympanogramMeasurementConditionsType)newValue);
				return;
			case _501Package.TYMPANOGRAM_TEST_TYPE__STATIC_ADMITTANCE:
				setStaticAdmittance((StaticAdmittanceType)newValue);
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
			case _501Package.TYMPANOGRAM_TEST_TYPE__ADMITTANCE_CURVE:
				setAdmittanceCurve((AdmittanceCurveType)null);
				return;
			case _501Package.TYMPANOGRAM_TEST_TYPE__MAXIMUM_ADMITTANCE:
				setMaximumAdmittance((AdmittanceType)null);
				return;
			case _501Package.TYMPANOGRAM_TEST_TYPE__CANAL_VOLUME:
				setCanalVolume((AdmittanceType)null);
				return;
			case _501Package.TYMPANOGRAM_TEST_TYPE__GRADIENT:
				setGradient((GradientType)null);
				return;
			case _501Package.TYMPANOGRAM_TEST_TYPE__PRESSURE:
				setPressure(PRESSURE_EDEFAULT);
				return;
			case _501Package.TYMPANOGRAM_TEST_TYPE__RESONANCE_FREQUENCY:
				setResonanceFrequency(RESONANCE_FREQUENCY_EDEFAULT);
				return;
			case _501Package.TYMPANOGRAM_TEST_TYPE__RESULT:
				unsetResult();
				return;
			case _501Package.TYMPANOGRAM_TEST_TYPE__MEASUREMENT_CONDITION:
				setMeasurementCondition((TympanogramMeasurementConditionsType)null);
				return;
			case _501Package.TYMPANOGRAM_TEST_TYPE__STATIC_ADMITTANCE:
				setStaticAdmittance((StaticAdmittanceType)null);
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
			case _501Package.TYMPANOGRAM_TEST_TYPE__ADMITTANCE_CURVE:
				return admittanceCurve != null;
			case _501Package.TYMPANOGRAM_TEST_TYPE__MAXIMUM_ADMITTANCE:
				return maximumAdmittance != null;
			case _501Package.TYMPANOGRAM_TEST_TYPE__CANAL_VOLUME:
				return canalVolume != null;
			case _501Package.TYMPANOGRAM_TEST_TYPE__GRADIENT:
				return gradient != null;
			case _501Package.TYMPANOGRAM_TEST_TYPE__PRESSURE:
				return PRESSURE_EDEFAULT == null ? pressure != null : !PRESSURE_EDEFAULT.equals(pressure);
			case _501Package.TYMPANOGRAM_TEST_TYPE__RESONANCE_FREQUENCY:
				return RESONANCE_FREQUENCY_EDEFAULT == null ? resonanceFrequency != null : !RESONANCE_FREQUENCY_EDEFAULT.equals(resonanceFrequency);
			case _501Package.TYMPANOGRAM_TEST_TYPE__RESULT:
				return isSetResult();
			case _501Package.TYMPANOGRAM_TEST_TYPE__MEASUREMENT_CONDITION:
				return measurementCondition != null;
			case _501Package.TYMPANOGRAM_TEST_TYPE__STATIC_ADMITTANCE:
				return staticAdmittance != null;
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
