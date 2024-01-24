/*
 */
package tinnitus.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tinnitus.TinnitusMeasurementNotesType;
import tinnitus.TinnitusPackage;
import tinnitus.TinnitusPerceptionLocationType;
import tinnitus.TinnitusTemporalCharacteristicType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement Notes Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tinnitus.impl.TinnitusMeasurementNotesTypeImpl#getTinnitusPerceptionLocation <em>Tinnitus Perception Location</em>}</li>
 *   <li>{@link tinnitus.impl.TinnitusMeasurementNotesTypeImpl#getTinnitusTemporalCharacteristic <em>Tinnitus Temporal Characteristic</em>}</li>
 *   <li>{@link tinnitus.impl.TinnitusMeasurementNotesTypeImpl#getOtherMeasurementNotes <em>Other Measurement Notes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TinnitusMeasurementNotesTypeImpl extends MinimalEObjectImpl.Container implements TinnitusMeasurementNotesType {
	/**
	 * The default value of the '{@link #getTinnitusPerceptionLocation() <em>Tinnitus Perception Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTinnitusPerceptionLocation()
	 * @generated
	 * @ordered
	 */
	protected static final TinnitusPerceptionLocationType TINNITUS_PERCEPTION_LOCATION_EDEFAULT = TinnitusPerceptionLocationType.CENTRAL;

	/**
	 * The cached value of the '{@link #getTinnitusPerceptionLocation() <em>Tinnitus Perception Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTinnitusPerceptionLocation()
	 * @generated
	 * @ordered
	 */
	protected TinnitusPerceptionLocationType tinnitusPerceptionLocation = TINNITUS_PERCEPTION_LOCATION_EDEFAULT;

	/**
	 * This is true if the Tinnitus Perception Location attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tinnitusPerceptionLocationESet;

	/**
	 * The default value of the '{@link #getTinnitusTemporalCharacteristic() <em>Tinnitus Temporal Characteristic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTinnitusTemporalCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected static final TinnitusTemporalCharacteristicType TINNITUS_TEMPORAL_CHARACTERISTIC_EDEFAULT = TinnitusTemporalCharacteristicType.STEADY;

	/**
	 * The cached value of the '{@link #getTinnitusTemporalCharacteristic() <em>Tinnitus Temporal Characteristic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTinnitusTemporalCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected TinnitusTemporalCharacteristicType tinnitusTemporalCharacteristic = TINNITUS_TEMPORAL_CHARACTERISTIC_EDEFAULT;

	/**
	 * This is true if the Tinnitus Temporal Characteristic attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tinnitusTemporalCharacteristicESet;

	/**
	 * The default value of the '{@link #getOtherMeasurementNotes() <em>Other Measurement Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherMeasurementNotes()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_MEASUREMENT_NOTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherMeasurementNotes() <em>Other Measurement Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherMeasurementNotes()
	 * @generated
	 * @ordered
	 */
	protected String otherMeasurementNotes = OTHER_MEASUREMENT_NOTES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TinnitusMeasurementNotesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TinnitusPackage.Literals.TINNITUS_MEASUREMENT_NOTES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TinnitusPerceptionLocationType getTinnitusPerceptionLocation() {
		return tinnitusPerceptionLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTinnitusPerceptionLocation(TinnitusPerceptionLocationType newTinnitusPerceptionLocation) {
		TinnitusPerceptionLocationType oldTinnitusPerceptionLocation = tinnitusPerceptionLocation;
		tinnitusPerceptionLocation = newTinnitusPerceptionLocation == null ? TINNITUS_PERCEPTION_LOCATION_EDEFAULT : newTinnitusPerceptionLocation;
		boolean oldTinnitusPerceptionLocationESet = tinnitusPerceptionLocationESet;
		tinnitusPerceptionLocationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TinnitusPackage.TINNITUS_MEASUREMENT_NOTES_TYPE__TINNITUS_PERCEPTION_LOCATION, oldTinnitusPerceptionLocation, tinnitusPerceptionLocation, !oldTinnitusPerceptionLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTinnitusPerceptionLocation() {
		TinnitusPerceptionLocationType oldTinnitusPerceptionLocation = tinnitusPerceptionLocation;
		boolean oldTinnitusPerceptionLocationESet = tinnitusPerceptionLocationESet;
		tinnitusPerceptionLocation = TINNITUS_PERCEPTION_LOCATION_EDEFAULT;
		tinnitusPerceptionLocationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TinnitusPackage.TINNITUS_MEASUREMENT_NOTES_TYPE__TINNITUS_PERCEPTION_LOCATION, oldTinnitusPerceptionLocation, TINNITUS_PERCEPTION_LOCATION_EDEFAULT, oldTinnitusPerceptionLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTinnitusPerceptionLocation() {
		return tinnitusPerceptionLocationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TinnitusTemporalCharacteristicType getTinnitusTemporalCharacteristic() {
		return tinnitusTemporalCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTinnitusTemporalCharacteristic(TinnitusTemporalCharacteristicType newTinnitusTemporalCharacteristic) {
		TinnitusTemporalCharacteristicType oldTinnitusTemporalCharacteristic = tinnitusTemporalCharacteristic;
		tinnitusTemporalCharacteristic = newTinnitusTemporalCharacteristic == null ? TINNITUS_TEMPORAL_CHARACTERISTIC_EDEFAULT : newTinnitusTemporalCharacteristic;
		boolean oldTinnitusTemporalCharacteristicESet = tinnitusTemporalCharacteristicESet;
		tinnitusTemporalCharacteristicESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TinnitusPackage.TINNITUS_MEASUREMENT_NOTES_TYPE__TINNITUS_TEMPORAL_CHARACTERISTIC, oldTinnitusTemporalCharacteristic, tinnitusTemporalCharacteristic, !oldTinnitusTemporalCharacteristicESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTinnitusTemporalCharacteristic() {
		TinnitusTemporalCharacteristicType oldTinnitusTemporalCharacteristic = tinnitusTemporalCharacteristic;
		boolean oldTinnitusTemporalCharacteristicESet = tinnitusTemporalCharacteristicESet;
		tinnitusTemporalCharacteristic = TINNITUS_TEMPORAL_CHARACTERISTIC_EDEFAULT;
		tinnitusTemporalCharacteristicESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TinnitusPackage.TINNITUS_MEASUREMENT_NOTES_TYPE__TINNITUS_TEMPORAL_CHARACTERISTIC, oldTinnitusTemporalCharacteristic, TINNITUS_TEMPORAL_CHARACTERISTIC_EDEFAULT, oldTinnitusTemporalCharacteristicESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTinnitusTemporalCharacteristic() {
		return tinnitusTemporalCharacteristicESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherMeasurementNotes() {
		return otherMeasurementNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherMeasurementNotes(String newOtherMeasurementNotes) {
		String oldOtherMeasurementNotes = otherMeasurementNotes;
		otherMeasurementNotes = newOtherMeasurementNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TinnitusPackage.TINNITUS_MEASUREMENT_NOTES_TYPE__OTHER_MEASUREMENT_NOTES, oldOtherMeasurementNotes, otherMeasurementNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TinnitusPackage.TINNITUS_MEASUREMENT_NOTES_TYPE__TINNITUS_PERCEPTION_LOCATION:
				return getTinnitusPerceptionLocation();
			case TinnitusPackage.TINNITUS_MEASUREMENT_NOTES_TYPE__TINNITUS_TEMPORAL_CHARACTERISTIC:
				return getTinnitusTemporalCharacteristic();
			case TinnitusPackage.TINNITUS_MEASUREMENT_NOTES_TYPE__OTHER_MEASUREMENT_NOTES:
				return getOtherMeasurementNotes();
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
			case TinnitusPackage.TINNITUS_MEASUREMENT_NOTES_TYPE__TINNITUS_PERCEPTION_LOCATION:
				setTinnitusPerceptionLocation((TinnitusPerceptionLocationType)newValue);
				return;
			case TinnitusPackage.TINNITUS_MEASUREMENT_NOTES_TYPE__TINNITUS_TEMPORAL_CHARACTERISTIC:
				setTinnitusTemporalCharacteristic((TinnitusTemporalCharacteristicType)newValue);
				return;
			case TinnitusPackage.TINNITUS_MEASUREMENT_NOTES_TYPE__OTHER_MEASUREMENT_NOTES:
				setOtherMeasurementNotes((String)newValue);
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
			case TinnitusPackage.TINNITUS_MEASUREMENT_NOTES_TYPE__TINNITUS_PERCEPTION_LOCATION:
				unsetTinnitusPerceptionLocation();
				return;
			case TinnitusPackage.TINNITUS_MEASUREMENT_NOTES_TYPE__TINNITUS_TEMPORAL_CHARACTERISTIC:
				unsetTinnitusTemporalCharacteristic();
				return;
			case TinnitusPackage.TINNITUS_MEASUREMENT_NOTES_TYPE__OTHER_MEASUREMENT_NOTES:
				setOtherMeasurementNotes(OTHER_MEASUREMENT_NOTES_EDEFAULT);
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
			case TinnitusPackage.TINNITUS_MEASUREMENT_NOTES_TYPE__TINNITUS_PERCEPTION_LOCATION:
				return isSetTinnitusPerceptionLocation();
			case TinnitusPackage.TINNITUS_MEASUREMENT_NOTES_TYPE__TINNITUS_TEMPORAL_CHARACTERISTIC:
				return isSetTinnitusTemporalCharacteristic();
			case TinnitusPackage.TINNITUS_MEASUREMENT_NOTES_TYPE__OTHER_MEASUREMENT_NOTES:
				return OTHER_MEASUREMENT_NOTES_EDEFAULT == null ? otherMeasurementNotes != null : !OTHER_MEASUREMENT_NOTES_EDEFAULT.equals(otherMeasurementNotes);
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
		result.append(" (tinnitusPerceptionLocation: ");
		if (tinnitusPerceptionLocationESet) result.append(tinnitusPerceptionLocation); else result.append("<unset>");
		result.append(", tinnitusTemporalCharacteristic: ");
		if (tinnitusTemporalCharacteristicESet) result.append(tinnitusTemporalCharacteristic); else result.append("<unset>");
		result.append(", otherMeasurementNotes: ");
		result.append(otherMeasurementNotes);
		result.append(')');
		return result.toString();
	}

} //TinnitusMeasurementNotesTypeImpl
