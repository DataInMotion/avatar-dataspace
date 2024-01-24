/*
 */
package admittance;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reflex Value Point Measured Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The admittance Curve depicts the modulus recording of the admittance, i.e. the length of a complex value, calculated by using Pythagoras´ sentence. In this
 * structure, both the real and the imaginary part of the value or the value is saved, but for practical purposes, the admittance can be considered 90 degrees out of
 * phase (real part approximately zero) at the Max. admittance point. This rule applies only for probe frequencies near 220 Hz e.g. 226 Hz.
 * 
 * The application saving the data which comes from an automated solution (gathering all data from the device) is assumed to save data via the Measured choice and provide the G and B values.  Y can later be caluculated by any applicaiton reading the data.
 * 
 * OR
 * 
 * If the applicaiton (e.g. HIMSA's Audiogram module) provides a simple/manual method to record results it is assumed to use the Calculated choice
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link admittance.ReflexValuePointMeasuredType#getTime <em>Time</em>}</li>
 *   <li>{@link admittance.ReflexValuePointMeasuredType#getDeltaG <em>Delta G</em>}</li>
 *   <li>{@link admittance.ReflexValuePointMeasuredType#getDeltaB <em>Delta B</em>}</li>
 * </ul>
 *
 * @see admittance.AdmittancePackage#getReflexValuePointMeasuredType()
 * @model extendedMetaData="name='ReflexValuePointMeasured_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ReflexValuePointMeasuredType extends EObject {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time in seconds  X-Values of the point
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(BigDecimal)
	 * @see admittance.AdmittancePackage#getReflexValuePointMeasuredType_Time()
	 * @model dataType="admittance.TimeType1" required="true"
	 *        extendedMetaData="kind='element' name='Time' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTime();

	/**
	 * Sets the value of the '{@link admittance.ReflexValuePointMeasuredType#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Delta G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Real part of the delta Y Point 
	 * 
	 * 
	 * 
	 * @@ Convert DOWN Rules 501 to 500
	 * This value does not directly converter down to format 500, see conversion instructions under DeltaY
	 * @@
	 * 
	 * 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta G</em>' attribute.
	 * @see #setDeltaG(BigDecimal)
	 * @see admittance.AdmittancePackage#getReflexValuePointMeasuredType_DeltaG()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal" required="true"
	 *        extendedMetaData="kind='element' name='DeltaG' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getDeltaG();

	/**
	 * Sets the value of the '{@link admittance.ReflexValuePointMeasuredType#getDeltaG <em>Delta G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta G</em>' attribute.
	 * @see #getDeltaG()
	 * @generated
	 */
	void setDeltaG(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Delta B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Imaginary part of the delta Y Point
	 * 
	 * 
	 * @@ Convert DOWN Rules 501 to 500
	 * This value does not directly converter down to format 500, see conversion instructions under DeltaY
	 * @@
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta B</em>' attribute.
	 * @see #setDeltaB(BigDecimal)
	 * @see admittance.AdmittancePackage#getReflexValuePointMeasuredType_DeltaB()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal" required="true"
	 *        extendedMetaData="kind='element' name='DeltaB' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getDeltaB();

	/**
	 * Sets the value of the '{@link admittance.ReflexValuePointMeasuredType#getDeltaB <em>Delta B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta B</em>' attribute.
	 * @see #getDeltaB()
	 * @generated
	 */
	void setDeltaB(BigDecimal value);

} // ReflexValuePointMeasuredType
