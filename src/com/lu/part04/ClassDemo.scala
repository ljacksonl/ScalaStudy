package com.lu.part04

//在Scala中，类都有一个无参构造器
class Person {
  //声明字段必须进行初始化，Scala编译器会根据初始化值的数据类型自动推断字段的类型，字段类型可以省略
  var name = "lagou"

  //_表示一个占位符，编译器会根据变量的数据类型赋予相应的初始值
  //注意：使用占位符_进行赋初始值时，数据类型必须指定
  //default:null
  var nickName: String = _
  //default:0
  var numInt: Int = _
  //default:0.0
  var numDouble: Double = _
  //default:false
  var boolean: Boolean = _

  //val修饰的变量不能使用占位符
  //  val test:Int = _

  val num = 30
  var age = 20

  //如果赋值为null，就需要添加数据类型，如果不添加数据类型，那么就会认为时Null类型
  var address: String = null
  //类中的私有字段，有私有的getter和setter方法
  //可以在类的内部访问，也可以被其伴生对象访问
  private var hobby = "旅游"

  //对象的私有字段，访问权限更小，只能在当前类中访问
  private[this] val cardInfo = "10010"

  //自定义方法
  def hello(message: String): Unit = {
    //只能在当前类中访问cardInfo
    println(s"$message,$cardInfo")
  }

  //自定义方法实现两数求和
  def addNum(num1: Int, num2: Int): Int = {
    num1 + num2
  }
}

object ClassDemo {
  def main(args: Array[String]): Unit = {
    //使用类的无参构造器来创建对象
    //小括号也是可以省略的
    val person = new Person()
    println(s"${person.nickName}    ${person.numInt}   ${person.numDouble}    ${person.boolean}")

    //给类的属性赋值
    person.age = 50
    //注意：如果使用对象的属性加上 _= 给var修饰的属性进行赋值，其实就是调用age_=这个setter方法
    //就是调用了一个setter方法，其方法名称叫age_=
    person.age_=(20)

    //调用类的属性，其实就是调用它的getter方法
    println(person.age)

    //也可调用类中的方法
    person.hello("hello")
    println(person.addNum(10, 20))


  }
}
