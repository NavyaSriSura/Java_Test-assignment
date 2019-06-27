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
       System.out.println("Before");
   }

   @After
    public void tearDown()
   {
       vowelConsonant=null;
       System.out.println("After");
   }

   @Test
    public void givenAStringShouldReturnVowelsAndConsonants()
   {
       String result=vowelConsonant.vowelConsonantCheck("navya");
       assertEquals(result,"ConsonantVowelConsonantConsonantVowel");
   }

    @Test
    public void givenAStringShouldReturnVowels()
    {
        String result=vowelConsonant.vowelConsonantCheck("aei");
        assertEquals(result,"VowelVowelVowel");
    }
    @Test
    public void givenAStringShouldReturnConsonants()
    {
        String result=vowelConsonant.vowelConsonantCheck("bcd");
        assertEquals(result,"ConsonantConsonantConsonant");
    }
}