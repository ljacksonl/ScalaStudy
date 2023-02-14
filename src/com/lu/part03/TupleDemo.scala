package com.lu.part03

/**
 * Tuple元组，可以存放不同数据类型的元素
 * 元组的索引从1开始，不是从0开始
 * 元组在Scala中应用非常广泛，在Spark的源码中会见到很多元组。
 * 在Scala中，已经事先定义好了22个Tuple,从Tuple1~~Tuple22
 * 在Tuple22中，最多只能有22个元素
 */
object TupleDemo {
  def main(args: Array[String]): Unit = {
    //定义一个元组
    val tuple = (1, 2.5, "Spark", 'a', true)
    val tuple1 = Array(1, 2.5, "Spark", 'a', true)
    val tuple2 = (1, 1.2, "scala", 'b')
    println(tuple == tuple2)
    println(tuple1.toBuffer)

    println(tuple._3)
    println(tuple1(2))

    //从元组中接收数据
    val (t1, t2, t3, t4), t5 = tuple2
    println(s"$t1   $t2   $t3   $t4   ")

    val (b1, _, b2, _), b5 = tuple2
    println(s"$b2   $b2  $b5")

    //遍历元组
    for (t <- tuple.productIterator) {
      println(t)
    }
    println("========================")
    tuple.productIterator.foreach(println(_))
  }
}
