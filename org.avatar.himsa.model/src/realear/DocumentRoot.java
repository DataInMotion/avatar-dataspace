/*
 */
package realear;

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
 *   <li>{@link realear.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link realear.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link realear.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link realear.DocumentRoot#getHIMSARemStandard <em>HIMSA Rem Standard</em>}</li>
 * </ul>
 *
 * @see realear.RealearPackage#getDocumentRoot()
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
	 * @see realear.RealearPackage#getDocumentRoot_Mixed()
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
	 * @see realear.RealearPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see realear.RealearPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

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
	 * @see realear.RealearPackage#getDocumentRoot_HIMSARemStandard()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HIMSARemStandard' namespace='##targetNamespace'"
	 * @generated
	 */
	HIMSARemStandardType getHIMSARemStandard();

	/**
	 * Sets the value of the '{@link realear.DocumentRoot#getHIMSARemStandard <em>HIMSA Rem Standard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HIMSA Rem Standard</em>' containment reference.
	 * @see #getHIMSARemStandard()
	 * @generated
	 */
	void setHIMSARemStandard(HIMSARemStandardType value);

} // DocumentRoot
