/**
 */
package org.xtext.verifier.slk.sLEEK.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.verifier.slk.sLEEK.Argu;
import org.xtext.verifier.slk.sLEEK.SLEEK;
import org.xtext.verifier.slk.sLEEK.SLEEKPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SLEEK</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.verifier.slk.sLEEK.impl.SLEEKImpl#getKeywords <em>Keywords</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SLEEKImpl extends MinimalEObjectImpl.Container implements SLEEK
{
  /**
   * The cached value of the '{@link #getKeywords() <em>Keywords</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeywords()
   * @generated
   * @ordered
   */
  protected EList<Argu> keywords;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SLEEKImpl()
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
    return SLEEKPackage.Literals.SLEEK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Argu> getKeywords()
  {
    if (keywords == null)
    {
      keywords = new EObjectContainmentEList<Argu>(Argu.class, this, SLEEKPackage.SLEEK__KEYWORDS);
    }
    return keywords;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SLEEKPackage.SLEEK__KEYWORDS:
        return ((InternalEList<?>)getKeywords()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SLEEKPackage.SLEEK__KEYWORDS:
        return getKeywords();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SLEEKPackage.SLEEK__KEYWORDS:
        getKeywords().clear();
        getKeywords().addAll((Collection<? extends Argu>)newValue);
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
      case SLEEKPackage.SLEEK__KEYWORDS:
        getKeywords().clear();
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
      case SLEEKPackage.SLEEK__KEYWORDS:
        return keywords != null && !keywords.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SLEEKImpl
