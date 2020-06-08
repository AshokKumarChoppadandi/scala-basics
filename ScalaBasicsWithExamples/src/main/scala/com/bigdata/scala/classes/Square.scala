package com.bigdata.scala.classes

class Square {
  var side = 10

  def perimeterOfSquare(): Int = {
    val perimeter = 4 * side
    perimeter
  }

  def areaOfSquare(): Int = {
    val area = side * side
    area
  }

  override def toString: String = s"Square(Side = $side)"
}
