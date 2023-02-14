package com.lu.part09

import scala.collection.mutable

object MapDemo {
  def main(args: Array[String]): Unit = {
    //使用两种方式定义Mao
    val map1 = Map("a" -> 1, "b" -> 2)
    val map2 = Map(("a", 1), ("b", 2))

    map1.keys.foreach(println(_))
    map1.values.foreach(println(_))

    //如果访问不存在的key值时，会抛出异常
    //println(map1("c"))

    //也可以使用get方法，来获取与Key值相对应的Value值
    //get方法会返回一个Option对象，所有那么要是Some（有值），要么是None(无值)
    val num: Option[Int] = map1.get("a")
    num match {
      case None => println("None")
      case Some(x) => println(x)
    }
    println("=====================================")
    //获得Key值所对应的Value值，如果键Key不存在，那么就返回指定的默认值
    val num2: Int = map1.getOrElse("d", 0)
    println(num2)

    //创建一个可变的Map
    val map3 = scala.collection.mutable.Map("a" -> 1, "b" -> 2)
    println(map3)
    map3("a") = 10
    println(map3)

    //增加一个元素
    map3("c") = 10
    println(map3)

    //通过+=添加元素
    map3 += ("d" -> 4, "e" -> 5)
    println(map3)
    map3 -= "d"
    println(map3)

    //将Key和Vaule的值互换
    //注意：在Map中，键的值是唯一的 所以当Value的值相等时，会只选取一个
    val kv: mutable.Map[Int, String] = for ((k, v) <- map3) yield (v, k)
    println(kv)
    //推荐使用下面的方式将key和value的值互换
    map3.map(x => (x._2, x._1)).foreach(println(_))

    //通过拉链操作创建Map
    val a = Array(1, 2, 3)
    val b = Array("a", "b", "c")
    val c: Array[(Int, String)] = a.zip(b)
    val d: Map[Int, String] = c.toMap
    println(d)

  }
}
