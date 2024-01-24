/*
 */
package admittance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measured Admittance Points Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link admittance.MeasuredAdmittancePointsType#getPt <em>Pt</em>}</li>
 * </ul>
 *
 * @see admittance.AdmittancePackage#getMeasuredAdmittancePointsType()
 * @model extendedMetaData="name='MeasuredAdmittancePoints_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MeasuredAdmittancePointsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Pt</b></em>' containment reference list.
	 * The list contents are of type {@link admittance.AdmittanceValuePointMeasuredType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @@
	 * 
	 * 501  500, the number of points is capped at 250 for format 500.  HIMSA applies an algorithm to preserve the shape of the curve while reducing the number of points.
	 * HIMSA is using a modified version of the Algorithm referred to as Douglas-Peucker N – description following here:
	 * 
	 * http://psimpl.sourceforge.net/douglas-peucker.html
	 * In this paper it is concluded that DP is the best shape preserving algorithm of tested ones:
	 * 
	 * http://citeseerx.ist.psu.edu/viewdo...p;type=pdf
	 * For the visually oriented the concept of the algorithm can be seen here:
	 * 
	 * http://mourner.github.io/simplify-js/
	 * @@
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pt</em>' containment reference list.
	 * @see admittance.AdmittancePackage#getMeasuredAdmittancePointsType_Pt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Pt' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AdmittanceValuePointMeasuredType> getPt();

} // MeasuredAdmittancePointsType
