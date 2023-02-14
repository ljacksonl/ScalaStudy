package com.lu.part02

import java.io.PrintWriter

import scala.io.{BufferedSource, Source}

/**
 * I/O操作是一门编程语言的重要内容
 * 相比于Java语言中的I/O类，Scala中的I/O类数据较少，最常用的是Source这个类
 * 在Scala中，更多的是调用Java中的I/O类或者通过对Java的I/O类进行相应的封装来实现I/O操作
 */
object FileDemo {
  //读取文本文件
  def readTextFile: Unit = {
    val file = Source.fromFile("src\\test.txt")
    val lines: Iterator[String] = file.getLines()

    for (line <- lines) {
      println(line)
    }
    //关闭文件
    file.close()
  }

  //读取网络资源，需要在联网状态下
  def readNetSourc: Unit = {
    val source: BufferedSource = Source.fromURL("http://www.baidu.com")
    val message: String = source.mkString

    println(message)
    source.close()
  }

  //写入文本文件
  //Scala中没有内建的对写入文件的支持，需要使用java.io.PrintWriter来实现
  def writerTextFile: Unit = {
    val writer: PrintWriter = new PrintWriter("src\\test.txt")
    for (i <- 1 to 10) {
      //写入文件内容
      writer.println(s"i = $i")
      //刷新printwriter流的缓冲区
      writer.flush()
    }

    //关闭写入流
    writer.close()
  }

  def main(args: Array[String]): Unit = {
    readTextFile

    println("===================================")
    readNetSourc
    println("===================================")
    writerTextFile
  }
}
