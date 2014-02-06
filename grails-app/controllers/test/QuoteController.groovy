package test

class QuoteController {
	
	def scaffold=true

    def index() {
		if (isLoggedIn()) {
			redirect(controller: "hom", action: "index")
			}
		
		def quote= new Quote();
	}
	def hello(){
		
	}
	def login(){
		if (isLoggedIn()) {
			redirect(controller: "hom", action: "index")
			}
		
	}
	def home(){
		
	}
}
