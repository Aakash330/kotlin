abstract class AbstractClass {
    /*
    A class which is declared with abstract keyword is known as abstract class.
    An abstract class cannot be instantiated. Means, we cannot create object of
    abstract class. The method and properties of abstract
    class are non-abstract unless they are explicitly declared as abstract.
     */
    abstract fun  getStudentInfo()

}

class ChildForAbstract :AbstractClass()
{
    override fun getStudentInfo() {
        val name="Raju"
        val id =1223
        println("name of student $name and id $id")

    }

}