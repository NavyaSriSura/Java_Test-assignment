package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfDigitsTest
{
    SumOfDigits sumOfDigits;
    @Before
    public void setUp()
    {
        sumOfDigits=new SumOfDigits();
        System.out.println("Before");
    }
    @After
    public void tearDown()
    {
        sumOfDigits=null;
        System.out.println("After");
    }
  @Test
    public void givenTwoNumberShouldReturnSumOfDigits() {
      int result = sumOfDigits.sumDigits("34 5");
      assertEquals(result, 39);
  }

    @Test
    public void givenThreeNumberShouldReturnSumOfDigits() {
        int result = sumOfDigits.sumDigits("12 5 9");
        assertEquals(result, 26);
    }

    @Test
    public void givenANumberShouldReturnSumOfDigits() {
        int result = sumOfDigits.sumDigits("12");
        assertEquals(result, 12);
    }
}