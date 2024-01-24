/*
 */
package audiogram.impl;

import audiogram.AudiogramPackage;
import audiogram.DifferenceLimenIntensityPointType;
import audiogram.PointStatusType;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Difference Limen Intensity Point Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link audiogram.impl.DifferenceLimenIntensityPointTypeImpl#getStimulusFrequency <em>Stimulus Frequency</em>}</li>
 *   <li>{@link audiogram.impl.DifferenceLimenIntensityPointTypeImpl#getStimulusLevel <em>Stimulus Level</em>}</li>
 *   <li>{@link audiogram.impl.DifferenceLimenIntensityPointTypeImpl#getMaskingFrequency <em>Masking Frequency</em>}</li>
 *   <li>{@link audiogram.impl.DifferenceLimenIntensityPointTypeImpl#getMaskingLevel <em>Masking Level</em>}</li>
 *   <li>{@link audiogram.impl.DifferenceLimenIntensityPointTypeImpl#getModulationSize <em>Modulation Size</em>}</li>
 *   <li>{@link audiogram.impl.DifferenceLimenIntensityPointTypeImpl#getDifferenceLimenIntensityPointStatus <em>Difference Limen Intensity Point Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DifferenceLimenIntensityPointTypeImpl extends MinimalEObjectImpl.Container implements DifferenceLimenIntensityPointType {
	/**
	 * The default value of the '{@link #getStimulusFrequency() <em>Stimulus Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger STIMULUS_FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStimulusFrequency() <em>Stimulus Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusFrequency()
	 * @generated
	 * @ordered
	 */
	protected BigInteger stimulusFrequency = STIMULUS_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStimulusLevel() <em>Stimulus Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal STIMULUS_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStimulusLevel() <em>Stimulus Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusLevel()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal stimulusLevel = STIMULUS_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaskingFrequency() <em>Masking Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MASKING_FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaskingFrequency() <em>Masking Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingFrequency()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maskingFrequency = MASKING_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaskingLevel() <em>Masking Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MASKING_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaskingLevel() <em>Masking Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingLevel()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal maskingLevel = MASKING_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getModulationSize() <em>Modulation Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulationSize()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MODULATION_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModulationSize() <em>Modulation Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulationSize()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal modulationSize = MODULATION_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDifferenceLimenIntensityPointStatus() <em>Difference Limen Intensity Point Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifferenceLimenIntensityPointStatus()
	 * @generated
	 * @ordered
	 */
	protected static final PointStatusType DIFFERENCE_LIMEN_INTENSITY_POINT_STATUS_EDEFAULT = PointStatusType.UNKNOWN;

	/**
	 * The cached value of the '{@link #getDifferenceLimenIntensityPointStatus() <em>Difference Limen Intensity Point Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifferenceLimenIntensityPointStatus()
	 * @generated
	 * @ordered
	 */
	protected PointStatusType differenceLimenIntensityPointStatus = DIFFERENCE_LIMEN_INTENSITY_POINT_STATUS_EDEFAULT;

	/**
	 * This is true if the Difference Limen Intensity Point Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean differenceLimenIntensityPointStatusESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DifferenceLimenIntensityPointTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AudiogramPackage.Literals.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getStimulusFrequency() {
		return stimulusFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulusFrequency(BigInteger newStimulusFrequency) {
		BigInteger oldStimulusFrequency = stimulusFrequency;
		stimulusFrequency = newStimulusFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__STIMULUS_FREQUENCY, oldStimulusFrequency, stimulusFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getStimulusLevel() {
		return stimulusLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulusLevel(BigDecimal newStimulusLevel) {
		BigDecimal oldStimulusLevel = stimulusLevel;
		stimulusLevel = newStimulusLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__STIMULUS_LEVEL, oldStimulusLevel, stimulusLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getMaskingFrequency() {
		return maskingFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaskingFrequency(BigInteger newMaskingFrequency) {
		BigInteger oldMaskingFrequency = maskingFrequency;
		maskingFrequency = newMaskingFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__MASKING_FREQUENCY, oldMaskingFrequency, maskingFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMaskingLevel() {
		return maskingLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaskingLevel(BigDecimal newMaskingLevel) {
		BigDecimal oldMaskingLevel = maskingLevel;
		maskingLevel = newMaskingLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__MASKING_LEVEL, oldMaskingLevel, maskingLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getModulationSize() {
		return modulationSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModulationSize(BigDecimal newModulationSize) {
		BigDecimal oldModulationSize = modulationSize;
		modulationSize = newModulationSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__MODULATION_SIZE, oldModulationSize, modulationSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointStatusType getDifferenceLimenIntensityPointStatus() {
		return differenceLimenIntensityPointStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDifferenceLimenIntensityPointStatus(PointStatusType newDifferenceLimenIntensityPointStatus) {
		PointStatusType oldDifferenceLimenIntensityPointStatus = differenceLimenIntensityPointStatus;
		differenceLimenIntensityPointStatus = newDifferenceLimenIntensityPointStatus == null ? DIFFERENCE_LIMEN_INTENSITY_POINT_STATUS_EDEFAULT : newDifferenceLimenIntensityPointStatus;
		boolean oldDifferenceLimenIntensityPointStatusESet = differenceLimenIntensityPointStatusESet;
		differenceLimenIntensityPointStatusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__DIFFERENCE_LIMEN_INTENSITY_POINT_STATUS, oldDifferenceLimenIntensityPointStatus, differenceLimenIntensityPointStatus, !oldDifferenceLimenIntensityPointStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDifferenceLimenIntensityPointStatus() {
		PointStatusType oldDifferenceLimenIntensityPointStatus = differenceLimenIntensityPointStatus;
		boolean oldDifferenceLimenIntensityPointStatusESet = differenceLimenIntensityPointStatusESet;
		differenceLimenIntensityPointStatus = DIFFERENCE_LIMEN_INTENSITY_POINT_STATUS_EDEFAULT;
		differenceLimenIntensityPointStatusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__DIFFERENCE_LIMEN_INTENSITY_POINT_STATUS, oldDifferenceLimenIntensityPointStatus, DIFFERENCE_LIMEN_INTENSITY_POINT_STATUS_EDEFAULT, oldDifferenceLimenIntensityPointStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDifferenceLimenIntensityPointStatus() {
		return differenceLimenIntensityPointStatusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__STIMULUS_FREQUENCY:
				return getStimulusFrequency();
			case AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__STIMULUS_LEVEL:
				return getStimulusLevel();
			case AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__MASKING_FREQUENCY:
				return getMaskingFrequency();
			case AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__MASKING_LEVEL:
				return getMaskingLevel();
			case AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__MODULATION_SIZE:
				return getModulationSize();
			case AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__DIFFERENCE_LIMEN_INTENSITY_POINT_STATUS:
				return getDifferenceLimenIntensityPointStatus();
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
			case AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__STIMULUS_FREQUENCY:
				setStimulusFrequency((BigInteger)newValue);
				return;
			case AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__STIMULUS_LEVEL:
				setStimulusLevel((BigDecimal)newValue);
				return;
			case AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__MASKING_FREQUENCY:
				setMaskingFrequency((BigInteger)newValue);
				return;
			case AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__MASKING_LEVEL:
				setMaskingLevel((BigDecimal)newValue);
				return;
			case AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__MODULATION_SIZE:
				setModulationSize((BigDecimal)newValue);
				return;
			case AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__DIFFERENCE_LIMEN_INTENSITY_POINT_STATUS:
				setDifferenceLimenIntensityPointStatus((PointStatusType)newValue);
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
			case AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__STIMULUS_FREQUENCY:
				setStimulusFrequency(STIMULUS_FREQUENCY_EDEFAULT);
				return;
			case AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__STIMULUS_LEVEL:
				setStimulusLevel(STIMULUS_LEVEL_EDEFAULT);
				return;
			case AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__MASKING_FREQUENCY:
				setMaskingFrequency(MASKING_FREQUENCY_EDEFAULT);
				return;
			case AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__MASKING_LEVEL:
				setMaskingLevel(MASKING_LEVEL_EDEFAULT);
				return;
			case AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__MODULATION_SIZE:
				setModulationSize(MODULATION_SIZE_EDEFAULT);
				return;
			case AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__DIFFERENCE_LIMEN_INTENSITY_POINT_STATUS:
				unsetDifferenceLimenIntensityPointStatus();
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
			case AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__STIMULUS_FREQUENCY:
				return STIMULUS_FREQUENCY_EDEFAULT == null ? stimulusFrequency != null : !STIMULUS_FREQUENCY_EDEFAULT.equals(stimulusFrequency);
			case AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__STIMULUS_LEVEL:
				return STIMULUS_LEVEL_EDEFAULT == null ? stimulusLevel != null : !STIMULUS_LEVEL_EDEFAULT.equals(stimulusLevel);
			case AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__MASKING_FREQUENCY:
				return MASKING_FREQUENCY_EDEFAULT == null ? maskingFrequency != null : !MASKING_FREQUENCY_EDEFAULT.equals(maskingFrequency);
			case AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__MASKING_LEVEL:
				return MASKING_LEVEL_EDEFAULT == null ? maskingLevel != null : !MASKING_LEVEL_EDEFAULT.equals(maskingLevel);
			case AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__MODULATION_SIZE:
				return MODULATION_SIZE_EDEFAULT == null ? modulationSize != null : !MODULATION_SIZE_EDEFAULT.equals(modulationSize);
			case AudiogramPackage.DIFFERENCE_LIMEN_INTENSITY_POINT_TYPE__DIFFERENCE_LIMEN_INTENSITY_POINT_STATUS:
				return isSetDifferenceLimenIntensityPointStatus();
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
		result.append(" (stimulusFrequency: ");
		result.append(stimulusFrequency);
		result.append(", stimulusLevel: ");
		result.append(stimulusLevel);
		result.append(", maskingFrequency: ");
		result.append(maskingFrequency);
		result.append(", maskingLevel: ");
		result.append(maskingLevel);
		result.append(", modulationSize: ");
		result.append(modulationSize);
		result.append(", differenceLimenIntensityPointStatus: ");
		if (differenceLimenIntensityPointStatusESet) result.append(differenceLimenIntensityPointStatus); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DifferenceLimenIntensityPointTypeImpl
