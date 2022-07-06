package extensionfunction

class Student {

    fun mark()
    {
        val marks=100
       println("u have got mark $marks")
    }
    /*
    Suppose that we want to call a method (say isExcellent()) of Student
    class which is not defined in class. In such situation, we create a
    function (isExcellent()) outside the Student class as Student.isExcellent()
    and call it from the main() function. The declare Student.isExcellent() function is
     known as extension function, where Student class is known as receiver type.
     */
}
fun Student.isExcellent(mark: Int): Boolean{
    return mark > 90
}

//swap the list
fun MutableList<Int>.swap(index1: Int, index2: Int):MutableList<Int> {
    val tmp = this[index1] // 'this' represents to the list
    this[index1] = this[index2]
    this[index2] = tmp
    return this
}