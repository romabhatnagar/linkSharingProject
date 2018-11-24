package exerciseGroovy

def file = new File("/home/roma/roma.jpeg").getBytes()
            .eachByte {a-> new File("/home/roma/roma bootcamp notes/notes/file3.txt").append(a)}

/*
Closure<Boolean> isTextFile = {
    File it -> it.name.endsWith('.txt')
}

isTextFile.each {a -> print(a)}*/


def adder = {a, b->  a + b }

assert adder(1, 2) == 3
assert adder('a', 'b') == 'ab'

def name= "roma"
def a =  "hello $name"
print a
print(a.class.name)
print(a.class)

def x =10
print x.class


/*
def list = [1,2,3,4,5,7,8,9] as Integer[]
def total =0
list.each {it -> total+=it }
print("average ="+total/list.size())*/
