/**
 * generated by Xtext 2.18.0
 */
package org.xtext;

import org.xtext.MycnlStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class MycnlStandaloneSetup extends MycnlStandaloneSetupGenerated {
  public static void doSetup() {
    new MycnlStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}