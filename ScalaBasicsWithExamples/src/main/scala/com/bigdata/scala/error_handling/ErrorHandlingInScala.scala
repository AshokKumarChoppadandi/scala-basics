package com.bigdata.scala.error_handling

import scala.util.{Failure, Success, Try}

object ErrorHandlingInScala {
  def main(args: Array[String]): Unit = {
    val list = List("1", "2", "3", "Four", "Five", "6", "7")

    // Error Handling Using Option

    val result1 = list.map(x => try{
      Some(x.toInt)
    } catch {
      case _: Exception => None
    })

    println("Option - Print 1: ")
    result1.foreach{
      case Some(value) => println(value)
      case None =>
    }

    println("\nOption - Print 2: ")
    val result11 = list.flatMap(x => try {
      Some(x.toInt)
    } catch {
      case _: Exception => None
    })
    result11.foreach(println)

    println("\nOption - Print 3: ")
    result1.flatten.foreach(println)

    println("\nOption - Print 4: ")
    result1.collect{case Some(x) => println(x)}

    val result2 = list.map(convertToInt)
    println("\nOption - Print 5: ")
    result2.foreach{
      case Some(x) => println(x)
      case _ =>
    }

    // Error Handling Using Try

    val list2 = List("1", "2", "3", "Four", "Five", "6", "7")
    val result3 = list2.map(x => Try(x.toInt))

    result3.foreach(println)

    println("\nTry - Print 1: ")
    result3.collect{
      case Success(x) => x
      case Failure(_: NumberFormatException) =>  0
    }.foreach(println)


    // Error Handling Using Either
    val list4 = List("1", "2", "3", "Four", "Five", "6", "7")

    val result4 = list4.map(x => {
      try{
        Right(x.toInt)
      } catch {
        case _: NumberFormatException => Left("Trying to convert String to Integer")
      }
    })

    println("\nEither - Print 1: ")
    result4.foreach{
      case Right(x) => println(x)
      case Left(_) => println(0)
    }
  }

  def convertToInt(str: String): Option[Int] = scala.util.control.Exception.allCatch.opt(str.toInt)
}
