/*
 */
package com.himsa.measurement.real.ear;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Measurement Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A measurement point for Attack / Release measurements. This
 * structure only contains an output level value, the input curve is
 * not saved.
 * 
 * ## TARMeasPoint ##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.real.ear.TargetMeasurementPoint#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.real.ear.EarPackage#getTargetMeasurementPoint()
 * @model extendedMetaData="name='TargetMeasurementPoint' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TargetMeasurementPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigDecimal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Output Level Attack or Release curve. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output</em>' attribute list.
	 * @see com.himsa.measurement.real.ear.EarPackage#getTargetMeasurementPoint_Output()
	 * @model unique="false" dataType="com.himsa.measurement.real.ear.OutputType1" required="true" upper="256"
	 *        extendedMetaData="kind='element' name='Output' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BigDecimal> getOutput();

} // TargetMeasurementPoint
