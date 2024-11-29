/*
 */
package org.emau.icmvc.ganimed.ttp.cm2;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fhir Id DTO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.FhirIdDTO#getFhirID <em>Fhir ID</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getFhirIdDTO()
 * @model abstract="true"
 *        extendedMetaData="name='fhirIdDTO' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FhirIdDTO extends EObject {
	/**
	 * Returns the value of the '<em><b>Fhir ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fhir ID</em>' attribute.
	 * @see #setFhirID(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getFhirIdDTO_FhirID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='fhirID'"
	 * @generated
	 */
	String getFhirID();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.FhirIdDTO#getFhirID <em>Fhir ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fhir ID</em>' attribute.
	 * @see #getFhirID()
	 * @generated
	 */
	void setFhirID(String value);

} // FhirIdDTO
