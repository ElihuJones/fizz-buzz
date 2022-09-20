package com.tlglearning;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

  //Use this test method for FIZZ test. Pass expected.
  @Test
  void valueOf_fizz() {
    assertEquals(Set.of(FizzBuzz.FIZZ), FizzBuzz.valueOf(6)); // Divisible by 3 for FIZZ
  }

  //Use this test method for BUZZ test. Pass expected.
  @Test
  void valueOf_buzz() {
    assertEquals(Set.of(FizzBuzz.BUZZ), FizzBuzz.valueOf(10)); //Divisible by 5 for BUZZ
  }

  //Use this test method for FIZZBUZZ test. Pass expected.
  @Test
  void valueOf_fizzbuzz() {
    assertEquals(Set.of(FizzBuzz.FIZZ, FizzBuzz.BUZZ), FizzBuzz.valueOf(15));
  }

  //Use this test method for None test. Neither fizz nor buzz expected.
  @Test
  void valueOf_none() {
    assertEquals(Set.of(), FizzBuzz.valueOf(11));
  }
}