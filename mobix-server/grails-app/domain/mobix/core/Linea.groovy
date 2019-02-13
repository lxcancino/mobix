package mobix.core

import grails.compiler.GrailsCompileStatic
import grails.rest.Resource
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@ToString(includeNames=true,includePackage=false)
@EqualsAndHashCode
@GrailsCompileStatic
@Resource(uri = '/mobix/api', formats = 'json')
class Linea {

    String clave
    String descripcion

    Date dateCreated
    Date lasstUodated

    String createUser
    String updateUser

    static constraints = {
        clave unique: true, maxSize: 255
    }


}
