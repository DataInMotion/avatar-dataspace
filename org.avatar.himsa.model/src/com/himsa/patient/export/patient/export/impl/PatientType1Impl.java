/*
 */
package com.himsa.patient.export.patient.export.impl;

import com.himsa.patient.export.patient.export.ActionsType;
import com.himsa.patient.export.patient.export.ExportPackage;
import com.himsa.patient.export.patient.export.PatientType1;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.himsa.patient.export.patient.export.impl.PatientType1Impl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatientType1Impl extends PatientTypeImpl implements PatientType1 {
	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected ActionsType actions;

	/**
	 * This is true if the Actions containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actionsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExportPackage.Literals.PATIENT_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionsType getActions() {
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActions(ActionsType newActions, NotificationChain msgs) {
		ActionsType oldActions = actions;
		actions = newActions;
		boolean oldActionsESet = actionsESet;
		actionsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExportPackage.PATIENT_TYPE1__ACTIONS, oldActions, newActions, !oldActionsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActions(ActionsType newActions) {
		if (newActions != actions) {
			NotificationChain msgs = null;
			if (actions != null)
				msgs = ((InternalEObject)actions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PATIENT_TYPE1__ACTIONS, null, msgs);
			if (newActions != null)
				msgs = ((InternalEObject)newActions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PATIENT_TYPE1__ACTIONS, null, msgs);
			msgs = basicSetActions(newActions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldActionsESet = actionsESet;
			actionsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, ExportPackage.PATIENT_TYPE1__ACTIONS, newActions, newActions, !oldActionsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetActions(NotificationChain msgs) {
		ActionsType oldActions = actions;
		actions = null;
		boolean oldActionsESet = actionsESet;
		actionsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, ExportPackage.PATIENT_TYPE1__ACTIONS, oldActions, null, oldActionsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetActions() {
		if (actions != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)actions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExportPackage.PATIENT_TYPE1__ACTIONS, null, msgs);
			msgs = basicUnsetActions(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldActionsESet = actionsESet;
			actionsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, ExportPackage.PATIENT_TYPE1__ACTIONS, null, null, oldActionsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetActions() {
		return actionsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExportPackage.PATIENT_TYPE1__ACTIONS:
				return basicUnsetActions(msgs);
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
			case ExportPackage.PATIENT_TYPE1__ACTIONS:
				return getActions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExportPackage.PATIENT_TYPE1__ACTIONS:
				setActions((ActionsType)newValue);
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
			case ExportPackage.PATIENT_TYPE1__ACTIONS:
				unsetActions();
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
			case ExportPackage.PATIENT_TYPE1__ACTIONS:
				return isSetActions();
		}
		return super.eIsSet(featureID);
	}

} //PatientType1Impl
