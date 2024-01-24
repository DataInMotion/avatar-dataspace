/*
 */
package com.himsa.measurement.impedance;

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
 *   <li>{@link com.himsa.measurement.impedance.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link com.himsa.measurement.impedance.DocumentRoot#getAcousticImpedanceCompleteMeasurement <em>Acoustic Impedance Complete Measurement</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.impedance.ImpedancePackage#getDocumentRoot()
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
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getDocumentRoot_Mixed()
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
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

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
	 * @see com.himsa.measurement.impedance.ImpedancePackage#getDocumentRoot_AcousticImpedanceCompleteMeasurement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AcousticImpedanceCompleteMeasurement' namespace='##targetNamespace'"
	 * @generated
	 */
	AcousticImpedanceCompleteMeasurementType getAcousticImpedanceCompleteMeasurement();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.impedance.DocumentRoot#getAcousticImpedanceCompleteMeasurement <em>Acoustic Impedance Complete Measurement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acoustic Impedance Complete Measurement</em>' containment reference.
	 * @see #getAcousticImpedanceCompleteMeasurement()
	 * @generated
	 */
	void setAcousticImpedanceCompleteMeasurement(AcousticImpedanceCompleteMeasurementType value);

} // DocumentRoot
