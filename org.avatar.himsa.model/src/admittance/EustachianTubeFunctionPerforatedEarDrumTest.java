/*
 */
package admittance;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eustachian Tube Function Perforated Ear Drum Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Eustachian Tube Function for Perforated ear drum
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link admittance.EustachianTubeFunctionPerforatedEarDrumTest#getPressurePoint <em>Pressure Point</em>}</li>
 *   <li>{@link admittance.EustachianTubeFunctionPerforatedEarDrumTest#getOpenPoint <em>Open Point</em>}</li>
 *   <li>{@link admittance.EustachianTubeFunctionPerforatedEarDrumTest#getClosePoint <em>Close Point</em>}</li>
 *   <li>{@link admittance.EustachianTubeFunctionPerforatedEarDrumTest#getTimeBase <em>Time Base</em>}</li>
 * </ul>
 *
 * @see admittance.AdmittancePackage#getEustachianTubeFunctionPerforatedEarDrumTest()
 * @model extendedMetaData="name='EustachianTubeFunctionPerforatedEarDrumTest' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EustachianTubeFunctionPerforatedEarDrumTest extends EObject {
	/**
	 * Returns the value of the '<em><b>Pressure Point</b></em>' containment reference list.
	 * The list contents are of type {@link admittance.PressurePointType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measurement points
	 * 
	 * 
	 * @@ Format 501 to 500 conversion
	 * 
	 * Format 500 was defned to have a max of 200 points which is now removed.
	 * 
	 * When converting data HIMSA will take a simple approach and convert the first 200 points and will drop the remaining points.  
	 * 
	 * @@
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pressure Point</em>' containment reference list.
	 * @see admittance.AdmittancePackage#getEustachianTubeFunctionPerforatedEarDrumTest_PressurePoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PressurePoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PressurePointType> getPressurePoint();

	/**
	 * Returns the value of the '<em><b>Open Point</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eustachian Tube Open Pressure Point deka Pascal
	 * 
	 * @@ Format 501 to 500 conversion
	 * 
	 * Format 500 was defned to have a max of 3 points which is now removed.
	 * 
	 * When converting data HIMSA will take a simple approach and convert the first 3points and will drop the remaining points.  
	 * 
	 * @@
	 * 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Open Point</em>' attribute list.
	 * @see admittance.AdmittancePackage#getEustachianTubeFunctionPerforatedEarDrumTest_OpenPoint()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='OpenPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BigInteger> getOpenPoint();

	/**
	 * Returns the value of the '<em><b>Close Point</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eustachian Tube Close Pressure Point deka Pascal
	 * 
	 * 
	 * @@ Format 501 to 500 conversion
	 * 
	 * Format 500 was defned to have a max of 3 points which is now removed.
	 * 
	 * When converting data HIMSA will take a simple approach and convert the first 3points and will drop the remaining points.  
	 * 
	 * @@
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Close Point</em>' attribute list.
	 * @see admittance.AdmittancePackage#getEustachianTubeFunctionPerforatedEarDrumTest_ClosePoint()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='ClosePoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BigInteger> getClosePoint();

	/**
	 * Returns the value of the '<em><b>Time Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time that it took the test
	 * 
	 * Please note that this element will not be converted down to format 100 if requested by another Noah compatible software program.  This is due to the fact that two different versions of format 100 Impedance exist and the safest action is to not pass this element back to a module wishing to read in format 100.  Additionally, another software program reading this test should not find this data missing as critical.
	 * 
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Base</em>' attribute.
	 * @see #setTimeBase(BigDecimal)
	 * @see admittance.AdmittancePackage#getEustachianTubeFunctionPerforatedEarDrumTest_TimeBase()
	 * @model dataType="admittance.TimeBaseType"
	 *        extendedMetaData="kind='element' name='TimeBase' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTimeBase();

	/**
	 * Sets the value of the '{@link admittance.EustachianTubeFunctionPerforatedEarDrumTest#getTimeBase <em>Time Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Base</em>' attribute.
	 * @see #getTimeBase()
	 * @generated
	 */
	void setTimeBase(BigDecimal value);

} // EustachianTubeFunctionPerforatedEarDrumTest
