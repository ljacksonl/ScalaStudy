package com.lu.part02

object WhileDemo {
  def main(args: Array[String]): Unit = {
    var num = 1
    //    while (num < 10){
    //      println(s"num = $num")
    //      num += 1
    //    }
    //    do{
    //      println(s"num = $num")
    //      num += 1
    //    }while(num < 10)

    //使用Boolean类型控制变量，终止循环
    //    var flag = true
    //    while (flag){
    //      println(s"num = $num")
    //      num += 1
    //      if (num == 5) flag = false
    //    }

    //使用return关键字终止循环
    //    for (i <- 1 to 10){
    //      if (i == 5) return
    //      println(s"i=$i")
    //    }

    //使用breakable和break终止循环,需要导入scala.util.control.Breaks包
    import scala.util.control.Breaks._
    var res = 0
    breakable {
      for (i <- 1 until (10)) {
        if (i == 5) break()
        res += i
      }
    }
    println(res)

  }
}
