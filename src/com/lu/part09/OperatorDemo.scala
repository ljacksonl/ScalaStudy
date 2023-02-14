package com.lu.part09

/**
 * 集合常用算子
 */

object OperatorDemo {
  def main(args: Array[String]): Unit = {
    //Map&Foreach
    //foreach无返回值（准确说返回void），用于遍历集合
    //map返回集合对象，用于将一个集合转换成另一个集合

    //使用foreach打印数组
    val numlist: List[Int] = (1 to 10).toList
    numlist.foreach(elem => print(elem + " "))
    numlist.foreach(print(_))
    println()
    numlist.foreach(print _)
    println()
    numlist.foreach(print)
    println()
    numlist.map(print(_))

    //使用map对集合进行转换
    val functionToList: List[String] = numlist.filter(_ > 2).map(_.toString)
    println(functionToList)
    println(numlist.map(_ > 2).toBuffer)
    println(numlist.map(_ * 2).toBuffer)

    // Range(20, 0, -2)用给定的步长值设定一个范围，从开始到结束(不包含)。
    //Map(20 -> 0,18 -> 1,16 -> 2,14 -> 3,12 -> 4,10 -> 5,8 -> 6,6 -> 7,4 -> 8,2 ->9)
    val map: Map[Int, Int] = Range(20, 0, -2).zipWithIndex.toMap

    //将map集合中的value值+100
    map.map(elem => (elem._1, elem._2 + 100))
    map.map { case (k, v) => (k, v + 100) }
    // mapValues的表达最简洁
    map.mapValues(_ + 100)


    //flatten & flatMap
    //把多个集合拍扁
    val lis1 = List(List(1, 2), List(3, 4))
    println(lis1.flatten)
    // flatten 把一个字符串的集合展开为一个字符集合，因为字符串本身就是字符的集合
    val lis2 = List("Java", "hadoop")
    println(lis2.flatten)

    //flatter有效处理Option类型Some和None组成的集合，它可以展开Some元素形成一个新的集合，同时去掉None元素
    val x: Array[Option[Int]] = Array(Some(1), None, Some(3), None)
    println(x.flatten.toBuffer)
    val ints: Array[Int] = x.collect { case Some(i) => i }
    println(ints.toBuffer)
    val ints1: Array[Int] = x.filter(!_.isEmpty).map(_.get)
    println(ints1.toBuffer)

    println("=================================")
    //需求：将字符串数组按空格切分，转换为单词数组
    val line = Array("Apache Spark has an advanced DAG execution engine", "Spark offers over 80 high-level operators")
    println(line.map(_.split(" ")).flatten.toBuffer)
    //下面语句等价
    //备注：flatMap = flatten + map 或 flatMap = map + flatten
    println(line.flatMap(_.split(" ")).toBuffer)


    //collect
    //collect通过执行一个并行计算（偏函数），得到一个新的数组对象
    //偏函数概念：并不处理所有可能的输入，而只处理那些能与至少一个 case 语句匹配的输入；
    //Scala中的偏函数是一个trait，其类型为PartialFunction[A,B]，表示：接收一个类型为A的参数，返回一个类型为B的结果。
    //通过下面的偏函数，把chars数组的小写a转换为大写的A
    val fun: PartialFunction[Char, Char] = {
      case 'a' => 'A'
      case x => x
    }

    val chars = Array('a', 'b', 'c')
    val newChars = chars.collect(fun)
    println("newChars:" + newChars.mkString("(", ",", ")"))

    //reduce
    //reduce可以对集合当中的元素进行归约合并操作；
    //还有 reduceLeft 和 reduceRight ，reduceLeft 从左向右归约，reduceRight 从右向左归约；
    val reduce1 = (1 to 10).toList
    println(reduce1.reduce(_ + _))

    /**
     * 为什么这里能出现两个占位符？
     * 我们说过一个占位符代表一个参数，那么两个占位符就代表两个参数。根据这个思路改写等价的语句
     * x类似于buffer，缓存每次操作的数据；y每次操作传递新的集合元素
     */

    println(reduce1.reduce((x, y) => x + y))

    // 利用reduce操作，查找 lst1 中的最大值
    // x类似于buffer，缓存每次操作的数据；y每次操作传递新的集合元素
    println(reduce1.reduce((x, y) => if (x > y) x else y))

    // reduceLeft、reduceRight
    println(reduce1.reduceLeft((x, y) => if (x > y) x else y))
    println(reduce1.reduceRight((x, y) => if (x > y) x else y))
    println("====================================================")

    
    //sorted sortwith & sortby
    //Scala中，对于集合的排序有三种，sorted,sortwith,sortby
    val list = List(1, 9, 3, 8, 5, 6)
    //sorted方法对一个集合进行自然排序
    //sorted源码：def sorted[B >: A](implicit ord: Ordering[B]): Repr
    //源码中有两点值得注意的地方：
    // 1.sorted方法中有个隐式参数ord: Ordering。
    // 2.sorted方法真正排序的逻辑是调用的java.util.Arrays.sort
    val numSort: List[Int] = list.sorted
    println(numSort)
    //sortBy源码：def sortBy[B](f: A => B)(implicit ord: Ordering[B]): Repr =sorted(ord on f)
    //sortBy最后调用的sorted方法
    println(list.sortBy(x => x).reverse)
    //sortWith源码：def sortWith(lt: (A, A) => Boolean): Repr = sorted(OrderingfromLessThan lt)
    println(list.sortWith(_ > _))
  }
}
