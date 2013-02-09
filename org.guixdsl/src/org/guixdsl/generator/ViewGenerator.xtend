package org.guixdsl.generator

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator
import org.eclipse.xtext.xbase.compiler.TypeReferenceSerializer
import org.guixdsl.guixdsl.DslView

/**
 * Generator and template methods for view interface and implementation classes
 */
class ViewGenerator {
	
   @Inject extension IQualifiedNameProvider
   @Inject extension GuixNames
   @Inject extension ActivityGenerator

    def generateViewImpl(DslView it) '''

		«IF eContainer != null»
			package «eContainer.fullyQualifiedName»;
        «ENDIF»

		public class <AB>name<BB> {

		}
    '''
        
	def generateViewIf(DslView it) '''
		«IF eContainer != null»
			package «eContainer.fullyQualifiedName»;
		«ENDIF»

		interface «name» {
		
		}
	'''

}