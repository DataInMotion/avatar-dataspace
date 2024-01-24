/*
 */
package admittance.impl;

import admittance.AdmittancePackage;
import admittance.AdmittanceValuePointCalculatedType;
import admittance.CalculatedAdmittancePointsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calculated Admittance Points Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link admittance.impl.CalculatedAdmittancePointsTypeImpl#getPt <em>Pt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalculatedAdmittancePointsTypeImpl extends MinimalEObjectImpl.Container implements CalculatedAdmittancePointsType {
	/**
	 * The cached value of the '{@link #getPt() <em>Pt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPt()
	 * @generated
	 * @ordered
	 */
	protected EList<AdmittanceValuePointCalculatedType> pt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalculatedAdmittancePointsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdmittancePackage.Literals.CALCULATED_ADMITTANCE_POINTS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AdmittanceValuePointCalculatedType> getPt() {
		if (pt == null) {
			pt = new EObjectContainmentEList<AdmittanceValuePointCalculatedType>(AdmittanceValuePointCalculatedType.class, this, AdmittancePackage.CALCULATED_ADMITTANCE_POINTS_TYPE__PT);
		}
		return pt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdmittancePackage.CALCULATED_ADMITTANCE_POINTS_TYPE__PT:
				return ((InternalEList<?>)getPt()).basicRemove(otherEnd, msgs);
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
			case AdmittancePackage.CALCULATED_ADMITTANCE_POINTS_TYPE__PT:
				return getPt();
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
			case AdmittancePackage.CALCULATED_ADMITTANCE_POINTS_TYPE__PT:
				getPt().clear();
				getPt().addAll((Collection<? extends AdmittanceValuePointCalculatedType>)newValue);
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
			case AdmittancePackage.CALCULATED_ADMITTANCE_POINTS_TYPE__PT:
				getPt().clear();
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
			case AdmittancePackage.CALCULATED_ADMITTANCE_POINTS_TYPE__PT:
				return pt != null && !pt.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CalculatedAdmittancePointsTypeImpl
