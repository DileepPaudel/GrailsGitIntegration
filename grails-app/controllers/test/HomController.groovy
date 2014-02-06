package test
import grails.plugin.springsecurity.annotation.Secured

class HomController {
    
	@Secured(['ROLE_ADMIN'])
    def index() { }
}
