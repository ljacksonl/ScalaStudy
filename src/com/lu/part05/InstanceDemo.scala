package com.lu.part05

class Person2

class Student2 extends Person2

object InstanceDemo {
  def main(args: Array[String]): Unit = {
    val p: Person2 = new Student2
    var s: Student2 = null

    //如果对象s是null，那么isInstanceOf会返回false
    println(s.isInstanceOf[Student2])

    if (p.isInstanceOf[Student2]) {
      s = p.asInstanceOf[Student2]
    }

    println(s.isInstanceOf[Student2])

    println(p.getClass == classOf[Person2])
    println(p.getClass == classOf[Student2])

    println("==============================")
    p match {
      case s: Student2 => println("它是Student2类型的对象")
      case _ => println("它啥也不是")
    }
  }
}
