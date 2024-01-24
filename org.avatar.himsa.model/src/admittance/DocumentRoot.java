/*
 */
package admittance;

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
 *   <li>{@link admittance.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link admittance.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link admittance.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link admittance.DocumentRoot#getAcousticImmittanceAssessment <em>Acoustic Immittance Assessment</em>}</li>
 * </ul>
 *
 * @see admittance.AdmittancePackage#getDocumentRoot()
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
	 * @see admittance.AdmittancePackage#getDocumentRoot_Mixed()
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
	 * @see admittance.AdmittancePackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see admittance.AdmittancePackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

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
	 * @see admittance.AdmittancePackage#getDocumentRoot_AcousticImmittanceAssessment()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AcousticImmittanceAssessment' namespace='##targetNamespace'"
	 * @generated
	 */
	AcousticImmittanceAssessmentType getAcousticImmittanceAssessment();

	/**
	 * Sets the value of the '{@link admittance.DocumentRoot#getAcousticImmittanceAssessment <em>Acoustic Immittance Assessment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acoustic Immittance Assessment</em>' containment reference.
	 * @see #getAcousticImmittanceAssessment()
	 * @generated
	 */
	void setAcousticImmittanceAssessment(AcousticImmittanceAssessmentType value);

} // DocumentRoot
