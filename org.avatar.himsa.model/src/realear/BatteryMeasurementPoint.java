/*
 */
package realear;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Battery Measurement Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A measurement point for Battery Current measurements.
 * 
 * ## TBatMeasPoint; ## 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link realear.BatteryMeasurementPoint#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link realear.BatteryMeasurementPoint#getCurrent <em>Current</em>}</li>
 * </ul>
 *
 * @see realear.RealearPackage#getBatteryMeasurementPoint()
 * @model extendedMetaData="name='BatteryMeasurementPoint' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BatteryMeasurementPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The frequency at which the measurement
	 * was done.
	 * 
	 * ##freq##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(BigInteger)
	 * @see realear.RealearPackage#getBatteryMeasurementPoint_Frequency()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='Frequency' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getFrequency();

	/**
	 * Sets the value of the '{@link realear.BatteryMeasurementPoint#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hearing Instrument Battery Current measured in mA x 100 (Hundredths of milli-
	 * Ampere). 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current</em>' attribute.
	 * @see #setCurrent(BigDecimal)
	 * @see realear.RealearPackage#getBatteryMeasurementPoint_Current()
	 * @model dataType="realear.CurrentType" required="true"
	 *        extendedMetaData="kind='element' name='Current' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getCurrent();

	/**
	 * Sets the value of the '{@link realear.BatteryMeasurementPoint#getCurrent <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' attribute.
	 * @see #getCurrent()
	 * @generated
	 */
	void setCurrent(BigDecimal value);

} // BatteryMeasurementPoint
