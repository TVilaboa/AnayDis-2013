package anaydis.tries.immutable

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: anaydis-2013
 * Date: 01/11/13
 * Time: 15:39
 */
import anaydis.immutable.search.MyMap


class TST[V] extends MyMap[String, V] {

  case class Node(chr: Char,
                  var value: Option[V] = None,
                  var left: Node = null,
                  var center: Node = null,
                  var right: Node = null)

  var size = 0
  var head: Node = null

  def contains(k: String): Boolean = {
    validateKey(k)
    val n = find(head, k)
    n != null && n.value.isDefined
  }

  def get(k: String): V = {
    validateKey(k)
    val n = find(head, k)
    if (n == null || n.value.isEmpty) notFound(k)
    n.value.get
  }

  def put(k: String, v: V):TST[V] = {
    validateKey(k);
    val tst=new TST[V]()
    tst.head.copy()
      tst.head=tst.doPut(k,v,tst.head)
    return tst

  }

  def validateKey(k: String): Unit = if (k == null || k.length == 0) throw new IllegalArgumentException("Empty String")

  def find(n: Node, k: String): Node =
    if (n == null) null
    else {
      val l = k.charAt(0)
      if (l == n.chr) if (k.length == 1) n else find(n.center, k.substring(1))
      else if (l < n.chr) find(n.left, k)
      else find(n.right, k)
    }

  def doPut(k: String, v: V, n: Node = null): Node = {
    val l = k.charAt(0)
    if (n != null) {
      if (l < n.chr) n.left = doPut(k, v, n.left)
      else if (l > n.chr) n.right = doPut(k, v, n.right)
      else if (k.length > 1) n.center = doPut(k.substring(1), v, n.center)
      else {
        if (n.value.isEmpty) size += 1
        n.value = Some(v)
      }
      n
    }
    else if (k.length > 1) Node(l, center = doPut(k.substring(1), v))
    else {
      size += 1
      Node(l, Some(v))
    }
  }

  def remove(k: String):TST[V] = {
    validateKey(k);
    val tst=new TST[V]()
    tst.head.copy()
    tst.head=tst.doRemove(k,tst.head)
    return tst
  }

  def doRemove(k: String, n: Node): Node =
    if (n == null) null
    else {
      val l = k.charAt(0)
      if (l < n.chr) n.left = doRemove(k, n.left)
      else if (l > n.chr) n.right = doRemove(k, n.right)
      else if (k.length > 1) n.center = doRemove(k.substring(1), n.center)
      else if (n.value.isDefined) {
        size -= 1
        n.value = None
      }
      pack(n)
    }

  def pack(n: Node): Node = {
    if (n.center != null || n.value != None) n
    else if (n.right != null) {
      n.right.left = n.left
      n.right
    }
    else n.left
  }
}

object TSTMain extends App {
  val tst = new TST[Int]()
  tst.put("AB", 10)
  tst.put("ABBA", 1001)
  tst.put("CABA", 2101)

  println(tst.contains("AB"))
  println(tst.contains("CAB"))

  println(tst.get("AB"))
  println(tst.get("ABBA"))
  println(tst.get("CABA"))

  tst.remove("AB")
  println(tst.contains("AB"))

}

