package com.lu.part09

import scala.collection.mutable

object QueueDemo {
  def main(args: Array[String]): Unit = {
    //创建一个可变的队列
    val queue1 = new mutable.Queue[Int]()
    println(queue1)

    //队列当中添加元素
    queue1 += 1
    //队列当中添加List列表
    queue1 ++= List(2, 3, 4)
    println(queue1)

    //按照进入队列的顺序，删除队列当中的元素(弹出队列)
    //返回队列中的第一个元素，并从队列中删除该元素
    val dequeue = queue1.dequeue()
    println(dequeue)
    println(queue1)

    //再向队列中添加元素
    queue1.enqueue(5, 6, 7)
    println(queue1)

    //获取队列中添加元素
    println(queue1.head)
    println(queue1.last)

  }
}
