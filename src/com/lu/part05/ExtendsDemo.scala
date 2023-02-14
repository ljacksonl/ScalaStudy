package com.lu.part05

class Person(name: String, age: Int) {
  println("这是父类Person！")
}

class Student(name: String, age: Int, var stuNo: String) extends Person(name, age) {
  println("这是子类Studnet！")
}

object ExtendsDemo {
  def main(args: Array[String]): Unit = {
    val student = new Student("jackson", 30, "1001")
    student.stuNo = "1002"
    println(student.stuNo)
  }
}
