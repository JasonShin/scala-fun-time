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

  /*
  1. Generic trait MyPredicate[-T] with a little method Test(T) => Boolean
  2. Generic trait MyTransformer[-A, B]
  3. MyList:
     - map(transformer) =>  MyList
     - filter(predicate) => MyList
     - flatMap(transformer from A to MyList[B]) => MyList[B]

     class EvenPredicate extends MyPredicate[Int]
     class StringToIntTransformer extends MyTransformer[String, Int]

     [1,2,3].map(n * 2) => [2, 4, 6]
     [1,2,3,4].filter(n % 2) => [2, 4]
     [1,2,3].flatMap(n => [n, n+ 1]) => [1,2,2,3,3,4]
   */
  trait MyPredicate[-T] {

  }
}
