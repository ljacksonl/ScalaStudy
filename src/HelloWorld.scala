object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello World")

    val a,b = 100
    println(a+b)
    println(a.+(b))
    println(1 to 10)
    println(1 .to(10))
    printf("Hello, %s! You are %d years old.", "Scala", 18)
  }
}
