package com.bigdata.scala.scallop

import org.rogach.scallop._

class Config (arguments: Array[String]) extends ScallopConf (arguments) {
  val propertiesFile = opt[String]("propertiesFile", required = true, descr = "local path to JSON properties file")
  val bootstrapServer = opt[String]("bootstrapServer", required = true, descr = "Kafka Cluster Bootstrap Servers URL to connect")
  val connectServer = opt[String]("connectServer", required = true, descr = "Kafka Cluster Bootstrap Servers URL to connect")
  val epochTimestamp = opt[Long]("epochTimestamp", descr = "Epoch timestamp in milli seconds to reset Kafka Connector Offsets")
  val action = opt[String]("action", required = true, default = Some("dryRun"), descr = "Action to perform. Supported Actions are - start | status | describe | stop | resume | delete | dryRun | execute")

  verify()
}
