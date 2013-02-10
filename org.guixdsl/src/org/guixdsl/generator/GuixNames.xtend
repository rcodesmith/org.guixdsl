package org.guixdsl.generator

import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.compiler.TypeReferenceSerializer
import org.guixdsl.guixdsl.DslView

/**
 * Extensions related to names (e.g. interface names, view class names, etc)
 */
class GuixNames {

	@Inject extension IQualifiedNameProvider
	@Inject extension TypeReferenceSerializer 

	def String fullyQualifiedViewImplName(DslView view) {
		view.fullyQualifiedName.toString("/") + "If";
	}

	def String fullyQualifiedActivityImplName(DslView view) {
		view.fullyQualifiedName.toString("/") + "Activity";
	}
	
	def String interfaceName(DslView it) {
		name + "If"
	}
	
	/**
	 * Return true is the given DslView has a declared package
	 */
	def boolean hasPackage(DslView it) {
		eContainer != null && eContainer.fullyQualifiedName != null && eContainer.fullyQualifiedName.isEmpty == false
	}
}