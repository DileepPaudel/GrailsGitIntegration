class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}
		"/" ( controller:'quote', action:'login' )

	//	"/books"(resources:"book")
	//	"/"(view:"/index")
		"500"(view:'/error')
		
		
	}
}
