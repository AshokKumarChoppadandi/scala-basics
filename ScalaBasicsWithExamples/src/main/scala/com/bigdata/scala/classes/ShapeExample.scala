package com.bigdata.scala.classes

import com.bigdata.scala.caseclass.ModifiedSquare

object ShapeExample {
  def main(args: Array[String]): Unit = {
    /*val instance1 = new Square()
    println("Square :: " + instance1)
    println("Perimeter of Square :: " + instance1.perimeterOfSquare())
    println("Area of Square :: " + instance1.areaOfSquare())

    val instance2 = new Rectangle()
    println("Rectangle :: " + instance2)
    println("Perimeter of Rectangle :: " + instance2.perimeterOfRectangle())
    println("Area of Rectangle :: " + instance2.areaOfRectangle())*/

    val instance3 = new SquareWithConstructor(15)
    println("SquareWithConstructor :: " + instance3)
    println("Perimeter of SquareWithConstructor :: " + instance3.perimeterOfSquare())
    println("Area of SquareWithConstructor :: " + instance3.areaOfSquare())

    /*val instance4 = new RectangleWithConstructor(20, 30)
    println("RectangleWithConstructor :: " + instance4)
    println("Perimeter of RectangleWithConstructor :: " + instance4.perimeterOfRectangle())
    println("Area of RectangleWithConstructor :: " + instance4.areaOfRectangle())*/

    val instance5 = new SquareWithConstructor(15)
    println("SquareWithConstructor :: " + instance5)
    println("Perimeter of SquareWithConstructor :: " + instance5.perimeterOfSquare())
    println("Area of SquareWithConstructor :: " + instance5.areaOfSquare())


    if(instance3.equals(instance5)) {
      println("true")
    } else {
      println("false")
    }

    // 1. We are not using new key word.
    // 2. We have not written toString method / function.
    // 3. We have not written any method to compare.
    val m1 = ModifiedSquare(100)
    println("Modified Square 1 :: " + m1)

    val m2 = ModifiedSquare(100)
    println("Modified Square 2 :: " + m2)

    if(m1.equals(m2)) {
      println("Squares Matched")
    } else {
      println("Squares Not Matched")
    }
  }
}
