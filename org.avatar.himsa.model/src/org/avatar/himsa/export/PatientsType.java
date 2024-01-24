/*
 */
package org.avatar.himsa.export;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patients Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.avatar.himsa.export.PatientsType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.avatar.himsa.export.PatientsType#getPatient <em>Patient</em>}</li>
 * </ul>
 *
 * @see org.avatar.himsa.export.PatientExportPackage#getPatientsType()
 * @model extendedMetaData="name='Patients_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PatientsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatientsType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference list.
	 * The list contents are of type {@link org.avatar.himsa.export.PatientType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference list.
	 * @see org.avatar.himsa.export.PatientExportPackage#getPatientsType_Patient()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Patient' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PatientType1> getPatient();

} // PatientsType
