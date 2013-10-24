package anaydis.search

import scala.collection.immutable.Stack
import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: anaydis-2013
 * Date: 10/10/13
 * Time: 14:54
 */
trait AbstractTreeMap[K,V] extends MyMap[K,V] {

  case class Node(key:K,var value:V,var left:Node =null,var right:Node =null,var size:Int=1){
    override def toString:String = {
          s"{k:$key, v:$value, l:$left, r:$right}"
    }


    def updateSize= size=1+nodeSize(left) + nodeSize(right)

    def nodeSize(n:Node)= if(n!=null)n.size else 0

    def nth(idx : Int):Node ={
      if(this.size<=idx) throw new NoSuchElementException(s"Index $idx does not exist.")
      /*
      val list=new ArrayBuffer[Node]
       var stack=new Stack[Node]
       var n=head.left
      stack=stack.push(head)
      while(n!=null || stack.size !=0){
        if(n!=null){
          stack=stack.push(n)
          n=n.left
        } else{
          n=stack.head
        stack=stack.pop
        list+=n
        n=n.right
        }
      }
      list(idx)     */
      range(idx,idx)(0)

    }

    def range(from:Int,to:Int):mutable.LinkedList[Node]={
      var list = mutable.LinkedList[Node]()
      var result = mutable.LinkedList[Node]()
      if(this.size<from) throw new NoSuchElementException(s"Index $from does not exist.")
      var stack=new Stack[Node]
      var n=head.left
      stack=stack.push(head)
      while(n!=null || stack.size !=0){
        if(n!=null){
          stack=stack.push(n)
          n=n.left
        } else{
          n=stack.head
          stack=stack.pop
          list=list.:+(n)
          n=n.right
        }
      }
      for(i <- from to to ){
          result=result.:+(list(i))
      }
      result
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
  def nth(idx:Int):Node=head.nth(idx)
}
