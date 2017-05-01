package chapter3

/**
  * Implement function `tail` for removing the first element of a List. Note the function takes constant time.
  */
object Exercise_3_2 {

  sealed trait List[+A]

  case object Nil extends List[Nothing]

  case class Cons[+A](head: A, tail: List[A]) extends List[A]

  def tail[A](list: List[A]): List[A] = list match {
    case Nil => throw new IllegalStateException("Unable to retrieve tail from the empty list!")
    case Cons(_, xs) => xs
  }

}
