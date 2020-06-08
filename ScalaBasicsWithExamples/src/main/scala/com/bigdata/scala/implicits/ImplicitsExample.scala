package com.bigdata.scala.implicits

import MyUtils._

object ImplicitsExample {

  def main(args: Array[String]): Unit = {

    println("ADD 5 with default value "+ add(5))
    ImplicitClass(5).printLine()

    println("10 + 15 = " + myAddition(10, 15))

    println("Custom Addition of (15, 20) :: " + customAddition(15, 20))

  }

  def add(x: Int)(implicit y: Int): Int = {
    x + y
  }

  def customAddition(x: Int, y: Int)(implicit f: (Int, Int) => Int): Int = {
    f(x, y)
  }
}
