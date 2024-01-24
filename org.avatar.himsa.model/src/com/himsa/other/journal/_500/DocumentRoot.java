/*
 */
package com.himsa.other.journal._500;

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
 *   <li>{@link com.himsa.other.journal._500.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.himsa.other.journal._500.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link com.himsa.other.journal._500.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link com.himsa.other.journal._500.DocumentRoot#getHIMSAJournalStandard <em>HIMSA Journal Standard</em>}</li>
 * </ul>
 *
 * @see com.himsa.other.journal._500._500Package#getDocumentRoot()
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
	 * @see com.himsa.other.journal._500._500Package#getDocumentRoot_Mixed()
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
	 * @see com.himsa.other.journal._500._500Package#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see com.himsa.other.journal._500._500Package#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

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
	 * @see com.himsa.other.journal._500._500Package#getDocumentRoot_HIMSAJournalStandard()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HIMSAJournalStandard' namespace='##targetNamespace'"
	 * @generated
	 */
	HIMSAJournalStandardType getHIMSAJournalStandard();

	/**
	 * Sets the value of the '{@link com.himsa.other.journal._500.DocumentRoot#getHIMSAJournalStandard <em>HIMSA Journal Standard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HIMSA Journal Standard</em>' containment reference.
	 * @see #getHIMSAJournalStandard()
	 * @generated
	 */
	void setHIMSAJournalStandard(HIMSAJournalStandardType value);

} // DocumentRoot
