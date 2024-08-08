package com.bigdata.scala.http

object SimpleGetRequest {
  def main(args: Array[String]): Unit = {
    val request = requests.get("http://192.168.0.231:8083")
    val response = request.text()

    val json = ujson.read(response)
    println(s"Kafka Connect Version : ${json("version").value}")
  }
}
