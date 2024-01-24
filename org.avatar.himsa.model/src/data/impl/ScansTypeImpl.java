/*
 */
package data.impl;

import data.DataPackage;
import data.ScanAnnotations3DType;
import data.ScanPropertiesType;
import data.ScannerHardwareType;
import data.ScansType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scans Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link data.impl.ScansTypeImpl#getScannerHardware <em>Scanner Hardware</em>}</li>
 *   <li>{@link data.impl.ScansTypeImpl#getScanProperties <em>Scan Properties</em>}</li>
 *   <li>{@link data.impl.ScansTypeImpl#getScanAnnotations <em>Scan Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScansTypeImpl extends MinimalEObjectImpl.Container implements ScansType {
	/**
	 * The cached value of the '{@link #getScannerHardware() <em>Scanner Hardware</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScannerHardware()
	 * @generated
	 * @ordered
	 */
	protected ScannerHardwareType scannerHardware;

	/**
	 * The cached value of the '{@link #getScanProperties() <em>Scan Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScanProperties()
	 * @generated
	 * @ordered
	 */
	protected ScanPropertiesType scanProperties;

	/**
	 * The cached value of the '{@link #getScanAnnotations() <em>Scan Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScanAnnotations()
	 * @generated
	 * @ordered
	 */
	protected ScanAnnotations3DType scanAnnotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScansTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.SCANS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScannerHardwareType getScannerHardware() {
		return scannerHardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScannerHardware(ScannerHardwareType newScannerHardware, NotificationChain msgs) {
		ScannerHardwareType oldScannerHardware = scannerHardware;
		scannerHardware = newScannerHardware;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataPackage.SCANS_TYPE__SCANNER_HARDWARE, oldScannerHardware, newScannerHardware);
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
	public void setScannerHardware(ScannerHardwareType newScannerHardware) {
		if (newScannerHardware != scannerHardware) {
			NotificationChain msgs = null;
			if (scannerHardware != null)
				msgs = ((InternalEObject)scannerHardware).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataPackage.SCANS_TYPE__SCANNER_HARDWARE, null, msgs);
			if (newScannerHardware != null)
				msgs = ((InternalEObject)newScannerHardware).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataPackage.SCANS_TYPE__SCANNER_HARDWARE, null, msgs);
			msgs = basicSetScannerHardware(newScannerHardware, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCANS_TYPE__SCANNER_HARDWARE, newScannerHardware, newScannerHardware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScanPropertiesType getScanProperties() {
		return scanProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScanProperties(ScanPropertiesType newScanProperties, NotificationChain msgs) {
		ScanPropertiesType oldScanProperties = scanProperties;
		scanProperties = newScanProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataPackage.SCANS_TYPE__SCAN_PROPERTIES, oldScanProperties, newScanProperties);
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
	public void setScanProperties(ScanPropertiesType newScanProperties) {
		if (newScanProperties != scanProperties) {
			NotificationChain msgs = null;
			if (scanProperties != null)
				msgs = ((InternalEObject)scanProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataPackage.SCANS_TYPE__SCAN_PROPERTIES, null, msgs);
			if (newScanProperties != null)
				msgs = ((InternalEObject)newScanProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataPackage.SCANS_TYPE__SCAN_PROPERTIES, null, msgs);
			msgs = basicSetScanProperties(newScanProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCANS_TYPE__SCAN_PROPERTIES, newScanProperties, newScanProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScanAnnotations3DType getScanAnnotations() {
		return scanAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScanAnnotations(ScanAnnotations3DType newScanAnnotations, NotificationChain msgs) {
		ScanAnnotations3DType oldScanAnnotations = scanAnnotations;
		scanAnnotations = newScanAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataPackage.SCANS_TYPE__SCAN_ANNOTATIONS, oldScanAnnotations, newScanAnnotations);
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
	public void setScanAnnotations(ScanAnnotations3DType newScanAnnotations) {
		if (newScanAnnotations != scanAnnotations) {
			NotificationChain msgs = null;
			if (scanAnnotations != null)
				msgs = ((InternalEObject)scanAnnotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataPackage.SCANS_TYPE__SCAN_ANNOTATIONS, null, msgs);
			if (newScanAnnotations != null)
				msgs = ((InternalEObject)newScanAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataPackage.SCANS_TYPE__SCAN_ANNOTATIONS, null, msgs);
			msgs = basicSetScanAnnotations(newScanAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCANS_TYPE__SCAN_ANNOTATIONS, newScanAnnotations, newScanAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataPackage.SCANS_TYPE__SCANNER_HARDWARE:
				return basicSetScannerHardware(null, msgs);
			case DataPackage.SCANS_TYPE__SCAN_PROPERTIES:
				return basicSetScanProperties(null, msgs);
			case DataPackage.SCANS_TYPE__SCAN_ANNOTATIONS:
				return basicSetScanAnnotations(null, msgs);
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
			case DataPackage.SCANS_TYPE__SCANNER_HARDWARE:
				return getScannerHardware();
			case DataPackage.SCANS_TYPE__SCAN_PROPERTIES:
				return getScanProperties();
			case DataPackage.SCANS_TYPE__SCAN_ANNOTATIONS:
				return getScanAnnotations();
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
			case DataPackage.SCANS_TYPE__SCANNER_HARDWARE:
				setScannerHardware((ScannerHardwareType)newValue);
				return;
			case DataPackage.SCANS_TYPE__SCAN_PROPERTIES:
				setScanProperties((ScanPropertiesType)newValue);
				return;
			case DataPackage.SCANS_TYPE__SCAN_ANNOTATIONS:
				setScanAnnotations((ScanAnnotations3DType)newValue);
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
			case DataPackage.SCANS_TYPE__SCANNER_HARDWARE:
				setScannerHardware((ScannerHardwareType)null);
				return;
			case DataPackage.SCANS_TYPE__SCAN_PROPERTIES:
				setScanProperties((ScanPropertiesType)null);
				return;
			case DataPackage.SCANS_TYPE__SCAN_ANNOTATIONS:
				setScanAnnotations((ScanAnnotations3DType)null);
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
			case DataPackage.SCANS_TYPE__SCANNER_HARDWARE:
				return scannerHardware != null;
			case DataPackage.SCANS_TYPE__SCAN_PROPERTIES:
				return scanProperties != null;
			case DataPackage.SCANS_TYPE__SCAN_ANNOTATIONS:
				return scanAnnotations != null;
		}
		return super.eIsSet(featureID);
	}

} //ScansTypeImpl
