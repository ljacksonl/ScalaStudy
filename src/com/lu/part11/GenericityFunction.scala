package com.lu.part11

/**
 * 泛型函数
 * 卡片售卖机，可以指定卡片的内容，内容可以是String类型或Int类型
 */
object GenericityFunction {
  def getCard[T](content: T): Unit = {
    content match {
      case content: Int => println(s"card:$content is Int")
      case content: String => println(s"card:$content is String")
      case _ => s"card:$content"
    }
  }

  def main(args: Array[String]): Unit = {
    getCard(1001)
  }

}
