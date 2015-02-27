/**
 */
package org.xtext.verifier.slk.sLEEK;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SLEEK</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.verifier.slk.sLEEK.SLEEK#getKeywords <em>Keywords</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.verifier.slk.sLEEK.SLEEKPackage#getSLEEK()
 * @model
 * @generated
 */
public interface SLEEK extends EObject
{
  /**
   * Returns the value of the '<em><b>Keywords</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.verifier.slk.sLEEK.Argu}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Keywords</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Keywords</em>' containment reference list.
   * @see org.xtext.verifier.slk.sLEEK.SLEEKPackage#getSLEEK_Keywords()
   * @model containment="true"
   * @generated
   */
  EList<Argu> getKeywords();

} // SLEEK
