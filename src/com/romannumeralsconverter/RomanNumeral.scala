package com.romannumeralsconverter


/**
 * A class representing a Roman Numeral
 * @param romanNumeral A __valid__ String which is a romanNumeral
 */
case class RomanNumeral(romanNumeral: String) {
//  if (romanNumeral == ""){
//
//  }

  val matcher = """(^M?M?M?(CM|CD|D?C?C?C?)(XC|XL|L?X?X?X?)(IX|IV|V?I?I?I?)$)""".r.pattern.matcher(romanNumeral)
  if (!matcher.matches()){
    throw new IllegalArgumentException("romanNumeral was not a valid roman numeral")
  }

  def == (romanNumeral : RomanNumeral) : Boolean = {
    this.romanNumeral == romanNumeral.romanNumeral
  }
  def == (romanNumeral: String) : Boolean = {
    this.romanNumeral == romanNumeral
  }
}
