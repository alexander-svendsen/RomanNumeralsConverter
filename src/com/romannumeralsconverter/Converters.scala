package com.romannumeralsconverter

object convertToRomanNumeral extends ((Int) => RomanNumeral){
  def apply(number:Int) : RomanNumeral = {
    var romanNumeral = ""
    var counter = number

    if (counter >= 10){
      romanNumeral += "X"
      counter -= 10
    }

    if (counter == 9){
      romanNumeral += "IX"
      counter -= 9
    }

    if (counter >= 5){
      romanNumeral += "V"
      counter -= 5
    }

    if (counter == 4){
      romanNumeral += "IV"
      counter -= 4
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
