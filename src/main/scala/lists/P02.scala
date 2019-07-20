import scala.annotation.tailrec
/*
    Find the last but one element of a list.
    Example:
    scala> penultimate(List(1, 1, 2, 3, 5, 8))
    res0: Int = 5
 */
object p02 extends App {
  def penultimate(intList: List[Int]): Int = {
    @tailrec
    def iterate(list: List[Int], num: Int = 0): Int = {
      list match {
        case List(a, _) => a
        case List(b) => b
        case x if x.nonEmpty => iterate(x.tail, x.head)
        case _ => 0
      }
    }
    iterate(intList)
  }
  println(penultimate(List(1,2,3,4,5)))
}