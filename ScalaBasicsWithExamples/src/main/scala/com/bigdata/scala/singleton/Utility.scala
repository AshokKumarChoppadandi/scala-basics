package com.bigdata.scala.singleton

class Utility(str: String) {
  val HELLO_MESSAGE = "Hello, "
  val GREETING_MESSAGE = "Good Morning, "

  def sayHello(): Unit = {
    println(HELLO_MESSAGE + str)
  }

  def greet(): Unit = {
    println(GREETING_MESSAGE + str)
  }

  {
    // This line of code executes when the Utility Class initialized in main method.
    println("This is from Utility Class...!!!")
    println("This is from Utility Class...!!!")
  }
}
