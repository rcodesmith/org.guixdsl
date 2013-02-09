package org.guixdsl.sample.ext.generator;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.guixdsl.GuixdslStandaloneSetup;

public class UserAppStandaloneSetup extends GuixdslStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(new GeneratorExtensionRuntimeModule());
	}

}
