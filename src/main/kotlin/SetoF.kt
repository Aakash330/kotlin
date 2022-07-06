class SetoF {

    //Kotlin Set Interface
    /*
    Kotlin Set interface is a generic unordered collection of elements. Set interface
    does not support duplicate elements. This interface is immutable in
    nature its methods supports read-only functionality of the set.

    Set interface uses setOf() function to create the list of object
    of set interface which contains list of elements.
     */

    fun setInterface()
    {
        val set:Set<String> = setOf()
        val mySet: Set<Any> = setOf(2,6,4,29,5,"Ashu","Ajay")
        println(".......print Any set.........")
        for(element in mySet){
            println(element)
        }

        println("...mySet.isEmpty()...")
        println(mySet.isEmpty())

        println("...mySet.isNotEmpty()...")
        println(mySet.isNotEmpty())

    }

    //Kotlin Set Interface Example 5 - elementAt() and elementAtOrNull()
    /*
      The elementAt() function return element at given index and elementAtOrNull()
      function also return the element at given index , but if specified index does not
       contain element it returns null.
     */
    fun elementnullornot()
    {
        val mySet: Set<Any?> = setOf(2,6,4,29,4,null,null,"Ashu","Ajay")

        println(".......print Any set.........")
        for(element in mySet){
            println(element)
        }

        println(".......print mySet.elementAt(3).........")
        println(mySet.elementAt(3))

        println(".......print mySet.elementAtOrNull(5).........")
        println(mySet.elementAtOrNull(5))//ashu
    }
     //Kotlin MutableSet Interface
    /*
    Kotlin MutableSet interface is a generic unordered collection of elements.
     MutableSet interface does not support duplicate elements. This
     interface is mutable so its methods support read-write
    functionality supports adding and removing elements.
     */
    fun mutablesetOf()
    {
     val mutableMap:MutableSet<Any> = mutableSetOf()

        mutableMap.add(1)
        mutableMap.add("Akash")
        mutableMap.add(2)
        mutableMap.add("khushi")
        mutableMap.add("Ramu")
        mutableMap.add("Akash")

        for (data in mutableMap)
        {
            println(data)
        }
    }

    //HasSet
    /*
    Kotlin HashSet is class of collection which extends AbstractMutableSet class and
    implements Set interface. The HashSet class store elements using hashing mechanism.
    It support both read and write functionality. It does not support duplicate value and
    does not make guarantees about the order sequence of element.
     */

    fun HasSett()
    {
        val hashSet = HashSet<Int>(6)
        hashSet.add(2)
        hashSet.add(13)
        hashSet.add(6)
        hashSet.add(5)
        hashSet.add(2)
        hashSet.add(8)

        println("......traversing hashSet......")
        for (element in hashSet){
            println(element)
        }
    }
}