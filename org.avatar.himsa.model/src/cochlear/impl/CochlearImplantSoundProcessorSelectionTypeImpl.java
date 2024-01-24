/*
 */
package cochlear.impl;

import cochlear.CochlearImplantSoundProcessorSelectionType;
import cochlear.CochlearPackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implant Sound Processor Selection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cochlear.impl.CochlearImplantSoundProcessorSelectionTypeImpl#getSoundProcessor <em>Sound Processor</em>}</li>
 *   <li>{@link cochlear.impl.CochlearImplantSoundProcessorSelectionTypeImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link cochlear.impl.CochlearImplantSoundProcessorSelectionTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CochlearImplantSoundProcessorSelectionTypeImpl extends MinimalEObjectImpl.Container implements CochlearImplantSoundProcessorSelectionType {
	/**
	 * The default value of the '{@link #getSoundProcessor() <em>Sound Processor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoundProcessor()
	 * @generated
	 * @ordered
	 */
	protected static final String SOUND_PROCESSOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoundProcessor() <em>Sound Processor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoundProcessor()
	 * @generated
	 * @ordered
	 */
	protected String soundProcessor = SOUND_PROCESSOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SERIAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected String serialNumber = SERIAL_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger VERSION_EDEFAULT = new BigInteger("500");

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected BigInteger version = VERSION_EDEFAULT;

	/**
	 * This is true if the Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean versionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CochlearImplantSoundProcessorSelectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CochlearPackage.Literals.COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSoundProcessor() {
		return soundProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoundProcessor(String newSoundProcessor) {
		String oldSoundProcessor = soundProcessor;
		soundProcessor = newSoundProcessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CochlearPackage.COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_TYPE__SOUND_PROCESSOR, oldSoundProcessor, soundProcessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSerialNumber(String newSerialNumber) {
		String oldSerialNumber = serialNumber;
		serialNumber = newSerialNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CochlearPackage.COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_TYPE__SERIAL_NUMBER, oldSerialNumber, serialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(BigInteger newVersion) {
		BigInteger oldVersion = version;
		version = newVersion;
		boolean oldVersionESet = versionESet;
		versionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CochlearPackage.COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_TYPE__VERSION, oldVersion, version, !oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVersion() {
		BigInteger oldVersion = version;
		boolean oldVersionESet = versionESet;
		version = VERSION_EDEFAULT;
		versionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CochlearPackage.COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_TYPE__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVersion() {
		return versionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CochlearPackage.COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_TYPE__SOUND_PROCESSOR:
				return getSoundProcessor();
			case CochlearPackage.COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_TYPE__SERIAL_NUMBER:
				return getSerialNumber();
			case CochlearPackage.COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_TYPE__VERSION:
				return getVersion();
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
			case CochlearPackage.COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_TYPE__SOUND_PROCESSOR:
				setSoundProcessor((String)newValue);
				return;
			case CochlearPackage.COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_TYPE__SERIAL_NUMBER:
				setSerialNumber((String)newValue);
				return;
			case CochlearPackage.COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_TYPE__VERSION:
				setVersion((BigInteger)newValue);
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
			case CochlearPackage.COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_TYPE__SOUND_PROCESSOR:
				setSoundProcessor(SOUND_PROCESSOR_EDEFAULT);
				return;
			case CochlearPackage.COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_TYPE__SERIAL_NUMBER:
				setSerialNumber(SERIAL_NUMBER_EDEFAULT);
				return;
			case CochlearPackage.COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_TYPE__VERSION:
				unsetVersion();
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
			case CochlearPackage.COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_TYPE__SOUND_PROCESSOR:
				return SOUND_PROCESSOR_EDEFAULT == null ? soundProcessor != null : !SOUND_PROCESSOR_EDEFAULT.equals(soundProcessor);
			case CochlearPackage.COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_TYPE__SERIAL_NUMBER:
				return SERIAL_NUMBER_EDEFAULT == null ? serialNumber != null : !SERIAL_NUMBER_EDEFAULT.equals(serialNumber);
			case CochlearPackage.COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION_TYPE__VERSION:
				return isSetVersion();
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
		result.append(" (soundProcessor: ");
		result.append(soundProcessor);
		result.append(", serialNumber: ");
		result.append(serialNumber);
		result.append(", version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CochlearImplantSoundProcessorSelectionTypeImpl
