/**
 * generated by Xtext 2.18.0
 */
package org.xtext.fp.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.fp.*;

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
 * @see org.xtext.fp.FpPackage
 * @generated
 */
public class FpSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FpPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FpSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = FpPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
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
      case FpPackage.DOMAIN_MODEL:
      {
        DomainModel domainModel = (DomainModel)theEObject;
        T result = caseDomainModel(domainModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FpPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FpPackage.QUERY:
      {
        Query query = (Query)theEObject;
        T result = caseQuery(query);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FpPackage.SHOW_REGION:
      {
        showRegion showRegion = (showRegion)theEObject;
        T result = caseshowRegion(showRegion);
        if (result == null) result = caseQuery(showRegion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FpPackage.FINDTEMP_BUIL_ACTION:
      {
        findtempBuilAction findtempBuilAction = (findtempBuilAction)theEObject;
        T result = casefindtempBuilAction(findtempBuilAction);
        if (result == null) result = caseQuery(findtempBuilAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FpPackage.CALTREES_BUILD_ACTION:
      {
        caltreesBuildAction caltreesBuildAction = (caltreesBuildAction)theEObject;
        T result = casecaltreesBuildAction(caltreesBuildAction);
        if (result == null) result = caseQuery(caltreesBuildAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FpPackage.DESIGN_RESIDENTIAL:
      {
        DesignResidential designResidential = (DesignResidential)theEObject;
        T result = caseDesignResidential(designResidential);
        if (result == null) result = caseQuery(designResidential);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FpPackage.FINDTEMP_DEMOLISH:
      {
        findtempDemolish findtempDemolish = (findtempDemolish)theEObject;
        T result = casefindtempDemolish(findtempDemolish);
        if (result == null) result = caseQuery(findtempDemolish);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FpPackage.FINDTEMP_PLANT_TREES:
      {
        findtempPlantTrees findtempPlantTrees = (findtempPlantTrees)theEObject;
        T result = casefindtempPlantTrees(findtempPlantTrees);
        if (result == null) result = caseQuery(findtempPlantTrees);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FpPackage.FINDTEMP_CUT_TREES:
      {
        findtempCutTrees findtempCutTrees = (findtempCutTrees)theEObject;
        T result = casefindtempCutTrees(findtempCutTrees);
        if (result == null) result = caseQuery(findtempCutTrees);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FpPackage.FINDTEMP_PLANT_BUSHES:
      {
        findtempPlantBushes findtempPlantBushes = (findtempPlantBushes)theEObject;
        T result = casefindtempPlantBushes(findtempPlantBushes);
        if (result == null) result = caseQuery(findtempPlantBushes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FpPackage.FINDTEMP_REMOVE_BUSHES:
      {
        findtempRemoveBushes findtempRemoveBushes = (findtempRemoveBushes)theEObject;
        T result = casefindtempRemoveBushes(findtempRemoveBushes);
        if (result == null) result = caseQuery(findtempRemoveBushes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FpPackage.FINDTEMP_CREATE_LAKE:
      {
        findtempCreateLake findtempCreateLake = (findtempCreateLake)theEObject;
        T result = casefindtempCreateLake(findtempCreateLake);
        if (result == null) result = caseQuery(findtempCreateLake);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FpPackage.FINDTEMP_REMOVE_LAKE:
      {
        findtempRemoveLake findtempRemoveLake = (findtempRemoveLake)theEObject;
        T result = casefindtempRemoveLake(findtempRemoveLake);
        if (result == null) result = caseQuery(findtempRemoveLake);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FpPackage.DESIGN_COMMERCIAL:
      {
        DesignCommercial designCommercial = (DesignCommercial)theEObject;
        T result = caseDesignCommercial(designCommercial);
        if (result == null) result = caseQuery(designCommercial);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FpPackage.DESIGN_EDUCATIONAL:
      {
        DesignEducational designEducational = (DesignEducational)theEObject;
        T result = caseDesignEducational(designEducational);
        if (result == null) result = caseQuery(designEducational);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainModel(DomainModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuery(Query object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>show Region</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>show Region</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseshowRegion(showRegion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>findtemp Buil Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>findtemp Buil Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefindtempBuilAction(findtempBuilAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>caltrees Build Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>caltrees Build Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecaltreesBuildAction(caltreesBuildAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Design Residential</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Design Residential</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDesignResidential(DesignResidential object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>findtemp Demolish</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>findtemp Demolish</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefindtempDemolish(findtempDemolish object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>findtemp Plant Trees</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>findtemp Plant Trees</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefindtempPlantTrees(findtempPlantTrees object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>findtemp Cut Trees</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>findtemp Cut Trees</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefindtempCutTrees(findtempCutTrees object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>findtemp Plant Bushes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>findtemp Plant Bushes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefindtempPlantBushes(findtempPlantBushes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>findtemp Remove Bushes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>findtemp Remove Bushes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefindtempRemoveBushes(findtempRemoveBushes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>findtemp Create Lake</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>findtemp Create Lake</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefindtempCreateLake(findtempCreateLake object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>findtemp Remove Lake</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>findtemp Remove Lake</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefindtempRemoveLake(findtempRemoveLake object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Design Commercial</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Design Commercial</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDesignCommercial(DesignCommercial object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Design Educational</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Design Educational</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDesignEducational(DesignEducational object)
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

} //FpSwitch
