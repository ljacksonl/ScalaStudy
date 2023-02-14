package com.lu.part03

object OperatorDemo {
  def main(args: Array[String]): Unit = {
    //将数组中的偶数加倍，奇数丢弃
    val nums = (1 to 10).toArray
    val result1 = for (elem <- nums if elem % 2 == 0) yield elem * 2
    val result2 = for (elem <- nums) yield if (elem % 2 == 0) elem * 2 else 0
    result1.foreach(println(_))
    println("=============================")
    result2.foreach(println(_))

    //使用Scala中的高阶函数来实现
    println("=============================")
    nums.filter(_ % 2 == 0).map(_ * 2).foreach(println(_))

    println("=============================")
    //获取第一个元素
    println(nums.head)
    //获取最后一个元素
    println(nums.last)
    //获取除了第一个元素之外的其他元素
    println(nums.tail.toBuffer)
    //获取除了最后一个元素之外的其他元素
    println(nums.init.toBuffer)

    //求和
    println(nums.sum)
    //求最大值
    println(nums.max)
    //求最小值
    println(nums.min)

    val nums2 = Array(2, 1, 4, 3)
    //数组元素排序，升序
    println(nums2.sorted.toBuffer)
    //元素相乘
    println(nums2.product)

    println("==============================")
    val nums3 = Array(1, 2, 3, 4, 3, 2, 1)
    println(nums3.map(_ * 2).toBuffer)
    println(nums3.reduce(_ + _))
    //将数组中的数据进行去重
    println(nums3.distinct.toBuffer)
    println(nums3.length)
    println(nums3.size)
    //获取数组中每个元素的索引
    println("==============================")
    println(nums3.indices.toBuffer)

    //使用mkstring进行输出
    println(nums3.mkString(" & "))
    println(nums3.mkString("<", " & ", ">"))

    //count计数，注意：count后面必须有条件
    println(nums3.count(_ > 2))
    println(nums3.count(_ % 2 == 0))

    //filter过滤处符合条件的数据； filterNot过滤出不符合条件的数据
    println(nums3.filter(_ > 2).toBuffer)
    println(nums3.filterNot(_ % 2 == 0).toBuffer)

    println("======================================")
    //take提取前N个元素
    println(nums3.take(3).toBuffer)
    //takeRight提取右N个元素
    println(nums3.takeRight(3).toBuffer)
    //takeWhile从左向右进行提取，提取出符合条件的元素，如果条件不成立就终止提取
    println(nums3.takeWhile(_ < 4).toBuffer)

    println("======================================")
    //删除前N个元素
    println(nums3.drop(3).toBuffer)
    //删除后N个元素
    println(nums3.dropRight(3).toBuffer)
    //从左向右删除符合条件的元素，如果条件不成立，就终止删除操作
    println(nums3.dropWhile(_ < 4).toBuffer)

    println("======================================")
    //将数组分为两部分，前N个为一部分，剩下的为另一部分
    val tuple: (Array[Int], Array[Int]) = nums3.splitAt(3)
    println(tuple._1.toBuffer + "  " + tuple._2.toBuffer)
    //将数据进行切片操作，取出从索引2到索引4的元素，不包括索引为5的元素
    println(nums3.slice(2, 5).toBuffer)

    println("======================================")
    val array1 = Array("A", "B", "C")
    val array2 = Array(1, 3, 3, 4)
    //拉链操作，当两个数组的长度不一样时，截取相同的长度
    val z1: Array[(String, Int)] = array1.zip(array2)
    println(z1.toBuffer)

    //拉链操作，当两个数组长度不一样时，array1用*填充，array2用-1填充
    val z2: Array[(String, Int)] = array1.zipAll(array2, "*", -1)
    //拉链操作，当两个数组长度不一样时，array1用-1填充，array2用*填充
    val z3: Array[(Any, Any)] = array2.zipAll(array1, "*", -1)

    val z4: Array[(String, Int)] = array1.zipWithIndex

    println(z2.toBuffer)
    println(z3.toBuffer)
    println(z4.toBuffer)

    println("======================================")
    //通过unzip进行拆分数组的操作
    //通过unzip把z4拆分为两个数组
    val (l1, l2) = z4.unzip
    println(l1.toBuffer)
    println(l2.toBuffer)
    println("======================================")
    val (l3, l4, l5) = Array((1, "one", '1'), (2, "two", '2'), ('3', "three", '3')).unzip3
    println(l3.toBuffer)
    println(l4.toBuffer)
    println(l5.toBuffer)

    //数组的操作符: :+  +:  ++
    // :+用于在数组的尾部追加元素: +: 用于在数组的头部追加元素
    // ++用于连接两个集合(比如：数组、列表等)
    val num1 = (1 to 4).toArray
    val num2 = (5 to 8).toArray

    val num3 = 10 +: num1
    val num4 = num2 :+ 9
    val num5 = num1 ++ num2
    println("======================================")
    println(num3.toBuffer)
    println(num4.toBuffer)
    println(num5.toBuffer)

    println("=====================数组排序=================")
    val sortNums = Array(1, 3, 5, 2, 7, 8, 6, 9)
    //升序
    println(sortNums.sorted.toBuffer)
    //降序
    println(sortNums.sorted.reverse.toBuffer)
    //反转
    println(sortNums.reverse.toBuffer)
    //降序
    println(sortNums.sortWith(_ > _).toBuffer)
    //升序
    println(sortNums.sortWith(_ < _).toBuffer)


  }
}
