package chapter3

import chapter3.List._

/**
  * Compute the length of a list using foldRight.
  */
object Exercise_3_9 {

  def length[A](as: List[A]): Int = foldRight(as, 0) {
    case (_, b) => b + 1
  }


}
