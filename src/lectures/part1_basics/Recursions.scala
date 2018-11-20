package lectures.part1_basics

import scala.annotation.tailrec

object Recursions extends App {

  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else {
      println("computing factorial of ", n, "- I first need factorial of", (n - 1))
      val result = n * factorial(n - 1)
      println("computed factorial of ", n)
      result
    }
  }

  // println(factorial(10))
  // println(factorial(5000))

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accum: BigInt): BigInt = {
      if (x <= 1) accum
      else factHelper(x - 1, x * accum) // TAIL RECURSION
    }
    factHelper(n, 1)
  }

  // println(anotherFactorial(5000))

  // WHEN YOU NEED LOOPS: USE TAIL RECURSION

  /**
    * 1. Concat strings n times
    * 2. Fibonacci tail recursive
    */

  def concat(n: Int, str: String): String = {
    @tailrec
    def concatHelper(x: Int, accum: String): String = {
      if (x <= 1) accum
      else concatHelper(x - 1, accum + str)
    }
    concatHelper(n, str)
  }

  // println(concat(100000, "hello"))

  def anotherFib(n: Int): BigInt = {
    def fibTrailRec(i: BigInt, last: BigInt, nextToLast: BigInt): BigInt = {
      if(i >= n) last
      else fibTrailRec(i + 1, last + nextToLast, last)
    }

    if(n <= 2) 1
    else fibTrailRec(2, 1, 1)
  }

  println(anotherFib(8))
}
