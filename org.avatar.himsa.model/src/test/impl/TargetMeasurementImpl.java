/*
 */
package test.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import test.MeasurementConditions;
import test.TargetCurve;
import test.TargetMeasurement;
import test.TestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link test.impl.TargetMeasurementImpl#getMeasurementConditions <em>Measurement Conditions</em>}</li>
 *   <li>{@link test.impl.TargetMeasurementImpl#getLevelStep <em>Level Step</em>}</li>
 *   <li>{@link test.impl.TargetMeasurementImpl#getAttackCurve <em>Attack Curve</em>}</li>
 *   <li>{@link test.impl.TargetMeasurementImpl#getReleaseCurve <em>Release Curve</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetMeasurementImpl extends MinimalEObjectImpl.Container implements TargetMeasurement {
	/**
	 * The cached value of the '{@link #getMeasurementConditions() <em>Measurement Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementConditions()
	 * @generated
	 * @ordered
	 */
	protected MeasurementConditions measurementConditions;

	/**
	 * The default value of the '{@link #getLevelStep() <em>Level Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelStep()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal LEVEL_STEP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevelStep() <em>Level Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelStep()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal levelStep = LEVEL_STEP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttackCurve() <em>Attack Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackCurve()
	 * @generated
	 * @ordered
	 */
	protected TargetCurve attackCurve;

	/**
	 * The cached value of the '{@link #getReleaseCurve() <em>Release Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseCurve()
	 * @generated
	 * @ordered
	 */
	protected TargetCurve releaseCurve;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetMeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.TARGET_MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementConditions getMeasurementConditions() {
		return measurementConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementConditions(MeasurementConditions newMeasurementConditions, NotificationChain msgs) {
		MeasurementConditions oldMeasurementConditions = measurementConditions;
		measurementConditions = newMeasurementConditions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestPackage.TARGET_MEASUREMENT__MEASUREMENT_CONDITIONS, oldMeasurementConditions, newMeasurementConditions);
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
	public void setMeasurementConditions(MeasurementConditions newMeasurementConditions) {
		if (newMeasurementConditions != measurementConditions) {
			NotificationChain msgs = null;
			if (measurementConditions != null)
				msgs = ((InternalEObject)measurementConditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TestPackage.TARGET_MEASUREMENT__MEASUREMENT_CONDITIONS, null, msgs);
			if (newMeasurementConditions != null)
				msgs = ((InternalEObject)newMeasurementConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TestPackage.TARGET_MEASUREMENT__MEASUREMENT_CONDITIONS, null, msgs);
			msgs = basicSetMeasurementConditions(newMeasurementConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TARGET_MEASUREMENT__MEASUREMENT_CONDITIONS, newMeasurementConditions, newMeasurementConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getLevelStep() {
		return levelStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevelStep(BigDecimal newLevelStep) {
		BigDecimal oldLevelStep = levelStep;
		levelStep = newLevelStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TARGET_MEASUREMENT__LEVEL_STEP, oldLevelStep, levelStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetCurve getAttackCurve() {
		return attackCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttackCurve(TargetCurve newAttackCurve, NotificationChain msgs) {
		TargetCurve oldAttackCurve = attackCurve;
		attackCurve = newAttackCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestPackage.TARGET_MEASUREMENT__ATTACK_CURVE, oldAttackCurve, newAttackCurve);
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
	public void setAttackCurve(TargetCurve newAttackCurve) {
		if (newAttackCurve != attackCurve) {
			NotificationChain msgs = null;
			if (attackCurve != null)
				msgs = ((InternalEObject)attackCurve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TestPackage.TARGET_MEASUREMENT__ATTACK_CURVE, null, msgs);
			if (newAttackCurve != null)
				msgs = ((InternalEObject)newAttackCurve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TestPackage.TARGET_MEASUREMENT__ATTACK_CURVE, null, msgs);
			msgs = basicSetAttackCurve(newAttackCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TARGET_MEASUREMENT__ATTACK_CURVE, newAttackCurve, newAttackCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetCurve getReleaseCurve() {
		return releaseCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReleaseCurve(TargetCurve newReleaseCurve, NotificationChain msgs) {
		TargetCurve oldReleaseCurve = releaseCurve;
		releaseCurve = newReleaseCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestPackage.TARGET_MEASUREMENT__RELEASE_CURVE, oldReleaseCurve, newReleaseCurve);
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
	public void setReleaseCurve(TargetCurve newReleaseCurve) {
		if (newReleaseCurve != releaseCurve) {
			NotificationChain msgs = null;
			if (releaseCurve != null)
				msgs = ((InternalEObject)releaseCurve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TestPackage.TARGET_MEASUREMENT__RELEASE_CURVE, null, msgs);
			if (newReleaseCurve != null)
				msgs = ((InternalEObject)newReleaseCurve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TestPackage.TARGET_MEASUREMENT__RELEASE_CURVE, null, msgs);
			msgs = basicSetReleaseCurve(newReleaseCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TARGET_MEASUREMENT__RELEASE_CURVE, newReleaseCurve, newReleaseCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestPackage.TARGET_MEASUREMENT__MEASUREMENT_CONDITIONS:
				return basicSetMeasurementConditions(null, msgs);
			case TestPackage.TARGET_MEASUREMENT__ATTACK_CURVE:
				return basicSetAttackCurve(null, msgs);
			case TestPackage.TARGET_MEASUREMENT__RELEASE_CURVE:
				return basicSetReleaseCurve(null, msgs);
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
			case TestPackage.TARGET_MEASUREMENT__MEASUREMENT_CONDITIONS:
				return getMeasurementConditions();
			case TestPackage.TARGET_MEASUREMENT__LEVEL_STEP:
				return getLevelStep();
			case TestPackage.TARGET_MEASUREMENT__ATTACK_CURVE:
				return getAttackCurve();
			case TestPackage.TARGET_MEASUREMENT__RELEASE_CURVE:
				return getReleaseCurve();
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
			case TestPackage.TARGET_MEASUREMENT__MEASUREMENT_CONDITIONS:
				setMeasurementConditions((MeasurementConditions)newValue);
				return;
			case TestPackage.TARGET_MEASUREMENT__LEVEL_STEP:
				setLevelStep((BigDecimal)newValue);
				return;
			case TestPackage.TARGET_MEASUREMENT__ATTACK_CURVE:
				setAttackCurve((TargetCurve)newValue);
				return;
			case TestPackage.TARGET_MEASUREMENT__RELEASE_CURVE:
				setReleaseCurve((TargetCurve)newValue);
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
			case TestPackage.TARGET_MEASUREMENT__MEASUREMENT_CONDITIONS:
				setMeasurementConditions((MeasurementConditions)null);
				return;
			case TestPackage.TARGET_MEASUREMENT__LEVEL_STEP:
				setLevelStep(LEVEL_STEP_EDEFAULT);
				return;
			case TestPackage.TARGET_MEASUREMENT__ATTACK_CURVE:
				setAttackCurve((TargetCurve)null);
				return;
			case TestPackage.TARGET_MEASUREMENT__RELEASE_CURVE:
				setReleaseCurve((TargetCurve)null);
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
			case TestPackage.TARGET_MEASUREMENT__MEASUREMENT_CONDITIONS:
				return measurementConditions != null;
			case TestPackage.TARGET_MEASUREMENT__LEVEL_STEP:
				return LEVEL_STEP_EDEFAULT == null ? levelStep != null : !LEVEL_STEP_EDEFAULT.equals(levelStep);
			case TestPackage.TARGET_MEASUREMENT__ATTACK_CURVE:
				return attackCurve != null;
			case TestPackage.TARGET_MEASUREMENT__RELEASE_CURVE:
				return releaseCurve != null;
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
		result.append(" (levelStep: ");
		result.append(levelStep);
		result.append(')');
		return result.toString();
	}

} //TargetMeasurementImpl
