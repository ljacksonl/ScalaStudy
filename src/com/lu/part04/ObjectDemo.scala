package com.lu.part04

//创建单例对象不需要使用new关键字  像Java的静态字段和静态方法
//object中只有无参构造器
//主构造代码块只能执行一次，因为它是单例的
object Object {
  println("这是单例对象的代码！")

  def printInfo: Unit = {
    println("Hello Scala Object!")
  }
}

object ObjectDemo {
  def main(args: Array[String]): Unit = {
    //    val object1 = Object
    //    val object2 = Object

    Object.printInfo
    Object.printInfo
  }
}
