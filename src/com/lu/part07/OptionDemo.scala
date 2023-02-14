package com.lu.part07

/**
 * Option选项类型用来表示一个值是可选的，有值或无值。
 */

object OptionDemo {
  val grades = Map("jackson" -> 90, "tom" -> 80, "JAY" -> 100)

  def getGrade(name: String): Unit = {
    val grade: Option[Int] = grades.get(name)

    grade match {
      case Some(grade) => println("成绩是:" + grade)
      case None => println("没有此人成绩！")
    }
  }

  val age = Map("jackson" -> 22, "tom" -> 18, "JAY" -> 19)

  def getage(name: String): Unit = {
    val ageForName = age.get("name")

    ageForName match {
      case Some(ageForName) => println("年龄是：" + ageForName)
      case None => println("没有此人")
    }
  }

  def main(args: Array[String]): Unit = {
    getGrade("jackson")
    getGrade("lu")
  }

}
