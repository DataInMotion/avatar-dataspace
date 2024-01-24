/*
 */
package impedance.impl;

import impedance.ImpedanceMeasurementConditionType;
import impedance.ImpedancePackage;
import impedance.ReflexCurveType;
import impedance.ReflexTestType;

import java.math.BigInteger;

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
 *   <li>{@link impedance.impl.ReflexTestTypeImpl#getReflexCurve <em>Reflex Curve</em>}</li>
 *   <li>{@link impedance.impl.ReflexTestTypeImpl#getResultOfReflexTest <em>Result Of Reflex Test</em>}</li>
 *   <li>{@link impedance.impl.ReflexTestTypeImpl#getImpedanceMeasurementCondition <em>Impedance Measurement Condition</em>}</li>
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
	 * The default value of the '{@link #getResultOfReflexTest() <em>Result Of Reflex Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultOfReflexTest()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger RESULT_OF_REFLEX_TEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultOfReflexTest() <em>Result Of Reflex Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultOfReflexTest()
	 * @generated
	 * @ordered
	 */
	protected BigInteger resultOfReflexTest = RESULT_OF_REFLEX_TEST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImpedanceMeasurementCondition() <em>Impedance Measurement Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedanceMeasurementCondition()
	 * @generated
	 * @ordered
	 */
	protected ImpedanceMeasurementConditionType impedanceMeasurementCondition;

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
		return ImpedancePackage.Literals.REFLEX_TEST_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImpedancePackage.REFLEX_TEST_TYPE__REFLEX_CURVE, oldReflexCurve, newReflexCurve);
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
				msgs = ((InternalEObject)reflexCurve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.REFLEX_TEST_TYPE__REFLEX_CURVE, null, msgs);
			if (newReflexCurve != null)
				msgs = ((InternalEObject)newReflexCurve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.REFLEX_TEST_TYPE__REFLEX_CURVE, null, msgs);
			msgs = basicSetReflexCurve(newReflexCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.REFLEX_TEST_TYPE__REFLEX_CURVE, newReflexCurve, newReflexCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getResultOfReflexTest() {
		return resultOfReflexTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultOfReflexTest(BigInteger newResultOfReflexTest) {
		BigInteger oldResultOfReflexTest = resultOfReflexTest;
		resultOfReflexTest = newResultOfReflexTest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.REFLEX_TEST_TYPE__RESULT_OF_REFLEX_TEST, oldResultOfReflexTest, resultOfReflexTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImpedanceMeasurementConditionType getImpedanceMeasurementCondition() {
		return impedanceMeasurementCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImpedanceMeasurementCondition(ImpedanceMeasurementConditionType newImpedanceMeasurementCondition, NotificationChain msgs) {
		ImpedanceMeasurementConditionType oldImpedanceMeasurementCondition = impedanceMeasurementCondition;
		impedanceMeasurementCondition = newImpedanceMeasurementCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImpedancePackage.REFLEX_TEST_TYPE__IMPEDANCE_MEASUREMENT_CONDITION, oldImpedanceMeasurementCondition, newImpedanceMeasurementCondition);
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
	public void setImpedanceMeasurementCondition(ImpedanceMeasurementConditionType newImpedanceMeasurementCondition) {
		if (newImpedanceMeasurementCondition != impedanceMeasurementCondition) {
			NotificationChain msgs = null;
			if (impedanceMeasurementCondition != null)
				msgs = ((InternalEObject)impedanceMeasurementCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.REFLEX_TEST_TYPE__IMPEDANCE_MEASUREMENT_CONDITION, null, msgs);
			if (newImpedanceMeasurementCondition != null)
				msgs = ((InternalEObject)newImpedanceMeasurementCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.REFLEX_TEST_TYPE__IMPEDANCE_MEASUREMENT_CONDITION, null, msgs);
			msgs = basicSetImpedanceMeasurementCondition(newImpedanceMeasurementCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.REFLEX_TEST_TYPE__IMPEDANCE_MEASUREMENT_CONDITION, newImpedanceMeasurementCondition, newImpedanceMeasurementCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImpedancePackage.REFLEX_TEST_TYPE__REFLEX_CURVE:
				return basicSetReflexCurve(null, msgs);
			case ImpedancePackage.REFLEX_TEST_TYPE__IMPEDANCE_MEASUREMENT_CONDITION:
				return basicSetImpedanceMeasurementCondition(null, msgs);
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
			case ImpedancePackage.REFLEX_TEST_TYPE__REFLEX_CURVE:
				return getReflexCurve();
			case ImpedancePackage.REFLEX_TEST_TYPE__RESULT_OF_REFLEX_TEST:
				return getResultOfReflexTest();
			case ImpedancePackage.REFLEX_TEST_TYPE__IMPEDANCE_MEASUREMENT_CONDITION:
				return getImpedanceMeasurementCondition();
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
			case ImpedancePackage.REFLEX_TEST_TYPE__REFLEX_CURVE:
				setReflexCurve((ReflexCurveType)newValue);
				return;
			case ImpedancePackage.REFLEX_TEST_TYPE__RESULT_OF_REFLEX_TEST:
				setResultOfReflexTest((BigInteger)newValue);
				return;
			case ImpedancePackage.REFLEX_TEST_TYPE__IMPEDANCE_MEASUREMENT_CONDITION:
				setImpedanceMeasurementCondition((ImpedanceMeasurementConditionType)newValue);
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
			case ImpedancePackage.REFLEX_TEST_TYPE__REFLEX_CURVE:
				setReflexCurve((ReflexCurveType)null);
				return;
			case ImpedancePackage.REFLEX_TEST_TYPE__RESULT_OF_REFLEX_TEST:
				setResultOfReflexTest(RESULT_OF_REFLEX_TEST_EDEFAULT);
				return;
			case ImpedancePackage.REFLEX_TEST_TYPE__IMPEDANCE_MEASUREMENT_CONDITION:
				setImpedanceMeasurementCondition((ImpedanceMeasurementConditionType)null);
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
			case ImpedancePackage.REFLEX_TEST_TYPE__REFLEX_CURVE:
				return reflexCurve != null;
			case ImpedancePackage.REFLEX_TEST_TYPE__RESULT_OF_REFLEX_TEST:
				return RESULT_OF_REFLEX_TEST_EDEFAULT == null ? resultOfReflexTest != null : !RESULT_OF_REFLEX_TEST_EDEFAULT.equals(resultOfReflexTest);
			case ImpedancePackage.REFLEX_TEST_TYPE__IMPEDANCE_MEASUREMENT_CONDITION:
				return impedanceMeasurementCondition != null;
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
		result.append(" (resultOfReflexTest: ");
		result.append(resultOfReflexTest);
		result.append(')');
		return result.toString();
	}

} //ReflexTestTypeImpl
