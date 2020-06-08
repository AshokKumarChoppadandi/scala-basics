package com.bigdata.scala.companion

object Employee {

  private val hiddenValue = "HIDDEN"

  def apply(id: Int, name: String, salary: Int, dept: String): Employee = new Employee(id, name, salary, dept)
}

class Employee (id: Int, name: String, salary: Int, dept: String) {
  override def toString: String = {
    s"Employee(id=$id, name=$name, salary=$salary, dept=$dept, hidden = ${Employee.hiddenValue})"
  }
}
