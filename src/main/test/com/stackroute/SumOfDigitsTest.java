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
    }
    @After
    public void tearDown()
    {
        sumOfDigits=null;
    }
  @Test
    public void givenTwoNumberReturnSumOfDigits() {
      int result = sumOfDigits.sumDigits("34 5");
      assertEquals(result, 39);
  }

    @Test
    public void givenThreeNumberReturnSumOfDigits() {
        int result = sumOfDigits.sumDigits("12 5 9");
        assertEquals(result, 26);
    }

    @Test
    public void givenANumberReturnSumOfDigits() {
        int result = sumOfDigits.sumDigits("12");
        assertEquals(result, 12);
    }

    @Test
    public void givenZeroesReturnZero()
    {
        int result=sumOfDigits.sumDigits("0 0");
        assertEquals(result,0);
    }
    @Test(expected = NullPointerException.class)
    public void givenNullReturnException()
    {
        int result=sumOfDigits.sumDigits(null);
    }
}