package chapter3

import scala.annotation.tailrec

/**
  * Implement dropWhile, which removes elements from the List prefix as long as they match a predicate.
  */
object Exercise_3_5 {

  @tailrec
  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = {
    l match {
      case Cons(head, tail) if f(head) => dropWhile(tail, f)
      case _ => l
    }
  }

}
