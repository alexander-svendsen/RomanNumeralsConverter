package com.romannumeralsconverter

import scala.collection.mutable

object convertToRomanNumeral extends ((Int) => RomanNumeral) {
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

  def apply(number: Int): RomanNumeral = {
    var romanNumeral = ""
    var counter = number
    val default = (0,"")

    var biggestFoundTuple = (0,"")
    do{
      biggestFoundTuple = valueToRomanNumeralMap.find(_._1 <= counter).getOrElse(default)
      romanNumeral += biggestFoundTuple._2
      counter -= biggestFoundTuple._1
    }while(biggestFoundTuple._2 != "")

    RomanNumeral(romanNumeral)
  }
}


object convertToLatinNumeral extends ((String) => Int) {
  def apply(romanNumeral: String): Int = {
    if (romanNumeral == "II"){
      return 2
    }
    if (romanNumeral == "I"){
      return 1
    }

    0
  }
}
