package com.lu.homework

case class UserInfo(userName: String, location: String, startTime: Int, duration: Int)

object Test3 {
  def main(args: Array[String]): Unit = {
    val userInfoList = List(
      UserInfo("UserA", "LocationA", 8, 60),
      UserInfo("UserA", "LocationA", 9, 60),
      UserInfo("UserA", "LocationB", 10, 60),
      UserInfo("UserA", "LocationB", 11, 80)
    )

    val userMap = userInfoList.groupBy(t => t.userName + "," + t.location)
    val orderByUserMap = userMap.mapValues(t => t.sortBy(x => x.startTime))

    var firstTime = 0

    val totalMap = orderByUserMap
      .mapValues(
        t => {
          firstTime = t.head.startTime
          var sum = t.map(x => x.duration).sum
          sum
        }
      )

    totalMap.foreach {
      case (datas, sumTime) => println(s"$datas,$firstTime,$sumTime")
    }

  }
}
