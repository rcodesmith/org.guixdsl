
package org.guixdsl.sample.ext.generator

import org.guixdsl.generator.ActivityGenerator
import org.guixdsl.guixdsl.DslView
import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator
import org.eclipse.xtext.xbase.compiler.TypeReferenceSerializer

class OverriddenActivityGenerator extends ActivityGenerator {
	@Inject extension IQualifiedNameProvider
	@Inject extension TypeReferenceSerializer 
	
	override CharSequence activityImplDoc(DslView it) '''
		Overridden: Activity implementation for «name» view.
	'''
	
}