class ListOF {

    //Kotlin List is an interface and generic collection of elements
    fun immuTableList() {

        //
        println("immutable ListOf ..")
        val list = listOf<String>("Ajay", "Vijay", "Prakash")//read only, fix-size

        for (element in list) {

            println(element)

        }

    }
    //non generic type listOf
    fun nonGenericListOf()
    {
        var list = listOf(1,2,3,"Ajay","Vijay","Prakash")//read only, fix-size
        for(element in list){
            println(element)
        }
        println()
        for(index in 0..list.size-1){
            println(list[index])
        }
    }

    //method releted to listOf
    fun method_releted_to_listof() {
        var stringList: List<String> = listOf<String>("Ajay", "Vijay", "Prakash", "Vijay", "Rohan")
        var list: List<String> = listOf<String>("Ajay", "Vijay", "Prakash")
        for (element in stringList) {
            print(element + " ")
        }

        println()
        println(stringList.get(0))//ajay
        println(stringList.indexOf("Vijay"))//1
        println(stringList.lastIndexOf("Vijay"))//3
        println(stringList.size)//5
        println(stringList.contains("Prakash"))//true
        println(stringList.containsAll(list))//true
        println(stringList.subList(2,4))
        println(stringList.isEmpty())//false
        println(stringList.drop(1))
        println(stringList.dropLast(2))
    }

    fun mutableList()
    {
        var mutableList = mutableListOf("Ajay","Vijay","Prakash","Vijay")

        for(element in mutableList){
            println(element)
        }
        mutableList.add("new list add")
        println()
        for(index in 0..mutableList.size-1){
            println(mutableList[index])
        }
    }

    fun arrayList()
    {
        val arrayList = ArrayList<String>()//Creating an empty arraylist
        arrayList.add("Ajay")//Adding object in arraylist
        arrayList.add("Vijay")
        arrayList.add("Prakash")
        arrayList.add("Rohan")
        arrayList.add("Vijay")
        println(".......print ArrayList.......")
        for (i in arrayList) {
            println(i)
        }
    }
    fun fixSizeArrayList() {
        val arrayList1 = ArrayList<String>(5)
        arrayList1.add("Ajay")//Adding object in arraylist
        arrayList1.add("Vijay")
        arrayList1.add("Prakash")
        arrayList1.add("Rohan")
        arrayList1.add("Vijay")
        arrayList1.add("kamal")
        println(".......print ArrayList1......")
        for (i in arrayList1) {
            println(i)
        }

        println("using iterator ..")
        val itr=arrayList1.iterator();
        while (itr.hasNext())
        {
            println(itr.next())
        }
    }
    //Kotlin ArrayList: arrayListOf()
    /*
    An arrayListOf() is a function of ArrayList class. ArrayList is mutable which
    means it provides both read am write functionalities. The arrayListOf() function
    returns an ArrayList type.

     */
    fun arraylistOf(){
        var intArrayList: ArrayList<Int> = arrayListOf<Int>(1,2,3)
        val stringArrayList: ArrayList<String> = arrayListOf<String>("Ajay","Vijay","Prakash")
        val anyArrayList: ArrayList<Any> = arrayListOf<Any>(1,2,3,"Ajay","Vijay","Prakash")
        println("print int ArrayList")

        intArrayList.set(2,89)

        for(element in intArrayList){
            println(element)
        }

        println()
        println("print string ArrayList")
        for(element in stringArrayList){
            println(element)
        }
        println()
        println("print any ArrayList")
        for(element in anyArrayList) {
            println(element)
        }

        }



}//