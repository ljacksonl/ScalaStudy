package com.lu.part01

/**
 * Scala中的插值器
 */
object InterpolatorDemo {
  def main(args: Array[String]): Unit = {
    //s插值器，可以通过$获取变量和表达式的值
    val subject = "Scala"
    val message = s"Hello,$subject"
    println(message)

    val array: Array[Int] = (1 to 10).toArray
    val str = s"array.length=${array.length}"
    println(str)

    println(s"${10 * 9}")

    //f插值器，用%指定输出格式
    val year = 2000
    val month = 8
    val day = 9
    println(s"$year-$month-$day")
    //以yyyy-MM-dd的方式显示，不足2位用0填充
    println(f"$year-$month%02d-$day%02d")

    //raw插值器，将字符串按原样输出
    println("a\n\tc")
    println(raw"a\n\tc")
    println("""a\n\tc""")
  }
}
