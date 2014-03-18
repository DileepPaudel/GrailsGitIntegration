package test
import grails.plugin.springsecurity.annotation.Secured

class HomController {
    
	@Secured(['ROLE_ADMIN'])
    def index() { }
	
	def homepage(){}
	def nextpage(){
		
	}
	@Secured(['ROLE_ADMIN'])
	def success(){
		render "success";
	}
	@Secured(['ROLE_ADMIN'])
	def callback(){
		
	}
}
