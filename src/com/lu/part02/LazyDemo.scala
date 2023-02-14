package com.lu.part02

/**
 * 在Scala中提供了lazy的特性
 * 如果将一个变量声明为lazy，那么只有第一次使用这个变量时，变量对应的表达式才会发生计算
 * 这种特性对于特别耗时的计算操作特别有用
 * 比如：初始化开销较大的场景，对文件进行IO、对网络IO的操作等
 */
object LazyDemo {
  def main(args: Array[String]): Unit = {
    //使用lazy关键字之后，即使文件不存在，也不会报错
    //只有第一次使用变量时才会报错 (var不能声明为lazy)
    lazy val file1 = scala.io.Source.fromFile("src/test.scala")
    println("OK")
    file1.getLines().size
  }
}
