/*
 */
package org.emau.icmvc.ganimed.ttp.cm2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Type14</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType14#getQcHistories <em>Qc Histories</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getReturnType14()
 * @model extendedMetaData="name='return_._14_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ReturnType14 extends EObject {
	/**
	 * Returns the value of the '<em><b>Qc Histories</b></em>' containment reference list.
	 * The list contents are of type {@link org.emau.icmvc.ganimed.ttp.cm2.QcHistoryDTO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qc Histories</em>' containment reference list.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getReturnType14_QcHistories()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='qcHistories'"
	 * @generated
	 */
	EList<QcHistoryDTO> getQcHistories();

} // ReturnType14
