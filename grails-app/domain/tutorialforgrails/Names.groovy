package tutorialforgrails

class Names {
    /* Here you define the column names for your table in the Database*/
    String firstName
    String lastName

    static constraints = {
        /* This where you add constrains to your table columns
        such as UNIQUE PASSWORD BLANK NULLABLE etc
        * */
        firstName nullable: true, blank: true
        lastName nullable: true, blank: true
    }
}
