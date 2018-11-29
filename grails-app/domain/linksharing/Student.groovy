package linksharing

class Student {
    String name
    Integer rollNo
//    Integer student
//    List<Teacher> teachers


/* @Override
    String toString(){
        return "name:" +${name} + "rollNo " +${rollNo}

    }*/

    static hasMany = [teachers: Teacher]

    static constraints = {
//        name(nullable: false)
//        rollNo(size: 1..10)
    }

    static mapping = {
//        id name :studentId
//        teachers cascade: 'all'
    }
}
