/*
 */
package realear;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Full Target Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A full target curve including the description.
 * Use the signalLevel field to state the signal level if the target curve relates
 * to a specific signal level. Use the ruleName to add a text containing a name
 * and description of the target curve.
 * 
 * ##TTargetCurve##
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link realear.FullTargetCurve#getManufacturersCode <em>Manufacturers Code</em>}</li>
 *   <li>{@link realear.FullTargetCurve#getDeviceTypeCode <em>Device Type Code</em>}</li>
 *   <li>{@link realear.FullTargetCurve#getFittingRule <em>Fitting Rule</em>}</li>
 *   <li>{@link realear.FullTargetCurve#getHearingInstrumentType <em>Hearing Instrument Type</em>}</li>
 *   <li>{@link realear.FullTargetCurve#getVentCanalDiameter <em>Vent Canal Diameter</em>}</li>
 *   <li>{@link realear.FullTargetCurve#getVentCanalLength <em>Vent Canal Length</em>}</li>
 *   <li>{@link realear.FullTargetCurve#getReserveGain <em>Reserve Gain</em>}</li>
 *   <li>{@link realear.FullTargetCurve#getCouplerType <em>Coupler Type</em>}</li>
 *   <li>{@link realear.FullTargetCurve#getSignalLevel <em>Signal Level</em>}</li>
 *   <li>{@link realear.FullTargetCurve#getTarget <em>Target</em>}</li>
 *   <li>{@link realear.FullTargetCurve#getRuleName <em>Rule Name</em>}</li>
 * </ul>
 *
 * @see realear.RealearPackage#getFullTargetCurve()
 * @model extendedMetaData="name='FullTargetCurve' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FullTargetCurve extends EObject {
	/**
	 * Returns the value of the '<em><b>Manufacturers Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each HIMSA Member company which can create a module is assigned numerical code.  Manufacturer of the measuring equipment
	 * 
	 * ##TManufCode##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturers Code</em>' attribute.
	 * @see #setManufacturersCode(BigInteger)
	 * @see realear.RealearPackage#getFullTargetCurve_ManufacturersCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='ManufacturersCode' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getManufacturersCode();

	/**
	 * Sets the value of the '{@link realear.FullTargetCurve#getManufacturersCode <em>Manufacturers Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturers Code</em>' attribute.
	 * @see #getManufacturersCode()
	 * @generated
	 */
	void setManufacturersCode(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Device Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Device type code of the measuring equipment
	 * 
	 * ##TDevTypeCode##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Type Code</em>' attribute.
	 * @see #setDeviceTypeCode(BigInteger)
	 * @see realear.RealearPackage#getFullTargetCurve_DeviceTypeCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='DeviceTypeCode' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getDeviceTypeCode();

	/**
	 * Sets the value of the '{@link realear.FullTargetCurve#getDeviceTypeCode <em>Device Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Type Code</em>' attribute.
	 * @see #getDeviceTypeCode()
	 * @generated
	 */
	void setDeviceTypeCode(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Fitting Rule</b></em>' attribute.
	 * The literals are from the enumeration {@link realear.FittingRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fitting rule used for calculation of a target curve
	 * 
	 * ##TFittingRule##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fitting Rule</em>' attribute.
	 * @see realear.FittingRule
	 * @see #isSetFittingRule()
	 * @see #unsetFittingRule()
	 * @see #setFittingRule(FittingRule)
	 * @see realear.RealearPackage#getFullTargetCurve_FittingRule()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='FittingRule' namespace='##targetNamespace'"
	 * @generated
	 */
	FittingRule getFittingRule();

	/**
	 * Sets the value of the '{@link realear.FullTargetCurve#getFittingRule <em>Fitting Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fitting Rule</em>' attribute.
	 * @see realear.FittingRule
	 * @see #isSetFittingRule()
	 * @see #unsetFittingRule()
	 * @see #getFittingRule()
	 * @generated
	 */
	void setFittingRule(FittingRule value);

	/**
	 * Unsets the value of the '{@link realear.FullTargetCurve#getFittingRule <em>Fitting Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFittingRule()
	 * @see #getFittingRule()
	 * @see #setFittingRule(FittingRule)
	 * @generated
	 */
	void unsetFittingRule();

	/**
	 * Returns whether the value of the '{@link realear.FullTargetCurve#getFittingRule <em>Fitting Rule</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fitting Rule</em>' attribute is set.
	 * @see #unsetFittingRule()
	 * @see #getFittingRule()
	 * @see #setFittingRule(FittingRule)
	 * @generated
	 */
	boolean isSetFittingRule();

	/**
	 * Returns the value of the '<em><b>Hearing Instrument Type</b></em>' attribute.
	 * The literals are from the enumeration {@link realear.HearingInstrumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of hearing instrument being tested.
	 * 
	 * ##THIType##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hearing Instrument Type</em>' attribute.
	 * @see realear.HearingInstrumentType
	 * @see #isSetHearingInstrumentType()
	 * @see #unsetHearingInstrumentType()
	 * @see #setHearingInstrumentType(HearingInstrumentType)
	 * @see realear.RealearPackage#getFullTargetCurve_HearingInstrumentType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='HearingInstrumentType' namespace='##targetNamespace'"
	 * @generated
	 */
	HearingInstrumentType getHearingInstrumentType();

	/**
	 * Sets the value of the '{@link realear.FullTargetCurve#getHearingInstrumentType <em>Hearing Instrument Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hearing Instrument Type</em>' attribute.
	 * @see realear.HearingInstrumentType
	 * @see #isSetHearingInstrumentType()
	 * @see #unsetHearingInstrumentType()
	 * @see #getHearingInstrumentType()
	 * @generated
	 */
	void setHearingInstrumentType(HearingInstrumentType value);

	/**
	 * Unsets the value of the '{@link realear.FullTargetCurve#getHearingInstrumentType <em>Hearing Instrument Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHearingInstrumentType()
	 * @see #getHearingInstrumentType()
	 * @see #setHearingInstrumentType(HearingInstrumentType)
	 * @generated
	 */
	void unsetHearingInstrumentType();

	/**
	 * Returns whether the value of the '{@link realear.FullTargetCurve#getHearingInstrumentType <em>Hearing Instrument Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hearing Instrument Type</em>' attribute is set.
	 * @see #unsetHearingInstrumentType()
	 * @see #getHearingInstrumentType()
	 * @see #setHearingInstrumentType(HearingInstrumentType)
	 * @generated
	 */
	boolean isSetHearingInstrumentType();

	/**
	 * Returns the value of the '<em><b>Vent Canal Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The diameter of the vent canal measured in mm.
	 * 
	 * ##ventDiam##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vent Canal Diameter</em>' attribute.
	 * @see #setVentCanalDiameter(BigDecimal)
	 * @see realear.RealearPackage#getFullTargetCurve_VentCanalDiameter()
	 * @model dataType="realear.VentCanalDiameterType"
	 *        extendedMetaData="kind='element' name='VentCanalDiameter' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getVentCanalDiameter();

	/**
	 * Sets the value of the '{@link realear.FullTargetCurve#getVentCanalDiameter <em>Vent Canal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vent Canal Diameter</em>' attribute.
	 * @see #getVentCanalDiameter()
	 * @generated
	 */
	void setVentCanalDiameter(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Vent Canal Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The length of the vent canal measured in mm.
	 * 
	 * ##ventLen##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vent Canal Length</em>' attribute.
	 * @see #setVentCanalLength(BigDecimal)
	 * @see realear.RealearPackage#getFullTargetCurve_VentCanalLength()
	 * @model dataType="realear.VentCanalLengthType"
	 *        extendedMetaData="kind='element' name='VentCanalLength' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getVentCanalLength();

	/**
	 * Sets the value of the '{@link realear.FullTargetCurve#getVentCanalLength <em>Vent Canal Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vent Canal Length</em>' attribute.
	 * @see #getVentCanalLength()
	 * @generated
	 */
	void setVentCanalLength(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Reserve Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reserve gain included in the target curve.
	 * 
	 * ##resGain##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reserve Gain</em>' attribute.
	 * @see #setReserveGain(BigDecimal)
	 * @see realear.RealearPackage#getFullTargetCurve_ReserveGain()
	 * @model dataType="realear.ReserveGainType"
	 *        extendedMetaData="kind='element' name='ReserveGain' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getReserveGain();

	/**
	 * Sets the value of the '{@link realear.FullTargetCurve#getReserveGain <em>Reserve Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserve Gain</em>' attribute.
	 * @see #getReserveGain()
	 * @generated
	 */
	void setReserveGain(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Coupler Type</b></em>' attribute.
	 * The literals are from the enumeration {@link realear.CouplerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The device in which the probe microphone is placed; In other words; this is
	 * where the output is read.
	 * 
	 * ##TCouplerType##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coupler Type</em>' attribute.
	 * @see realear.CouplerType
	 * @see #isSetCouplerType()
	 * @see #unsetCouplerType()
	 * @see #setCouplerType(CouplerType)
	 * @see realear.RealearPackage#getFullTargetCurve_CouplerType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='CouplerType' namespace='##targetNamespace'"
	 * @generated
	 */
	CouplerType getCouplerType();

	/**
	 * Sets the value of the '{@link realear.FullTargetCurve#getCouplerType <em>Coupler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coupler Type</em>' attribute.
	 * @see realear.CouplerType
	 * @see #isSetCouplerType()
	 * @see #unsetCouplerType()
	 * @see #getCouplerType()
	 * @generated
	 */
	void setCouplerType(CouplerType value);

	/**
	 * Unsets the value of the '{@link realear.FullTargetCurve#getCouplerType <em>Coupler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCouplerType()
	 * @see #getCouplerType()
	 * @see #setCouplerType(CouplerType)
	 * @generated
	 */
	void unsetCouplerType();

	/**
	 * Returns whether the value of the '{@link realear.FullTargetCurve#getCouplerType <em>Coupler Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Coupler Type</em>' attribute is set.
	 * @see #unsetCouplerType()
	 * @see #getCouplerType()
	 * @see #setCouplerType(CouplerType)
	 * @generated
	 */
	boolean isSetCouplerType();

	/**
	 * Returns the value of the '<em><b>Signal Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use this field to state the signal level if the target curve relates to a
	 * specific signal level. 
	 * 
	 * ##signalLevel##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Level</em>' attribute.
	 * @see #setSignalLevel(BigDecimal)
	 * @see realear.RealearPackage#getFullTargetCurve_SignalLevel()
	 * @model dataType="realear.SignalLevelType2"
	 *        extendedMetaData="kind='element' name='SignalLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getSignalLevel();

	/**
	 * Sets the value of the '{@link realear.FullTargetCurve#getSignalLevel <em>Signal Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Level</em>' attribute.
	 * @see #getSignalLevel()
	 * @generated
	 */
	void setSignalLevel(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link realear.TargetPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target curve.
	 * 
	 * ##target##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see realear.RealearPackage#getFullTargetCurve_Target()
	 * @model containment="true" required="true" upper="24"
	 *        extendedMetaData="kind='element' name='Target' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TargetPoint> getTarget();

	/**
	 * Returns the value of the '<em><b>Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text containing the target curve's name/description. 
	 * 
	 * ##ruleName##
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule Name</em>' attribute.
	 * @see #setRuleName(String)
	 * @see realear.RealearPackage#getFullTargetCurve_RuleName()
	 * @model dataType="realear.RuleNameType"
	 *        extendedMetaData="kind='element' name='RuleName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRuleName();

	/**
	 * Sets the value of the '{@link realear.FullTargetCurve#getRuleName <em>Rule Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Name</em>' attribute.
	 * @see #getRuleName()
	 * @generated
	 */
	void setRuleName(String value);

} // FullTargetCurve
