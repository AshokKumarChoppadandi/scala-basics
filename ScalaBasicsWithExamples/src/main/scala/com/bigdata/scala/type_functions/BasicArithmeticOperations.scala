package com.bigdata.scala.type_functions

object BasicArithmeticOperations {

  def main(args: Array[String]): Unit = {

    val result01 = addition(5, 10)
    val result02 = addition(5.5f, 10.2f)
    val result03 = addition(5.9d, 10.4d)
    val result04 = addition(5L, 10L)
    val result05 = addition("Hello ", "World")

    println("Result01 = " + result01)
    println("Result02 = " + result02)
    println("Result03 = " + result03)
    println("Result04 = " + result04)
    println("Result05 = " + result05)


    val result11 = addTwoValues1[Int](10, 20)((x, y) => x + y)
    println("Result = " + result11)

    val result12 = addTwoValues1[Float](10.5f, 20.6f)((x, y) => x + y)
    println("Result = " + result12)

    val result13 = addTwoValues1[Double](10.5, 20.6)(_ + _)
    println("Result = " + result13)

    val result14 = addTwoValues1[Long]( 34L, 43L)(_ + _)
    println("Result = " + result14)

    val result15 = addTwoValues1[String]("Hello ", "World")((x, y) => x.concat(y))
    println("Result = " + result15)

    val result16 = addTwoValues1[BigInt](BigInt("12324214414"), BigInt("24421121131"))(_.+(_))
    println("Result = " + result16)


    import ArithmeticOperationsImplicits._
    val result21 = addTwoValues2[Int](10, 20)
    println("Result = " + result21)

    val result22 = addTwoValues2[Float](10.5f, 20.6f)
    println("Result = " + result22)

    val result23 = addTwoValues2[Double](10.5, 20.6)
    println("Result = " + result23)

    val result24 = addTwoValues2[Long]( 34L, 43L)
    println("Result = " + result24)

    val result25 = addTwoValues2[String]("Hello ", "World")
    println("Result = " + result25)
  }

  def addition(a: Int, b: Int): Int = {
    a + b
  }

  def addition(a: Float, b: Float): Float = {
    a + b
  }

  def addition(a: Double, b: Double): Double = {
    a + b
  }

  def addition(a: Long, b: Long): Long = {
    a + b
  }

  def addition(a: String, b: String): String = {
    a + b
  }

  def addTwoValues1[T](value1: T, value2: T)(f: (T, T) => T): T = {
    f(value1, value2)
  }

  def addTwoValues2[T](num1: T, num2: T)(implicit op: MyConcatOperation[T]): T = {
    op.customAddition(num1, num2)
  }




}
