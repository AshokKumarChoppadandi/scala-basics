package com.bigdata.scala.implicits

object MyUtils {
  implicit val num: Int = 10

  implicit def myAddition(x: Int, y: Int): Int = x + y

  implicit class ImplicitClass(x: Int) {
    def printLine(): Unit = println("Printing From Implicit Class :: " + x)
  }
}
