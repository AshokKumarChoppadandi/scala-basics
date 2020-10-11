name := "SBTAssemblyExample"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies ++= {
  Seq (
    "com.typesafe" % "config" % "1.3.4",
    "org.apache.spark" %% "spark-core" % "2.4.0",
    "org.apache.spark" %% "spark-sql" % "2.4.0",
    "org.apache.spark" %% "spark-mllib" % "2.4.0",
    "org.apache.spark" %% "spark-streaming" % "2.4.0",
    "com.twilio.sdk" % "twilio" % "7.41.2"
  )
}

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}