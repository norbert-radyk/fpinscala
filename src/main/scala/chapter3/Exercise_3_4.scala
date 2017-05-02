package chapter3

import scala.annotation.tailrec

/**
  * Generalize tail to the function drop, which removes the first n elements from a list.
  * Note that this function takes time proportional only to the number of elements
  * being dropped—we don’t need to make a copy of the entire List.
  */
object Exercise_3_4 {

  @tailrec
  def drop[A](l: List[A], n: Int): List[A] = {
    if (n <= 0) {
      l
    } else {
      l match {
        case Nil => Nil
        case Cons(_, xs) => drop(xs, n - 1)
      }
    }
  }

}
