class MyCollection1 {

    /*
    Kotlin Array
 Array is a collection of similar data either of types Int, String etc.
 Array in Kotlin has mutable in nature with fixed size.
 Which means we can perform both read and writes operations on elements of array.
     */

//It initializes the element of array of int type with size 5 with all elements as 0 (zero).
    fun arrayIniliza()
   {
       val array=Array<Int>(5){0}
       println("array element is : ${array.get(0)}")

   }

 //Kotlin array declaration - using arrayOf function
 fun arrayOfFunction()
 {
     println("Arrayof Funtion called ")
     var myArray1 = arrayOf(1,10,4,6,15,"Aakash")
     var myArray2 = arrayOf<Int>(1,10,4,6,15)
     val myArray3 = arrayOf<String>("Ajay","Prakesh","Michel","John","Sumit")
     var myArray4= arrayOf(1,10,4, "Ajay","Prakesh")
     println("myArray1 : ${myArray1.get(2)}")
     for (data in myArray3)
     {
         println(data)
     }

     //use of in operator in array for loop
     var myArray5: IntArray = intArrayOf(5,10,20,12,15)

     for (index in 0..4){
         println(myArray5[index])
     }



 }


}

fun main() {
    val myCollection1 = MyCollection1()
    myCollection1.arrayIniliza();
    myCollection1.arrayOfFunction()
    val listOf=ListOF()
    listOf.immuTableList();
    println("non generic list called ...")
    listOf.nonGenericListOf()

    println("method releted to listof ")
    listOf.method_releted_to_listof()
    println("mutable listv")
    listOf.mutableList();
    println("crating empty array list")
    listOf.arrayList()
    println("crating fixed size array list")
    listOf.fixSizeArrayList();
     println("arrayListOf funtion ")
    listOf.arraylistOf();
    println("mapof method call ")
    val mapOF=MapOF();
    mapOF.mapof();
    mapOF.mapGetValue();
    println("Hasmap method called")

    mapOF.Hasmapp();

    println("hasmapOf method called")
    mapOF.hasmapp()
    println("Mutable Hasmap ..")
    mapOF.mutableHasMapInterface()
    println("my set Interface")
    val setof:SetoF=SetoF()
    setof.setInterface()
    println("Kotlin Set Interface Example 5 - elementAt() and elementAtOrNull()")
    setof.elementnullornot()
    println("MutableSet called ")
    setof.mutablesetOf()
    println("HasSet called")
    setof.HasSett()
    useOfStaticfuntion.staticfuntion()




}