/*
 */
package org.emau.icmvc.ganimed.ttp.cm2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Type17</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType17#getQcProblemHistories <em>Qc Problem Histories</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getReturnType17()
 * @model extendedMetaData="name='return_._17_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ReturnType17 extends EObject {
	/**
	 * Returns the value of the '<em><b>Qc Problem Histories</b></em>' containment reference list.
	 * The list contents are of type {@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemHistoryDTO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qc Problem Histories</em>' containment reference list.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getReturnType17_QcProblemHistories()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='qcProblemHistories'"
	 * @generated
	 */
	EList<QcProblemHistoryDTO> getQcProblemHistories();

} // ReturnType17
