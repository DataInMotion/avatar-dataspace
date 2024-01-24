/*
 */
package audiogram502;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Solutions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Versions 500 and earlier all indicate that these are used to note of a hearing instrument was worn during the test, not another type of device.  However, it is not clear what ear(s) is aided and until now this has not been important – at least nobody has informed HIMSA that this was important.
 * 
 * As HIMSA has looked to add the support for indicating if different types of devices can be indicated it has become apparent that a bit more complete structure is needed.  In general the new structure will contain a more complete list of device solutions and the ability/requirement to denote which ear the solution is associated with.
 * 
 * The phrase “Aided Solution” will now be used in the new structure to do a better job of generally describing hearing instruments, cochlear implants etc.)
 * This is a new optional element to use and will have no connection of use with HearingInstrument_1_Condition and HearingInstrument_2_Condition elements
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link audiogram502.DeviceSolutionsType#getRightEarDevice <em>Right Ear Device</em>}</li>
 *   <li>{@link audiogram502.DeviceSolutionsType#getLeftEarDevice <em>Left Ear Device</em>}</li>
 * </ul>
 *
 * @see audiogram502.Audiogram502Package#getDeviceSolutionsType()
 * @model extendedMetaData="name='DeviceSolutions_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeviceSolutionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Right Ear Device</b></em>' attribute.
	 * The default value is <code>"None "</code>.
	 * The literals are from the enumeration {@link audiogram502.AidedSolutionsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a device does not exist for this ear then select 'None'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Right Ear Device</em>' attribute.
	 * @see audiogram502.AidedSolutionsType
	 * @see #isSetRightEarDevice()
	 * @see #unsetRightEarDevice()
	 * @see #setRightEarDevice(AidedSolutionsType)
	 * @see audiogram502.Audiogram502Package#getDeviceSolutionsType_RightEarDevice()
	 * @model default="None " unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='RightEarDevice' namespace='##targetNamespace'"
	 * @generated
	 */
	AidedSolutionsType getRightEarDevice();

	/**
	 * Sets the value of the '{@link audiogram502.DeviceSolutionsType#getRightEarDevice <em>Right Ear Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Ear Device</em>' attribute.
	 * @see audiogram502.AidedSolutionsType
	 * @see #isSetRightEarDevice()
	 * @see #unsetRightEarDevice()
	 * @see #getRightEarDevice()
	 * @generated
	 */
	void setRightEarDevice(AidedSolutionsType value);

	/**
	 * Unsets the value of the '{@link audiogram502.DeviceSolutionsType#getRightEarDevice <em>Right Ear Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRightEarDevice()
	 * @see #getRightEarDevice()
	 * @see #setRightEarDevice(AidedSolutionsType)
	 * @generated
	 */
	void unsetRightEarDevice();

	/**
	 * Returns whether the value of the '{@link audiogram502.DeviceSolutionsType#getRightEarDevice <em>Right Ear Device</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Right Ear Device</em>' attribute is set.
	 * @see #unsetRightEarDevice()
	 * @see #getRightEarDevice()
	 * @see #setRightEarDevice(AidedSolutionsType)
	 * @generated
	 */
	boolean isSetRightEarDevice();

	/**
	 * Returns the value of the '<em><b>Left Ear Device</b></em>' attribute.
	 * The default value is <code>"None "</code>.
	 * The literals are from the enumeration {@link audiogram502.AidedSolutionsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a device does not exist for this ear then select 'None'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Left Ear Device</em>' attribute.
	 * @see audiogram502.AidedSolutionsType
	 * @see #isSetLeftEarDevice()
	 * @see #unsetLeftEarDevice()
	 * @see #setLeftEarDevice(AidedSolutionsType)
	 * @see audiogram502.Audiogram502Package#getDeviceSolutionsType_LeftEarDevice()
	 * @model default="None " unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='LeftEarDevice' namespace='##targetNamespace'"
	 * @generated
	 */
	AidedSolutionsType getLeftEarDevice();

	/**
	 * Sets the value of the '{@link audiogram502.DeviceSolutionsType#getLeftEarDevice <em>Left Ear Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Ear Device</em>' attribute.
	 * @see audiogram502.AidedSolutionsType
	 * @see #isSetLeftEarDevice()
	 * @see #unsetLeftEarDevice()
	 * @see #getLeftEarDevice()
	 * @generated
	 */
	void setLeftEarDevice(AidedSolutionsType value);

	/**
	 * Unsets the value of the '{@link audiogram502.DeviceSolutionsType#getLeftEarDevice <em>Left Ear Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLeftEarDevice()
	 * @see #getLeftEarDevice()
	 * @see #setLeftEarDevice(AidedSolutionsType)
	 * @generated
	 */
	void unsetLeftEarDevice();

	/**
	 * Returns whether the value of the '{@link audiogram502.DeviceSolutionsType#getLeftEarDevice <em>Left Ear Device</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Left Ear Device</em>' attribute is set.
	 * @see #unsetLeftEarDevice()
	 * @see #getLeftEarDevice()
	 * @see #setLeftEarDevice(AidedSolutionsType)
	 * @generated
	 */
	boolean isSetLeftEarDevice();

} // DeviceSolutionsType
