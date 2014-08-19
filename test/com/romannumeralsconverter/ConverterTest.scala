package com.romannumeralsconverter

import org.scalatest.FunSuite

//Ignore the warnings in this file, The compiler can't seem to figure out that the asserts has matching types
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

  test("convertToRomanNumeral should be able to convert 20 to XX"){
    assert(convertToRomanNumeral(20) == "XX")
  }

  test("convertToRomanNumeral should be able to convert 30 to XXX"){
    assert(convertToRomanNumeral(30) == "XXX")
  }

  test("convertToRomanNumeral should be able to convert 40 to XL"){
    assert(convertToRomanNumeral(40) == "XL")
  }

  test("convertToRomanNumeral should be able to convert 50 to L"){
    assert(convertToRomanNumeral(50) == "L")
  }

  test("convertToRomanNumeral should be able to convert 70 to LXX"){
    assert(convertToRomanNumeral(70) == "LXX")
  }

  test("convertToRomanNumeral should be able to convert 90 to XC"){
    assert(convertToRomanNumeral(90) == "XC")
  }

  test("convertToRomanNumeral should be able to convert 100 to C"){
    assert(convertToRomanNumeral(100) == "C")
  }

  test("convertToRomanNumeral should be able to convert 400 to CD"){
    assert(convertToRomanNumeral(400) == "CD")
  }

  test("convertToRomanNumeral should be able to convert 500 to D"){
    assert(convertToRomanNumeral(500) == "D")
  }

  test("convertToRomanNumeral should be able to convert 900 to CM"){
    assert(convertToRomanNumeral(900) == "CM")
  }

  test("convertToRomanNumeral should be able to convert 1000 to M"){
    assert(convertToRomanNumeral(1000) == "M")
  }

  //Ultimate test
  test("convertToRomanNumeral should be able to convert 1995 to MCMXCV"){
    assert(convertToRomanNumeral(1995) == "MCMXCV")
  }


  test("convertToLatinNumeral should be able to convert empty string to 0"){
    assert(convertToLatinNumeral("") == 0)
  }

  test("convertToLatinNumeral should be able to I to 1"){
    assert(convertToLatinNumeral("I") == 1)
  }

  test("convertToLatinNumeral should be able to II to 2"){
    assert(convertToLatinNumeral("II") == 2)
  }

  test("convertToLatinNumeral should be able to III to 3"){
    assert(convertToLatinNumeral("III") == 3)
  }
}
