/*
 */
package com.himsa.patient.export.patient.export;

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
 *   <li>{@link com.himsa.patient.export.patient.export.PatientsType#getGroup <em>Group</em>}</li>
 *   <li>{@link com.himsa.patient.export.patient.export.PatientsType#getPatient <em>Patient</em>}</li>
 * </ul>
 *
 * @see com.himsa.patient.export.patient.export.ExportPackage#getPatientsType()
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
	 * @see com.himsa.patient.export.patient.export.ExportPackage#getPatientsType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.patient.export.patient.export.PatientType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference list.
	 * @see com.himsa.patient.export.patient.export.ExportPackage#getPatientsType_Patient()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Patient' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PatientType1> getPatient();

} // PatientsType
