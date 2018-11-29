package exerciseCollection
// q1 Initialize an empty list and give the output of the following code:
//l[11] = "myelement"
//println l[11]
//println l.get(5)
//println l
//Initialize a list using a range and find all elements which are even.

def list = new ArrayList()
println list[11] = "myElement"
println(list[11])
println list.get(5)
println list

//q2
//Create a set from a list containing duplicate elements.
//What do you observe? How can you achieve the same result without converting a list to a set?

def myList = [1,2,2,4,5,6,6] as Set
println(myList) //set never takes duplicates

//q3
//Given two lists [11, 12, 13, 14] and [13, 14, 15],
// how would we obtain the list of items from the first that are not in the second?

def list1 = [11,12,13,14]
def list2 = [13,14,15]
def list3 = list1.minus(list1.intersect(list2))
println "list of items from the first that are not in the second"+list3

//q4
//Find whether two lists have a common element or not

println("common items "+list1.intersect(list2))

//q5
//Remove all records from a list whose index is odd
List lists=[1,2,3,4,5,6,7,8]
lists.removeIf{it%2==0}
println(lists)

//q6
//Consider the following list: [1, 2, 3, "element1", 0.3, [2, 4, 6], 0..10 ]
// Print the class name of each element. What's the output of the following statement? list.get(6).get(9)

def list4 = [1,2,3,"element",0..3,[2,4,6],0..10] as List
list4.each { item -> println  "$item" +" class name is" +item.class.name }
println "list 6th element" + list4.get(6)
//println "list 9th element" + list4.get(9)
println list4.size()

//q7
//Sort the given list in descending order having distinct elements: [14,12, 11,10, 16, 15,12, 10, 99, 90, 14, 16, 35]

def list5 = [14,12, 11,10, 16, 15,12, 10, 99, 90, 14, 16, 35]
def mySet = list5 as Set // one way
println(mySet)
println mySet.sort()
def uniqueList = list5.unique() // second way
println uniqueList






















