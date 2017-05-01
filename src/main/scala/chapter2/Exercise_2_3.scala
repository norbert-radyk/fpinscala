package chapter2


object Exercise_2_3 {

  /**
    * Implement curry which converts a function f of two arguments into function of one argument which partially applies f.
    */
  def curry[A, B, C](f: (A, B) => C): A => B => C = {
    (a: A) => f(a, _)
  }

}
