/*
 */
package com.himsa.measurement.audiogram;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.DocumentRoot#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.DocumentRoot#getHIMSAAudiometricStandard <em>HIMSA Audiometric Standard</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.audiogram.AudiogramPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
@ProviderType
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see com.himsa.measurement.audiogram.AudiogramPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see com.himsa.measurement.audiogram.AudiogramPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see com.himsa.measurement.audiogram.AudiogramPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Aud Measurement Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Global Element used throughout this standard - see AudioMetricMeasurementConditions_Type for more details
	 * 
	 * The same set of measurement conditions are used for all Audiogram curves.
	 * The Audiogram measurement conditions are very versatile and expandable in such a way that whenever new measurement methods are discovered they can be added to the existing ones.
	 * 
	 * They are meant to be used both by the ENT (Ear, Nose, Throat) for diagnostics purposes and for fitting hearing instruments as well. It is very important to realize that combinations of measurement conditions that make perfect sense to the ENT can be meaningless when programming hearing instruments. It is therefore important to examine all measurement conditions to ascertain whether they are useful for the intended purpose.
	 * 
	 * The measurement conditions have initial (default) values that must be filled in.
	 * 
	 * The following elements are mandatory and have initial values set:
	 * StimulusSignalType, MaskingSignalType
	 * StimulusSignalOutput, MaskingSignalOutput
	 * StimulusdBWeighting, MaskingdBWeighting
	 * 
	 * In addition to the initial default values listed above recording the following audiogram test requires the following elements be set (even though they are listed as optional in the XSD schema file)
	 * 
	 * For tone audiograms these are:
	 * StimulusPresentationType, MaskingPresentationType
	 * 
	 * For speech audiograms these are:
	 * StimulusAuxiliary
	 * MaskingAuxiliary
	 * 
	 * ## TMeasCond ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aud Measurement Conditions</em>' containment reference.
	 * @see #setAudMeasurementConditions(AudioMetricMeasurementConditionsType)
	 * @see com.himsa.measurement.audiogram.AudiogramPackage#getDocumentRoot_AudMeasurementConditions()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AudMeasurementConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	AudioMetricMeasurementConditionsType getAudMeasurementConditions();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram.DocumentRoot#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aud Measurement Conditions</em>' containment reference.
	 * @see #getAudMeasurementConditions()
	 * @generated
	 */
	void setAudMeasurementConditions(AudioMetricMeasurementConditionsType value);

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
	 * @see com.himsa.measurement.audiogram.AudiogramPackage#getDocumentRoot_HIMSAAudiometricStandard()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HIMSAAudiometricStandard' namespace='##targetNamespace'"
	 * @generated
	 */
	HIMSAAudiometricStandardType getHIMSAAudiometricStandard();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram.DocumentRoot#getHIMSAAudiometricStandard <em>HIMSA Audiometric Standard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HIMSA Audiometric Standard</em>' containment reference.
	 * @see #getHIMSAAudiometricStandard()
	 * @generated
	 */
	void setHIMSAAudiometricStandard(HIMSAAudiometricStandardType value);

} // DocumentRoot
