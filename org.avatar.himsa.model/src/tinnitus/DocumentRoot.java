/*
 */
package tinnitus;

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
 *   <li>{@link tinnitus.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link tinnitus.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link tinnitus.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link tinnitus.DocumentRoot#getTinnitusMeasurementData <em>Tinnitus Measurement Data</em>}</li>
 * </ul>
 *
 * @see tinnitus.TinnitusPackage#getDocumentRoot()
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
	 * @see tinnitus.TinnitusPackage#getDocumentRoot_Mixed()
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
	 * @see tinnitus.TinnitusPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see tinnitus.TinnitusPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

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
	 * Tinnitus measurements that can be used to quantify subjective tinnitus measurements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tinnitus Measurement Data</em>' containment reference.
	 * @see #setTinnitusMeasurementData(TinnitusMeasurementDataType)
	 * @see tinnitus.TinnitusPackage#getDocumentRoot_TinnitusMeasurementData()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TinnitusMeasurementData' namespace='##targetNamespace'"
	 * @generated
	 */
	TinnitusMeasurementDataType getTinnitusMeasurementData();

	/**
	 * Sets the value of the '{@link tinnitus.DocumentRoot#getTinnitusMeasurementData <em>Tinnitus Measurement Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tinnitus Measurement Data</em>' containment reference.
	 * @see #getTinnitusMeasurementData()
	 * @generated
	 */
	void setTinnitusMeasurementData(TinnitusMeasurementDataType value);

} // DocumentRoot
