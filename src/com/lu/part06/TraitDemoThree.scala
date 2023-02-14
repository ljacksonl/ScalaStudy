package com.lu.part06

/**
 * 特质构造顺序
 */

class Person2 {
  println("Person's Constructor")
}

trait Logger {
  println("Logger's Constructor")
}

trait MyLogger extends Logger {
  println("MyLogger's Constructor")
}

trait TimeLogger extends Logger {
  println("TimeLogger's Constructor")
}

//如果一个类继承了父类，也继承了特质，那么要先写父类，再写特质
//extends 父类 with 特质1 with 特质2....
class Student1 extends Person2 with MyLogger with TimeLogger {
  println("Student's Constructor")
}


object TraitDemoThree {
  def main(args: Array[String]): Unit = {
    val stu = new Student1

  }
}
