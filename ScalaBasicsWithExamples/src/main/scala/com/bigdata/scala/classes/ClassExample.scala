package com.bigdata.scala.classes

object ClassExample {
  def main(args: Array[String]): Unit = {
    // Creating an instance of Person class
    val instance1 = new Person("Ashok")
    // Reading the name of the Person by using the default getter
    println("Name :: " + instance1.name)

    // Changing the value of the Class Member using the default setter
    instance1.name = "Ashok Kumar"
    println("Full Name :: " + instance1.name)
  }
}
