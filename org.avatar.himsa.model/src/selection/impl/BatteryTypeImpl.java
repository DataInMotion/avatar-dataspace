/*
 */
package selection.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import selection.BatteryType;
import selection.SelectionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Battery Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link selection.impl.BatteryTypeImpl#getBatteryTypeCode <em>Battery Type Code</em>}</li>
 *   <li>{@link selection.impl.BatteryTypeImpl#getBatteryTypeText <em>Battery Type Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BatteryTypeImpl extends MinimalEObjectImpl.Container implements BatteryType {
	/**
	 * The default value of the '{@link #getBatteryTypeCode() <em>Battery Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryTypeCode()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger BATTERY_TYPE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBatteryTypeCode() <em>Battery Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryTypeCode()
	 * @generated
	 * @ordered
	 */
	protected BigInteger batteryTypeCode = BATTERY_TYPE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBatteryTypeText() <em>Battery Type Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryTypeText()
	 * @generated
	 * @ordered
	 */
	protected static final String BATTERY_TYPE_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBatteryTypeText() <em>Battery Type Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryTypeText()
	 * @generated
	 * @ordered
	 */
	protected String batteryTypeText = BATTERY_TYPE_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BatteryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelectionPackage.Literals.BATTERY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getBatteryTypeCode() {
		return batteryTypeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBatteryTypeCode(BigInteger newBatteryTypeCode) {
		BigInteger oldBatteryTypeCode = batteryTypeCode;
		batteryTypeCode = newBatteryTypeCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectionPackage.BATTERY_TYPE__BATTERY_TYPE_CODE, oldBatteryTypeCode, batteryTypeCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBatteryTypeText() {
		return batteryTypeText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBatteryTypeText(String newBatteryTypeText) {
		String oldBatteryTypeText = batteryTypeText;
		batteryTypeText = newBatteryTypeText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectionPackage.BATTERY_TYPE__BATTERY_TYPE_TEXT, oldBatteryTypeText, batteryTypeText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SelectionPackage.BATTERY_TYPE__BATTERY_TYPE_CODE:
				return getBatteryTypeCode();
			case SelectionPackage.BATTERY_TYPE__BATTERY_TYPE_TEXT:
				return getBatteryTypeText();
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
			case SelectionPackage.BATTERY_TYPE__BATTERY_TYPE_CODE:
				setBatteryTypeCode((BigInteger)newValue);
				return;
			case SelectionPackage.BATTERY_TYPE__BATTERY_TYPE_TEXT:
				setBatteryTypeText((String)newValue);
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
			case SelectionPackage.BATTERY_TYPE__BATTERY_TYPE_CODE:
				setBatteryTypeCode(BATTERY_TYPE_CODE_EDEFAULT);
				return;
			case SelectionPackage.BATTERY_TYPE__BATTERY_TYPE_TEXT:
				setBatteryTypeText(BATTERY_TYPE_TEXT_EDEFAULT);
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
			case SelectionPackage.BATTERY_TYPE__BATTERY_TYPE_CODE:
				return BATTERY_TYPE_CODE_EDEFAULT == null ? batteryTypeCode != null : !BATTERY_TYPE_CODE_EDEFAULT.equals(batteryTypeCode);
			case SelectionPackage.BATTERY_TYPE__BATTERY_TYPE_TEXT:
				return BATTERY_TYPE_TEXT_EDEFAULT == null ? batteryTypeText != null : !BATTERY_TYPE_TEXT_EDEFAULT.equals(batteryTypeText);
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
		result.append(" (batteryTypeCode: ");
		result.append(batteryTypeCode);
		result.append(", batteryTypeText: ");
		result.append(batteryTypeText);
		result.append(')');
		return result.toString();
	}

} //BatteryTypeImpl
