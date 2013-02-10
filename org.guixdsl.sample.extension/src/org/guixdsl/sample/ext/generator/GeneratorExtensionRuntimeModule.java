package org.guixdsl.sample.ext.generator;

import org.guixdsl.GuixdslRuntimeModule;
import org.guixdsl.generator.ActivityGenerator;
import org.guixdsl.generator.GuixdslGenerator;

/**
 * Runtime Guice module where we can override Generator templates and methods
 *
 */
public class GeneratorExtensionRuntimeModule extends GuixdslRuntimeModule {
    @Override
    
    /**
     * Override ActivityGenerator with our own
     */
    public Class<? extends ActivityGenerator> bindActivityGenerator() {
        return OverriddenActivityGenerator.class;
    }

}
