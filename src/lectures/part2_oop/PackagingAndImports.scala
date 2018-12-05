package lectures.part2_oop

import java.util.Date
import java.sql.{Date => SqlDate}

import playground.{Cinderella, PrinceCharming}

// import playground.Cinderella

object PackagingAndImports extends App {

  // Package members are accessible by their simple name
  val writer = new Writer("Jason", "Shin", 2018)

  // import the package
  // val princess = new Cinderella

  // fully qualified class name
  val princess = new Cinderella

  // matching folder structure

  // package objects
  sayHello
  println(SPEED_OF_LIGHT)

  // Imports
  val prince = new PrinceCharming

  val d = new Date
  // val sqlDate = new java.sql.Date(2018, 2,2)
  val sqlDate = new SqlDate(2018, 2, 2)
}
