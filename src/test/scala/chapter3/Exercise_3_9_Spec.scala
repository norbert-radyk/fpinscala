package chapter3

import org.scalatest.{FlatSpec, Matchers}

class Exercise_3_9_Spec extends FlatSpec with Matchers {

  "List init" should "return empty list for one element list" in {
    Exercise_3_9.length(Nil) shouldBe 0
  }

  it should "return a list without the last element" in {
    Exercise_3_9.length(List(7, 10, 5)) shouldBe 3
  }

}
