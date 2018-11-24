package exerciseCollection

//q11 WAP to print the table of a given number

10.times{ it -> println"${(it +1)*2}"}

//q12 We have a sorted list of alphabets a-z, print all alphabets appearing after j
def range = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'] as List
println("alphabets appearing after j")
range.each { it -> if('j'<it) print it}

//q13 Find the number of occurences of a character in a string
String s="event"
str=s.toList()
a=str.groupBy({it->it})
a.values().each {it->println(it)}
println a.values()
println(a)

//q14
//Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print "FizzBuzz".

Range range1=1..100
range1.each {
    if (it%3==0 && it%5==0 && it%15==0)
    {
        println "fizzbuzz"
    }
    else if(it%5==0)
    {
        println "buzz"
    }
    else if(it%3==0)
    {
        println "fizz"
    }
    else {
        println it
    }
}
