package com.lu.part08

/**
 * 函数的特殊写法
 * 函数与方法的区别 val 定义的是函数 使用 def 定义的是方法
 * 写程序的时候是定义方法、还是定义函数？
 * 一般情况下，不对二者做区分，认为都是函数，更多的时候使用def定义函数。
 */

object FunctionDemo {
  def main(args: Array[String]): Unit = {

    println(add(1, 2))
    println(add2(1, 2))

    //方法名是方法调用
    println(m1)
    //函数名代表函数对象
    println(f1)
    // 这才代表函数调用
    println(f1())

    //在需要函数的地方，如果传递一个方法，会自动把方法转换为函数
    val list = (1 to 10).toList

    def double(x: Int) = x * x

    //list.map做了什么
    //1. 将 list 这个集合的元素 依次遍历
    //2. 将各个元素传递给 double 函数(方法) => 新 Int
    //3. 将得到新 Int ,放入到一个新的集合并返回
    println(list.map(double(_)))


  }

  //函数为头等公民，函数可以写成变量
  //  def add(x: Int, y: Int): Int = {
  //    x + y
  //  }

  //写成变量
  //  val add: (Int, Int) => Int = (x, y) => x + y

  //因为在Scala中有自动类型推断。，所以可以省略输入变量的类型
  val add = (x: Int, y: Int) => (x + y)


  //Scala 中的方法与 Java 的类似，方法是组成类的一部分
  //Scala 中的函数则是一个完整的对象。Scala 中用 22 个特质(从 Function1 到 Function22)抽象出了函数的概念
  // Function2是特质，不能直接new
  // new Function2[Int,Int,Int]{ ... } 其实是定义并实例化一个实现了 Function2 特质的类的对象
  val add2 = new Function2[Int, Int, Int] {
    def apply(x: Int, y: Int): Int = {
      x + y
    }
  }

  //方法不能作为单独的表达式而存在，而函数可以；
  //函数必须要有参数列表，而方法可以没有参数列表；
  //方法名是方法调用，而函数名只是代表函数对象本身；
  //在需要函数的地方，如果传递一个方法，会自动把方法转换为函数
  val f1 = () => "This is lagou edu"

  def m1 = "This is lagou edu"


}
