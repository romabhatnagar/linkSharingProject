package linksharing

import org.springframework.web.servlet.mvc.LastModified

class User {
    String firstName
    String lastName
    String email
    String password
    Boolean isActive
    Boolean isAdmin
    Date dateCreated
    Date lastModified

//    static  hasMany = ['topic':Topic]

    static constraints = {
        email(unique: true)
        password(minSize: 4, maxSize: 8)
        firstName(null:false, minSize: 2, maxSize:  10)
        lastName(null:false, minSize: 1, maxSize: 10 )
        isActive(null:false, default:true)
        dateCreated(default: new Date())
        lastModified(default: new Date())
        isAdmin(default:false)
    }
}
