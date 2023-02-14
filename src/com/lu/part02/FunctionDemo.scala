package com.lu.part02

object FunctionDemo {
  /**
   * 定义函数的语法结构: def 函数名(参数列表):返回值类型={函数体}
   * 函数体中最后一条语句的返回值作为整个函数的返回值，返回值不需要使用return关键字
   * 也可以不声明函数的返回值类型，Scala会自动根据最后一条语句的返回值推断出函数的返回值类型
   * 但是，如果是递归函数，其返回值类型必须声明
   *
   * @param num1
   * @param num2
   * @return
   */
  def add(num1: Int, num2: Int) = {
    num1 + num2
  }

  //通过递归的函数来计算阶乘
  def factorial(num: Int): Long = {
    if (num <= 1)
      1
    else
      num * factorial(num - 1)
  }

  def sequence(n: Int): Long = {
    if (n == 1) {
      5
    }
    else if (n == 2) {
      2
    } else {
      2 * sequence(n - 1) + 3 * sequence(n - 2)
    }
  }

  //通过递归函数实现一个斐波那契数列：1，1，2，3，5，8.......
  def fibonacci(n: Int): Long = {
    if (n == 1 || n == 2) {
      1
    } else {
      fibonacci(n - 1) + fibonacci(n - 2)
    }
  }

  //如果函数没有返回值,其返回值类型为Unit，类似于Java中的void，“=”也可以省略
  //在Scala中，没有返回值的函数称为过程
  def getSum(x: Int, y: Int) {
    println(x + y)
  }

  //函数中的参数可以有默认值，称为默认参数
  def add2(x: Int = 10, y: Int = 20): Unit = {
    x + y
  }

  //变长参数：参数类型右边加上*号
  //变长参数只能出现在参数列表的尾部，并且只能有一个
  //在Spark的源码中有大量的变长参数
  def addSum(nums: Int*): Int = {
    nums.sum
  }

  def main(args: Array[String]): Unit = {
    println(add(1, 2))
    println("计算阶乘：" + factorial(4))
    println("斐波那契数列：" + fibonacci(6))
    //调用函数时，使用函数中的参数的默认值
    println(add2())
    //调用函数时，给函数的参数重新赋值
    println(add2(30, 40))
    //在调用函数时，不按照函数定义的参数顺序来传递值，而是使用带名参数的方式来传值
    println(add2(y = 30, x = 40))
    println(addSum(1))
    println(addSum(1, 2, 3))
    println(addSum(1, 2, 3, 4, 5))
    //使用parameter:_*的形式,告诉编译器这个参数被当成参数序列处理
    println(addSum(1 to 10: _*))

    println(sequence(3))
  }
}
