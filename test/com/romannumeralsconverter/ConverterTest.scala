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

  test("convertToLatinNumeral should be able to IV to 4"){
    assert(convertToLatinNumeral("IV") == 4)
  }

  test("convertToLatinNumeral should be able to V to 5"){
    assert(convertToLatinNumeral("V") == 5)
  }

  test("convertToLatinNumeral should be able to VI to 6"){
    assert(convertToLatinNumeral("VI") == 6)
  }

  test("convertToLatinNumeral should be able to IX to 9"){
    assert(convertToLatinNumeral("IX") == 9)
  }

  test("convertToLatinNumeral should be able to X to 10"){
    assert(convertToLatinNumeral("X") == 10)
  }

  test("convertToLatinNumeral should be able to XI to 11"){
    assert(convertToLatinNumeral("XI") == 11)
  }

  test("convertToLatinNumeral should be able to XIV to 14"){
    assert(convertToLatinNumeral("XIV") == 14)
  }

  test("convertToLatinNumeral should be able to convert XIX to 19"){
    assert(convertToLatinNumeral("XIX") == 19)
  }

  test("convertToLatinNumeral should be able to convert XX to 20"){
    assert(convertToLatinNumeral("XX") == 20)
  }

  test("convertToLatinNumeral should be able to convert XXX to 30"){
    assert(convertToLatinNumeral("XXX") == 30)
  }

  test("convertToLatinNumeral should be able to convert XL to 40"){
    assert(convertToLatinNumeral("XL") == 40)
  }

  test("convertToLatinNumeral should be able to convert L to 50"){
    assert(convertToLatinNumeral("L") == 50)
  }

  test("convertToLatinNumeral should be able to convert LXX to 70"){
    assert(convertToLatinNumeral("LXX") == 70)
  }

  test("convertToLatinNumeral should be able to convert XC to XC"){
    assert(convertToLatinNumeral("XC") == 90)
  }

  test("convertToLatinNumeral should be able to convert C to 100"){
    assert(convertToLatinNumeral("C") == 100)
  }

  test("convertToLatinNumeral should be able to convert CD to 400"){
    assert(convertToLatinNumeral("CD") == 400)
  }

  test("convertToLatinNumeral should be able to convert 500 to 500"){
    assert(convertToLatinNumeral("D") == 500)
  }

  test("convertToLatinNumeral should be able to convert CM to 900"){
    assert(convertToLatinNumeral("CM") == 900)
  }

  test("convertToLatinNumeral should be able to convert M to 1000"){
    assert(convertToLatinNumeral("M") == 1000)
  }

  //Ultimate test
  test("convertToLatinNumeral should be able to convert MCMXCV to 1995"){
    assert(convertToLatinNumeral("MCMXCV") == 1995)
  }

}
