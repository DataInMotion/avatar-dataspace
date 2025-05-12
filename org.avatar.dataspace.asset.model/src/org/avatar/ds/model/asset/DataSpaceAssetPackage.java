/*
 */
package org.avatar.ds.model.asset;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.avatar.ds.model.asset.DataSpaceAssetFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel complianceLevel='17.0' oSGiCompatible='true' basePackage='org.avatar.ds.model' resource='XMI'"
 * @generated
 */
@ProviderType
@EPackage(uri = DataSpaceAssetPackage.eNS_URI, genModel = "/model/asset.genmodel", genModelSourceLocations = {"model/asset.genmodel","org.avatar.dataspace.asset.model/model/asset.genmodel"}, ecore="/model/asset.ecore", ecoreSourceLocations="/model/asset.ecore")
public interface DataSpaceAssetPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "asset";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://avatar.org/ds/asset/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ds-asset";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataSpaceAssetPackage eINSTANCE = org.avatar.ds.model.asset.impl.DataSpaceAssetPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.avatar.ds.model.asset.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.avatar.ds.model.asset.impl.AssetImpl
	 * @see org.avatar.ds.model.asset.impl.DataSpaceAssetPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ID = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Data Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__DATA_ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__PROPERTIES = 3;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.avatar.ds.model.asset.impl.DataAddressImpl <em>Data Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.avatar.ds.model.asset.impl.DataAddressImpl
	 * @see org.avatar.ds.model.asset.impl.DataSpaceAssetPackageImpl#getDataAddress()
	 * @generated
	 */
	int DATA_ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADDRESS__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADDRESS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Base Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADDRESS__BASE_URL = 2;

	/**
	 * The feature id for the '<em><b>Proxy Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADDRESS__PROXY_PATH = 3;

	/**
	 * The number of structural features of the '<em>Data Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADDRESS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADDRESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.avatar.ds.model.asset.impl.PropertyMapImpl <em>Property Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.avatar.ds.model.asset.impl.PropertyMapImpl
	 * @see org.avatar.ds.model.asset.impl.DataSpaceAssetPackageImpl#getPropertyMap()
	 * @generated
	 */
	int PROPERTY_MAP = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.avatar.ds.model.asset.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.avatar.ds.model.asset.impl.ContextImpl
	 * @see org.avatar.ds.model.asset.impl.DataSpaceAssetPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Vocab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__VOCAB = 0;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.avatar.ds.model.asset.impl.AssetPolicyImpl <em>Asset Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.avatar.ds.model.asset.impl.AssetPolicyImpl
	 * @see org.avatar.ds.model.asset.impl.DataSpaceAssetPackageImpl#getAssetPolicy()
	 * @generated
	 */
	int ASSET_POLICY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_POLICY__ID = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_POLICY__CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_POLICY__POLICY = 2;

	/**
	 * The number of structural features of the '<em>Asset Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_POLICY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Asset Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.avatar.ds.model.asset.impl.PolicyImpl <em>Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.avatar.ds.model.asset.impl.PolicyImpl
	 * @see org.avatar.ds.model.asset.impl.DataSpaceAssetPackageImpl#getPolicy()
	 * @generated
	 */
	int POLICY = 5;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__PERMISSION = 2;

	/**
	 * The feature id for the '<em><b>Prohibition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__PROHIBITION = 3;

	/**
	 * The feature id for the '<em><b>Obligation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__OBLIGATION = 4;

	/**
	 * The number of structural features of the '<em>Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.avatar.ds.model.asset.impl.PolicyContextImpl <em>Policy Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.avatar.ds.model.asset.impl.PolicyContextImpl
	 * @see org.avatar.ds.model.asset.impl.DataSpaceAssetPackageImpl#getPolicyContext()
	 * @generated
	 */
	int POLICY_CONTEXT = 6;

	/**
	 * The feature id for the '<em><b>Vocab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_CONTEXT__VOCAB = CONTEXT__VOCAB;

	/**
	 * The feature id for the '<em><b>Odrl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_CONTEXT__ODRL = CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Policy Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_CONTEXT_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Policy Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_CONTEXT_OPERATION_COUNT = CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.avatar.ds.model.asset.impl.ContractDefinitionImpl <em>Contract Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.avatar.ds.model.asset.impl.ContractDefinitionImpl
	 * @see org.avatar.ds.model.asset.impl.DataSpaceAssetPackageImpl#getContractDefinition()
	 * @generated
	 */
	int CONTRACT_DEFINITION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEFINITION__ID = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEFINITION__CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Access Policy Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEFINITION__ACCESS_POLICY_ID = 2;

	/**
	 * The feature id for the '<em><b>Contract Policy Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEFINITION__CONTRACT_POLICY_ID = 3;

	/**
	 * The feature id for the '<em><b>Assets Selector</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEFINITION__ASSETS_SELECTOR = 4;

	/**
	 * The number of structural features of the '<em>Contract Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEFINITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Contract Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.avatar.ds.model.asset.impl.DataSpaceResponseImpl <em>Data Space Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.avatar.ds.model.asset.impl.DataSpaceResponseImpl
	 * @see org.avatar.ds.model.asset.impl.DataSpaceAssetPackageImpl#getDataSpaceResponse()
	 * @generated
	 */
	int DATA_SPACE_RESPONSE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPACE_RESPONSE__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPACE_RESPONSE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPACE_RESPONSE__CONTEXT = 2;

	/**
	 * The number of structural features of the '<em>Data Space Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPACE_RESPONSE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data Space Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPACE_RESPONSE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.avatar.ds.model.asset.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see org.avatar.ds.model.asset.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.asset.Asset#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.avatar.ds.model.asset.Asset#getId()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.avatar.ds.model.asset.Asset#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see org.avatar.ds.model.asset.Asset#getContext()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Context();

	/**
	 * Returns the meta object for the containment reference '{@link org.avatar.ds.model.asset.Asset#getDataAddress <em>Data Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Address</em>'.
	 * @see org.avatar.ds.model.asset.Asset#getDataAddress()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_DataAddress();

	/**
	 * Returns the meta object for the map '{@link org.avatar.ds.model.asset.Asset#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Properties</em>'.
	 * @see org.avatar.ds.model.asset.Asset#getProperties()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Properties();

	/**
	 * Returns the meta object for class '{@link org.avatar.ds.model.asset.DataAddress <em>Data Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Address</em>'.
	 * @see org.avatar.ds.model.asset.DataAddress
	 * @generated
	 */
	EClass getDataAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.asset.DataAddress#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.avatar.ds.model.asset.DataAddress#getType()
	 * @see #getDataAddress()
	 * @generated
	 */
	EAttribute getDataAddress_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.asset.DataAddress#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.avatar.ds.model.asset.DataAddress#getName()
	 * @see #getDataAddress()
	 * @generated
	 */
	EAttribute getDataAddress_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.asset.DataAddress#getBaseUrl <em>Base Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Url</em>'.
	 * @see org.avatar.ds.model.asset.DataAddress#getBaseUrl()
	 * @see #getDataAddress()
	 * @generated
	 */
	EAttribute getDataAddress_BaseUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.asset.DataAddress#isProxyPath <em>Proxy Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proxy Path</em>'.
	 * @see org.avatar.ds.model.asset.DataAddress#isProxyPath()
	 * @see #getDataAddress()
	 * @generated
	 */
	EAttribute getDataAddress_ProxyPath();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Property Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getPropertyMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getPropertyMap()
	 * @generated
	 */
	EAttribute getPropertyMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getPropertyMap()
	 * @generated
	 */
	EAttribute getPropertyMap_Value();

	/**
	 * Returns the meta object for class '{@link org.avatar.ds.model.asset.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see org.avatar.ds.model.asset.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.asset.Context#getVocab <em>Vocab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vocab</em>'.
	 * @see org.avatar.ds.model.asset.Context#getVocab()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_Vocab();

	/**
	 * Returns the meta object for class '{@link org.avatar.ds.model.asset.AssetPolicy <em>Asset Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Policy</em>'.
	 * @see org.avatar.ds.model.asset.AssetPolicy
	 * @generated
	 */
	EClass getAssetPolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.asset.AssetPolicy#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.avatar.ds.model.asset.AssetPolicy#getId()
	 * @see #getAssetPolicy()
	 * @generated
	 */
	EAttribute getAssetPolicy_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.avatar.ds.model.asset.AssetPolicy#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see org.avatar.ds.model.asset.AssetPolicy#getContext()
	 * @see #getAssetPolicy()
	 * @generated
	 */
	EReference getAssetPolicy_Context();

	/**
	 * Returns the meta object for the containment reference '{@link org.avatar.ds.model.asset.AssetPolicy#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policy</em>'.
	 * @see org.avatar.ds.model.asset.AssetPolicy#getPolicy()
	 * @see #getAssetPolicy()
	 * @generated
	 */
	EReference getAssetPolicy_Policy();

	/**
	 * Returns the meta object for class '{@link org.avatar.ds.model.asset.Policy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy</em>'.
	 * @see org.avatar.ds.model.asset.Policy
	 * @generated
	 */
	EClass getPolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.asset.Policy#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see org.avatar.ds.model.asset.Policy#getContext()
	 * @see #getPolicy()
	 * @generated
	 */
	EAttribute getPolicy_Context();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.asset.Policy#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.avatar.ds.model.asset.Policy#getType()
	 * @see #getPolicy()
	 * @generated
	 */
	EAttribute getPolicy_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.avatar.ds.model.asset.Policy#getPermission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Permission</em>'.
	 * @see org.avatar.ds.model.asset.Policy#getPermission()
	 * @see #getPolicy()
	 * @generated
	 */
	EAttribute getPolicy_Permission();

	/**
	 * Returns the meta object for the attribute list '{@link org.avatar.ds.model.asset.Policy#getProhibition <em>Prohibition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Prohibition</em>'.
	 * @see org.avatar.ds.model.asset.Policy#getProhibition()
	 * @see #getPolicy()
	 * @generated
	 */
	EAttribute getPolicy_Prohibition();

	/**
	 * Returns the meta object for the attribute list '{@link org.avatar.ds.model.asset.Policy#getObligation <em>Obligation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Obligation</em>'.
	 * @see org.avatar.ds.model.asset.Policy#getObligation()
	 * @see #getPolicy()
	 * @generated
	 */
	EAttribute getPolicy_Obligation();

	/**
	 * Returns the meta object for class '{@link org.avatar.ds.model.asset.PolicyContext <em>Policy Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Context</em>'.
	 * @see org.avatar.ds.model.asset.PolicyContext
	 * @generated
	 */
	EClass getPolicyContext();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.asset.PolicyContext#getOdrl <em>Odrl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Odrl</em>'.
	 * @see org.avatar.ds.model.asset.PolicyContext#getOdrl()
	 * @see #getPolicyContext()
	 * @generated
	 */
	EAttribute getPolicyContext_Odrl();

	/**
	 * Returns the meta object for class '{@link org.avatar.ds.model.asset.ContractDefinition <em>Contract Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract Definition</em>'.
	 * @see org.avatar.ds.model.asset.ContractDefinition
	 * @generated
	 */
	EClass getContractDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.asset.ContractDefinition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.avatar.ds.model.asset.ContractDefinition#getId()
	 * @see #getContractDefinition()
	 * @generated
	 */
	EAttribute getContractDefinition_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.avatar.ds.model.asset.ContractDefinition#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see org.avatar.ds.model.asset.ContractDefinition#getContext()
	 * @see #getContractDefinition()
	 * @generated
	 */
	EReference getContractDefinition_Context();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.asset.ContractDefinition#getAccessPolicyId <em>Access Policy Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Policy Id</em>'.
	 * @see org.avatar.ds.model.asset.ContractDefinition#getAccessPolicyId()
	 * @see #getContractDefinition()
	 * @generated
	 */
	EAttribute getContractDefinition_AccessPolicyId();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.asset.ContractDefinition#getContractPolicyId <em>Contract Policy Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contract Policy Id</em>'.
	 * @see org.avatar.ds.model.asset.ContractDefinition#getContractPolicyId()
	 * @see #getContractDefinition()
	 * @generated
	 */
	EAttribute getContractDefinition_ContractPolicyId();

	/**
	 * Returns the meta object for the attribute list '{@link org.avatar.ds.model.asset.ContractDefinition#getAssetsSelector <em>Assets Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Assets Selector</em>'.
	 * @see org.avatar.ds.model.asset.ContractDefinition#getAssetsSelector()
	 * @see #getContractDefinition()
	 * @generated
	 */
	EAttribute getContractDefinition_AssetsSelector();

	/**
	 * Returns the meta object for class '{@link org.avatar.ds.model.asset.DataSpaceResponse <em>Data Space Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Space Response</em>'.
	 * @see org.avatar.ds.model.asset.DataSpaceResponse
	 * @generated
	 */
	EClass getDataSpaceResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.asset.DataSpaceResponse#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.avatar.ds.model.asset.DataSpaceResponse#getId()
	 * @see #getDataSpaceResponse()
	 * @generated
	 */
	EAttribute getDataSpaceResponse_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.avatar.ds.model.asset.DataSpaceResponse#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.avatar.ds.model.asset.DataSpaceResponse#getType()
	 * @see #getDataSpaceResponse()
	 * @generated
	 */
	EAttribute getDataSpaceResponse_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.avatar.ds.model.asset.DataSpaceResponse#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see org.avatar.ds.model.asset.DataSpaceResponse#getContext()
	 * @see #getDataSpaceResponse()
	 * @generated
	 */
	EReference getDataSpaceResponse_Context();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataSpaceAssetFactory getDataSpaceAssetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.avatar.ds.model.asset.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.avatar.ds.model.asset.impl.AssetImpl
		 * @see org.avatar.ds.model.asset.impl.DataSpaceAssetPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__ID = eINSTANCE.getAsset_Id();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__CONTEXT = eINSTANCE.getAsset_Context();

		/**
		 * The meta object literal for the '<em><b>Data Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__DATA_ADDRESS = eINSTANCE.getAsset_DataAddress();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__PROPERTIES = eINSTANCE.getAsset_Properties();

		/**
		 * The meta object literal for the '{@link org.avatar.ds.model.asset.impl.DataAddressImpl <em>Data Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.avatar.ds.model.asset.impl.DataAddressImpl
		 * @see org.avatar.ds.model.asset.impl.DataSpaceAssetPackageImpl#getDataAddress()
		 * @generated
		 */
		EClass DATA_ADDRESS = eINSTANCE.getDataAddress();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ADDRESS__TYPE = eINSTANCE.getDataAddress_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ADDRESS__NAME = eINSTANCE.getDataAddress_Name();

		/**
		 * The meta object literal for the '<em><b>Base Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ADDRESS__BASE_URL = eINSTANCE.getDataAddress_BaseUrl();

		/**
		 * The meta object literal for the '<em><b>Proxy Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ADDRESS__PROXY_PATH = eINSTANCE.getDataAddress_ProxyPath();

		/**
		 * The meta object literal for the '{@link org.avatar.ds.model.asset.impl.PropertyMapImpl <em>Property Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.avatar.ds.model.asset.impl.PropertyMapImpl
		 * @see org.avatar.ds.model.asset.impl.DataSpaceAssetPackageImpl#getPropertyMap()
		 * @generated
		 */
		EClass PROPERTY_MAP = eINSTANCE.getPropertyMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_MAP__KEY = eINSTANCE.getPropertyMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_MAP__VALUE = eINSTANCE.getPropertyMap_Value();

		/**
		 * The meta object literal for the '{@link org.avatar.ds.model.asset.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.avatar.ds.model.asset.impl.ContextImpl
		 * @see org.avatar.ds.model.asset.impl.DataSpaceAssetPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Vocab</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__VOCAB = eINSTANCE.getContext_Vocab();

		/**
		 * The meta object literal for the '{@link org.avatar.ds.model.asset.impl.AssetPolicyImpl <em>Asset Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.avatar.ds.model.asset.impl.AssetPolicyImpl
		 * @see org.avatar.ds.model.asset.impl.DataSpaceAssetPackageImpl#getAssetPolicy()
		 * @generated
		 */
		EClass ASSET_POLICY = eINSTANCE.getAssetPolicy();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_POLICY__ID = eINSTANCE.getAssetPolicy_Id();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_POLICY__CONTEXT = eINSTANCE.getAssetPolicy_Context();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_POLICY__POLICY = eINSTANCE.getAssetPolicy_Policy();

		/**
		 * The meta object literal for the '{@link org.avatar.ds.model.asset.impl.PolicyImpl <em>Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.avatar.ds.model.asset.impl.PolicyImpl
		 * @see org.avatar.ds.model.asset.impl.DataSpaceAssetPackageImpl#getPolicy()
		 * @generated
		 */
		EClass POLICY = eINSTANCE.getPolicy();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY__CONTEXT = eINSTANCE.getPolicy_Context();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY__TYPE = eINSTANCE.getPolicy_Type();

		/**
		 * The meta object literal for the '<em><b>Permission</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY__PERMISSION = eINSTANCE.getPolicy_Permission();

		/**
		 * The meta object literal for the '<em><b>Prohibition</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY__PROHIBITION = eINSTANCE.getPolicy_Prohibition();

		/**
		 * The meta object literal for the '<em><b>Obligation</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY__OBLIGATION = eINSTANCE.getPolicy_Obligation();

		/**
		 * The meta object literal for the '{@link org.avatar.ds.model.asset.impl.PolicyContextImpl <em>Policy Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.avatar.ds.model.asset.impl.PolicyContextImpl
		 * @see org.avatar.ds.model.asset.impl.DataSpaceAssetPackageImpl#getPolicyContext()
		 * @generated
		 */
		EClass POLICY_CONTEXT = eINSTANCE.getPolicyContext();

		/**
		 * The meta object literal for the '<em><b>Odrl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_CONTEXT__ODRL = eINSTANCE.getPolicyContext_Odrl();

		/**
		 * The meta object literal for the '{@link org.avatar.ds.model.asset.impl.ContractDefinitionImpl <em>Contract Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.avatar.ds.model.asset.impl.ContractDefinitionImpl
		 * @see org.avatar.ds.model.asset.impl.DataSpaceAssetPackageImpl#getContractDefinition()
		 * @generated
		 */
		EClass CONTRACT_DEFINITION = eINSTANCE.getContractDefinition();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT_DEFINITION__ID = eINSTANCE.getContractDefinition_Id();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT_DEFINITION__CONTEXT = eINSTANCE.getContractDefinition_Context();

		/**
		 * The meta object literal for the '<em><b>Access Policy Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT_DEFINITION__ACCESS_POLICY_ID = eINSTANCE.getContractDefinition_AccessPolicyId();

		/**
		 * The meta object literal for the '<em><b>Contract Policy Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT_DEFINITION__CONTRACT_POLICY_ID = eINSTANCE.getContractDefinition_ContractPolicyId();

		/**
		 * The meta object literal for the '<em><b>Assets Selector</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT_DEFINITION__ASSETS_SELECTOR = eINSTANCE.getContractDefinition_AssetsSelector();

		/**
		 * The meta object literal for the '{@link org.avatar.ds.model.asset.impl.DataSpaceResponseImpl <em>Data Space Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.avatar.ds.model.asset.impl.DataSpaceResponseImpl
		 * @see org.avatar.ds.model.asset.impl.DataSpaceAssetPackageImpl#getDataSpaceResponse()
		 * @generated
		 */
		EClass DATA_SPACE_RESPONSE = eINSTANCE.getDataSpaceResponse();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SPACE_RESPONSE__ID = eINSTANCE.getDataSpaceResponse_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SPACE_RESPONSE__TYPE = eINSTANCE.getDataSpaceResponse_Type();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SPACE_RESPONSE__CONTEXT = eINSTANCE.getDataSpaceResponse_Context();

	}

} //DataSpaceAssetPackage
