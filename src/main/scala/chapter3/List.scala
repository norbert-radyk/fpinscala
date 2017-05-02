package chapter3

object List {

  def apply[A](elements: A*): List[A] = {
    if (elements.isEmpty) {
      Nil
    } else {
      Cons(elements.head, apply(elements.tail: _*))
    }
  }

}

sealed trait List[+A]

case object Nil extends List[Nothing]

case class Cons[+A](head: A, tail: List[A]) extends List[A]