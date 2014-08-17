package com.romannumeralsconverter

import org.scalatest.FunSuite

class RomanNumeralTest extends FunSuite {
  test("RomanNumeral should only accept valid RomanNumerals"){
    val romanNumeral = new RomanNumeral("IX")
    assert(romanNumeral.romanNumeral != null)
  }
}
