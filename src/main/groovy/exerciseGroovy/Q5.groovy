package exerciseGroovy

//Groovy Truth: if('test') { printlnn "test evaluated to true inside if" } try replacing test with various objects and observe its behaviour.
//"Test"
//'null'
// null
// 100
// 0
// empty list
//list with all vaues as null List list = new ArrayList()

list = new ArrayList<>()
list+="test"
list+='null'
list+=0
list+=100
list+=-1
list==null

list.each {a->if(a){
    println("value:"+a+" test evaluated to true inside if")
}
}

