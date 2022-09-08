package com.tlglearning;

import java.sql.SQLOutput;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    //for(Initialize, Test (boolean expression), Update))
    //for(int i = 0; i <= 100; i++)  {
    //   System.out.println(FizzBuzz.valueOf(i));

    //do - while(Test, Statement)
    int i = 1;
    do {
      Set<FizzBuzz> value = FizzBuzz.valueOf(i);
      System.out.printf("%d: %s%n", i, value);
      i++;
    } while (i <= 100);
  }

}
