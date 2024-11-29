/*
 */
package org.emau.icmvc.ganimed.ttp.cm2;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get All Consents For Consent Template Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForConsentTemplateResponse#getReturn <em>Return</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetAllConsentsForConsentTemplateResponse()
 * @model extendedMetaData="name='getAllConsentsForConsentTemplateResponse' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GetAllConsentsForConsentTemplateResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' containment reference.
	 * @see #isSetReturn()
	 * @see #unsetReturn()
	 * @see #setReturn(ReturnType7)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetAllConsentsForConsentTemplateResponse_Return()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='return'"
	 * @generated
	 */
	ReturnType7 getReturn();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForConsentTemplateResponse#getReturn <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' containment reference.
	 * @see #isSetReturn()
	 * @see #unsetReturn()
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(ReturnType7 value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForConsentTemplateResponse#getReturn <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReturn()
	 * @see #getReturn()
	 * @see #setReturn(ReturnType7)
	 * @generated
	 */
	void unsetReturn();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForConsentTemplateResponse#getReturn <em>Return</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Return</em>' containment reference is set.
	 * @see #unsetReturn()
	 * @see #getReturn()
	 * @see #setReturn(ReturnType7)
	 * @generated
	 */
	boolean isSetReturn();

} // GetAllConsentsForConsentTemplateResponse
