package de.dc.spring.mm.editor.template

import de.dc.spring.mm.Entity
import de.dc.spring.mm.SpringProject

class RepositoryTemplate implements IGenerator<Entity>{
	
	override gen(Entity input)'''
	«val root = input.eContainer as SpringProject»
	package «root.basePackage».repository;
	
	import org.springframework.data.jpa.repository.JpaRepository;
	
	import «root.basePackage».model.*;
	
	public interface «input.name»Repository extends JpaRepository<«input.name», Long> {
	}
	'''
}