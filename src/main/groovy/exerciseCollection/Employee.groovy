package exerciseCollection

//q22
class MyEmployee {
    String name
    Integer age
    String department
    Double salary

}

MyEmployee MyEmployee1=new MyEmployee(name: "Abhi",age: 21,salary: 15000, department: "IT");
MyEmployee MyEmployee2=new MyEmployee(name: "Adesh",age: 22,salary: 15000,department: "Network");
MyEmployee MyEmployee3=new MyEmployee(name: "Ashish",age: 25,salary: 8000,department: "Sales");
MyEmployee MyEmployee4=new MyEmployee(name: "Deepak",age: 27,salary: 8000,department: "IT");
MyEmployee MyEmployee5=new MyEmployee(name: "Suresh",age: 14,salary: 8000,department: "Sales");
MyEmployee MyEmployee6=new MyEmployee(name: "Ramesh",age: 15,salary: 6500,department: "Network");
MyEmployee MyEmployee7=new MyEmployee(name: "Tripti",age: 21,salary: 6500,department: "IT");
MyEmployee MyEmployee8=new MyEmployee(name: "Ganesh",age: 29,salary: 9500,department: "Sales");
MyEmployee MyEmployee9=new MyEmployee(name: "Shekhar",age: 16,salary: 9500,department: "IT");
MyEmployee MyEmployee10=new MyEmployee(name: "Vaibhav",age: 25,salary: 7700,department: "Network");

List<MyEmployee> list=[MyEmployee1, MyEmployee2, MyEmployee3, MyEmployee4, MyEmployee5, MyEmployee6, MyEmployee7, MyEmployee8, MyEmployee9, MyEmployee10]

//1 Group the MyEmployees on the basis of the bracket in which their salary falls. The ranges are 0-5000, 5001 and 10000, and so on.

list.groupBy({ employee -> employee.salary }).eachWithIndex
        { Map.Entry<Double, List<Employee>> entry -> println entry.key+"-->"+ entry.value.name}

//2 Get a count of the number of employees in each department

list.groupBy ({emp -> emp.department}).eachWithIndex{ Map.Entry<String, List<MyEmployee>> entry -> println(entry.key+"--"+entry.value.name +entry.value.size()) }

//3 Get the list of employees whose age is between 18 and 35

list.each { emp -> if(emp.age>=18 && emp.age<35) println(emp.name + emp.age)}

//4 Group the employees according to the alphabet with which their first name starts and
// display the number of employees in each group whose age is greater than 25

list.groupBy { emp -> emp.name.getAt(0)}.eachWithIndex{ Map.Entry<String, List<MyEmployee>> entry -> println(entry.value.name)}
list.each { emp -> if(emp.age>25) println(emp.name + emp.age)}


/*
a=list.sort{a1,a2->a1.name<=>a2.name} //.eachWithIndex{ Map.Entry<String, List<Employee>> entry, int i -> println entry.value.name }
println(a.name)
println()*/

//5 groupby depts

list.groupBy { emp -> emp.department}.eachWithIndex{ Map.Entry<String, List<MyEmployee>> entry, int i -> println(entry.value.name + entry.value.department) }

//q23 Write a method which retruns the value of passed key from a search string of the form "http://www.google.com?name=johny&age=20&hobby=cricket"

/*
def searchString = "http://www.google.com?name=johny&age=20&hobby=cricket"
searchString.each {item -> if(item =='?'){
    Map<String, String> entry ->
}
    print(item)}*/

def url = new URL("http://www.google.com?name=johny&age=20&hobby=cricket")
def parameters=url.query.split("&")
println(parameters)
