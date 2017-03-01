package cn.scala.fast.syntax

/**
  * Created by botter-common on 17-3-1.
  */
object ClassSample {

  class Point(var x:Int, var y:Int) {

    def move(dx: Int, dy: Int):Unit = {
      x = x + dx;
      y = y + dy;
    }

    override def toString: String = {
      "(" + x + ", " + y + ")"
    }
  }

  def main(args: Array[String]): Unit = {
    val point = new Point(3, 5);
    println(point);
    point.move(6, 8);
    println(point)
  }

}
