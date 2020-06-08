package com.bigdata.scala.builder_pattern

object BuilderPatternScalaExample {
  def main(args: Array[String]): Unit = {

    val student1 = Student
      .builder()
      .setStudentId(123)
      .setStudentName("Test1")
      .setStudentYear(3)
      .setStudentBranch("CSE")
      .build()

    println("Student 1 :: " + student1)

    val student2 = Student.builder()
    println("Student 2 :: " + student2)

    val student21 = Student2
      .builder()
      .setStudentId(901)
      .setStudentName("TestName")
      .build()
    println("Student 21 :: " + student21)
  }
}
