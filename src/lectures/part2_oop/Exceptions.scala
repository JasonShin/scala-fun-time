package lectures.part2_oop

object Exceptions extends App {
  val x: String = null

  // println(x.length)

  // ^ this will crash with a NullPointerException
  // Throwing and catching exceptions

  // val aWeirdValue: String = throw new NullPointerException

  // throwable classes extends throwable
  // Exception and Error are the major Throwable subtypes

  // 2. How to catch exceptions
  def getInt(withExceptions: Boolean): Int =
    if (withExceptions) throw new RuntimeException("No int for you!")
    else 42

  val potentialFail: Int = try {
    getInt(true)
  } catch {
    case e: RuntimeException => 43
  } finally {
    // Code that will be executed no matter what
    // Optional
    // Finally does not influence the return type of try..catch
    // Use finally only for side effects
    println("Finally")
  }

  println(potentialFail)

  // 3. How to define own exceptions
  /* class MyException extends Exception

  val exception = new MyException

  throw exception */

  /*
  1. Crash your program with an OutOfMemoryError
  2. Crash with SOError
  3. PocketCalculator
      - add(x, y)
      - multiply(x, y)
      - subtract(x, y)
      - divide(x, y)

      Throw
        - OverflowException if add(x,y) exceeds Int.MAX_VALUE
        - UnderflowException if subtract(x,y) exceeds Int.MIN_VALUE
        - MathCalculationException for division by 0
   */
  // OOM
  // val array = Array.ofDim(Int.MaxValue)

  // SO
  // val infinite: Int = 1 + infinite
  // val noLimit = infinite
  class OverflowExceptions extends RuntimeException
  class UnderflowExceptions extends RuntimeException
  class MathCaculationException extends RuntimeException("Division by 0")

  object PocketCalculator {
    def add(x: Int, y: Int): Int = {
      val result = x + y
      if (x > 0 && y > 0 && result < 0) throw new OverflowExceptions
      else if (x < 0 && y < 0 && result  > 0) throw new UnderflowExceptions
      else result
    }

    def subtract(x: Int, y: Int): Int = {
      val result = x - y
      if (x > 0 && y < 0 && result < 0) throw new OverflowExceptions
      else if (x < 0 && y > 0 && result > 0) throw new UnderflowExceptions
      else result
    }

    def multiply(x: Int, y: Int): Int = {
      val result = x * y
      if (x > 0 && y > 0 && result < 0) throw new OverflowExceptions
      else if (x < 0 && y < 0 && result < 0) throw new OverflowExceptions
      else if (x > 0 && y < 0 && result > 0) throw new UnderflowExceptions
      else if (x > 0 && y > 0 && result < 0) throw new UnderflowExceptions
      else result
    }

    def divide(x: Int, y: Int) = {
      if (y == 0) throw new MathCaculationException
      else x / y
    }
  }

  // println(PocketCalculator.add(Int.MaxValue, 10))
  println(PocketCalculator.divide(2, 0))
}
