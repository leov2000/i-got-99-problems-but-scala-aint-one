package com.ajzawawi.i_got_99_problems_but_scala_aint_one.lists
import org.scalatest.FunSpec

class P01_Spec extends FunSpec {

  describe("getLast") {
    it("should return the last element in a homogeneous list") {
      val last = P01.getLast(List(1,2,3,4))
      assert(last == 4)
    }

    it("should return the last element in a heterogeneous list") {
      val last = P01.getLast(List("a", 1.24))
      assert(last == 1.24)
    }
  }
}