package chapter2

import org.scalatest.{FlatSpec, Matchers}

class Exercise_2_1_Spec extends FlatSpec with Matchers {

  "Nth Fibonacci number" should "return zero as a 0 number" in {
    Exercise_2_1.fib(0) shouldBe 0
  }

  it should "return 1 as a 1st number" in {
    Exercise_2_1.fib(1) shouldBe 1
  }

  it should "return 2 as a 2nd number" in {
    Exercise_2_1.fib(2) shouldBe 1
  }

  it should "return 8 as a 6th number" in {
    Exercise_2_1.fib(6) shouldBe 8
  }

}
