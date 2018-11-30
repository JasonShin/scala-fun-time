package lectures.part2_oop

object InheritanceAndTraits extends App {

  class Animal {
    val creatureType = "yo"
    def eat = println("Nom Nom Nom")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("miaaao")
    }
  }

  val cat = new Cat
  cat.crunch

  // Constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  // Overriding
  class Dog(override val creatureType: String) extends Animal {
    // override val creatureType: String = "domestic"
    override def eat: Unit = println("crunch, crunch")
  }
  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)

  // Type substitution; aka polymorphism
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat

  // Prevent overrides
  // 1. use final on number
  // 2. use final on the entire class
  // 3. Seal the class - extend only with the same file
}
