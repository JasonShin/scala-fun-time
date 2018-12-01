package lectures.part2_oop

object Generics extends App {

  class MyList[A] {
    // Use the Type A
    def add[B >: A](element: B): MyList[B] = ???
    /*
      A = Cat
      B = Dog = Animal
     */
  }

  class MyMap[Key, Value]

  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  // Generic Methods
  object MyList {
    def empty[A]: MyList[A] = ???
  }

  val emptyListOfIntegers = MyList.empty[Int]

  // Variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // 1. Yes List[Cat] extends List[Animal] = COVARIANCE
  class CovarianceList[+A]
  val animal: Animal = new Cat
  val animalList: CovarianceList[Animal] = new CovarianceList[Cat]
  // AnimalList.add(new Dog) ??? HARD QUESTION => We return a list of Animal

  // 2. Invariance
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  // 3. Hell no: Contravariance
  class ContravariantList[-A]
  val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal]

  // Bound types

  /*
  // Only accepts subtypes of Animal
  class Cage[A <: Animal](animal: A)
  // Only accepts supertypes
  // class Cage[A >: Animal](animal: A)
  val cage = new Cage(new Dog)

  class Car
  val newCage = new Cage(new Car)
  */
}
