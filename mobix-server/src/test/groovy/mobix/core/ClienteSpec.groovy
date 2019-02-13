package mobix.core

import grails.testing.gorm.DomainUnitTest
import spock.lang.Shared
import spock.lang.Specification

class ClienteSpec extends Specification implements DomainUnitTest<Cliente> {

    @Shared int id

    def setup() {
    }

    def cleanup() {
    }

    void "should persist Clientes"() {
        setup:
        new Cliente(nombre: 'Papel S.A. de C.V.', rfc: 'PAP830101CR3')
                .save()
        new Cliente(nombre: 'ELOF HANSSON DE MEXICO S DE RL DE CV', rfc: 'EHM000107ER0').save()

        expect:
        Cliente.count() == 2
    }

    def "should update Cliente"() {
        setup:
        Cliente demo = new Cliente(nombre: 'Papel S.A. de C.V.', rfc: 'PAP830101CR3')
                .save()

        when: 'Updating'
        Cliente found = Cliente.where{rfc == 'PAP830101CR3'}.find()
        found.nombre = 'PAPEL S.A. DE C.V.'
        found.save()
        demo = Cliente.where{rfc == 'PAP830101CR3'}.find()
        then:
        Cliente.where{nombre == 'PAPEL S.A. DE C.V.1'}.find().nombre == 'PAPEL S.A. DE C.V.'
        println "Cliente: ${demo}"


    }

}
