package lectures.part2_oop

object AnonymousClass extends App {
  abstract class Animal {
    def eat: Unit
  }

  class AnonymousClass

  // anonymous class
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("hahahah")
  }

  /*
  equivalent with

  class AnonymousClass$$anon$1: Animal = new Animal {
    override def eat: Unit = println("hahahah")
  }

  val funnyAnimal: Animal = new AnonymousClass$$anon$1
   */

  println(funnyAnimal.getClass)

  class Person(name: String) {
    def sayHi: Unit = println(s"Hi, my name is $name, how can I help?")
  }

  val jim = new Person("Jim") {
    override def sayHi: Unit = println(s"Hi my name is Jim, how can I be your service?")
  }
}
