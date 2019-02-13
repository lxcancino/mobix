package mobix.core

import grails.validation.Validateable
import grails.web.databinding.WebDataBinding

import groovy.transform.ToString

@ToString(includeNames=true,includePackage=false)
class Direccion implements Validateable, WebDataBinding{

    String calle

    String numeroInterior

    String numeroExterior

    String colonia

    String municipio

    String codigoPostal

    String estado

    String pais='MEXICO'

    BigDecimal latitud

    BigDecimal longitud


    static constraints = {
        calle nullable:true
        numeroInterior nullable: true, size:1..50
        numeroExterior nullable: true, size:1..50
        colonia nullable:true
        municipio nullable:true
        codigoPostal nullable:true
        estado nullable:true
        pais nullable:true,size:1..100
        latitud nullable: true
        longitud nullable: true
    }

    String toLabel(){
        return "Calle:${calle?:''} Ext#:${numeroExterior?:''} ${numeroInterior? 'Int#:' +numeroInterior :''} Col:${colonia?: ''} CP:${codigoPostal?:''} Del/Mun:${municipio?:''} ${estado?:''} ${pais?:''}"
    }


}
