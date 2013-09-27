package anaydis.search

import scala.collection.mutable.ArrayBuffer

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: AnayDis-2013
 * Date: 27/09/13
 * Time: 19:45
 */
class ArrayMap[K,V] extends MyMap[K,V]{
  protected val keys = new ArrayBuffer[K]
  protected val values= new ArrayBuffer[V]

  def indexOf(k:K) : Int ={
    var i=0
    while(i<size && keys(i) != k) i+=1
    if(i<size) i else -1
  }

  def size = keys.size

  def get (k:K) :V ={
    if(indexOf(k) != -1) values(-1) else notFound(k)
  }

  def put(k:K,v:V) : Unit ={
    val i=indexOf(k)
    if(i != -1) {
      keys += k
      values += v
    } else values(i)=v
  }

  def contains(k:K): Boolean ={
    if(indexOf(k)!= -1) true else false
  }

  def remove(k:K): Unit ={
    val j=indexOf(k)
    for( i <- j+1 to size-1) {
      keys (i-1)=keys(i)
      values (i-1)=values(i)
    }
    keys remove(keys  size)
    values remove(values  size)

  }


}

