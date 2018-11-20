package lectures.part1_basics

object ValuesVariableTypes extends App {
  // val x: Int = 42 // type declaration is optional because the compiler can infer it
  val x = 42
  println(x)

  // Vals are immutable


  // Strings
  val aString: String = "test"
  val bString = "zz"


  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 123
  val aLong: Long = 214032143
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  // variable = mutable = side effect
  var aVariable: Int = 4
  aVariable = 12

}
