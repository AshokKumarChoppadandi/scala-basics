package com.bigdata.scala.scallop

object ScallopExample {
  def main(args: Array[String]): Unit = {
    val conf = new Conf(args)

    println("Apples :: " + conf.apples)
    println("Bananas :: " + conf.bananas)

    println("Name :: " + conf.name)
  }
}
