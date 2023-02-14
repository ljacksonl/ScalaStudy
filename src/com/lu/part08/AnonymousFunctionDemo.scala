package com.lu.part08

/**
 * 匿名函数与占位符
 */

object AnonymousFunctionDemo {
  def main(args: Array[String]): Unit = {
    val f1 = (x: Int) => x * x
    println(f1(5))

    //匿名函数作为参数传递给另一个函数
    val list = (1 to 10).toList
    println(list.map((x: Int) => x * x))
    //而且 x一定是Int类型，这里可以省略
    println(list.map((x) => x * x))
    //只有一个参数，小括号可以省略
    println(list.map(x => x * x))
    //有的时候，我们可以使用占位符简化函数字面量
    println(list.map(_ + 1))
    //实现将List中的每个元素*2 + 1，但是我们不能这么写
    //println(list.map(_ + _ + 1))
    println(list.map(2 * _ + 1))
    //而要是想将list列表中的元素相加求和，可以通过reduce这个高阶函数
    println(list.reduce((x, y) => (x + y)))

    //多个下划线指代多个参数，而不是单个参数的重复运用
    // 使用占位符简化函数字面量
    println(list.reduce(_ + _))

  }
}
