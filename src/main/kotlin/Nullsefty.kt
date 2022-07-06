//null safety concept in kotlin
class Nullsefty {

    fun nullSafeFunction() {
        var type: String?
        type = null


        if (type != null)
            println("Lenth of string ${type.length}")
        else
            println("String is null")

        type = "durgaa"
        var length = if (type != null) "$type" else "String is null "
        println("String size = ${length.length} name of String $length")


    }

    fun isString(data: Any): Boolean {
        return data is String
    }
// unSafe call
/*
note :- Sometime it is not possible to cast variable and it throws an exception,
  this is called as unsafe cast. The unsafe cast is performed by the infix operator as.
  for example this is  throwing exception ..
 # val obj: Any? = null
  val str: String = obj as String
  println(str)

*/

    fun unSafeCast(name: String) {
        val obj: String? = "String unsafe cast"
        val str: String? = obj as String? // Works
        println(str)


    }


    /*
      Kotlin provides a safe cast operator as? for safely cast to a type.
      It returns a null if casting is not
      possible rather than throwing an ClassCastException exception.

     */

    fun safeCast(data: Any) {
        val location: Any = data
        val safeString: String? = location as? String
        val safeInt: Int? = location as? Int
        println(safeString)
        println(safeInt)
    }

    /*
    Elvis operator (?:) is used to return the not null value even the conditional
    expression is null. It is also used to check the null safety of values.
     */

    fun elvisOperator()
    {
        println("elvisOperator function called ")
        var str: String? = null
        var str2: String? = "May be declare nullable string"
        var len1:  Int = str ?.length ?: -1
        var len2:  Int = str2 ?.length ?:  -1

        println("Length of str is ${len1}") //-1
        println("Length of str2 is ${len2}") //size of length
    }

}//class closed
//mutabele means-> it can be changeable
//immutable means ->it can't be changeable




fun main() {
    val nullsefty = Nullsefty()
    nullsefty.nullSafeFunction();

    println("value is String ${nullsefty.isString("Aakash")}")
    println("value is String ${nullsefty.isString(4)}")

    nullsefty.unSafeCast("Aakash")
    nullsefty.safeCast("String")
     nullsefty.elvisOperator();


}