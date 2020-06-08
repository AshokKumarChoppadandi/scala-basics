package com.bigdata.scala.companion

object CompanionExample {
  def main(args: Array[String]): Unit = {

    val employee1 = Employee(123, "XYZ", 10000, "AAA")
    println("Employee 1 :: " + employee1)

    val employee2 = Employee.apply(456, "ABC", 15000, "BBB")
    println("Employee 2 :: " + employee2)

    val employee3 = new Employee(789, "LMN", 12000, "BBB")
    println("Employee 3 :: " + employee3)

  }
}
