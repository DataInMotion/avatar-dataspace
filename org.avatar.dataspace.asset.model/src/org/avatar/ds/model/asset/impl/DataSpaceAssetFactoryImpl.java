/**
 */
package org.avatar.ds.model.asset.impl;

import java.util.Map;

import org.avatar.ds.model.asset.*;

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
public class DataSpaceAssetFactoryImpl extends EFactoryImpl implements DataSpaceAssetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataSpaceAssetFactory init() {
		try {
			DataSpaceAssetFactory theDataSpaceAssetFactory = (DataSpaceAssetFactory)EPackage.Registry.INSTANCE.getEFactory(DataSpaceAssetPackage.eNS_URI);
			if (theDataSpaceAssetFactory != null) {
				return theDataSpaceAssetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataSpaceAssetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSpaceAssetFactoryImpl() {
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
			case DataSpaceAssetPackage.ASSET: return createAsset();
			case DataSpaceAssetPackage.DATA_ADDRESS: return createDataAddress();
			case DataSpaceAssetPackage.PROPERTY_MAP: return (EObject)createPropertyMap();
			case DataSpaceAssetPackage.CONTEXT: return createContext();
			case DataSpaceAssetPackage.ASSET_POLICY: return createAssetPolicy();
			case DataSpaceAssetPackage.POLICY: return createPolicy();
			case DataSpaceAssetPackage.POLICY_CONTEXT: return createPolicyContext();
			case DataSpaceAssetPackage.CONTRACT_DEFINITION: return createContractDefinition();
			case DataSpaceAssetPackage.DATA_SPACE_RESPONSE: return createDataSpaceResponse();
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
	public DataSpaceAssetPackage getDataSpaceAssetPackage() {
		return (DataSpaceAssetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataSpaceAssetPackage getPackage() {
		return DataSpaceAssetPackage.eINSTANCE;
	}

} //DataSpaceAssetFactoryImpl
