package com.lu.part11

class Stack[T1, T2, T3](name: T1) {
  var age: T2 = _
  var address: T3 = _

  def getInfo: Unit = {
    println(s"$name,$age,$address")
  }
}

object GenericityDemo {
  def main(args: Array[String]): Unit = {
    //创建泛型类的对象
    val stack = new Stack[String, Int, String]("lisi")
    stack.age = 20
    stack.address = "南京"

    stack.getInfo
  }
}
