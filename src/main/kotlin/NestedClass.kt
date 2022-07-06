class NestedClass {
private var name:String="Ashu kumae"
    /*nested class by default it is static
    but there is disadvantage of nested class is that
    it can't access the variable of outer class ..
     */

    class inner()
    {
        var dsecription:String="he is good student"
        var id:Int=223
        fun foo()
        {

            println("description  of student : $dsecription and id : $id")
        }

    }
}