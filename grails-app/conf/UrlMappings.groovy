class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}
		"/" ( controller:'quote', action:'login' )

	//	"/"(view:"/index")
		"500"(view:'/error')
	}
}
