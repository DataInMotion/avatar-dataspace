/*
 */
package org.emau.icmvc.ganimed.ttp.cm2.config;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.FilterType#getEntry <em>Entry</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getFilterType()
 * @model extendedMetaData="name='filter_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FilterType extends EObject {
	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.emau.icmvc.ganimed.ttp.cm2.config.EntryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference list.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getFilterType_Entry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entry'"
	 * @generated
	 */
	EList<EntryType> getEntry();

} // FilterType
