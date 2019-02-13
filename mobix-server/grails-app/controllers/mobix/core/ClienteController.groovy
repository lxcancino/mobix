package mobix.core


import grails.rest.*

class ClienteController extends RestfulController {

    static responseFormats = ['json']

    ClienteController() {
        super(Cliente)
    }


}
