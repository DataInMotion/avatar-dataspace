/*
 */
package audiogrammetadata.impl;

import audiogrammetadata.AudiogrammetadataPackage;
import audiogrammetadata.NonStandardizedType;
import audiogrammetadata.PredictedAccuraciesType;
import audiogrammetadata.QualindType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predicted Accuracies Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link audiogrammetadata.impl.PredictedAccuraciesTypeImpl#getQualind <em>Qualind</em>}</li>
 *   <li>{@link audiogrammetadata.impl.PredictedAccuraciesTypeImpl#getNonStandardized <em>Non Standardized</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PredictedAccuraciesTypeImpl extends MinimalEObjectImpl.Container implements PredictedAccuraciesType {
	/**
	 * The cached value of the '{@link #getQualind() <em>Qualind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualind()
	 * @generated
	 * @ordered
	 */
	protected QualindType qualind;

	/**
	 * The cached value of the '{@link #getNonStandardized() <em>Non Standardized</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonStandardized()
	 * @generated
	 * @ordered
	 */
	protected NonStandardizedType nonStandardized;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredictedAccuraciesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AudiogrammetadataPackage.Literals.PREDICTED_ACCURACIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualindType getQualind() {
		return qualind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQualind(QualindType newQualind, NotificationChain msgs) {
		QualindType oldQualind = qualind;
		qualind = newQualind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AudiogrammetadataPackage.PREDICTED_ACCURACIES_TYPE__QUALIND, oldQualind, newQualind);
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
	public void setQualind(QualindType newQualind) {
		if (newQualind != qualind) {
			NotificationChain msgs = null;
			if (qualind != null)
				msgs = ((InternalEObject)qualind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AudiogrammetadataPackage.PREDICTED_ACCURACIES_TYPE__QUALIND, null, msgs);
			if (newQualind != null)
				msgs = ((InternalEObject)newQualind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AudiogrammetadataPackage.PREDICTED_ACCURACIES_TYPE__QUALIND, null, msgs);
			msgs = basicSetQualind(newQualind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogrammetadataPackage.PREDICTED_ACCURACIES_TYPE__QUALIND, newQualind, newQualind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonStandardizedType getNonStandardized() {
		return nonStandardized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNonStandardized(NonStandardizedType newNonStandardized, NotificationChain msgs) {
		NonStandardizedType oldNonStandardized = nonStandardized;
		nonStandardized = newNonStandardized;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AudiogrammetadataPackage.PREDICTED_ACCURACIES_TYPE__NON_STANDARDIZED, oldNonStandardized, newNonStandardized);
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
	public void setNonStandardized(NonStandardizedType newNonStandardized) {
		if (newNonStandardized != nonStandardized) {
			NotificationChain msgs = null;
			if (nonStandardized != null)
				msgs = ((InternalEObject)nonStandardized).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AudiogrammetadataPackage.PREDICTED_ACCURACIES_TYPE__NON_STANDARDIZED, null, msgs);
			if (newNonStandardized != null)
				msgs = ((InternalEObject)newNonStandardized).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AudiogrammetadataPackage.PREDICTED_ACCURACIES_TYPE__NON_STANDARDIZED, null, msgs);
			msgs = basicSetNonStandardized(newNonStandardized, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogrammetadataPackage.PREDICTED_ACCURACIES_TYPE__NON_STANDARDIZED, newNonStandardized, newNonStandardized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AudiogrammetadataPackage.PREDICTED_ACCURACIES_TYPE__QUALIND:
				return basicSetQualind(null, msgs);
			case AudiogrammetadataPackage.PREDICTED_ACCURACIES_TYPE__NON_STANDARDIZED:
				return basicSetNonStandardized(null, msgs);
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
			case AudiogrammetadataPackage.PREDICTED_ACCURACIES_TYPE__QUALIND:
				return getQualind();
			case AudiogrammetadataPackage.PREDICTED_ACCURACIES_TYPE__NON_STANDARDIZED:
				return getNonStandardized();
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
			case AudiogrammetadataPackage.PREDICTED_ACCURACIES_TYPE__QUALIND:
				setQualind((QualindType)newValue);
				return;
			case AudiogrammetadataPackage.PREDICTED_ACCURACIES_TYPE__NON_STANDARDIZED:
				setNonStandardized((NonStandardizedType)newValue);
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
			case AudiogrammetadataPackage.PREDICTED_ACCURACIES_TYPE__QUALIND:
				setQualind((QualindType)null);
				return;
			case AudiogrammetadataPackage.PREDICTED_ACCURACIES_TYPE__NON_STANDARDIZED:
				setNonStandardized((NonStandardizedType)null);
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
			case AudiogrammetadataPackage.PREDICTED_ACCURACIES_TYPE__QUALIND:
				return qualind != null;
			case AudiogrammetadataPackage.PREDICTED_ACCURACIES_TYPE__NON_STANDARDIZED:
				return nonStandardized != null;
		}
		return super.eIsSet(featureID);
	}

} //PredictedAccuraciesTypeImpl
