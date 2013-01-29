/**
 */
package org.guixDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.guixDsl.DslAbstractGuiElement;
import org.guixDsl.DslGuiModule;
import org.guixDsl.DslModel;
import org.guixDsl.DslView;
import org.guixDsl.GuixDslFactory;
import org.guixDsl.GuixDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GuixDslPackageImpl extends EPackageImpl implements GuixDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslAbstractGuiElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslGuiModuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslViewEClass = null;

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
   * @see org.guixDsl.GuixDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GuixDslPackageImpl()
  {
    super(eNS_URI, GuixDslFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link GuixDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GuixDslPackage init()
  {
    if (isInited) return (GuixDslPackage)EPackage.Registry.INSTANCE.getEPackage(GuixDslPackage.eNS_URI);

    // Obtain or create and register package
    GuixDslPackageImpl theGuixDslPackage = (GuixDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GuixDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GuixDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theGuixDslPackage.createPackageContents();

    // Initialize created meta-data
    theGuixDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGuixDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GuixDslPackage.eNS_URI, theGuixDslPackage);
    return theGuixDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDslModel()
  {
    return dslModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslModel_Elements()
  {
    return (EReference)dslModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDslAbstractGuiElement()
  {
    return dslAbstractGuiElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDslAbstractGuiElement_Documentation()
  {
    return (EAttribute)dslAbstractGuiElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDslAbstractGuiElement_Name()
  {
    return (EAttribute)dslAbstractGuiElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDslGuiModule()
  {
    return dslGuiModuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDslGuiModule_Hint()
  {
    return (EAttribute)dslGuiModuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDslView()
  {
    return dslViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuixDslFactory getGuixDslFactory()
  {
    return (GuixDslFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    dslModelEClass = createEClass(DSL_MODEL);
    createEReference(dslModelEClass, DSL_MODEL__ELEMENTS);

    dslAbstractGuiElementEClass = createEClass(DSL_ABSTRACT_GUI_ELEMENT);
    createEAttribute(dslAbstractGuiElementEClass, DSL_ABSTRACT_GUI_ELEMENT__DOCUMENTATION);
    createEAttribute(dslAbstractGuiElementEClass, DSL_ABSTRACT_GUI_ELEMENT__NAME);

    dslGuiModuleEClass = createEClass(DSL_GUI_MODULE);
    createEAttribute(dslGuiModuleEClass, DSL_GUI_MODULE__HINT);

    dslViewEClass = createEClass(DSL_VIEW);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    dslGuiModuleEClass.getESuperTypes().add(this.getDslAbstractGuiElement());
    dslViewEClass.getESuperTypes().add(this.getDslAbstractGuiElement());

    // Initialize classes and features; add operations and parameters
    initEClass(dslModelEClass, DslModel.class, "DslModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDslModel_Elements(), this.getDslAbstractGuiElement(), null, "elements", null, 0, -1, DslModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslAbstractGuiElementEClass, DslAbstractGuiElement.class, "DslAbstractGuiElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDslAbstractGuiElement_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, DslAbstractGuiElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDslAbstractGuiElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, DslAbstractGuiElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslGuiModuleEClass, DslGuiModule.class, "DslGuiModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDslGuiModule_Hint(), ecorePackage.getEString(), "hint", null, 0, 1, DslGuiModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslViewEClass, DslView.class, "DslView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //GuixDslPackageImpl
