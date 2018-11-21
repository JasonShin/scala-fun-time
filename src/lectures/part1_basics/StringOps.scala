package lectures.part1_basics

object StringOps extends App {
  val str: String = "hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("hello"))
  println(str.replace("h", "z"))
  println(str.toLowerCase)
  println(str.toUpperCase)
  println(str.length)

  val aNumberString = "2"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  // S interpolation
  val name = "jason"
  val age = 12
  println(s"my name is $name and my age is $age")

  // F interpolation
  val speed = 1.2f
  println(f"$name can eat $speed%2.2f burgers per minute")

  // raw interpolation
  println(raw"aisjdai \n aiuai")
}
