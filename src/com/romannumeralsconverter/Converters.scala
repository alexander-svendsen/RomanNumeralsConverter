package com.romannumeralsconverter

object convertToRomanNumeral extends ((Int) => RomanNumeral){
  def apply(number:Int) : RomanNumeral = {
//    new RomanNumeral("I")
    if (number == 3)
      return new RomanNumeral("III")
    if (number == 2)
      return new RomanNumeral("II")
    if (number == 1)
      return new RomanNumeral("I")

    new RomanNumeral("")
  }

}


object convertToLatinNumeral extends ((String) => Int){
  def apply(romanNumeral: String): Int = {
    0
  }
}
