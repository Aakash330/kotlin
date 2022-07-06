open class SuperConstructor {

//if want to ovverride the field then u have to open class
    constructor(name: String, id: Int) {
        println("this executes first") //1
        println("Name = ${name}")
        println("Id = ${id}")
    }

    constructor(name: String, id: Int, pass: String) {
        println("this executes third")//3
        println("Name = ${name}")
        println("Id = ${id}")
        println("Password = ${pass}")
    }
}


class child : SuperConstructor {

    constructor(name: String, id: Int) : super(name, id) {
        println("this executes second")//2
        println("Name = ${name}")
        println("Id = ${id}")
    }

    constructor(name: String, id: Int, pass: String) : super(name, id, "password") {
        println("this executes forth")//4
        println("Name = ${name}")
        println("Id = ${id}")
        println("Password = ${pass}")
    }


}