/*
 */
package com.himsa.patient.export.patient.export.impl;

import com.himsa.alert.dashboard.notification._500.NotificationActionType;

import com.himsa.cochlear.implant.sound.processor.selection._500.CochlearImplantSoundProcessorSelectionType;

import com.himsa.instrument.fitting.HearingInstrumentFittingType;

import com.himsa.instrument.remote.control.RemoteControlSelectionType;

import com.himsa.instrument.selection.HearingInstrumentSelectionType;

import com.himsa.measurement.admittance._501.AcousticImmittanceAssessmentType;

import com.himsa.measurement.audiogram.HIMSAAudiometricStandardType;

import com.himsa.measurement.audiogram.metadata._500.HIMSAAudiogramMetadataStandardType;

import com.himsa.measurement.hearing.instrument.test.HIMSAHitStandardType;

import com.himsa.measurement.impedance.AcousticImpedanceCompleteMeasurementType;

import com.himsa.measurement.real.ear.HIMSARemStandardType;

import com.himsa.measurement.tinnitus._500.TinnitusMeasurementDataType;

import com.himsa.other.journal._500.HIMSAJournalStandardType;

import com.himsa.patient.export.patient.export.ExportPackage;
import com.himsa.patient.export.patient.export.PubliclyFormattedData;

import com.himsa.scan.scan.meta.data.ScanMetaDataStandardType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publicly Formatted Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.patient.export.patient.export.impl.PubliclyFormattedDataImpl#getHIMSAAudiometricStandard <em>HIMSA Audiometric Standard</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.impl.PubliclyFormattedDataImpl#getHIMSAAudiometricStandard1 <em>HIMSA Audiometric Standard1</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.impl.PubliclyFormattedDataImpl#getHearingInstrumentSelection <em>Hearing Instrument Selection</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.impl.PubliclyFormattedDataImpl#getHearingInstrumentFitting <em>Hearing Instrument Fitting</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.impl.PubliclyFormattedDataImpl#getRemoteControlSelection <em>Remote Control Selection</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.impl.PubliclyFormattedDataImpl#getHIMSARemStandard <em>HIMSA Rem Standard</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.impl.PubliclyFormattedDataImpl#getHIMSAHitStandard <em>HIMSA Hit Standard</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.impl.PubliclyFormattedDataImpl#getAcousticImpedanceCompleteMeasurement <em>Acoustic Impedance Complete Measurement</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.impl.PubliclyFormattedDataImpl#getAcousticImmittanceAssessment <em>Acoustic Immittance Assessment</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.impl.PubliclyFormattedDataImpl#getTinnitusMeasurementData <em>Tinnitus Measurement Data</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.impl.PubliclyFormattedDataImpl#getHIMSAAudiogramMetadataStandard <em>HIMSA Audiogram Metadata Standard</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.impl.PubliclyFormattedDataImpl#getCochlearImplantSoundProcessorSelection <em>Cochlear Implant Sound Processor Selection</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.impl.PubliclyFormattedDataImpl#getHIMSAJournalStandard <em>HIMSA Journal Standard</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.impl.PubliclyFormattedDataImpl#getNotificationAction <em>Notification Action</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.impl.PubliclyFormattedDataImpl#getScanMetaDataStandard <em>Scan Meta Data Standard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PubliclyFormattedDataImpl extends MinimalEObjectImpl.Container implements PubliclyFormattedData {
	/**
	 * The cached value of the '{@link #getHIMSAAudiometricStandard() <em>HIMSA Audiometric Standard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHIMSAAudiometricStandard()
	 * @generated
	 * @ordered
	 */
	protected HIMSAAudiometricStandardType hIMSAAudiometricStandard;

	/**
	 * The cached value of the '{@link #getHIMSAAudiometricStandard1() <em>HIMSA Audiometric Standard1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHIMSAAudiometricStandard1()
	 * @generated
	 * @ordered
	 */
	protected com.himsa.measurement.audiogram._502.HIMSAAudiometricStandardType hIMSAAudiometricStandard1;

	/**
	 * The cached value of the '{@link #getHearingInstrumentSelection() <em>Hearing Instrument Selection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHearingInstrumentSelection()
	 * @generated
	 * @ordered
	 */
	protected HearingInstrumentSelectionType hearingInstrumentSelection;

	/**
	 * The cached value of the '{@link #getHearingInstrumentFitting() <em>Hearing Instrument Fitting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHearingInstrumentFitting()
	 * @generated
	 * @ordered
	 */
	protected HearingInstrumentFittingType hearingInstrumentFitting;

	/**
	 * The cached value of the '{@link #getRemoteControlSelection() <em>Remote Control Selection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteControlSelection()
	 * @generated
	 * @ordered
	 */
	protected RemoteControlSelectionType remoteControlSelection;

	/**
	 * The cached value of the '{@link #getHIMSARemStandard() <em>HIMSA Rem Standard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHIMSARemStandard()
	 * @generated
	 * @ordered
	 */
	protected HIMSARemStandardType hIMSARemStandard;

	/**
	 * The cached value of the '{@link #getHIMSAHitStandard() <em>HIMSA Hit Standard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHIMSAHitStandard()
	 * @generated
	 * @ordered
	 */
	protected HIMSAHitStandardType hIMSAHitStandard;

	/**
	 * The cached value of the '{@link #getAcousticImpedanceCompleteMeasurement() <em>Acoustic Impedance Complete Measurement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcousticImpedanceCompleteMeasurement()
	 * @generated
	 * @ordered
	 */
	protected AcousticImpedanceCompleteMeasurementType acousticImpedanceCompleteMeasurement;

	/**
	 * The cached value of the '{@link #getAcousticImmittanceAssessment() <em>Acoustic Immittance Assessment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcousticImmittanceAssessment()
	 * @generated
	 * @ordered
	 */
	protected AcousticImmittanceAssessmentType acousticImmittanceAssessment;

	/**
	 * The cached value of the '{@link #getTinnitusMeasurementData() <em>Tinnitus Measurement Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTinnitusMeasurementData()
	 * @generated
	 * @ordered
	 */
	protected TinnitusMeasurementDataType tinnitusMeasurementData;

	/**
	 * The cached value of the '{@link #getHIMSAAudiogramMetadataStandard() <em>HIMSA Audiogram Metadata Standard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHIMSAAudiogramMetadataStandard()
	 * @generated
	 * @ordered
	 */
	protected HIMSAAudiogramMetadataStandardType hIMSAAudiogramMetadataStandard;

	/**
	 * The cached value of the '{@link #getCochlearImplantSoundProcessorSelection() <em>Cochlear Implant Sound Processor Selection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCochlearImplantSoundProcessorSelection()
	 * @generated
	 * @ordered
	 */
	protected CochlearImplantSoundProcessorSelectionType cochlearImplantSoundProcessorSelection;

	/**
	 * The cached value of the '{@link #getHIMSAJournalStandard() <em>HIMSA Journal Standard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHIMSAJournalStandard()
	 * @generated
	 * @ordered
	 */
	protected HIMSAJournalStandardType hIMSAJournalStandard;

	/**
	 * The cached value of the '{@link #getNotificationAction() <em>Notification Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationAction()
	 * @generated
	 * @ordered
	 */
	protected NotificationActionType notificationAction;

	/**
	 * The cached value of the '{@link #getScanMetaDataStandard() <em>Scan Meta Data Standard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScanMetaDataStandard()
	 * @generated
	 * @ordered
	 */
	protected ScanMetaDataStandardType scanMetaDataStandard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PubliclyFormattedDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExportPackage.Literals.PUBLICLY_FORMATTED_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HIMSAAudiometricStandardType getHIMSAAudiometricStandard() {
		return hIMSAAudiometricStandard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHIMSAAudiometricStandard(HIMSAAudiometricStandardType newHIMSAAudiometricStandard, NotificationChain msgs) {
		HIMSAAudiometricStandardType oldHIMSAAudiometricStandard = hIMSAAudiometricStandard;
		hIMSAAudiometricStandard = newHIMSAAudiometricStandard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOMETRIC_STANDARD, oldHIMSAAudiometricStandard, newHIMSAAudiometricStandard);
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
	public void setHIMSAAudiometricStandard(HIMSAAudiometricStandardType newHIMSAAudiometricStandard) {
		if (newHIMSAAudiometricStandard != hIMSAAudiometricStandard) {
			NotificationChain msgs = null;
			if (hIMSAAudiometricStandard != null)
				msgs = ((InternalEObject)hIMSAAudiometricStandard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOMETRIC_STANDARD, null, msgs);
			if (newHIMSAAudiometricStandard != null)
				msgs = ((InternalEObject)newHIMSAAudiometricStandard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOMETRIC_STANDARD, null, msgs);
			msgs = basicSetHIMSAAudiometricStandard(newHIMSAAudiometricStandard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOMETRIC_STANDARD, newHIMSAAudiometricStandard, newHIMSAAudiometricStandard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public com.himsa.measurement.audiogram._502.HIMSAAudiometricStandardType getHIMSAAudiometricStandard1() {
		return hIMSAAudiometricStandard1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHIMSAAudiometricStandard1(com.himsa.measurement.audiogram._502.HIMSAAudiometricStandardType newHIMSAAudiometricStandard1, NotificationChain msgs) {
		com.himsa.measurement.audiogram._502.HIMSAAudiometricStandardType oldHIMSAAudiometricStandard1 = hIMSAAudiometricStandard1;
		hIMSAAudiometricStandard1 = newHIMSAAudiometricStandard1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOMETRIC_STANDARD1, oldHIMSAAudiometricStandard1, newHIMSAAudiometricStandard1);
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
	public void setHIMSAAudiometricStandard1(com.himsa.measurement.audiogram._502.HIMSAAudiometricStandardType newHIMSAAudiometricStandard1) {
		if (newHIMSAAudiometricStandard1 != hIMSAAudiometricStandard1) {
			NotificationChain msgs = null;
			if (hIMSAAudiometricStandard1 != null)
				msgs = ((InternalEObject)hIMSAAudiometricStandard1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOMETRIC_STANDARD1, null, msgs);
			if (newHIMSAAudiometricStandard1 != null)
				msgs = ((InternalEObject)newHIMSAAudiometricStandard1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOMETRIC_STANDARD1, null, msgs);
			msgs = basicSetHIMSAAudiometricStandard1(newHIMSAAudiometricStandard1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOMETRIC_STANDARD1, newHIMSAAudiometricStandard1, newHIMSAAudiometricStandard1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HearingInstrumentSelectionType getHearingInstrumentSelection() {
		return hearingInstrumentSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHearingInstrumentSelection(HearingInstrumentSelectionType newHearingInstrumentSelection, NotificationChain msgs) {
		HearingInstrumentSelectionType oldHearingInstrumentSelection = hearingInstrumentSelection;
		hearingInstrumentSelection = newHearingInstrumentSelection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExportPackage.PUBLICLY_FORMATTED_DATA__HEARING_INSTRUMENT_SELECTION, oldHearingInstrumentSelection, newHearingInstrumentSelection);
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
	public void setHearingInstrumentSelection(HearingInstrumentSelectionType newHearingInstrumentSelection) {
		if (newHearingInstrumentSelection != hearingInstrumentSelection) {
			NotificationChain msgs = null;
			if (hearingInstrumentSelection != null)
				msgs = ((InternalEObject)hearingInstrumentSelection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PUBLICLY_FORMATTED_DATA__HEARING_INSTRUMENT_SELECTION, null, msgs);
			if (newHearingInstrumentSelection != null)
				msgs = ((InternalEObject)newHearingInstrumentSelection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PUBLICLY_FORMATTED_DATA__HEARING_INSTRUMENT_SELECTION, null, msgs);
			msgs = basicSetHearingInstrumentSelection(newHearingInstrumentSelection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExportPackage.PUBLICLY_FORMATTED_DATA__HEARING_INSTRUMENT_SELECTION, newHearingInstrumentSelection, newHearingInstrumentSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HearingInstrumentFittingType getHearingInstrumentFitting() {
		return hearingInstrumentFitting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHearingInstrumentFitting(HearingInstrumentFittingType newHearingInstrumentFitting, NotificationChain msgs) {
		HearingInstrumentFittingType oldHearingInstrumentFitting = hearingInstrumentFitting;
		hearingInstrumentFitting = newHearingInstrumentFitting;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExportPackage.PUBLICLY_FORMATTED_DATA__HEARING_INSTRUMENT_FITTING, oldHearingInstrumentFitting, newHearingInstrumentFitting);
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
	public void setHearingInstrumentFitting(HearingInstrumentFittingType newHearingInstrumentFitting) {
		if (newHearingInstrumentFitting != hearingInstrumentFitting) {
			NotificationChain msgs = null;
			if (hearingInstrumentFitting != null)
				msgs = ((InternalEObject)hearingInstrumentFitting).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PUBLICLY_FORMATTED_DATA__HEARING_INSTRUMENT_FITTING, null, msgs);
			if (newHearingInstrumentFitting != null)
				msgs = ((InternalEObject)newHearingInstrumentFitting).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PUBLICLY_FORMATTED_DATA__HEARING_INSTRUMENT_FITTING, null, msgs);
			msgs = basicSetHearingInstrumentFitting(newHearingInstrumentFitting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExportPackage.PUBLICLY_FORMATTED_DATA__HEARING_INSTRUMENT_FITTING, newHearingInstrumentFitting, newHearingInstrumentFitting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoteControlSelectionType getRemoteControlSelection() {
		return remoteControlSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoteControlSelection(RemoteControlSelectionType newRemoteControlSelection, NotificationChain msgs) {
		RemoteControlSelectionType oldRemoteControlSelection = remoteControlSelection;
		remoteControlSelection = newRemoteControlSelection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExportPackage.PUBLICLY_FORMATTED_DATA__REMOTE_CONTROL_SELECTION, oldRemoteControlSelection, newRemoteControlSelection);
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
	public void setRemoteControlSelection(RemoteControlSelectionType newRemoteControlSelection) {
		if (newRemoteControlSelection != remoteControlSelection) {
			NotificationChain msgs = null;
			if (remoteControlSelection != null)
				msgs = ((InternalEObject)remoteControlSelection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PUBLICLY_FORMATTED_DATA__REMOTE_CONTROL_SELECTION, null, msgs);
			if (newRemoteControlSelection != null)
				msgs = ((InternalEObject)newRemoteControlSelection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PUBLICLY_FORMATTED_DATA__REMOTE_CONTROL_SELECTION, null, msgs);
			msgs = basicSetRemoteControlSelection(newRemoteControlSelection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExportPackage.PUBLICLY_FORMATTED_DATA__REMOTE_CONTROL_SELECTION, newRemoteControlSelection, newRemoteControlSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HIMSARemStandardType getHIMSARemStandard() {
		return hIMSARemStandard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHIMSARemStandard(HIMSARemStandardType newHIMSARemStandard, NotificationChain msgs) {
		HIMSARemStandardType oldHIMSARemStandard = hIMSARemStandard;
		hIMSARemStandard = newHIMSARemStandard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_REM_STANDARD, oldHIMSARemStandard, newHIMSARemStandard);
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
	public void setHIMSARemStandard(HIMSARemStandardType newHIMSARemStandard) {
		if (newHIMSARemStandard != hIMSARemStandard) {
			NotificationChain msgs = null;
			if (hIMSARemStandard != null)
				msgs = ((InternalEObject)hIMSARemStandard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_REM_STANDARD, null, msgs);
			if (newHIMSARemStandard != null)
				msgs = ((InternalEObject)newHIMSARemStandard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_REM_STANDARD, null, msgs);
			msgs = basicSetHIMSARemStandard(newHIMSARemStandard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_REM_STANDARD, newHIMSARemStandard, newHIMSARemStandard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HIMSAHitStandardType getHIMSAHitStandard() {
		return hIMSAHitStandard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHIMSAHitStandard(HIMSAHitStandardType newHIMSAHitStandard, NotificationChain msgs) {
		HIMSAHitStandardType oldHIMSAHitStandard = hIMSAHitStandard;
		hIMSAHitStandard = newHIMSAHitStandard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_HIT_STANDARD, oldHIMSAHitStandard, newHIMSAHitStandard);
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
	public void setHIMSAHitStandard(HIMSAHitStandardType newHIMSAHitStandard) {
		if (newHIMSAHitStandard != hIMSAHitStandard) {
			NotificationChain msgs = null;
			if (hIMSAHitStandard != null)
				msgs = ((InternalEObject)hIMSAHitStandard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_HIT_STANDARD, null, msgs);
			if (newHIMSAHitStandard != null)
				msgs = ((InternalEObject)newHIMSAHitStandard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_HIT_STANDARD, null, msgs);
			msgs = basicSetHIMSAHitStandard(newHIMSAHitStandard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_HIT_STANDARD, newHIMSAHitStandard, newHIMSAHitStandard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcousticImpedanceCompleteMeasurementType getAcousticImpedanceCompleteMeasurement() {
		return acousticImpedanceCompleteMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcousticImpedanceCompleteMeasurement(AcousticImpedanceCompleteMeasurementType newAcousticImpedanceCompleteMeasurement, NotificationChain msgs) {
		AcousticImpedanceCompleteMeasurementType oldAcousticImpedanceCompleteMeasurement = acousticImpedanceCompleteMeasurement;
		acousticImpedanceCompleteMeasurement = newAcousticImpedanceCompleteMeasurement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExportPackage.PUBLICLY_FORMATTED_DATA__ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT, oldAcousticImpedanceCompleteMeasurement, newAcousticImpedanceCompleteMeasurement);
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
	public void setAcousticImpedanceCompleteMeasurement(AcousticImpedanceCompleteMeasurementType newAcousticImpedanceCompleteMeasurement) {
		if (newAcousticImpedanceCompleteMeasurement != acousticImpedanceCompleteMeasurement) {
			NotificationChain msgs = null;
			if (acousticImpedanceCompleteMeasurement != null)
				msgs = ((InternalEObject)acousticImpedanceCompleteMeasurement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PUBLICLY_FORMATTED_DATA__ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT, null, msgs);
			if (newAcousticImpedanceCompleteMeasurement != null)
				msgs = ((InternalEObject)newAcousticImpedanceCompleteMeasurement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PUBLICLY_FORMATTED_DATA__ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT, null, msgs);
			msgs = basicSetAcousticImpedanceCompleteMeasurement(newAcousticImpedanceCompleteMeasurement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExportPackage.PUBLICLY_FORMATTED_DATA__ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT, newAcousticImpedanceCompleteMeasurement, newAcousticImpedanceCompleteMeasurement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcousticImmittanceAssessmentType getAcousticImmittanceAssessment() {
		return acousticImmittanceAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcousticImmittanceAssessment(AcousticImmittanceAssessmentType newAcousticImmittanceAssessment, NotificationChain msgs) {
		AcousticImmittanceAssessmentType oldAcousticImmittanceAssessment = acousticImmittanceAssessment;
		acousticImmittanceAssessment = newAcousticImmittanceAssessment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExportPackage.PUBLICLY_FORMATTED_DATA__ACOUSTIC_IMMITTANCE_ASSESSMENT, oldAcousticImmittanceAssessment, newAcousticImmittanceAssessment);
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
	public void setAcousticImmittanceAssessment(AcousticImmittanceAssessmentType newAcousticImmittanceAssessment) {
		if (newAcousticImmittanceAssessment != acousticImmittanceAssessment) {
			NotificationChain msgs = null;
			if (acousticImmittanceAssessment != null)
				msgs = ((InternalEObject)acousticImmittanceAssessment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PUBLICLY_FORMATTED_DATA__ACOUSTIC_IMMITTANCE_ASSESSMENT, null, msgs);
			if (newAcousticImmittanceAssessment != null)
				msgs = ((InternalEObject)newAcousticImmittanceAssessment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PUBLICLY_FORMATTED_DATA__ACOUSTIC_IMMITTANCE_ASSESSMENT, null, msgs);
			msgs = basicSetAcousticImmittanceAssessment(newAcousticImmittanceAssessment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExportPackage.PUBLICLY_FORMATTED_DATA__ACOUSTIC_IMMITTANCE_ASSESSMENT, newAcousticImmittanceAssessment, newAcousticImmittanceAssessment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TinnitusMeasurementDataType getTinnitusMeasurementData() {
		return tinnitusMeasurementData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTinnitusMeasurementData(TinnitusMeasurementDataType newTinnitusMeasurementData, NotificationChain msgs) {
		TinnitusMeasurementDataType oldTinnitusMeasurementData = tinnitusMeasurementData;
		tinnitusMeasurementData = newTinnitusMeasurementData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExportPackage.PUBLICLY_FORMATTED_DATA__TINNITUS_MEASUREMENT_DATA, oldTinnitusMeasurementData, newTinnitusMeasurementData);
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
	public void setTinnitusMeasurementData(TinnitusMeasurementDataType newTinnitusMeasurementData) {
		if (newTinnitusMeasurementData != tinnitusMeasurementData) {
			NotificationChain msgs = null;
			if (tinnitusMeasurementData != null)
				msgs = ((InternalEObject)tinnitusMeasurementData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PUBLICLY_FORMATTED_DATA__TINNITUS_MEASUREMENT_DATA, null, msgs);
			if (newTinnitusMeasurementData != null)
				msgs = ((InternalEObject)newTinnitusMeasurementData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PUBLICLY_FORMATTED_DATA__TINNITUS_MEASUREMENT_DATA, null, msgs);
			msgs = basicSetTinnitusMeasurementData(newTinnitusMeasurementData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExportPackage.PUBLICLY_FORMATTED_DATA__TINNITUS_MEASUREMENT_DATA, newTinnitusMeasurementData, newTinnitusMeasurementData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HIMSAAudiogramMetadataStandardType getHIMSAAudiogramMetadataStandard() {
		return hIMSAAudiogramMetadataStandard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHIMSAAudiogramMetadataStandard(HIMSAAudiogramMetadataStandardType newHIMSAAudiogramMetadataStandard, NotificationChain msgs) {
		HIMSAAudiogramMetadataStandardType oldHIMSAAudiogramMetadataStandard = hIMSAAudiogramMetadataStandard;
		hIMSAAudiogramMetadataStandard = newHIMSAAudiogramMetadataStandard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOGRAM_METADATA_STANDARD, oldHIMSAAudiogramMetadataStandard, newHIMSAAudiogramMetadataStandard);
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
	public void setHIMSAAudiogramMetadataStandard(HIMSAAudiogramMetadataStandardType newHIMSAAudiogramMetadataStandard) {
		if (newHIMSAAudiogramMetadataStandard != hIMSAAudiogramMetadataStandard) {
			NotificationChain msgs = null;
			if (hIMSAAudiogramMetadataStandard != null)
				msgs = ((InternalEObject)hIMSAAudiogramMetadataStandard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOGRAM_METADATA_STANDARD, null, msgs);
			if (newHIMSAAudiogramMetadataStandard != null)
				msgs = ((InternalEObject)newHIMSAAudiogramMetadataStandard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOGRAM_METADATA_STANDARD, null, msgs);
			msgs = basicSetHIMSAAudiogramMetadataStandard(newHIMSAAudiogramMetadataStandard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOGRAM_METADATA_STANDARD, newHIMSAAudiogramMetadataStandard, newHIMSAAudiogramMetadataStandard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CochlearImplantSoundProcessorSelectionType getCochlearImplantSoundProcessorSelection() {
		return cochlearImplantSoundProcessorSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCochlearImplantSoundProcessorSelection(CochlearImplantSoundProcessorSelectionType newCochlearImplantSoundProcessorSelection, NotificationChain msgs) {
		CochlearImplantSoundProcessorSelectionType oldCochlearImplantSoundProcessorSelection = cochlearImplantSoundProcessorSelection;
		cochlearImplantSoundProcessorSelection = newCochlearImplantSoundProcessorSelection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExportPackage.PUBLICLY_FORMATTED_DATA__COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION, oldCochlearImplantSoundProcessorSelection, newCochlearImplantSoundProcessorSelection);
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
	public void setCochlearImplantSoundProcessorSelection(CochlearImplantSoundProcessorSelectionType newCochlearImplantSoundProcessorSelection) {
		if (newCochlearImplantSoundProcessorSelection != cochlearImplantSoundProcessorSelection) {
			NotificationChain msgs = null;
			if (cochlearImplantSoundProcessorSelection != null)
				msgs = ((InternalEObject)cochlearImplantSoundProcessorSelection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PUBLICLY_FORMATTED_DATA__COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION, null, msgs);
			if (newCochlearImplantSoundProcessorSelection != null)
				msgs = ((InternalEObject)newCochlearImplantSoundProcessorSelection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PUBLICLY_FORMATTED_DATA__COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION, null, msgs);
			msgs = basicSetCochlearImplantSoundProcessorSelection(newCochlearImplantSoundProcessorSelection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExportPackage.PUBLICLY_FORMATTED_DATA__COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION, newCochlearImplantSoundProcessorSelection, newCochlearImplantSoundProcessorSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HIMSAJournalStandardType getHIMSAJournalStandard() {
		return hIMSAJournalStandard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHIMSAJournalStandard(HIMSAJournalStandardType newHIMSAJournalStandard, NotificationChain msgs) {
		HIMSAJournalStandardType oldHIMSAJournalStandard = hIMSAJournalStandard;
		hIMSAJournalStandard = newHIMSAJournalStandard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_JOURNAL_STANDARD, oldHIMSAJournalStandard, newHIMSAJournalStandard);
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
	public void setHIMSAJournalStandard(HIMSAJournalStandardType newHIMSAJournalStandard) {
		if (newHIMSAJournalStandard != hIMSAJournalStandard) {
			NotificationChain msgs = null;
			if (hIMSAJournalStandard != null)
				msgs = ((InternalEObject)hIMSAJournalStandard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_JOURNAL_STANDARD, null, msgs);
			if (newHIMSAJournalStandard != null)
				msgs = ((InternalEObject)newHIMSAJournalStandard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_JOURNAL_STANDARD, null, msgs);
			msgs = basicSetHIMSAJournalStandard(newHIMSAJournalStandard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_JOURNAL_STANDARD, newHIMSAJournalStandard, newHIMSAJournalStandard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationActionType getNotificationAction() {
		return notificationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotificationAction(NotificationActionType newNotificationAction, NotificationChain msgs) {
		NotificationActionType oldNotificationAction = notificationAction;
		notificationAction = newNotificationAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExportPackage.PUBLICLY_FORMATTED_DATA__NOTIFICATION_ACTION, oldNotificationAction, newNotificationAction);
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
	public void setNotificationAction(NotificationActionType newNotificationAction) {
		if (newNotificationAction != notificationAction) {
			NotificationChain msgs = null;
			if (notificationAction != null)
				msgs = ((InternalEObject)notificationAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PUBLICLY_FORMATTED_DATA__NOTIFICATION_ACTION, null, msgs);
			if (newNotificationAction != null)
				msgs = ((InternalEObject)newNotificationAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PUBLICLY_FORMATTED_DATA__NOTIFICATION_ACTION, null, msgs);
			msgs = basicSetNotificationAction(newNotificationAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExportPackage.PUBLICLY_FORMATTED_DATA__NOTIFICATION_ACTION, newNotificationAction, newNotificationAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScanMetaDataStandardType getScanMetaDataStandard() {
		return scanMetaDataStandard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScanMetaDataStandard(ScanMetaDataStandardType newScanMetaDataStandard, NotificationChain msgs) {
		ScanMetaDataStandardType oldScanMetaDataStandard = scanMetaDataStandard;
		scanMetaDataStandard = newScanMetaDataStandard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExportPackage.PUBLICLY_FORMATTED_DATA__SCAN_META_DATA_STANDARD, oldScanMetaDataStandard, newScanMetaDataStandard);
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
	public void setScanMetaDataStandard(ScanMetaDataStandardType newScanMetaDataStandard) {
		if (newScanMetaDataStandard != scanMetaDataStandard) {
			NotificationChain msgs = null;
			if (scanMetaDataStandard != null)
				msgs = ((InternalEObject)scanMetaDataStandard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PUBLICLY_FORMATTED_DATA__SCAN_META_DATA_STANDARD, null, msgs);
			if (newScanMetaDataStandard != null)
				msgs = ((InternalEObject)newScanMetaDataStandard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PUBLICLY_FORMATTED_DATA__SCAN_META_DATA_STANDARD, null, msgs);
			msgs = basicSetScanMetaDataStandard(newScanMetaDataStandard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExportPackage.PUBLICLY_FORMATTED_DATA__SCAN_META_DATA_STANDARD, newScanMetaDataStandard, newScanMetaDataStandard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOMETRIC_STANDARD:
				return basicSetHIMSAAudiometricStandard(null, msgs);
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOMETRIC_STANDARD1:
				return basicSetHIMSAAudiometricStandard1(null, msgs);
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HEARING_INSTRUMENT_SELECTION:
				return basicSetHearingInstrumentSelection(null, msgs);
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HEARING_INSTRUMENT_FITTING:
				return basicSetHearingInstrumentFitting(null, msgs);
			case ExportPackage.PUBLICLY_FORMATTED_DATA__REMOTE_CONTROL_SELECTION:
				return basicSetRemoteControlSelection(null, msgs);
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_REM_STANDARD:
				return basicSetHIMSARemStandard(null, msgs);
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_HIT_STANDARD:
				return basicSetHIMSAHitStandard(null, msgs);
			case ExportPackage.PUBLICLY_FORMATTED_DATA__ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT:
				return basicSetAcousticImpedanceCompleteMeasurement(null, msgs);
			case ExportPackage.PUBLICLY_FORMATTED_DATA__ACOUSTIC_IMMITTANCE_ASSESSMENT:
				return basicSetAcousticImmittanceAssessment(null, msgs);
			case ExportPackage.PUBLICLY_FORMATTED_DATA__TINNITUS_MEASUREMENT_DATA:
				return basicSetTinnitusMeasurementData(null, msgs);
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOGRAM_METADATA_STANDARD:
				return basicSetHIMSAAudiogramMetadataStandard(null, msgs);
			case ExportPackage.PUBLICLY_FORMATTED_DATA__COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION:
				return basicSetCochlearImplantSoundProcessorSelection(null, msgs);
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_JOURNAL_STANDARD:
				return basicSetHIMSAJournalStandard(null, msgs);
			case ExportPackage.PUBLICLY_FORMATTED_DATA__NOTIFICATION_ACTION:
				return basicSetNotificationAction(null, msgs);
			case ExportPackage.PUBLICLY_FORMATTED_DATA__SCAN_META_DATA_STANDARD:
				return basicSetScanMetaDataStandard(null, msgs);
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
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOMETRIC_STANDARD:
				return getHIMSAAudiometricStandard();
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOMETRIC_STANDARD1:
				return getHIMSAAudiometricStandard1();
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HEARING_INSTRUMENT_SELECTION:
				return getHearingInstrumentSelection();
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HEARING_INSTRUMENT_FITTING:
				return getHearingInstrumentFitting();
			case ExportPackage.PUBLICLY_FORMATTED_DATA__REMOTE_CONTROL_SELECTION:
				return getRemoteControlSelection();
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_REM_STANDARD:
				return getHIMSARemStandard();
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_HIT_STANDARD:
				return getHIMSAHitStandard();
			case ExportPackage.PUBLICLY_FORMATTED_DATA__ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT:
				return getAcousticImpedanceCompleteMeasurement();
			case ExportPackage.PUBLICLY_FORMATTED_DATA__ACOUSTIC_IMMITTANCE_ASSESSMENT:
				return getAcousticImmittanceAssessment();
			case ExportPackage.PUBLICLY_FORMATTED_DATA__TINNITUS_MEASUREMENT_DATA:
				return getTinnitusMeasurementData();
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOGRAM_METADATA_STANDARD:
				return getHIMSAAudiogramMetadataStandard();
			case ExportPackage.PUBLICLY_FORMATTED_DATA__COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION:
				return getCochlearImplantSoundProcessorSelection();
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_JOURNAL_STANDARD:
				return getHIMSAJournalStandard();
			case ExportPackage.PUBLICLY_FORMATTED_DATA__NOTIFICATION_ACTION:
				return getNotificationAction();
			case ExportPackage.PUBLICLY_FORMATTED_DATA__SCAN_META_DATA_STANDARD:
				return getScanMetaDataStandard();
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
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOMETRIC_STANDARD:
				setHIMSAAudiometricStandard((HIMSAAudiometricStandardType)newValue);
				return;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOMETRIC_STANDARD1:
				setHIMSAAudiometricStandard1((com.himsa.measurement.audiogram._502.HIMSAAudiometricStandardType)newValue);
				return;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HEARING_INSTRUMENT_SELECTION:
				setHearingInstrumentSelection((HearingInstrumentSelectionType)newValue);
				return;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HEARING_INSTRUMENT_FITTING:
				setHearingInstrumentFitting((HearingInstrumentFittingType)newValue);
				return;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__REMOTE_CONTROL_SELECTION:
				setRemoteControlSelection((RemoteControlSelectionType)newValue);
				return;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_REM_STANDARD:
				setHIMSARemStandard((HIMSARemStandardType)newValue);
				return;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_HIT_STANDARD:
				setHIMSAHitStandard((HIMSAHitStandardType)newValue);
				return;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT:
				setAcousticImpedanceCompleteMeasurement((AcousticImpedanceCompleteMeasurementType)newValue);
				return;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__ACOUSTIC_IMMITTANCE_ASSESSMENT:
				setAcousticImmittanceAssessment((AcousticImmittanceAssessmentType)newValue);
				return;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__TINNITUS_MEASUREMENT_DATA:
				setTinnitusMeasurementData((TinnitusMeasurementDataType)newValue);
				return;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOGRAM_METADATA_STANDARD:
				setHIMSAAudiogramMetadataStandard((HIMSAAudiogramMetadataStandardType)newValue);
				return;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION:
				setCochlearImplantSoundProcessorSelection((CochlearImplantSoundProcessorSelectionType)newValue);
				return;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_JOURNAL_STANDARD:
				setHIMSAJournalStandard((HIMSAJournalStandardType)newValue);
				return;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__NOTIFICATION_ACTION:
				setNotificationAction((NotificationActionType)newValue);
				return;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__SCAN_META_DATA_STANDARD:
				setScanMetaDataStandard((ScanMetaDataStandardType)newValue);
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
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOMETRIC_STANDARD:
				setHIMSAAudiometricStandard((HIMSAAudiometricStandardType)null);
				return;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOMETRIC_STANDARD1:
				setHIMSAAudiometricStandard1((com.himsa.measurement.audiogram._502.HIMSAAudiometricStandardType)null);
				return;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HEARING_INSTRUMENT_SELECTION:
				setHearingInstrumentSelection((HearingInstrumentSelectionType)null);
				return;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HEARING_INSTRUMENT_FITTING:
				setHearingInstrumentFitting((HearingInstrumentFittingType)null);
				return;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__REMOTE_CONTROL_SELECTION:
				setRemoteControlSelection((RemoteControlSelectionType)null);
				return;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_REM_STANDARD:
				setHIMSARemStandard((HIMSARemStandardType)null);
				return;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_HIT_STANDARD:
				setHIMSAHitStandard((HIMSAHitStandardType)null);
				return;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT:
				setAcousticImpedanceCompleteMeasurement((AcousticImpedanceCompleteMeasurementType)null);
				return;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__ACOUSTIC_IMMITTANCE_ASSESSMENT:
				setAcousticImmittanceAssessment((AcousticImmittanceAssessmentType)null);
				return;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__TINNITUS_MEASUREMENT_DATA:
				setTinnitusMeasurementData((TinnitusMeasurementDataType)null);
				return;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOGRAM_METADATA_STANDARD:
				setHIMSAAudiogramMetadataStandard((HIMSAAudiogramMetadataStandardType)null);
				return;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION:
				setCochlearImplantSoundProcessorSelection((CochlearImplantSoundProcessorSelectionType)null);
				return;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_JOURNAL_STANDARD:
				setHIMSAJournalStandard((HIMSAJournalStandardType)null);
				return;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__NOTIFICATION_ACTION:
				setNotificationAction((NotificationActionType)null);
				return;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__SCAN_META_DATA_STANDARD:
				setScanMetaDataStandard((ScanMetaDataStandardType)null);
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
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOMETRIC_STANDARD:
				return hIMSAAudiometricStandard != null;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOMETRIC_STANDARD1:
				return hIMSAAudiometricStandard1 != null;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HEARING_INSTRUMENT_SELECTION:
				return hearingInstrumentSelection != null;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HEARING_INSTRUMENT_FITTING:
				return hearingInstrumentFitting != null;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__REMOTE_CONTROL_SELECTION:
				return remoteControlSelection != null;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_REM_STANDARD:
				return hIMSARemStandard != null;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_HIT_STANDARD:
				return hIMSAHitStandard != null;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__ACOUSTIC_IMPEDANCE_COMPLETE_MEASUREMENT:
				return acousticImpedanceCompleteMeasurement != null;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__ACOUSTIC_IMMITTANCE_ASSESSMENT:
				return acousticImmittanceAssessment != null;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__TINNITUS_MEASUREMENT_DATA:
				return tinnitusMeasurementData != null;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_AUDIOGRAM_METADATA_STANDARD:
				return hIMSAAudiogramMetadataStandard != null;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__COCHLEAR_IMPLANT_SOUND_PROCESSOR_SELECTION:
				return cochlearImplantSoundProcessorSelection != null;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__HIMSA_JOURNAL_STANDARD:
				return hIMSAJournalStandard != null;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__NOTIFICATION_ACTION:
				return notificationAction != null;
			case ExportPackage.PUBLICLY_FORMATTED_DATA__SCAN_META_DATA_STANDARD:
				return scanMetaDataStandard != null;
		}
		return super.eIsSet(featureID);
	}

} //PubliclyFormattedDataImpl
