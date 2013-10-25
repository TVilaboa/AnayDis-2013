package anaydis.search

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: anaydis-2013
 * Date: 24/10/13
 * Time: 16:41
 */
trait ImmutableQueue[+A]{
      def enqueue [B >:A](elem:B):ImmutableQueue[B]={new ConsImmutableQueue[B](in.::(elem),out)}


  def dequeue:(A,ImmutableQueue[A])={
    if(out==Nil){
      if(in==Nil) throw new IllegalStateException("Empty Queue!!")
      return (in.reverse.head,new ConsImmutableQueue[A](Nil,in.reverse.tail))
    }
    (out.head,      new ConsImmutableQueue[A](this.in,Cons(out.tail.head,out.tail.tail)))
  }

      def in:List[A]
      def out:List[A]
  def size:Int

}

case class ConsImmutableQueue[+A](in:List[A],out : List[A]) extends ImmutableQueue[A] {
       def size=out.size + in.size

}

object NilQueue extends ImmutableQueue[Nothing] {
  override def toString="NilQueue"
  def in=Nil
  def out=Nil
  def size=0
}


object MainQueue extends App{
  var queue=NilQueue.enqueue(1).enqueue(2).enqueue(3).enqueue(4).enqueue(5)
  println(queue)
  var t=queue.dequeue
  queue=t._2
  println(t)
  t=queue.dequeue
  queue=t._2
  println(t)
  queue=queue.enqueue(6)
  println(queue)
}
