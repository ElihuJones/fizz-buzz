package com.tlglearning;

import java.util.EnumSet;
import java.util.Set;

public enum FizzBuzz {

  FIZZ, BUZZ;

    //Method - Declaration (modifier, return type, name) + Implementation
    public static Set <FizzBuzz> valueOf(int num) {
    Set<FizzBuzz> result = EnumSet.noneOf(FizzBuzz.class);
    if (num % 3 == 0) {
      result.add(FIZZ);       // Compiler sees result = result + FIZZ_RESET;
    }
    if (num % 5 == 0) {
      result.add(BUZZ);       //
    }
    return result;
  }
}
