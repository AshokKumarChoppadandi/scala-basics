package com.bigdata.scala.http

object SimplePostRequestWithData {
  def main(args: Array[String]): Unit = {
    val filePath = "/Users/ashchopp/IdeaProjects/StreamingExamples/KafkaExamples/src/main/resources/Connector2.json"
    val file = os.read(os.Path(filePath))
    val json = ujson.read(file)

    val url = "http://node103.ord.adhoc.dw.cnvr.net:8083/connectors"
    val request = requests.post(url = url, data = json.value.toString)

    val response = request.text()
    val jsonResponse = ujson.read(response)
    println(jsonResponse.value)
  }
}
