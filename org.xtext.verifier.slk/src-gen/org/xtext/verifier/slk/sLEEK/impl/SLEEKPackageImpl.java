/**
 */
package org.xtext.verifier.slk.sLEEK.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.verifier.slk.sLEEK.Argu;
import org.xtext.verifier.slk.sLEEK.Argument;
import org.xtext.verifier.slk.sLEEK.Data;
import org.xtext.verifier.slk.sLEEK.Lemma;
import org.xtext.verifier.slk.sLEEK.Precodition;
import org.xtext.verifier.slk.sLEEK.Print;
import org.xtext.verifier.slk.sLEEK.SLEEKFactory;
import org.xtext.verifier.slk.sLEEK.SLEEKPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SLEEKPackageImpl extends EPackageImpl implements SLEEKPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sleekEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arguEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lemmaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass precoditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass printEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.verifier.slk.sLEEK.SLEEKPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SLEEKPackageImpl()
  {
    super(eNS_URI, SLEEKFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SLEEKPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SLEEKPackage init()
  {
    if (isInited) return (SLEEKPackage)EPackage.Registry.INSTANCE.getEPackage(SLEEKPackage.eNS_URI);

    // Obtain or create and register package
    SLEEKPackageImpl theSLEEKPackage = (SLEEKPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SLEEKPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SLEEKPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSLEEKPackage.createPackageContents();

    // Initialize created meta-data
    theSLEEKPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSLEEKPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SLEEKPackage.eNS_URI, theSLEEKPackage);
    return theSLEEKPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSLEEK()
  {
    return sleekEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSLEEK_Keywords()
  {
    return (EReference)sleekEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArgu()
  {
    return arguEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArgu_Name()
  {
    return (EAttribute)arguEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getData()
  {
    return dataEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLemma()
  {
    return lemmaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrecodition()
  {
    return precoditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArgument()
  {
    return argumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrint()
  {
    return printEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SLEEKFactory getSLEEKFactory()
  {
    return (SLEEKFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    sleekEClass = createEClass(SLEEK);
    createEReference(sleekEClass, SLEEK__KEYWORDS);

    arguEClass = createEClass(ARGU);
    createEAttribute(arguEClass, ARGU__NAME);

    dataEClass = createEClass(DATA);

    lemmaEClass = createEClass(LEMMA);

    precoditionEClass = createEClass(PRECODITION);

    argumentEClass = createEClass(ARGUMENT);

    printEClass = createEClass(PRINT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    dataEClass.getESuperTypes().add(this.getArgu());
    lemmaEClass.getESuperTypes().add(this.getArgu());
    precoditionEClass.getESuperTypes().add(this.getArgu());
    argumentEClass.getESuperTypes().add(this.getArgu());
    printEClass.getESuperTypes().add(this.getArgu());

    // Initialize classes and features; add operations and parameters
    initEClass(sleekEClass, org.xtext.verifier.slk.sLEEK.SLEEK.class, "SLEEK", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSLEEK_Keywords(), this.getArgu(), null, "keywords", null, 0, -1, org.xtext.verifier.slk.sLEEK.SLEEK.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arguEClass, Argu.class, "Argu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArgu_Name(), ecorePackage.getEString(), "name", null, 0, 1, Argu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lemmaEClass, Lemma.class, "Lemma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(precoditionEClass, Precodition.class, "Precodition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(printEClass, Print.class, "Print", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //SLEEKPackageImpl
