package lectures.part1_basics

object Expressions extends App {
  val x = 1 + 2 // An expression
  println(x)

  println(2 + 3 * 4)

  println(1 == x)

  println(!(1 == x))

  var aVariable = 2
  aVariable += 2
  println(aVariable)


  // Instruction (Do) vs Expressions (Value)
  // If is an expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)
  println(if (aCondition) 5 else 3)
  println(1 + 3)

  var i = 0
  while (i < 10) {
    println(i)
    i = i + 1
  }

  // EVERYTHING in Scala is an Expression!
  val aWeirdValue = (aVariable = 3) // Unit == Void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning

  // Code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "good bye"
  }

  // val anotherValue = z + 1 // z is inside the block
  
}
