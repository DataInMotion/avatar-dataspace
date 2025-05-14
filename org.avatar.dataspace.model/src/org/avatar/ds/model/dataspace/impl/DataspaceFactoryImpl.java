/**
 */
package org.avatar.ds.model.dataspace.impl;

import java.util.Map;

import org.avatar.ds.model.dataspace.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataspaceFactoryImpl extends EFactoryImpl implements DataspaceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataspaceFactory init() {
		try {
			DataspaceFactory theDataspaceFactory = (DataspaceFactory)EPackage.Registry.INSTANCE.getEFactory(DataspacePackage.eNS_URI);
			if (theDataspaceFactory != null) {
				return theDataspaceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataspaceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataspaceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DataspacePackage.ASSET: return createAsset();
			case DataspacePackage.DATA_ADDRESS: return createDataAddress();
			case DataspacePackage.PROPERTY_MAP: return (EObject)createPropertyMap();
			case DataspacePackage.CONTEXT: return createContext();
			case DataspacePackage.ASSET_POLICY: return createAssetPolicy();
			case DataspacePackage.POLICY: return createPolicy();
			case DataspacePackage.POLICY_CONTEXT: return createPolicyContext();
			case DataspacePackage.CONTRACT_DEFINITION: return createContractDefinition();
			case DataspacePackage.DATA_SPACE_RESPONSE: return createDataSpaceResponse();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Asset createAsset() {
		AssetImpl asset = new AssetImpl();
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataAddress createDataAddress() {
		DataAddressImpl dataAddress = new DataAddressImpl();
		return dataAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createPropertyMap() {
		PropertyMapImpl propertyMap = new PropertyMapImpl();
		return propertyMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssetPolicy createAssetPolicy() {
		AssetPolicyImpl assetPolicy = new AssetPolicyImpl();
		return assetPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Policy createPolicy() {
		PolicyImpl policy = new PolicyImpl();
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolicyContext createPolicyContext() {
		PolicyContextImpl policyContext = new PolicyContextImpl();
		return policyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractDefinition createContractDefinition() {
		ContractDefinitionImpl contractDefinition = new ContractDefinitionImpl();
		return contractDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSpaceResponse createDataSpaceResponse() {
		DataSpaceResponseImpl dataSpaceResponse = new DataSpaceResponseImpl();
		return dataSpaceResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataspacePackage getDataspacePackage() {
		return (DataspacePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataspacePackage getPackage() {
		return DataspacePackage.eINSTANCE;
	}

} //DataspaceFactoryImpl
