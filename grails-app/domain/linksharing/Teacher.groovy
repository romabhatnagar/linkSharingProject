package linksharing

class Teacher {
    String name

    static belongsTo = [Student]
    static hasMany = [students:Student]

    static constraints = {
//        name(nullable: false)
    }
}
