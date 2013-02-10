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


    def generateViewImpl(DslView it) '''

		«IF hasPackage»
			package «eContainer.fullyQualifiedName»;
        «ENDIF»

		public class «name» {

		}
    '''
        
	def generateViewIf(DslView it) '''
		«IF hasPackage»
			package «eContainer.fullyQualifiedName»;
		«ENDIF»

		interface «interfaceName» {
		
		}
	'''

}