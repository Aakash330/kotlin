import Constructorss.Constructor2
import Constructorss.Constructors
import extensionfunction.Student
import extensionfunction.isExcellent
import extensionfunction.swap
import generics.Generics

class MyClass() {
    constructor(s: String, i: Int, s1: String) : this() {
        println("name $s")
    }

    val name = "aakash"
    val age = 22;
    val vill = "sitalpur"
    fun showtheDetail() {
        println("name :$name age :$age vill :$vill")

    }

    //  Default argument example 3: passing all argument in function call

    fun run(num: Int = 5, latter: Char = 'x') {
        print("parameter in function definition $num and $latter")
        //out is 3 and x
    }

}

//main method
fun main() {
    val myClass = MyClass()
    var myClass1 = MyClass("arun", 33, "ghabhirar")
    myClass.showtheDetail()

    myClass.run(3)

    /*this is nested class logic nested class bydefault
    static
     */
    val nestedClass: NestedClass = NestedClass()
    val inner: NestedClass.inner = NestedClass.inner()
    inner.foo()
    //nested class end here

    //inner class here

    val inner2: innerClass.inner2 = innerClass().inner2()

    inner2.detail()
    // Constructor concept

    println("primary constructor called ")
    val constructors = Constructors("Akash", "12")
    println("name of developer ${constructors.e_name} and id ${constructors.e_id}")

    println("Secondary constructor..")
    val constructors2 = Constructors("from bihar", "suraj", "111")

    println(
        "name of student : ${constructors2.name} and id " +
                "${constructors2.id} and location ${constructors2.location}"
    )

    println("Calling one secondary constructor from another secondary constructor of same class")

    val constructors3= Constructor2("raj",123)

     println("super constructor called ")
    val obj1 = child("Ashu", 101)
    val obj2 = child("Ashu", 101,"mypassword")

    //modifier concept
    println("Modifier concept ...")
    println("use of protected modifier")
    val child2=child2()
    println("value of  ${child2.getValue()} ")

    println("abstract class concept")
    val childForAbstract=ChildForAbstract()
    childForAbstract.getStudentInfo()

    println("interface concept ")
   val interfacess:interfacess=chiddInterface()
    interfacess.doSomthing()
    interfacess.absMethod()
    println("Resolving different Interfaces having same method overriding conflicts")
    val myclasss=Myclasss()
     myclasss.doSomthing()

    println("Example of extension function")
    val extension=Student()
    extension.mark()
    println("is student passed ${extension.isExcellent(30)}" )
    println("swap the list")
    val mutableList= mutableListOf(5,10,15)
    println("befpre swaping the list $mutableList")
    val list = mutableList.swap(0,2)
    println("after swapping the list $list")

    println("Generic type called")
    val generics=Generics(55)
    val generics2=Generics("arun")

}