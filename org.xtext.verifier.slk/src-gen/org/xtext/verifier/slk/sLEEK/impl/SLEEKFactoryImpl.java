/**
 */
package org.xtext.verifier.slk.sLEEK.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.verifier.slk.sLEEK.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SLEEKFactoryImpl extends EFactoryImpl implements SLEEKFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SLEEKFactory init()
  {
    try
    {
      SLEEKFactory theSLEEKFactory = (SLEEKFactory)EPackage.Registry.INSTANCE.getEFactory(SLEEKPackage.eNS_URI);
      if (theSLEEKFactory != null)
      {
        return theSLEEKFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SLEEKFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SLEEKFactoryImpl()
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
      case SLEEKPackage.SLEEK: return createSLEEK();
      case SLEEKPackage.ARGU: return createArgu();
      case SLEEKPackage.DATA: return createData();
      case SLEEKPackage.LEMMA: return createLemma();
      case SLEEKPackage.PRECODITION: return createPrecodition();
      case SLEEKPackage.ARGUMENT: return createArgument();
      case SLEEKPackage.PRINT: return createPrint();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SLEEK createSLEEK()
  {
    SLEEKImpl sleek = new SLEEKImpl();
    return sleek;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argu createArgu()
  {
    ArguImpl argu = new ArguImpl();
    return argu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Data createData()
  {
    DataImpl data = new DataImpl();
    return data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Lemma createLemma()
  {
    LemmaImpl lemma = new LemmaImpl();
    return lemma;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Precodition createPrecodition()
  {
    PrecoditionImpl precodition = new PrecoditionImpl();
    return precodition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument createArgument()
  {
    ArgumentImpl argument = new ArgumentImpl();
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Print createPrint()
  {
    PrintImpl print = new PrintImpl();
    return print;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SLEEKPackage getSLEEKPackage()
  {
    return (SLEEKPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SLEEKPackage getPackage()
  {
    return SLEEKPackage.eINSTANCE;
  }

} //SLEEKFactoryImpl
