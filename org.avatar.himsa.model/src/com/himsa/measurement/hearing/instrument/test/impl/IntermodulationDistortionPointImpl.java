/*
 */
package com.himsa.measurement.hearing.instrument.test.impl;

import com.himsa.measurement.hearing.instrument.test.IntermodulationDistortionPoint;
import com.himsa.measurement.hearing.instrument.test.TestPackage;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intermodulation Distortion Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.impl.IntermodulationDistortionPointImpl#getFreq1 <em>Freq1</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.impl.IntermodulationDistortionPointImpl#getFreq2 <em>Freq2</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.impl.IntermodulationDistortionPointImpl#getInput1 <em>Input1</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.impl.IntermodulationDistortionPointImpl#getInput2 <em>Input2</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.impl.IntermodulationDistortionPointImpl#getOutput1 <em>Output1</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.impl.IntermodulationDistortionPointImpl#getOutput2 <em>Output2</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.impl.IntermodulationDistortionPointImpl#getOutputDiff1 <em>Output Diff1</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.impl.IntermodulationDistortionPointImpl#getOutputDiff2 <em>Output Diff2</em>}</li>
 *   <li>{@link com.himsa.measurement.hearing.instrument.test.impl.IntermodulationDistortionPointImpl#getTIDistortion <em>TI Distortion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntermodulationDistortionPointImpl extends MinimalEObjectImpl.Container implements IntermodulationDistortionPoint {
	/**
	 * The default value of the '{@link #getFreq1() <em>Freq1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreq1()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FREQ1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFreq1() <em>Freq1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreq1()
	 * @generated
	 * @ordered
	 */
	protected BigInteger freq1 = FREQ1_EDEFAULT;

	/**
	 * The default value of the '{@link #getFreq2() <em>Freq2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreq2()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FREQ2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFreq2() <em>Freq2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreq2()
	 * @generated
	 * @ordered
	 */
	protected BigInteger freq2 = FREQ2_EDEFAULT;

	/**
	 * The default value of the '{@link #getInput1() <em>Input1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput1()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal INPUT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInput1() <em>Input1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput1()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal input1 = INPUT1_EDEFAULT;

	/**
	 * The default value of the '{@link #getInput2() <em>Input2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput2()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal INPUT2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInput2() <em>Input2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput2()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal input2 = INPUT2_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutput1() <em>Output1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput1()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal OUTPUT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutput1() <em>Output1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput1()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal output1 = OUTPUT1_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutput2() <em>Output2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput2()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal OUTPUT2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutput2() <em>Output2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput2()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal output2 = OUTPUT2_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputDiff1() <em>Output Diff1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDiff1()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal OUTPUT_DIFF1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputDiff1() <em>Output Diff1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDiff1()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal outputDiff1 = OUTPUT_DIFF1_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputDiff2() <em>Output Diff2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDiff2()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal OUTPUT_DIFF2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputDiff2() <em>Output Diff2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDiff2()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal outputDiff2 = OUTPUT_DIFF2_EDEFAULT;

	/**
	 * The default value of the '{@link #getTIDistortion() <em>TI Distortion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTIDistortion()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TI_DISTORTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTIDistortion() <em>TI Distortion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTIDistortion()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal tIDistortion = TI_DISTORTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntermodulationDistortionPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.INTERMODULATION_DISTORTION_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getFreq1() {
		return freq1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFreq1(BigInteger newFreq1) {
		BigInteger oldFreq1 = freq1;
		freq1 = newFreq1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.INTERMODULATION_DISTORTION_POINT__FREQ1, oldFreq1, freq1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getFreq2() {
		return freq2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFreq2(BigInteger newFreq2) {
		BigInteger oldFreq2 = freq2;
		freq2 = newFreq2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.INTERMODULATION_DISTORTION_POINT__FREQ2, oldFreq2, freq2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getInput1() {
		return input1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInput1(BigDecimal newInput1) {
		BigDecimal oldInput1 = input1;
		input1 = newInput1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.INTERMODULATION_DISTORTION_POINT__INPUT1, oldInput1, input1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getInput2() {
		return input2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInput2(BigDecimal newInput2) {
		BigDecimal oldInput2 = input2;
		input2 = newInput2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.INTERMODULATION_DISTORTION_POINT__INPUT2, oldInput2, input2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOutput1() {
		return output1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutput1(BigDecimal newOutput1) {
		BigDecimal oldOutput1 = output1;
		output1 = newOutput1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.INTERMODULATION_DISTORTION_POINT__OUTPUT1, oldOutput1, output1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOutput2() {
		return output2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutput2(BigDecimal newOutput2) {
		BigDecimal oldOutput2 = output2;
		output2 = newOutput2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.INTERMODULATION_DISTORTION_POINT__OUTPUT2, oldOutput2, output2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOutputDiff1() {
		return outputDiff1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputDiff1(BigDecimal newOutputDiff1) {
		BigDecimal oldOutputDiff1 = outputDiff1;
		outputDiff1 = newOutputDiff1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.INTERMODULATION_DISTORTION_POINT__OUTPUT_DIFF1, oldOutputDiff1, outputDiff1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOutputDiff2() {
		return outputDiff2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputDiff2(BigDecimal newOutputDiff2) {
		BigDecimal oldOutputDiff2 = outputDiff2;
		outputDiff2 = newOutputDiff2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.INTERMODULATION_DISTORTION_POINT__OUTPUT_DIFF2, oldOutputDiff2, outputDiff2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTIDistortion() {
		return tIDistortion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTIDistortion(BigDecimal newTIDistortion) {
		BigDecimal oldTIDistortion = tIDistortion;
		tIDistortion = newTIDistortion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.INTERMODULATION_DISTORTION_POINT__TI_DISTORTION, oldTIDistortion, tIDistortion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestPackage.INTERMODULATION_DISTORTION_POINT__FREQ1:
				return getFreq1();
			case TestPackage.INTERMODULATION_DISTORTION_POINT__FREQ2:
				return getFreq2();
			case TestPackage.INTERMODULATION_DISTORTION_POINT__INPUT1:
				return getInput1();
			case TestPackage.INTERMODULATION_DISTORTION_POINT__INPUT2:
				return getInput2();
			case TestPackage.INTERMODULATION_DISTORTION_POINT__OUTPUT1:
				return getOutput1();
			case TestPackage.INTERMODULATION_DISTORTION_POINT__OUTPUT2:
				return getOutput2();
			case TestPackage.INTERMODULATION_DISTORTION_POINT__OUTPUT_DIFF1:
				return getOutputDiff1();
			case TestPackage.INTERMODULATION_DISTORTION_POINT__OUTPUT_DIFF2:
				return getOutputDiff2();
			case TestPackage.INTERMODULATION_DISTORTION_POINT__TI_DISTORTION:
				return getTIDistortion();
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
			case TestPackage.INTERMODULATION_DISTORTION_POINT__FREQ1:
				setFreq1((BigInteger)newValue);
				return;
			case TestPackage.INTERMODULATION_DISTORTION_POINT__FREQ2:
				setFreq2((BigInteger)newValue);
				return;
			case TestPackage.INTERMODULATION_DISTORTION_POINT__INPUT1:
				setInput1((BigDecimal)newValue);
				return;
			case TestPackage.INTERMODULATION_DISTORTION_POINT__INPUT2:
				setInput2((BigDecimal)newValue);
				return;
			case TestPackage.INTERMODULATION_DISTORTION_POINT__OUTPUT1:
				setOutput1((BigDecimal)newValue);
				return;
			case TestPackage.INTERMODULATION_DISTORTION_POINT__OUTPUT2:
				setOutput2((BigDecimal)newValue);
				return;
			case TestPackage.INTERMODULATION_DISTORTION_POINT__OUTPUT_DIFF1:
				setOutputDiff1((BigDecimal)newValue);
				return;
			case TestPackage.INTERMODULATION_DISTORTION_POINT__OUTPUT_DIFF2:
				setOutputDiff2((BigDecimal)newValue);
				return;
			case TestPackage.INTERMODULATION_DISTORTION_POINT__TI_DISTORTION:
				setTIDistortion((BigDecimal)newValue);
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
			case TestPackage.INTERMODULATION_DISTORTION_POINT__FREQ1:
				setFreq1(FREQ1_EDEFAULT);
				return;
			case TestPackage.INTERMODULATION_DISTORTION_POINT__FREQ2:
				setFreq2(FREQ2_EDEFAULT);
				return;
			case TestPackage.INTERMODULATION_DISTORTION_POINT__INPUT1:
				setInput1(INPUT1_EDEFAULT);
				return;
			case TestPackage.INTERMODULATION_DISTORTION_POINT__INPUT2:
				setInput2(INPUT2_EDEFAULT);
				return;
			case TestPackage.INTERMODULATION_DISTORTION_POINT__OUTPUT1:
				setOutput1(OUTPUT1_EDEFAULT);
				return;
			case TestPackage.INTERMODULATION_DISTORTION_POINT__OUTPUT2:
				setOutput2(OUTPUT2_EDEFAULT);
				return;
			case TestPackage.INTERMODULATION_DISTORTION_POINT__OUTPUT_DIFF1:
				setOutputDiff1(OUTPUT_DIFF1_EDEFAULT);
				return;
			case TestPackage.INTERMODULATION_DISTORTION_POINT__OUTPUT_DIFF2:
				setOutputDiff2(OUTPUT_DIFF2_EDEFAULT);
				return;
			case TestPackage.INTERMODULATION_DISTORTION_POINT__TI_DISTORTION:
				setTIDistortion(TI_DISTORTION_EDEFAULT);
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
			case TestPackage.INTERMODULATION_DISTORTION_POINT__FREQ1:
				return FREQ1_EDEFAULT == null ? freq1 != null : !FREQ1_EDEFAULT.equals(freq1);
			case TestPackage.INTERMODULATION_DISTORTION_POINT__FREQ2:
				return FREQ2_EDEFAULT == null ? freq2 != null : !FREQ2_EDEFAULT.equals(freq2);
			case TestPackage.INTERMODULATION_DISTORTION_POINT__INPUT1:
				return INPUT1_EDEFAULT == null ? input1 != null : !INPUT1_EDEFAULT.equals(input1);
			case TestPackage.INTERMODULATION_DISTORTION_POINT__INPUT2:
				return INPUT2_EDEFAULT == null ? input2 != null : !INPUT2_EDEFAULT.equals(input2);
			case TestPackage.INTERMODULATION_DISTORTION_POINT__OUTPUT1:
				return OUTPUT1_EDEFAULT == null ? output1 != null : !OUTPUT1_EDEFAULT.equals(output1);
			case TestPackage.INTERMODULATION_DISTORTION_POINT__OUTPUT2:
				return OUTPUT2_EDEFAULT == null ? output2 != null : !OUTPUT2_EDEFAULT.equals(output2);
			case TestPackage.INTERMODULATION_DISTORTION_POINT__OUTPUT_DIFF1:
				return OUTPUT_DIFF1_EDEFAULT == null ? outputDiff1 != null : !OUTPUT_DIFF1_EDEFAULT.equals(outputDiff1);
			case TestPackage.INTERMODULATION_DISTORTION_POINT__OUTPUT_DIFF2:
				return OUTPUT_DIFF2_EDEFAULT == null ? outputDiff2 != null : !OUTPUT_DIFF2_EDEFAULT.equals(outputDiff2);
			case TestPackage.INTERMODULATION_DISTORTION_POINT__TI_DISTORTION:
				return TI_DISTORTION_EDEFAULT == null ? tIDistortion != null : !TI_DISTORTION_EDEFAULT.equals(tIDistortion);
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
		result.append(" (freq1: ");
		result.append(freq1);
		result.append(", freq2: ");
		result.append(freq2);
		result.append(", input1: ");
		result.append(input1);
		result.append(", input2: ");
		result.append(input2);
		result.append(", output1: ");
		result.append(output1);
		result.append(", output2: ");
		result.append(output2);
		result.append(", outputDiff1: ");
		result.append(outputDiff1);
		result.append(", outputDiff2: ");
		result.append(outputDiff2);
		result.append(", tIDistortion: ");
		result.append(tIDistortion);
		result.append(')');
		return result.toString();
	}

} //IntermodulationDistortionPointImpl
