/*
 */
package org.emau.icmvc.ganimed.ttp.cm2;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Consent Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentTemplate#getConsentTemplateKey <em>Consent Template Key</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetConsentTemplate()
 * @model extendedMetaData="name='getConsentTemplate' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GetConsentTemplate extends EObject {
	/**
	 * Returns the value of the '<em><b>Consent Template Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consent Template Key</em>' containment reference.
	 * @see #setConsentTemplateKey(ConsentTemplateKeyDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetConsentTemplate_ConsentTemplateKey()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='consentTemplateKey'"
	 * @generated
	 */
	ConsentTemplateKeyDTO getConsentTemplateKey();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentTemplate#getConsentTemplateKey <em>Consent Template Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consent Template Key</em>' containment reference.
	 * @see #getConsentTemplateKey()
	 * @generated
	 */
	void setConsentTemplateKey(ConsentTemplateKeyDTO value);

} // GetConsentTemplate
