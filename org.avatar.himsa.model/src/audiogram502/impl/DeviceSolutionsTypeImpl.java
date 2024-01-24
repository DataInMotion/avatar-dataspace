/*
 */
package audiogram502.impl;

import audiogram502.AidedSolutionsType;
import audiogram502.Audiogram502Package;
import audiogram502.DeviceSolutionsType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Solutions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link audiogram502.impl.DeviceSolutionsTypeImpl#getRightEarDevice <em>Right Ear Device</em>}</li>
 *   <li>{@link audiogram502.impl.DeviceSolutionsTypeImpl#getLeftEarDevice <em>Left Ear Device</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceSolutionsTypeImpl extends MinimalEObjectImpl.Container implements DeviceSolutionsType {
	/**
	 * The default value of the '{@link #getRightEarDevice() <em>Right Ear Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightEarDevice()
	 * @generated
	 * @ordered
	 */
	protected static final AidedSolutionsType RIGHT_EAR_DEVICE_EDEFAULT = AidedSolutionsType.NONE;

	/**
	 * The cached value of the '{@link #getRightEarDevice() <em>Right Ear Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightEarDevice()
	 * @generated
	 * @ordered
	 */
	protected AidedSolutionsType rightEarDevice = RIGHT_EAR_DEVICE_EDEFAULT;

	/**
	 * This is true if the Right Ear Device attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rightEarDeviceESet;

	/**
	 * The default value of the '{@link #getLeftEarDevice() <em>Left Ear Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftEarDevice()
	 * @generated
	 * @ordered
	 */
	protected static final AidedSolutionsType LEFT_EAR_DEVICE_EDEFAULT = AidedSolutionsType.NONE;

	/**
	 * The cached value of the '{@link #getLeftEarDevice() <em>Left Ear Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftEarDevice()
	 * @generated
	 * @ordered
	 */
	protected AidedSolutionsType leftEarDevice = LEFT_EAR_DEVICE_EDEFAULT;

	/**
	 * This is true if the Left Ear Device attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean leftEarDeviceESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceSolutionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Audiogram502Package.Literals.DEVICE_SOLUTIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AidedSolutionsType getRightEarDevice() {
		return rightEarDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRightEarDevice(AidedSolutionsType newRightEarDevice) {
		AidedSolutionsType oldRightEarDevice = rightEarDevice;
		rightEarDevice = newRightEarDevice == null ? RIGHT_EAR_DEVICE_EDEFAULT : newRightEarDevice;
		boolean oldRightEarDeviceESet = rightEarDeviceESet;
		rightEarDeviceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Audiogram502Package.DEVICE_SOLUTIONS_TYPE__RIGHT_EAR_DEVICE, oldRightEarDevice, rightEarDevice, !oldRightEarDeviceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRightEarDevice() {
		AidedSolutionsType oldRightEarDevice = rightEarDevice;
		boolean oldRightEarDeviceESet = rightEarDeviceESet;
		rightEarDevice = RIGHT_EAR_DEVICE_EDEFAULT;
		rightEarDeviceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Audiogram502Package.DEVICE_SOLUTIONS_TYPE__RIGHT_EAR_DEVICE, oldRightEarDevice, RIGHT_EAR_DEVICE_EDEFAULT, oldRightEarDeviceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRightEarDevice() {
		return rightEarDeviceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AidedSolutionsType getLeftEarDevice() {
		return leftEarDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeftEarDevice(AidedSolutionsType newLeftEarDevice) {
		AidedSolutionsType oldLeftEarDevice = leftEarDevice;
		leftEarDevice = newLeftEarDevice == null ? LEFT_EAR_DEVICE_EDEFAULT : newLeftEarDevice;
		boolean oldLeftEarDeviceESet = leftEarDeviceESet;
		leftEarDeviceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Audiogram502Package.DEVICE_SOLUTIONS_TYPE__LEFT_EAR_DEVICE, oldLeftEarDevice, leftEarDevice, !oldLeftEarDeviceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLeftEarDevice() {
		AidedSolutionsType oldLeftEarDevice = leftEarDevice;
		boolean oldLeftEarDeviceESet = leftEarDeviceESet;
		leftEarDevice = LEFT_EAR_DEVICE_EDEFAULT;
		leftEarDeviceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Audiogram502Package.DEVICE_SOLUTIONS_TYPE__LEFT_EAR_DEVICE, oldLeftEarDevice, LEFT_EAR_DEVICE_EDEFAULT, oldLeftEarDeviceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLeftEarDevice() {
		return leftEarDeviceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Audiogram502Package.DEVICE_SOLUTIONS_TYPE__RIGHT_EAR_DEVICE:
				return getRightEarDevice();
			case Audiogram502Package.DEVICE_SOLUTIONS_TYPE__LEFT_EAR_DEVICE:
				return getLeftEarDevice();
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
			case Audiogram502Package.DEVICE_SOLUTIONS_TYPE__RIGHT_EAR_DEVICE:
				setRightEarDevice((AidedSolutionsType)newValue);
				return;
			case Audiogram502Package.DEVICE_SOLUTIONS_TYPE__LEFT_EAR_DEVICE:
				setLeftEarDevice((AidedSolutionsType)newValue);
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
			case Audiogram502Package.DEVICE_SOLUTIONS_TYPE__RIGHT_EAR_DEVICE:
				unsetRightEarDevice();
				return;
			case Audiogram502Package.DEVICE_SOLUTIONS_TYPE__LEFT_EAR_DEVICE:
				unsetLeftEarDevice();
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
			case Audiogram502Package.DEVICE_SOLUTIONS_TYPE__RIGHT_EAR_DEVICE:
				return isSetRightEarDevice();
			case Audiogram502Package.DEVICE_SOLUTIONS_TYPE__LEFT_EAR_DEVICE:
				return isSetLeftEarDevice();
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
		result.append(" (rightEarDevice: ");
		if (rightEarDeviceESet) result.append(rightEarDevice); else result.append("<unset>");
		result.append(", leftEarDevice: ");
		if (leftEarDeviceESet) result.append(leftEarDevice); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DeviceSolutionsTypeImpl
