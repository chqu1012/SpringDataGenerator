package de.dc.spring.mm.editor.template

import de.dc.spring.mm.Entity
import de.dc.spring.mm.Field
import de.dc.spring.mm.ManyToMany
import de.dc.spring.mm.ManyToOne
import de.dc.spring.mm.Mapping
import de.dc.spring.mm.OneToMany
import de.dc.spring.mm.OneToOne
import de.dc.spring.mm.SpringProject

class EntityTemplate implements IGenerator<Entity> {
	 
	override String gen(Entity input)'''
	«val root = input.eContainer as SpringProject»
	package «root.basePackage».model;
	
	import java.time.*;
	import javax.persistence.*;
	«val baseClass = '''«IF input.superClass!==null» extends «input.superClass»«ENDIF»'''»
	@Entity
	public class «input.name.toFirstUpper»«baseClass»{
		
		«FOR object : input.fields»
		«val field = object as Field»
		«IF field.isIsId»
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		«ENDIF»
		private «field.datatype» «field.name.toFirstLower»;
		«ENDFOR»
		
		«FOR object : input.mapping»
		«val mapping = object as Mapping»
		«mapping.getMappingContent(mapping.mappingType)»
		«ENDFOR»
		
		public «input.name.toFirstUpper»() {
		}
		
		«FOR object : input.fields»
		«val field = object as Field»
		public «field.datatype» get«field.name.toFirstUpper»(){
			return this.«field.name.toFirstLower»;
		}
		
		public void set«field.name.toFirstUpper»(«field.datatype» «field.name.toFirstLower»){
			this.«field.name.toFirstLower»=«field.name.toFirstLower»;
		}
		«ENDFOR»
		
		@Override
		public String toString() {
		    StringBuilder sb = new StringBuilder("«input.name.toFirstUpper»(");
			«FOR object : input.fields»
			«val field = object as Field»
			sb.append("«field.name»: ").append(String.valueOf(this.«field.name.toFirstLower»)).append(",\t");
			«ENDFOR»
			sb.append(")");
		    return sb.toString();
		}
	}
	'''
	
	dispatch def String getMappingContent(Mapping mapping, OneToOne relation)'''
	«val entity = mapping.eContainer as Entity»
	«val mappedEntity = relation.mappedBy»
	«IF mappedEntity === null»
	@OneToOne(mappedBy = "«entity.name.toFirstLower»", fetch = FetchType.LAZY, cascade = CascadeType.«relation.cascade.literal»)
	private «mappedEntity.name» «mappedEntity.name.toFirstLower»;
	«ELSE»
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "«mappedEntity.name.toFirstLower»_id", nullable = false)
	private «mappedEntity.name» «mappedEntity.name.toFirstLower»;
	«ENDIF»
	'''

	dispatch def String getMappingContent(Mapping mapping, OneToMany relation)'''
	«val entity = mapping.eContainer as Entity»
	«val mappedEntity = relation.mappedBy.name»
	@OneToMany(mappedBy = "«entity.name.toFirstLower»", fetch = FetchType.LAZY, cascade = CascadeType.«relation.cascade.literal»)
	private List<«mappedEntity»> «mappedEntity.toFirstLower»s;
	'''

	dispatch def String getMappingContent(Mapping mapping, ManyToOne relation)'''
	«val mappedEntity = relation.mappedBy.name»
	«val name = mappedEntity.toFirstLower»
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "«name»_id", nullable = false)
	private «mappedEntity» «name»;
	'''

	dispatch def String getMappingContent(Mapping mapping, ManyToMany relation)'''
	«val mappedEntity = relation.mappedBy.name»
	«val entity = mapping.eContainer as Entity»
	«IF mappedEntity === null»
		@ManyToMany(cascade = CascadeType.«relation.cascade.literal»)
		@JoinTable(name = "«relation.joinTableName»",
				    joinColumns = @JoinColumn(name = "«relation.joinColumns»", referencedColumnName = "id"),
				    inverseJoinColumns = @JoinColumn(name = "«relation.inverseJoinColumns»", referencedColumnName = "id"))
		«IF mapping.isIsList»
		private List<«mappedEntity»> «mappedEntity.toFirstLower»s;
		«ELSE»
		private «mappedEntity» «mappedEntity.toFirstLower»;
		«ENDIF»
	«ELSE»
		@ManyToMany(mappedBy = "«entity.name.toFirstLower»s", fetch = FetchType.LAZY)
		private List<«mappedEntity»> «mappedEntity.toFirstLower»s = new HashSet<>();
	«ENDIF»
	'''
}
