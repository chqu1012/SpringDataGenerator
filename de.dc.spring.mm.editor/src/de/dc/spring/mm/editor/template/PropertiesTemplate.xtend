package de.dc.spring.mm.editor.template

import de.dc.spring.mm.DBSource

class PropertiesTemplate implements IGenerator<DBSource>{
	
	override gen(DBSource input)'''
	# H2 
	spring.h2.console.enabled=«input.enableConsole»
	spring.h2.console.settings.web-allow-others=«input.webAllowOothers»
	spring.h2.console.path=/h2-console
	# Datasource
	spring.datasource.url=«input.url»
	spring.datasource.username=«input.user»
	spring.datasource.password=«input.password»
	spring.datasource.driver-class-name=«input.driveClassName»
	# JPA
	spring.jpa.hibernate.ddl-auto=update
	# Logging
	logging.level.org.hibernate.SQL=debug
	
	# LOGGING
	logging.file = logs/application.log
	
	server.port=«input.serverPort»
	'''
}