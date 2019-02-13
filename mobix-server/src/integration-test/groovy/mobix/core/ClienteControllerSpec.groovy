package mobix.core


import grails.testing.mixin.integration.Integration
import grails.testing.web.controllers.ControllerUnitTest
import grails.transaction.*
import spock.lang.*

@Integration
@Rollback
class ClienteControllerSpec extends Specification implements ControllerUnitTest<ClienteController> {

    def setup() {
    }

    def cleanup() {
    }

    void "should return a JSON list of clientes"() {
        when:
        controller.index()

        then:
        status == 200
        response.text == 'CLIENTES'
    }
}
