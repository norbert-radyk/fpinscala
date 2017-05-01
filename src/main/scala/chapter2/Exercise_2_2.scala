package chapter2

import scala.annotation.tailrec

/**
  * Implement isSorted which checks whether an Array[A] is sorted according to a given comparison function:
  *
  * def isSorted[A](as: Array[A], ordered: (A, A) => Boolean) : Boolean
  */
object Exercise_2_2 {

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {

    @tailrec
    def verifySorted[A](i: Int, as: Array[A], ordered: (A, A) => Boolean): Boolean = {
      if (i >= as.length) {
        true
      } else if (ordered(as(i - 1), as(i))) {
        verifySorted(i + 1, as, ordered)
      } else {
        false
      }
    }

    verifySorted(1, as, ordered)
  }

}
