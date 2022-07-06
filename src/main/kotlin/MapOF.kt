class MapOF {
    //Map is interface which is hold the data key value pair
    fun mapof()
    {
        val myMap = mapOf(1 to  "Ajay", 4 to "Vijay", 3 to "Prakash","ram" to "Ram", "two" to 2)
        for(key in myMap.keys){

            println("Element at key $key = ${myMap.get(key)}")


        }
    }

    fun mapGetValue()
    {
        val myMap: Map<Int,String> = mapOf<Int, String>(1 to "Ajay", 4 to "Vijay", 3 to "Prakash")


        for(key in myMap.keys){
            println("Element at key $key = ${myMap.get(key)}")
        }
        println(".....myMap.getValue(4).......")

        println(myMap.getValue(4))//vijay
    }
    //Kotlin Hasmap
    /*
     Kotlin HashMap is class of collection based on MutableMap interface.
     Kotlin HashMap class implements the MutableMap interface using Hash table.
     It store the data in the form of key and value pair.
    It is represented as HashMap<key, value> or HashMap<K, V>.
     */
    fun Hasmapp()
    {

        // var  myHasp:HashMap<String,Int> =HashMap<String,Int>()//it is also right
        val hashMap:HashMap<Int,String> = HashMap<Int,String>() //define empty hashmap
        hashMap.put(1,"Ajay")
        hashMap.put(3,"Vijay")
        hashMap.put(4,"Praveen")
        hashMap.put(2,"Ajay")
        println(".....traversing hashmap.......")
        for(key in hashMap.keys) {
            println("Element at key $key = ${hashMap[key]}")
        }
        }


    //hasmapOf
    /*
    A hashMapOf() is a function of HashMap class. It returns a new HashMap
    with the specified contents. It contains pairs of data in the form of key
    and value. HashMap is mutable collection
    which provides both read am write functionalities.
     */
    fun hasmapp()
    {
        val stringMap: HashMap<String,String> = hashMapOf<String,String>()
        stringMap.put("name", "Ashu")
        stringMap.put("city", "Delhi")
        stringMap.put("department", "Development")
        stringMap.put("hobby", "Playing")

        println("......traverse stringMap.......")
        for(key in stringMap.keys){
            println("Key = ${key} , value = ${stringMap[key]}")
        }

        println("......stringMap.containsKey(\"name\").......")
        println(stringMap.containsKey("name"))
    }

    //MutableMap Interface
    /*
    Kotlin MutableMap is an interface of collection framework that holds the object in
    the form of key and value pair. The values of MutableMap
    interface are retrieved by using their corresponding keys.

     */
    fun mutableHasMapInterface()
    {
        val mutablemap:MutableMap<String,String> = mutableMapOf()
        mutablemap.put("name","Akash")
        mutablemap.put("name1","Aakash2")
        mutablemap.put("name3","Aakash3")
        mutablemap.put("name4","akash4")
        for (key in mutablemap.keys)
        {
          println("$key = ${mutablemap.get(key)}")

        }
    }



}
