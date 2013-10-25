package anaydis.search

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: anaydis-2013
 * Date: 24/10/13
 * Time: 16:41
 */
case class ImmutableQueue[+A](val in:List[A],val out : List[A]) {  //in was val,but how can i make it empty after reverser if it is val??? same to out

  def enqueue [B >:A](elem:B):ImmutableQueue[B]={new ImmutableQueue[B](in.prepend(elem),out)}

  def dequeue:(A,ImmutableQueue[A])={
    if(out==Nil){
      if(in==Nil) throw new IllegalStateException("Empty Queue!!")
      return (in.reverse.head,new ImmutableQueue[A](Nil,in.reverse.tail))

    }
    (out.head,      new ImmutableQueue[A](this.in,Cons(out.tail.head,out.tail.tail)))



  }

}

object NilQueue extends ImmutableQueue[Nothing](Nil,Nil)

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
