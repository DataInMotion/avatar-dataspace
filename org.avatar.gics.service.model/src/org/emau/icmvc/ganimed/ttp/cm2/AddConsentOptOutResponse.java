/*
 */
package org.emau.icmvc.ganimed.ttp.cm2;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Consent Opt Out Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.AddConsentOptOutResponse#getReturn <em>Return</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAddConsentOptOutResponse()
 * @model extendedMetaData="name='addConsentOptOutResponse' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AddConsentOptOutResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' containment reference.
	 * @see #setReturn(ConsentLightDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAddConsentOptOutResponse_Return()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='return'"
	 * @generated
	 */
	ConsentLightDTO getReturn();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AddConsentOptOutResponse#getReturn <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' containment reference.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(ConsentLightDTO value);

} // AddConsentOptOutResponse
