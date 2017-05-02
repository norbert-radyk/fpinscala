package chapter3

import chapter3.Exercise_3_2._
import org.scalatest.{FlatSpec, Matchers}

class Exercise_3_2_Spec extends FlatSpec with Matchers {

  "List tail" should "throw an exception when called for empty list" in {
    an[IllegalStateException] should be thrownBy tail(Nil)
  }

  it should "return empty list for a single element list" in {
    tail(List(7)) shouldBe Nil
  }

  it should "return a list of all elements except the first one of the multi-element list" in {
    tail(List(7, 10, 5)) shouldBe List(10, 5)
  }

}
