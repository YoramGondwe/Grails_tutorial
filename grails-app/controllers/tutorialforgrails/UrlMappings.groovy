package tutorialforgrails

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?" {
            constraints {
                // apply constraints here
            }
        }

//        "/"(view:"/index")
        "500"(view: '/error')

        "404"(view: '/notFound')

        //we changed the landing page from the original index page to our names page

        '/'(controller: 'home', action: 'index')

        //This maps the controller and action(method or function) where name saving will happen

        '/save'(controller: 'home', action: 'save')

        //this maps where our application will query the name we entered and greet us
        '/hello'(controller: 'home', action: 'greet')
    }
}
