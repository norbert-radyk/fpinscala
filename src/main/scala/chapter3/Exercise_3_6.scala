package chapter3

/**
  * Not everything works out so nicely.
  * Implement a function, init, that returns a List consisting of all but the last element of a List.
  * So, given List(1,2,3,4), init will return List(1,2,3).
  */
object Exercise_3_6 {

  def init[A](l: List[A]): List[A] = {
    l match {
      case Nil | Cons(_, Nil) => Nil
      case Cons(nonLast, tail) => Cons(nonLast, init(tail))
    }
  }

}
