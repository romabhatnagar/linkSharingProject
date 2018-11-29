package linksharing

class RegisterController {

    UserService userService
    StudentService studentService

    static allowedMethods = [save: "POST"]
    def index() {

    }

    def register(User user){
        if(userService.saveUser(user)){
            render(view: '/register/welcome', model: [User:user])
        }
        else{
            flash.message = "sorry passwords does not match"
            render(view: '/register/index')
        }

    }
}
