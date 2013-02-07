/**
 */
package org.guixdsl.guixdsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.guixdsl.guixdsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.guixdsl.guixdsl.GuixdslPackage
 * @generated
 */
public class GuixdslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GuixdslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuixdslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = GuixdslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case GuixdslPackage.DSL_MODEL:
      {
        DslModel dslModel = (DslModel)theEObject;
        T result = caseDslModel(dslModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuixdslPackage.DSL_ABSTRACT_GUI_ELEMENT:
      {
        DslAbstractGuiElement dslAbstractGuiElement = (DslAbstractGuiElement)theEObject;
        T result = caseDslAbstractGuiElement(dslAbstractGuiElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuixdslPackage.DSL_GUI_MODULE:
      {
        DslGuiModule dslGuiModule = (DslGuiModule)theEObject;
        T result = caseDslGuiModule(dslGuiModule);
        if (result == null) result = caseDslAbstractGuiElement(dslGuiModule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuixdslPackage.DSL_VIEW:
      {
        DslView dslView = (DslView)theEObject;
        T result = caseDslView(dslView);
        if (result == null) result = caseDslAbstractGuiElement(dslView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dsl Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dsl Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDslModel(DslModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dsl Abstract Gui Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dsl Abstract Gui Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDslAbstractGuiElement(DslAbstractGuiElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dsl Gui Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dsl Gui Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDslGuiModule(DslGuiModule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dsl View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dsl View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDslView(DslView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //GuixdslSwitch
