package anaydis.search

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: anaydis-2013
 * Date: 10/10/13
 * Time: 14:54
 */
trait AbstractTreeMap[K,V] extends MyMap[K,V] {

  case class Node(key:K,var value:V,var left:Node =null,var right:Node =null){
    override def toString:String = {
          s"{k:$key, v:$value, l:$left, r:$right}"
    }

    def size:Int ={
      var size=1
      if(left!=null) size +=left.size; if (right!=null) size+=right.size
      size
    }
  }


  protected var head:Node = null

  def contains(k:K):Boolean = find(head,k) ==null

  def get(k:K):V = {
    val n=find(head,k)
    if(n==null) notFound (k)
    n.value
  }

  def newLeaf(k:K,v:V)= {Node(k,v)}

  def put(k:K,v:V) = head =doPut(head,k,v)
  def remove(k:K) = head =doRemove(head,k)

  def find(n:Node,k:K):Node
  def doPut(m:Node,k:K,v:V):Node
  def doRemove(n:Node,k:K):Node

  def firstNode(n:Node):Node = if(n==null || n.left==null) n else firstNode(n.left)


  override def toString: String = {
         if(head==null) "Empty" else head.toString
  }


  def size = if(head==null) 0 else head.size
}
