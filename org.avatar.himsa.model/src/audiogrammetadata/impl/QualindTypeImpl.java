/*
 */
package audiogrammetadata.impl;

import audiogrammetadata.AudiogrammetadataPackage;
import audiogrammetadata.DefinedValueType1;
import audiogrammetadata.QualindType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualind Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link audiogrammetadata.impl.QualindTypeImpl#getDefinedValue <em>Defined Value</em>}</li>
 *   <li>{@link audiogrammetadata.impl.QualindTypeImpl#getDisagree <em>Disagree</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualindTypeImpl extends MinimalEObjectImpl.Container implements QualindType {
	/**
	 * The default value of the '{@link #getDefinedValue() <em>Defined Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedValue()
	 * @generated
	 * @ordered
	 */
	protected static final DefinedValueType1 DEFINED_VALUE_EDEFAULT = DefinedValueType1.GOOD;

	/**
	 * The cached value of the '{@link #getDefinedValue() <em>Defined Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedValue()
	 * @generated
	 * @ordered
	 */
	protected DefinedValueType1 definedValue = DEFINED_VALUE_EDEFAULT;

	/**
	 * This is true if the Defined Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean definedValueESet;

	/**
	 * The default value of the '{@link #getDisagree() <em>Disagree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisagree()
	 * @generated
	 * @ordered
	 */
	protected static final String DISAGREE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisagree() <em>Disagree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisagree()
	 * @generated
	 * @ordered
	 */
	protected String disagree = DISAGREE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualindTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AudiogrammetadataPackage.Literals.QUALIND_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefinedValueType1 getDefinedValue() {
		return definedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinedValue(DefinedValueType1 newDefinedValue) {
		DefinedValueType1 oldDefinedValue = definedValue;
		definedValue = newDefinedValue == null ? DEFINED_VALUE_EDEFAULT : newDefinedValue;
		boolean oldDefinedValueESet = definedValueESet;
		definedValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogrammetadataPackage.QUALIND_TYPE__DEFINED_VALUE, oldDefinedValue, definedValue, !oldDefinedValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDefinedValue() {
		DefinedValueType1 oldDefinedValue = definedValue;
		boolean oldDefinedValueESet = definedValueESet;
		definedValue = DEFINED_VALUE_EDEFAULT;
		definedValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AudiogrammetadataPackage.QUALIND_TYPE__DEFINED_VALUE, oldDefinedValue, DEFINED_VALUE_EDEFAULT, oldDefinedValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDefinedValue() {
		return definedValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDisagree() {
		return disagree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisagree(String newDisagree) {
		String oldDisagree = disagree;
		disagree = newDisagree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AudiogrammetadataPackage.QUALIND_TYPE__DISAGREE, oldDisagree, disagree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AudiogrammetadataPackage.QUALIND_TYPE__DEFINED_VALUE:
				return getDefinedValue();
			case AudiogrammetadataPackage.QUALIND_TYPE__DISAGREE:
				return getDisagree();
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
			case AudiogrammetadataPackage.QUALIND_TYPE__DEFINED_VALUE:
				setDefinedValue((DefinedValueType1)newValue);
				return;
			case AudiogrammetadataPackage.QUALIND_TYPE__DISAGREE:
				setDisagree((String)newValue);
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
			case AudiogrammetadataPackage.QUALIND_TYPE__DEFINED_VALUE:
				unsetDefinedValue();
				return;
			case AudiogrammetadataPackage.QUALIND_TYPE__DISAGREE:
				setDisagree(DISAGREE_EDEFAULT);
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
			case AudiogrammetadataPackage.QUALIND_TYPE__DEFINED_VALUE:
				return isSetDefinedValue();
			case AudiogrammetadataPackage.QUALIND_TYPE__DISAGREE:
				return DISAGREE_EDEFAULT == null ? disagree != null : !DISAGREE_EDEFAULT.equals(disagree);
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
		result.append(" (definedValue: ");
		if (definedValueESet) result.append(definedValue); else result.append("<unset>");
		result.append(", disagree: ");
		result.append(disagree);
		result.append(')');
		return result.toString();
	}

} //QualindTypeImpl
