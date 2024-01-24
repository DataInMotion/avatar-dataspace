/*
 */
package audiogram502;

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
 *   <li>{@link audiogram502.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link audiogram502.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link audiogram502.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link audiogram502.DocumentRoot#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}</li>
 *   <li>{@link audiogram502.DocumentRoot#getHIMSAAudiometricStandard <em>HIMSA Audiometric Standard</em>}</li>
 * </ul>
 *
 * @see audiogram502.Audiogram502Package#getDocumentRoot()
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
	 * @see audiogram502.Audiogram502Package#getDocumentRoot_Mixed()
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
	 * @see audiogram502.Audiogram502Package#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see audiogram502.Audiogram502Package#getDocumentRoot_XSISchemaLocation()
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
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aud Measurement Conditions</em>' containment reference.
	 * @see #setAudMeasurementConditions(AudioMetricMeasurementConditionsType)
	 * @see audiogram502.Audiogram502Package#getDocumentRoot_AudMeasurementConditions()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AudMeasurementConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	AudioMetricMeasurementConditionsType getAudMeasurementConditions();

	/**
	 * Sets the value of the '{@link audiogram502.DocumentRoot#getAudMeasurementConditions <em>Aud Measurement Conditions</em>}' containment reference.
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
	 * @return the value of the '<em>HIMSA Audiometric Standard</em>' containment reference.
	 * @see #setHIMSAAudiometricStandard(HIMSAAudiometricStandardType)
	 * @see audiogram502.Audiogram502Package#getDocumentRoot_HIMSAAudiometricStandard()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HIMSAAudiometricStandard' namespace='##targetNamespace'"
	 * @generated
	 */
	HIMSAAudiometricStandardType getHIMSAAudiometricStandard();

	/**
	 * Sets the value of the '{@link audiogram502.DocumentRoot#getHIMSAAudiometricStandard <em>HIMSA Audiometric Standard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HIMSA Audiometric Standard</em>' containment reference.
	 * @see #getHIMSAAudiometricStandard()
	 * @generated
	 */
	void setHIMSAAudiometricStandard(HIMSAAudiometricStandardType value);

} // DocumentRoot
