package com.lu.part10

class SpecialPerson(var name: String)

class Older(var name: String)

class Student(var name: String)

class Worker(var name: String)

object ImplicitDemoTwo {
  def buySpecialTickWindow(person: SpecialPerson): Unit = {
    if (person != null) {
      println(person.name + "购买了一张特殊票")
    } else {
      println("你不是特殊人群，不能在此购票！")
    }
  }

  //定义一个隐式函数
  implicit def any2SpecialPerson(any: Any): SpecialPerson = {
    any match {
      case any: Older => new SpecialPerson(any.asInstanceOf[Older].name)
      case any: Student => new SpecialPerson(any.asInstanceOf[Student].name)
      case _ => null
    }
  }


  def main(args: Array[String]): Unit = {
    val stu = new Student("jacky")
    val older = new Older("lisi")
    val worker = new Worker("jackson")

    buySpecialTickWindow(stu)
    buySpecialTickWindow(older)
    buySpecialTickWindow(worker)
  }

}
