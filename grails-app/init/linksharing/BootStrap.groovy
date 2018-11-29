package linksharing

class BootStrap {

    def init = { servletContext ->
        User user =new User(firstName: "roma", lastName: "bhatnagar", email: "romabhatnagar@tothenew.com",password: "iamamazing")
        user.save(flush: true, failOnError: true)
    }


    def destroy = {
    }
}
