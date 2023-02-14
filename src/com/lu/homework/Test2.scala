package com.lu.homework

import scala.io.StdIn

object Test2 {
  def main(args: Array[String]): Unit = {
    println("-------------------欢迎进入游戏世界-------------------")
    println("************************************")
    println("***********猜拳,开始****************")
    println("************************************")
    //1.选取对战角色
    println("请选择对战角色:(刘备输入[1] 关羽输入[2]  张飞输入[3]")
    var role = StdIn.readInt()
    while (role != 1 && role != 2 && role != 3) {
      println("没有这个选项，请重新输入：")
      role = StdIn.readInt()
    }
    role match {
      case 1 => println("您选择的是刘备")
      case 2 => println("您选择的是关羽")
      case 3 => println("您选择的是张飞")
    }

    println("游戏开始")
    println("请出拳！1.剪刀 2.石头 3.布 n.退出输入")
    var result = ""
    var score = 0
    var flag = true
    while (flag) {
      println("你出的是")
      result = StdIn.readLine()
      if (result != "1" && result != "2" && result != "3") {
        if (result == "n") {
          flag = false
        } else {
          println("您输入有误，请重新输入")
        }
      } else {
        // 猜拳结束算分，平局都加一分，获胜加二分，失败不加分
        var computer = scala.util.Random.nextInt(3) + 1 + ""
        var sco = if (computer == result) 1 else {
          if ((result.toInt - computer.toInt) == -1 || (result.toInt - computer.toInt) == 2) 0 else 2
        }
        println(s"你出的是[${if (result == "1") "剪刀" else if (result == "2") "石头" else "布"}]," +
          s"机器出的是[${if (computer == "1") "剪刀" else if (computer == "2") "石头" else "布"}]," +
          s"结果您是[${if (sco == 2) "胜利" else if (sco == 1) "平局" else "失败"}]")
        score += sco

      }
    }

    //5.游戏结束后显示得分
    println(s"您的分数是[$score]")
    println("bye bye")
  }
}
