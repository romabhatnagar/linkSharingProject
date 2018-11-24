package exerciseCollection

//q15
//"Stack" that holds a list of objects and has the following operations associated:
//POP - Pops the last element off the stack
//PUSH - Pushes an element on top of the stack
//TOP - Returns the element at the top of the list Implement the aforesaid class

List list=[1,2,3,4,5,6,7,8,9,10];
list.push(99)
println(list)
list.pop()
println(list)
println "head is "+ list.head()
list.first()
println(list)

//q16
//Create a new map consisting of 10 of your friend's name's as keys and their ages as value.

def map= new LinkedHashMap()
map.put("Abhi",21)
map.put("Rahjesh",24)
map.put("Nitin",26)
map.put("Anuj",23)
map.put("Tarun",22)
map.put("Lokesh",21)
map.put("Ramesh",28)
map.put("Talib",25)
map.put("Suresh",25)
println(map)


//q17
Map map1=['a':1,'b':2,'c':3,'d':4,'e':5]
Map map2=['f':6,'g':7,'h':8,'i':9,'j':10]
Map map3=map1 + map2
println(map3)


//q18
println map.class  // In case of giving only .class it treat it as a key of the map so it returns the corresponding value

println map.getClass()  // // In case of giving .getClass() it will return the corresponding class name

// Q19
//  Consider the following map: Map m = ['1' : 2, '2' : 3, '3' : 4, '2':5]
//  Is this a valid construction? What is the value of m['2']?

Map m = ['1' : 2, '2' : 3, '3' : 4, '2':5]

/// Yes it is a valid construction as

println m['2']

// q20  Find if a map contains a particular key.

Map map4=['a':1,'b':2,'c':3,'d':4,'e':5]

println map4.containsKey('c')
println map4.containsKey('d')

println map4.containsValue(3)
println map4.containsValue(6)

//q21
//Consider the following map: Map m = [‘Computing’ : [‘Computing’ : 600, ‘Information Systems’ : 300], ‘Engineering’ : [‘Civil’ : 200, ‘Mechanical’ : 100], ‘Management’ : [‘Management’ : 800] ]
//How many university departments are there?
//How many programs are delivered by the Computing department?
//How many students are enrolled in the Civil Engineering program?


Map myMap = ['Computing': ['Computing' : 600, 'Information Systems' : 300], 'Engineering' : ['Civil' : 200, 'Mechanical' : 100], 'Management' : ['Management' : 800] ]
println("total depts present "+myMap.size())
println("by computing depts "+myMap.Computing.size())
print("students enrolled in civil engg program"+ myMap.Engineering.Civil)


//q22









