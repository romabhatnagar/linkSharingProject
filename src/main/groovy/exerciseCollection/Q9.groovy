package exerciseCollection

/*
Consider the following piece of code: String s = "this string needs to be split"
println s.tokenize(" ")
println s.tokenize()
Compare this with the following code:
String s = "this string needs to be split"
println s.split(" ")
println s.split(/\s/) (Try Same Parameter with tokenize)
Also try the following exercise:
String s = "are.you.trying.to.split.me.mister?"
s.tokenize(".") s.split(".")
*/

def myString = "this string needs to be split"
println("checking tokenizer")
println myString.tokenize("")
println myString.tokenize()
println("checking split()")
println(myString.split(" "))
println(myString.split(/\s/))
String s = "are.you.trying.to.split.me.mister?"
s.tokenize(".")
s.split(".")