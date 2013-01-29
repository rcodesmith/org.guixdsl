/**
 */
package org.guixDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.guixDsl.DslGuiModule;
import org.guixDsl.GuixDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Gui Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.guixDsl.impl.DslGuiModuleImpl#getHint <em>Hint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DslGuiModuleImpl extends DslAbstractGuiElementImpl implements DslGuiModule
{
  /**
   * The default value of the '{@link #getHint() <em>Hint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHint()
   * @generated
   * @ordered
   */
  protected static final String HINT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHint() <em>Hint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHint()
   * @generated
   * @ordered
   */
  protected String hint = HINT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DslGuiModuleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GuixDslPackage.Literals.DSL_GUI_MODULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHint()
  {
    return hint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHint(String newHint)
  {
    String oldHint = hint;
    hint = newHint;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuixDslPackage.DSL_GUI_MODULE__HINT, oldHint, hint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GuixDslPackage.DSL_GUI_MODULE__HINT:
        return getHint();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GuixDslPackage.DSL_GUI_MODULE__HINT:
        setHint((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GuixDslPackage.DSL_GUI_MODULE__HINT:
        setHint(HINT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GuixDslPackage.DSL_GUI_MODULE__HINT:
        return HINT_EDEFAULT == null ? hint != null : !HINT_EDEFAULT.equals(hint);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (hint: ");
    result.append(hint);
    result.append(')');
    return result.toString();
  }

} //DslGuiModuleImpl
