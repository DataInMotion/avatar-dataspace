/*
 */
package realear.impl;

import java.math.BigDecimal;

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

import realear.EquivalentInputNoise;
import realear.FrequencyMeasurementPoint;
import realear.MeasurementConditions;
import realear.RealearPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equivalent Input Noise</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link realear.impl.EquivalentInputNoiseImpl#getMeasurementConditions <em>Measurement Conditions</em>}</li>
 *   <li>{@link realear.impl.EquivalentInputNoiseImpl#getPoint <em>Point</em>}</li>
 *   <li>{@link realear.impl.EquivalentInputNoiseImpl#getEquivalentRootMeanSquare <em>Equivalent Root Mean Square</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquivalentInputNoiseImpl extends MinimalEObjectImpl.Container implements EquivalentInputNoise {
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
	 * The cached value of the '{@link #getPoint() <em>Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<FrequencyMeasurementPoint> point;

	/**
	 * The default value of the '{@link #getEquivalentRootMeanSquare() <em>Equivalent Root Mean Square</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentRootMeanSquare()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal EQUIVALENT_ROOT_MEAN_SQUARE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEquivalentRootMeanSquare() <em>Equivalent Root Mean Square</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentRootMeanSquare()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal equivalentRootMeanSquare = EQUIVALENT_ROOT_MEAN_SQUARE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquivalentInputNoiseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealearPackage.Literals.EQUIVALENT_INPUT_NOISE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealearPackage.EQUIVALENT_INPUT_NOISE__MEASUREMENT_CONDITIONS, oldMeasurementConditions, newMeasurementConditions);
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
				msgs = ((InternalEObject)measurementConditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealearPackage.EQUIVALENT_INPUT_NOISE__MEASUREMENT_CONDITIONS, null, msgs);
			if (newMeasurementConditions != null)
				msgs = ((InternalEObject)newMeasurementConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealearPackage.EQUIVALENT_INPUT_NOISE__MEASUREMENT_CONDITIONS, null, msgs);
			msgs = basicSetMeasurementConditions(newMeasurementConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealearPackage.EQUIVALENT_INPUT_NOISE__MEASUREMENT_CONDITIONS, newMeasurementConditions, newMeasurementConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FrequencyMeasurementPoint> getPoint() {
		if (point == null) {
			point = new EObjectContainmentEList<FrequencyMeasurementPoint>(FrequencyMeasurementPoint.class, this, RealearPackage.EQUIVALENT_INPUT_NOISE__POINT);
		}
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getEquivalentRootMeanSquare() {
		return equivalentRootMeanSquare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEquivalentRootMeanSquare(BigDecimal newEquivalentRootMeanSquare) {
		BigDecimal oldEquivalentRootMeanSquare = equivalentRootMeanSquare;
		equivalentRootMeanSquare = newEquivalentRootMeanSquare;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealearPackage.EQUIVALENT_INPUT_NOISE__EQUIVALENT_ROOT_MEAN_SQUARE, oldEquivalentRootMeanSquare, equivalentRootMeanSquare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealearPackage.EQUIVALENT_INPUT_NOISE__MEASUREMENT_CONDITIONS:
				return basicSetMeasurementConditions(null, msgs);
			case RealearPackage.EQUIVALENT_INPUT_NOISE__POINT:
				return ((InternalEList<?>)getPoint()).basicRemove(otherEnd, msgs);
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
			case RealearPackage.EQUIVALENT_INPUT_NOISE__MEASUREMENT_CONDITIONS:
				return getMeasurementConditions();
			case RealearPackage.EQUIVALENT_INPUT_NOISE__POINT:
				return getPoint();
			case RealearPackage.EQUIVALENT_INPUT_NOISE__EQUIVALENT_ROOT_MEAN_SQUARE:
				return getEquivalentRootMeanSquare();
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
			case RealearPackage.EQUIVALENT_INPUT_NOISE__MEASUREMENT_CONDITIONS:
				setMeasurementConditions((MeasurementConditions)newValue);
				return;
			case RealearPackage.EQUIVALENT_INPUT_NOISE__POINT:
				getPoint().clear();
				getPoint().addAll((Collection<? extends FrequencyMeasurementPoint>)newValue);
				return;
			case RealearPackage.EQUIVALENT_INPUT_NOISE__EQUIVALENT_ROOT_MEAN_SQUARE:
				setEquivalentRootMeanSquare((BigDecimal)newValue);
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
			case RealearPackage.EQUIVALENT_INPUT_NOISE__MEASUREMENT_CONDITIONS:
				setMeasurementConditions((MeasurementConditions)null);
				return;
			case RealearPackage.EQUIVALENT_INPUT_NOISE__POINT:
				getPoint().clear();
				return;
			case RealearPackage.EQUIVALENT_INPUT_NOISE__EQUIVALENT_ROOT_MEAN_SQUARE:
				setEquivalentRootMeanSquare(EQUIVALENT_ROOT_MEAN_SQUARE_EDEFAULT);
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
			case RealearPackage.EQUIVALENT_INPUT_NOISE__MEASUREMENT_CONDITIONS:
				return measurementConditions != null;
			case RealearPackage.EQUIVALENT_INPUT_NOISE__POINT:
				return point != null && !point.isEmpty();
			case RealearPackage.EQUIVALENT_INPUT_NOISE__EQUIVALENT_ROOT_MEAN_SQUARE:
				return EQUIVALENT_ROOT_MEAN_SQUARE_EDEFAULT == null ? equivalentRootMeanSquare != null : !EQUIVALENT_ROOT_MEAN_SQUARE_EDEFAULT.equals(equivalentRootMeanSquare);
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
		result.append(" (equivalentRootMeanSquare: ");
		result.append(equivalentRootMeanSquare);
		result.append(')');
		return result.toString();
	}

} //EquivalentInputNoiseImpl
