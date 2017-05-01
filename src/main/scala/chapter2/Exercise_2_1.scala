package chapter2

import scala.annotation.tailrec

/**
  * Write a recursive function to get the nth Fibonacci number. The first two Fibonacci numbers are 0 and 1.
  * The nth number is always the sum of the previous two - the sequence begins 0, 1, 1, 2, 3, 5.
  * Your definition should use a local tail-recursive function.
  */
object Exercise_2_1 {

  def fib(n: Int): Int = {
    @tailrec
    def go(n: Int, a: Int, b: Int): Int = {
      if (n <= 0) {
        a
      } else {
        go(n - 1, b, a + b)
      }
    }

    go(n, 0, 1)
  }

}
