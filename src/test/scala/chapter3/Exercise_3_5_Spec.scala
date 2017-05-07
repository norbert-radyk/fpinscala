package chapter3

import chapter3.Exercise_3_5.dropWhile
import org.scalatest.{FlatSpec, Matchers}

class Exercise_3_5_Spec extends FlatSpec with Matchers {

  "List dropWhile" should "return empty list if all elements should be removed from the list" in {
    dropWhile(List(2, 3), (x: Int) => x <= 3) shouldBe Nil
  }

  it should "return a list after all first elements meeting the condition have been removed" in {
    dropWhile(List(7, 10, 5), (x: Int) => x <= 7) shouldBe List(10, 5)
  }

}
