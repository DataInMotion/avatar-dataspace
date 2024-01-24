/*
 */
package com.himsa.measurement.audiogram.metadata._500;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AMCLASS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.audiogram.metadata._500.AMCLASSType#getSiteOfLesion <em>Site Of Lesion</em>}</li>
 *   <li>{@link com.himsa.measurement.audiogram.metadata._500.AMCLASSType#getConfigurationSeverityChoice <em>Configuration Severity Choice</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.audiogram.metadata._500._500Package#getAMCLASSType()
 * @model extendedMetaData="name='AMCLASS_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AMCLASSType extends EObject {
	/**
	 * Returns the value of the '<em><b>Site Of Lesion</b></em>' attribute.
	 * The literals are from the enumeration {@link com.himsa.measurement.audiogram.metadata._500.SiteOfLesionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Of Lesion</em>' attribute.
	 * @see com.himsa.measurement.audiogram.metadata._500.SiteOfLesionType
	 * @see #isSetSiteOfLesion()
	 * @see #unsetSiteOfLesion()
	 * @see #setSiteOfLesion(SiteOfLesionType)
	 * @see com.himsa.measurement.audiogram.metadata._500._500Package#getAMCLASSType_SiteOfLesion()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='SiteOfLesion' namespace='##targetNamespace'"
	 * @generated
	 */
	SiteOfLesionType getSiteOfLesion();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram.metadata._500.AMCLASSType#getSiteOfLesion <em>Site Of Lesion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Of Lesion</em>' attribute.
	 * @see com.himsa.measurement.audiogram.metadata._500.SiteOfLesionType
	 * @see #isSetSiteOfLesion()
	 * @see #unsetSiteOfLesion()
	 * @see #getSiteOfLesion()
	 * @generated
	 */
	void setSiteOfLesion(SiteOfLesionType value);

	/**
	 * Unsets the value of the '{@link com.himsa.measurement.audiogram.metadata._500.AMCLASSType#getSiteOfLesion <em>Site Of Lesion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSiteOfLesion()
	 * @see #getSiteOfLesion()
	 * @see #setSiteOfLesion(SiteOfLesionType)
	 * @generated
	 */
	void unsetSiteOfLesion();

	/**
	 * Returns whether the value of the '{@link com.himsa.measurement.audiogram.metadata._500.AMCLASSType#getSiteOfLesion <em>Site Of Lesion</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Site Of Lesion</em>' attribute is set.
	 * @see #unsetSiteOfLesion()
	 * @see #getSiteOfLesion()
	 * @see #setSiteOfLesion(SiteOfLesionType)
	 * @generated
	 */
	boolean isSetSiteOfLesion();

	/**
	 * Returns the value of the '<em><b>Configuration Severity Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Severity Choice</em>' containment reference.
	 * @see #setConfigurationSeverityChoice(ConfigurationSeverityChoiceType)
	 * @see com.himsa.measurement.audiogram.metadata._500._500Package#getAMCLASSType_ConfigurationSeverityChoice()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ConfigurationSeverityChoice' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfigurationSeverityChoiceType getConfigurationSeverityChoice();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.audiogram.metadata._500.AMCLASSType#getConfigurationSeverityChoice <em>Configuration Severity Choice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Severity Choice</em>' containment reference.
	 * @see #getConfigurationSeverityChoice()
	 * @generated
	 */
	void setConfigurationSeverityChoice(ConfigurationSeverityChoiceType value);

} // AMCLASSType
