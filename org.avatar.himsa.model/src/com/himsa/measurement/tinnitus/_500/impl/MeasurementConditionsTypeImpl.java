/*
 */
package com.himsa.measurement.tinnitus._500.impl;

import com.himsa.measurement.tinnitus._500.MeasurementConditionsType;
import com.himsa.measurement.tinnitus._500.SignalOutputType;
import com.himsa.measurement.tinnitus._500.SignalType;
import com.himsa.measurement.tinnitus._500.SignalUnitType;
import com.himsa.measurement.tinnitus._500.TransducerType;
import com.himsa.measurement.tinnitus._500._500Package;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement Conditions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.MeasurementConditionsTypeImpl#getStimulusSignalType <em>Stimulus Signal Type</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.MeasurementConditionsTypeImpl#getStimulusSignalOutput <em>Stimulus Signal Output</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.MeasurementConditionsTypeImpl#getMaskingSignalType <em>Masking Signal Type</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.MeasurementConditionsTypeImpl#getMaskingUnit <em>Masking Unit</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.MeasurementConditionsTypeImpl#getMaskingSignalOutput <em>Masking Signal Output</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.MeasurementConditionsTypeImpl#getStimulusTransducerType <em>Stimulus Transducer Type</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.MeasurementConditionsTypeImpl#getMaskingTransducerType <em>Masking Transducer Type</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.MeasurementConditionsTypeImpl#getStimulusTransducerDescription <em>Stimulus Transducer Description</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.MeasurementConditionsTypeImpl#getMaskingTransducerDescription <em>Masking Transducer Description</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.MeasurementConditionsTypeImpl#getStimulusAmplitudeModulation <em>Stimulus Amplitude Modulation</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.MeasurementConditionsTypeImpl#getMaskingAmplitudeModulation <em>Masking Amplitude Modulation</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.MeasurementConditionsTypeImpl#getStimulusBandwidthModulation <em>Stimulus Bandwidth Modulation</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.MeasurementConditionsTypeImpl#getMaskingBandwidthModulation <em>Masking Bandwidth Modulation</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.MeasurementConditionsTypeImpl#getStimulusFrequencyModulation <em>Stimulus Frequency Modulation</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.impl.MeasurementConditionsTypeImpl#getMaskingFrequencyModulation <em>Masking Frequency Modulation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementConditionsTypeImpl extends MinimalEObjectImpl.Container implements MeasurementConditionsType {
	/**
	 * The cached value of the '{@link #getStimulusSignalType() <em>Stimulus Signal Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusSignalType()
	 * @generated
	 * @ordered
	 */
	protected SignalType stimulusSignalType;

	/**
	 * The default value of the '{@link #getStimulusSignalOutput() <em>Stimulus Signal Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusSignalOutput()
	 * @generated
	 * @ordered
	 */
	protected static final SignalOutputType STIMULUS_SIGNAL_OUTPUT_EDEFAULT = SignalOutputType.UNKNOWN;

	/**
	 * The cached value of the '{@link #getStimulusSignalOutput() <em>Stimulus Signal Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusSignalOutput()
	 * @generated
	 * @ordered
	 */
	protected SignalOutputType stimulusSignalOutput = STIMULUS_SIGNAL_OUTPUT_EDEFAULT;

	/**
	 * This is true if the Stimulus Signal Output attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stimulusSignalOutputESet;

	/**
	 * The cached value of the '{@link #getMaskingSignalType() <em>Masking Signal Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingSignalType()
	 * @generated
	 * @ordered
	 */
	protected SignalType maskingSignalType;

	/**
	 * The default value of the '{@link #getMaskingUnit() <em>Masking Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingUnit()
	 * @generated
	 * @ordered
	 */
	protected static final SignalUnitType MASKING_UNIT_EDEFAULT = SignalUnitType.HL;

	/**
	 * The cached value of the '{@link #getMaskingUnit() <em>Masking Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingUnit()
	 * @generated
	 * @ordered
	 */
	protected SignalUnitType maskingUnit = MASKING_UNIT_EDEFAULT;

	/**
	 * This is true if the Masking Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maskingUnitESet;

	/**
	 * The default value of the '{@link #getMaskingSignalOutput() <em>Masking Signal Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingSignalOutput()
	 * @generated
	 * @ordered
	 */
	protected static final SignalOutputType MASKING_SIGNAL_OUTPUT_EDEFAULT = SignalOutputType.UNKNOWN;

	/**
	 * The cached value of the '{@link #getMaskingSignalOutput() <em>Masking Signal Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingSignalOutput()
	 * @generated
	 * @ordered
	 */
	protected SignalOutputType maskingSignalOutput = MASKING_SIGNAL_OUTPUT_EDEFAULT;

	/**
	 * This is true if the Masking Signal Output attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maskingSignalOutputESet;

	/**
	 * The default value of the '{@link #getStimulusTransducerType() <em>Stimulus Transducer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusTransducerType()
	 * @generated
	 * @ordered
	 */
	protected static final TransducerType STIMULUS_TRANSDUCER_TYPE_EDEFAULT = TransducerType.NO_TRANSDUCER;

	/**
	 * The cached value of the '{@link #getStimulusTransducerType() <em>Stimulus Transducer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusTransducerType()
	 * @generated
	 * @ordered
	 */
	protected TransducerType stimulusTransducerType = STIMULUS_TRANSDUCER_TYPE_EDEFAULT;

	/**
	 * This is true if the Stimulus Transducer Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stimulusTransducerTypeESet;

	/**
	 * The default value of the '{@link #getMaskingTransducerType() <em>Masking Transducer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingTransducerType()
	 * @generated
	 * @ordered
	 */
	protected static final TransducerType MASKING_TRANSDUCER_TYPE_EDEFAULT = TransducerType.NO_TRANSDUCER;

	/**
	 * The cached value of the '{@link #getMaskingTransducerType() <em>Masking Transducer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingTransducerType()
	 * @generated
	 * @ordered
	 */
	protected TransducerType maskingTransducerType = MASKING_TRANSDUCER_TYPE_EDEFAULT;

	/**
	 * This is true if the Masking Transducer Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maskingTransducerTypeESet;

	/**
	 * The default value of the '{@link #getStimulusTransducerDescription() <em>Stimulus Transducer Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusTransducerDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String STIMULUS_TRANSDUCER_DESCRIPTION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getStimulusTransducerDescription() <em>Stimulus Transducer Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusTransducerDescription()
	 * @generated
	 * @ordered
	 */
	protected String stimulusTransducerDescription = STIMULUS_TRANSDUCER_DESCRIPTION_EDEFAULT;

	/**
	 * This is true if the Stimulus Transducer Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stimulusTransducerDescriptionESet;

	/**
	 * The default value of the '{@link #getMaskingTransducerDescription() <em>Masking Transducer Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingTransducerDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String MASKING_TRANSDUCER_DESCRIPTION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getMaskingTransducerDescription() <em>Masking Transducer Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingTransducerDescription()
	 * @generated
	 * @ordered
	 */
	protected String maskingTransducerDescription = MASKING_TRANSDUCER_DESCRIPTION_EDEFAULT;

	/**
	 * This is true if the Masking Transducer Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maskingTransducerDescriptionESet;

	/**
	 * The default value of the '{@link #getStimulusAmplitudeModulation() <em>Stimulus Amplitude Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusAmplitudeModulation()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal STIMULUS_AMPLITUDE_MODULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStimulusAmplitudeModulation() <em>Stimulus Amplitude Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusAmplitudeModulation()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal stimulusAmplitudeModulation = STIMULUS_AMPLITUDE_MODULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaskingAmplitudeModulation() <em>Masking Amplitude Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingAmplitudeModulation()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MASKING_AMPLITUDE_MODULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaskingAmplitudeModulation() <em>Masking Amplitude Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingAmplitudeModulation()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal maskingAmplitudeModulation = MASKING_AMPLITUDE_MODULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStimulusBandwidthModulation() <em>Stimulus Bandwidth Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusBandwidthModulation()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal STIMULUS_BANDWIDTH_MODULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStimulusBandwidthModulation() <em>Stimulus Bandwidth Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusBandwidthModulation()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal stimulusBandwidthModulation = STIMULUS_BANDWIDTH_MODULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaskingBandwidthModulation() <em>Masking Bandwidth Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingBandwidthModulation()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MASKING_BANDWIDTH_MODULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaskingBandwidthModulation() <em>Masking Bandwidth Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingBandwidthModulation()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal maskingBandwidthModulation = MASKING_BANDWIDTH_MODULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStimulusFrequencyModulation() <em>Stimulus Frequency Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusFrequencyModulation()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal STIMULUS_FREQUENCY_MODULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStimulusFrequencyModulation() <em>Stimulus Frequency Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusFrequencyModulation()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal stimulusFrequencyModulation = STIMULUS_FREQUENCY_MODULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaskingFrequencyModulation() <em>Masking Frequency Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingFrequencyModulation()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MASKING_FREQUENCY_MODULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaskingFrequencyModulation() <em>Masking Frequency Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskingFrequencyModulation()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal maskingFrequencyModulation = MASKING_FREQUENCY_MODULATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementConditionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _500Package.Literals.MEASUREMENT_CONDITIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignalType getStimulusSignalType() {
		return stimulusSignalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStimulusSignalType(SignalType newStimulusSignalType, NotificationChain msgs) {
		SignalType oldStimulusSignalType = stimulusSignalType;
		stimulusSignalType = newStimulusSignalType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_TYPE, oldStimulusSignalType, newStimulusSignalType);
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
	public void setStimulusSignalType(SignalType newStimulusSignalType) {
		if (newStimulusSignalType != stimulusSignalType) {
			NotificationChain msgs = null;
			if (stimulusSignalType != null)
				msgs = ((InternalEObject)stimulusSignalType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_TYPE, null, msgs);
			if (newStimulusSignalType != null)
				msgs = ((InternalEObject)newStimulusSignalType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_TYPE, null, msgs);
			msgs = basicSetStimulusSignalType(newStimulusSignalType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_TYPE, newStimulusSignalType, newStimulusSignalType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignalOutputType getStimulusSignalOutput() {
		return stimulusSignalOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulusSignalOutput(SignalOutputType newStimulusSignalOutput) {
		SignalOutputType oldStimulusSignalOutput = stimulusSignalOutput;
		stimulusSignalOutput = newStimulusSignalOutput == null ? STIMULUS_SIGNAL_OUTPUT_EDEFAULT : newStimulusSignalOutput;
		boolean oldStimulusSignalOutputESet = stimulusSignalOutputESet;
		stimulusSignalOutputESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_OUTPUT, oldStimulusSignalOutput, stimulusSignalOutput, !oldStimulusSignalOutputESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStimulusSignalOutput() {
		SignalOutputType oldStimulusSignalOutput = stimulusSignalOutput;
		boolean oldStimulusSignalOutputESet = stimulusSignalOutputESet;
		stimulusSignalOutput = STIMULUS_SIGNAL_OUTPUT_EDEFAULT;
		stimulusSignalOutputESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_OUTPUT, oldStimulusSignalOutput, STIMULUS_SIGNAL_OUTPUT_EDEFAULT, oldStimulusSignalOutputESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStimulusSignalOutput() {
		return stimulusSignalOutputESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignalType getMaskingSignalType() {
		return maskingSignalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaskingSignalType(SignalType newMaskingSignalType, NotificationChain msgs) {
		SignalType oldMaskingSignalType = maskingSignalType;
		maskingSignalType = newMaskingSignalType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_TYPE, oldMaskingSignalType, newMaskingSignalType);
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
	public void setMaskingSignalType(SignalType newMaskingSignalType) {
		if (newMaskingSignalType != maskingSignalType) {
			NotificationChain msgs = null;
			if (maskingSignalType != null)
				msgs = ((InternalEObject)maskingSignalType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_TYPE, null, msgs);
			if (newMaskingSignalType != null)
				msgs = ((InternalEObject)newMaskingSignalType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_TYPE, null, msgs);
			msgs = basicSetMaskingSignalType(newMaskingSignalType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_TYPE, newMaskingSignalType, newMaskingSignalType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignalUnitType getMaskingUnit() {
		return maskingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaskingUnit(SignalUnitType newMaskingUnit) {
		SignalUnitType oldMaskingUnit = maskingUnit;
		maskingUnit = newMaskingUnit == null ? MASKING_UNIT_EDEFAULT : newMaskingUnit;
		boolean oldMaskingUnitESet = maskingUnitESet;
		maskingUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_UNIT, oldMaskingUnit, maskingUnit, !oldMaskingUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaskingUnit() {
		SignalUnitType oldMaskingUnit = maskingUnit;
		boolean oldMaskingUnitESet = maskingUnitESet;
		maskingUnit = MASKING_UNIT_EDEFAULT;
		maskingUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_UNIT, oldMaskingUnit, MASKING_UNIT_EDEFAULT, oldMaskingUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaskingUnit() {
		return maskingUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignalOutputType getMaskingSignalOutput() {
		return maskingSignalOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaskingSignalOutput(SignalOutputType newMaskingSignalOutput) {
		SignalOutputType oldMaskingSignalOutput = maskingSignalOutput;
		maskingSignalOutput = newMaskingSignalOutput == null ? MASKING_SIGNAL_OUTPUT_EDEFAULT : newMaskingSignalOutput;
		boolean oldMaskingSignalOutputESet = maskingSignalOutputESet;
		maskingSignalOutputESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_OUTPUT, oldMaskingSignalOutput, maskingSignalOutput, !oldMaskingSignalOutputESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaskingSignalOutput() {
		SignalOutputType oldMaskingSignalOutput = maskingSignalOutput;
		boolean oldMaskingSignalOutputESet = maskingSignalOutputESet;
		maskingSignalOutput = MASKING_SIGNAL_OUTPUT_EDEFAULT;
		maskingSignalOutputESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_OUTPUT, oldMaskingSignalOutput, MASKING_SIGNAL_OUTPUT_EDEFAULT, oldMaskingSignalOutputESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaskingSignalOutput() {
		return maskingSignalOutputESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransducerType getStimulusTransducerType() {
		return stimulusTransducerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulusTransducerType(TransducerType newStimulusTransducerType) {
		TransducerType oldStimulusTransducerType = stimulusTransducerType;
		stimulusTransducerType = newStimulusTransducerType == null ? STIMULUS_TRANSDUCER_TYPE_EDEFAULT : newStimulusTransducerType;
		boolean oldStimulusTransducerTypeESet = stimulusTransducerTypeESet;
		stimulusTransducerTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_TYPE, oldStimulusTransducerType, stimulusTransducerType, !oldStimulusTransducerTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStimulusTransducerType() {
		TransducerType oldStimulusTransducerType = stimulusTransducerType;
		boolean oldStimulusTransducerTypeESet = stimulusTransducerTypeESet;
		stimulusTransducerType = STIMULUS_TRANSDUCER_TYPE_EDEFAULT;
		stimulusTransducerTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_TYPE, oldStimulusTransducerType, STIMULUS_TRANSDUCER_TYPE_EDEFAULT, oldStimulusTransducerTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStimulusTransducerType() {
		return stimulusTransducerTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransducerType getMaskingTransducerType() {
		return maskingTransducerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaskingTransducerType(TransducerType newMaskingTransducerType) {
		TransducerType oldMaskingTransducerType = maskingTransducerType;
		maskingTransducerType = newMaskingTransducerType == null ? MASKING_TRANSDUCER_TYPE_EDEFAULT : newMaskingTransducerType;
		boolean oldMaskingTransducerTypeESet = maskingTransducerTypeESet;
		maskingTransducerTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_TYPE, oldMaskingTransducerType, maskingTransducerType, !oldMaskingTransducerTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaskingTransducerType() {
		TransducerType oldMaskingTransducerType = maskingTransducerType;
		boolean oldMaskingTransducerTypeESet = maskingTransducerTypeESet;
		maskingTransducerType = MASKING_TRANSDUCER_TYPE_EDEFAULT;
		maskingTransducerTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_TYPE, oldMaskingTransducerType, MASKING_TRANSDUCER_TYPE_EDEFAULT, oldMaskingTransducerTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaskingTransducerType() {
		return maskingTransducerTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStimulusTransducerDescription() {
		return stimulusTransducerDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulusTransducerDescription(String newStimulusTransducerDescription) {
		String oldStimulusTransducerDescription = stimulusTransducerDescription;
		stimulusTransducerDescription = newStimulusTransducerDescription;
		boolean oldStimulusTransducerDescriptionESet = stimulusTransducerDescriptionESet;
		stimulusTransducerDescriptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_DESCRIPTION, oldStimulusTransducerDescription, stimulusTransducerDescription, !oldStimulusTransducerDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStimulusTransducerDescription() {
		String oldStimulusTransducerDescription = stimulusTransducerDescription;
		boolean oldStimulusTransducerDescriptionESet = stimulusTransducerDescriptionESet;
		stimulusTransducerDescription = STIMULUS_TRANSDUCER_DESCRIPTION_EDEFAULT;
		stimulusTransducerDescriptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_DESCRIPTION, oldStimulusTransducerDescription, STIMULUS_TRANSDUCER_DESCRIPTION_EDEFAULT, oldStimulusTransducerDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStimulusTransducerDescription() {
		return stimulusTransducerDescriptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaskingTransducerDescription() {
		return maskingTransducerDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaskingTransducerDescription(String newMaskingTransducerDescription) {
		String oldMaskingTransducerDescription = maskingTransducerDescription;
		maskingTransducerDescription = newMaskingTransducerDescription;
		boolean oldMaskingTransducerDescriptionESet = maskingTransducerDescriptionESet;
		maskingTransducerDescriptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_DESCRIPTION, oldMaskingTransducerDescription, maskingTransducerDescription, !oldMaskingTransducerDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaskingTransducerDescription() {
		String oldMaskingTransducerDescription = maskingTransducerDescription;
		boolean oldMaskingTransducerDescriptionESet = maskingTransducerDescriptionESet;
		maskingTransducerDescription = MASKING_TRANSDUCER_DESCRIPTION_EDEFAULT;
		maskingTransducerDescriptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_DESCRIPTION, oldMaskingTransducerDescription, MASKING_TRANSDUCER_DESCRIPTION_EDEFAULT, oldMaskingTransducerDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaskingTransducerDescription() {
		return maskingTransducerDescriptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getStimulusAmplitudeModulation() {
		return stimulusAmplitudeModulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulusAmplitudeModulation(BigDecimal newStimulusAmplitudeModulation) {
		BigDecimal oldStimulusAmplitudeModulation = stimulusAmplitudeModulation;
		stimulusAmplitudeModulation = newStimulusAmplitudeModulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_AMPLITUDE_MODULATION, oldStimulusAmplitudeModulation, stimulusAmplitudeModulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMaskingAmplitudeModulation() {
		return maskingAmplitudeModulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaskingAmplitudeModulation(BigDecimal newMaskingAmplitudeModulation) {
		BigDecimal oldMaskingAmplitudeModulation = maskingAmplitudeModulation;
		maskingAmplitudeModulation = newMaskingAmplitudeModulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_AMPLITUDE_MODULATION, oldMaskingAmplitudeModulation, maskingAmplitudeModulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getStimulusBandwidthModulation() {
		return stimulusBandwidthModulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulusBandwidthModulation(BigDecimal newStimulusBandwidthModulation) {
		BigDecimal oldStimulusBandwidthModulation = stimulusBandwidthModulation;
		stimulusBandwidthModulation = newStimulusBandwidthModulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_BANDWIDTH_MODULATION, oldStimulusBandwidthModulation, stimulusBandwidthModulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMaskingBandwidthModulation() {
		return maskingBandwidthModulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaskingBandwidthModulation(BigDecimal newMaskingBandwidthModulation) {
		BigDecimal oldMaskingBandwidthModulation = maskingBandwidthModulation;
		maskingBandwidthModulation = newMaskingBandwidthModulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_BANDWIDTH_MODULATION, oldMaskingBandwidthModulation, maskingBandwidthModulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getStimulusFrequencyModulation() {
		return stimulusFrequencyModulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulusFrequencyModulation(BigDecimal newStimulusFrequencyModulation) {
		BigDecimal oldStimulusFrequencyModulation = stimulusFrequencyModulation;
		stimulusFrequencyModulation = newStimulusFrequencyModulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_FREQUENCY_MODULATION, oldStimulusFrequencyModulation, stimulusFrequencyModulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMaskingFrequencyModulation() {
		return maskingFrequencyModulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaskingFrequencyModulation(BigDecimal newMaskingFrequencyModulation) {
		BigDecimal oldMaskingFrequencyModulation = maskingFrequencyModulation;
		maskingFrequencyModulation = newMaskingFrequencyModulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_FREQUENCY_MODULATION, oldMaskingFrequencyModulation, maskingFrequencyModulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_TYPE:
				return basicSetStimulusSignalType(null, msgs);
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_TYPE:
				return basicSetMaskingSignalType(null, msgs);
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
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_TYPE:
				return getStimulusSignalType();
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_OUTPUT:
				return getStimulusSignalOutput();
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_TYPE:
				return getMaskingSignalType();
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_UNIT:
				return getMaskingUnit();
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_OUTPUT:
				return getMaskingSignalOutput();
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_TYPE:
				return getStimulusTransducerType();
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_TYPE:
				return getMaskingTransducerType();
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_DESCRIPTION:
				return getStimulusTransducerDescription();
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_DESCRIPTION:
				return getMaskingTransducerDescription();
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_AMPLITUDE_MODULATION:
				return getStimulusAmplitudeModulation();
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_AMPLITUDE_MODULATION:
				return getMaskingAmplitudeModulation();
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_BANDWIDTH_MODULATION:
				return getStimulusBandwidthModulation();
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_BANDWIDTH_MODULATION:
				return getMaskingBandwidthModulation();
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_FREQUENCY_MODULATION:
				return getStimulusFrequencyModulation();
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_FREQUENCY_MODULATION:
				return getMaskingFrequencyModulation();
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
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_TYPE:
				setStimulusSignalType((SignalType)newValue);
				return;
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_OUTPUT:
				setStimulusSignalOutput((SignalOutputType)newValue);
				return;
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_TYPE:
				setMaskingSignalType((SignalType)newValue);
				return;
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_UNIT:
				setMaskingUnit((SignalUnitType)newValue);
				return;
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_OUTPUT:
				setMaskingSignalOutput((SignalOutputType)newValue);
				return;
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_TYPE:
				setStimulusTransducerType((TransducerType)newValue);
				return;
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_TYPE:
				setMaskingTransducerType((TransducerType)newValue);
				return;
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_DESCRIPTION:
				setStimulusTransducerDescription((String)newValue);
				return;
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_DESCRIPTION:
				setMaskingTransducerDescription((String)newValue);
				return;
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_AMPLITUDE_MODULATION:
				setStimulusAmplitudeModulation((BigDecimal)newValue);
				return;
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_AMPLITUDE_MODULATION:
				setMaskingAmplitudeModulation((BigDecimal)newValue);
				return;
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_BANDWIDTH_MODULATION:
				setStimulusBandwidthModulation((BigDecimal)newValue);
				return;
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_BANDWIDTH_MODULATION:
				setMaskingBandwidthModulation((BigDecimal)newValue);
				return;
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_FREQUENCY_MODULATION:
				setStimulusFrequencyModulation((BigDecimal)newValue);
				return;
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_FREQUENCY_MODULATION:
				setMaskingFrequencyModulation((BigDecimal)newValue);
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
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_TYPE:
				setStimulusSignalType((SignalType)null);
				return;
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_OUTPUT:
				unsetStimulusSignalOutput();
				return;
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_TYPE:
				setMaskingSignalType((SignalType)null);
				return;
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_UNIT:
				unsetMaskingUnit();
				return;
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_OUTPUT:
				unsetMaskingSignalOutput();
				return;
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_TYPE:
				unsetStimulusTransducerType();
				return;
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_TYPE:
				unsetMaskingTransducerType();
				return;
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_DESCRIPTION:
				unsetStimulusTransducerDescription();
				return;
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_DESCRIPTION:
				unsetMaskingTransducerDescription();
				return;
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_AMPLITUDE_MODULATION:
				setStimulusAmplitudeModulation(STIMULUS_AMPLITUDE_MODULATION_EDEFAULT);
				return;
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_AMPLITUDE_MODULATION:
				setMaskingAmplitudeModulation(MASKING_AMPLITUDE_MODULATION_EDEFAULT);
				return;
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_BANDWIDTH_MODULATION:
				setStimulusBandwidthModulation(STIMULUS_BANDWIDTH_MODULATION_EDEFAULT);
				return;
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_BANDWIDTH_MODULATION:
				setMaskingBandwidthModulation(MASKING_BANDWIDTH_MODULATION_EDEFAULT);
				return;
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_FREQUENCY_MODULATION:
				setStimulusFrequencyModulation(STIMULUS_FREQUENCY_MODULATION_EDEFAULT);
				return;
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_FREQUENCY_MODULATION:
				setMaskingFrequencyModulation(MASKING_FREQUENCY_MODULATION_EDEFAULT);
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
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_TYPE:
				return stimulusSignalType != null;
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_SIGNAL_OUTPUT:
				return isSetStimulusSignalOutput();
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_TYPE:
				return maskingSignalType != null;
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_UNIT:
				return isSetMaskingUnit();
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_SIGNAL_OUTPUT:
				return isSetMaskingSignalOutput();
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_TYPE:
				return isSetStimulusTransducerType();
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_TYPE:
				return isSetMaskingTransducerType();
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_TRANSDUCER_DESCRIPTION:
				return isSetStimulusTransducerDescription();
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_TRANSDUCER_DESCRIPTION:
				return isSetMaskingTransducerDescription();
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_AMPLITUDE_MODULATION:
				return STIMULUS_AMPLITUDE_MODULATION_EDEFAULT == null ? stimulusAmplitudeModulation != null : !STIMULUS_AMPLITUDE_MODULATION_EDEFAULT.equals(stimulusAmplitudeModulation);
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_AMPLITUDE_MODULATION:
				return MASKING_AMPLITUDE_MODULATION_EDEFAULT == null ? maskingAmplitudeModulation != null : !MASKING_AMPLITUDE_MODULATION_EDEFAULT.equals(maskingAmplitudeModulation);
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_BANDWIDTH_MODULATION:
				return STIMULUS_BANDWIDTH_MODULATION_EDEFAULT == null ? stimulusBandwidthModulation != null : !STIMULUS_BANDWIDTH_MODULATION_EDEFAULT.equals(stimulusBandwidthModulation);
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_BANDWIDTH_MODULATION:
				return MASKING_BANDWIDTH_MODULATION_EDEFAULT == null ? maskingBandwidthModulation != null : !MASKING_BANDWIDTH_MODULATION_EDEFAULT.equals(maskingBandwidthModulation);
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__STIMULUS_FREQUENCY_MODULATION:
				return STIMULUS_FREQUENCY_MODULATION_EDEFAULT == null ? stimulusFrequencyModulation != null : !STIMULUS_FREQUENCY_MODULATION_EDEFAULT.equals(stimulusFrequencyModulation);
			case _500Package.MEASUREMENT_CONDITIONS_TYPE__MASKING_FREQUENCY_MODULATION:
				return MASKING_FREQUENCY_MODULATION_EDEFAULT == null ? maskingFrequencyModulation != null : !MASKING_FREQUENCY_MODULATION_EDEFAULT.equals(maskingFrequencyModulation);
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
		result.append(" (stimulusSignalOutput: ");
		if (stimulusSignalOutputESet) result.append(stimulusSignalOutput); else result.append("<unset>");
		result.append(", maskingUnit: ");
		if (maskingUnitESet) result.append(maskingUnit); else result.append("<unset>");
		result.append(", maskingSignalOutput: ");
		if (maskingSignalOutputESet) result.append(maskingSignalOutput); else result.append("<unset>");
		result.append(", stimulusTransducerType: ");
		if (stimulusTransducerTypeESet) result.append(stimulusTransducerType); else result.append("<unset>");
		result.append(", maskingTransducerType: ");
		if (maskingTransducerTypeESet) result.append(maskingTransducerType); else result.append("<unset>");
		result.append(", stimulusTransducerDescription: ");
		if (stimulusTransducerDescriptionESet) result.append(stimulusTransducerDescription); else result.append("<unset>");
		result.append(", maskingTransducerDescription: ");
		if (maskingTransducerDescriptionESet) result.append(maskingTransducerDescription); else result.append("<unset>");
		result.append(", stimulusAmplitudeModulation: ");
		result.append(stimulusAmplitudeModulation);
		result.append(", maskingAmplitudeModulation: ");
		result.append(maskingAmplitudeModulation);
		result.append(", stimulusBandwidthModulation: ");
		result.append(stimulusBandwidthModulation);
		result.append(", maskingBandwidthModulation: ");
		result.append(maskingBandwidthModulation);
		result.append(", stimulusFrequencyModulation: ");
		result.append(stimulusFrequencyModulation);
		result.append(", maskingFrequencyModulation: ");
		result.append(maskingFrequencyModulation);
		result.append(')');
		return result.toString();
	}

} //MeasurementConditionsTypeImpl
