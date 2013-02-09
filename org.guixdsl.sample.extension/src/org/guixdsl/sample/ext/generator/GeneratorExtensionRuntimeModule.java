package org.guixdsl.sample.ext.generator;

import org.guixdsl.GuixdslRuntimeModule;
import org.guixdsl.generator.ActivityGenerator;
import org.guixdsl.generator.GuixdslGenerator;

public class GeneratorExtensionRuntimeModule extends GuixdslRuntimeModule {
    @Override
    
    public Class<? extends ActivityGenerator> bindActivityGenerator() {
    	System.out.println("Binding my generator");
        return OverriddenActivityGenerator.class;
    }

}
