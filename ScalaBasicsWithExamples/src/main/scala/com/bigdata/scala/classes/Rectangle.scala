package com.bigdata.scala.classes

class Rectangle {
  val length = 10
  val breadth = 5

  def perimeterOfRectangle(): Int = {
    val perimeter = (length + breadth) * 2
    perimeter
  }

  def areaOfRectangle(): Int = {
    val area = length * breadth
    area
  }

  override def toString: String = s"Rectance(Length = $length, Breadth = $breadth)"
}
