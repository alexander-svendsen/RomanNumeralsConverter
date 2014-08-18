package com.romannumeralsconverter

import scala.collection.{mutable, SortedMap}

object convertToRomanNumeral extends ((Int) => RomanNumeral) {
  val valueToRomanNumeralMap =
    mutable.LinkedHashMap (
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

    new RomanNumeral(romanNumeral)
  }
}


object convertToLatinNumeral extends ((String) => Int) {
  def apply(romanNumeral: String): Int = {
    0
  }
}
