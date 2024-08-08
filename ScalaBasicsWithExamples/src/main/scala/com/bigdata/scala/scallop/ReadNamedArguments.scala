package com.bigdata.scala.scallop

object ReadNamedArguments {
  def main(args: Array[String]): Unit = {
    val config = new Config(args)

    val propertiesFile = config.propertiesFile.toOption.get
    val bootstrapServer = config.bootstrapServer.toOption.get
    val connectServer = config.connectServer.toOption.get
    val action = config.action.toOption.get

    println("propertiesFile : " + propertiesFile)
    println("bootstrapServer : " + bootstrapServer)
    println("connectServer : " + connectServer)
    println("action : " + action)

    println(config.summary)
  }
}
