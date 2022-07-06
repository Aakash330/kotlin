open class Modifiers {
protected val i=10;
open protected val a=20
    //there are following modifier
    // public-
    // protected
    // internal
    // private

    //public modififier
    /*
    A public modifier is accessible from everywhere in the project.
    It is a default modifier in Kotlin. If any class, interface etc.
    are not specified with any access
    modifier then that class, interface etc. are used in public scope.
     */
  //protected modifier
    /*

    A protected modifier with class or interface allows visibility to
    its class or subclass only. A protected declaration (when overridden) in
    its subclass is also protected modifier unless it is explicitly changed
     */


}
class child2 :Modifiers()
{
    override val a=40
  fun getValue():Int
  {
     println("value  of a :$a")
      return i+90

  }

    //ovveride the variable
}