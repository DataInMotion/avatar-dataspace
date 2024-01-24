/*
 */
package admittance.impl;

import admittance.AdmittanceMeasurementConditionType;
import admittance.AdmittancePackage;
import admittance.ReflexCurveType;
import admittance.ReflexTestType;
import admittance.ResultOfReflexTestType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reflex Test Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link admittance.impl.ReflexTestTypeImpl#getReflexCurve <em>Reflex Curve</em>}</li>
 *   <li>{@link admittance.impl.ReflexTestTypeImpl#getResultOfReflexTest <em>Result Of Reflex Test</em>}</li>
 *   <li>{@link admittance.impl.ReflexTestTypeImpl#getAdmittanceMeasurementCondition <em>Admittance Measurement Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReflexTestTypeImpl extends MinimalEObjectImpl.Container implements ReflexTestType {
	/**
	 * The cached value of the '{@link #getReflexCurve() <em>Reflex Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReflexCurve()
	 * @generated
	 * @ordered
	 */
	protected ReflexCurveType reflexCurve;

	/**
	 * The cached value of the '{@link #getResultOfReflexTest() <em>Result Of Reflex Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultOfReflexTest()
	 * @generated
	 * @ordered
	 */
	protected ResultOfReflexTestType resultOfReflexTest;

	/**
	 * The cached value of the '{@link #getAdmittanceMeasurementCondition() <em>Admittance Measurement Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmittanceMeasurementCondition()
	 * @generated
	 * @ordered
	 */
	protected AdmittanceMeasurementConditionType admittanceMeasurementCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReflexTestTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdmittancePackage.Literals.REFLEX_TEST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReflexCurveType getReflexCurve() {
		return reflexCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReflexCurve(ReflexCurveType newReflexCurve, NotificationChain msgs) {
		ReflexCurveType oldReflexCurve = reflexCurve;
		reflexCurve = newReflexCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdmittancePackage.REFLEX_TEST_TYPE__REFLEX_CURVE, oldReflexCurve, newReflexCurve);
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
	public void setReflexCurve(ReflexCurveType newReflexCurve) {
		if (newReflexCurve != reflexCurve) {
			NotificationChain msgs = null;
			if (reflexCurve != null)
				msgs = ((InternalEObject)reflexCurve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.REFLEX_TEST_TYPE__REFLEX_CURVE, null, msgs);
			if (newReflexCurve != null)
				msgs = ((InternalEObject)newReflexCurve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.REFLEX_TEST_TYPE__REFLEX_CURVE, null, msgs);
			msgs = basicSetReflexCurve(newReflexCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.REFLEX_TEST_TYPE__REFLEX_CURVE, newReflexCurve, newReflexCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultOfReflexTestType getResultOfReflexTest() {
		return resultOfReflexTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultOfReflexTest(ResultOfReflexTestType newResultOfReflexTest, NotificationChain msgs) {
		ResultOfReflexTestType oldResultOfReflexTest = resultOfReflexTest;
		resultOfReflexTest = newResultOfReflexTest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdmittancePackage.REFLEX_TEST_TYPE__RESULT_OF_REFLEX_TEST, oldResultOfReflexTest, newResultOfReflexTest);
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
	public void setResultOfReflexTest(ResultOfReflexTestType newResultOfReflexTest) {
		if (newResultOfReflexTest != resultOfReflexTest) {
			NotificationChain msgs = null;
			if (resultOfReflexTest != null)
				msgs = ((InternalEObject)resultOfReflexTest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.REFLEX_TEST_TYPE__RESULT_OF_REFLEX_TEST, null, msgs);
			if (newResultOfReflexTest != null)
				msgs = ((InternalEObject)newResultOfReflexTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.REFLEX_TEST_TYPE__RESULT_OF_REFLEX_TEST, null, msgs);
			msgs = basicSetResultOfReflexTest(newResultOfReflexTest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.REFLEX_TEST_TYPE__RESULT_OF_REFLEX_TEST, newResultOfReflexTest, newResultOfReflexTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmittanceMeasurementConditionType getAdmittanceMeasurementCondition() {
		return admittanceMeasurementCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdmittanceMeasurementCondition(AdmittanceMeasurementConditionType newAdmittanceMeasurementCondition, NotificationChain msgs) {
		AdmittanceMeasurementConditionType oldAdmittanceMeasurementCondition = admittanceMeasurementCondition;
		admittanceMeasurementCondition = newAdmittanceMeasurementCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdmittancePackage.REFLEX_TEST_TYPE__ADMITTANCE_MEASUREMENT_CONDITION, oldAdmittanceMeasurementCondition, newAdmittanceMeasurementCondition);
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
	public void setAdmittanceMeasurementCondition(AdmittanceMeasurementConditionType newAdmittanceMeasurementCondition) {
		if (newAdmittanceMeasurementCondition != admittanceMeasurementCondition) {
			NotificationChain msgs = null;
			if (admittanceMeasurementCondition != null)
				msgs = ((InternalEObject)admittanceMeasurementCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.REFLEX_TEST_TYPE__ADMITTANCE_MEASUREMENT_CONDITION, null, msgs);
			if (newAdmittanceMeasurementCondition != null)
				msgs = ((InternalEObject)newAdmittanceMeasurementCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdmittancePackage.REFLEX_TEST_TYPE__ADMITTANCE_MEASUREMENT_CONDITION, null, msgs);
			msgs = basicSetAdmittanceMeasurementCondition(newAdmittanceMeasurementCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.REFLEX_TEST_TYPE__ADMITTANCE_MEASUREMENT_CONDITION, newAdmittanceMeasurementCondition, newAdmittanceMeasurementCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdmittancePackage.REFLEX_TEST_TYPE__REFLEX_CURVE:
				return basicSetReflexCurve(null, msgs);
			case AdmittancePackage.REFLEX_TEST_TYPE__RESULT_OF_REFLEX_TEST:
				return basicSetResultOfReflexTest(null, msgs);
			case AdmittancePackage.REFLEX_TEST_TYPE__ADMITTANCE_MEASUREMENT_CONDITION:
				return basicSetAdmittanceMeasurementCondition(null, msgs);
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
			case AdmittancePackage.REFLEX_TEST_TYPE__REFLEX_CURVE:
				return getReflexCurve();
			case AdmittancePackage.REFLEX_TEST_TYPE__RESULT_OF_REFLEX_TEST:
				return getResultOfReflexTest();
			case AdmittancePackage.REFLEX_TEST_TYPE__ADMITTANCE_MEASUREMENT_CONDITION:
				return getAdmittanceMeasurementCondition();
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
			case AdmittancePackage.REFLEX_TEST_TYPE__REFLEX_CURVE:
				setReflexCurve((ReflexCurveType)newValue);
				return;
			case AdmittancePackage.REFLEX_TEST_TYPE__RESULT_OF_REFLEX_TEST:
				setResultOfReflexTest((ResultOfReflexTestType)newValue);
				return;
			case AdmittancePackage.REFLEX_TEST_TYPE__ADMITTANCE_MEASUREMENT_CONDITION:
				setAdmittanceMeasurementCondition((AdmittanceMeasurementConditionType)newValue);
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
			case AdmittancePackage.REFLEX_TEST_TYPE__REFLEX_CURVE:
				setReflexCurve((ReflexCurveType)null);
				return;
			case AdmittancePackage.REFLEX_TEST_TYPE__RESULT_OF_REFLEX_TEST:
				setResultOfReflexTest((ResultOfReflexTestType)null);
				return;
			case AdmittancePackage.REFLEX_TEST_TYPE__ADMITTANCE_MEASUREMENT_CONDITION:
				setAdmittanceMeasurementCondition((AdmittanceMeasurementConditionType)null);
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
			case AdmittancePackage.REFLEX_TEST_TYPE__REFLEX_CURVE:
				return reflexCurve != null;
			case AdmittancePackage.REFLEX_TEST_TYPE__RESULT_OF_REFLEX_TEST:
				return resultOfReflexTest != null;
			case AdmittancePackage.REFLEX_TEST_TYPE__ADMITTANCE_MEASUREMENT_CONDITION:
				return admittanceMeasurementCondition != null;
		}
		return super.eIsSet(featureID);
	}

} //ReflexTestTypeImpl
