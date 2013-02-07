
package org.guixdsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class GuixdslStandaloneSetup extends GuixdslStandaloneSetupGenerated{

	public static void doSetup() {
		new GuixdslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

