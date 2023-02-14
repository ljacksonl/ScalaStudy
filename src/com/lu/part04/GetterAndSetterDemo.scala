package com.lu.part04

class Dog {

  //自定义变量的getter和setter方法需要遵循以下原则：
  //1.字段属性名以"_"作为前缀，如：_leg
  private var _leg = 0

  //2.getter方法定义为：def leg = _leg
  //自定义getter方法
  def leg: Int = _leg

  //3.setter方法定义为：def leg_=(newLeg:Int)
  //自定义的setter方法
  def leg_=(newLeg: Int): Unit = {
    _leg = newLeg
  }
}

object GetterAndSetterDemo {

  def main(args: Array[String]): Unit = {
    val dog = new Dog
    //调用自定义的setter方法
    dog.leg_=(4)
    println(dog.leg)
  }
}
