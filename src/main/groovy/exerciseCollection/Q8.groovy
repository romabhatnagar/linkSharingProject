package exerciseCollection

//q8
//Consider a class Employee with following details * Name * Age * Salary Create a list consisting of 10 Employee objects.
//Get a list of employees who earn less than 5000
//Get the name of the youngest employee and oldest employee
//Get the employee with maximum salary
//Get the list of names of all the employees

class Emp {
    String name
    Integer age
    Double salary

}

Emp employee1=new Emp(name: "Abhi",age: 21,salary: 15000);
Emp employee2=new Emp(name: "Adesh",age: 22,salary: 1500);
Emp employee3=new Emp(name: "Ashish",age: 25,salary: 1000);
Emp employee4=new Emp(name: "Deepak",age: 27,salary: 8000);
Emp employee5=new Emp(name: "Suresh",age: 24,salary: 3000);
Emp employee6=new Emp(name: "Ramesh",age: 28,salary: 650);
Emp employee7=new Emp(name: "Tripti",age: 21,salary: 550);
Emp employee8=new Emp(name: "Ganesh",age: 29,salary: 9500);
Emp employee9=new Emp(name: "Shekhar",age: 22,salary: 2500);
Emp employee10=new Emp(name: "Vaibhav",age: 25,salary: 7700);

def employeeList = [employee1,employee2,employee3,employee4,employee5,employee6,employee7,employee8,employee9,employee10]

def employeeLessThan5000 = employeeList.each {item -> item.salary>5000}
println("salary less than 5000")
employeeLessThan5000.each {emp -> println emp.age +emp.name+emp.salary}
/*println("youngest employees")
def youngestEmployee = employeeList.each {item -> item.age}
println("oldest employees")
def oldestEmployee = employeeList.each {item -> item.age}
println("employee with maximum salary")
def maxSalaryEmployee = employeeList.each {}*/
