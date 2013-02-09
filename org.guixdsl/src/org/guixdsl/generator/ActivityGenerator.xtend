package org.guixdsl.generator

import com.google.inject.Inject
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.compiler.TypeReferenceSerializer
import org.guixdsl.guixdsl.DslView

/**
 * Generator and template methods for activity interface and implementation classes
 */
class ActivityGenerator {
	
	@Inject extension IQualifiedNameProvider
	@Inject extension TypeReferenceSerializer 
	@Inject extension GuixNames

	/**
	 * Generate activity implementation class
	 */
	def generateActivityImpl(IFileSystemAccess fsa, DslView it) {
		fsa.generateFile(
				fullyQualifiedActivityImplName + ".java",
				activityImpl)
	}
	
	/**
	 * Template for activity implementation class
	 */
	def CharSequence activityImpl(DslView it) '''
	
		«IF eContainer != null»
			package «eContainer.fullyQualifiedName»;
		«ENDIF»

		/**
		 * «activityImplDoc»
		 */
		public class «name»Activity {
			
			
		}
	'''
	
	
	def CharSequence activityImplDoc(DslView it) '''
		Activity implementation for «name» view
	'''
	
}