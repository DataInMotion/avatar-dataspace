/*
 */
package com.himsa.measurement.tinnitus._500;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bandwidth Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The width of the shaped noise defined by upper and lower limits in Hz.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.measurement.tinnitus._500.BandwidthType#getUpperLimit <em>Upper Limit</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.BandwidthType#getUpperSlope <em>Upper Slope</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.BandwidthType#getPlateauSlope <em>Plateau Slope</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.BandwidthType#getLowerLimit <em>Lower Limit</em>}</li>
 *   <li>{@link com.himsa.measurement.tinnitus._500.BandwidthType#getLowerSlope <em>Lower Slope</em>}</li>
 * </ul>
 *
 * @see com.himsa.measurement.tinnitus._500._500Package#getBandwidthType()
 * @model extendedMetaData="name='Bandwidth_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BandwidthType extends EObject {
	/**
	 * Returns the value of the '<em><b>Upper Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The upper cutoff frequency of the shaped noise
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Limit</em>' attribute.
	 * @see #setUpperLimit(BigDecimal)
	 * @see com.himsa.measurement.tinnitus._500._500Package#getBandwidthType_UpperLimit()
	 * @model dataType="com.himsa.measurement.tinnitus._500.UpperLimitType"
	 *        extendedMetaData="kind='element' name='UpperLimit' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getUpperLimit();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.tinnitus._500.BandwidthType#getUpperLimit <em>Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Limit</em>' attribute.
	 * @see #getUpperLimit()
	 * @generated
	 */
	void setUpperLimit(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Upper Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The slope of the shaped noise from center frequency to upper cutoff frequency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Slope</em>' attribute.
	 * @see #setUpperSlope(BigDecimal)
	 * @see com.himsa.measurement.tinnitus._500._500Package#getBandwidthType_UpperSlope()
	 * @model dataType="com.himsa.measurement.tinnitus._500.UpperSlopeType" required="true"
	 *        extendedMetaData="kind='element' name='UpperSlope' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getUpperSlope();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.tinnitus._500.BandwidthType#getUpperSlope <em>Upper Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Slope</em>' attribute.
	 * @see #getUpperSlope()
	 * @generated
	 */
	void setUpperSlope(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Plateau Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The slope at the center frequency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plateau Slope</em>' attribute.
	 * @see #setPlateauSlope(BigDecimal)
	 * @see com.himsa.measurement.tinnitus._500._500Package#getBandwidthType_PlateauSlope()
	 * @model dataType="com.himsa.measurement.tinnitus._500.PlateauSlopeType"
	 *        extendedMetaData="kind='element' name='PlateauSlope' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getPlateauSlope();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.tinnitus._500.BandwidthType#getPlateauSlope <em>Plateau Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plateau Slope</em>' attribute.
	 * @see #getPlateauSlope()
	 * @generated
	 */
	void setPlateauSlope(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Lower Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lower cutoff frequency of the shaped noise
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower Limit</em>' attribute.
	 * @see #setLowerLimit(BigDecimal)
	 * @see com.himsa.measurement.tinnitus._500._500Package#getBandwidthType_LowerLimit()
	 * @model dataType="com.himsa.measurement.tinnitus._500.LowerLimitType"
	 *        extendedMetaData="kind='element' name='LowerLimit' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getLowerLimit();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.tinnitus._500.BandwidthType#getLowerLimit <em>Lower Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Limit</em>' attribute.
	 * @see #getLowerLimit()
	 * @generated
	 */
	void setLowerLimit(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Lower Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The slope of the shaped noise from center frequency to lower cutoff frequency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower Slope</em>' attribute.
	 * @see #setLowerSlope(BigDecimal)
	 * @see com.himsa.measurement.tinnitus._500._500Package#getBandwidthType_LowerSlope()
	 * @model dataType="com.himsa.measurement.tinnitus._500.LowerSlopeType" required="true"
	 *        extendedMetaData="kind='element' name='LowerSlope' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getLowerSlope();

	/**
	 * Sets the value of the '{@link com.himsa.measurement.tinnitus._500.BandwidthType#getLowerSlope <em>Lower Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Slope</em>' attribute.
	 * @see #getLowerSlope()
	 * @generated
	 */
	void setLowerSlope(BigDecimal value);

} // BandwidthType
