/*
 */
package com.himsa.scan.scan.meta.data.impl;

import com.himsa.scan.scan.meta.data.DataPackage;
import com.himsa.scan.scan.meta.data.EarType;
import com.himsa.scan.scan.meta.data.JawPositionType;
import com.himsa.scan.scan.meta.data.ScanFormatType;
import com.himsa.scan.scan.meta.data.ScanPropertiesType;
import com.himsa.scan.scan.meta.data.StoredInNoahType;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scan Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.scan.scan.meta.data.impl.ScanPropertiesTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link com.himsa.scan.scan.meta.data.impl.ScanPropertiesTypeImpl#getScanTimeStamp <em>Scan Time Stamp</em>}</li>
 *   <li>{@link com.himsa.scan.scan.meta.data.impl.ScanPropertiesTypeImpl#getEar <em>Ear</em>}</li>
 *   <li>{@link com.himsa.scan.scan.meta.data.impl.ScanPropertiesTypeImpl#getJawPosition <em>Jaw Position</em>}</li>
 *   <li>{@link com.himsa.scan.scan.meta.data.impl.ScanPropertiesTypeImpl#getScanFormat <em>Scan Format</em>}</li>
 *   <li>{@link com.himsa.scan.scan.meta.data.impl.ScanPropertiesTypeImpl#getScanComment <em>Scan Comment</em>}</li>
 *   <li>{@link com.himsa.scan.scan.meta.data.impl.ScanPropertiesTypeImpl#getScanFileAndLocation <em>Scan File And Location</em>}</li>
 *   <li>{@link com.himsa.scan.scan.meta.data.impl.ScanPropertiesTypeImpl#getScanStoredInNoah <em>Scan Stored In Noah</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScanPropertiesTypeImpl extends MinimalEObjectImpl.Container implements ScanPropertiesType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScanPropertiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.SCAN_PROPERTIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, DataPackage.SCAN_PROPERTIES_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XMLGregorianCalendar> getScanTimeStamp() {
		return getGroup().list(DataPackage.Literals.SCAN_PROPERTIES_TYPE__SCAN_TIME_STAMP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EarType> getEar() {
		return getGroup().list(DataPackage.Literals.SCAN_PROPERTIES_TYPE__EAR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<JawPositionType> getJawPosition() {
		return getGroup().list(DataPackage.Literals.SCAN_PROPERTIES_TYPE__JAW_POSITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScanFormatType> getScanFormat() {
		return getGroup().list(DataPackage.Literals.SCAN_PROPERTIES_TYPE__SCAN_FORMAT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getScanComment() {
		return getGroup().list(DataPackage.Literals.SCAN_PROPERTIES_TYPE__SCAN_COMMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getScanFileAndLocation() {
		return getGroup().list(DataPackage.Literals.SCAN_PROPERTIES_TYPE__SCAN_FILE_AND_LOCATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StoredInNoahType> getScanStoredInNoah() {
		return getGroup().list(DataPackage.Literals.SCAN_PROPERTIES_TYPE__SCAN_STORED_IN_NOAH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataPackage.SCAN_PROPERTIES_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case DataPackage.SCAN_PROPERTIES_TYPE__SCAN_STORED_IN_NOAH:
				return ((InternalEList<?>)getScanStoredInNoah()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.SCAN_PROPERTIES_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case DataPackage.SCAN_PROPERTIES_TYPE__SCAN_TIME_STAMP:
				return getScanTimeStamp();
			case DataPackage.SCAN_PROPERTIES_TYPE__EAR:
				return getEar();
			case DataPackage.SCAN_PROPERTIES_TYPE__JAW_POSITION:
				return getJawPosition();
			case DataPackage.SCAN_PROPERTIES_TYPE__SCAN_FORMAT:
				return getScanFormat();
			case DataPackage.SCAN_PROPERTIES_TYPE__SCAN_COMMENT:
				return getScanComment();
			case DataPackage.SCAN_PROPERTIES_TYPE__SCAN_FILE_AND_LOCATION:
				return getScanFileAndLocation();
			case DataPackage.SCAN_PROPERTIES_TYPE__SCAN_STORED_IN_NOAH:
				return getScanStoredInNoah();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataPackage.SCAN_PROPERTIES_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case DataPackage.SCAN_PROPERTIES_TYPE__SCAN_TIME_STAMP:
				getScanTimeStamp().clear();
				getScanTimeStamp().addAll((Collection<? extends XMLGregorianCalendar>)newValue);
				return;
			case DataPackage.SCAN_PROPERTIES_TYPE__EAR:
				getEar().clear();
				getEar().addAll((Collection<? extends EarType>)newValue);
				return;
			case DataPackage.SCAN_PROPERTIES_TYPE__JAW_POSITION:
				getJawPosition().clear();
				getJawPosition().addAll((Collection<? extends JawPositionType>)newValue);
				return;
			case DataPackage.SCAN_PROPERTIES_TYPE__SCAN_FORMAT:
				getScanFormat().clear();
				getScanFormat().addAll((Collection<? extends ScanFormatType>)newValue);
				return;
			case DataPackage.SCAN_PROPERTIES_TYPE__SCAN_COMMENT:
				getScanComment().clear();
				getScanComment().addAll((Collection<? extends String>)newValue);
				return;
			case DataPackage.SCAN_PROPERTIES_TYPE__SCAN_FILE_AND_LOCATION:
				getScanFileAndLocation().clear();
				getScanFileAndLocation().addAll((Collection<? extends String>)newValue);
				return;
			case DataPackage.SCAN_PROPERTIES_TYPE__SCAN_STORED_IN_NOAH:
				getScanStoredInNoah().clear();
				getScanStoredInNoah().addAll((Collection<? extends StoredInNoahType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DataPackage.SCAN_PROPERTIES_TYPE__GROUP:
				getGroup().clear();
				return;
			case DataPackage.SCAN_PROPERTIES_TYPE__SCAN_TIME_STAMP:
				getScanTimeStamp().clear();
				return;
			case DataPackage.SCAN_PROPERTIES_TYPE__EAR:
				getEar().clear();
				return;
			case DataPackage.SCAN_PROPERTIES_TYPE__JAW_POSITION:
				getJawPosition().clear();
				return;
			case DataPackage.SCAN_PROPERTIES_TYPE__SCAN_FORMAT:
				getScanFormat().clear();
				return;
			case DataPackage.SCAN_PROPERTIES_TYPE__SCAN_COMMENT:
				getScanComment().clear();
				return;
			case DataPackage.SCAN_PROPERTIES_TYPE__SCAN_FILE_AND_LOCATION:
				getScanFileAndLocation().clear();
				return;
			case DataPackage.SCAN_PROPERTIES_TYPE__SCAN_STORED_IN_NOAH:
				getScanStoredInNoah().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DataPackage.SCAN_PROPERTIES_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case DataPackage.SCAN_PROPERTIES_TYPE__SCAN_TIME_STAMP:
				return !getScanTimeStamp().isEmpty();
			case DataPackage.SCAN_PROPERTIES_TYPE__EAR:
				return !getEar().isEmpty();
			case DataPackage.SCAN_PROPERTIES_TYPE__JAW_POSITION:
				return !getJawPosition().isEmpty();
			case DataPackage.SCAN_PROPERTIES_TYPE__SCAN_FORMAT:
				return !getScanFormat().isEmpty();
			case DataPackage.SCAN_PROPERTIES_TYPE__SCAN_COMMENT:
				return !getScanComment().isEmpty();
			case DataPackage.SCAN_PROPERTIES_TYPE__SCAN_FILE_AND_LOCATION:
				return !getScanFileAndLocation().isEmpty();
			case DataPackage.SCAN_PROPERTIES_TYPE__SCAN_STORED_IN_NOAH:
				return !getScanStoredInNoah().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //ScanPropertiesTypeImpl
