package com.lu.part09

object SetDemo {
  def main(args: Array[String]): Unit = {
    //创建一个Set集合
    val set = Set(1, 2, 3, 4, 5, 6)
    set.drop(1)
    println(set)

    //创建一个可变的Set
    import scala.collection.mutable.Set
    val mutableSet = Set(3, 4, 5)

    //对可变的Set进行增加元素、删除元素的操作
    mutableSet.add(7)
    println(mutableSet)

    mutableSet.remove(7)
    println(mutableSet)

    //通过使用+= -=进行增加、删除元素的操作
    mutableSet += 8
    mutableSet -= 3
    println(mutableSet)

    //对Set集合进行交集的操作(& intersect)
    //List也可以
    println(Set(1, 2, 3) & Set(2, 3, 4))
    println(Set(1, 2, 3).intersect(Set(2, 3, 4)))

    //对Set集合进行并集的操作(++ | union)
    println(Set(1, 2, 3) ++ Set(2, 3, 4))
    println(Set(1, 2, 3) | Set(2, 3, 4))
    println(Set(1, 2, 3).union(Set(2, 3, 4)))

    //对Set集合进行差集的操作(-- &~ diff)
    //对第一个集合操作
    println(Set(1, 2, 3) -- Set(2, 3, 4))
    println(Set(2, 3, 4) &~ Set(1, 2, 3))
    println(Set(1, 2, 3).diff(Set(2, 3, 4)))


  }
}
