/*
 */
package com.himsa.patient.export.patient.export;

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

import com.himsa.scan.scan.meta.data.ScanMetaDataStandardType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publicly Formatted Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getHIMSAAudiometricStandard <em>HIMSA Audiometric Standard</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getHIMSAAudiometricStandard1 <em>HIMSA Audiometric Standard1</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getHearingInstrumentSelection <em>Hearing Instrument Selection</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getHearingInstrumentFitting <em>Hearing Instrument Fitting</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getRemoteControlSelection <em>Remote Control Selection</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getHIMSARemStandard <em>HIMSA Rem Standard</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getHIMSAHitStandard <em>HIMSA Hit Standard</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getAcousticImpedanceCompleteMeasurement <em>Acoustic Impedance Complete Measurement</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getAcousticImmittanceAssessment <em>Acoustic Immittance Assessment</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getTinnitusMeasurementData <em>Tinnitus Measurement Data</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getHIMSAAudiogramMetadataStandard <em>HIMSA Audiogram Metadata Standard</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getCochlearImplantSoundProcessorSelection <em>Cochlear Implant Sound Processor Selection</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getHIMSAJournalStandard <em>HIMSA Journal Standard</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getNotificationAction <em>Notification Action</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getScanMetaDataStandard <em>Scan Meta Data Standard</em>}</li>
 * </ul>
 *
 * @see com.himsa.patient.export.patient.export.ExportPackage#getPubliclyFormattedData()
 * @model extendedMetaData="name='PubliclyFormattedData' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PubliclyFormattedData extends EObject {
	/**
	 * Returns the value of the '<em><b>HIMSA Audiometric Standard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *   ROOT ELEMENT
	 * 
	 * Important: All XML data must be encoded using UTF-8.
	 * 
	 * REV 5 (see REV History below)
	 * 
	 * HIMSA highly recommends the below 3rd party documentation for individuals not familiar with Audiology.  The book is reference throughout this data standard:
	 * [HOCA-5] Handbook of Clinical Audiology, edited by Jack Katz, Williams and Wilkins, 2002, 5. Edition
	 * 
	 * For software saving an Audiogram using this data standard:
	 * In order not to waste space in the NOAH database it is not legal to save empty elements.  For example, do not store 
	 *   <Element xmlns="http://www.himsa.com/Measurement/Audiogram"/>
	 *   .
	 * 
	 * Copyright © 2012 HIMSA II  K/S
	 * 
	 * The information in this document is subject to change according to the review policies established by HIMSA II.
	 * 
	 * HIMSA II MAKES NO WARRANTY OF ANY KIND WITH REGARD TO THIS MATERIAL, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTY OR SUITABILITY FOR A PARTICULAR PURPOSE. HIMSA shall not be liable for errors contained herein or for incidental consequential damages in connection with the supply of, performance of, or use of this material.
	 *  
	 * This document contains proprietary information that is protected by copyright. All rights are reserved. No parts of this document may be photocopied, reproduced or distributed to Non-HIMSA member companies. without the prior permission of HIMSA II.
	 * 
	 * Copyright © 2012 HIMSA II  K/S
	 * 
	 * REV History
	 * Final Release / August 15 2011
	 * REV 1 / July 10 2012, Typo and annotation fixes
	 * REV 2 / April 30th 2014.  - Annotation updates only
	 * +++PointStatus_Type annotations were incomplete.  Made sure that all annotations in format 200 documentation were included
	 * +++SpeechReceptionThresholdAudiogram annotations improved to make it more clear that this element is also used to store SDT and SAT tests.  Previously the annotation implied it was only for SRT.
	 * REV 3 / August 9 2015 - Annotation updates only.  See new annotations for attributes ValidatedByNOAH and ConvertedFromDataStandard
	 * REV 4 / January 17 2018 - Annotation updates only.  Text "If masking is to be recorded it is then necessary to save values for both MaskingFrequency and MaskingLevel.  The XSD was not able to be setup to enforce this rule due to legacy (format 200) design." added to MaskingFrequency and MaskingLevel.  This rule already seems to be followed by most companies and the original format 200 documentation stipulates to enter the value if masking is performed.
	 * REV 5 / November 1, 2019 - Annotation updates only, note to use UTF-8
	 * 
	 * ## Text between these symbols represent type names from the Audiogram standard format 100 and 200 defined via a C header file.  During the creation of this schema file HIMSA elected to rename element names to be more human readable.  The original type names are listed her for individuals familiar with these names ##
	 * 
	 * 
	 * @@ Text entered between these symbols denotes special instructions that have been followed if data has been converted up from format 100 or 200.  In general, HIMSA has tried to make a 1 to 1 mapping of older formats but in some cases some special rules have been put into place.  @@
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>HIMSA Audiometric Standard</em>' containment reference.
	 * @see #setHIMSAAudiometricStandard(HIMSAAudiometricStandardType)
	 * @see com.himsa.patient.export.patient.export.ExportPackage#getPubliclyFormattedData_HIMSAAudiometricStandard()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HIMSAAudiometricStandard' namespace='http://www.himsa.com/Measurement/Audiogram'"
	 * @generated
	 */
	HIMSAAudiometricStandardType getHIMSAAudiometricStandard();

	/**
	 * Sets the value of the '{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getHIMSAAudiometricStandard <em>HIMSA Audiometric Standard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HIMSA Audiometric Standard</em>' containment reference.
	 * @see #getHIMSAAudiometricStandard()
	 * @generated
	 */
	void setHIMSAAudiometricStandard(HIMSAAudiometricStandardType value);

	/**
	 * Returns the value of the '<em><b>HIMSA Audiometric Standard1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *   ROOT ELEMENT
	 * 
	 * Revision 4 released January 17 2018
	 * 
	 * See REV history below
	 * 
	 * Important: All XML data must be encoded using UTF-8.
	 * 
	 * HIMSA highly recommends the below 3rd party documentation for individuals not familiar with Audiology.  The book is reference throughout this data standard:
	 * [HOCA-5] Handbook of Clinical Audiology, edited by Jack Katz, Williams and Wilkins, 2002, 5. Edition
	 * 
	 * For software saving an Audiogram using this data standard:
	 * In order not to waste space in the NOAH database it is not legal to save empty elements.  For example, do not store 
	 *   <Element xmlns="http://www.himsa.com/Measurement/Audiogram/502"/>
	 *   .
	 * 
	 * The information in this document is subject to change according to the review policies established by HIMSA II.
	 * 
	 * HIMSA II MAKES NO WARRANTY OF ANY KIND WITH REGARD TO THIS MATERIAL, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTY OR SUITABILITY FOR A PARTICULAR PURPOSE. HIMSA shall not be liable for errors contained herein or for incidental consequential damages in connection with the supply of, performance of, or use of this material.
	 *  
	 * This document contains proprietary information that is protected by copyright. All rights are reserved. No parts of this document may be photocopied, reproduced or distributed to Non-HIMSA member companies. without the prior permission of HIMSA II.
	 * 
	 * REV History
	 * Rev 1 - first release, Jan. 2016
	 * Rev 2 - October 13 2016, Weber point should not contain stimulus level element
	 * Rev 3 - January 17 2018 REV 4 / January 17 2018 - Annotation updates only.  Text "If masking is to be recorded it is then necessary to save values for both MaskingFrequency and MaskingLevel.  The XSD was not able to be setup to enforce this rule due to legacy (format 200) design." added to MaskingFrequency and MaskingLevel.  This rule already seems to be followed by most companies and the original format 200 documentation stipulates to enter the value if masking is performed.
	 * REV 4 November 4 2019 - Annotation updates only, note to use UTF-8
	 * 
	 * 
	 * Copyright © 2016 HIMSA II  K/S
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>HIMSA Audiometric Standard1</em>' containment reference.
	 * @see #setHIMSAAudiometricStandard1(com.himsa.measurement.audiogram._502.HIMSAAudiometricStandardType)
	 * @see com.himsa.patient.export.patient.export.ExportPackage#getPubliclyFormattedData_HIMSAAudiometricStandard1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HIMSAAudiometricStandard' namespace='http://www.himsa.com/Measurement/Audiogram/502'"
	 * @generated
	 */
	com.himsa.measurement.audiogram._502.HIMSAAudiometricStandardType getHIMSAAudiometricStandard1();

	/**
	 * Sets the value of the '{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getHIMSAAudiometricStandard1 <em>HIMSA Audiometric Standard1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HIMSA Audiometric Standard1</em>' containment reference.
	 * @see #getHIMSAAudiometricStandard1()
	 * @generated
	 */
	void setHIMSAAudiometricStandard1(com.himsa.measurement.audiogram._502.HIMSAAudiometricStandardType value);

	/**
	 * Returns the value of the '<em><b>Hearing Instrument Selection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HIMSA Hearing Instrument Selection Data Standard
	 * 
	 * Important: All XML data must be encoded using UTF-8.
	 * 
	 * REV 2 (see REV History below)
	 * 
	 * Copyright © 2012 HIMSA II K/S
	 * 
	 * The information in this document is subject to change according to the review policies established by HIMSA II.
	 * 
	 * HIMSA II MAKES NO WARRANTY OF ANY KIND WITH REGARD TO THIS MATERIAL, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTY OR SUITABILITY FOR A PARTICULAR PURPOSE. HIMSA shall not be liable for errors contained herein or for incidental consequential damages in connection with the supply of, performance of, or use of this material.
	 *  
	 * This document contains proprietary information that is protected by copyright. All rights are reserved. No parts of this document may be photocopied, reproduced or distributed to Non-HIMSA member companies. without the prior permission of HIMSA II.
	 * 
	 * Copyright © 2012 HIMSA II K/S
	 * 
	 * REV History
	 * Final Release / August 15 2011
	 * REV 1 / August 9 2015 - Annotation updates only.  See new annotations for attributes ValidatedByNOAH and ConvertedFromDataStandard
	 * 
	 * REV 2 / November 4 2019 - Annotation updates only, note to use UTF-8
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hearing Instrument Selection</em>' containment reference.
	 * @see #setHearingInstrumentSelection(HearingInstrumentSelectionType)
	 * @see com.himsa.patient.export.patient.export.ExportPackage#getPubliclyFormattedData_HearingInstrumentSelection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HearingInstrumentSelection' namespace='http://www.himsa.com/Instrument/Selection'"
	 * @generated
	 */
	HearingInstrumentSelectionType getHearingInstrumentSelection();

	/**
	 * Sets the value of the '{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getHearingInstrumentSelection <em>Hearing Instrument Selection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hearing Instrument Selection</em>' containment reference.
	 * @see #getHearingInstrumentSelection()
	 * @generated
	 */
	void setHearingInstrumentSelection(HearingInstrumentSelectionType value);

	/**
	 * Returns the value of the '<em><b>Hearing Instrument Fitting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HIMSA Hearing Instrument Fitting Data Standard
	 * 
	 * Important: All XML data must be encoded using UTF-8.
	 * 
	 * REV 2 (see REV History below)
	 * 
	 * Copyright © 2012 HIMSA II K/S
	 * 
	 * The information in this document is subject to change according to the review policies established by HIMSA II.
	 * 
	 * HIMSA II MAKES NO WARRANTY OF ANY KIND WITH REGARD TO THIS MATERIAL, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTY OR SUITABILITY FOR A PARTICULAR PURPOSE. HIMSA shall not be liable for errors contained herein or for incidental consequential damages in connection with the supply of, performance of, or use of this material.
	 *  
	 * This document contains proprietary information that is protected by copyright. All rights are reserved. No parts of this document may be photocopied, reproduced or distributed to Non-HIMSA member companies. without the prior permission of HIMSA II.
	 * 
	 * Copyright © 2012 HIMSA II K/S
	 * 
	 * REV History
	 * REV 1 / First release of 500.
	 * REV 2 / December 5 2019 - Annotation updates only, note to use UTF-8
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hearing Instrument Fitting</em>' containment reference.
	 * @see #setHearingInstrumentFitting(HearingInstrumentFittingType)
	 * @see com.himsa.patient.export.patient.export.ExportPackage#getPubliclyFormattedData_HearingInstrumentFitting()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HearingInstrumentFitting' namespace='http://www.himsa.com/Instrument/Fitting'"
	 * @generated
	 */
	HearingInstrumentFittingType getHearingInstrumentFitting();

	/**
	 * Sets the value of the '{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getHearingInstrumentFitting <em>Hearing Instrument Fitting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hearing Instrument Fitting</em>' containment reference.
	 * @see #getHearingInstrumentFitting()
	 * @generated
	 */
	void setHearingInstrumentFitting(HearingInstrumentFittingType value);

	/**
	 * Returns the value of the '<em><b>Remote Control Selection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HIMSA Remote Control Data Standard
	 * 
	 * Important: All XML data must be encoded using UTF-8.
	 * 
	 * REV 2 (see REV History below)
	 * 
	 * Copyright © 2012 HIMSA II K/S
	 * 
	 * The information in this document is subject to change according to the review policies established by HIMSA II  K/S
	 * 
	 * HIMSA II MAKES NO WARRANTY OF ANY KIND WITH REGARD TO THIS MATERIAL, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTY OR SUITABILITY FOR A PARTICULAR PURPOSE. HIMSA shall not be liable for errors contained herein or for incidental consequential damages in connection with the supply of, performance of, or use of this material.
	 *  
	 * This document contains proprietary information that is protected by copyright. All rights are reserved. No parts of this document may be photocopied, reproduced or distributed to Non-HIMSA member companies. without the prior permission of HIMSA II.
	 * 
	 * Copyright © 2012 HIMSA II K/S
	 * 
	 * REV History
	 * Final Release / August 15 2011
	 * REV 1 / August 9 2015 - Annotation updates only.  See new annotations for attributes ValidatedByNOAH and ConvertedFromDataStandard
	 * REV 2 / November 4 2019 - Annotation updates only, note to use UTF-8
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remote Control Selection</em>' containment reference.
	 * @see #setRemoteControlSelection(RemoteControlSelectionType)
	 * @see com.himsa.patient.export.patient.export.ExportPackage#getPubliclyFormattedData_RemoteControlSelection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RemoteControlSelection' namespace='http://www.himsa.com/Instrument/RemoteControl'"
	 * @generated
	 */
	RemoteControlSelectionType getRemoteControlSelection();

	/**
	 * Sets the value of the '{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getRemoteControlSelection <em>Remote Control Selection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Control Selection</em>' containment reference.
	 * @see #getRemoteControlSelection()
	 * @generated
	 */
	void setRemoteControlSelection(RemoteControlSelectionType value);

	/**
	 * Returns the value of the '<em><b>HIMSA Rem Standard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Important: All XML data must be encoded using UTF-8.
	 * 
	 * With the format 200 both the REM and HIT data standards where defined in the same Header file.  While moving to XSD files with format 500 HIMSA decided to split the REM and HIT standards into separate XSD files but the same definitions exist.
	 * 
	 * REV 3 (see REV History below)
	 * 
	 * Copyright © 2019 HIMSA II  K/S
	 * 
	 * The information in this document is subject to change according to the review policies established by HIMSA II  K/S
	 * 
	 * HIMSA II MAKES NO WARRANTY OF ANY KIND WITH REGARD TO THIS MATERIAL, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTY OR SUITABILITY FOR A PARTICULAR PURPOSE. HIMSA shall not be liable for errors contained herein or for incidental consequential damages in connection with the supply of, performance of, or use of this material.
	 *  
	 * This document contains proprietary information that is protected by copyright. All rights are reserved. No parts of this document may be photocopied, reproduced or distributed to Non-HIMSA member companies. without the prior permission of HIMSA II.
	 * 
	 * REV History
	 * Final Release / August 15 2011
	 * REV 1 / August 9 2015 - Annotation updates only.  See new annotations for attributes ValidatedByNOAH and ConvertedFromDataStandard
	 * REV 2 / November 4 2019- Annotation updates only, note to use UTF-8
	 * Rev 3 / December 9 2019 - Annotation updates onnly, updated information on RECD and MPO
	 * 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>HIMSA Rem Standard</em>' containment reference.
	 * @see #setHIMSARemStandard(HIMSARemStandardType)
	 * @see com.himsa.patient.export.patient.export.ExportPackage#getPubliclyFormattedData_HIMSARemStandard()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HIMSARemStandard' namespace='http://www.himsa.com/Measurement/RealEar'"
	 * @generated
	 */
	HIMSARemStandardType getHIMSARemStandard();

	/**
	 * Sets the value of the '{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getHIMSARemStandard <em>HIMSA Rem Standard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HIMSA Rem Standard</em>' containment reference.
	 * @see #getHIMSARemStandard()
	 * @generated
	 */
	void setHIMSARemStandard(HIMSARemStandardType value);

	/**
	 * Returns the value of the '<em><b>HIMSA Hit Standard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Important: All XML data must be encoded using UTF-8.
	 * 
	 * With the format 200 both the REM and HIT data standards where defined in the same Header file.  While moving to XSD files with format 500 HIMSA decided to split the REM and HIT standards into separate XSD files but the same definitions exist.
	 * 
	 * REV 2 (see REV History below)
	 * 
	 * Copyright © 2012 HIMSA II  K/S
	 * 
	 * The information in this document is subject to change according to the review policies established by HIMSA II.
	 * 
	 * HIMSA II MAKES NO WARRANTY OF ANY KIND WITH REGARD TO THIS MATERIAL, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTY OR SUITABILITY FOR A PARTICULAR PURPOSE. HIMSA shall not be liable for errors contained herein or for incidental consequential damages in connection with the supply of, performance of, or use of this material.
	 *  
	 * This document contains proprietary information that is protected by copyright. All rights are reserved. No parts of this document may be photocopied, reproduced or distributed to Non-HIMSA member companies. without the prior permission of HIMSA II  K/S
	 * 
	 * Final Release / August 15 2011
	 * REV 1 / August 9 2015 - Annotation updates only.  See new annotations for attributes ValidatedByNOAH and ConvertedFromDataStandard
	 * REV 2 / November 4 2019- Annotation updates only, note to use UTF-8
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>HIMSA Hit Standard</em>' containment reference.
	 * @see #setHIMSAHitStandard(HIMSAHitStandardType)
	 * @see com.himsa.patient.export.patient.export.ExportPackage#getPubliclyFormattedData_HIMSAHitStandard()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HIMSAHitStandard' namespace='http://www.himsa.com/Measurement/HearingInstrumentTest'"
	 * @generated
	 */
	HIMSAHitStandardType getHIMSAHitStandard();

	/**
	 * Sets the value of the '{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getHIMSAHitStandard <em>HIMSA Hit Standard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HIMSA Hit Standard</em>' containment reference.
	 * @see #getHIMSAHitStandard()
	 * @generated
	 */
	void setHIMSAHitStandard(HIMSAHitStandardType value);

	/**
	 * Returns the value of the '<em><b>Acoustic Impedance Complete Measurement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Important: All XML data must be encoded using UTF-8.
	 * 
	 * REV 7 (see REV History below)
	 * 
	 * Tympanometry is a commonly used objective test of middle ear function. 
	 * 
	 * Defined in the ANSI standard – ANSI s3.39-1987 (R2007) as “the dynamic measure of acoustic immitance in the ear canal as a function of changes in air pressure in the ear canal” Katz pg. 175
	 * 
	 * HIMSA highly recommends the below 3rd party documentation for individuals not familiar with Audiology.  The book is reference throughout this data standard:
	 * [HOCA-5] Handbook of Clinical Audiology, edited by Jack Katz, Williams and Wilkins, 2002, 5. Edition
	 * 
	 * 
	 * Copyright © 2017 HIMSA II K/S
	 * REV History
	 * REV1 / September 2011, first release of format 100 translated to XSD
	 * REV2 / July 2012, HIMSA released REV 2 of the IMP 500 data standard in conjunction with Noah 4.3.  was made because ImpedanceMeasurementCondition_Type > Frequency needed to be changed from mandatory to optional. This change was needed because the element is used depending on the SignalOutput. All changes for REV 2 are marked between the “!!” symbols.
	 * REV 3 / May 2014, clear up annotations dealing with the description of Contra Reflex Measurement and IPSI Reflex Measurement
	 * REV 4 / August 9 2015 - Annotation updates only.  See new annotations for attributes ValidatedByNOAH and ConvertedFromDataStandard
	 * REV 5 / April 18 2017 With the release of the Noah 4 Audiogram module (version 1.2) HIMSA has updated the Admittance runtime data converter format 100 –> 500.  The changes that were made were done so to address issues where the previous converter would create a format 500 XML file that would pass validation.  This was a known issue with the original move to XML based data standards.  However, HIMSA recently discovered that there was an undesirable side effect when creating updated format (e.g. format 501).  Without fixing this issue the invalid XML caused further problems converting to format 501.  
	 * The detailed changes can be found by searching for the text “@@ REV 5 Converter Change 100>500”
	 * The general changes are choosing default values if not present or entering in a value of -32676 rather than a value of zero (as this can be a valid result).
	 * REV 6 / July 30 2018 It has been brought to HIMSA's attention that the ResultOfReflexTest annotations for REFLEX are incorrect.  The values were incorrectly carried over from fromat 100.  This issue has existed since the first REV of format 500.  The correct values of 1=True and 0=False are not documented.
	 * REV 7 / November 4 2019- Annotation updates only, note to use UTF-8
	 * 
	 * 
	 * The information in this document is subject to change according to the review policies established by HIMSA II.
	 * 
	 * HIMSA II MAKES NO WARRANTY OF ANY KIND WITH REGARD TO THIS MATERIAL, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTY OR SUITABILITY FOR A PARTICULAR PURPOSE. HIMSA shall not be liable for errors contained herein or for incidental consequential damages in connection with the supply of, performance of, or use of this material.
	 *  
	 * This document contains proprietary information that is protected by copyright. All rights are reserved. No parts of this document may be photocopied, reproduced or distributed to Non-HIMSA member companies. without the prior permission of HIMSA II.
	 * 
	 * Copyright © 2012 HIMSA II K/S
	 * 
	 * 
	 * ##TImpedanceSession## describing your root element
	 * 
	 * @@ Text entered between these symbols denote special instructions to the HIMSA developer responsible for creating a conversion DLL between format 100 and format 500 @@
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Acoustic Impedance Complete Measurement</em>' containment reference.
	 * @see #setAcousticImpedanceCompleteMeasurement(AcousticImpedanceCompleteMeasurementType)
	 * @see com.himsa.patient.export.patient.export.ExportPackage#getPubliclyFormattedData_AcousticImpedanceCompleteMeasurement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AcousticImpedanceCompleteMeasurement' namespace='http://www.himsa.com/Measurement/Impedance'"
	 * @generated
	 */
	AcousticImpedanceCompleteMeasurementType getAcousticImpedanceCompleteMeasurement();

	/**
	 * Sets the value of the '{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getAcousticImpedanceCompleteMeasurement <em>Acoustic Impedance Complete Measurement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acoustic Impedance Complete Measurement</em>' containment reference.
	 * @see #getAcousticImpedanceCompleteMeasurement()
	 * @generated
	 */
	void setAcousticImpedanceCompleteMeasurement(AcousticImpedanceCompleteMeasurementType value);

	/**
	 * Returns the value of the '<em><b>Acoustic Immittance Assessment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Important: All XML data must be encoded using UTF-8.
	 * 
	 * REV 3 - See REV History Below
	 * 
	 * Tympanometry is a commonly used objective test of middle ear function. 
	 * 
	 * Defined in the ANSI standard – ANSI s3.39-1987 (R2007) as “the dynamic measure of acoustic immitance in the ear canal as a function of changes in air pressure in the ear canal” Katz pg. 175
	 * 
	 * HIMSA highly recommends the below 3rd party documentation for individuals not familiar with Audiology.  The book is reference throughout this data standard:
	 * [HOCA-5] Handbook of Clinical Audiology, edited by Jack Katz, Williams and Wilkins, 2002, 5. Edition
	 * 
	 * REV History
	 * REV1 / First release of 501 made April 18th 2017
	 * REV 2 / July 30 2018 It has been brought to HIMSA's attention that the ResultOfReflexTest annotations for REFLEX are incorrect.  The values were incorrectly carried over from fromat 100.  This issue has also existed since the first REV of format 500 and been corrected.
	 *  REV 3 / November 4 2019 - Annotation updates only, note to use UTF-8
	 * 
	 * Copyright © 2017 HIMSA II K/S
	 * 
	 * 
	 * The information in this document is subject to change according to the review policies established by HIMSA II.
	 * 
	 * HIMSA II MAKES NO WARRANTY OF ANY KIND WITH REGARD TO THIS MATERIAL, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTY OR SUITABILITY FOR A PARTICULAR PURPOSE. HIMSA shall not be liable for errors contained herein or for incidental consequential damages in connection with the supply of, performance of, or use of this material.
	 *  
	 * This document contains proprietary information that is protected by copyright. All rights are reserved. No parts of this document may be photocopied, reproduced or distributed to Non-HIMSA member companies. without the prior permission of HIMSA II.
	 * 
	 * @@ Text entered between these symbols denote special instructions to the HIMSA developer responsible for creating a conversion DLL between format 500 and format 501 @@
	 * 
	 * @@ 500 --> 501 name change
	 * AcousticImpedanceCompleteMeasurement changed to AcousticImmittanceAssessment
	 * @@
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Acoustic Immittance Assessment</em>' containment reference.
	 * @see #setAcousticImmittanceAssessment(AcousticImmittanceAssessmentType)
	 * @see com.himsa.patient.export.patient.export.ExportPackage#getPubliclyFormattedData_AcousticImmittanceAssessment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AcousticImmittanceAssessment' namespace='http://www.himsa.com/Measurement/Admittance/501'"
	 * @generated
	 */
	AcousticImmittanceAssessmentType getAcousticImmittanceAssessment();

	/**
	 * Sets the value of the '{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getAcousticImmittanceAssessment <em>Acoustic Immittance Assessment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acoustic Immittance Assessment</em>' containment reference.
	 * @see #getAcousticImmittanceAssessment()
	 * @generated
	 */
	void setAcousticImmittanceAssessment(AcousticImmittanceAssessmentType value);

	/**
	 * Returns the value of the '<em><b>Tinnitus Measurement Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *   ROOT ELEMENT
	 * 
	 * December 15 2022
	 * 
	 * See REV history below
	 * 
	 * Important: All XML data must be encoded using UTF-8.
	 * 
	 * For software using this data standard:
	 * In order not to waste space in the NOAH database it is not legal to save empty elements. 
	 *   <Element xmlns="http://www.himsa.com/measurement/Tinnitus/500"/>
	 *   The information in this document is subject to change according to the review policies established by HIMSA II.
	 * 
	 * HIMSA II MAKES NO WARRANTY OF ANY KIND WITH REGARD TO THIS MATERIAL, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTY OR SUITABILITY FOR A PARTICULAR PURPOSE. HIMSA shall not be liable for errors contained herein or for incidental consequential damages in connection with the supply of, performance of, or use of this material.
	 *  
	 * This document contains proprietary information that is protected by copyright. All rights are reserved. No parts of this document may be photocopied, reproduced or distributed to Non-HIMSA member companies. without the prior permission of HIMSA II.
	 * 
	 * REV History:
	 * Revision 1: December 15 2022:
	 * - First release
	 *   
	 * Copyright © 2022 HIMSA II  K/S
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tinnitus Measurement Data</em>' containment reference.
	 * @see #setTinnitusMeasurementData(TinnitusMeasurementDataType)
	 * @see com.himsa.patient.export.patient.export.ExportPackage#getPubliclyFormattedData_TinnitusMeasurementData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TinnitusMeasurementData' namespace='http://www.himsa.com/measurement/Tinnitus/500'"
	 * @generated
	 */
	TinnitusMeasurementDataType getTinnitusMeasurementData();

	/**
	 * Sets the value of the '{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getTinnitusMeasurementData <em>Tinnitus Measurement Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tinnitus Measurement Data</em>' containment reference.
	 * @see #getTinnitusMeasurementData()
	 * @generated
	 */
	void setTinnitusMeasurementData(TinnitusMeasurementDataType value);

	/**
	 * Returns the value of the '<em><b>HIMSA Audiogram Metadata Standard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ROOT ELEMENT
	 * 
	 * Important: All XML data must be encoded using UTF-8.
	 * 
	 * REV 2 (See REV history below)
	 * 
	 * HIMSA II MAKES NO WARRANTY OF ANY KIND WITH REGARD TO THIS MATERIAL, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTY OR SUITABILITY FOR A PARTICULAR PURPOSE. HIMSA shall not be liable for errors contained herein or for incidental consequential damages in connection with the supply of, performance of, or use of this material.
	 *  
	 * This document contains proprietary information that is protected by copyright. All rights are reserved. No parts of this document may be photocopied, reproduced or distributed to Non-HIMSA member companies. without the prior permission of HIMSA II.
	 * 
	 * REV History
	 * Rev 1 - First public release August 2 2019
	 * REV 2 / November 4 2019 - Annotation updates only, note to use UTF-8
	 * 
	 * Copyright © 2019 HIMSA II  K/S
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>HIMSA Audiogram Metadata Standard</em>' containment reference.
	 * @see #setHIMSAAudiogramMetadataStandard(HIMSAAudiogramMetadataStandardType)
	 * @see com.himsa.patient.export.patient.export.ExportPackage#getPubliclyFormattedData_HIMSAAudiogramMetadataStandard()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HIMSAAudiogramMetadataStandard' namespace='http://www.himsa.com/Measurement/AudiogramMetadata/500'"
	 * @generated
	 */
	HIMSAAudiogramMetadataStandardType getHIMSAAudiogramMetadataStandard();

	/**
	 * Sets the value of the '{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getHIMSAAudiogramMetadataStandard <em>HIMSA Audiogram Metadata Standard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HIMSA Audiogram Metadata Standard</em>' containment reference.
	 * @see #getHIMSAAudiogramMetadataStandard()
	 * @generated
	 */
	void setHIMSAAudiogramMetadataStandard(HIMSAAudiogramMetadataStandardType value);

	/**
	 * Returns the value of the '<em><b>Cochlear Implant Sound Processor Selection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Important: All XML data must be encoded using UTF-8.
	 * 
	 * REV 2 (see REV History below)
	 * 
	 * Copyright © 2019 HIMSA II K/S
	 * 
	 * The information in this document is subject to change according to the review policies established by HIMSA II.
	 * 
	 * HIMSA II MAKES NO WARRANTY OF ANY KIND WITH REGARD TO THIS MATERIAL, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTY OR SUITABILITY FOR A PARTICULAR PURPOSE. HIMSA shall not be liable for errors contained herein or for incidental consequential damages in connection with the supply of, performance of, or use of this material.
	 *  
	 * This document contains proprietary information that is protected by copyright. All rights are reserved. No parts of this document may be photocopied, reproduced or distributed to Non-HIMSA member companies. without the prior permission of HIMSA II.
	 * 
	 * 
	 * REV History
	 * REV 1 / May 8 2019 first release
	 * REV 2 / November 4 2019 - Annotation updates only, note to use UTF-8
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cochlear Implant Sound Processor Selection</em>' containment reference.
	 * @see #setCochlearImplantSoundProcessorSelection(CochlearImplantSoundProcessorSelectionType)
	 * @see com.himsa.patient.export.patient.export.ExportPackage#getPubliclyFormattedData_CochlearImplantSoundProcessorSelection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CochlearImplantSoundProcessorSelection' namespace='http://www.himsa.com/CochlearImplantSoundProcessorSelection/500'"
	 * @generated
	 */
	CochlearImplantSoundProcessorSelectionType getCochlearImplantSoundProcessorSelection();

	/**
	 * Sets the value of the '{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getCochlearImplantSoundProcessorSelection <em>Cochlear Implant Sound Processor Selection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cochlear Implant Sound Processor Selection</em>' containment reference.
	 * @see #getCochlearImplantSoundProcessorSelection()
	 * @generated
	 */
	void setCochlearImplantSoundProcessorSelection(CochlearImplantSoundProcessorSelectionType value);

	/**
	 * Returns the value of the '<em><b>HIMSA Journal Standard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ROOT ELEMENT
	 * 
	 * Important: All XML data must be encoded using UTF-8.
	 * 
	 * Version 500 is the first XML version of this standard.   This standard can be considered a XML wrapper for text that is formated via RTF.  See annotations under the "Body" element for further details. 
	 * 
	 * Version 100 is also fairly simple in scope as it relies solely on the Microsoft RTF format.
	 * 
	 * 
	 * REV 1 (see REV History below)
	 * 
	 * Copyright © 2022 HIMSA II  K/S
	 * 
	 * The information in this document is subject to change according to the review policies established by HIMSA II.
	 * 
	 * HIMSA II MAKES NO WARRANTY OF ANY KIND WITH REGARD TO THIS MATERIAL, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTY OR SUITABILITY FOR A PARTICULAR PURPOSE. HIMSA shall not be liable for errors contained herein or for incidental consequential damages in connection with the supply of, performance of, or use of this material.
	 *  
	 * This document contains proprietary information that is protected by copyright. All rights are reserved. No parts of this document may be photocopied, reproduced or distributed to Non-HIMSA member companies. without the prior permission of HIMSA II.
	 * 
	 * 
	 * 
	 * REV History
	 * 
	 * Rev 1 - Initial Release
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>HIMSA Journal Standard</em>' containment reference.
	 * @see #setHIMSAJournalStandard(HIMSAJournalStandardType)
	 * @see com.himsa.patient.export.patient.export.ExportPackage#getPubliclyFormattedData_HIMSAJournalStandard()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HIMSAJournalStandard' namespace='http://www.himsa.com/other/Journal/500'"
	 * @generated
	 */
	HIMSAJournalStandardType getHIMSAJournalStandard();

	/**
	 * Sets the value of the '{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getHIMSAJournalStandard <em>HIMSA Journal Standard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HIMSA Journal Standard</em>' containment reference.
	 * @see #getHIMSAJournalStandard()
	 * @generated
	 */
	void setHIMSAJournalStandard(HIMSAJournalStandardType value);

	/**
	 * Returns the value of the '<em><b>Notification Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HIMSA Notification Action Data Standard
	 * 
	 * Important: All XML data must be encoded using UTF-8.
	 * 
	 * REV 2 (see REV History below)
	 * 
	 * Copyright © 2019 HIMSA II K/S
	 * 
	 * The information in this document is subject to change according to the review policies established by HIMSA II.
	 * 
	 * HIMSA II MAKES NO WARRANTY OF ANY KIND WITH REGARD TO THIS MATERIAL, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTY OR SUITABILITY FOR A PARTICULAR PURPOSE. HIMSA shall not be liable for errors contained herein or for incidental consequential damages in connection with the supply of, performance of, or use of this material.
	 *  
	 * This document contains proprietary information that is protected by copyright. All rights are reserved. No parts of this document may be photocopied, reproduced or distributed to Non-HIMSA member companies. without the prior permission of HIMSA II.
	 * 
	 * Copyright © 2019 HIMSA II K/S
	 * 
	 * REV History
	 * REV 1 /  Intial release made April 2 2019
	 * REV 2 / November 6 2019 - Annotation updates only, note to use UTF-8
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notification Action</em>' containment reference.
	 * @see #setNotificationAction(NotificationActionType)
	 * @see com.himsa.patient.export.patient.export.ExportPackage#getPubliclyFormattedData_NotificationAction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NotificationAction' namespace='http://www.himsa.com/AlertDashboard/Notification/500'"
	 * @generated
	 */
	NotificationActionType getNotificationAction();

	/**
	 * Sets the value of the '{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getNotificationAction <em>Notification Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Action</em>' containment reference.
	 * @see #getNotificationAction()
	 * @generated
	 */
	void setNotificationAction(NotificationActionType value);

	/**
	 * Returns the value of the '<em><b>Scan Meta Data Standard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Important: All XML data must be encoded using UTF-8.
	 * 
	 * REV 2 (see REV History below)
	 * 
	 * Revision History / please see the REV History section further down.  Revision of a version but normally only contains updated annotations.
	 * 
	 * 
	 * Copyright © 2015 HIMSA II  K/S
	 * 
	 * The information in this document is subject to change according to the review policies established by HIMSA II.
	 * 
	 * HIMSA II MAKES NO WARRANTY OF ANY KIND WITH REGARD TO THIS MATERIAL, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTY OR SUITABILITY FOR A PARTICULAR PURPOSE. HIMSA shall not be liable for errors contained herein or for incidental consequential damages in connection with the supply of, performance of, or use of this material.
	 *  
	 * This document contains proprietary information that is protected by copyright. All rights are reserved. No parts of this document may be photocopied, reproduced or distributed to Non-HIMSA member companies without the prior permission of HIMSA II.
	 * 
	 * 
	 * REV History
	 * 
	 * 1 - first 1.0 release format 500
	 * REV 2 / November 4 2019 - Annotation updates only, note to use UTF-8
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scan Meta Data Standard</em>' containment reference.
	 * @see #setScanMetaDataStandard(ScanMetaDataStandardType)
	 * @see com.himsa.patient.export.patient.export.ExportPackage#getPubliclyFormattedData_ScanMetaDataStandard()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ScanMetaDataStandard' namespace='http://www.himsa.com/Scan/ScanMetaData'"
	 * @generated
	 */
	ScanMetaDataStandardType getScanMetaDataStandard();

	/**
	 * Sets the value of the '{@link com.himsa.patient.export.patient.export.PubliclyFormattedData#getScanMetaDataStandard <em>Scan Meta Data Standard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scan Meta Data Standard</em>' containment reference.
	 * @see #getScanMetaDataStandard()
	 * @generated
	 */
	void setScanMetaDataStandard(ScanMetaDataStandardType value);

} // PubliclyFormattedData
