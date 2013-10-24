package anaydis.search

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: anaydis-2013
 * Date: 24/10/13
 * Time: 16:30
 */
trait List[+A] {
        def prepend[B >: A](e:B): List[B] = new Cons(e,this)
    def head : A
  def tail : List[A]
}

object Nil extends List[Nothing] {
  override def toString: String = "Nil"
    def head:Nothing = throw new IllegalStateException("Nil.head")
  def tail: Nothing = throw new IllegalStateException("Nil.tail")
}

case class Cons[A](head: A,tail:List[A]) extends List[A]{}

object MainList extends App {
  val foo: List[Int] = Nil.prepend(5).prepend(4).prepend(3)
  println("foo" + foo)
  val bar= foo.tail.prepend(2)
  println("bar " + bar)
}
