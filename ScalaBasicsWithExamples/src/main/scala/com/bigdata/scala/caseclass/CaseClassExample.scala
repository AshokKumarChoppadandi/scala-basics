package com.bigdata.scala.caseclass

object CaseClassExample {
  def main(args: Array[String]): Unit = {
    val student1 = Student(1, "Test1", "CSE")
    println("Student 1 :: " + student1)

    val student2 = Student(2, "Test2", "IT")
    println("Student 2 :: " + student2)

    val student3 = Student(1, "Test1", "CSE")
    println("Student 3 :: " + student3)

    val result1 = student1.equals(student2)
    println("Student1 == Student2 is : " + result1)

    val result2 = student1.equals(student3)
    println("Student1 == Student3 is : " + result2)

  }
}
