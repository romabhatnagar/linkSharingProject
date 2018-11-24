package exerciseGroovy

class Person {
    String name
    String gender
    Integer age
    String address

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    String getGender() {
        return gender
    }

    void setGender(String gender) {
        this.gender = gender
    }

    Integer getAge() {
        return age
    }

    void setAge(Integer age) {
        this.age = age
    }

    String getAddress() {
        return address
    }

    void setAddress(String address) {
        this.address = address
    }
}

def person = new Person(name:"roma",gender:"f",age:22,address:"kb")
print person.name
print person.@age

//q2
class Person1 extends exerciseGroovy.Person{
    Integer employeeID
    String company
    Float salary
}

def person1 = new Person1(employeeID: 30304,company: "TTN", salary: 15000)
println person1.company
println person1.employeeID
println person1.salary
println person1.@company
println person1.@employeeID
println person1.@salary

person2 = new Person1(name: "sachin",age: 24,address:"delhi", salary: 1000000)
println("${person2.name} is a man aged ${person2.age} who lives at ${person2.address} for TTN and gets ${person2.salary}")