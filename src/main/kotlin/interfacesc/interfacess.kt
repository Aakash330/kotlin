interface interfacess {
    /*
 An interface is a blueprint of class.Kotlin interface is similar to Java 8.
 It contains abstract method declarations as well as implementation of method.
 */
    val id: Int // abstract property
    fun absMethod()// abstract method
    fun doSomthing() {
        println("method called inside the interface")
        // optional body
    }

}


class chiddInterface :interfacess{
    override val id: Int=10


    override fun absMethod() {
        println("method abs called and variable acess $id")

    }



}