package com.bigdata.scala.matching

import java.util.Date

/**
 * Pattern matching is a mechanism for checking a value against a pattern.
 * A successful match can also deconstruct a value into its constituent parts.
 * It is a more powerful version of the switch statement in Java and it can likewise be used in place of a series of if/else statements.
 *
 * match is the keyword used for matching the data with the pattern.
 * case is the keyword used which takes the pattern to match with the data.
 *
 * We can have multiple cases with different patterns to match.
 */

object PatternMatchingExample {
  def main(args: Array[String]): Unit = {
    // Pattern Matching - Match the given name

    matchGivenName("Sasi")

    val returnValue1 = matchGivenNameAndReturnName1("Lakshmi Ulise")
    println("Return Value is :: " + returnValue1)

    val returnValue2 = matchGivenNameAndReturnName2("Srinivas")
    println("Return Value is :: " + returnValue2)

    matchValue("zebra")

    // Pattern Matching - Matching with the value
    println("-" * 50)
    matchValue("a")
    println("-" * 50)

    println("-" * 50)
    matchValue("B")
    println("-" * 50)

    println("-" * 50)
    matchValue("Hi, hello word")
    println("-" * 50)

    println("-" * 50)
    matchValue("zebra")
    println("-" * 50)

    println("-" * 50)
    matchValue("test")
    println("-" * 50)

    // Pattern Matching with the Type of the variable
    println("-" * 50)
    printType(1)
    println("-" * 50)
    println("-" * 50)
    printType(10L)
    println("-" * 50)
    println("-" * 50)
    printType("Hello")
    println("-" * 50)
    println("-" * 50)
    printType('C')
    println("-" * 50)
    println("-" * 50)
    printType(10.5f)
    println("-" * 50)
    println("-" * 50)
    printType(new Date())
    println("-" * 50)

    // Pattern Matching on Case Classes
    println("-" * 50)
    matchVehicleType(new Vehicle{})
    println("-" * 50)

    println("-" * 50)
    matchVehicleType(Bike("Royal Enfield", "Classic 350", 2010, 348.6, 172000))
    println("-" * 50)

    println("-" * 50)
    matchVehicleType(Car("Hyundai", "Creta", 2014, 2478.5, 2275000, 4, airBags = true, isSUV = true))
    println("-" * 50)

    println("-" * 50)
    matchVehicleType(Truck(brand = "Ashok Leyland", model = "MX300", releasedYear = 2015, engineCapacity = 15894.9, price = 4245000, isPowerSteering = true, maxLoadInKGS = 50000))
    println("-" * 50)

    println("-" * 50)
    matchVehicleType(Others())
    println("-" * 50)

  }

  def matchGivenName(eName: String): Unit = {
    eName match {
      case "Lakshmi" => println("Lakshmi is a Developer")
      case "Sasi" => println("Sasi is a Sr. Developer")
      case "Srinivas" => println("Srinivas is a Team Lead")
      case "Daya" => println("Daya is a Manager")
      case _ => println("Team Member")
    }
  }

  def matchGivenNameAndReturnName1(eName: String): String = {
    eName match {
      case "Lakshmi" => "Lakshmi is a Developer"
      case "Sasi" => "Sasi is a Sr. Developer"
      case "Srinivas" => "Srinivas is a Team Lead"
      case "Daya" => "Daya is a Manager"
      case _ => "Team Member"
    }
  }

  def matchGivenNameAndReturnName2(eName: String): String = {
    val returnString = eName match {
      case "Lakshmi" => "Lakshmi is a Developer"
      case "Sasi" => "Sasi is a Sr. Developer"
      case "Srinivas" => "Srinivas is a Team Lead"
      case "Daya" => "Daya is a Manager"
      case _ => "Team Member"
    }

    returnString
  }

  def printType(inputVariable: Any): Unit = {

    inputVariable match {
      case x: Int => println(x + " is an Integer")
      case y: Long => println(y + " is a Long")
      case str: String => println(str + " is a String")
      case c: Char => println(c + " is a Character")
      case _ => println("I don't know the type of the Value passed")
    }
  }

  def matchValue(str: String): Unit = {
    str match {
      case "Srinivas" => println("The value received is LOWER CASE 'a'")
      case "sasi" | "SASI" => println("The value received is either UPPER or LOWER CASE : " + str)
      case temp if str.contains("Ulise") => println(s"The value received '$temp' contains - 'Ulise'")
      case temp if str.startsWith("z") & str.endsWith("a") => println("The value received starts with 'z' and ends with 'a' is :: " + temp)
      case _ => println("Unexpected value received...!!!")
    }
  }

  def matchVehicleType(vehicle: Vehicle): Unit = {
    vehicle match {
      case Bike(brand, model, releasedYear, engineCapacity, price) => println(s"$brand released their new bike named $model in the year $releasedYear which has ${engineCapacity}CC engine capacity with the price Rs. ${price}/-")
      case c: Car => println(s"The vehicle $c passed is a CAR")
      case Truck(_, _, _, engineCapacity, _, _, maxLoadinKGS) => println(s"The vehicle passed is Truck which has an engine capacity of $engineCapacity and it's max load capacity is $maxLoadinKGS")
      case o: Others => println(s"There are no details about the vehicle $o")
      case _ => println(s"$vehicle is just a Vehicle")
    }
  }
}
