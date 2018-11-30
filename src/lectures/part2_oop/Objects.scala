package lectures.part2_oop

object Objects extends App {
  // Scala does not have class-level functionality
  object Person {
    // "static"/"class" -level functionality
    val N_EYES = 2
    def canFly = false

    def apply(mother: Person, father: Person = new Person("Bobbie")): Unit = {

    }
  }

  class Person(val name: String) {
    // Instance-level functionality
  }

  // Companion pattern

  println(Person.N_EYES)
  println(Person canFly)

  // Scala object is an singleton instance
  val mary = Person
  val john = Person

  println(mary == john)

  val mary2 = new Person("mary")
  val john2 = new Person("john")

  println(mary2 == john2)

  val son = Person(mary2, john2)

  // Scala application = Scala object with
  /*
  def main(args: Array[String]): Unit = {
    println("testing!")
  }
  */
}
