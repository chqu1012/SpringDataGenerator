package de.dc.spring.mm.editor.template

import de.dc.spring.mm.Entity
import de.dc.spring.mm.Field
import de.dc.spring.mm.PostMapping
import de.dc.spring.mm.RestController
import de.dc.spring.mm.RestMapping
import de.dc.spring.mm.SpringProject

class RestControllerTemplate implements IGenerator<RestController>{
	
	override gen(RestController input)'''
	«val root = input.eContainer as SpringProject»
	package «root.basePackage».controller;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;
	
	import «root.basePackage».model.*;
	import «root.basePackage».repository.*;
	
	@RestController
	public class «input.name»Controller {
	
		«FOR object : input.usedEntities»
		«val entity = object as Entity»
		@Autowired «entity.name»Repository «entity.name.toFirstLower»Repository;
		«ENDFOR»
		
		«FOR object : input.mappings»
		«val mapping = object as RestMapping»
		«val parametersWithTypes = '''«IF mapping instanceof PostMapping»«val postMap = mapping as PostMapping»«postMap.parameters.map[e| (e as Field).datatype+" "+(e as Field).name].reduce[p1, p2|p1+', '+p2]»«ENDIF»'''»
		«val parameters = '''«IF mapping instanceof PostMapping»«ENDIF»'''»
		@«mapping.class.simpleName»("«mapping.path»")
		public Iterable<«mapping.usedEntity.name»> «mapping.name»(«parametersWithTypes») {
			return «mapping.usedEntity.name.toFirstLower»Repository.«mapping.body»(«parameters»);
		}
		«ENDFOR»
	}
	'''
}