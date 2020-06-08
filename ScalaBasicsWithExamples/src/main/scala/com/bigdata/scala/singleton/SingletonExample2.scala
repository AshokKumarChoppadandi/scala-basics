package com.bigdata.scala.singleton

import Utilities._

object SingletonExample2 {

  /**
   * 1. An object is a class that has exactly one instance, which is created at the time of program execution by the JVM and main method.
   * 2. The definition of an object looks like a class, but uses the keyword 'object'
   * 3. Creating utility methods or the constants is one of the common use cases for singleton objects.
   *
   * There are two important things or keywords that we need to consider are:
   *  - object : object is the keyword which helps machine or computer to understand that, all the classes which are declared as object needs to initialized whenever the JVM is created for executing the Scala application
   *  - main : main is the keyword which helps machine or computer to understand that, it is the entry point or starting point for the execution of Scala Application.
   */

  def main(args: Array[String]): Unit = {

    // Object / Singleton Example 2
    println("Singleton / object Example :")
    val name1 = "John"
    val helloMessage = HELLO_MESSAGE + name1
    sayHello(helloMessage)

    val greetMessage = GREETING_MESSAGE + name1
    greet(greetMessage)
  }
}
