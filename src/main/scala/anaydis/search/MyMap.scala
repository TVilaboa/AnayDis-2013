package anaydis.search

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: AnayDis-2013
 * Date: 27/09/13
 * Time: 19:45
 */
trait MyMap[K,V] {
  def get(k:K):V
  def put (k:K,v:V):Unit
  def size:Int
  def isEmpty =size ==0
  def contains(k:K):Boolean
  def notFound(k:K)=throw new NoSuchElementException(s"Key $k not founded")

}
