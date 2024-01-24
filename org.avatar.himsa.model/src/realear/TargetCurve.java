/*
 */
package realear;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A single curve for partial info of an Attack/Release measurement.
 * The structure can contain either an attack or a release curve.
 * 
 * ## TARCurve ##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link realear.TargetCurve#getCurve <em>Curve</em>}</li>
 *   <li>{@link realear.TargetCurve#getResult <em>Result</em>}</li>
 *   <li>{@link realear.TargetCurve#getResolution <em>Resolution</em>}</li>
 *   <li>{@link realear.TargetCurve#getPreDelay <em>Pre Delay</em>}</li>
 * </ul>
 *
 * @see realear.RealearPackage#getTargetCurve()
 * @model extendedMetaData="name='TargetCurve' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TargetCurve extends EObject {
	/**
	 * Returns the value of the '<em><b>Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The curve itself
	 * 
	 * ## Curve ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Curve</em>' containment reference.
	 * @see #setCurve(TargetMeasurementPoint)
	 * @see realear.RealearPackage#getTargetCurve_Curve()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Curve' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetMeasurementPoint getCurve();

	/**
	 * Sets the value of the '{@link realear.TargetCurve#getCurve <em>Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve</em>' containment reference.
	 * @see #getCurve()
	 * @generated
	 */
	void setCurve(TargetMeasurementPoint value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The result of an Attack / Release Measurement is defined as the
	 * point in time where the output of the Hearing Instrument is
	 * stabilized at a new level. As stimulus is used a sinus wave.
	 * 
	 * The time resolution of the measurement (in milliseconds).
	 * 
	 * ## Result ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #setResult(BigInteger)
	 * @see realear.RealearPackage#getTargetCurve_Result()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='Result' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getResult();

	/**
	 * Sets the value of the '{@link realear.TargetCurve#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expresses the time resolution of the Attack / Release Measurement.
	 * (In milliseconds).
	 * 
	 * ## Resolution ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see #setResolution(BigInteger)
	 * @see realear.RealearPackage#getTargetCurve_Resolution()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='Resolution' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getResolution();

	/**
	 * Sets the value of the '{@link realear.TargetCurve#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' attribute.
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Pre Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The predelay is saved in the Attack Release Curve as the no. of
	 * milliseconds included in the curve before the level change.
	 * 
	 * ## PreDelay ##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Delay</em>' attribute.
	 * @see #setPreDelay(BigInteger)
	 * @see realear.RealearPackage#getTargetCurve_PreDelay()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='PreDelay' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPreDelay();

	/**
	 * Sets the value of the '{@link realear.TargetCurve#getPreDelay <em>Pre Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Delay</em>' attribute.
	 * @see #getPreDelay()
	 * @generated
	 */
	void setPreDelay(BigInteger value);

} // TargetCurve
