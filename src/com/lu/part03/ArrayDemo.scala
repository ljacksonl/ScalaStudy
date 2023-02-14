package com.lu.part03

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer


/**
 * 在scala中，数组分为定长数组和变长数组
 * 定长数组，Array，长度是不变的
 * 变长数组，ArrayBuffer，长度是可变的，它等价于Java中的ArrayList
 * 使用变长数组之前需要导入包scala.collection.mutable.ArrayBuffer
 */
object ArrayDemo {
  def main(args: Array[String]): Unit = {
    println("================定长数组===================")
    //定义长度为10的整型数组，初始值为0
    val nums = new Array[Int](10)
    //定义长度为10的字符串数组，初始值为null
    val strs = new Array[String](10)
    //访问数组元素，索引从0开始，使用（）而不是[]来访问元素
    println(strs(0))

    //省略了关键字new，那么Scala会进行自动类型推断
    val array: Array[Int] = Array(1, 2, 3, 4)
    val array2: Array[Nothing] = Array()
    println(array.length)
    println(array2.length)

    //通过toArray快速定义数组，用于测试
    val numsList: Array[Int] = (1 to 10).toArray
    println("================变长数组===================")
    //定义一个空的Int的变长数组
    //注意：后面要有小括号
    val numsBuffer = ArrayBuffer[Int]()

    //通过+=在尾端添加一个或多个元素
    numsBuffer += 1
    numsBuffer += (2, 3, 4, 5)
    //通过++=在尾端添加集合
    numsBuffer ++= Array(6, 7, 8)
    numsBuffer.foreach(println(_))
    //还可以通过-= --=对变长数组进行删减
    numsBuffer -= 8
    numsBuffer --= Array(6, 7)
    println("=================删减后的变长数组=================")
    numsBuffer.foreach(println(_))

    //使用append追加一个或多个元素
    numsBuffer.append(6)
    numsBuffer.append(2, 3, 4)
    println("=================追加后的变长数组=================")
    numsBuffer.foreach(println(_))

    //在某索引之前插入元素
    numsBuffer.insert(2, 100, 101)
    numsBuffer.insert(2, 105, 106)
    println("=================索引插入后的变长数组=================")
    numsBuffer.foreach(println(_))

    //移除元素
    //trimEnd移除最后的N个元素
    numsBuffer.trimEnd(3)
    //timeStart移除去最开始的N个元素
    numsBuffer.trimStart(2)
    println("=================移除后的变长数组=================")
    numsBuffer.foreach(println(_))

    //通过remove从某索引处移除一个或多个元素
    numsBuffer.remove(3)
    numsBuffer.remove(2, 3)
    println("=================remove后的变长数组=================")
    numsBuffer.foreach(println(_))

    println(numsBuffer.length)

    //toArray,变长数组转换为定长数组
    val numArray: Array[Int] = numsBuffer.toArray
    //toBuffer,定长数组转换为变长数组
    val arrayBuffer: mutable.Buffer[Int] = array.toBuffer
    println(arrayBuffer)
    println("=================数组遍历=================")
    println("=================使用until进行数组遍历=================")
    for (i <- 0 until (array.length)) {
      println(array(i))
    }
    println("=================使用to进行数组遍历=================")
    for (i <- 0 to array.length - 1) {
      println(array(i))
    }
    println("=================使用增强for循环的方式进行数组遍历=================")
    for (elem <- array) println(elem)
    println("=================使用foreach进行数组遍历=================")
    array.foreach(println(_))
  }
}
