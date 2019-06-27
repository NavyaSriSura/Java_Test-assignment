package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringRepeatTest
{
    StringRepeat stringRepeat;
    @Before
    public void setUp()
    {
        System.out.println("Before");
        stringRepeat=new StringRepeat();
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
        stringRepeat=null;
    }
  @Test
    public void givenAStringShouldRepeatLastNumberOfGivenCharacters()
  {

      String result=stringRepeat.stringRepeatMethod("navya",3);
      assertEquals("navyavyavyavya",result);
  }

    @Test
    public void givenAStringShouldRepeatLastNumberCharacters()
    {

        String result=stringRepeat.stringRepeatMethod("Stackroute",3);
        assertEquals("Stackrouteuteuteute",result);
    }
    @Test
    public void givenAStringShouldReturngivenNumberOfLastCharacters()
    {
        String result=stringRepeat.stringRepeatMethod("route",2);
        assertEquals("routetete",result);
    }
}