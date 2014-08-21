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
  val romanNumeralToLatinNumeralMap =
    Map (
      "X" -> 10,
      "IX" -> 9,
      "V" -> 5,
      "IV" -> 4,
      "I" -> 1
    )


  def apply(romanNumeral: String): Int = {
    val iterator = romanNumeral.toList.iterator.buffered
    var number = 0

    while (iterator.hasNext){
      number += parseNextRomanNumeral(iterator)
    }
    number
  }

  def parseNextRomanNumeral(iterator: BufferedIterator[Char]): Int = {
    var current: Char = ' '
    var temporalValue = Option(0)

    current = iterator.next()
    if (iterator.hasNext) {
      temporalValue = romanNumeralToLatinNumeralMap.get(current + "" + iterator.head)
      if (temporalValue.nonEmpty) {
        iterator.next()
        temporalValue.get
      }
      else {
        romanNumeralToLatinNumeralMap.get(current.toString).getOrElse(0)
      }
    }
    else {
      romanNumeralToLatinNumeralMap.get(current.toString).getOrElse(0)
    }
  }
}

