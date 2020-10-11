package com.bigdata

import com.typesafe.config.ConfigFactory

object HelloWorld {
  def main(args: Array[String]): Unit = {
    val config = ConfigFactory.load("application.conf")
    val message = config.getString("com.bigdata.application.message")
    println("MESSAGE ::: " + message)
  }
}
