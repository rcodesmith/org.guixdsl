package org.guixdsl.sample.ext.generator;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.guixdsl.GuixdslStandaloneSetup;

/**
 * XText standalone setup class, overridden to supply our own Guice runtime module
 * @author ron
 *
 */
public class SampleStandaloneSetup extends GuixdslStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(new GeneratorExtensionRuntimeModule());
	}

}
