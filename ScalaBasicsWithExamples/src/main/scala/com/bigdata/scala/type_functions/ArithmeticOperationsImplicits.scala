package com.bigdata.scala.type_functions

object ArithmeticOperationsImplicits {

  implicit val intAddition: MyConcatOperation[Int] = new MyConcatOperation[Int] {
    override def customAddition: (Int, Int) => Int = _ + _
  }

  implicit val floatAddition: MyConcatOperation[Float] = new MyConcatOperation[Float] {
    override def customAddition: (Float, Float) => Float = _ + _
  }

  implicit val longAddition: MyConcatOperation[Long] = new MyConcatOperation[Long] {
    override def customAddition: (Long, Long) => Long = _ + _
  }

  implicit val doubleAddition: MyConcatOperation[Double] = new MyConcatOperation[Double] {
    override def customAddition: (Double, Double) => Double = _ + _
  }

  implicit val stringAddition: MyConcatOperation[String] = new MyConcatOperation[String] {
    override def customAddition: (String, String) => String = _.concat(_)
  }

  implicit val bigIntAddition: MyConcatOperation[BigInt] = new MyConcatOperation[BigInt] {
    override def customAddition: (BigInt, BigInt) => BigInt = _.+(_)
  }

  implicit val bigDecimalAddition: MyConcatOperation[BigDecimal] = new MyConcatOperation[BigDecimal] {
    override def customAddition: (BigDecimal, BigDecimal) => BigDecimal = _.+(_)
  }

}
