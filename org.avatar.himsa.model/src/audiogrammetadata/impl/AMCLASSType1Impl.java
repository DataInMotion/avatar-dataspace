/*
 */
package audiogrammetadata.impl;

import audiogrammetadata.AMCLASSType;
import audiogrammetadata.AMCLASSType1;
import audiogrammetadata.AudiogrammetadataPackage;
import audiogrammetadata.SymmetryType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AMCLASS Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link audiogrammetadata.impl.AMCLASSType1Impl#getSymmetry <em>Symmetry</em>}</li>
 *   <li>{@link audiogrammetadata.impl.AMCLASSType1Impl#getRightEar <em>Right Ear</em>}</li>
 *   <li>{@link audiogrammetadata.impl.AMCLASSType1Impl#getLeftEar <em>Left Ear</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AMCLASSType1Impl extends MinimalEObjectImpl.Container implements AMCLASSType1 {
	/**
	 * The default value of the '{@link #getSymmetry() <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymmetry()
	 * @generated
	 * @ordered
	 */
	protected static final SymmetryType SYMMETRY_EDEFAULT = SymmetryType.SYMMETRICAL_HEARING_LOSS;

	/**
	 * The cached value of the '{@link #getSymmetry() <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymmetry()
	 * @generated
	 * @ordered
	 */
	protected SymmetryType symmetry = SYMMETRY_EDEFAULT;

	/**
	 * This is true if the Symmetry attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean symmetryESet;

	/**
	 * The cached value of the '{@link #getRightEar() <em>Right Ear</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightEar()
	 * @generated
	 * @ordered
	 */
	protected AMCLASSType rightEar;

	/**
	 * The cached value of the '{@link #getLeftEar() <em>Left Ear</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftEar()
	 * @generated
	 * @ordered
	 */
	protected AMCLASSType leftEar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AMCLASSType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AudiogrammetadataPackage.Literals.AMCLASS_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SymmetryType getSymmetry() {
		return symmetry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymmetry(SymmetryType newSymmetry) {
		SymmetryType oldSymmetry = symmetry;
		symmetry = newSymmetry == null ? SYMMETRY_EDEFAULT : newSymmetry;
		boolean oldSymmetryESet = symmetryESet;
		symmetryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogrammetadataPackage.AMCLASS_TYPE1__SYMMETRY, oldSymmetry, symmetry, !oldSymmetryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSymmetry() {
		SymmetryType oldSymmetry = symmetry;
		boolean oldSymmetryESet = symmetryESet;
		symmetry = SYMMETRY_EDEFAULT;
		symmetryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AudiogrammetadataPackage.AMCLASS_TYPE1__SYMMETRY, oldSymmetry, SYMMETRY_EDEFAULT, oldSymmetryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSymmetry() {
		return symmetryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AMCLASSType getRightEar() {
		return rightEar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightEar(AMCLASSType newRightEar, NotificationChain msgs) {
		AMCLASSType oldRightEar = rightEar;
		rightEar = newRightEar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AudiogrammetadataPackage.AMCLASS_TYPE1__RIGHT_EAR, oldRightEar, newRightEar);
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
	public void setRightEar(AMCLASSType newRightEar) {
		if (newRightEar != rightEar) {
			NotificationChain msgs = null;
			if (rightEar != null)
				msgs = ((InternalEObject)rightEar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AudiogrammetadataPackage.AMCLASS_TYPE1__RIGHT_EAR, null, msgs);
			if (newRightEar != null)
				msgs = ((InternalEObject)newRightEar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AudiogrammetadataPackage.AMCLASS_TYPE1__RIGHT_EAR, null, msgs);
			msgs = basicSetRightEar(newRightEar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogrammetadataPackage.AMCLASS_TYPE1__RIGHT_EAR, newRightEar, newRightEar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AMCLASSType getLeftEar() {
		return leftEar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftEar(AMCLASSType newLeftEar, NotificationChain msgs) {
		AMCLASSType oldLeftEar = leftEar;
		leftEar = newLeftEar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AudiogrammetadataPackage.AMCLASS_TYPE1__LEFT_EAR, oldLeftEar, newLeftEar);
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
	public void setLeftEar(AMCLASSType newLeftEar) {
		if (newLeftEar != leftEar) {
			NotificationChain msgs = null;
			if (leftEar != null)
				msgs = ((InternalEObject)leftEar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AudiogrammetadataPackage.AMCLASS_TYPE1__LEFT_EAR, null, msgs);
			if (newLeftEar != null)
				msgs = ((InternalEObject)newLeftEar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AudiogrammetadataPackage.AMCLASS_TYPE1__LEFT_EAR, null, msgs);
			msgs = basicSetLeftEar(newLeftEar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogrammetadataPackage.AMCLASS_TYPE1__LEFT_EAR, newLeftEar, newLeftEar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AudiogrammetadataPackage.AMCLASS_TYPE1__RIGHT_EAR:
				return basicSetRightEar(null, msgs);
			case AudiogrammetadataPackage.AMCLASS_TYPE1__LEFT_EAR:
				return basicSetLeftEar(null, msgs);
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
			case AudiogrammetadataPackage.AMCLASS_TYPE1__SYMMETRY:
				return getSymmetry();
			case AudiogrammetadataPackage.AMCLASS_TYPE1__RIGHT_EAR:
				return getRightEar();
			case AudiogrammetadataPackage.AMCLASS_TYPE1__LEFT_EAR:
				return getLeftEar();
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
			case AudiogrammetadataPackage.AMCLASS_TYPE1__SYMMETRY:
				setSymmetry((SymmetryType)newValue);
				return;
			case AudiogrammetadataPackage.AMCLASS_TYPE1__RIGHT_EAR:
				setRightEar((AMCLASSType)newValue);
				return;
			case AudiogrammetadataPackage.AMCLASS_TYPE1__LEFT_EAR:
				setLeftEar((AMCLASSType)newValue);
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
			case AudiogrammetadataPackage.AMCLASS_TYPE1__SYMMETRY:
				unsetSymmetry();
				return;
			case AudiogrammetadataPackage.AMCLASS_TYPE1__RIGHT_EAR:
				setRightEar((AMCLASSType)null);
				return;
			case AudiogrammetadataPackage.AMCLASS_TYPE1__LEFT_EAR:
				setLeftEar((AMCLASSType)null);
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
			case AudiogrammetadataPackage.AMCLASS_TYPE1__SYMMETRY:
				return isSetSymmetry();
			case AudiogrammetadataPackage.AMCLASS_TYPE1__RIGHT_EAR:
				return rightEar != null;
			case AudiogrammetadataPackage.AMCLASS_TYPE1__LEFT_EAR:
				return leftEar != null;
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
		result.append(" (symmetry: ");
		if (symmetryESet) result.append(symmetry); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AMCLASSType1Impl
