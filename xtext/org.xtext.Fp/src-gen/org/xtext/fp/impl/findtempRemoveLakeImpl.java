/**
 * generated by Xtext 2.18.0
 */
package org.xtext.fp.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.fp.FpPackage;
import org.xtext.fp.findtempRemoveLake;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>findtemp Remove Lake</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.fp.impl.findtempRemoveLakeImpl#getArea <em>Area</em>}</li>
 * </ul>
 *
 * @generated
 */
public class findtempRemoveLakeImpl extends QueryImpl implements findtempRemoveLake
{
  /**
   * The default value of the '{@link #getArea() <em>Area</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArea()
   * @generated
   * @ordered
   */
  protected static final int AREA_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getArea() <em>Area</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArea()
   * @generated
   * @ordered
   */
  protected int area = AREA_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected findtempRemoveLakeImpl()
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
    return FpPackage.Literals.FINDTEMP_REMOVE_LAKE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getArea()
  {
    return area;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setArea(int newArea)
  {
    int oldArea = area;
    area = newArea;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FpPackage.FINDTEMP_REMOVE_LAKE__AREA, oldArea, area));
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
      case FpPackage.FINDTEMP_REMOVE_LAKE__AREA:
        return getArea();
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
      case FpPackage.FINDTEMP_REMOVE_LAKE__AREA:
        setArea((Integer)newValue);
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
      case FpPackage.FINDTEMP_REMOVE_LAKE__AREA:
        setArea(AREA_EDEFAULT);
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
      case FpPackage.FINDTEMP_REMOVE_LAKE__AREA:
        return area != AREA_EDEFAULT;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (area: ");
    result.append(area);
    result.append(')');
    return result.toString();
  }

} //findtempRemoveLakeImpl
