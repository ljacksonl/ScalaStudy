package com.lu.part04

//主构造器与类名交织在一起，类名后面的参数就是主构造器的参数
//主构造器直接在类中，其代码不包含在任何方法中
class Animal(name: String, age: Int) {
  //下面三行println代码都属于主构造器的代码
  //类中不在任何方法中的代码，都属于主构造器的代码。
  println(name)
  println(age)
  println("==========================")

  var gender: String = ""

  def this(name: String, age: Int, gender: String) {
    //每个辅助构造器必须以主构造器或其他辅助构造器的调用作为第一句代码
    //这里就调用了主构造器
    this(name, age)
    this.gender = gender
  }

  var color: String = ""

  def this(name: String, age: Int, gender: String, color: String) {
    //此处调用的是上面的辅助构造器
    this(name, age, gender)
    this.color = color
  }

}

object ConstructorDemo {
  def main(args: Array[String]): Unit = {

    val animal1 = new Animal("旺财", 3, "雄性")
    val animal2 = new Animal("小三", 5, "雄性", "黑色")
  }
}
