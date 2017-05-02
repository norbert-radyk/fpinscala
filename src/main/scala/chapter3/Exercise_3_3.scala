package chapter3

/**
  * Using the same idea, implement the function setHead for replacing the first element of a List with a different value.
  */
object Exercise_3_3 {

  def setHead[A](list: List[A], headValue: A): List[A] = list match {
    case Nil => Cons(headValue, Nil)
    case Cons(_, xs) => Cons(headValue, xs)
  }

}
