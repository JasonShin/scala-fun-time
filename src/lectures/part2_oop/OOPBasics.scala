package lectures.part2_oop

/**
  *
  */
object OOPBasics extends App {
  val person = new Person("Jason", 26)
  println(person.age)
  person.greet("hello!")
  person.greet

  val author = new Writer("Charles", "Dickens", 1812)
  val imposter = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectation", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))

  val counter = new Counter
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print
}

class Person(name: String, val age: Int) {
  // body
  val x = 2

  println(1 + 3)

  def greet(name: String): Unit = println(s"${this.name} says Hi, $name")

  def greet(): Unit = println(s"Hi, I am ${this.name}")

  // Multiple constructors
  def this(name: String) = this(name, 0)
}

/**
  * Novel and a Writer
  *
  * Writer: First name, surname, year
  *   - method fullname
  *
  * Novel: name, year of release, author
  *   - authorAge
  *   - isWrittenBy(author)
  *   - copy (new year of release) = new instance of Novel
  */

class Writer(firstName: String, surname: String, val year: Int) {
  def fullName: String = firstName + " " + surname
}

class Novel(name: String, year: Int, author: Writer) {
  def authorAge = year - author.year
  def isWrittenBy(author: Writer) = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

/**
  * Counter class
  *   - receives an int value
  *   - method current count
  *   - method to increment/decrement => new counter
  *   - overload inc/dec to receive an amount
  */
class Counter(val count: Int = 0) {
  def inc = {
    println("increment")
    new Counter(count + 1)  // immutability
  }
  def dec = {
    println("decrement")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n - 1)
    // new Counter(count + n)
  }
  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n - 1)
    // new Counter(count - n)
  }

  def print = println(count)
}
