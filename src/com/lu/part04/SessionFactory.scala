package com.lu.part04

class Session {
  def hello(first: Int): Int = {
    println(first)
    first
  }
}

object SessionFactory {
  //主构造代码块只能执行一次，因为它是单例的
  val session = new Session

  //但是方法可以执行多次
  def getSession(): Session = {
    session
  }

  def main(args: Array[String]): Unit = {
    for (x <- 1 to 10) {
      //通过直接调用，产生的对象都是单例的
      val session = SessionFactory.getSession()
      println(session)
    }
  }
}
