/**
 */
package org.guixDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.guixDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GuixDslFactoryImpl extends EFactoryImpl implements GuixDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GuixDslFactory init()
  {
    try
    {
      GuixDslFactory theGuixDslFactory = (GuixDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.GuixDsl.org"); 
      if (theGuixDslFactory != null)
      {
        return theGuixDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GuixDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuixDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GuixDslPackage.DSL_MODEL: return createDslModel();
      case GuixDslPackage.DSL_ABSTRACT_GUI_ELEMENT: return createDslAbstractGuiElement();
      case GuixDslPackage.DSL_GUI_MODULE: return createDslGuiModule();
      case GuixDslPackage.DSL_VIEW: return createDslView();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslModel createDslModel()
  {
    DslModelImpl dslModel = new DslModelImpl();
    return dslModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslAbstractGuiElement createDslAbstractGuiElement()
  {
    DslAbstractGuiElementImpl dslAbstractGuiElement = new DslAbstractGuiElementImpl();
    return dslAbstractGuiElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslGuiModule createDslGuiModule()
  {
    DslGuiModuleImpl dslGuiModule = new DslGuiModuleImpl();
    return dslGuiModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslView createDslView()
  {
    DslViewImpl dslView = new DslViewImpl();
    return dslView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuixDslPackage getGuixDslPackage()
  {
    return (GuixDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GuixDslPackage getPackage()
  {
    return GuixDslPackage.eINSTANCE;
  }

} //GuixDslFactoryImpl
