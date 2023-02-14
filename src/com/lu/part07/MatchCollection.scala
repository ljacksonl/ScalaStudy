package com.lu.part07

object MatchCollection {
  def main(args: Array[String]): Unit = {
    val array = Array(1, 3, 5)
    //对Array数组进行模式匹配，分别匹配：
    //带有指定个数元素的数组、带有指定元素的数组、以某元素开头的数组
    array match {
      case Array(1, x, y) => println(x + "  " + y)
      case Array(1) => println("only 1...")
      case Array(1, _*) => println("以1开头的数组")
      case _ => println("something else...")
    }

    val list = List(2)
    //对List列表进行模式匹配，分别匹配：
    //带有指定个数元素的列表、带有指定元素的列表、以某元素开头的列表
    //Nil表示一个空列表，::起到一个连接的作用，表示将元素添加到某列表中
    //tail表示返回除第一个元素之外的其他元素的列表
    list match {
      case x :: y :: Nil => println(s"$x  $y")
      case 2 :: Nil => println("only 2...")
      case 1 :: tail => println("以1开头的列表")
      case _ => println("something else...")
    }

    val tuple = (1, 3, 5)
    tuple match {
      //以1开头，包含三个元素的元组
      case (1, x, y) => println(s"$x   $y")
      //以5结尾，包含三个元素的元组
      case (a, z, 5) => println(a)
      case _ => println("else")
    }

  }
}
