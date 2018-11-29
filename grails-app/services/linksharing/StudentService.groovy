package linksharing

import grails.gorm.transactions.Transactional

@Transactional
class StudentService {

    def serviceMethod() {

    }

    def save(){
        def student = new Student(name: "roma",rollNo: 1,teachers:new ArrayList<>(new Teacher(name: "pulkit")))
        Student student1=student.save()
    }
}
