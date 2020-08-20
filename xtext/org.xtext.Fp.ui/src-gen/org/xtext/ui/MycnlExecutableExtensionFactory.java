/*
 * generated by Xtext 2.18.0
 */
package org.xtext.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.Fp.ui.internal.FpActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MycnlExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(FpActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		FpActivator activator = FpActivator.getInstance();
		return activator != null ? activator.getInjector(FpActivator.ORG_XTEXT_MYCNL) : null;
	}

}
