package com.lu.part10

object DoublyDemo {
  def print(num: Double)(implicit fmt: String): Unit = {
    println(fmt format (num))

  }

  def main(args: Array[String]): Unit = {
    print(3.235)("%.1f")
    println("%.2f" format (3.5666))
    implicit val printFmt = "%.3f"
    print(3.999999)
  }
}
