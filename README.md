GUIX DSL : A DSL for building Google Web Toolkit UIs
========================================================
This is an XText2-based DSL that generates GWT UIs, based on the [Activities and Places framework](https://developers.google.com/web-toolkit/doc/latest/DevGuideMvpActivitiesAndPlaces).

This project is at the beginning stages, and really just an example of how to get started with XText2.

To try out the code generator, open test.guix in the org.guixdsl.sample.extension project to see the input model.  Run GuixGeneratorMWE.mwe2 via the GuixGeneratorMWE.mwe2.launch launcher in the org.guixdsl.sample.extension project, which will generate Java code into the src-gen folder.

org.guixdsl
---------------------------------
This is the project containing the DSL, and the generators that generate the GWT code.

* src/org/Guidsl.xtext

  XText file defining the DSL

* src/org/GenerateGuixdsl.mwe2

  MWE2 workflow that generates the metamodel classes and other language artifacts from the DSL.

* src/org/guixdsl/GuixdslRuntimeModule.java

  [Guice](http://code.google.com/p/google-guice/) module that registers classes used at runtime for Guixdsl.  This includes code generators, JVM model inferrer, validators, formatters.  This class, which may be modified, extends the generated AbstractGuixdslRuntimeModule which may not be modified.

* src/org/guixdsl/GuixdslStandaloneSetup.java

  Initialization support class for running the Guixdsl language outside of of an equinox environment.  e.g. when running the code generator via an MWE2 workflow.  This class, or more specifically it's base class GuixdslStandaloneSetupGenerator, creates the Guice injector using the Guice runtime module (GuixdslRuntimeModule).

* src/org/guixdsl/generator/GuixdslGenerator.xtend

  Generator XTend class that generates GWT code given a DSL model.  This generator delegates to the ActivityGenerator, ViewGenerator, and other XTend generator classes.

* src/org/guixdsl/jvmmodel.xtend

  Inferrer that maps DSL model to Java types, that XText in turn generates into Java code.  This is an alternate way to generate Java code rather than generating the code text directly in a generator class.  Not currently used.

org.guixdsl.sample.extension
-----------------------------------------------
Sample project based on Guixdsl.  Includes a bare-bones GUIX model and an overridden XTend template.

This project is an Eclipse plugin so that the overridden code generation templates could be triggered automatically within Eclipse whenever the model files are changed.  If you're just running code generation using an MWE2 workflow or Maven build, the project can be a plain Java project rather than an Eclipse plugin.

* src/test.guix

  Sample bare-bones GUIX model.

* src/org/guixdsl/sample/ext/generator/GeneratorExtensionRuntimeModule.java

  Guice module that extends GuixdslRuntimeModule so we can bind OverriddenActivityGenerator below in place of ActivityGenerator.

* src/org/guixdsl/sample/ext/generator/SampleStandaloneSetup.java

  Setup class that extends GuixdslStandaloneSetup to be able to supply our own GeneratorExtensionRuntimeModule above.

* src/org/guixdsl/sample/ext/generator/GuixGeneratorMWE.mwe2

  MWE2 workflow file that generates GWT code from any *.guix files in this project.

* src/org/guixdsl/sample/ext/generator/OverriddenActivityGenerator.xtend

  Overridden generator that extends ActivityGenerator.  This is just a sample of overriding an XTend template and just generates a different Javadoc for Acitivity implementation classes.

* GuixGeneratorMWE.mwe2.launch

  Eclipse launch configuration that executes GuixGeneratorMWE.mwe2 above, specifically passing arguments to load any .guix files in the project, and outputting generated code to the src-gen folder.



