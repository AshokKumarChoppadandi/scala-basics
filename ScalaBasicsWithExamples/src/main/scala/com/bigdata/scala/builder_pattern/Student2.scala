package com.bigdata.scala.builder_pattern

class Student2 private (sId: Int, sName: String, sYear: Int, sBranch: String) {
  override def toString: String = {
    super.toString
    s"Student2($sId, $sName, $sYear, $sBranch)"
  }
}

object Student2 {

  def builder(): Builder = new Builder

  class Builder {
    private var sId: Int = _
    private var sName: String = _
    private var sYear: Int = _
    private var sBranch: String = _

    def setStudentId(sId: Int): Builder = {
      this.sId = sId
      this
    }

    def setStudentName(sName: String): Builder = {
      this.sName = sName
      this
    }

    def setStudentYear(sYear: Int): Builder = {
      this.sYear = sYear
      this
    }

    def setStudentBranch(sBranch: String): Builder = {
      this.sBranch = sBranch
      this
    }

    def build(): Student2 = {
      if(this.sId == -1 || this.sName == null) {
        throw new RuntimeException(s"Missing Values in creating Student instance.\nProvided values are :: sId = ${this.sId}, sName = ${this.sName}")
      }

      new Student2(this.sId, this.sName, this.sYear, this.sBranch)
    }
  }
}
