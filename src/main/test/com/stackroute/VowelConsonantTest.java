package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonantTest
{
    VowelConsonant vowelConsonant;
   @Before
    public void SetUp()
   {
    vowelConsonant=new VowelConsonant();
   }

   @After
    public void tearDown()
   {
       vowelConsonant=null;
   }

   @Test
    public void givenAStringdReturnVowelsAndConsonants()
   {
       String result=vowelConsonant.vowelConsonantCheck("navya");
       assertEquals(result,"ConsonantVowelConsonantConsonantVowel");
   }

    @Test
    public void givenAStringReturnVowels()
    {
        String result=vowelConsonant.vowelConsonantCheck("aei");
        assertEquals(result,"VowelVowelVowel");
    }
    @Test
    public void givenAStringReturnConsonants()
    {
        String result=vowelConsonant.vowelConsonantCheck("bcd");
        assertEquals(result,"ConsonantConsonantConsonant");
    }
    @Test(expected = NullPointerException.class)
    public void givenNullRaiseException()
    {
        String result=vowelConsonant.vowelConsonantCheck(null);
    }
}