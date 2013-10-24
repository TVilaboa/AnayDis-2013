package anaydis.search

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: anaydis-2013
 * Date: 24/10/13
 * Time: 16:41
 */
class InmutableQueue[+A](val in:List[A],val out : List[A]) {

  def enqueue [B >:A](elem:B)={}

  def dequeue:(A,InmutableQueue[A])={}

}
