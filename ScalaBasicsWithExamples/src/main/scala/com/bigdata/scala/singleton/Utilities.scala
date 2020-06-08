package com.bigdata.scala.singleton

// No need of initializing the Utilities Singleton Class
object Utilities {

  val HELLO_MESSAGE = "Hello, "
  val GREETING_MESSAGE = "Good Morning, "

  def sayHello(str: String): Unit = {
    println("Saying Hello :: " + str)
  }

  def greet(str: String): Unit = {
    println("Greeting :: " + str)
  }

  {
    // This line of code will automatically execute whenever the JVM and Main method starts.
    println("This is executing when initializing the 'Utilities' Singleton Class...!!!")
    println("This is executing when initializing the 'Utilities' Singleton Class...!!!")
  }
}
