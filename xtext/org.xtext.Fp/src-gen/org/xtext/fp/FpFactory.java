/**
 * generated by Xtext 2.18.0
 */
package org.xtext.fp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.fp.FpPackage
 * @generated
 */
public interface FpFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FpFactory eINSTANCE = org.xtext.fp.impl.FpFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Domain Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domain Model</em>'.
   * @generated
   */
  DomainModel createDomainModel();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Query</em>'.
   * @generated
   */
  Query createQuery();

  /**
   * Returns a new object of class '<em>show Region</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>show Region</em>'.
   * @generated
   */
  showRegion createshowRegion();

  /**
   * Returns a new object of class '<em>findtemp Buil Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>findtemp Buil Action</em>'.
   * @generated
   */
  findtempBuilAction createfindtempBuilAction();

  /**
   * Returns a new object of class '<em>caltrees Build Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>caltrees Build Action</em>'.
   * @generated
   */
  caltreesBuildAction createcaltreesBuildAction();

  /**
   * Returns a new object of class '<em>Design Residential</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Design Residential</em>'.
   * @generated
   */
  DesignResidential createDesignResidential();

  /**
   * Returns a new object of class '<em>findtemp Demolish</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>findtemp Demolish</em>'.
   * @generated
   */
  findtempDemolish createfindtempDemolish();

  /**
   * Returns a new object of class '<em>findtemp Plant Trees</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>findtemp Plant Trees</em>'.
   * @generated
   */
  findtempPlantTrees createfindtempPlantTrees();

  /**
   * Returns a new object of class '<em>findtemp Cut Trees</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>findtemp Cut Trees</em>'.
   * @generated
   */
  findtempCutTrees createfindtempCutTrees();

  /**
   * Returns a new object of class '<em>findtemp Plant Bushes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>findtemp Plant Bushes</em>'.
   * @generated
   */
  findtempPlantBushes createfindtempPlantBushes();

  /**
   * Returns a new object of class '<em>findtemp Remove Bushes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>findtemp Remove Bushes</em>'.
   * @generated
   */
  findtempRemoveBushes createfindtempRemoveBushes();

  /**
   * Returns a new object of class '<em>findtemp Create Lake</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>findtemp Create Lake</em>'.
   * @generated
   */
  findtempCreateLake createfindtempCreateLake();

  /**
   * Returns a new object of class '<em>findtemp Remove Lake</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>findtemp Remove Lake</em>'.
   * @generated
   */
  findtempRemoveLake createfindtempRemoveLake();

  /**
   * Returns a new object of class '<em>Design Commercial</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Design Commercial</em>'.
   * @generated
   */
  DesignCommercial createDesignCommercial();

  /**
   * Returns a new object of class '<em>Design Educational</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Design Educational</em>'.
   * @generated
   */
  DesignEducational createDesignEducational();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  FpPackage getFpPackage();

} //FpFactory