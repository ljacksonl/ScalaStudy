package com.lu.part04

//需要导入下面的包

import scala.beans.BeanProperty

class Teacher {
  @BeanProperty var name: String = _
}

object BeanDemo {
  def main(args: Array[String]): Unit = {
    val teacher = new Teacher
    teacher.name = "Jackson"
    teacher.name_=("tom")
    println(teacher.name)

    //BeanProperty生成的setName方法
    teacher.setName("lisi")
    //BeanProperty生成的getName方法
    println(teacher.getName)
  }
}
