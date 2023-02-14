package com.lu.homework

/**
 * 第一题、百元喝酒
 * 作业要求：
 * 每瓶啤酒2元，3个空酒瓶或者5个瓶盖可换1瓶啤酒。
 * 100元最多可喝多少瓶啤酒？（不允许借啤酒）思路：利用递归算法，一次性买完，然后递归算出瓶盖和空瓶能换的啤酒数
 */
object Test1 {
  def main(args: Array[String]): Unit = {
    val sum = (money: Int) => {
      val num = money / 2
      num + beer(num, num, 0)
    }

    println("一共可以喝" + sum(100))
  }


  def beer(cap: Int, empty: Int, bottle: Int): Int = {
    if (empty < 3 && cap < 5)
      bottle
    else {
      //空瓶可换的啤酒数
      val a = empty / 3
      //空瓶换完剩下的空瓶数
      val b = empty % 3
      //瓶盖可换的啤酒数
      val c = cap / 5
      //瓶盖换完剩下的瓶盖数
      val d = cap % 5
      println(s"瓶盖cap=${a + c + d},空瓶empty=${a + b + c},啤酒瓶bottle=${a + c + bottle}")
      beer(a + c + d, a + b + c, a + c + bottle)
    }
  }
}
