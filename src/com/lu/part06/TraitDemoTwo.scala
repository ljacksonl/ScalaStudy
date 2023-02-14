package com.lu.part06

trait People {
  val name: String
  val age = 30

  def eat: Unit = {
    println("Eating.....")
  }
}

trait Worker {
  val age = 25

  def work: Unit = {
    println("Working.....")
  }
}

class Student extends Worker with People {
  override val name: String = "lisi"

  //由于Worker和People都有age字段，所以当Student类继承这两个特质时，需要重写age字段
  //并且要使用override关键字，否则会报错
  //此时的override关键字不能省略
  override val age = 20

}

object TraitDemoTwo {
  def main(args: Array[String]): Unit = {
    val stu = new Student
    stu.eat
    stu.work
    println(s"姓名:${stu.name}, 年龄：${stu.age}")
  }
}
