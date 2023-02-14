package com.lu.part11

//大师
class Master

//专家
class Professor extends Master

//讲师
class Teacher

//定义协变
//这个是协变，Professor是Master的子类，此时Card[Profesor]也是Card[Master]的子类
class Card[+T]

object ConvarianceDemo {
  def enterMeet(card: Card[Master]): Unit = {
    //只有Card[Master]和它的子类才能进入会场
    println("欢迎进入会场！")
  }

  def main(args: Array[String]): Unit = {
    val masterCard = new Card[Master]
    val professorCard = new Card[Professor]
    val teacherCard = new Card[Teacher]

    enterMeet(masterCard)
    enterMeet(professorCard)
    //    enterMeet(teacherCard)
  }

}
