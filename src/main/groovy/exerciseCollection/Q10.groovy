package exerciseCollection

//Get first, second and last element of Range.

Range range=1..10
println "First element ="+range.from
println "Second element ="+range[1]
println "Last element ="+range.to

range.each {
    print"each"+ it
}

range.every {
    print"every" +it
}

range.collect {
    print "collect"+ it
}