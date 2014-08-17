package com.romannumeralsconverter

import org.scalatest.FunSuite

class RomanNumeralTest extends FunSuite {
  test("RomanNumeral should only accept valid roman numerals"){
    new RomanNumeral("IX")
    new RomanNumeral("XX")
    new RomanNumeral("III")
    new RomanNumeral("VII")
  }

  test("RomanNumeral should throw an exception with when used with invalid roman numerals"){
    intercept[IllegalArgumentException] {
      RomanNumeral("IIIII")
    }
    intercept[IllegalArgumentException] {
      RomanNumeral("IVI")
    }
    intercept[IllegalArgumentException] {
      RomanNumeral("XX1")
    }
  }
}
