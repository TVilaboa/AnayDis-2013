package anaydis.search

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: anaydis-2013
 * Date: 10/10/13
 * Time: 15:42
 */
object Main extends App{

  val tree=new TreeMap[Int,String]
  tree.put(5,"Asd5")
  tree.put(1,"Asd1")
  tree.put(2,"Asd2")
  tree.put(3,"Asd3")
  tree.put(4,"Asd4")
  println(tree)
  println(tree.size)
  println(tree.head.nth(4))
  println(tree.head.nth(5))
  println(tree.head.nth(6))
}
