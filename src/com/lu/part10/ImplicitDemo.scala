package com.lu.part10

/**
 * 隐式转换
 * 首先得有一个隐式转换函数
 * 使用到隐式转换函数接收的参数类型定义的对象
 * Scala自动传入隐式转换函数，并完成对象的类型转换
 * 隐式转换需要使用implicit关键字。
 * implicit关键字只能用来修饰方法、变量、参数
 */

class Num {}

class RichNum(num: Num) {
  def rich(): Unit = {
    println("Hello Implicit!")
  }
}

object ImplicitDemo {
  //通常建议将隐式转换函数的名称命名为“one2one”的形式
  //定义一个名称为num2Richnum的隐式函数
  implicit def num2Richnum(num: Num): RichNum = {
    new RichNum(num)
  }

  //导入隐式函数
  implicit def int2String(int: Int): String = {
    int.toString
  }

  def main(args: Array[String]): Unit = {
    val num = new Num
    // num对象并没有rich方法，编译器会查找当前范围内是否有可转换的函数
    // 然后将其转换为RichNum类型，这样就可以访问rich方法了
    num.rich()
    println(20.length)
  }
}
