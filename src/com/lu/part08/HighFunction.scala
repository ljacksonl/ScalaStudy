package com.lu.part08


object HighFunction {
  def main(args: Array[String]): Unit = {
    //接收一个或者多个函数作为输入的函数
    val func = (n) => "*" * n
    (1 to 5).map(func(_)).foreach(println)

    //输出一个函数的高阶函数
    val URLBuilder = (ssl: Boolean, domainName: String) => {
      val schema = if (ssl) "https://" else "http://"
      //输出一个匿名函数
      (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query"
    }

    val domainName = "www.baidu.com"

    def getURL = URLBuilder(true, domainName)

    val endpoint = "show"
    val query = "id=1"
    val url = getURL(endpoint, query)
    println(url)
  }

}
