/*
 */
package audiogram502.impl;

import audiogram502.Audiogram502Package;
import audiogram502.WeberPointType;
import audiogram502.WeberPointsType;

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
 * An implementation of the model object '<em><b>Weber Points Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link audiogram502.impl.WeberPointsTypeImpl#getWeberPoint <em>Weber Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeberPointsTypeImpl extends MinimalEObjectImpl.Container implements WeberPointsType {
	/**
	 * The cached value of the '{@link #getWeberPoint() <em>Weber Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeberPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<WeberPointType> weberPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeberPointsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Audiogram502Package.Literals.WEBER_POINTS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WeberPointType> getWeberPoint() {
		if (weberPoint == null) {
			weberPoint = new EObjectContainmentEList<WeberPointType>(WeberPointType.class, this, Audiogram502Package.WEBER_POINTS_TYPE__WEBER_POINT);
		}
		return weberPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Audiogram502Package.WEBER_POINTS_TYPE__WEBER_POINT:
				return ((InternalEList<?>)getWeberPoint()).basicRemove(otherEnd, msgs);
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
			case Audiogram502Package.WEBER_POINTS_TYPE__WEBER_POINT:
				return getWeberPoint();
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
			case Audiogram502Package.WEBER_POINTS_TYPE__WEBER_POINT:
				getWeberPoint().clear();
				getWeberPoint().addAll((Collection<? extends WeberPointType>)newValue);
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
			case Audiogram502Package.WEBER_POINTS_TYPE__WEBER_POINT:
				getWeberPoint().clear();
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
			case Audiogram502Package.WEBER_POINTS_TYPE__WEBER_POINT:
				return weberPoint != null && !weberPoint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WeberPointsTypeImpl
