/*
 */
package realear.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import realear.HarmonicDistortionPoint;
import realear.RealearPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Harmonic Distortion Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link realear.impl.HarmonicDistortionPointImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link realear.impl.HarmonicDistortionPointImpl#getInput <em>Input</em>}</li>
 *   <li>{@link realear.impl.HarmonicDistortionPointImpl#getFx1 <em>Fx1</em>}</li>
 *   <li>{@link realear.impl.HarmonicDistortionPointImpl#getFx2 <em>Fx2</em>}</li>
 *   <li>{@link realear.impl.HarmonicDistortionPointImpl#getFx3 <em>Fx3</em>}</li>
 *   <li>{@link realear.impl.HarmonicDistortionPointImpl#getThirdHD <em>Third HD</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HarmonicDistortionPointImpl extends MinimalEObjectImpl.Container implements HarmonicDistortionPoint {
	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected BigInteger frequency = FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getInput() <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal INPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal input = INPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFx1() <em>Fx1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFx1()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal FX1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFx1() <em>Fx1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFx1()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal fx1 = FX1_EDEFAULT;

	/**
	 * The default value of the '{@link #getFx2() <em>Fx2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFx2()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal FX2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFx2() <em>Fx2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFx2()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal fx2 = FX2_EDEFAULT;

	/**
	 * The default value of the '{@link #getFx3() <em>Fx3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFx3()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal FX3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFx3() <em>Fx3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFx3()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal fx3 = FX3_EDEFAULT;

	/**
	 * The default value of the '{@link #getThirdHD() <em>Third HD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThirdHD()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal THIRD_HD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThirdHD() <em>Third HD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThirdHD()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal thirdHD = THIRD_HD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HarmonicDistortionPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealearPackage.Literals.HARMONIC_DISTORTION_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrequency(BigInteger newFrequency) {
		BigInteger oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealearPackage.HARMONIC_DISTORTION_POINT__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInput(BigDecimal newInput) {
		BigDecimal oldInput = input;
		input = newInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealearPackage.HARMONIC_DISTORTION_POINT__INPUT, oldInput, input));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getFx1() {
		return fx1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFx1(BigDecimal newFx1) {
		BigDecimal oldFx1 = fx1;
		fx1 = newFx1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealearPackage.HARMONIC_DISTORTION_POINT__FX1, oldFx1, fx1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getFx2() {
		return fx2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFx2(BigDecimal newFx2) {
		BigDecimal oldFx2 = fx2;
		fx2 = newFx2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealearPackage.HARMONIC_DISTORTION_POINT__FX2, oldFx2, fx2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getFx3() {
		return fx3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFx3(BigDecimal newFx3) {
		BigDecimal oldFx3 = fx3;
		fx3 = newFx3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealearPackage.HARMONIC_DISTORTION_POINT__FX3, oldFx3, fx3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getThirdHD() {
		return thirdHD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThirdHD(BigDecimal newThirdHD) {
		BigDecimal oldThirdHD = thirdHD;
		thirdHD = newThirdHD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealearPackage.HARMONIC_DISTORTION_POINT__THIRD_HD, oldThirdHD, thirdHD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RealearPackage.HARMONIC_DISTORTION_POINT__FREQUENCY:
				return getFrequency();
			case RealearPackage.HARMONIC_DISTORTION_POINT__INPUT:
				return getInput();
			case RealearPackage.HARMONIC_DISTORTION_POINT__FX1:
				return getFx1();
			case RealearPackage.HARMONIC_DISTORTION_POINT__FX2:
				return getFx2();
			case RealearPackage.HARMONIC_DISTORTION_POINT__FX3:
				return getFx3();
			case RealearPackage.HARMONIC_DISTORTION_POINT__THIRD_HD:
				return getThirdHD();
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
			case RealearPackage.HARMONIC_DISTORTION_POINT__FREQUENCY:
				setFrequency((BigInteger)newValue);
				return;
			case RealearPackage.HARMONIC_DISTORTION_POINT__INPUT:
				setInput((BigDecimal)newValue);
				return;
			case RealearPackage.HARMONIC_DISTORTION_POINT__FX1:
				setFx1((BigDecimal)newValue);
				return;
			case RealearPackage.HARMONIC_DISTORTION_POINT__FX2:
				setFx2((BigDecimal)newValue);
				return;
			case RealearPackage.HARMONIC_DISTORTION_POINT__FX3:
				setFx3((BigDecimal)newValue);
				return;
			case RealearPackage.HARMONIC_DISTORTION_POINT__THIRD_HD:
				setThirdHD((BigDecimal)newValue);
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
			case RealearPackage.HARMONIC_DISTORTION_POINT__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
				return;
			case RealearPackage.HARMONIC_DISTORTION_POINT__INPUT:
				setInput(INPUT_EDEFAULT);
				return;
			case RealearPackage.HARMONIC_DISTORTION_POINT__FX1:
				setFx1(FX1_EDEFAULT);
				return;
			case RealearPackage.HARMONIC_DISTORTION_POINT__FX2:
				setFx2(FX2_EDEFAULT);
				return;
			case RealearPackage.HARMONIC_DISTORTION_POINT__FX3:
				setFx3(FX3_EDEFAULT);
				return;
			case RealearPackage.HARMONIC_DISTORTION_POINT__THIRD_HD:
				setThirdHD(THIRD_HD_EDEFAULT);
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
			case RealearPackage.HARMONIC_DISTORTION_POINT__FREQUENCY:
				return FREQUENCY_EDEFAULT == null ? frequency != null : !FREQUENCY_EDEFAULT.equals(frequency);
			case RealearPackage.HARMONIC_DISTORTION_POINT__INPUT:
				return INPUT_EDEFAULT == null ? input != null : !INPUT_EDEFAULT.equals(input);
			case RealearPackage.HARMONIC_DISTORTION_POINT__FX1:
				return FX1_EDEFAULT == null ? fx1 != null : !FX1_EDEFAULT.equals(fx1);
			case RealearPackage.HARMONIC_DISTORTION_POINT__FX2:
				return FX2_EDEFAULT == null ? fx2 != null : !FX2_EDEFAULT.equals(fx2);
			case RealearPackage.HARMONIC_DISTORTION_POINT__FX3:
				return FX3_EDEFAULT == null ? fx3 != null : !FX3_EDEFAULT.equals(fx3);
			case RealearPackage.HARMONIC_DISTORTION_POINT__THIRD_HD:
				return THIRD_HD_EDEFAULT == null ? thirdHD != null : !THIRD_HD_EDEFAULT.equals(thirdHD);
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
		result.append(" (frequency: ");
		result.append(frequency);
		result.append(", input: ");
		result.append(input);
		result.append(", fx1: ");
		result.append(fx1);
		result.append(", fx2: ");
		result.append(fx2);
		result.append(", fx3: ");
		result.append(fx3);
		result.append(", thirdHD: ");
		result.append(thirdHD);
		result.append(')');
		return result.toString();
	}

} //HarmonicDistortionPointImpl
