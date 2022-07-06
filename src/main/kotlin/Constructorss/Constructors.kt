package Constructorss

//this is primary constructor in kotlin when pass the argument at class
class Constructors(val name: String,val id:String) {
val e_name:String?
val e_id:String?
var location:String? = null
    /*
    In Kotlin, constructor is a block of code similar to method.
    Constructor is declared with the same name as the class followed by parenthesis '()'.
    Constructor is used to initialize the variables at the time of object creation.

    //Type of Constructor in kotlin
    1.Primary constructor
    2.Secondary constructor
     */

    //init
//this block will run as object create if object create three time then
    //int block will run three time
    init {
        println("init block run")
        e_name = name.uppercase()
        e_id=id


    }

    //secondary constructor
    constructor(location:String, name: String,id: String) : this(name, id){
     this.location=location



    }
}