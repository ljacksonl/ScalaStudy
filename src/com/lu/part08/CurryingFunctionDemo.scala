package com.lu.part08

/**
 * 柯里化函数
 */
object CurryingFunctionDemo {
  def main(args: Array[String]): Unit = {
    // 使用普通的方式
    def add1(x: Int, y: Int) = x + y

    //外部函数,也称自由变量
    var more = 10
    //闭包
    val addMore2 = (x: Int) => x + more

    var y = 5

    //使用闭包的方式，将其中一个函数作为返回值
    //y=x+y
    def add2(x: Int) = (y: Int) => x + y

    //使用柯里化的方式
    def add3(x: Int)(y: Int) = x + y

    println(add1(1, 2))

    println(add2(2))
    //add(1)(2)实际上第一次调用使用参数x，返回一个函数类型的值，第二次使用参数y调用这个函数类型的值。
    //实际上最先演变成这样的函数：def add(x: Int) = (y:Int) => x + y
    //在这个函数中，接收一个x为参数，返回一个匿名函数，这个匿名函数的定义是：接收一个Int型参数y，函数体是x+y。
    println(add3(1)(2))
  }
}
