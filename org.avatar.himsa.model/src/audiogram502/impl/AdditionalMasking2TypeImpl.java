/*
 */
package audiogram502.impl;

import audiogram502.AdditionalMasking2Type;
import audiogram502.Audiogram502Package;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Additional Masking2 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link audiogram502.impl.AdditionalMasking2TypeImpl#getAdditionalStimulusLevel <em>Additional Stimulus Level</em>}</li>
 *   <li>{@link audiogram502.impl.AdditionalMasking2TypeImpl#getAdditionalMaskingLevel <em>Additional Masking Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdditionalMasking2TypeImpl extends MinimalEObjectImpl.Container implements AdditionalMasking2Type {
	/**
	 * The default value of the '{@link #getAdditionalStimulusLevel() <em>Additional Stimulus Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalStimulusLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ADDITIONAL_STIMULUS_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalStimulusLevel() <em>Additional Stimulus Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalStimulusLevel()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal additionalStimulusLevel = ADDITIONAL_STIMULUS_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalMaskingLevel() <em>Additional Masking Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalMaskingLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ADDITIONAL_MASKING_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalMaskingLevel() <em>Additional Masking Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalMaskingLevel()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal additionalMaskingLevel = ADDITIONAL_MASKING_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionalMasking2TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Audiogram502Package.Literals.ADDITIONAL_MASKING2_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAdditionalStimulusLevel() {
		return additionalStimulusLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalStimulusLevel(BigDecimal newAdditionalStimulusLevel) {
		BigDecimal oldAdditionalStimulusLevel = additionalStimulusLevel;
		additionalStimulusLevel = newAdditionalStimulusLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Audiogram502Package.ADDITIONAL_MASKING2_TYPE__ADDITIONAL_STIMULUS_LEVEL, oldAdditionalStimulusLevel, additionalStimulusLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAdditionalMaskingLevel() {
		return additionalMaskingLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalMaskingLevel(BigDecimal newAdditionalMaskingLevel) {
		BigDecimal oldAdditionalMaskingLevel = additionalMaskingLevel;
		additionalMaskingLevel = newAdditionalMaskingLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Audiogram502Package.ADDITIONAL_MASKING2_TYPE__ADDITIONAL_MASKING_LEVEL, oldAdditionalMaskingLevel, additionalMaskingLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Audiogram502Package.ADDITIONAL_MASKING2_TYPE__ADDITIONAL_STIMULUS_LEVEL:
				return getAdditionalStimulusLevel();
			case Audiogram502Package.ADDITIONAL_MASKING2_TYPE__ADDITIONAL_MASKING_LEVEL:
				return getAdditionalMaskingLevel();
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
			case Audiogram502Package.ADDITIONAL_MASKING2_TYPE__ADDITIONAL_STIMULUS_LEVEL:
				setAdditionalStimulusLevel((BigDecimal)newValue);
				return;
			case Audiogram502Package.ADDITIONAL_MASKING2_TYPE__ADDITIONAL_MASKING_LEVEL:
				setAdditionalMaskingLevel((BigDecimal)newValue);
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
			case Audiogram502Package.ADDITIONAL_MASKING2_TYPE__ADDITIONAL_STIMULUS_LEVEL:
				setAdditionalStimulusLevel(ADDITIONAL_STIMULUS_LEVEL_EDEFAULT);
				return;
			case Audiogram502Package.ADDITIONAL_MASKING2_TYPE__ADDITIONAL_MASKING_LEVEL:
				setAdditionalMaskingLevel(ADDITIONAL_MASKING_LEVEL_EDEFAULT);
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
			case Audiogram502Package.ADDITIONAL_MASKING2_TYPE__ADDITIONAL_STIMULUS_LEVEL:
				return ADDITIONAL_STIMULUS_LEVEL_EDEFAULT == null ? additionalStimulusLevel != null : !ADDITIONAL_STIMULUS_LEVEL_EDEFAULT.equals(additionalStimulusLevel);
			case Audiogram502Package.ADDITIONAL_MASKING2_TYPE__ADDITIONAL_MASKING_LEVEL:
				return ADDITIONAL_MASKING_LEVEL_EDEFAULT == null ? additionalMaskingLevel != null : !ADDITIONAL_MASKING_LEVEL_EDEFAULT.equals(additionalMaskingLevel);
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
		result.append(" (additionalStimulusLevel: ");
		result.append(additionalStimulusLevel);
		result.append(", additionalMaskingLevel: ");
		result.append(additionalMaskingLevel);
		result.append(')');
		return result.toString();
	}

} //AdditionalMasking2TypeImpl
