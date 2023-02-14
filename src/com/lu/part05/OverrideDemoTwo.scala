package com.lu.part05

//如果父类是抽象类，则override关键字可以不加
//抽象的Person类
abstract class Person(name: String, age: Int) {
  def walk(): Unit
}

//Student继承抽象Person类
class Student1(name: String, age: Int, var studentNo: String) extends Person(name, age) {
  //重写抽象类的walk方法，可以不加override关键字
  def walk(): Unit = {
    println("walk like a elegant swan")
  }
}

object OverrideDemoTwo {
  def main(args: Array[String]): Unit = {
    val stu = new Student1("john", 18, "1001")
    stu.walk()
  }
}
