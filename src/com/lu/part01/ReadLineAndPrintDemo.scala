package com.lu.part01

object ReadLineAndPrintDemo {
  def main(args: Array[String]): Unit = {
    print("请输入您的姓名:")
    val name = scala.io.StdIn.readLine()
    print("请输入您的年龄:")
    val age = scala.io.StdIn.readInt()

    println("您的姓名是:" +name+",年龄:" +age)
    //printf是一个带有C语言风格的格式化字符串函数
    printf("您的姓名是: %s,年龄: %d",name,age)
    println()
    println(s"您的姓名是: $name,年龄是:$age")
  }
}
