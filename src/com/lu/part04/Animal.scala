package com.lu.part04

//伴生抽象类
abstract class Animal {
  def speak
}

class Dog extends Animal {
  override def speak: Unit = {
    println("woof")
  }
}

class Cat extends Animal {
  override def speak: Unit = {
    println("meow")
  }
}

//伴生对象
object Animal {
  //实现apply方法
  def apply(str: String): Animal = {
    if (str == "dog")
      new Dog
    else
      new Cat

  }

  def main(args: Array[String]): Unit = {
    //单例对象objcet不需要用new
    val cat = Animal("cat")
    cat.speak

    val dog = Animal("dog")
    dog.speak
  }
}
