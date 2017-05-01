package chapter2

/**
  * Implement the higher order function which composes two functions
  */
object Exercise_2_5 {

  def compose[A, B, C](f: B => C, g: A => B): A => C = {
    a: A => f(g(a))
  }

}
