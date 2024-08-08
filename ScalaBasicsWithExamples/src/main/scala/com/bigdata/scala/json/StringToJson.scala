package com.bigdata.scala.json

object StringToJson {
  def main(args: Array[String]): Unit = {
    val jsonString = "{\"name\": \"Ashok Kumar\", \"age\": 33, \"gender\": \"M\"}"

    val json = ujson.read(jsonString)
    println(json)
  }
}
