package com.bigdata.scala.java_scala_conversions

import scala.collection.JavaConverters._

object JavaMapToScalaMap {
  def main(args: Array[String]): Unit = {
    val scalaMap = Map("x" -> 123, "y" -> 456, "z" -> 789)

    val javaMap = scalaMap.map{
      case (k, v) => (k.asInstanceOf[java.lang.String], v.asInstanceOf[java.lang.Integer])
    }.asJava

    println(javaMap)
  }
}
