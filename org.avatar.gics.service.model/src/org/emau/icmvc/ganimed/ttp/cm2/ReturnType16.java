/*
 */
package org.emau.icmvc.ganimed.ttp.cm2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Type16</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType16#getConsentTemplates <em>Consent Templates</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getReturnType16()
 * @model extendedMetaData="name='return_._16_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ReturnType16 extends EObject {
	/**
	 * Returns the value of the '<em><b>Consent Templates</b></em>' containment reference list.
	 * The list contents are of type {@link org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consent Templates</em>' containment reference list.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getReturnType16_ConsentTemplates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='consentTemplates'"
	 * @generated
	 */
	EList<ConsentTemplateDTO> getConsentTemplates();

} // ReturnType16
