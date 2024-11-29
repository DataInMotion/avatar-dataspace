/*
 */
package org.emau.icmvc.ganimed.ttp.cm2;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get QC Problem History For QC Problem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.GetQCProblemHistoryForQCProblem#getQcProblem <em>Qc Problem</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.GetQCProblemHistoryForQCProblem#getConsentKey <em>Consent Key</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetQCProblemHistoryForQCProblem()
 * @model extendedMetaData="name='getQCProblemHistoryForQCProblem' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GetQCProblemHistoryForQCProblem extends EObject {
	/**
	 * Returns the value of the '<em><b>Qc Problem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qc Problem</em>' containment reference.
	 * @see #setQcProblem(QcProblemDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetQCProblemHistoryForQCProblem_QcProblem()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='qcProblem'"
	 * @generated
	 */
	QcProblemDTO getQcProblem();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetQCProblemHistoryForQCProblem#getQcProblem <em>Qc Problem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qc Problem</em>' containment reference.
	 * @see #getQcProblem()
	 * @generated
	 */
	void setQcProblem(QcProblemDTO value);

	/**
	 * Returns the value of the '<em><b>Consent Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consent Key</em>' containment reference.
	 * @see #setConsentKey(ConsentKeyDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetQCProblemHistoryForQCProblem_ConsentKey()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='consentKey'"
	 * @generated
	 */
	ConsentKeyDTO getConsentKey();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetQCProblemHistoryForQCProblem#getConsentKey <em>Consent Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consent Key</em>' containment reference.
	 * @see #getConsentKey()
	 * @generated
	 */
	void setConsentKey(ConsentKeyDTO value);

} // GetQCProblemHistoryForQCProblem
