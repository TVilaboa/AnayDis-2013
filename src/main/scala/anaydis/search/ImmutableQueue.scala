package anaydis.search

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: anaydis-2013
 * Date: 24/10/13
 * Time: 16:41
 */
class ImmutableQueue[+A](val in:List[A]=Nil,val out : List[A]=Nil) {  //in was val,but how can i make it empty after reverser if it is val??? same to out

  def enqueue [B >:A](elem:B):ImmutableQueue[B]={new ImmutableQueue(in.prepend(elem),out)}

  def dequeue:(A,ImmutableQueue[A])={
    if(out.head==null){
      if(in.head==null) throw new IllegalStateException("Empty Queue!!")
      out=in.reverse
      in=Nil
    }
    (out.head,      new ImmutableQueue(this.in,Cons(out.tail.head,out.tail.tail)))



  }

}
