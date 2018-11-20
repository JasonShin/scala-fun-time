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

  def aBigFunction(n: Int): Int = {
    def aSmall(a: Int, b: Int): Int = a + b

    aSmall(n, n -1)
  }

  /**
    * 1. Greeting function (name, age) => "Hi, my name is $name and I am $age years old"
    * 2. Factorial function 1 * 2 * 3
    * 3. Fibonacci function
    *   f(1) = 1 f(2) = 1
    *   f(n) = f(n - 1) + f(n - 2)
    *
    */

  def greet(name: String, age: Int): String = s"Hi, my name is $name and I am $age years old"

  def factorial(n: Int): Int = {
    if (n < 0) {
      -1
    } else if (n == 0) {
      1
    } else {
      n * factorial(n - 1)
    }
  }

  def fib(n: Int): Int = {
    if (n <= 1) {
      1
    } else {
      fib(n - 1) + fib(n - 2)
    }
  }

}
