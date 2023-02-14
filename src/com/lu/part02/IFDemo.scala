package com.lu.part02

object IFDemo {
  def main(args: Array[String]): Unit = {
    val num = 20


    //在Scala中if else语句是有返回值的，将if或else中最后一行语句作为返回值
    if(num>20) "jackson" else "lisi"

    //多分支if语句
    if(num<20)
      0
    else if (num==20)
      1
    else
      -1

    //因为if else语句有返回值，那么可以直接将if else语句赋值给一个变量
    //if else语句的返回值，不需要加return关键字
    val name = if (num == 20) "jackson" else "lisi"

    //如果if else语句中，两者的返回值类型不一样
    //此时Scala会自动推断出两者的公共父类型，然后将公共父类型作为表达式的返回值类型
    val name2 = if (num == 20) "tom" else 1

    //如果 if else语句中缺省了else语句块，那么默认的else的值就是Unit
    //Unit用()小括号表示，类似于Java中的void
    val name3 = if (num > 20) "jackson"
    val name4 = if (num > 20) "jackson" else ()
  }
}
