package com.lu.part09

object ListDemo {
  def main(args: Array[String]): Unit = {
    //Nil表示一个空的列表
    //::操作符表示向集合中添加元素，它是从右往左进行运算的，所有集合对象一定要放在最右边
    val list1 = 1 :: 2 :: 3 :: 4 :: Nil
    val list2 = 6 :: 7 :: 8 :: 9 :: Nil

    //使用:::操作符进行了拼接，不要使用::进行列表的拼接，因为这样拼接的结果不是我们想要的
    val list3 = list1 ::: list2

    println(list3.head) //返回第一个元素
    println(list3.tail) //返回除第一个元素之外的其他元素构成的新列表
    println(list3.init) //返回除最后一个元素之外的其他元素构成的新列表
    println(list3.last) //返回最后一个元素

    val list4 = List(4, 2, 6, 1, 7, 9)
    println(quickSort(list4))
  }

  def quickSort(list: List[Int]): List[Int] = {
    list match {
      case Nil => Nil
      case head :: tail =>
        //通过partition将tail分为两部分
        //小于head的元素放入less列表中，大于head的元素放入greater列表中
        val (less, greater) = tail.partition(_ < head)
        quickSort(less) ::: head :: quickSort(greater)
    }
  }
}
