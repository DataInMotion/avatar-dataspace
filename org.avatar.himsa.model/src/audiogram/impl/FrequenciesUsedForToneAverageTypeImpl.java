/*
 */
package audiogram.impl;

import audiogram.AudiogramPackage;
import audiogram.FrequenciesUsedForToneAverageType;
import audiogram.ToneAverageType;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frequencies Used For Tone Average Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link audiogram.impl.FrequenciesUsedForToneAverageTypeImpl#getLeftEar1 <em>Left Ear1</em>}</li>
 *   <li>{@link audiogram.impl.FrequenciesUsedForToneAverageTypeImpl#getLeftEar2 <em>Left Ear2</em>}</li>
 *   <li>{@link audiogram.impl.FrequenciesUsedForToneAverageTypeImpl#getRightEar1 <em>Right Ear1</em>}</li>
 *   <li>{@link audiogram.impl.FrequenciesUsedForToneAverageTypeImpl#getRightEar2 <em>Right Ear2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FrequenciesUsedForToneAverageTypeImpl extends MinimalEObjectImpl.Container implements FrequenciesUsedForToneAverageType {
	/**
	 * The cached value of the '{@link #getLeftEar1() <em>Left Ear1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftEar1()
	 * @generated
	 * @ordered
	 */
	protected EList<ToneAverageType> leftEar1;

	/**
	 * The cached value of the '{@link #getLeftEar2() <em>Left Ear2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftEar2()
	 * @generated
	 * @ordered
	 */
	protected EList<ToneAverageType> leftEar2;

	/**
	 * The cached value of the '{@link #getRightEar1() <em>Right Ear1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightEar1()
	 * @generated
	 * @ordered
	 */
	protected EList<ToneAverageType> rightEar1;

	/**
	 * The cached value of the '{@link #getRightEar2() <em>Right Ear2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightEar2()
	 * @generated
	 * @ordered
	 */
	protected EList<ToneAverageType> rightEar2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrequenciesUsedForToneAverageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AudiogramPackage.Literals.FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ToneAverageType> getLeftEar1() {
		if (leftEar1 == null) {
			leftEar1 = new EDataTypeEList<ToneAverageType>(ToneAverageType.class, this, AudiogramPackage.FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__LEFT_EAR1);
		}
		return leftEar1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ToneAverageType> getLeftEar2() {
		if (leftEar2 == null) {
			leftEar2 = new EDataTypeEList<ToneAverageType>(ToneAverageType.class, this, AudiogramPackage.FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__LEFT_EAR2);
		}
		return leftEar2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ToneAverageType> getRightEar1() {
		if (rightEar1 == null) {
			rightEar1 = new EDataTypeEList<ToneAverageType>(ToneAverageType.class, this, AudiogramPackage.FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__RIGHT_EAR1);
		}
		return rightEar1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ToneAverageType> getRightEar2() {
		if (rightEar2 == null) {
			rightEar2 = new EDataTypeEList<ToneAverageType>(ToneAverageType.class, this, AudiogramPackage.FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__RIGHT_EAR2);
		}
		return rightEar2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AudiogramPackage.FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__LEFT_EAR1:
				return getLeftEar1();
			case AudiogramPackage.FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__LEFT_EAR2:
				return getLeftEar2();
			case AudiogramPackage.FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__RIGHT_EAR1:
				return getRightEar1();
			case AudiogramPackage.FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__RIGHT_EAR2:
				return getRightEar2();
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
			case AudiogramPackage.FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__LEFT_EAR1:
				getLeftEar1().clear();
				getLeftEar1().addAll((Collection<? extends ToneAverageType>)newValue);
				return;
			case AudiogramPackage.FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__LEFT_EAR2:
				getLeftEar2().clear();
				getLeftEar2().addAll((Collection<? extends ToneAverageType>)newValue);
				return;
			case AudiogramPackage.FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__RIGHT_EAR1:
				getRightEar1().clear();
				getRightEar1().addAll((Collection<? extends ToneAverageType>)newValue);
				return;
			case AudiogramPackage.FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__RIGHT_EAR2:
				getRightEar2().clear();
				getRightEar2().addAll((Collection<? extends ToneAverageType>)newValue);
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
			case AudiogramPackage.FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__LEFT_EAR1:
				getLeftEar1().clear();
				return;
			case AudiogramPackage.FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__LEFT_EAR2:
				getLeftEar2().clear();
				return;
			case AudiogramPackage.FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__RIGHT_EAR1:
				getRightEar1().clear();
				return;
			case AudiogramPackage.FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__RIGHT_EAR2:
				getRightEar2().clear();
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
			case AudiogramPackage.FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__LEFT_EAR1:
				return leftEar1 != null && !leftEar1.isEmpty();
			case AudiogramPackage.FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__LEFT_EAR2:
				return leftEar2 != null && !leftEar2.isEmpty();
			case AudiogramPackage.FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__RIGHT_EAR1:
				return rightEar1 != null && !rightEar1.isEmpty();
			case AudiogramPackage.FREQUENCIES_USED_FOR_TONE_AVERAGE_TYPE__RIGHT_EAR2:
				return rightEar2 != null && !rightEar2.isEmpty();
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
		result.append(" (leftEar1: ");
		result.append(leftEar1);
		result.append(", leftEar2: ");
		result.append(leftEar2);
		result.append(", rightEar1: ");
		result.append(rightEar1);
		result.append(", rightEar2: ");
		result.append(rightEar2);
		result.append(')');
		return result.toString();
	}

} //FrequenciesUsedForToneAverageTypeImpl
