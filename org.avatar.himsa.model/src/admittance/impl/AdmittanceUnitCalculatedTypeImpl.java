/*
 */
package admittance.impl;

import admittance.AdmittancePackage;
import admittance.AdmittanceUnitCalculatedType;
import admittance.UnitType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Calculated Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link admittance.impl.AdmittanceUnitCalculatedTypeImpl#getYUnit <em>YUnit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdmittanceUnitCalculatedTypeImpl extends MinimalEObjectImpl.Container implements AdmittanceUnitCalculatedType {
	/**
	 * The default value of the '{@link #getYUnit() <em>YUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitType YUNIT_EDEFAULT = UnitType.CUBIC_CENTIMETER;

	/**
	 * The cached value of the '{@link #getYUnit() <em>YUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitType yUnit = YUNIT_EDEFAULT;

	/**
	 * This is true if the YUnit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean yUnitESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdmittanceUnitCalculatedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdmittancePackage.Literals.ADMITTANCE_UNIT_CALCULATED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitType getYUnit() {
		return yUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYUnit(UnitType newYUnit) {
		UnitType oldYUnit = yUnit;
		yUnit = newYUnit == null ? YUNIT_EDEFAULT : newYUnit;
		boolean oldYUnitESet = yUnitESet;
		yUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.ADMITTANCE_UNIT_CALCULATED_TYPE__YUNIT, oldYUnit, yUnit, !oldYUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetYUnit() {
		UnitType oldYUnit = yUnit;
		boolean oldYUnitESet = yUnitESet;
		yUnit = YUNIT_EDEFAULT;
		yUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdmittancePackage.ADMITTANCE_UNIT_CALCULATED_TYPE__YUNIT, oldYUnit, YUNIT_EDEFAULT, oldYUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetYUnit() {
		return yUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdmittancePackage.ADMITTANCE_UNIT_CALCULATED_TYPE__YUNIT:
				return getYUnit();
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
			case AdmittancePackage.ADMITTANCE_UNIT_CALCULATED_TYPE__YUNIT:
				setYUnit((UnitType)newValue);
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
			case AdmittancePackage.ADMITTANCE_UNIT_CALCULATED_TYPE__YUNIT:
				unsetYUnit();
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
			case AdmittancePackage.ADMITTANCE_UNIT_CALCULATED_TYPE__YUNIT:
				return isSetYUnit();
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
		result.append(" (yUnit: ");
		if (yUnitESet) result.append(yUnit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AdmittanceUnitCalculatedTypeImpl
