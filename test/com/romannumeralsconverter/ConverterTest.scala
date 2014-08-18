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

  test("convertToRomanNumeral should be able to convert 6 to VI"){
    assert(convertToRomanNumeral(6) == "VI")
  }

  test("convertToRomanNumeral should be able to convert 7 to VII"){
    assert(convertToRomanNumeral(7) == "VII")
  }

  test("convertToRomanNumeral should be able to convert 9 to IX"){
    assert(convertToRomanNumeral(9) == "IX")
  }

  test("convertToRomanNumeral should be able to convert 10 to X"){
    assert(convertToRomanNumeral(10) == "X")
  }

  test("convertToRomanNumeral should be able to convert 14 to XIV"){
    assert(convertToRomanNumeral(14) == "XIV")
  }

  test("convertToRomanNumeral should be able to convert 18 to XVIII"){
    assert(convertToRomanNumeral(18) == "XVIII")
  }

  test("convertToRomanNumeral should be able to convert 19 to XIX"){
    assert(convertToRomanNumeral(19) == "XIX")
  }
}
