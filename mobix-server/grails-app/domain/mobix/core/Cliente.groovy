package mobix.core

import grails.compiler.GrailsCompileStatic
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@ToString(includes='nombre',includeNames=true,includePackage=false)
@EqualsAndHashCode(includes='nombre,rfc')
@GrailsCompileStatic
class Cliente {

	String nombre
	String rfc
	String emailCfdi

	Direccion direccion

	Date dateCreated
	Date lastUpdated

	String createUser
	String updateUser

	static embedded = ['direccion']

	static constraints = {
		direccion nullable:true
		nombre unique: true
		emailCfdi nullable: true
		rfc blank:false, minSize:12,maxSize:13
		createUser nullable: true
		updateUser nullable: true
	}

	def beforeUpdate() {
		capitalizarNombre()
	}

	def beforeInsert() {
		capitalizarNombre()
	}

	private capitalizarNombre(){
		nombre = nombre.toUpperCase()
	}
}
