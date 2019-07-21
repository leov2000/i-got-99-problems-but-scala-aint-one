import scala.annotation.tailrec
/*
    Find the Kth element of a list.
    By convention, the first element in the list is element 0.
    Example:

    scala> nth(2, List(1, 1, 2, 3, 5, 8))
    res0: Int = 2
 */
object P03 extends App {

  def nth(num: Int, list: List[Int]): Int = {
    @tailrec
    def iterate(acc: List[Int] = List[Int](), numList: List[Int]): Int =
      numList match {
        case x if x.isEmpty => -1
        case x if acc.length == num => x.head
        case x:List[Int] => iterate(acc :+ x.head, x.tail)
        case _ => -1
      }
    iterate(numList=list)
  }

  println(nth(2, List(7,5,88,3,2,1)))
}