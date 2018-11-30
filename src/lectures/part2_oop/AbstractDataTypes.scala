package lectures.part2_oop

object AbstractDataTypes extends App {

  // Abstract Class
  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"
    override def eat: Unit = println("crunch crunch")
  }

  // Traits
  trait Carnivore {
    def eat(animal: Animal): Unit
    val preferredMeal: String = "fresh meat"
  }

  trait ColdBlooded

  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "croc"

    override def eat: Unit = println("nom nom nom")

    override def eat(animal: Animal): Unit = println(s"I'm a croc and I am eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  // traits vs abstract class
  // 1 - traits do not have constructor parameter
  // 2 - multiple traits may be inherited by the same class
  // 3 - traits = behaviour, abstract class = "thing"
}
