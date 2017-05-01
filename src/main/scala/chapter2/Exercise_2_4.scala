package chapter2

/**
  * Implement uncurry which reverses the transformation of curry.
  */
object Exercise_2_4 {

  def uncurry[A, B, C](f: A => B => C): (A, B) => C = {
    (a: A, b: B) => f(a)(b)
  }

}
