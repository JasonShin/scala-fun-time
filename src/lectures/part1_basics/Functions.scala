package lectures.part1_basics

object Functions extends App {
  def aFunction(a: String, b: Int): String =
    a + " " + b

  println(aFunction("zz", 2))

  def aParamlessFunction(): Int = 42
  println(aParamlessFunction())
  println(aParamlessFunction)

  // Recursive function always need a return type
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("hello", 3))

  // When you need loops, use recursion

  def aFunctionWithSideEffect(aString: String): Unit = println("test!")


}
