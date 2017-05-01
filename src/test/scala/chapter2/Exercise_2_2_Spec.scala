package chapter2

import org.scalatest.{FlatSpec, Matchers}

class Exercise_2_2_Spec extends FlatSpec with Matchers {

  private def ordered(a: Int, b: Int): Boolean = a <= b

  "isSorted" should "return true for the empty array" in {
    Exercise_2_2.isSorted(Array(), ordered) shouldBe true
  }

  "isSorted" should "return true for the single element array" in {
    Exercise_2_2.isSorted(Array(1), ordered) shouldBe true
  }

  "isSorted" should "return true for the sorted 2-element array" in {
    Exercise_2_2.isSorted(Array(1, 2), ordered) shouldBe true
  }

  "isSorted" should "return true for the unsorted 2-element array" in {
    Exercise_2_2.isSorted(Array(2, 1), ordered) shouldBe false
  }

}
