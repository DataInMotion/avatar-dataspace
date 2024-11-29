/*
 */
package org.emau.icmvc.ganimed.ttp.cm2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Type19</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType19#getConsents <em>Consents</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getReturnType19()
 * @model extendedMetaData="name='return_._19_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ReturnType19 extends EObject {
	/**
	 * Returns the value of the '<em><b>Consents</b></em>' containment reference list.
	 * The list contents are of type {@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consents</em>' containment reference list.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getReturnType19_Consents()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='consents'"
	 * @generated
	 */
	EList<ConsentLightDTO> getConsents();

} // ReturnType19
