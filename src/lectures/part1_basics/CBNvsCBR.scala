package lectures.part1_basics

object CBNvsCBR extends App {
  def callByValue(x: Long): Unit = {
    println("by value:", x)
    println("by value:", x)
  }

  def callByName(x: => Long): Unit = {
    println("by value:", x)
    println("by value:", x)
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  // printFirst(infinite(), 34)
  println(34, infinite())
}
