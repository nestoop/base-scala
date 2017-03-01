package cn.scala.fast.syntax

/**
  * Created by botter-common on 17-2-27.
  */
object ForSample {

  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10) {
      println(i)
    }

    val arr = List(1, 2, 3, 4, 5, 6, 7, "88")

    for (j <- arr) {
      println(j.getClass)
    }

    val list = List(3, 4, 5, 6, 7, 8, 9);

    val subList = for {a <- list if a != 5; if a < 9} yield a;

    for (b <- subList) println("subList element:" + b)
  }

}
