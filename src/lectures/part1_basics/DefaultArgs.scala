package lectures.part1_basics

object DefaultArgs extends App {
  def trFact(n: Int, acc: Int = 1): Int = {
    if (n <= 1) acc
    else trFact(n - 1, n * acc)
  }

  val fact10 = trFact(10, 2)

  def savePicture(format: String = "jpg", width: Int = 100, height: Int = 100): Unit = println("saving picture")
  savePicture(width = 1000)

  savePicture(
    width = 10,
    height = 20,
    format = "zz"
  )
}
