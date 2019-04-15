package tutorialforgrails

class HomeController {
/*This function renders the page where we are going to enter our Names */
    def index() {

        render(view: '/name')
    }

/* This function receives data from the form in the view and saves the data in the database*/
    def save() {
        String firstName = params?.firstName
        String lastName = params?.lastName

        new Names(
                firstName: firstName,
                lastName: lastName
        ).save(flush: true, failOnError: true)
        /* redirects control to the next function*/
        redirect(action: 'greet')
    }

/*This function queries the last entry in the database  and sends that data to the view */
    def greet() {
        def name = Names.last()
        /*The keyword model is what we use to send data to the view */
        render(view: '/hello', model: [name: name])
    }
}
