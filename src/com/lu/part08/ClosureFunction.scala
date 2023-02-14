package com.lu.part08

/**
 * 闭包
 * 顾名思义：把变量关在关在了函数里面
 * 把函数外部的一个自由变量关闭进来
 * 何为闭包？需满足下面三个条件：
 * 1、闭包是一个函数
 * 2、函数必须要有返回值
 * 3、返回值依赖声明在函数外部的一个或多个变量，用Java的话说，就是返回值和定义的全局变量有关
 */
object ClosureFunction {
  def main(args: Array[String]): Unit = {
    //普通函数
    val addMore1 = (x: Int) => x + 10
    //外部函数,也称自由变量
    var more = 10
    //闭包
    val addMore2 = (x: Int) => x + more

    println(addMore1(5))
    // 每次addMore2函数被调用时，都会去捕获外部的自由变量
    more = 100
    println(addMore2(5))

  }
}
