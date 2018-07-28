package com.ajzawawi.i_got_99_problems_but_scala_aint_one.lists

/*
    Find the last element of a list.
    Example:
    scala> last(List(1, 1, 2, 3, 5, 8))
    res0: Int = 8
 */

object P01 {

  // The list can be of any type
  def getLast[A](list: List[A]) : A = {
    list.last
  }

}