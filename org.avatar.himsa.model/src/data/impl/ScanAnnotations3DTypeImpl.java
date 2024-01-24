/*
 */
package data.impl;

import data.AreaType1;
import data.DataPackage;
import data.DirectionType1;
import data.PlaneType1;
import data.PointType1;
import data.ScanAnnotations3DType;

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
 * An implementation of the model object '<em><b>Scan Annotations3 DType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link data.impl.ScanAnnotations3DTypeImpl#getPoint <em>Point</em>}</li>
 *   <li>{@link data.impl.ScanAnnotations3DTypeImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link data.impl.ScanAnnotations3DTypeImpl#getPlane <em>Plane</em>}</li>
 *   <li>{@link data.impl.ScanAnnotations3DTypeImpl#getArea <em>Area</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScanAnnotations3DTypeImpl extends MinimalEObjectImpl.Container implements ScanAnnotations3DType {
	/**
	 * The cached value of the '{@link #getPoint() <em>Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<PointType1> point;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected EList<DirectionType1> direction;

	/**
	 * The cached value of the '{@link #getPlane() <em>Plane</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlane()
	 * @generated
	 * @ordered
	 */
	protected EList<PlaneType1> plane;

	/**
	 * The cached value of the '{@link #getArea() <em>Area</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected EList<AreaType1> area;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScanAnnotations3DTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.SCAN_ANNOTATIONS3_DTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PointType1> getPoint() {
		if (point == null) {
			point = new EObjectContainmentEList<PointType1>(PointType1.class, this, DataPackage.SCAN_ANNOTATIONS3_DTYPE__POINT);
		}
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DirectionType1> getDirection() {
		if (direction == null) {
			direction = new EObjectContainmentEList<DirectionType1>(DirectionType1.class, this, DataPackage.SCAN_ANNOTATIONS3_DTYPE__DIRECTION);
		}
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlaneType1> getPlane() {
		if (plane == null) {
			plane = new EObjectContainmentEList<PlaneType1>(PlaneType1.class, this, DataPackage.SCAN_ANNOTATIONS3_DTYPE__PLANE);
		}
		return plane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AreaType1> getArea() {
		if (area == null) {
			area = new EObjectContainmentEList<AreaType1>(AreaType1.class, this, DataPackage.SCAN_ANNOTATIONS3_DTYPE__AREA);
		}
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataPackage.SCAN_ANNOTATIONS3_DTYPE__POINT:
				return ((InternalEList<?>)getPoint()).basicRemove(otherEnd, msgs);
			case DataPackage.SCAN_ANNOTATIONS3_DTYPE__DIRECTION:
				return ((InternalEList<?>)getDirection()).basicRemove(otherEnd, msgs);
			case DataPackage.SCAN_ANNOTATIONS3_DTYPE__PLANE:
				return ((InternalEList<?>)getPlane()).basicRemove(otherEnd, msgs);
			case DataPackage.SCAN_ANNOTATIONS3_DTYPE__AREA:
				return ((InternalEList<?>)getArea()).basicRemove(otherEnd, msgs);
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
			case DataPackage.SCAN_ANNOTATIONS3_DTYPE__POINT:
				return getPoint();
			case DataPackage.SCAN_ANNOTATIONS3_DTYPE__DIRECTION:
				return getDirection();
			case DataPackage.SCAN_ANNOTATIONS3_DTYPE__PLANE:
				return getPlane();
			case DataPackage.SCAN_ANNOTATIONS3_DTYPE__AREA:
				return getArea();
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
			case DataPackage.SCAN_ANNOTATIONS3_DTYPE__POINT:
				getPoint().clear();
				getPoint().addAll((Collection<? extends PointType1>)newValue);
				return;
			case DataPackage.SCAN_ANNOTATIONS3_DTYPE__DIRECTION:
				getDirection().clear();
				getDirection().addAll((Collection<? extends DirectionType1>)newValue);
				return;
			case DataPackage.SCAN_ANNOTATIONS3_DTYPE__PLANE:
				getPlane().clear();
				getPlane().addAll((Collection<? extends PlaneType1>)newValue);
				return;
			case DataPackage.SCAN_ANNOTATIONS3_DTYPE__AREA:
				getArea().clear();
				getArea().addAll((Collection<? extends AreaType1>)newValue);
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
			case DataPackage.SCAN_ANNOTATIONS3_DTYPE__POINT:
				getPoint().clear();
				return;
			case DataPackage.SCAN_ANNOTATIONS3_DTYPE__DIRECTION:
				getDirection().clear();
				return;
			case DataPackage.SCAN_ANNOTATIONS3_DTYPE__PLANE:
				getPlane().clear();
				return;
			case DataPackage.SCAN_ANNOTATIONS3_DTYPE__AREA:
				getArea().clear();
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
			case DataPackage.SCAN_ANNOTATIONS3_DTYPE__POINT:
				return point != null && !point.isEmpty();
			case DataPackage.SCAN_ANNOTATIONS3_DTYPE__DIRECTION:
				return direction != null && !direction.isEmpty();
			case DataPackage.SCAN_ANNOTATIONS3_DTYPE__PLANE:
				return plane != null && !plane.isEmpty();
			case DataPackage.SCAN_ANNOTATIONS3_DTYPE__AREA:
				return area != null && !area.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScanAnnotations3DTypeImpl
