//fundamental of kotlin
fun main() {

    val name = "goog morinig noida"

    val str1="Hello"
    val str2="hello"
    //== operator in kotlin is case-sensitive comparison
    println(str1==str2)

    println(str1.equals(str2,true));

    //this val variable can't be changable but we can cancatenation eith this variable
    println(name + 145 + "  welcome to tuesday")

    //var data type u can modified it

    var changeable = "mohan"
    println(changeable)
    /*note-var variable type decide when u have assign the value first
    * like in this case changeble variable type is String then u can only assign the value type String
    * if want to assign the different type then you have to type casting as below code show*/
    changeable = 444.99.toString()

    println("changeable variable as String $changeable")

    var changeable2 = 890.99
    println("changeable value as Float  $changeable2")
    //how to assign the value null and assign value later we have to use ?
    var greeting: String? = null
    println(greeting)

    //assign the value in greeting variable
    greeting = 33.toString()
    println("greeting value changed $greeting")

    //Datatype in kotlin
    val myNum = 5             // Int
    val myDoubleNum = 5.99    // Double
    val myLetter = 'D'        // Char
    val myBoolean = true      // Boolean
    val myText = "Hello"      // String

    println("int type : $myNum")
    println("Double type : $myDoubleNum")
    println("my Letter : $myLetter")
    println("My boolean : $myBoolean")
    println("myText String :$myText")


    //specify the data type menually
    val myInt: Int = 12
    val myDouble: Double = 33.90
    val myCharcter: Char = 'A'
    val myBoolean2: Boolean = true
    val myString2: String = "Aakash"
    val myFloat2: Float = 33.3F
    val myByte: Byte = 45
    val myShort: Short = 333
    val myLong: Long = 200000000

    println("Implicit Data type ..\n\n")
    println("int type : $myInt")
    println("Double type : $myDouble")
    println("my Letter : $myCharcter")
    println("My boolean : $myBoolean2")
    println("myText String :$myString2")
    //The Byte data type can store whole numbers from -128 to 127.
    println("myByte Value :$myString2")
    //The Short data type can store whole numbers from -32768 to 32767:
    println("short value $myShort")
    println("long value $myLong")

    //Type conversion it is similar to java


    /*  In Kotlin, numeric type conversion is different from Java. For example,
    it is not possible to convert an Int type to a Long type with the following code:
      val x: Int = 5
      val y: Long = x
      println(y) // Error: Type mismatch
      note-  To convert a numeric data type to another type,
      you must use one of the following functions:
      toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble() or toChar():

    */

    //understan by code
    val x: Int = 50;
    val y: Long = x.toLong();
    println("conversion data type $y")

   /* Kotlin divides the operators into the following groups:
   Arithmetic operators
   Assignment operators
   Comparison operators
   Logical operators*/
    println("operator chapter ...\n\n")

    var  a=23;
    var  b=21;

    println("sum of two number :" +(a+b))
    println("subtract of two number : "+(a-b))
    println("multiple of two number : "+(a*b))
    println("division of two number :" +(a/b))//1
    println("modulus of two number :"+(a%b))//2

    //kotlin comprision operator
    //
    println("operator concept....\n\n")

    println("equal operator "+(a==b))
    println("equal operator "+(a!=b))
    println("equal operator "+(a>b))
    println("equal operator "+(a<b))

    //String DataType
    val myState:String
    myState="Bihar"

    println("state name $myState")
    println("state name "+myState[0])
    println("state name "+myState[3])


    //Finding a String in a String
    var mySearchString="i am from india"
    println(mySearchString)

    var searList=mySearchString.indexOf("from")
    println(searList)
    //String Concatenation

    println("new String :"+mySearchString.plus("in bihar"))

    //String Templates/Interpolation
    var firstName = "John"
    var lastName = "Doe"
    println("My name is $firstName $lastName")


    //in kolin if else condition similar to java and also there some new
    //syntax in if else

    var time=90
    if (time>=90)
    {
        println("good morning india")
        time=12
    }else
    {
        println("good moring bihar")
    }

    //enhance if else in kotlin
    var value=if (time>100){
        "good day"
    }else{
       "bad day"
    }
    println("your answer : $value") //bad day

    //if only have one state the we remove curly braces
    value=if (time<5) "akash" else "sandeep"
    println("answer $value")//sandeep


    //how to use conditional  operator when()..it is similar to java switch
    val day=0
   val result= when(day)
    {
        0-> "0"
        1-> "1"
        2-> "2"
        3-> "3"
        4-> "4"
        5-> "5"
        6-> "6"
        7-> "7"
       else -> "invlid number"
   }
    println(result)

    //while loop ..it similar to java

    println("while loop \n")
    var i=8;
    while (i>0)
    {
        println("value of i = $i")
        i--
    }

    //Kotlin Arrays
    println("Kotlin array ...\n")

    var array= arrayOf("akash","manjeet","rohan",4)
    println(array[3])

    array[0]="variable change"

    println("Size of array ${array.size}")

     array[0]="akash"
    //in operator ->You can use the in operator to check if an element exists in an array:

    if("akash" in array)
    {
        println("name is exist")
    }else
    {
        println("name is not exit ")
    }

    //
    for ( data in array)
    {
        println(data)
    }

    //in kotlin there is tradtional loop lik range
    for (result in 'a'..'z')
    {
        print(result+" ")
    }
    for (num in 5..25)
    {
       print(" "+num)
    }
//call the funtion from here
    myFunction("\nthis is my first function...")

    myFunction2("Aakas",22)
//return value to function
   val result3= getValueFrom(77,23)
    println("result3 value is :"+result3)


    //passing the value foe constructor
    val c1 = Car("Ford", "Mustang", 1969)
    /* to acess properties of car class
    * we have to create car */


    val car=Car("Ford", "Mustang", 1969);
    println("model ${car.model}\n car name ${car.brand}  \nyear ${car.year}")

     car.drive("drive called")

    val myChild=MyChildClass()
    myChild.myFunction();



   }//function close




fun getValueFrom(i: Int, i1: Int): Int{

    return (i+i1)
}

fun myFunction2(s: String, i: Int) {
    println(s+ " is " + i)
}

//funtion
fun myFunction(fname: String) {
    println(fname + " akash")

}


//oop concept
class Car(s: String, s1: String, i: Int) {

    var brand = s
    var model = s1
    var year = i

    fun drive(f:String)
    {
     println(f)
    }





}//car class closed

//inherit cancept

// Superclass
open class MyParentClass {
    val x = 5000
}

// Subclass
class MyChildClass: MyParentClass() {
    fun myFunction() {
        println(x)  // x is now inherited from the superclass
    }
}




