package com.romannumeralsconverter

object convertToRomanNumeral extends ((Int) => RomanNumeral){
  def apply(number:Int) : RomanNumeral = {
    var romanNumeral = ""
    var counter = number

    if (counter == 4){
      return RomanNumeral("IV")
    }

    while(counter > 0){
      romanNumeral += "I"
      counter -= 1
    }

    new RomanNumeral(romanNumeral)
  }

}


object convertToLatinNumeral extends ((String) => Int){
  def apply(romanNumeral: String): Int = {
    0
  }
}
