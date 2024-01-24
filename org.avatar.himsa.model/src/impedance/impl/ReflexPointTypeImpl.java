/*
 */
package impedance.impl;

import impedance.ComplianceValueType;
import impedance.ImpedancePackage;
import impedance.ReflexPointType;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reflex Point Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link impedance.impl.ReflexPointTypeImpl#getTime <em>Time</em>}</li>
 *   <li>{@link impedance.impl.ReflexPointTypeImpl#getCompliance <em>Compliance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReflexPointTypeImpl extends MinimalEObjectImpl.Container implements ReflexPointType {
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal time = TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCompliance() <em>Compliance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompliance()
	 * @generated
	 * @ordered
	 */
	protected ComplianceValueType compliance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReflexPointTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImpedancePackage.Literals.REFLEX_POINT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTime(BigDecimal newTime) {
		BigDecimal oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.REFLEX_POINT_TYPE__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplianceValueType getCompliance() {
		return compliance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompliance(ComplianceValueType newCompliance, NotificationChain msgs) {
		ComplianceValueType oldCompliance = compliance;
		compliance = newCompliance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImpedancePackage.REFLEX_POINT_TYPE__COMPLIANCE, oldCompliance, newCompliance);
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
	public void setCompliance(ComplianceValueType newCompliance) {
		if (newCompliance != compliance) {
			NotificationChain msgs = null;
			if (compliance != null)
				msgs = ((InternalEObject)compliance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.REFLEX_POINT_TYPE__COMPLIANCE, null, msgs);
			if (newCompliance != null)
				msgs = ((InternalEObject)newCompliance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImpedancePackage.REFLEX_POINT_TYPE__COMPLIANCE, null, msgs);
			msgs = basicSetCompliance(newCompliance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpedancePackage.REFLEX_POINT_TYPE__COMPLIANCE, newCompliance, newCompliance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImpedancePackage.REFLEX_POINT_TYPE__COMPLIANCE:
				return basicSetCompliance(null, msgs);
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
			case ImpedancePackage.REFLEX_POINT_TYPE__TIME:
				return getTime();
			case ImpedancePackage.REFLEX_POINT_TYPE__COMPLIANCE:
				return getCompliance();
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
			case ImpedancePackage.REFLEX_POINT_TYPE__TIME:
				setTime((BigDecimal)newValue);
				return;
			case ImpedancePackage.REFLEX_POINT_TYPE__COMPLIANCE:
				setCompliance((ComplianceValueType)newValue);
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
			case ImpedancePackage.REFLEX_POINT_TYPE__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case ImpedancePackage.REFLEX_POINT_TYPE__COMPLIANCE:
				setCompliance((ComplianceValueType)null);
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
			case ImpedancePackage.REFLEX_POINT_TYPE__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case ImpedancePackage.REFLEX_POINT_TYPE__COMPLIANCE:
				return compliance != null;
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
		result.append(" (time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //ReflexPointTypeImpl
