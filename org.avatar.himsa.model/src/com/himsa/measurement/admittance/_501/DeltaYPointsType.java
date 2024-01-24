/*
 */
package com.himsa.measurement.admittance._501;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delta YPoints Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.admittance._501.DeltaYPointsType#getPt <em>Pt</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.admittance._501._501Package#getDeltaYPointsType()
 * @model extendedMetaData="name='DeltaYPoints_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeltaYPointsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Pt</b></em>' containment reference list.
	 * The list contents are of type {@link com.himsa.measurement.admittance._501.ReflexValuePointMeasuredType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pt</em>' containment reference list.
	 * @see com.himsa.measurement.admittance._501._501Package#getDeltaYPointsType_Pt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Pt' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReflexValuePointMeasuredType> getPt();

} // DeltaYPointsType
