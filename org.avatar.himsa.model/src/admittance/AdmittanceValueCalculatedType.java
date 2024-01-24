/*
 */
package admittance;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Calculated Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Admittance Curve depicts the modulus recording of the admittance, i.e. the length of a complex value, calculated by using Pythagoras´ sentence. In this
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
 * @@ 500 to 501 name change
 * admittanceValueCalculated_Type to AdmittanceValueCalculated_Type
 * @@
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link admittance.AdmittanceValueCalculatedType#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see admittance.AdmittancePackage#getAdmittanceValueCalculatedType()
 * @model extendedMetaData="name='AdmittanceValueCalculated_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AdmittanceValueCalculatedType extends EObject {
	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The calculated value (Y)
	 * 
	 * When saving data the calculated value is simply stored in this element.
	 * 
	 * When reading a measured element the below formula can be used to obtain the calculated value.  
	 * 
	 * square root ((G x G) + (B x B))
	 * 
	 * Acoustic admittance requires two numbers to specify its location in the complex plane, and is a vector which rotates in a circular manner tied to the probe frequency. In order to place the admittance values accurately a complex number is recorded which has a real and an imaginary element.
	 * 
	 * @@ Convert DOWN Rules 501 to 500
	 * 
	 * This element is first introduced in format 501 so when converting down this value will need to be transfered to admittanceValue_Type > Argument1.  Read the conversion directions for the Element G.  Additionally, admittanceValue_Type >Argument2 will need to be given a value of 0
	 * 
	 * @@
	 * 
	 * 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(BigDecimal)
	 * @see admittance.AdmittancePackage#getAdmittanceValueCalculatedType_Y()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal" required="true"
	 *        extendedMetaData="kind='element' name='Y' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getY();

	/**
	 * Sets the value of the '{@link admittance.AdmittanceValueCalculatedType#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(BigDecimal value);

} // AdmittanceValueCalculatedType
