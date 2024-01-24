/*
 */
package admittance.impl;

import admittance.AdmittancePackage;
import admittance.AdmittanceUnitMeasuredType;
import admittance.UnitType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Measured Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link admittance.impl.AdmittanceUnitMeasuredTypeImpl#getGUnit <em>GUnit</em>}</li>
 *   <li>{@link admittance.impl.AdmittanceUnitMeasuredTypeImpl#getBUnit <em>BUnit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdmittanceUnitMeasuredTypeImpl extends MinimalEObjectImpl.Container implements AdmittanceUnitMeasuredType {
	/**
	 * The default value of the '{@link #getGUnit() <em>GUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitType GUNIT_EDEFAULT = UnitType.CUBIC_CENTIMETER;

	/**
	 * The cached value of the '{@link #getGUnit() <em>GUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitType gUnit = GUNIT_EDEFAULT;

	/**
	 * This is true if the GUnit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gUnitESet;

	/**
	 * The default value of the '{@link #getBUnit() <em>BUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitType BUNIT_EDEFAULT = UnitType.CUBIC_CENTIMETER;

	/**
	 * The cached value of the '{@link #getBUnit() <em>BUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitType bUnit = BUNIT_EDEFAULT;

	/**
	 * This is true if the BUnit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bUnitESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdmittanceUnitMeasuredTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdmittancePackage.Literals.ADMITTANCE_UNIT_MEASURED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitType getGUnit() {
		return gUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGUnit(UnitType newGUnit) {
		UnitType oldGUnit = gUnit;
		gUnit = newGUnit == null ? GUNIT_EDEFAULT : newGUnit;
		boolean oldGUnitESet = gUnitESet;
		gUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.ADMITTANCE_UNIT_MEASURED_TYPE__GUNIT, oldGUnit, gUnit, !oldGUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetGUnit() {
		UnitType oldGUnit = gUnit;
		boolean oldGUnitESet = gUnitESet;
		gUnit = GUNIT_EDEFAULT;
		gUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdmittancePackage.ADMITTANCE_UNIT_MEASURED_TYPE__GUNIT, oldGUnit, GUNIT_EDEFAULT, oldGUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetGUnit() {
		return gUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitType getBUnit() {
		return bUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBUnit(UnitType newBUnit) {
		UnitType oldBUnit = bUnit;
		bUnit = newBUnit == null ? BUNIT_EDEFAULT : newBUnit;
		boolean oldBUnitESet = bUnitESet;
		bUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmittancePackage.ADMITTANCE_UNIT_MEASURED_TYPE__BUNIT, oldBUnit, bUnit, !oldBUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBUnit() {
		UnitType oldBUnit = bUnit;
		boolean oldBUnitESet = bUnitESet;
		bUnit = BUNIT_EDEFAULT;
		bUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdmittancePackage.ADMITTANCE_UNIT_MEASURED_TYPE__BUNIT, oldBUnit, BUNIT_EDEFAULT, oldBUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBUnit() {
		return bUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdmittancePackage.ADMITTANCE_UNIT_MEASURED_TYPE__GUNIT:
				return getGUnit();
			case AdmittancePackage.ADMITTANCE_UNIT_MEASURED_TYPE__BUNIT:
				return getBUnit();
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
			case AdmittancePackage.ADMITTANCE_UNIT_MEASURED_TYPE__GUNIT:
				setGUnit((UnitType)newValue);
				return;
			case AdmittancePackage.ADMITTANCE_UNIT_MEASURED_TYPE__BUNIT:
				setBUnit((UnitType)newValue);
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
			case AdmittancePackage.ADMITTANCE_UNIT_MEASURED_TYPE__GUNIT:
				unsetGUnit();
				return;
			case AdmittancePackage.ADMITTANCE_UNIT_MEASURED_TYPE__BUNIT:
				unsetBUnit();
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
			case AdmittancePackage.ADMITTANCE_UNIT_MEASURED_TYPE__GUNIT:
				return isSetGUnit();
			case AdmittancePackage.ADMITTANCE_UNIT_MEASURED_TYPE__BUNIT:
				return isSetBUnit();
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
		result.append(" (gUnit: ");
		if (gUnitESet) result.append(gUnit); else result.append("<unset>");
		result.append(", bUnit: ");
		if (bUnitESet) result.append(bUnit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AdmittanceUnitMeasuredTypeImpl
