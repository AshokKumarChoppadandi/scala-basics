package com.bigdata.scala.builder_pattern

object Student {
  def builder(): Student = new Student()
}

class Student(var sId: Int, var sName: String, var sYear: Int, var sBranch: String) {
  def this() = this(-1, null, -1, null)

  def setStudentId(sId: Int): Student = {
    this.sId = sId
    this
  }

  def setStudentName(sName: String): Student = {
    this.sName = sName
    this
  }

  def setStudentYear(sYear: Int): Student = {
    this.sYear = sYear
    this
  }

  def setStudentBranch(sBranch: String): Student = {
    this.sBranch = sBranch
    this
  }

  def build(): Student = {
    if(this.sId == -1 || this.sName == null) {
      throw new RuntimeException(s"Missing Values in creating Student instance.\nProvided values are :: sId = ${this.sId}, sName = ${this.sName}")
    }

    new Student(this.sId, this.sName, this.sYear, this.sBranch)
  }
  override def toString: String = s"Student($sId, $sName, $sYear, $sBranch)"
}

/*class StudentBuilder {
  var sId: Int = _
  var sName: String = _
  var sYear: Int = _
  var sBranch: String = _

  def setStudentId(sId: Int): StudentBuilder = {
    this.sId = sId
    this
  }

  def setStudentName(sName: String): StudentBuilder = {
    this.sName = sName
    this
  }

  def setStudentYear(sYear: Int): StudentBuilder = {
    this.sYear = sYear
    this
  }

  def setStudentBranch(sBranch: String): StudentBuilder = {
    this.sBranch = sBranch
    this
  }

  def build(): Student = new Student(this.sId, this.sName, this.sYear, this.sBranch)
}*/
