package com.lu.part04

class Student(name: String, age: Int) {
  private var gender: String = _

  def sayHi(): Unit = {
    println(s"大家好，我是$name,$gender 生")
  }
}

object Student {
  //apply方法需要定义在伴生对象中
  def apply(name: String, age: Int): Student = new Student(name, age)

  def main(args: Array[String]): Unit = {
    //直接使用class(参数...)这种方式隐式调用伴生对象的apply方法来创建class Student对象
    val student = Student("Jackson", 18)
    //伴生类和伴生对象可以相互访问私有成员
    student.gender = "男"
    student.sayHi()

  }
}
