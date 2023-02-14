package com.lu.part06

/**
 * 特质可以继承类：特质继承类
 */

class MyUtil {
  def printMessage(msg: String): Unit = {
    println(msg)
  }
}

trait Log extends MyUtil {
  def log(msg: String): Unit = {
    println(msg)
  }
}

//Person3继承了Log特质，Log特质继承了MyUtil类，那么MyUtil类就成为Person3的父类
class Person3(name: String) extends Log {
  //没有重写父类方法，可以不写super
  def sayHello: Unit = {
    log("hello," + name)
    printMessage("hi," + name)
  }
}

object TraitDemoFour {
  def main(args: Array[String]): Unit = {
    val person = new Person3("jackson")
    person.sayHello
  }
}
