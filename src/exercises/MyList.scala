package exercises

abstract class MyList[+A] {

  /*
  head = first element of this list
  tail = remainder of the list
  isEmpty = is this list empty?
  add(int) => new list with this element added
  toString => a string representation of the list
   */

  def head: A
  def tail: MyList[A]
  def isEmpty: Boolean
  def add(element: A): MyList[A]
  protected def printsElements: String
  override def toString: String = "[" + printsElements + "]"
  // def toString: String
}

object Empty extends MyList {
  override def head: Int = throw new NoSuchElementException

  override def tail: MyList = throw new NoSuchElementException

  override def isEmpty: Boolean = true

  override def add(element: Int): MyList = new Cons(element, Empty)

  override protected def printsElements: String = ???
}

class Cons(h: Int, t: MyList) extends MyList {
  override def head: Int = h

  override def tail: MyList = t

  override def isEmpty: Boolean = false

  override def add(element: Int): MyList = new Cons(element, this)

  override protected def printsElements: String = {
    if (t.isEmpty) "" + h
    else h + " " + t.toString
  }
}

object ListTest extends App {
  val list = new Cons(1, new Cons(2, new Cons(3, Empty)))
  println(list.tail.head)
  println(list.add(4).head)
  println(list.isEmpty)

  // Polymorphic call
  println(list.toString)
}
