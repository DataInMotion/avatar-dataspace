/*
 */
package com.himsa.measurement.admittance._501;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supplementary Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.admittance._501.SupplementaryDataType#getInformation <em>Information</em>}</li>
 *   <li>{@link com.himsa.measurement.admittance._501.SupplementaryDataType#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.admittance._501._501Package#getSupplementaryDataType()
 * @model extendedMetaData="name='SupplementaryData_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SupplementaryDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information</em>' containment reference.
	 * @see #setInformation(InformationType)
	 * @see com.himsa.measurement.admittance._501._501Package#getSupplementaryDataType_Information()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Information' namespace='##targetNamespace'"
	 * @generated
	 */
	InformationType getInformation();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.admittance._501.SupplementaryDataType#getInformation <em>Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information</em>' containment reference.
	 * @see #getInformation()
	 * @generated
	 */
	void setInformation(InformationType value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any legal formatted XML data.  This data does conform to this 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see com.himsa.measurement.admittance._501._501Package#getSupplementaryDataType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##any' name=':1' processing='skip'"
	 * @generated
	 */
	FeatureMap getAny();

} // SupplementaryDataType
