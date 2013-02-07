/**
 */
package org.guixdsl.guixdsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.guixdsl.guixdsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GuixdslFactoryImpl extends EFactoryImpl implements GuixdslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GuixdslFactory init()
  {
    try
    {
      GuixdslFactory theGuixdslFactory = (GuixdslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.guixdsl.org/Guixdsl"); 
      if (theGuixdslFactory != null)
      {
        return theGuixdslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GuixdslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuixdslFactoryImpl()
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
      case GuixdslPackage.DSL_MODEL: return createDslModel();
      case GuixdslPackage.DSL_ABSTRACT_GUI_ELEMENT: return createDslAbstractGuiElement();
      case GuixdslPackage.DSL_GUI_MODULE: return createDslGuiModule();
      case GuixdslPackage.DSL_VIEW: return createDslView();
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
  public GuixdslPackage getGuixdslPackage()
  {
    return (GuixdslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GuixdslPackage getPackage()
  {
    return GuixdslPackage.eINSTANCE;
  }

} //GuixdslFactoryImpl
