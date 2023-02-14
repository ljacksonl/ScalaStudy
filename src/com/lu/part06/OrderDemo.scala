package com.lu.part06

import scala.util.Sorting

/**
 * Ordered和Ordering
 *
 * @param tag
 * @param score
 */

case class Project(tag: String, score: Int) extends Ordered[Project] {
  override def compare(that: Project): Int = {
    tag.compareTo(that.tag)
  }
}

object OrderDemo {
  def main(args: Array[String]): Unit = {
    //重写compareTo()方法后，其对象自身就具有了可比较
    val list = List(Project("hadoop", 40), Project("flink", 90), Project("spark", 80), Project("hive", 60))
    val list1 = List(1, 5, 6, 4)
    println(list.sorted)
    println(list1.sorted)

    //(Ordering.by[(String, Int, Int), Int](_._2))表示从Tuple3转到Int型，根据Tuple3中的第二个元素进行排序
    //Ordering提供一个第三方比较器，用于比较两个对象。
    val pairs = Array(("a", 7, 2), ("b", 9, 1), ("c", 8, 3))
    Sorting.quickSort(pairs)(Ordering.by[(String, Int, Int), Int](_._2))
    println(pairs.toBuffer)

  }
}
