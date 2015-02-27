/**
 */
package org.xtext.verifier.slk.sLEEK;

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
 * @see org.xtext.verifier.slk.sLEEK.SLEEKFactory
 * @model kind="package"
 * @generated
 */
public interface SLEEKPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sLEEK";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/verifier/slk/SLEEK";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sLEEK";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SLEEKPackage eINSTANCE = org.xtext.verifier.slk.sLEEK.impl.SLEEKPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.verifier.slk.sLEEK.impl.SLEEKImpl <em>SLEEK</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.verifier.slk.sLEEK.impl.SLEEKImpl
   * @see org.xtext.verifier.slk.sLEEK.impl.SLEEKPackageImpl#getSLEEK()
   * @generated
   */
  int SLEEK = 0;

  /**
   * The feature id for the '<em><b>Keywords</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLEEK__KEYWORDS = 0;

  /**
   * The number of structural features of the '<em>SLEEK</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLEEK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.verifier.slk.sLEEK.impl.ArguImpl <em>Argu</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.verifier.slk.sLEEK.impl.ArguImpl
   * @see org.xtext.verifier.slk.sLEEK.impl.SLEEKPackageImpl#getArgu()
   * @generated
   */
  int ARGU = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGU__NAME = 0;

  /**
   * The number of structural features of the '<em>Argu</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGU_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.verifier.slk.sLEEK.impl.DataImpl <em>Data</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.verifier.slk.sLEEK.impl.DataImpl
   * @see org.xtext.verifier.slk.sLEEK.impl.SLEEKPackageImpl#getData()
   * @generated
   */
  int DATA = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA__NAME = ARGU__NAME;

  /**
   * The number of structural features of the '<em>Data</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_FEATURE_COUNT = ARGU_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.verifier.slk.sLEEK.impl.LemmaImpl <em>Lemma</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.verifier.slk.sLEEK.impl.LemmaImpl
   * @see org.xtext.verifier.slk.sLEEK.impl.SLEEKPackageImpl#getLemma()
   * @generated
   */
  int LEMMA = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEMMA__NAME = ARGU__NAME;

  /**
   * The number of structural features of the '<em>Lemma</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEMMA_FEATURE_COUNT = ARGU_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.verifier.slk.sLEEK.impl.PrecoditionImpl <em>Precodition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.verifier.slk.sLEEK.impl.PrecoditionImpl
   * @see org.xtext.verifier.slk.sLEEK.impl.SLEEKPackageImpl#getPrecodition()
   * @generated
   */
  int PRECODITION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECODITION__NAME = ARGU__NAME;

  /**
   * The number of structural features of the '<em>Precodition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECODITION_FEATURE_COUNT = ARGU_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.verifier.slk.sLEEK.impl.ArgumentImpl <em>Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.verifier.slk.sLEEK.impl.ArgumentImpl
   * @see org.xtext.verifier.slk.sLEEK.impl.SLEEKPackageImpl#getArgument()
   * @generated
   */
  int ARGUMENT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__NAME = ARGU__NAME;

  /**
   * The number of structural features of the '<em>Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_FEATURE_COUNT = ARGU_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.verifier.slk.sLEEK.impl.PrintImpl <em>Print</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.verifier.slk.sLEEK.impl.PrintImpl
   * @see org.xtext.verifier.slk.sLEEK.impl.SLEEKPackageImpl#getPrint()
   * @generated
   */
  int PRINT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINT__NAME = ARGU__NAME;

  /**
   * The number of structural features of the '<em>Print</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINT_FEATURE_COUNT = ARGU_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.xtext.verifier.slk.sLEEK.SLEEK <em>SLEEK</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SLEEK</em>'.
   * @see org.xtext.verifier.slk.sLEEK.SLEEK
   * @generated
   */
  EClass getSLEEK();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.verifier.slk.sLEEK.SLEEK#getKeywords <em>Keywords</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Keywords</em>'.
   * @see org.xtext.verifier.slk.sLEEK.SLEEK#getKeywords()
   * @see #getSLEEK()
   * @generated
   */
  EReference getSLEEK_Keywords();

  /**
   * Returns the meta object for class '{@link org.xtext.verifier.slk.sLEEK.Argu <em>Argu</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argu</em>'.
   * @see org.xtext.verifier.slk.sLEEK.Argu
   * @generated
   */
  EClass getArgu();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.verifier.slk.sLEEK.Argu#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.verifier.slk.sLEEK.Argu#getName()
   * @see #getArgu()
   * @generated
   */
  EAttribute getArgu_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.verifier.slk.sLEEK.Data <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data</em>'.
   * @see org.xtext.verifier.slk.sLEEK.Data
   * @generated
   */
  EClass getData();

  /**
   * Returns the meta object for class '{@link org.xtext.verifier.slk.sLEEK.Lemma <em>Lemma</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lemma</em>'.
   * @see org.xtext.verifier.slk.sLEEK.Lemma
   * @generated
   */
  EClass getLemma();

  /**
   * Returns the meta object for class '{@link org.xtext.verifier.slk.sLEEK.Precodition <em>Precodition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Precodition</em>'.
   * @see org.xtext.verifier.slk.sLEEK.Precodition
   * @generated
   */
  EClass getPrecodition();

  /**
   * Returns the meta object for class '{@link org.xtext.verifier.slk.sLEEK.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument</em>'.
   * @see org.xtext.verifier.slk.sLEEK.Argument
   * @generated
   */
  EClass getArgument();

  /**
   * Returns the meta object for class '{@link org.xtext.verifier.slk.sLEEK.Print <em>Print</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Print</em>'.
   * @see org.xtext.verifier.slk.sLEEK.Print
   * @generated
   */
  EClass getPrint();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SLEEKFactory getSLEEKFactory();

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
     * The meta object literal for the '{@link org.xtext.verifier.slk.sLEEK.impl.SLEEKImpl <em>SLEEK</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.verifier.slk.sLEEK.impl.SLEEKImpl
     * @see org.xtext.verifier.slk.sLEEK.impl.SLEEKPackageImpl#getSLEEK()
     * @generated
     */
    EClass SLEEK = eINSTANCE.getSLEEK();

    /**
     * The meta object literal for the '<em><b>Keywords</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLEEK__KEYWORDS = eINSTANCE.getSLEEK_Keywords();

    /**
     * The meta object literal for the '{@link org.xtext.verifier.slk.sLEEK.impl.ArguImpl <em>Argu</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.verifier.slk.sLEEK.impl.ArguImpl
     * @see org.xtext.verifier.slk.sLEEK.impl.SLEEKPackageImpl#getArgu()
     * @generated
     */
    EClass ARGU = eINSTANCE.getArgu();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGU__NAME = eINSTANCE.getArgu_Name();

    /**
     * The meta object literal for the '{@link org.xtext.verifier.slk.sLEEK.impl.DataImpl <em>Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.verifier.slk.sLEEK.impl.DataImpl
     * @see org.xtext.verifier.slk.sLEEK.impl.SLEEKPackageImpl#getData()
     * @generated
     */
    EClass DATA = eINSTANCE.getData();

    /**
     * The meta object literal for the '{@link org.xtext.verifier.slk.sLEEK.impl.LemmaImpl <em>Lemma</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.verifier.slk.sLEEK.impl.LemmaImpl
     * @see org.xtext.verifier.slk.sLEEK.impl.SLEEKPackageImpl#getLemma()
     * @generated
     */
    EClass LEMMA = eINSTANCE.getLemma();

    /**
     * The meta object literal for the '{@link org.xtext.verifier.slk.sLEEK.impl.PrecoditionImpl <em>Precodition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.verifier.slk.sLEEK.impl.PrecoditionImpl
     * @see org.xtext.verifier.slk.sLEEK.impl.SLEEKPackageImpl#getPrecodition()
     * @generated
     */
    EClass PRECODITION = eINSTANCE.getPrecodition();

    /**
     * The meta object literal for the '{@link org.xtext.verifier.slk.sLEEK.impl.ArgumentImpl <em>Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.verifier.slk.sLEEK.impl.ArgumentImpl
     * @see org.xtext.verifier.slk.sLEEK.impl.SLEEKPackageImpl#getArgument()
     * @generated
     */
    EClass ARGUMENT = eINSTANCE.getArgument();

    /**
     * The meta object literal for the '{@link org.xtext.verifier.slk.sLEEK.impl.PrintImpl <em>Print</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.verifier.slk.sLEEK.impl.PrintImpl
     * @see org.xtext.verifier.slk.sLEEK.impl.SLEEKPackageImpl#getPrint()
     * @generated
     */
    EClass PRINT = eINSTANCE.getPrint();

  }

} //SLEEKPackage
