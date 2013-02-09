package org.guixdsl.generator

import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.compiler.TypeReferenceSerializer
import org.guixdsl.guixdsl.DslView

class GuixNames {

	@Inject extension IQualifiedNameProvider
	@Inject extension TypeReferenceSerializer 

	def String fullyQualifiedViewImplName(DslView view) {
		view.fullyQualifiedName.toString("/") + "If";
	}

	def String fullyQualifiedActivityImplName(DslView view) {
		view.fullyQualifiedName.toString("/") + "Activity";
	}
	
}