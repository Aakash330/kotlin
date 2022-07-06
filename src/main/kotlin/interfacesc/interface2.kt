interface interface2 {
    /*
    Resolving different Interfaces having same method overriding conflicts
     */
    fun doSomthing(){
        println("overriding doSomthing() interface2")
    }
}
interface interface3{
    fun doSomthing()
    {
        println("overriding doSomething interface3")
    }
}
class Myclasss:interface2,interface3{
    override fun doSomthing() {
        println("myclasss ovverride call")
        //use super keywor to call interface if method conflict
        super<interface2>.doSomthing()
    }

}


