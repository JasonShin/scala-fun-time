package lectures.part2_oop

object MethodNotations extends App {
  class Person(val name: String, favouriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favouriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nickname: String): Person = new Person(s"${this.name} ($nickname)", favouriteMovie)
    def hangOutWith(person: Person): String = s"${this.name} is hanging otu with ${person.name}"
    def unary_! : String = s"${name}, what the heck?"
    def unary_+ : Person = new Person(name, favouriteMovie, age + 1)
    def apply(): String = s"Hi, my name is ${name} and I like ${favouriteMovie}"
    def apply(n: Int): String = s"$name watched $favouriteMovie $n times"
    def learns(thing: String) = s"$name is learning $thing"
    def learnsScala = this learns "Scala"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent
  // infix notation = operator notation (example of syntactic sugar)

  // Operators in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary hangOutWith tom)
  println(mary.hangOutWith(tom))

  println(1 + 2)
  println(1.+(2))

  // All operators are method
  // Akka actors have ! ?

  // Prefix notation
  val x = -1 // equivalent with 1.unary_-
  val y = 1.unary_-
  // unary_prefix only works with
  println(!mary)
  println(mary.unary_!)

  // apply
  println(mary.apply())
  println(mary())

  /*
  1. Overload the plus operator
   */
  println((mary + "the Rocker").apply())
  println((+mary).age)
  println(mary learns "Scala")
  println(mary(10))
}
