package cn.scala.fast.syntax

/**
  * Created by botter-common on 17-2-27.
  */
object IfSample {

  def main(args: Array[String]): Unit = {
    var i: Int = 1

    if (i < 0) {
      print("i < 0")
    } else if (i > 1) {
      print("i > 1")
    } else {
      print(" 0< i < 1 or i = 1")
    }
  }
}
