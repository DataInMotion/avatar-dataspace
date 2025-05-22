/**
 */
package org.avatar.ds.model.dataspace.impl;

import java.util.Map;

import org.avatar.ds.model.dataspace.Asset;
import org.avatar.ds.model.dataspace.AssetPolicy;
import org.avatar.ds.model.dataspace.Context;
import org.avatar.ds.model.dataspace.ContractDefinition;
import org.avatar.ds.model.dataspace.DataAddress;
import org.avatar.ds.model.dataspace.DataSpaceResponse;
import org.avatar.ds.model.dataspace.DataspaceFactory;
import org.avatar.ds.model.dataspace.DataspacePackage;
import org.avatar.ds.model.dataspace.Policy;
import org.avatar.ds.model.dataspace.PolicyContext;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataspacePackageImpl extends EPackageImpl implements DataspacePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSpaceResponseEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.avatar.ds.model.dataspace.DataspacePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataspacePackageImpl() {
		super(eNS_URI, DataspaceFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DataspacePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataspacePackage init() {
		if (isInited) return (DataspacePackage)EPackage.Registry.INSTANCE.getEPackage(DataspacePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDataspacePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DataspacePackageImpl theDataspacePackage = registeredDataspacePackage instanceof DataspacePackageImpl ? (DataspacePackageImpl)registeredDataspacePackage : new DataspacePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDataspacePackage.createPackageContents();

		// Initialize created meta-data
		theDataspacePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataspacePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataspacePackage.eNS_URI, theDataspacePackage);
		return theDataspacePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAsset() {
		return assetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsset_Id() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAsset_Context() {
		return (EReference)assetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAsset_DataAddress() {
		return (EReference)assetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAsset_Properties() {
		return (EReference)assetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataAddress() {
		return dataAddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataAddress_Type() {
		return (EAttribute)dataAddressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataAddress_Name() {
		return (EAttribute)dataAddressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataAddress_BaseUrl() {
		return (EAttribute)dataAddressEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataAddress_ProxyPath() {
		return (EAttribute)dataAddressEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyMap() {
		return propertyMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyMap_Key() {
		return (EAttribute)propertyMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyMap_Value() {
		return (EAttribute)propertyMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContext_Vocab() {
		return (EAttribute)contextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssetPolicy() {
		return assetPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssetPolicy_Id() {
		return (EAttribute)assetPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssetPolicy_Type() {
		return (EAttribute)assetPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssetPolicy_Context() {
		return (EReference)assetPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssetPolicy_Policy() {
		return (EReference)assetPolicyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssetPolicy_CreatedAt() {
		return (EAttribute)assetPolicyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolicy() {
		return policyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicy_Id() {
		return (EAttribute)policyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicy_Type() {
		return (EAttribute)policyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicy_Context() {
		return (EAttribute)policyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicy_Permission() {
		return (EAttribute)policyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicy_Prohibition() {
		return (EAttribute)policyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicy_Obligation() {
		return (EAttribute)policyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolicyContext() {
		return policyContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyContext_Odrl() {
		return (EAttribute)policyContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicyContext_Edc() {
		return (EAttribute)policyContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContractDefinition() {
		return contractDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContractDefinition_Id() {
		return (EAttribute)contractDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContractDefinition_Context() {
		return (EReference)contractDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContractDefinition_AccessPolicyId() {
		return (EAttribute)contractDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContractDefinition_ContractPolicyId() {
		return (EAttribute)contractDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContractDefinition_AssetsSelector() {
		return (EAttribute)contractDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataSpaceResponse() {
		return dataSpaceResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSpaceResponse_Id() {
		return (EAttribute)dataSpaceResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSpaceResponse_Type() {
		return (EAttribute)dataSpaceResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataSpaceResponse_Context() {
		return (EReference)dataSpaceResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSpaceResponse_CreatedAt() {
		return (EAttribute)dataSpaceResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSpaceResponse_Message() {
		return (EAttribute)dataSpaceResponseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataspaceFactory getDataspaceFactory() {
		return (DataspaceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		assetEClass = createEClass(ASSET);
		createEAttribute(assetEClass, ASSET__ID);
		createEReference(assetEClass, ASSET__CONTEXT);
		createEReference(assetEClass, ASSET__DATA_ADDRESS);
		createEReference(assetEClass, ASSET__PROPERTIES);

		dataAddressEClass = createEClass(DATA_ADDRESS);
		createEAttribute(dataAddressEClass, DATA_ADDRESS__TYPE);
		createEAttribute(dataAddressEClass, DATA_ADDRESS__NAME);
		createEAttribute(dataAddressEClass, DATA_ADDRESS__BASE_URL);
		createEAttribute(dataAddressEClass, DATA_ADDRESS__PROXY_PATH);

		propertyMapEClass = createEClass(PROPERTY_MAP);
		createEAttribute(propertyMapEClass, PROPERTY_MAP__KEY);
		createEAttribute(propertyMapEClass, PROPERTY_MAP__VALUE);

		contextEClass = createEClass(CONTEXT);
		createEAttribute(contextEClass, CONTEXT__VOCAB);

		assetPolicyEClass = createEClass(ASSET_POLICY);
		createEAttribute(assetPolicyEClass, ASSET_POLICY__ID);
		createEAttribute(assetPolicyEClass, ASSET_POLICY__TYPE);
		createEReference(assetPolicyEClass, ASSET_POLICY__CONTEXT);
		createEReference(assetPolicyEClass, ASSET_POLICY__POLICY);
		createEAttribute(assetPolicyEClass, ASSET_POLICY__CREATED_AT);

		policyEClass = createEClass(POLICY);
		createEAttribute(policyEClass, POLICY__ID);
		createEAttribute(policyEClass, POLICY__TYPE);
		createEAttribute(policyEClass, POLICY__CONTEXT);
		createEAttribute(policyEClass, POLICY__PERMISSION);
		createEAttribute(policyEClass, POLICY__PROHIBITION);
		createEAttribute(policyEClass, POLICY__OBLIGATION);

		policyContextEClass = createEClass(POLICY_CONTEXT);
		createEAttribute(policyContextEClass, POLICY_CONTEXT__ODRL);
		createEAttribute(policyContextEClass, POLICY_CONTEXT__EDC);

		contractDefinitionEClass = createEClass(CONTRACT_DEFINITION);
		createEAttribute(contractDefinitionEClass, CONTRACT_DEFINITION__ID);
		createEReference(contractDefinitionEClass, CONTRACT_DEFINITION__CONTEXT);
		createEAttribute(contractDefinitionEClass, CONTRACT_DEFINITION__ACCESS_POLICY_ID);
		createEAttribute(contractDefinitionEClass, CONTRACT_DEFINITION__CONTRACT_POLICY_ID);
		createEAttribute(contractDefinitionEClass, CONTRACT_DEFINITION__ASSETS_SELECTOR);

		dataSpaceResponseEClass = createEClass(DATA_SPACE_RESPONSE);
		createEAttribute(dataSpaceResponseEClass, DATA_SPACE_RESPONSE__ID);
		createEAttribute(dataSpaceResponseEClass, DATA_SPACE_RESPONSE__TYPE);
		createEReference(dataSpaceResponseEClass, DATA_SPACE_RESPONSE__CONTEXT);
		createEAttribute(dataSpaceResponseEClass, DATA_SPACE_RESPONSE__CREATED_AT);
		createEAttribute(dataSpaceResponseEClass, DATA_SPACE_RESPONSE__MESSAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		policyContextEClass.getESuperTypes().add(this.getContext());

		// Initialize classes, features, and operations; add parameters
		initEClass(assetEClass, Asset.class, "Asset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsset_Id(), ecorePackage.getEString(), "id", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsset_Context(), this.getContext(), null, "context", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsset_DataAddress(), this.getDataAddress(), null, "dataAddress", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsset_Properties(), this.getPropertyMap(), null, "properties", null, 0, -1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataAddressEClass, DataAddress.class, "DataAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataAddress_Type(), ecorePackage.getEString(), "type", null, 0, 1, DataAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataAddress_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataAddress_BaseUrl(), ecorePackage.getEString(), "baseUrl", null, 0, 1, DataAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataAddress_ProxyPath(), ecorePackage.getEBoolean(), "proxyPath", null, 0, 1, DataAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyMapEClass, Map.Entry.class, "PropertyMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyMap_Value(), ecorePackage.getEString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContext_Vocab(), ecorePackage.getEString(), "vocab", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assetPolicyEClass, AssetPolicy.class, "AssetPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssetPolicy_Id(), ecorePackage.getEString(), "id", null, 0, 1, AssetPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssetPolicy_Type(), ecorePackage.getEString(), "type", null, 0, 1, AssetPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssetPolicy_Context(), this.getPolicyContext(), null, "context", null, 0, 1, AssetPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssetPolicy_Policy(), this.getPolicy(), null, "policy", null, 0, 1, AssetPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssetPolicy_CreatedAt(), ecorePackage.getELong(), "createdAt", null, 0, 1, AssetPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyEClass, Policy.class, "Policy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolicy_Id(), ecorePackage.getEString(), "id", null, 0, 1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicy_Type(), ecorePackage.getEString(), "type", null, 0, 1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicy_Context(), ecorePackage.getEString(), "context", null, 0, 1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicy_Permission(), ecorePackage.getEString(), "permission", null, 0, -1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicy_Prohibition(), ecorePackage.getEString(), "prohibition", null, 0, -1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicy_Obligation(), ecorePackage.getEString(), "obligation", null, 0, -1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyContextEClass, PolicyContext.class, "PolicyContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolicyContext_Odrl(), ecorePackage.getEString(), "odrl", null, 0, 1, PolicyContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyContext_Edc(), ecorePackage.getEString(), "edc", null, 0, 1, PolicyContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contractDefinitionEClass, ContractDefinition.class, "ContractDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContractDefinition_Id(), ecorePackage.getEString(), "id", null, 0, 1, ContractDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContractDefinition_Context(), this.getContext(), null, "context", null, 0, 1, ContractDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContractDefinition_AccessPolicyId(), ecorePackage.getEString(), "accessPolicyId", null, 0, 1, ContractDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContractDefinition_ContractPolicyId(), ecorePackage.getEString(), "contractPolicyId", null, 0, 1, ContractDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContractDefinition_AssetsSelector(), ecorePackage.getEString(), "assetsSelector", null, 0, -1, ContractDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSpaceResponseEClass, DataSpaceResponse.class, "DataSpaceResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSpaceResponse_Id(), ecorePackage.getEString(), "id", null, 0, 1, DataSpaceResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSpaceResponse_Type(), ecorePackage.getEString(), "type", null, 0, 1, DataSpaceResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSpaceResponse_Context(), this.getContext(), null, "context", null, 0, 1, DataSpaceResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSpaceResponse_CreatedAt(), ecorePackage.getELong(), "createdAt", null, 0, 1, DataSpaceResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSpaceResponse_Message(), ecorePackage.getEString(), "message", null, 0, 1, DataSpaceResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Version
		createVersionAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// JsonProperty
		createJsonPropertyAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Version</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVersionAnnotations() {
		String source = "Version";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "value", "1.0"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "complianceLevel", "17.0",
			   "oSGiCompatible", "true",
			   "basePackage", "org.avatar.ds.model",
			   "resource", "XMI"
		   });
		addAnnotation
		  (getContractDefinition_AssetsSelector(),
		   source,
		   new String[] {
			   "documentation", "If an empty list is provided, every asset will be associated with the specified policies."
		   });
	}

	/**
	 * Initializes the annotations for <b>JsonProperty</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createJsonPropertyAnnotations() {
		String source = "JsonProperty";
		addAnnotation
		  (getAsset_Id(),
		   source,
		   new String[] {
			   "value", "@id"
		   });
		addAnnotation
		  (getAsset_Context(),
		   source,
		   new String[] {
			   "value", "@context"
		   });
		addAnnotation
		  (getContext_Vocab(),
		   source,
		   new String[] {
			   "value", "@vocab"
		   });
		addAnnotation
		  (getAssetPolicy_Id(),
		   source,
		   new String[] {
			   "value", "@id"
		   });
		addAnnotation
		  (getAssetPolicy_Type(),
		   source,
		   new String[] {
			   "value", "@type"
		   });
		addAnnotation
		  (getAssetPolicy_Context(),
		   source,
		   new String[] {
			   "value", "@context"
		   });
		addAnnotation
		  (getPolicy_Id(),
		   source,
		   new String[] {
			   "value", "@id"
		   });
		addAnnotation
		  (getPolicy_Type(),
		   source,
		   new String[] {
			   "value", "@type"
		   });
		addAnnotation
		  (getPolicy_Context(),
		   source,
		   new String[] {
			   "value", "@context"
		   });
		addAnnotation
		  (getContractDefinition_Id(),
		   source,
		   new String[] {
			   "value", "@id"
		   });
		addAnnotation
		  (getContractDefinition_Context(),
		   source,
		   new String[] {
			   "value", "@context"
		   });
		addAnnotation
		  (getDataSpaceResponse_Id(),
		   source,
		   new String[] {
			   "value", "@id"
		   });
		addAnnotation
		  (getDataSpaceResponse_Type(),
		   source,
		   new String[] {
			   "value", "@type"
		   });
		addAnnotation
		  (getDataSpaceResponse_Context(),
		   source,
		   new String[] {
			   "value", "@context"
		   });
	}

} //DataspacePackageImpl
