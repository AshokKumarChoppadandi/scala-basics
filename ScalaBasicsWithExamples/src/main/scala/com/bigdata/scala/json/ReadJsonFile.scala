package com.bigdata.scala.json

object ReadJsonFile {
  def main(args: Array[String]): Unit = {
    val filePath = args(0)
    val readJsonFile = os.read(os.Path(filePath))
    val jsonString = ujson.read(readJsonFile)

    println(jsonString("name").str)

    val kafkaTopic = jsonString("config")("topics").value
    println("Kafka Topic - " + kafkaTopic)
  }
}
