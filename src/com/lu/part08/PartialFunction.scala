package com.lu.part08

/**
 * 偏函数
 * Scala中的偏函数(Partial Function)是一个trait，其类型为PartialFunction[A,B]，表示：接收一个类型为A的参
 * 数，返回一个类型为B的结果。
 */

object PartialFunction {
  def main(args: Array[String]): Unit = {

    //需求：过滤List中的String类型的元素，并将Int类型的元素加1。
    //[Any,Int],偏函数接收的数据类型是Any,返回的数据类型是Int
    val partialFunction = new PartialFunction[Any, Int] {
      override def isDefinedAt(x: Any): Boolean = {
        //如果返回true,那么就调用apply方法;如果返回的是false，就过滤掉
        println(x.toString)
        x.isInstanceOf[Int]
      }

      //
      override def apply(v1: Any): Int = {
        println(v1.toString)
        v1.asInstanceOf[Int] + 1
      }
    }
    val list = List(10, "hadoop", 20, "spark", 30, "flink")
    list.collect(partialFunction).foreach(println(_))
    val a = 10.toString

  }
}
