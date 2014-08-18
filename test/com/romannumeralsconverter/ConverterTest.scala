package com.romannumeralsconverter

import org.scalatest.FunSuite

class ConverterTest extends FunSuite {
  test("convertToRomanNumeral should be able to convert 0 to empty string"){
    assert(convertToRomanNumeral(0) == "")
  }

  test("convertToRomanNumeral should be able to convert 1 to I"){
    assert(convertToRomanNumeral(1) == "I")
  }

  test("convertToRomanNumeral should be able to convert 2 to II"){
    assert(convertToRomanNumeral(2) == "II")
  }

  test("convertToRomanNumeral should be able to convert 3 to III"){
    assert(convertToRomanNumeral(3) == "III")
  }

  test("convertToRomanNumeral should be able to convert 4 to IV"){
    assert(convertToRomanNumeral(4) == "IV")
  }

  test("convertToRomanNumeral should be able to convert 5 to V"){
    assert(convertToRomanNumeral(5) == "V")
  }
}
