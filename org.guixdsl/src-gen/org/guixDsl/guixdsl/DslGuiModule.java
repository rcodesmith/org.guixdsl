/**
 */
package org.guixdsl.guixdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Gui Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.guixdsl.guixdsl.DslGuiModule#getHint <em>Hint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.guixdsl.guixdsl.GuixdslPackage#getDslGuiModule()
 * @model
 * @generated
 */
public interface DslGuiModule extends DslAbstractGuiElement
{
  /**
   * Returns the value of the '<em><b>Hint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hint</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hint</em>' attribute.
   * @see #setHint(String)
   * @see org.guixdsl.guixdsl.GuixdslPackage#getDslGuiModule_Hint()
   * @model
   * @generated
   */
  String getHint();

  /**
   * Sets the value of the '{@link org.guixdsl.guixdsl.DslGuiModule#getHint <em>Hint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hint</em>' attribute.
   * @see #getHint()
   * @generated
   */
  void setHint(String value);

} // DslGuiModule
