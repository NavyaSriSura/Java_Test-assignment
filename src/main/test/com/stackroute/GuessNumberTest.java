package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNumberTest {
    GuessNumber guessNumber;
    @Before
    public void setUp()
    {
        guessNumber=new GuessNumber();

    }
   @After
    public void tearDown()
   {
       guessNumber=null;
   }
   @Test
    public void givenANumberShoudReturnCorrectGuess()
   {
       String result=guessNumber.compare(1,1);
       assertEquals(result,"Your Guess is Correct");
   }
   @Test
    public void givenANumberShouldReturnGuessIsLow()
   {
       String result=guessNumber.compare(1,2);
       assertEquals(result,"Your Guess is too Low");
   }
    @Test
    public void givenANumberShouldReturnGuessIsHigh()
    {
        String result=guessNumber.compare(2,1);
        assertEquals(result,"Your Guess is too High");
    }
}