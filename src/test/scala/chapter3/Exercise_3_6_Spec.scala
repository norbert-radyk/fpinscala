package chapter3

import chapter3.Exercise_3_6.init
import org.scalatest.{FlatSpec, Matchers}

class Exercise_3_6_Spec extends FlatSpec with Matchers {

  "List init" should "return empty list for one element list" in {
    init(List(2)) shouldBe Nil
  }

  it should "return a list without the last element" in {
    init(List(7, 10, 5)) shouldBe List(7, 10)
  }

}
