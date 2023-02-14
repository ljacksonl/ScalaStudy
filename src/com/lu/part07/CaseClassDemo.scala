package com.lu.part07

class Amount

//样例类中主构造器的参数默认用val修饰
//样例类中自动生成apply方法
case class Dollar(value: Double) extends Amount

case class Currency(value: Double, unit: String) extends Amount

//样例对象
case object Nothing extends Amount

object CaseClassDemo {
  def main(args: Array[String]): Unit = {
    judgeIdentity(Dollar(10.0))
    judgeIdentity(Currency(20.0, "-100"))
    judgeIdentity(Nothing)
  }

  def judgeIdentity(amt: Amount): Unit = {
    amt match {
      case Dollar(value) => println(s"$value")
      case Currency(value, unit) => println(s"$value   $unit")
      case Nothing => println("nothing")
    }
  }
}
