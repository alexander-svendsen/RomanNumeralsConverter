package com.romannumeralsconverter

import scala.collection.mutable

object convertToRomanNumeral extends ((Int) => String) {
  val valueToRomanNumeralMap =
    mutable.LinkedHashMap (
      1000 -> "M",
      900 -> "CM",
      500 -> "D",
      400 -> "CD",
      100 -> "C",
      90 -> "XC",
      50 -> "L",
      40 -> "XL",
      10 -> "X",
      9 -> "IX",
      5 -> "V",
      4 -> "IV",
      1 -> "I"
    )

  def apply(latinNumeral: Int): String = {
    var romanNumeral = ""
    var counter = latinNumeral
    val default = (0,"")

    var biggestFoundTuple = (0,"")
    do{
      biggestFoundTuple = valueToRomanNumeralMap.find(_._1 <= counter).getOrElse(default)
      romanNumeral += biggestFoundTuple._2
      counter -= biggestFoundTuple._1
    }while(biggestFoundTuple._2 != "")

    romanNumeral
  }
}


object convertToLatinNumeral extends ((String) => Int) {
  def apply(romanNumeral: String): Int = {

    var number = 0
    if (romanNumeral.length == 0)
      return 0

    if (romanNumeral.charAt(0) == 'X'){
      number += 10
      romanNumeral.drop(1)
    }

    else if (romanNumeral == "IX"){
      return 9
    }
    if (romanNumeral.charAt(0) == 'V'){
      number += 5
      romanNumeral.drop(1)
    }
    else if (romanNumeral == "IV")
      return 4

    romanNumeral.foreach((entry:Char) => if (entry == 'I') number+=1)
    number
  }
}

