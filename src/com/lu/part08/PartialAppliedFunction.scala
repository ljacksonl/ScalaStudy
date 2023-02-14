package com.lu.part08

/**
 * 部分应用函数
 */

object PartialAppliedFunction {
  def main(args: Array[String]): Unit = {
    def add(x: Int, y: Int, z: Int) = x + y + z

    val add1 = (x: Int, y: Int, z: Int) => x + y + z
    println(add1)

    def addX = add(1, _: Int, _: Int)

    println(addX(2, 3))

    def addY = add(_: Int, 2, _: Int)

    def addXAndY = add(1, 2, _: Int)

    //省略全部的参数，下面两个等价。第二个更应用
    def add2 = add(_: Int, _: Int, _: Int)

    //add和_之间一定要加空格
    def add3 = add _


  }
}
