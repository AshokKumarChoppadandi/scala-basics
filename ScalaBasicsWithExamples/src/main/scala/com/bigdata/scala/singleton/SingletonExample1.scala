package com.bigdata.scala.singleton

object SingletonExample1 {

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

    // Object / Singleton Example 1
    println("Singleton / object Example :")
    val name1 = "John"
    val helloMessage = Utilities.HELLO_MESSAGE + name1
    Utilities.sayHello(helloMessage)

    val greetMessage = Utilities.GREETING_MESSAGE + name1
    Utilities.greet(greetMessage)

    // Normal Class Example
    println("\nNormal Class Example")
    val name2 = "Shaun"
    val utility = new Utility(name2)

    utility.sayHello()
    utility.greet()
  }
}
