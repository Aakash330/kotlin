package Constructorss

class Constructor2 {

    /*
    Calling one secondary constructor from another secondary constructor of same class

     */



    constructor(name2: String, id2: Int,pass2: String){
        println("this executes first")
        println("Name = ${name2}")
        println("Id = ${id2}")
        println("Password = ${pass2}")
    }
    constructor(name: String, id: Int): this(name,id, "mypassword"){
        println("this executes next")
        println("Name = ${name}")
        println("Id = ${id}")
    }

}