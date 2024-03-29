/*
 */
package realear.impl;

import java.math.BigDecimal;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import realear.RealearPackage;
import realear.TargetMeasurementPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Measurement Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link realear.impl.TargetMeasurementPointImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetMeasurementPointImpl extends MinimalEObjectImpl.Container implements TargetMeasurementPoint {
	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<BigDecimal> output;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetMeasurementPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealearPackage.Literals.TARGET_MEASUREMENT_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BigDecimal> getOutput() {
		if (output == null) {
			output = new EDataTypeEList<BigDecimal>(BigDecimal.class, this, RealearPackage.TARGET_MEASUREMENT_POINT__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RealearPackage.TARGET_MEASUREMENT_POINT__OUTPUT:
				return getOutput();
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
			case RealearPackage.TARGET_MEASUREMENT_POINT__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends BigDecimal>)newValue);
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
			case RealearPackage.TARGET_MEASUREMENT_POINT__OUTPUT:
				getOutput().clear();
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
			case RealearPackage.TARGET_MEASUREMENT_POINT__OUTPUT:
				return output != null && !output.isEmpty();
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
		result.append(" (output: ");
		result.append(output);
		result.append(')');
		return result.toString();
	}

} //TargetMeasurementPointImpl
