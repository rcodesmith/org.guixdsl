/**
 */
package org.guixDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.guixDsl.GuixDslFactory
 * @model kind="package"
 * @generated
 */
public interface GuixDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "guixDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.GuixDsl.org";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "guixDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GuixDslPackage eINSTANCE = org.guixDsl.impl.GuixDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.guixDsl.impl.DslModelImpl <em>Dsl Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.guixDsl.impl.DslModelImpl
   * @see org.guixDsl.impl.GuixDslPackageImpl#getDslModel()
   * @generated
   */
  int DSL_MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Dsl Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.guixDsl.impl.DslAbstractGuiElementImpl <em>Dsl Abstract Gui Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.guixDsl.impl.DslAbstractGuiElementImpl
   * @see org.guixDsl.impl.GuixDslPackageImpl#getDslAbstractGuiElement()
   * @generated
   */
  int DSL_ABSTRACT_GUI_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_ABSTRACT_GUI_ELEMENT__DOCUMENTATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_ABSTRACT_GUI_ELEMENT__NAME = 1;

  /**
   * The number of structural features of the '<em>Dsl Abstract Gui Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_ABSTRACT_GUI_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.guixDsl.impl.DslGuiModuleImpl <em>Dsl Gui Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.guixDsl.impl.DslGuiModuleImpl
   * @see org.guixDsl.impl.GuixDslPackageImpl#getDslGuiModule()
   * @generated
   */
  int DSL_GUI_MODULE = 2;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_GUI_MODULE__DOCUMENTATION = DSL_ABSTRACT_GUI_ELEMENT__DOCUMENTATION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_GUI_MODULE__NAME = DSL_ABSTRACT_GUI_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Hint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_GUI_MODULE__HINT = DSL_ABSTRACT_GUI_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dsl Gui Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_GUI_MODULE_FEATURE_COUNT = DSL_ABSTRACT_GUI_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.guixDsl.impl.DslViewImpl <em>Dsl View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.guixDsl.impl.DslViewImpl
   * @see org.guixDsl.impl.GuixDslPackageImpl#getDslView()
   * @generated
   */
  int DSL_VIEW = 3;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_VIEW__DOCUMENTATION = DSL_ABSTRACT_GUI_ELEMENT__DOCUMENTATION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_VIEW__NAME = DSL_ABSTRACT_GUI_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Dsl View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_VIEW_FEATURE_COUNT = DSL_ABSTRACT_GUI_ELEMENT_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.guixDsl.DslModel <em>Dsl Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl Model</em>'.
   * @see org.guixDsl.DslModel
   * @generated
   */
  EClass getDslModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.guixDsl.DslModel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.guixDsl.DslModel#getElements()
   * @see #getDslModel()
   * @generated
   */
  EReference getDslModel_Elements();

  /**
   * Returns the meta object for class '{@link org.guixDsl.DslAbstractGuiElement <em>Dsl Abstract Gui Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl Abstract Gui Element</em>'.
   * @see org.guixDsl.DslAbstractGuiElement
   * @generated
   */
  EClass getDslAbstractGuiElement();

  /**
   * Returns the meta object for the attribute '{@link org.guixDsl.DslAbstractGuiElement#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see org.guixDsl.DslAbstractGuiElement#getDocumentation()
   * @see #getDslAbstractGuiElement()
   * @generated
   */
  EAttribute getDslAbstractGuiElement_Documentation();

  /**
   * Returns the meta object for the attribute '{@link org.guixDsl.DslAbstractGuiElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.guixDsl.DslAbstractGuiElement#getName()
   * @see #getDslAbstractGuiElement()
   * @generated
   */
  EAttribute getDslAbstractGuiElement_Name();

  /**
   * Returns the meta object for class '{@link org.guixDsl.DslGuiModule <em>Dsl Gui Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl Gui Module</em>'.
   * @see org.guixDsl.DslGuiModule
   * @generated
   */
  EClass getDslGuiModule();

  /**
   * Returns the meta object for the attribute '{@link org.guixDsl.DslGuiModule#getHint <em>Hint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hint</em>'.
   * @see org.guixDsl.DslGuiModule#getHint()
   * @see #getDslGuiModule()
   * @generated
   */
  EAttribute getDslGuiModule_Hint();

  /**
   * Returns the meta object for class '{@link org.guixDsl.DslView <em>Dsl View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl View</em>'.
   * @see org.guixDsl.DslView
   * @generated
   */
  EClass getDslView();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GuixDslFactory getGuixDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.guixDsl.impl.DslModelImpl <em>Dsl Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.guixDsl.impl.DslModelImpl
     * @see org.guixDsl.impl.GuixDslPackageImpl#getDslModel()
     * @generated
     */
    EClass DSL_MODEL = eINSTANCE.getDslModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_MODEL__ELEMENTS = eINSTANCE.getDslModel_Elements();

    /**
     * The meta object literal for the '{@link org.guixDsl.impl.DslAbstractGuiElementImpl <em>Dsl Abstract Gui Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.guixDsl.impl.DslAbstractGuiElementImpl
     * @see org.guixDsl.impl.GuixDslPackageImpl#getDslAbstractGuiElement()
     * @generated
     */
    EClass DSL_ABSTRACT_GUI_ELEMENT = eINSTANCE.getDslAbstractGuiElement();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_ABSTRACT_GUI_ELEMENT__DOCUMENTATION = eINSTANCE.getDslAbstractGuiElement_Documentation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_ABSTRACT_GUI_ELEMENT__NAME = eINSTANCE.getDslAbstractGuiElement_Name();

    /**
     * The meta object literal for the '{@link org.guixDsl.impl.DslGuiModuleImpl <em>Dsl Gui Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.guixDsl.impl.DslGuiModuleImpl
     * @see org.guixDsl.impl.GuixDslPackageImpl#getDslGuiModule()
     * @generated
     */
    EClass DSL_GUI_MODULE = eINSTANCE.getDslGuiModule();

    /**
     * The meta object literal for the '<em><b>Hint</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_GUI_MODULE__HINT = eINSTANCE.getDslGuiModule_Hint();

    /**
     * The meta object literal for the '{@link org.guixDsl.impl.DslViewImpl <em>Dsl View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.guixDsl.impl.DslViewImpl
     * @see org.guixDsl.impl.GuixDslPackageImpl#getDslView()
     * @generated
     */
    EClass DSL_VIEW = eINSTANCE.getDslView();

  }

} //GuixDslPackage
