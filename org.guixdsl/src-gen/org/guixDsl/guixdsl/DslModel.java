/**
 */
package org.guixdsl.guixdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.guixdsl.guixdsl.DslModel#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.guixdsl.guixdsl.GuixdslPackage#getDslModel()
 * @model
 * @generated
 */
public interface DslModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.guixdsl.guixdsl.DslAbstractGuiElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.guixdsl.guixdsl.GuixdslPackage#getDslModel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<DslAbstractGuiElement> getElements();

} // DslModel
