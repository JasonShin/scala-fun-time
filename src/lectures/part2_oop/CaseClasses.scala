package lectures.part2_oop

object CaseClasses extends App {
  /*
    equals, hashCode, toString
   */
  case class Person(name: String, age: Int)

  // 1. Class parameters are promoted to fields
  val jim = new Person("Jim", 32)
  println(jim.name)

  // 2. Sensible toString -> Person(Jim,12)
  // just println(jim) will auto duck it to println(instance.toString)
  println(jim)

  // 3. Equals and hashcode implemented OOTB
  val jim2 = new Person("Jim", 34)
  println(jim == jim2)

  // 4. CCs hae handy copy methods
  val jim3 = jim2.copy(age = 45)
  println(jim3)

  // 5. case classes have companion objects
  val thePerson = Person
  val mary = Person.apply("Mary", 23)
  val mary2 = Person("Mary2", 23)

  // 6. CCs are serialisable
  // Useful in Akka because the framework is about sending serialised objects and messages

  // 7. CCs have extractor patterns => CCs can be used in PATTERN MATCHING

  case object UnitedKingdom {
    def name: String = "The United Kingdom of GB and NI"
  }

  /*
  Expand MyList - use case classes and case objects
   */

}
