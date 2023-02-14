package com.lu.part09

import java.util

import scala.collection.mutable

object JavaConvertersDemo {
  def main(args: Array[String]): Unit = {

    import scala.collection.JavaConverters._
    val list: util.List[Int] = List(1, 2, 3, 4).asJava
    val buffer: mutable.Buffer[Int] = list.asScala
  }
}
