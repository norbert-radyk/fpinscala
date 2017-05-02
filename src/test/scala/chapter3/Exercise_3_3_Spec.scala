package chapter3

import chapter3.Exercise_3_3.setHead
import org.scalatest.{FlatSpec, Matchers}

class Exercise_3_3_Spec extends FlatSpec with Matchers {

  "List setHead" should "return one element list with given head for an empty list" in {
    setHead(Nil, 1) shouldBe List(1)
  }

  it should "return a list with first element replaced with the given head value" in {
    setHead(List(7, 10, 5), 13) shouldBe List(13, 10, 5)
  }

}
