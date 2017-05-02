package chapter3

import chapter3.Exercise_3_4.drop
import org.scalatest.{FlatSpec, Matchers}

class Exercise_3_4_Spec extends FlatSpec with Matchers {

  "List drop" should "return empty list if there are more elements to be removed than elements in the list" in {
    drop(List(2, 3), 10) shouldBe Nil
  }

  it should "return a list with first n-elements returned" in {
    drop(List(7, 10, 5), 2) shouldBe List(5)
  }

}
