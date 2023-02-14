package com.lu.part06

trait HelloTrait {
  def sayHello
}

trait MakeFriendTrait {
  def makeFriend
}

class Person(name: String) extends HelloTrait with MakeFriendTrait {
  override def sayHello: Unit = {
    println(s"Hello,My name is $name")
  }

  override def makeFriend: Unit = {
    println(s"Hello,$name")
  }
}

object TraitDemo {
  def main(args: Array[String]): Unit = {
    val person = new Person("jackson")
    person.sayHello
    person.makeFriend
  }
}
