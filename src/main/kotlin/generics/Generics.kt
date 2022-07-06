package generics


//T means Generic type we can pass the value any type
class Generics<T>(id:T) {
    var id :T=id
    init {
      this.id=id
        println(id)
    }
}