package de.dc.spring.mm.editor.template

import de.dc.spring.mm.Entity

class EntityTemplate implements IGenerator<Entity> {
	
	override String gen(Entity input)'''
	package ;
	
	import java.time.*;
	import javax.persistence.*;
	«val baseClass = '''«IF input.superClass!==null» extends «input.superClass»«ENDIF»'''»
	@Entity
	public class «input.name.toFirstUpper»«baseClass»{
		
		«FOR field : input.fields»
		«IF field.isIsId»
		@Id
		@GeneratedValue
		«ENDIF»
		private «field.datatype» «field.name.toFirstLower»;
		«ENDFOR»
		
		@ManyToMany(cascade = CascadeType.ALL)
	    @JoinTable(name = "user_usergroup",
	        joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
	        inverseJoinColumns = @JoinColumn(name = "usergroup_id", referencedColumnName = "id"))
		private List<UserGroup> userGroups;
	
		public «input.name.toFirstUpper»() {
		}
		
		public «input.name.toFirstUpper»(String firstname, String lastname, UserGroup... userGroups) {
			this.firstname = firstname;
			this.lastname = lastname;
	        this.userGroups = Stream.of(userGroups).collect(Collectors.toList());
	        this.userGroups.forEach(x -> x.getUsers().add(this));
		}
	.....
	}
	'''
}
